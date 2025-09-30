package org.nasdanika.models.sql.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.util.DiagramGenerator;
import org.nasdanika.models.sql.util.DiagramGenerator.CatalogGenerationResult;
import org.nasdanika.models.sql.util.EcoreGenerator;

public class SqlTests {
	
	/**
	 * A simple accounting system for testing
	 */
	static final String SCRIPT = 
			"""
			CREATE TABLE IF NOT EXISTS Accounts (
			    ID INT PRIMARY KEY AUTO_INCREMENT,
			    NAME VARCHAR(255) NOT NULL,
			    TYPE VARCHAR(50) NOT NULL, -- e.g., 'Asset', 'Liability', 'Equity', 'Revenue', 'Expense'
			    PARENT INT, -- For hierarchical accounts (e.g., Cash under Current Assets)
			    FOREIGN KEY (PARent) REFERENCES Accounts(ID)
			);
			
			CREATE TABLE IF NOT EXISTS Transactions (
			    ID INT PRIMARY KEY AUTO_INCREMENT,
			    TRANSACTION_DATE DATE NOT NULL,
			    Description VARCHAR(500),
			    ReferenceNumber VARCHAR(100) -- Optional: e.g., Invoice Number, Check Number
			);
			
			CREATE TABLE IF NOT EXISTS Journal_Entries (
			    ID INT PRIMARY KEY AUTO_INCREMENT,
			    Transaction INT NOT NULL,
			    Account INT NOT NULL,
			    DebitAmount DECIMAL(19, 4) DEFAULT 0.00,
			    CreditAmount DECIMAL(19, 4) DEFAULT 0.00,
			    FOREIGN KEY (Transaction) REFERENCES Transactions(ID),
			    FOREIGN KEY (Account) REFERENCES Accounts(ID)
			);			
			
			""";

	@Test
	public void testLoadModel() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {

            stmt.execute(SCRIPT);
            
            Database database = Database.create(conn.getMetaData(), null, null, null, null);
            
    		for (Catalog catalog: database.getCatalogs()) {
    			for (Schema schema: catalog.getSchemas()) {
    				for (Table table: schema.getTables()) {
    					for (ForeignKey ik: table.getImportedKeys()) {
    						assertNotNull(ik.getPrimaryKey(), catalog.getName() + "." + schema.getName() + "." + table.getName() + "." + ik.getName());    						
    					}
    					for (Column col: table.getColumns()) {
    						assertNotNull(col.getType(), "Type is not set for " + catalog.getName() + "." + schema.getName() + "." + table.getName() + "." + col.getName());    						
    						assertNotNull(col.getDataType(), "Data type is not set for " + catalog.getName() + "." + schema.getName() + "." + table.getName() + "." + col.getName());    						
    					}    					
    				}
    			}
    		}
            
    		CapabilityLoader capabilityLoader = new CapabilityLoader();
    		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
    		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
    		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
    		
    		Resource resource = resourceSet.createResource(URI.createFileURI("target/metadata.xml"));
    		resource.getContents().add(database);
    		resource.save(null);                    
        }		
	}

	@Test
	public void testGenerateDiagram() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {

            stmt.execute(SCRIPT);
            
            Database database = Database.create(conn.getMetaData(), null, null, null, null);
            
    		DiagramGenerator diagramGenerator = new DiagramGenerator();
    		for (Catalog catalog: database.getCatalogs()) {
    			CatalogGenerationResult cr = diagramGenerator.generateCatalog(catalog, null, null, 1920, 1080);
				Files.writeString(new File("target/" + catalog.getName() + ".drawio").toPath(), cr.document().save(null));   			
    		}            
        }		
	}

	@Test
	public void testGenerateEcore() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {

            stmt.execute(SCRIPT);
            
            Database database = Database.create(conn.getMetaData(), null, null, null, null);
            Collection<EObject> sources = new ArrayList<>();
            sources.add(database);
       		for (Catalog catalog: database.getCatalogs()) {
       			sources.add(catalog);
    			for (Schema schema: catalog.getSchemas()) {
    				sources.add(schema);
    				for (Table table: schema.getTables()) {
    					sources.add(table);
    					for (ForeignKey ik: table.getImportedKeys()) {
    						sources.add(ik);
    					}
    					for (Column col: table.getColumns()) {
    						sources.add(col);
    					}    					
    				}
    			}
    		}
            
            EcoreGenerator ecoreGenerator = new EcoreGenerator();
            Transformer<EObject,EModelElement> transformer = new Transformer<>(ecoreGenerator);
    		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
            Map<EObject, EModelElement> result = transformer.transform(sources, false, progressMonitor);

    		CapabilityLoader capabilityLoader = new CapabilityLoader();
    		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
    		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
    		
    		Resource resource = resourceSet.createResource(URI.createFileURI("target/metadata.ecore"));
    		resource.getContents().add(result.get(database));
    		resource.save(null);        
        }		
	}	
	
	@Test
	@Disabled
	public void testCreateFileDB() throws Exception {
        String url = "jdbc:h2:./test-db/ledger";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {
            stmt.execute(SCRIPT);
        }		
	}
	
}
