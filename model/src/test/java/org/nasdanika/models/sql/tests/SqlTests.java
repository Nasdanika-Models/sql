package org.nasdanika.models.sql.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.Database;

public class SqlTests {
	
	/**
	 * A simple accounting system for testing
	 */
	private static final String SCRIPT = 
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
            
            Database database = Database.create(conn.getMetaData());
            
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
	public void testCreateFileDB() throws Exception {
        String url = "jdbc:h2:./test-db/ledger";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {
            stmt.execute(SCRIPT);
        }		
	}
	
}
