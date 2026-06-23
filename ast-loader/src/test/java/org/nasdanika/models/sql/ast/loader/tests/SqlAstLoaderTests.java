package org.nasdanika.models.sql.ast.loader.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.ast.AlterTable;
import org.nasdanika.models.sql.ast.CheckConstraint;
import org.nasdanika.models.sql.ast.ColumnDefinition;
import org.nasdanika.models.sql.ast.CreateIndex;
import org.nasdanika.models.sql.ast.CreateTable;
import org.nasdanika.models.sql.ast.CreateView;
import org.nasdanika.models.sql.ast.Delete;
import org.nasdanika.models.sql.ast.Insert;
import org.nasdanika.models.sql.ast.Select;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;
import org.nasdanika.models.sql.ast.UnparsedStatement;
import org.nasdanika.models.sql.ast.Update;
import org.nasdanika.models.sql.ast.loader.JSqlParserLoader;

/**
 * Unit tests for the SQL AST loader, Resource, and ResourceFactory.
 */
public class SqlAstLoaderTests {

//    @BeforeAll
//    static void setup() {
//        // Register the EPackage and ResourceFactory
//        EPackage.Registry.INSTANCE.put(AstPackage.eNS_URI, AstPackage.eINSTANCE);
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sql", new SqlAstResourceFactory());
//    }

    // ======================== Loader Tests ========================

    @Test
    public void testLoadCreateTables() throws IOException {
        String sql = loadResource("create-tables.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, "test://create-tables.sql", null);

        assertNotNull(script);
        assertEquals("test://create-tables.sql", script.getSourceUri());

        // Should have: 3 CREATE TABLE + 2 CREATE INDEX = 5 statements
        assertEquals(5, script.getStatements().size());

        // First statement is CREATE TABLE Accounts
        Statement stmt0 = script.getStatements().get(0);
        assertInstanceOf(CreateTable.class, stmt0);
        CreateTable accounts = (CreateTable) stmt0;
        assertEquals("Accounts", accounts.getTableName());
        assertTrue(accounts.isIfNotExists());

        // Should have columns: ID, NAME, TYPE, PARENT_ID, CREATED_AT
        assertEquals(5, accounts.getColumns().size());

        ColumnDefinition idCol = accounts.getColumns().get(0);
        assertEquals("ID", idCol.getName());
        assertNotNull(idCol.getDataType());

        ColumnDefinition nameCol = accounts.getColumns().get(1);
        assertEquals("NAME", nameCol.getName());
        assertEquals(Boolean.FALSE, nameCol.getNullable());

        // Should have constraints (FK + inline PK)
        assertFalse(accounts.getConstraints().isEmpty());

        // Second CREATE TABLE
        Statement stmt1 = script.getStatements().get(1);
        assertInstanceOf(CreateTable.class, stmt1);
        CreateTable transactions = (CreateTable) stmt1;
        assertEquals("Transactions", transactions.getTableName());

        // Check for CHECK constraint
        boolean hasCheck = transactions.getConstraints().stream()
                .anyMatch(c -> c instanceof CheckConstraint);
        assertTrue(hasCheck, "Transactions should have a CHECK constraint");

        // Third CREATE TABLE
        Statement stmt2 = script.getStatements().get(2);
        assertInstanceOf(CreateTable.class, stmt2);
        CreateTable journalEntries = (CreateTable) stmt2;
        assertEquals("Journal_Entries", journalEntries.getTableName());

        // Create Index statements
        Statement stmt3 = script.getStatements().get(3);
        assertInstanceOf(CreateIndex.class, stmt3);
        CreateIndex idx = (CreateIndex) stmt3;
        assertEquals("idx_journal_transaction", idx.getIndexName());
    }

    @Test
    public void testLoadCreateView() throws IOException {
        String sql = loadResource("create-view.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, null, null);

        assertNotNull(script);

        // Should have 2 CREATE VIEW statements
        long viewCount = script.getStatements().stream()
                .filter(s -> s instanceof CreateView)
                .count();
        assertTrue(viewCount >= 1, "Should have at least one CREATE VIEW, got " + viewCount);

        // First view should have a query (Select)
        CreateView firstView = script.getStatements().stream()
                .filter(s -> s instanceof CreateView)
                .map(s -> (CreateView) s)
                .findFirst()
                .orElseThrow();

        assertEquals("account_balances", firstView.getViewName());
        assertNotNull(firstView.getQuery(), "View query should be captured");

        // The query should have joins (lineage analysis requires this)
        Select query = firstView.getQuery();
        assertNotNull(query.getJoins());
        assertFalse(query.getJoins().isEmpty(), "View query should have joins");
    }

    @Test
    public void testLoadAlterTable() throws IOException {
        String sql = loadResource("alter-table.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, null, null);

        assertNotNull(script);
        assertFalse(script.getStatements().isEmpty());

        // Should have ALTER TABLE statements
        long alterCount = script.getStatements().stream()
                .filter(s -> s instanceof AlterTable)
                .count();
        assertTrue(alterCount >= 1, "Should have at least one ALTER TABLE");
    }

    @Test
    public void testUnparseableStatements() throws IOException {
        String sql = loadResource("tsql-unparseable.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, null, "tsql");

        assertNotNull(script);
        assertEquals("tsql", script.getDialect());

        // Should have some parseable statements and at least one UnparsedStatement
        assertFalse(script.getStatements().isEmpty());

        boolean hasUnparsed = script.getStatements().stream()
                .anyMatch(s -> s instanceof UnparsedStatement);
        assertTrue(hasUnparsed, "Should have at least one UnparsedStatement for the MERGE");

        // The UnparsedStatement should have an error message
        UnparsedStatement unparsed = script.getStatements().stream()
                .filter(s -> s instanceof UnparsedStatement)
                .map(s -> (UnparsedStatement) s)
                .findFirst()
                .orElseThrow();
        assertNotNull(unparsed.getErrorMessage());
        assertNotNull(unparsed.getRawSql());

        // Should also have parseable CREATE TABLE statements
        boolean hasCreateTable = script.getStatements().stream()
                .anyMatch(s -> s instanceof CreateTable);
        assertTrue(hasCreateTable, "Should have parseable CREATE TABLE statements alongside UnparsedStatement");
    }

    @Test
    public void testCommentsPreserved() throws IOException {
        String sql = loadResource("create-tables.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, null, null);

        // Leading comments should be captured
        assertNotNull(script.getLeadingComments());
        // The file starts with comments
        assertFalse(script.getLeadingComments().isEmpty(), "Leading comments should be preserved");
    }

    @Test
    public void testRawSqlPreserved() throws IOException {
        String sql = loadResource("create-tables.sql");
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load(sql, null, null);

        for (Statement stmt : script.getStatements()) {
            assertNotNull(stmt.getRawSql(), "Every statement should have rawSql");
            assertFalse(stmt.getRawSql().isBlank(), "rawSql should not be blank");
        }
    }

    // ======================== Resource Tests ========================

    @Test
    @Disabled("Need to refactor to use CapabilityLoader for ResourceSet creation")
    public void testResourceLoad() throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(URI.createURI("test://schema.sql"));

        try (InputStream is = getClass().getResourceAsStream("/create-tables.sql")) {
            assertNotNull(is, "Test resource create-tables.sql not found on classpath");
            resource.load(is, null);
        }

        assertFalse(resource.getContents().isEmpty());
        assertInstanceOf(SqlScript.class, resource.getContents().get(0));

        SqlScript script = (SqlScript) resource.getContents().get(0);
        assertEquals(5, script.getStatements().size());
    }

    @Test
    @Disabled("Need to refactor to use CapabilityLoader for ResourceSet creation")
    public void testResourceSave() throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(URI.createURI("test://schema.sql"));

        try (InputStream is = getClass().getResourceAsStream("/create-tables.sql")) {
            resource.load(is, null);
        }

        // Save to bytes
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        resource.save(baos, null);
        String saved = baos.toString(StandardCharsets.UTF_8);

        assertNotNull(saved);
        assertFalse(saved.isBlank());
        // Should contain our table names
        assertTrue(saved.contains("Accounts") || saved.contains("accounts"),
                "Saved SQL should contain table names");
    }

    @Test
    @Disabled("Need to refactor to use CapabilityLoader for ResourceSet creation")
    public void testRoundTrip() throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();

        // Load original
        Resource resource1 = resourceSet.createResource(URI.createURI("test://original.sql"));
        try (InputStream is = getClass().getResourceAsStream("/create-tables.sql")) {
            resource1.load(is, null);
        }

        // Save to bytes
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        resource1.save(baos, null);
        String savedSql = baos.toString(StandardCharsets.UTF_8);

        // Load from saved bytes
        Resource resource2 = resourceSet.createResource(URI.createURI("test://roundtrip.sql"));
        resource2.load(new ByteArrayInputStream(savedSql.getBytes(StandardCharsets.UTF_8)), null);

        // Compare: same number of statements
        SqlScript script1 = (SqlScript) resource1.getContents().get(0);
        SqlScript script2 = (SqlScript) resource2.getContents().get(0);

        assertEquals(script1.getStatements().size(), script2.getStatements().size(),
                "Round-trip should preserve statement count");

        // Same statement types
        for (int i = 0; i < script1.getStatements().size(); i++) {
            assertEquals(
                    script1.getStatements().get(i).getClass(),
                    script2.getStatements().get(i).getClass(),
                    "Statement type at index " + i + " should be preserved after round-trip");
        }
    }

    @Test
    public void testSqlResource() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
        
		File createTablesFile = new File("src/test/resources/create-tables.sql").getCanonicalFile();
		Resource createTablesResource = resourceSet.getResource(URI.createFileURI(createTablesFile.getAbsolutePath()), true);		
		EList<EObject> createTablesContents = createTablesResource.getContents();
		
		File xmlFile = new File("target/create-tables.xml").getCanonicalFile();
		Resource xmlResource = resourceSet.createResource(URI.createFileURI(xmlFile.getAbsolutePath()));
		xmlResource.getContents().addAll(EcoreUtil.copyAll(createTablesContents));
		xmlResource.save(null);		
    	
    }

    // ======================== Expression Tests ========================

    @Test
    public void testSelectExpression() {
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load("SELECT a.id, b.name FROM foo a INNER JOIN bar b ON a.id = b.foo_id WHERE a.active = 1", null, null);

        assertEquals(1, script.getStatements().size());
        assertInstanceOf(Select.class, script.getStatements().get(0));

        Select select = (Select) script.getStatements().get(0);
        assertNotNull(select.getSelectItems());
        assertFalse(select.getSelectItems().isEmpty());
        assertNotNull(select.getFromItems());
        assertNotNull(select.getJoins());
        assertFalse(select.getJoins().isEmpty());
        assertNotNull(select.getWhere());
    }

    @Test
    public void testInsertStatement() {
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load("INSERT INTO users (name, email) VALUES ('John', 'john@example.com')", null, null);

        assertEquals(1, script.getStatements().size());
        assertInstanceOf(Insert.class, script.getStatements().get(0));

        Insert insert = (Insert) script.getStatements().get(0);
        assertEquals("users", insert.getTableName());
        assertFalse(insert.getColumnNames().isEmpty());
    }

    @Test
    public void testUpdateStatement() {
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load("UPDATE users SET name = 'Jane' WHERE id = 1", null, null);

        assertEquals(1, script.getStatements().size());
        assertInstanceOf(Update.class, script.getStatements().get(0));

        Update update = (Update) script.getStatements().get(0);
        assertEquals("users", update.getTableName());
        assertNotNull(update.getWhere());
    }

    @Test
    public void testDeleteStatement() {
        JSqlParserLoader loader = new JSqlParserLoader();
        SqlScript script = loader.load("DELETE FROM users WHERE id = 1", null, null);

        assertEquals(1, script.getStatements().size());
        assertInstanceOf(Delete.class, script.getStatements().get(0));

        Delete delete = (Delete) script.getStatements().get(0);
        assertEquals("users", delete.getTableName());
        assertNotNull(delete.getWhere());
    }

    // ======================== Utility ========================

    private String loadResource(String name) throws IOException {
        try (InputStream is = getClass().getResourceAsStream("/" + name)) {
            assertNotNull(is, "Test resource " + name + " not found on classpath");
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
