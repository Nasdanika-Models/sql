package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.OutgoingEndpoint;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.ncore.NamedElement;

public class TaskNodeProcessor extends ConfigurableNodeProcessor<Task> {

	public TaskNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return TASK_ICON;
	}	
		
	private WidgetFactory agentWidgetFactory;
	
	@OutgoingEndpoint("reference.name == 'agent'")
	public final void setAgentEndpoint(WidgetFactory agentWidgetFactory) {
		this.agentWidgetFactory = agentWidgetFactory;
	}	
		
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Map<String, Collection<EObject>> properties = new LinkedHashMap<>();
		Map<String, Object> configMap = getTarget().getConfigMap();
		Object expectedOutputObj = configMap.get(Task.EXPECTED_OUTPUT_KEY);
		if (expectedOutputObj instanceof String) {
			String expectedOutput = (String) expectedOutputObj;
			if (!Util.isBlank(expectedOutput)) {
				properties.put("Expected output", Collections.singleton(createText((String) expectedOutput)));			
			}
		}
		if (agentWidgetFactory != null) {
			properties.put("Agent", Collections.singleton((EObject) agentWidgetFactory.createLink(progressMonitor)));
		}
		return properties.entrySet();
	}
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.TASK,
			referenceID = CrewaiPackage.TASK__TOOLS)
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
			Action toolsAction = getRoleActionByName(
					((Action) label).getSections(), 
					"tools", 
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
						"task-tools", 
						"tools-table", 
						progressMonitor);
				
				toolsAction.getContent().add(agentsTable);
			}
		}
	}	
		
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.TASK,
			referenceID = CrewaiPackage.TASK__CONTEXT)
	public void buildContextOutgoingReference(
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
			Action toolsAction = getRoleActionByName(
					((Action) label).getSections(), 
					"context", 
					"Context", 
					TASK_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				toolsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> toolsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(toolsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = toolsTableBuilder.build(
						referenceOutgoingEndpoints
							.stream()
							.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
							.toList(),  
						"task-context", 
						"context-table", 
						progressMonitor);
				
				toolsAction.getContent().add(agentsTable);
			}
		}
	}	
	
	/**
	 * Parses configuration for Role, Goal, and Back story
	 */
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		Map<String, Object> configMap = getTarget().getConfigMap();
		Object taskDescriptionObj = configMap.get(Task.TASK_DESCRIPTION_KEY);
		if (taskDescriptionObj instanceof String) {
			String taskDescription = (String) taskDescriptionObj;
			if (!Util.isBlank(taskDescription)) {
				Action taskDescriptionAction = getRoleActionByLocation(
						action.getSections(), 
						"description", 
						"Description", 
						DESCRIPTION_ICON);
				
				taskDescriptionAction.getContent().add(createText(taskDescription));			
			}			
		}
			
		return action;
	}
		
	// TODO - callback
	
}
