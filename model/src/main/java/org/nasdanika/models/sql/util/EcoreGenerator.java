package org.nasdanika.models.sql.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.Type;
import org.nasdanika.models.sql.core.Generator;
import org.nasdanika.ncore.NamedElement;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.Yaml;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * Generates ECore model from {@link Database} model
 */
public class EcoreGenerator extends Generator {
	
	private MarkdownGenerator markdownGenerator;

	public EcoreGenerator(String annotationSource, MarkdownGenerator markdownGenerator) {
		super(annotationSource);
		this.markdownGenerator = markdownGenerator;
	}
	
	public EcoreGenerator(String annotationSource) {
		super(annotationSource);
		this.markdownGenerator = new MarkdownGenerator();
	}

	public EcoreGenerator(MarkdownGenerator markdownGenerator) {
		this.markdownGenerator = markdownGenerator;
	}
	
	public EcoreGenerator() {
		this(new MarkdownGenerator());
	}
	
	public MarkdownGenerator getMarkdownGenerator() {
		return markdownGenerator;
	}
	
	/**
	 * Generates an {@link EPackage} from {@link Database} with 
	 * sub-packages for {@link Catalog catalogs} and {@link Schema schemas}
	 * @param database
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 * @throws IOException 
	 * @throws TemplateException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EPackage createDatabasePackage(
		Database database,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		
		EPackage databasePackage = getEcoreFactory().createEPackage();
		databasePackage.setName(getDatabaseNsPrefirx(database));		
		databasePackage.setNsURI(getDatabaseNsURI(database));
		databasePackage.setNsPrefix(getDatabaseNsPrefirx(database));
		
		MarkdownGenerator docGen = getMarkdownGenerator();
		if (docGen != null) {
			String doc = docGen.process(database);
			if (!Util.isBlank(doc)) {
				EcoreUtil.setDocumentation(databasePackage, doc);
			}
		}
		
		return databasePackage;
	}

	protected String getDatabaseNsPrefirx(Database database) {
		return database.getName();
	}

	protected String getDatabaseNsURI(Database database) {
		return database.getUrl();
	}

	protected EcoreFactory getEcoreFactory() {
		return EcoreFactory.eINSTANCE;
	}
		
	/**
	 * Generates an {@link EPackage} from {@link Catalog} with 
	 * sub-packages for {@link Schema schemas}
	 * @param catalog
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 * @throws IOException 
	 * @throws TemplateException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EPackage createCatalogPackage(
		Catalog catalog,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		
		EPackage catalogPackage = getEcoreFactory().createEPackage();
		catalogPackage.setName(toJavaName(catalog.getName(), false));
		setAnnotationDetail(catalogPackage, getCatalogAnnotationKey(), catalog.getName());
		
		MarkdownGenerator docGen = getMarkdownGenerator();
		if (docGen != null) {
			String doc = docGen.process(catalog);
			if (!Util.isBlank(doc)) {
				EcoreUtil.setDocumentation(catalogPackage, doc);
			}
		}
		
		elementProvider.accept(
				catalog.eContainer(), 
				(d, p) -> {
					EPackage databasePackage = (EPackage) d;
					databasePackage.getESubpackages().add(catalogPackage);
					catalogPackage.setNsURI(databasePackage.getNsURI() + "/" + catalog.getName());
					catalogPackage.setNsPrefix(databasePackage.getNsPrefix() + "." + catalog.getName());
					for (EPackage schemaPackage: catalogPackage.getESubpackages()) {
						String schemaName = getAnnotationDetail(schemaPackage, getSchemaAnnotationKey());
						schemaPackage.setNsURI(catalogPackage.getNsURI() + "/" + schemaName);
						schemaPackage.setNsPrefix(databasePackage.getNsPrefix() + "." + schemaName);						
					}
				});		
		
		return catalogPackage;
	}	
	
	/**
	 * Generates an {@link EPackage} from {@link Schema} with 
	 * {@link EClass classes} for {@link Table tables}
	 * @param schema
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 * @throws IOException 
	 * @throws TemplateException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EPackage createSchemaPackage(
		Schema schema,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		
		EPackage schemaPackage = getEcoreFactory().createEPackage();
		schemaPackage.setName(toJavaName(schema.getName(), false));
		setAnnotationDetail(schemaPackage, getSchemaAnnotationKey(), schema.getName());
		setAnnotationDetail(schemaPackage, getCatalogAnnotationKey(), ((Catalog) schema.eContainer()).getName());		
		
		MarkdownGenerator docGen = getMarkdownGenerator();
		if (docGen != null) {
			String doc = docGen.process(schema);
			if (!Util.isBlank(doc)) {
				EcoreUtil.setDocumentation(schemaPackage, doc);
			}
		}		
		
		elementProvider.accept(
				schema.eContainer(), 
				(c, p) -> {
					EPackage catalogPackage = (EPackage) c;
					catalogPackage.getESubpackages().add(schemaPackage);
					schemaPackage.setNsURI(catalogPackage.getNsURI() + "/" + schema.getName());
					schemaPackage.setNsPrefix(schemaPackage.getNsPrefix() + "." + schema.getName());
				});		
		
		return schemaPackage;
	}	

	protected Yaml getYaml() {
		DumperOptions dumperOptions = new DumperOptions();
		dumperOptions.setDefaultFlowStyle(FlowStyle.BLOCK); dumperOptions.setIndent(4); 
		return new Yaml(dumperOptions);
	}
	
	/**
	 * Generates an {@link EClass} from {@link Table} with 
	 * {@link EAttribute attributes} for {@link Column columns} and {@link EReference references} for {@link ImportedKey foreign keys} - imported and exported
	 * @param table
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 * @throws IOException 
	 * @throws TemplateException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EClass createTableClass(
		Table table,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, TemplateException, IOException {
		
		EClass tableClass = getEcoreFactory().createEClass();
		tableClass.setName(toJavaName(table.getName(), true));
		setAnnotationDetail(tableClass, getTableAnnotationKey(), table.getName());
		setAnnotationDetail(tableClass, getSchemaAnnotationKey(), ((Schema) table.eContainer()).getName());
		setAnnotationDetail(tableClass, getCatalogAnnotationKey(), ((Catalog) table.eContainer().eContainer()).getName());		
		
		PrimaryKey primaryKey = table.getPrimaryKey();
		if (primaryKey != null) {
			List<String> pkColumns = primaryKey
				.getColumns()
				.stream()
				.map(NamedElement::getName)
				.toList();
			
			setAnnotationDetail(tableClass, getPrimaryKeyAnnotationKey(), getYaml().dump(pkColumns));
		}		
		
		MarkdownGenerator docGen = getMarkdownGenerator();
		if (docGen != null) {
			String doc = docGen.process(table);
			if (!Util.isBlank(doc)) {
				EcoreUtil.setDocumentation(tableClass, doc);
			}
		}		
		
		elementProvider.accept(
				table.eContainer(), 
				(s, p) -> {
					EPackage schemaPackage = (EPackage) s;
					schemaPackage.getEClassifiers().add(tableClass);
				});		
		
		return tableClass;
	}
		
	/**
	 * Generates an {@link EAttribute} from {@link Column} 
	 * @param column
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EAttribute createColumnAttribute(
		Column column,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) {
		
		EAttribute columnAttribute = getEcoreFactory().createEAttribute();
		columnAttribute.setName(toJavaName(column.getName(), false));
		setAnnotationDetail(columnAttribute, getColumnAnnotationKey(), column.getName());
		Type colType = column.getDataType();
		if (colType != null) {
			columnAttribute.setEType(getType(colType.getValue(), column.getNullable() != null && column.getNullable() == 1));
		}
		
		elementProvider.accept(
				column.eContainer(), 
				(t, p) -> {
					EClass tableClass = (EClass) t;
					tableClass.getEStructuralFeatures().add(columnAttribute);
				});		
		
		return columnAttribute;
	}	
		
	/**
	 * Generates an {@link EReference} from {@link ForeignKey} 
	 * @param foreignKye
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Factory
	public final EReference createForeignKeyReference(
		ForeignKey foreignKey,
		boolean parallel,
		BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
		ProgressMonitor progressMonitor) {
		
		Map<String,String> columnMapping = foreignKey
				.getColumns()
				.stream()
				.collect(Collectors.toMap(
						fkc -> fkc.getFkColumn().getName(), 
						fkc -> fkc.getPkColumn().getName()));
			
		String yamlColumnMapping = getYaml().dump(columnMapping);
		
		EReference importedKeyReference = getEcoreFactory().createEReference();
		importedKeyReference.setName(toJavaName(foreignKey.getName(), false));
		setAnnotationDetail(importedKeyReference, getKeyAnnotationKey(), foreignKey.getName());
		setAnnotationDetail(importedKeyReference, getKeyMappingAnnotationKey(), yamlColumnMapping);
		
		EReference exportedKeyReference = getEcoreFactory().createEReference();
		exportedKeyReference.setName(toJavaName(foreignKey.getName(), false) + getExportedKeySuffix());
		exportedKeyReference.setUpperBound(-1);
		setAnnotationDetail(exportedKeyReference, getKeyAnnotationKey(), foreignKey.getName());
		setAnnotationDetail(exportedKeyReference, getKeyMappingAnnotationKey(), yamlColumnMapping);
		exportedKeyReference.setEOpposite(importedKeyReference);
		
		elementProvider.accept(
				foreignKey.eContainer(), 
				(it, p) -> {
					EClass importingTableClass = (EClass) it;
					importingTableClass.getEStructuralFeatures().add(importedKeyReference);
					exportedKeyReference.setEType(importingTableClass);
				});		
		
		elementProvider.accept(
				foreignKey.getPrimaryKey().eContainer(), 
				(et, p) -> {
					EClass exportingTableClass = (EClass) et;
					exportingTableClass.getEStructuralFeatures().add(exportedKeyReference);
					importedKeyReference.setEType(exportingTableClass);
				});		
		
		return importedKeyReference;
	}

	protected String getExportedKeySuffix() {
		return "_exported";
	}	

}
