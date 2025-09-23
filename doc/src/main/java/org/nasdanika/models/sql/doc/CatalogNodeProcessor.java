package org.nasdanika.models.sql.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.ncore.NamedElement;

public class CatalogNodeProcessor extends ModelElementNodeProcessor<Database> {

	public CatalogNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return CATALOG_ICON;
	}
	
	@OutgoingReferenceBuilder(
			nsURI = SqlPackage.eNS_URI,
			classID = SqlPackage.CATALOG,
			referenceID = SqlPackage.CATALOG__SCHEMAS)
	public void buildSchemasOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action schemasAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"schemas.html", 
					"Schemas", 
					SCHEMA_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				schemasAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> schemasTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(schemasTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag schemasTable = schemasTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"catalog-schemas", 
						"schemas-table", 
						progressMonitor);
				
				schemasAction.getContent().add(schemasTable);
			}
		}
	}
		
}
