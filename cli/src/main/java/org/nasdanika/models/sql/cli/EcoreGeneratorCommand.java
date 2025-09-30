package org.nasdanika.models.sql.cli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.common.Util;
import org.nasdanika.emf.ModelCommand;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.TableType;
import org.nasdanika.models.sql.core.Generator;
import org.nasdanika.models.sql.util.EcoreGenerator;
import org.nasdanika.models.sql.util.MarkdownGenerator;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Generates a Ecore model from a database model",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "ecore")
@ParentCommands({
	DatabaseSupplier.class,
	ModelCommand.class	// Can't use EObjectSupplier here - it will result in long chaining with DocumentToModel command
})
public class EcoreGeneratorCommand extends CommandGroup implements EObjectSupplier<EModelElement> {

	protected EcoreGeneratorCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@Option(
			names = "--ns-uri", 
			description = {
				"Database namespace URI",
				"defaults to the database URI",
				"(connection string)"
			})
	private String nsURI;
	
	@Option(
			names = "--ns-prefix", 
			description = {
				"Database namespace prefix",
				"defaults to the database name"
			})
	private String nsPrefix;
	
	@Option(
			names = "--catalog", 
			description = {
				"Catalogs to include",
				"all catalogs if not provided"
			})
	private List<String> catalogs;
	
	@Option(
			names = "--document", 
			defaultValue = "true",
			negatable = true,
			description = {
				"Generate documentation",
				"for model elements",
				"defaults to ${DEFAULT-VALUE}"
			})
	private boolean document;
	
	@Option(
			names = "--schema", 
			description = {
				"Schemas to include",
				"all schemas if not provided",
			})
	private List<String> schemas;
		
	@Option(
			names = "--layout-width", 
			description = {
				"Width for force layout",
				"defaults to ${DEFAULT-VALUE}"
			},
			defaultValue = "1920")
	private double layoutWidth;	
	
	@Option(
			names = "--layout-height", 
			description = {
				"Heigth for force layout",
				"defaults to ${DEFAULT-VALUE}"
			},
			defaultValue = "1080")
	private double layoutHeight;		
	
	@Option(
			names = "--table", 
			description = {
				"Tables to include",
				"all tables if not provided",
			})
	private List<String> tables;	
	
	@Option(
			names = "--table-types", 
			description = {
				"Table names to include",
				"all table types if not provided",
			})
	private List<String> tableTypes;
		
	@Option(
			names = "--annotation-source", 
			description = {
				"Annotation source",
				"defaults to ${DEFAULT-VALUE}"
			},
			defaultValue = Generator.ANNOTATION_SOURCE)	
	private String annotationSource;	
		
	// TODO - related 

	@ParentCommand
	private EObjectSupplier<EObject> parent;
	
	protected void collect(Database database, Collection<EObject> sources) {
        sources.add(database);
   		for (Catalog catalog: database.getCatalogs()) {
   			collect(catalog, sources);
		}		
	}
	
	protected void collect(Catalog catalog, Collection<EObject> sources) {
		if (this.catalogs == null || catalogs.contains(catalog.getName())) {
			sources.add(catalog);
			for (Schema schema: catalog.getSchemas()) {
				collect(schema, sources);
			}
		}
	}
		
	protected void collect(Schema schema, Collection<EObject> sources) {
		if (this.schemas == null 
				|| schemas.contains(schema.getName())
				|| schemas.contains(((Catalog) schema.eContainer()).getName() + "." + schema.getName())) {
			sources.add(schema);
			for (Table table: schema.getTables()) {
				collect(table, sources);
			}
		}
	}
		
	protected void collect(Table table, Collection<EObject> sources) {
		if (this.tables != null) {
			Schema schema = (Schema) table.eContainer();
			Catalog catalog = (Catalog) schema.eContainer();
			
			if (!tables.contains(table.getName())
					&& !tables.contains(schema.getName() + "." + table.getName())
					&& !tables.contains(catalog.getName() + "." + schema.getName() + "." + table.getName())) {
				return;				
			}
		}				

		if (matchTableType(table)) {		
			sources.add(table);
			for (ForeignKey ik: table.getImportedKeys()) {
				sources.add(ik);
			}
			for (Column col: table.getColumns()) {
				sources.add(col);
			}
		}
	}		

	@Override
	public Collection<EModelElement> getEObjects(ProgressMonitor progressMonitor) {
        Collection<EObject> sources = new ArrayList<>();
		
		Collection<EObject> inputs = parent.getEObjects(progressMonitor);
		for (EObject eObj: inputs) {
			switch (eObj) {
				case Database d: 
					collect(d, sources);
					break;
				case Catalog c: 
					collect(c, sources);
					break;
				case Schema s: 
					collect(s, sources);
					break;
				case Table t: 
					collect(t, sources);
					break;
				default:
					break;
			}
		}
		        
        EcoreGenerator ecoreGenerator = new EcoreGenerator(annotationSource) {
        	
        	@Override
        	public MarkdownGenerator getMarkdownGenerator() {
        		return document ? super.getMarkdownGenerator() : null;
        	}
        	
        	@Override
        	protected String getDatabaseNsPrefirx(Database database) {
        		return nsPrefix == null ? super.getDatabaseNsPrefirx(database) : nsPrefix;
        	}
        	
        	@Override
        	protected String getDatabaseNsURI(Database database) {
        		return nsURI == null ? super.getDatabaseNsURI(database) : nsURI;
        	}
        	
        	@Override
        	public String getAnnotationDetail(EModelElement modelElement, String key) {
        		// TODO Auto-generated method stub
        		return super.getAnnotationDetail(modelElement, key);
        	}

        };
        Transformer<EObject,EModelElement> transformer = new Transformer<>(ecoreGenerator);
        Map<EObject, EModelElement> result = transformer.transform(sources, false, progressMonitor);
        return inputs.stream().map(result::get).toList();		
	}

	protected boolean matchTableType(Table table) {
		if (this.tableTypes == null) {
			return true;
		}
		TableType tType = table.getType();
		if (tType != null && !Util.isBlank(tType.getName())) {
			for (String tableType: tableTypes) {
				if (tableType.equals(tType.getName())) {
					return true;
				}
			}
		}
		return false;
	}

}
