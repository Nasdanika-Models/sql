package org.nasdanika.models.sql.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;

import freemarker.cache.StringTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * Generates markdown documentation which can be used as-is or added to diagrams
 */
public class MarkdownGenerator {
	
	private static final String TABLE_KEY = "table";

	private static final String SCHEMA_KEY = "schema";

	private static final String CATALOG_KEY = "catalog";

	private static final String DATABASE_KEY = "database";

	private static final String DATABASE_TEMPLATE =
			"""
			
			| Catalog | Schemas | Tables | Columns | Relationships | 
			| ------- | -------:| ------:| -------:| -------------:|
			<#list infos as info>
			| ${info.name} | ${info.schemas} | ${info.tables} | ${info.columns} | ${info.relationships} |
			</#list>
			| **Total**: ${totalCatalogs} | ${totalSchemas} | ${totalTables} | ${totalColumns} | ${totalRelationships} |  
			
			""";

	private static final String CATALOG_TEMPLATE =
			"""
			
			| Schema | Tables | Columns | Relationships | 
			| ------- | ------:| -------:| -------------:|
			<#list infos as info>
			| ${info.name} | ${info.tables} | ${info.columns} | ${info.relationships} |
			</#list>
			| **Total**: ${totalSchemas} | ${totalTables} | ${totalColumns} | ${totalRelationships} |  
			
			""";
	
	private static final String SCHEMA_TEMPLATE =
			"""

			| Table | Columns | Relationships | 
			| ----- | -------:| -------------:|
			<#list infos as info>
			| ${info.name} | ${info.columns} | ${info.relationships} |
			</#list>
			| **Total**: ${totalTables} | ${totalColumns} | ${totalRelationships} |  
			
			
			""";
	
	private static final String TABLE_TEMPLATE =
			"""
			
			## Columns
			
			| Name | Type | Size | Nullable | Decimal digits | 
			| ---- | ---- | ----:| -------- | --------------:|
			<#list columns as col>
			| ${col.name} | ${col.type.name} | ${col.columnSize} | ${col.isNullable} | ${col.decimalDigits} |
			</#list>
			
			<#if primaryKey??>
			## Primary key
			
			<#list primaryKey.columns as pkCol>
			* ${pkCol.name}
			</#list>			
			
			</#if>
			
			<#if importedKeys?has_content>
			## Imported keys
			
			<#list importedKeys as importedKey>
			### ${importedKey.name} -> ${importedKey.primaryKey.eContainer().name}
			
			| FK Column | PK Column | 
			| --------- | --------- |
			<#list importedKey.columns as col>
			| ${col.fkColumn.name} | ${col.pkColumn.name} |
			</#list>			
			</#list>						
			</#if>
			
			<#if primaryKey?? && primaryKey.exportedKeys?has_content>
			## Exported keys
			
			<#list primaryKey.exportedKeys as exportedKey>
			### ${exportedKey.eContainer().name}.${exportedKey.name} 
			
			| FK Column | PK Column | 
			| --------- | --------- |
			<#list exportedKey.columns as col>
			| ${col.fkColumn.name} | ${col.pkColumn.name} |
			</#list>			
			</#list>						

			</#if>			
			""";
		
    Configuration freemarkerConfiguration = new Configuration(Configuration.VERSION_2_3_34);	
	
	public MarkdownGenerator() {
        StringTemplateLoader loader = new StringTemplateLoader();
        loader.putTemplate(DATABASE_KEY, DATABASE_TEMPLATE);
        loader.putTemplate(CATALOG_KEY, CATALOG_TEMPLATE);
        loader.putTemplate(SCHEMA_KEY, SCHEMA_TEMPLATE);
        loader.putTemplate(TABLE_KEY, TABLE_TEMPLATE);
        freemarkerConfiguration.setTemplateLoader(loader);
	}
	
	public void process(Database database, Writer writer) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		Map<String, Object> dataModel = new HashMap<>();
		dataModel.put("database", database);
		dataModel.put("totalCatalogs", database.getCatalogs().size());
		dataModel.put(
				"totalSchemas", 
				database
					.getCatalogs()
					.stream()
					.flatMap(c -> c.getSchemas().stream())
					.count());
		dataModel.put(
				"totalTables", 
				database
					.getCatalogs()
					.stream()
					.flatMap(c -> c.getSchemas().stream())
					.flatMap(s -> s.getTables().stream())
					.count());
		dataModel.put(
				"totalColumns", 
				database
					.getCatalogs()
					.stream()
					.flatMap(c -> c.getSchemas().stream())
					.flatMap(s -> s.getTables().stream())
					.flatMap(t -> t.getColumns().stream())
					.count());
		dataModel.put(
				"totalRelationships", 
				database
					.getCatalogs()
					.stream()
					.flatMap(c -> c.getSchemas().stream())
					.flatMap(s -> s.getTables().stream())
					.flatMap(t -> t.getImportedKeys().stream())
					.count());
		
		List<Map<String,Object>> infos = new ArrayList<>();
		dataModel.put("infos", infos);
		for (Catalog catalog: database.getCatalogs()) {
			Map<String, Object> info = new HashMap<>();
			infos.add(info);
			info.put("name", catalog.getName());
			info.put("schemas", catalog.getSchemas().size());
			info.put(
					"tables", 
					catalog
						.getSchemas()
						.stream()
						.flatMap(s -> s.getTables().stream())
						.count());
			info.put(
					"columns", 
					catalog
						.getSchemas()
						.stream()
						.flatMap(s -> s.getTables().stream())
						.flatMap(t -> t.getColumns().stream())
						.count());
			info.put(
					"relationships", 
					catalog
						.getSchemas()
						.stream()
						.flatMap(s -> s.getTables().stream())
						.flatMap(t -> t.getImportedKeys().stream())
						.count());
		}
		
		freemarkerConfiguration.getTemplate(DATABASE_KEY).process(dataModel, writer);
	}
		
	public String process(Database database) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		StringWriter out = new StringWriter();
		try (out) {
			process(database, out);
		}
		return out.toString();
	}
	
	public void process(Catalog catalog, Writer writer) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		Map<String, Object> dataModel = new HashMap<>();
		dataModel.put("totalSchemas", catalog.getSchemas().size());
		dataModel.put(
				"totalTables", 
				catalog
					.getSchemas()
					.stream()
					.flatMap(s -> s.getTables().stream())
					.count());
		dataModel.put(
				"totalColumns", 
					catalog
					.getSchemas()
					.stream()
					.flatMap(s -> s.getTables().stream())
					.flatMap(t -> t.getColumns().stream())
					.count());
		dataModel.put(
				"totalRelationships", 
				catalog
					.getSchemas()
					.stream()
					.flatMap(s -> s.getTables().stream())
					.flatMap(t -> t.getImportedKeys().stream())
					.count());
		
		List<Map<String,Object>> infos = new ArrayList<>();
		dataModel.put("infos", infos);
		for (Schema schema: catalog.getSchemas()) {
			Map<String, Object> info = new HashMap<>();
			infos.add(info);
			info.put("name", schema.getName());
			info.put("tables", schema.getTables().size()); 
			info.put(
					"columns", 
					schema
						.getTables()
						.stream()
						.flatMap(t -> t.getColumns().stream())
						.count());
			info.put(
					"relationships", 
						schema
						.getTables()
						.stream()
						.flatMap(t -> t.getImportedKeys().stream())
						.count());
		}
		freemarkerConfiguration.getTemplate(CATALOG_KEY).process(dataModel, writer);
	}
		
	public String process(Catalog catalog) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		StringWriter out = new StringWriter();
		try (out) {
			process(catalog, out);
		}
		return out.toString();
	}
	
	public void process(Schema schema, Writer writer) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		Map<String, Object> dataModel = new HashMap<>();
		dataModel.put("totalTables", schema.getTables().size());
		dataModel.put(
				"totalColumns", 
				schema
					.getTables()
					.stream()
					.flatMap(t -> t.getColumns().stream())
					.count());
		dataModel.put(
				"totalRelationships", 
				schema
					.getTables()
					.stream()
					.flatMap(t -> t.getImportedKeys().stream())
					.count());
		
		List<Map<String,Object>> infos = new ArrayList<>();
		dataModel.put("infos", infos);
		for (Table table: schema.getTables()) {
			Map<String, Object> info = new HashMap<>();
			infos.add(info);
			info.put("name", table.getName());
			info.put("columns", table.getColumns().size()); 
			info.put("relationships", table.getImportedKeys().size()); 
		}
		freemarkerConfiguration.getTemplate(SCHEMA_KEY).process(dataModel, writer);
	}
		
	public String process(Schema schema) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		StringWriter out = new StringWriter();
		try (out) {
			process(schema, out);
		}
		return out.toString();
	}
	
	public void process(Table table, Writer writer) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		freemarkerConfiguration.getTemplate(TABLE_KEY).process(table, writer);
	}
		
	public String process(Table table) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		StringWriter out = new StringWriter();
		try (out) {
			process(table, out);
		}
		return out.toString();
	}
	

}
