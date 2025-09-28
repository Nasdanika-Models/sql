package org.nasdanika.models.sql.cli;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.Document;
import org.nasdanika.drawio.Node;
import org.nasdanika.drawio.Page;
import org.nasdanika.emf.ModelCommand;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.util.DiagramGenerator;
import org.nasdanika.models.sql.util.DiagramGenerator.CatalogGenerationResult;
import org.nasdanika.models.sql.util.DiagramGenerator.SchemaGenerationResult;
import org.nasdanika.models.sql.util.MarkdownGenerator;

import freemarker.template.TemplateException;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Generates a diagram from a Catalog model",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "catalog-diagram")
@ParentCommands({
	DatabaseSupplier.class,
	ModelCommand.class	// Can't use EObjectSupplier here - it will result in long chaining with DocumentToModel command
})
public class CatalogDiagramCommand extends CommandGroup implements Document.Supplier {

	protected CatalogDiagramCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@Option(
			names = "--catalog", 
			description = "Catalog name")
	private String catalog;
	
	@Option(
			names = "--document", 
			description = {
				"Generate documentation",
				"for diagram elements"
			})
	private boolean document;
	
	@Option(
			names = "--schema", 
			description = {
				"Schemas to include",
				"all schemas if not provided.",
			})
	private String[] schemas;
		
	@Option(
			names = "--layout-width", 
			description = {
				"Width for force layout",
				"defaults to ${DEFAULT-VALUE}."
			},
			defaultValue = "1920")
	private double layoutWidth;	
	
	@Option(
			names = "--layout-height", 
			description = {
				"Heigth for force layout",
				"defaults to ${DEFAULT-VALUE}."
			},
			defaultValue = "1080")
	private double layoutHeight;		
	
	@Option(
			names = "--table", 
			description = {
				"Tables to include",
				"all tables if not provided.",
			})
	private String[] tables;	
	
	@Option(
			names = "--table-types", 
			description = {
				"Table names to include",
				"all table types if not provided.",
			})
	private String[] tableTypes;
		
	// TODO - related 

	@ParentCommand
	private EObjectSupplier<EObject> parent;

	@Override
	public Document getDocument(
			Function<URI, InputStream> uriHandler, 
			Function<String, String> propertySource,
			ProgressMonitor progressMonitor) {
		
		Catalog catalog = null;		
		Z: for (EObject eObj: parent.getEObjects(progressMonitor)) {
			if (eObj instanceof Catalog && (Util.isBlank(this.catalog) || this.catalog.equals(((Catalog) eObj).getName()))) {
				catalog = (Catalog) eObj;
				break;
			}
			if (eObj instanceof Database) {
				for (Catalog cat: ((Database) eObj).getCatalogs()) {
					if (Util.isBlank(this.catalog) || this.catalog.equals(cat.getName())) {
						catalog = cat;
						break Z;
					}
				}
			}
		}		

		if (catalog == null) {
			throw new CommandLine.ExecutionException(spec.commandLine(), "No matching catalog");
		}
		
		DiagramGenerator diagramGenerator = new DiagramGenerator();
		try {
			CatalogGenerationResult catalogResult = diagramGenerator.generateCatalog(
					catalog, 
					schema -> {
						return this.schemas == null || Arrays.asList(schemas).contains(schema.getName());
					}, 
					table -> {
						if (this.tables == null) {
							return matchTableType(table);
						}
						
						for (String tableName: this.tables) {
							int dotIdx = tableName.indexOf(".");
							if (dotIdx != -1) {
								String schemaName = tableName.substring(0, dotIdx);
								Schema schema = (Schema) table.eContainer();
								if (!schemaName.equals(schema.getName())) {
									continue;
								}
								tableName = tableName.substring(dotIdx + 1);
							}
							if (tableName.equals(table.getName()) && matchTableType(table)) {
								return true;
							}							
						}
						
						return false;
					}, 
					layoutWidth, 
					layoutHeight);
			
			if (document) {
				MarkdownGenerator markdownGenerator = new MarkdownGenerator();
				for (Entry<Schema, Page> pe: catalogResult.schemaPageMap().entrySet()) {
					String schemaMarkdown = markdownGenerator.process(pe.getKey());
					if (!Util.isBlank(schemaMarkdown)) {
						pe.getValue().getModel().getRoot().setProperty("documentation", schemaMarkdown);
						pe.getValue().setId(pe.getKey().getName());
					}
				}
				for (SchemaGenerationResult sr: catalogResult.schemaResults().values()) {
					for (Entry<Table, Node> te: sr.tableMap().entrySet()) {
						String tableMarkdown = markdownGenerator.process(te.getKey());
						if (!Util.isBlank(tableMarkdown)) {
							te.getValue().setProperty("documentation", tableMarkdown);
							te.getValue().setId(te.getKey().getName());
						}
					}				
				}
			}
			
			return catalogResult.document();			
		} catch (ParserConfigurationException | IOException | TemplateException e) {
			throw new CommandLine.ExecutionException(spec.commandLine(), "Error generating catalog diagram: " + e, e);
		}
	}

	protected boolean matchTableType(Table table) {
		if (this.tableTypes == null) {
			return true;
		}
		for (String tableType: tableTypes) {
			if (tableType.equals(table.getType().getName())) {
				return true;
			}
		}
		return false;
	}	

}
