package org.nasdanika.models.sql.core.tests;

import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.core.Generator;

public class SqlCoreTests {
	
	@Test
	public void testGenerator() {
		Generator generator = new Generator();
		System.out.println(generator.toJavaName("TABLE_NAME", false));
		System.out.println(generator.toJavaName("IS_NULLABLE", false));
		System.out.println(generator.toJavaName("TABLE_NAME", true));
		System.out.println(generator.toJavaName("Table name", true));
	}
	
	@Test
	public void testGenerateMetadataClasses() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
        ePackage.setName("Sql");
        try (Connection conn = DriverManager.getConnection(url, "sa", "")) {
        	DatabaseMetaData metadata = conn.getMetaData();
    		Generator generator = new Generator();
    		try (ResultSet resultSet = metadata.getTypeInfo()) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("DataType");
    			ePackage.getEClassifiers().add(eClass);
    		}
    		try (ResultSet resultSet = metadata.getTableTypes()) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("TableType");
    			ePackage.getEClassifiers().add(eClass);
    		}    		
    		try (ResultSet catalogsResultSet = metadata.getCatalogs()) {
    			EClass catalogsEClass = generator.createEClass(catalogsResultSet.getMetaData());
    			catalogsEClass.setName("Catalog");
    			ePackage.getEClassifiers().add(catalogsEClass);
    		}
    		try (ResultSet schemaResultSet = metadata.getSchemas()) {
    			EClass schemaEClass = generator.createEClass(schemaResultSet.getMetaData());
    			schemaEClass.setName("Schema");
    			ePackage.getEClassifiers().add(schemaEClass);
    		}
    		try (ResultSet resultSet = metadata.getTables(null, null, null, null)) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("Table");
    			ePackage.getEClassifiers().add(eClass);
    		}    		
    		try (ResultSet resultSet = metadata.getColumns(null, null, null, null)) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("Column");
    			ePackage.getEClassifiers().add(eClass);
    		}    		
    		try (ResultSet resultSet = metadata.getPrimaryKeys(null, null, "MY_TABLE")) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("PrimaryKey");
    			ePackage.getEClassifiers().add(eClass);
    		}    		
    		try (ResultSet resultSet = metadata.getImportedKeys(null, null, "MY_TABLE")) {
    			EClass eClass = generator.createEClass(resultSet.getMetaData());
    			eClass.setName("ImportedKey");
    			ePackage.getEClassifiers().add(eClass);
    		}    		
        }		
        
        EEnum typesEnum = EcoreFactory.eINSTANCE.createEEnum();
        typesEnum.setName("Types");
        ePackage.getEClassifiers().add(typesEnum);
        
        Stream.of(java.sql.Types.class.getDeclaredFields())
        	.filter(f -> Modifier.isStatic(f.getModifiers()))
        	.sorted((a,b) -> a.getName().compareTo(b.getName()))
        	.map(f -> {
        		EEnumLiteral literal = EcoreFactory.eINSTANCE.createEEnumLiteral();
        		literal.setName(f.getName());
        		literal.setLiteral(f.getName());
        		try {
					literal.setValue(f.getInt(null));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
        		return literal;
        	})
        	.forEach(typesEnum.getELiterals()::add);
        			        
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		Resource resource = resourceSet.createResource(URI.createFileURI("target/sql.ecore"));
		resource.getContents().add(ePackage);
		resource.save(null);        
	}		

	@Test
	public void testH2() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {

            // create table
            stmt.execute("CREATE TABLE person (id INT PRIMARY KEY, name VARCHAR(100))");

            // insert rows
            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO person (id, name) VALUES (?, ?)")) {
                ps.setInt(1, 1);
                ps.setString(2, "Alice");
                ps.executeUpdate();

                ps.setInt(1, 2);
                ps.setString(2, "Bob");
                ps.executeUpdate();
            }

            // query
            try (ResultSet rs = stmt.executeQuery("SELECT id, name FROM person ORDER BY id")) {
                while (rs.next()) {
                    System.out.printf("id=%d name=%s%n", rs.getInt("id"), rs.getString("name"));
                }
            }
        }		
	}	
	
}
