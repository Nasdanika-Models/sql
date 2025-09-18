package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
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
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.Guardrail;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLanguageModel;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate family documentation.
 * @author Pavel
 *
 */
public class CrewAINodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider;
	private Collection<DocumentationFactory> documentationFactories;

	protected java.util.function.Function<ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return progressMonitor -> {
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
	public CrewAINodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider,
			Collection<DocumentationFactory> documentationFactories)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
		this.documentationFactories = documentationFactories;
	}
	
	@EObjectNodeProcessor(type = Code.class)
	public Object createCodeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CodeNodeProcessor<Code>(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = org.nasdanika.models.crewai.Function.class)
	public Object createFunctionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new FunctionNodeProcessor<org.nasdanika.models.crewai.Function>(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Guardrail.class)
	public Object createGuardrailNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new GuardrailNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Callback.class)
	public Object createCallbackNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CallbackNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Tool.class)
	public Object createToolNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ToolNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Agent.class)
	public Object createAgentNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new AgentNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Crew.class)
	public Object createCrewNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CrewNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = Task.class)
	public Object createTaskNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new TaskNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = LargeLanguageModel.class)
	public Object createLargeLanguageModelNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new LargeLanguageModelNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
	@EObjectNodeProcessor(type = KnowledgeSource.class)
	public Object createKnowledgeSourceNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new KnowledgeSourceNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
}
