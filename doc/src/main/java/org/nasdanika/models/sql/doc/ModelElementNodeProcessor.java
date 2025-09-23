package org.nasdanika.models.sql.doc;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.emf.AbstractDrawioFactory;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;

/**
 * Base class for other processors with common functionality.
 * @param <T>
 */
public abstract class ModelElementNodeProcessor<T extends EObject> extends EObjectNodeProcessor<T> {
	
//	Catalog.java
//	Schema.java
//	Table.java
//	
//	Column.java
//	DataType.java
//	Deferrability.java
//	ImportedKey.java
//	ImportedKeyColumn.java
//	ImportedKeyRule.java
//	PrimaryKey.java
//	TableType.java
//	Type.java

	
	public static final String DATABASE_ICON = "https://sql.models.nasdanika.org/images/server.svg";
	public static final String CATALOG_ICON = "https://sql.models.nasdanika.org/images/catalog.svg";
	public static final String SCHEMA_ICON = "https://sql.models.nasdanika.org/images/scheme.svg";
	public static final String TABLE_ICON = "https://sql.models.nasdanika.org/images/table.svg";
	public static final String COLUMN_ICON = "https://sql.models.nasdanika.org/images/speadsheet-column.svg";
	public static final String DATA_TYPE_ICON = "https://sql.models.nasdanika.org/images/data-format.svg";
	public static final String TABLE_TYPE_ICON = "https://sql.models.nasdanika.org/images/spreadsheet-file.svg";
	public static final String IMPORTED_KEY_ICON = "https://sql.models.nasdanika.org/images/relational.svg";
	public static final String PRIMARY_KEY_ICON = "https://sql.models.nasdanika.org/images/key.svg";
	
	protected Collection<DocumentationFactory> documentationFactories;
	
	protected ModelElementNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider);
		this.documentationFactories = documentationFactories;
	}		
	
	/**
	* Suppressing default behavior, explicit specification of how to build.
	*/	
	@Override
	protected void addReferenceChildren(
		EReference eReference, 
		Collection<Label> labels, 
		Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
		ProgressMonitor progressMonitor) {
	}
		
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
//		if (source == getTarget() && label instanceof Link) {
//			String location = ((Link) label).getLocation();
//			URI uri = getUri();
//			if (uri != null 
//					&& location != null 
//					&& uri.toString().equals(location)) {
//				
//				if (Util.isBlank(label.getIcon())) {
//					label.setIcon(getIcon());
//				}
//				if (Util.isBlank(label.getTooltip()) && source instanceof ModelElement) {
//					label.setTooltip(((ModelElement) source).getDescription());
//				}
//			}
//		}		
		if (source == getTarget()) {
			if (Util.isBlank(label.getIcon())) {
				label.setIcon(getIcon());
			}
			if (Util.isBlank(label.getTooltip()) && source instanceof ModelElement) {
				label.setTooltip(((ModelElement) source).getDescription());
			}
		}		
	}

	protected String getIcon() {		
		for (Map.Entry<String, String> representation: getRepresentations().entrySet()) {
			if (AbstractDrawioFactory.IMAGE_REPRESENTATION.equals(representation.getKey())) {
				String imageRepr = representation.getValue();
				return getImageRepresentationIcon(imageRepr);				
			}
		}
		
		return getTypeIcon();
	}	
	
	protected String getTypeIcon() {
		return null;
	}
	
	/**
	 * Returns an action matched by location, creates if necessary..
	 * @param parent
	 * @return
	 */
	protected Action getRoleActionByLocation(
			Collection<? super Action> roleActions, 
			String location, 
			String text,
			String icon) {
		
		Action ret = getRoleAction(
				roleActions, 
				e -> e instanceof Action && location.equals(((Action) e).getLocation()), 
				text, 
				icon);
		
		ret.setLocation(location);
		return ret;
	}	
	
	/**
	 * Returns an action matched by name (for sections), creates if necessary..
	 * @param parent
	 * @return
	 */
	protected Action getRoleActionByName(
			Collection<? super Action> roleActions, 
			String name, 
			String text,
			String icon) {
		
		Action ret = getRoleAction(
				roleActions, 
				e -> e instanceof Action && name.equals(((Action) e).getName()), 
				text, 
				icon);
		
		ret.setName(name);
		return ret;
	}	
		
	/**
	 * Returns an action matched by predicate, creates if necessary..
	 * @param parent
	 * @return
	 */
	protected Action getRoleAction(
			Collection<? super Action> roleActions, 
			Predicate<Object> predicate, 
			String text,
			String icon) {
		
		return roleActions
			.stream()
			.filter(predicate)
			.findFirst()
			.map(Action.class::cast)
			.orElseGet(() -> {
				Action ret = AppFactory.eINSTANCE.createAction();
				ret.setText(text);
				ret.setIcon(icon);
				roleActions.add(ret);
				return ret;
			});
	}	

	/**
	 * Builds columns for {@link ENamedElement}
	 * @param tableBuilder
	 * @param progressMonitor
	 */
	protected void buildNamedElementColumns(DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> tableBuilder, ProgressMonitor progressMonitor) {
		tableBuilder
			.addStringColumnBuilder("name", true, false, "Name", endpoint -> targetNameLink(endpoint.getKey(), endpoint.getValue(), progressMonitor)) 
			.addStringColumnBuilder("description", true, false, "Description", endpoint -> description(endpoint.getKey(), endpoint.getValue(), progressMonitor));
	}
	
	protected String targetNameLink(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		String linkStr = widgetFactory.createLinkString(progressMonitor);
		return Util.isBlank(linkStr) ? ((NamedElement) connection.getTarget().get()).getName() : linkStr;
	}
	
	protected String description(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		Object label = widgetFactory.createLabel(progressMonitor);
		return label instanceof Label ? ((Label) label).getTooltip() : null;
	}	
		
}
