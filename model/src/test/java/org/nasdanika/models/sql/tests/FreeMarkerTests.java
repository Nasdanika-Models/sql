package org.nasdanika.models.sql.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Desktop;
import java.io.File;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.jupiter.api.Test;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.util.MarkdownGenerator;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreeMarkerTests {
	
	@Test
	public void testFreemarker() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {
            stmt.execute(SqlTests.SCRIPT);
            Database database = Database.create(conn.getMetaData(), null, null, null);
            
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
            StringTemplateLoader loader = new StringTemplateLoader();
            cfg.setTemplateLoader(loader);
            
            loader.putTemplate(
            	"my-template", 
            	"""
            	<#list catalogs as catalog>
            	* ${catalog.name}
	            	<#list catalog.schemas as schema>
	            	* ${schema.name}
		            	<#list schema.tables as table>
		            	* ${table.name}		            	
		            	</#list>            		            	
	            	</#list>            	
            	</#list>
            	""");
            
            Template template = cfg.getTemplate("my-template");
            StringWriter out = new StringWriter();
            template.process(database, out);
            String result = out.toString();
            System.out.println(result);            
            
        }		
		
	}
		
	@Test
	public void testMarkdownGenerator() throws Exception {
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        try (Connection conn = DriverManager.getConnection(url, "sa", "");
             Statement stmt = conn.createStatement()) {
            stmt.execute(SqlTests.SCRIPT);
            Database database = Database.create(conn.getMetaData(), null, null, null);
            
            MarkdownGenerator markdownGenerator = new MarkdownGenerator();
            
            String dbMarkdown = markdownGenerator.process(database);
            String dbHtml = MarkdownHelper.INSTANCE.markdownToHtml(dbMarkdown);
            Path dbHtmlPath = Path.of("target", "database.html");
			Files.writeString(dbHtmlPath, dbHtml);
//            Desktop.getDesktop().browse(dbHtmlPath.toUri());
                        
    		for (Catalog catalog: database.getCatalogs()) {
                String catalogMarkdown = markdownGenerator.process(catalog);
                String catalogHtml = MarkdownHelper.INSTANCE.markdownToHtml(catalogMarkdown);
                File catalogHtmlFile = new File("target/catalogs/%s.html".formatted(catalog.getName())).getCanonicalFile();
                catalogHtmlFile.getParentFile().mkdirs();
    			Files.writeString(catalogHtmlFile.toPath(), catalogHtml);
//                Desktop.getDesktop().browse(catalogHtmlFile.toURI());
    			
    			for (Schema schema: catalog.getSchemas()) {
                    String schemaMarkdown = markdownGenerator.process(schema);
                    String schemaHtml = MarkdownHelper.INSTANCE.markdownToHtml(schemaMarkdown);
                    File schemaHtmlFile = new File("target/catalogs/%s/%s.html".formatted(catalog.getName(), schema.getName())).getCanonicalFile();
                    schemaHtmlFile.getParentFile().mkdirs();
        			Files.writeString(schemaHtmlFile.toPath(), schemaHtml);
//                    Desktop.getDesktop().browse(schemaHtmlFile.toURI());
    				    				
    				for (Table table: schema.getTables()) {
    					if ("PUBLIC".equals(schema.getName())) {
	                        String tableMarkdown = markdownGenerator.process(table);
	                        String tableHtml = MarkdownHelper.INSTANCE.markdownToHtml(tableMarkdown);
	                        File tableHtmlFile = new File("target/catalogs/%s/%s/%s.html".formatted(catalog.getName(), schema.getName(), table.getName())).getCanonicalFile();
	                        tableHtmlFile.getParentFile().mkdirs();
	            			Files.writeString(tableHtmlFile.toPath(), tableHtml);
//	                        Desktop.getDesktop().browse(tableHtmlFile.toURI());
    					}    					    					
    				}
    			}
    		}
            
            
            
        }		
		
	}
	

}
