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
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.ncore.NamedElement;

public class DatabaseNodeProcessor extends ModelElementNodeProcessor<Database> {

	public DatabaseNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return DATABASE_ICON;
	}
	
	@OutgoingReferenceBuilder(
			nsURI = SqlPackage.eNS_URI,
			classID = SqlPackage.DATABASE,
			referenceID = SqlPackage.DATABASE__CATALOGS)
	public void buildCatalogsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		// A page with a dynamic catalogs table and links to catalog pages.
		for (Label label: labels) {
			Action catalogsAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"catalogs.html", 
					"Catalogs", 
					CATALOG_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				catalogsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> catalogsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(catalogsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag catalogsTable = catalogsTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"database-catalogs", 
						"catalogs-table", 
						progressMonitor);
				
				catalogsAction.getContent().add(catalogsTable);
			}
		}
	}
	
	@OutgoingReferenceBuilder(
			nsURI = SqlPackage.eNS_URI,
			classID = SqlPackage.DATABASE,
			referenceID = SqlPackage.DATABASE__DATA_TYPES)
	public void buildDataTypesOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action dataTypesAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"data-types.html", 
					"Data Types", 
					DATA_TYPE_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				dataTypesAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> dataTypesTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(dataTypesTableBuilder, progressMonitor);
				for (EAttribute attr: SqlPackage.Literals.DATA_TYPE.getEAttributes().stream().sorted(ENamedElementComparator.INSTANCE).toList()) {
					dataTypesTableBuilder.addStringColumnBuilder(
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
				
				
				org.nasdanika.models.html.Tag dataTypesTable = dataTypesTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"database-data-types", 
						"data-types-table", 
						progressMonitor);
				
				dataTypesAction.getContent().add(dataTypesTable);
			}
		}
	}
	
//	@OutgoingReferenceBuilder(
//			nsURI = SqlPackage.eNS_URI,
//			classID = SqlPackage.CREW,
//			referenceID = SqlPackage.CREW__TASKS)
//	public void buildTasksOutgoingReference(
//			EReference eReference,
//			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
//			Collection<Label> labels,
//			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
//			ProgressMonitor progressMonitor) {
//
//		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
//				.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
//				.toList();		
//
//		// A page with a dynamic agents table and links to agent pages.
//		for (Label label: labels) {
//			Action tasksAction = getRoleActionByLocation(
//					((Action) label).getChildren(), 
//					"tasks.html", 
//					"Tasks", 
//					TASKS_ICON);
//			
//			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
//				tasksAction.getChildren().addAll(re.getValue());
//			}
//			if (label instanceof Action) {										
//				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> agentsTableBuilder = new DynamicTableBuilder<>("nsd-table");
//				buildNamedElementColumns(agentsTableBuilder, progressMonitor);
//				
//				org.nasdanika.models.html.Tag tasksTable = agentsTableBuilder.build(
//						referenceOutgoingEndpoints
//						.stream()
//						.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
//						.toList(),  
//						"crew-tasks", 
//						"tasks-table", 
//						progressMonitor);
//				
//				tasksAction.getContent().add(tasksTable);
//			}
//		}
//	}
//	
//	@OutgoingReferenceBuilder(
//			nsURI = SqlPackage.eNS_URI,
//			classID = SqlPackage.CREW,
//			referenceID = SqlPackage.CREW__TOOLS)
//	public void buildToolsOutgoingReference(
//			EReference eReference,
//			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
//			Collection<Label> labels,
//			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
//			ProgressMonitor progressMonitor) {
//
//		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
//				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
//				.toList();		
//
//		// A page with a dynamic agents table and links to agent pages.
//		for (Label label: labels) {
//			Action toolsAction = getRoleActionByLocation(
//					((Action) label).getChildren(), 
//					"tools.html", 
//					"Tools", 
//					TOOLS_ICON);
//			
//			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
//				toolsAction.getChildren().addAll(re.getValue());
//			}
//			if (label instanceof Action) {										
//				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> toolsTableBuilder = new DynamicTableBuilder<>("nsd-table");
//				buildNamedElementColumns(toolsTableBuilder, progressMonitor);
//				
//				org.nasdanika.models.html.Tag agentsTable = toolsTableBuilder.build(
//						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
//							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
//							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
//							return ane.getName().compareTo(bne.getName());
//						}).toList(),  
//						"crew-tools", 
//						"tools-table", 
//						progressMonitor);
//				
//				toolsAction.getContent().add(agentsTable);
//			}
//		}
//	}
//		
//	@OutgoingReferenceBuilder(
//			nsURI = SqlPackage.eNS_URI,
//			classID = SqlPackage.CREW,
//			referenceID = SqlPackage.CREW__KNOWLEDGE_SOURCES)
//	public void buildKnowledgeSourcesOutgoingReference(
//			EReference eReference,
//			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
//			Collection<Label> labels,
//			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
//			ProgressMonitor progressMonitor) {
//
//		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
//				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
//				.toList();		
//
//		// A page with a dynamic agents table and links to agent pages.
//		for (Label label: labels) {
//			Action knowledgeSourcesAction = getRoleActionByLocation(
//					((Action) label).getChildren(), 
//					"knowledge-sources.html", 
//					"Knowledge Sources", 
//					KNOWLDEGE_SOURCE_ICON);
//			
//			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
//				knowledgeSourcesAction.getChildren().addAll(re.getValue());
//			}
//			if (label instanceof Action) {										
//				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> knowledgeSourcesTableBuilder = new DynamicTableBuilder<>("nsd-table");
//				buildNamedElementColumns(knowledgeSourcesTableBuilder, progressMonitor);
//				
//				org.nasdanika.models.html.Tag agentsTable = knowledgeSourcesTableBuilder.build(
//						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
//							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
//							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
//							return ane.getName().compareTo(bne.getName());
//						}).toList(),  
//						"crew-knowledge-sources", 
//						"knowledge-sources-table", 
//						progressMonitor);
//				
//				knowledgeSourcesAction.getContent().add(agentsTable);
//			}
//		}
//	}
		
}
