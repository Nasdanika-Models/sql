package org.nasdanika.models.sql.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ENamedElementComparator;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.models.sql.Table;
import org.nasdanika.ncore.NamedElement;

public class TableNodeProcessor extends ModelElementNodeProcessor<Table> {

	public TableNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return TABLE_ICON;
	}
	
	@OutgoingReferenceBuilder(
			nsURI = SqlPackage.eNS_URI,
			classID = SqlPackage.TABLE,
			referenceID = SqlPackage.TABLE__COLUMNS)
	public void buildColumnsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action columnsAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"columns.html", 
					"Columns", 
					COLUMN_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				columnsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> columnsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(columnsTableBuilder, progressMonitor);
				// Does not work this way
//				columnsTableBuilder.addStringColumnBuilder(
//						"type", 
//						true, 
//						true, 
//						"Type", 
//						endpoint -> {
//							WidgetFactory typeWidgetFactory = ((ColumnNodeProcessor) endpoint.getValue()).getTypeWidgetFactory();
//							if (typeWidgetFactory != null) {
//								return typeWidgetFactory.createLinkString(progressMonitor);
//							}
//							
//							return "";
//						});
				
				for (EAttribute attr: SqlPackage.Literals.COLUMN.getEAttributes().stream().sorted(ENamedElementComparator.INSTANCE).toList()) {
					columnsTableBuilder.addStringColumnBuilder(
							attr.getName(), 
							true, 
							true, 
							Util.nameToLabel(attr.getName()), 
							endpoint -> {
								EObject eTarget = endpoint.getKey().getTarget().get();
								if (eTarget.eIsSet(attr)) {
									Object val = eTarget.eGet(attr);
									return String.valueOf(val);							
								}
								
								return "";
							});
				}
								
				org.nasdanika.models.html.Tag columnsTable = columnsTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"table-columns", 
						"columns-table", 
						progressMonitor);
				
				columnsAction.getContent().add(columnsTable);
			}
		}
	}
	
	@OutgoingReferenceBuilder(
			nsURI = SqlPackage.eNS_URI,
			classID = SqlPackage.TABLE,
			referenceID = SqlPackage.TABLE__IMPORTED_KEYS)
	public void buildImportedKeysOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action importedKeysAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"imported-keys.html", 
					"Imported Keys", 
					IMPORTED_KEY_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				importedKeysAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> importedKeysTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(importedKeysTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag importedKeysTable = importedKeysTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"table-importedKeys", 
						"imported-keys-table", 
						progressMonitor);
				
				importedKeysAction.getContent().add(importedKeysTable);
			}
		}
	}
		
}
