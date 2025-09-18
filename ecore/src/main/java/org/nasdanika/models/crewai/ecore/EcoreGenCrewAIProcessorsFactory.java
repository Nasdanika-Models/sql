package org.nasdanika.models.crewai.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = CrewaiPackage.eNS_URI)
public class EcoreGenCrewAIProcessorsFactory {

	private Context context;
		
	@Factory
	public final CrewProcessorsFactory crewProcessorsFactory;
	
	@Factory
	public final AgentProcessorsFactory agentProcessorsFactory;
	
	@Factory
	public final CallbackProcessorsFactory callbackProcessorsFactory;
	
	@Factory
	public final CodeProcessorsFactory codeProcessorsFactory;
	
	@Factory
	public final ConfigurableProcessorsFactory configurableProcessorsFactory;
	
	@Factory
	public final FunctionProcessorsFactory functionProcessorsFactory;
	
	@Factory
	public final GuardrailProcessorsFactory guardrailProcessorsFactory;
	
	@Factory
	public final KnowledgeSourceProcessorsFactory knowledgeSourceProcessorsFactory;
	
	@Factory
	public final LargeLanguageModelProcessorsFactory largeLanguageModelProcessorsFactory;
	
	@Factory
	public final ProcessProcessorsFactory processProcessorsFactory;
	
	@Factory
	public final TaskProcessorsFactory taskProcessorsFactory;
	
	@Factory
	public final ToolProcessorsFactory toolProcessorsFactory;		
	
	public EcoreGenCrewAIProcessorsFactory(Context context) {
		this.context = context;
		crewProcessorsFactory = new CrewProcessorsFactory(context);		
		agentProcessorsFactory = new AgentProcessorsFactory(context);
		callbackProcessorsFactory = new CallbackProcessorsFactory(context);
		codeProcessorsFactory = new CodeProcessorsFactory(context);
		configurableProcessorsFactory = new ConfigurableProcessorsFactory(context);
		functionProcessorsFactory = new FunctionProcessorsFactory(context);
		guardrailProcessorsFactory = new GuardrailProcessorsFactory(context);
		knowledgeSourceProcessorsFactory = new KnowledgeSourceProcessorsFactory(context);
		largeLanguageModelProcessorsFactory = new LargeLanguageModelProcessorsFactory(context);
		processProcessorsFactory = new ProcessProcessorsFactory(context);
		taskProcessorsFactory = new TaskProcessorsFactory(context);
		toolProcessorsFactory = new ToolProcessorsFactory(context);		
	}
	
	@EPackageNodeProcessorFactory(
			label = "CrewAI Model",
			//actionPrototypeRef = "test-package.yml",
//			actionPrototype = """
//                    app-action:
//                        text: Param
//                        icon: fas fa-user					
//					""",
			icon = "https://crew-ai.models.nasdanika.org/images/crewai.svg",
			description = "A model of a CrewAI concepts for the purposes of modeling and code generation",
			documentation =  """
				
				```drawio-resource
				crew-ai.drawio
				```
				
				The [CrewAI](https://www.crewai.com/) model can be used as a reference guide complementary to the [official documentation](https://docs.crewai.com/)[^attribution].
				Hover the mouse over the diagram elements above for short descriptions (tooltips), click to navigate to element pages with more details.
				The above diagram is conceptual - it shows only the most important classes and relationships.
				The [generated UML class diagram](diagram.html) provides more details. 
				Hover the mouse over diagram elements for tooltips, click to navigate to class/feature pages.				
				
				You can also use the [default graph](default-graph.html) and other graphs to quickly grasp relationships of the model elements.
				Hover the mouse over graph nodes for tooltips and to highlight their reated classes.
				Drag to rearrange, double-click to navigate to class pages.   
				
				It can also be used as a starting point for an organization-specific documentation - make a copy or fork, modify descriptions of model elements.
				For example, add links to catalogs of internal [knowledge sources](references/eClassifiers/KnowledgeSource/index.html)
				or approved/available [LLMs](references/eClassifiers/LargeLanguageModel/index.html) and their configurations.
				Similarly, you may have a catalog of reusable [agents](references/eClassifiers/Agent/index.html) or [guardrails](references/eClassifiers/Guardrail/index.html).
				You may also have organization-specific development guidelines with references to shared libraries and internal productivity tools such as code generators, wizards, IDE plugins, training resources, ...		
				
				You can also create a custom model by extending classes in this model and add classes and features specific to your organization. 
				For example, catalogs, ownership and reponsibilities, alignment to organizational structure, development efforts, etc.		 		 
				
				[^attribution]: Documentation in this model is copied verbatim or almost verbatim from the reference documentation for the purpose of consistency.   

				However, the main objective of the model is to serve as an intermediary for code and documentation generation.
				The model can be populated from diagrams and other data sources.
				Then it produces a [python model](https://python.models.nasdanika.org/) and, finally, Python sources and supporting artifacts.
				
				The model can be created from [Drawio diagrams](https://docs.nasdanika.org/core/drawio/index.html) using [exeutable diagrams](https://docs.nasdanika.org/core/drawio/index.html#executable-diagrams) or [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html).
				
				You can find an example of programmatic population of a model [here](https://github.com/Nasdanika-Models/crew-ai/blob/main/model/src/test/java/org/nasdanika/models/crewai/tests/CrewAITests.java#L117).
				The below code snippet shows how to generate a python source file and configuration files using [CrewGenerator](https://github.com/Nasdanika-Models/crew-ai/blob/main/model/src/main/java/org/nasdanika/models/crewai/util/CrewGenerator.java):
				
				```java
				CapabilityLoader capabilityLoader = new CapabilityLoader();
				ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
				Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
				ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
				File crewSourceFile = new File("target/latest-ai-developments/src/crew.py").getCanonicalFile();
				URI crewSourceURI = URI.createFileURI(crewSourceFile.getAbsolutePath());
				CrewGenerator crewGenerator = new CrewGenerator();
				crewGenerator.generate(
						createCrew(), 
						crewSourceURI, 
						resourceSet, 
						progressMonitor);				
				```
				     				     
				You can override CrewGenerator methods to customize the generation process.     				     				     				     				      				     				     				     				 				     				     				      				     				     				     				 						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
