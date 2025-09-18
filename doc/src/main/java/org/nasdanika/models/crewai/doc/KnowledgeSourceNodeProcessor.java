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
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.ncore.NamedElement;

public class KnowledgeSourceNodeProcessor extends ModelElementNodeProcessor<KnowledgeSource> {

	public KnowledgeSourceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return KNOWLDEGE_SOURCE_ICON;
	}	
		
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.KNOWLEDGE_SOURCE,
			referenceID = CrewaiPackage.KNOWLEDGE_SOURCE__AGENTS)
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
			Action tasksAction = getRoleActionByName(
					((Action) label).getSections(), 
					"agents", 
					"Agents", 
					AGENT_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				tasksAction.getChildren().addAll(re.getValue());
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
						"knowledge-source-agents", 
						"agents-table", 
						progressMonitor);
				
				tasksAction.getContent().add(agentsTable);
			}
		}
	}	
	
	
}
