package org.nasdanika.models.crewai.doc;

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
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.ncore.NamedElement;

public class CrewNodeProcessor extends CodeNodeProcessor<Crew> {

	public CrewNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return CREW_ICON;
	}
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CREW,
			referenceID = CrewaiPackage.CREW__AGENTS)
	public void buildAgentsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			Action agentsAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"agents.html", 
					"Agents", 
					AGENT_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				agentsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> agentsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(agentsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = agentsTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"crew-agents", 
						"agents-table", 
						progressMonitor);
				
				agentsAction.getContent().add(agentsTable);
			}
		}
	}
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CREW,
			referenceID = CrewaiPackage.CREW__TASKS)
	public void buildTasksOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			Action tasksAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"tasks.html", 
					"Tasks", 
					TASKS_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				tasksAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> agentsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(agentsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag tasksTable = agentsTableBuilder.build(
						referenceOutgoingEndpoints
						.stream()
						.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
						.toList(),  
						"crew-tasks", 
						"tasks-table", 
						progressMonitor);
				
				tasksAction.getContent().add(tasksTable);
			}
		}
	}
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CREW,
			referenceID = CrewaiPackage.CREW__TOOLS)
	public void buildToolsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			Action toolsAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"tools.html", 
					"Tools", 
					TOOLS_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				toolsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> toolsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(toolsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = toolsTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"crew-tools", 
						"tools-table", 
						progressMonitor);
				
				toolsAction.getContent().add(agentsTable);
			}
		}
	}
		
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CREW,
			referenceID = CrewaiPackage.CREW__KNOWLEDGE_SOURCES)
	public void buildKnowledgeSourcesOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			Action knowledgeSourcesAction = getRoleActionByLocation(
					((Action) label).getChildren(), 
					"knowledge-sources.html", 
					"Knowledge Sources", 
					KNOWLDEGE_SOURCE_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				knowledgeSourcesAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> knowledgeSourcesTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(knowledgeSourcesTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = knowledgeSourcesTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"crew-knowledge-sources", 
						"knowledge-sources-table", 
						progressMonitor);
				
				knowledgeSourcesAction.getContent().add(agentsTable);
			}
		}
	}
	
	// TODO - befor/after kickoff, process, language models, manager agent, manager llm, function calling lllm, planning llm, embedder, step callback, task callback
	
}
