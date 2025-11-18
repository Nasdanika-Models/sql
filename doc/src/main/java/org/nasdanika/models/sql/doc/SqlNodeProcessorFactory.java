package org.nasdanika.models.sql.doc;

import java.util.Collection;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.DataType;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate family documentation.
 * @author Pavel
 *
 */
public class SqlNodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider;
	private Collection<DocumentationFactory> documentationFactories;

	protected java.util.function.BiFunction<EObject, ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return (eObj, progressMonitor) -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Label prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype instanceof Action) {
						return (Action) prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public SqlNodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider,
			Collection<DocumentationFactory> documentationFactories)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
		this.documentationFactories = documentationFactories;
	}
	
	@EObjectNodeProcessor(type = Database.class)
	public Object createDatabaseNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new DatabaseNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Catalog.class)
	public Object createCatalogNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CatalogNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Schema.class)
	public Object createSchemaNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new SchemaNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
		
	@EObjectNodeProcessor(type = Table.class)
	public Object createTableNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new TableNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Column.class)
	public Object createColumnNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ColumnNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = DataType.class)
	public Object createDataTypeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new DataTypeNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = ForeignKey.class)
	public Object createForeignKeyNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ForeignKeyNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
//	ForeignKeyColumn.java
//	ImportedKeyRule.java
//	PrimaryKey.java
//	TableType.java
//	Type.java
	
	
}
