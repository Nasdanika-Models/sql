package org.nasdanika.models.crewai.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EReferenceNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.AGENT)
public class AgentProcessorsFactory {
	private Context context;
	
	public AgentProcessorsFactory(Context context) {
		this.context = context;
	}	
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			icon = "https://crew-ai.models.nasdanika.org/images/software-agent.svg", 
			description = "Think of an agent as a specialized team member with specific skills, expertise, and responsibilities",
			documentation = """
					An [Agent](https://docs.crewai.com/concepts/agents) is an autonomous unit that can:
					
					* Perform specific [tasks](../Task/index.html)
					* Make decisions based on its role and goal
					* Use [tools](../Tool/index.html) to accomplish objectives
					* Communicate and collaborate with other agents
					* Maintain memory of interactions
					* Delegate tasks when allowed										
                    """
	)
	public EClassNodeProcessor createAgentProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
			@Override
			protected EList<? super Action> getMembersActionCollection(Action parent) {
				return parent.getChildren();
			}
			
			@Override
			protected EList<? super Action> getMembersCollection(Action membersAction) {
				return membersAction.getChildren();
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__TOOLS,
			description = "Capabilities or functions available to the agent",
			documentation = 
					"""
					Capabilities or functions available to the agent. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createToolsProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__TASKS,
			description = "Tasks assigned to this agent",
			documentation = 
					"""
					Tasks assigned to this agent. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createTasksProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__LLM,
			description = "Language model that powers the agent",
			documentation = 
					"""
					Language model that powers the agent. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createLlmProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__FUNCTION_CALLING_LLM,
			description = "Language model for tool calling",
			documentation = 
					"""
					Language model for tool calling, overrides crew’s LLM if specified. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createFunctionCallingLlmProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__STEP_CALLBACK,
			description = "Function called after each agent step",
			documentation = 
					"""
					Function called after each agent step, overrides crew callback. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createStepCallbackProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__KNOWLEDGE_SOURCES,
			description = "Knowledge sources available to the agent",
			documentation = 
					"""
					Knowledge sources available to the agent. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createKnowledgeSourcesProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__EMBEDDER,
			description = "Configuration for the embedder used by the agent",
			documentation = 
					"""
					Configuration for the embedder used by the agent. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createEmbedderProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
		
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__ROLE,
			description = "Defines the agent’s function and expertise within the crew",
			icon = "https://crew-ai.models.nasdanika.org/images/user.svg",
			documentation = 
					"""
					Defines the agent’s function and expertise within the crew.					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createRoleProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
		
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__GOAL,
			description = "The individual objective that guides the agent’s decision-making",
			icon = "https://crew-ai.models.nasdanika.org/images/business-plan.svg",
			documentation = 
					"""
					The individual objective that guides the agent’s decision-making.					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createGoalProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			featureID = CrewaiPackage.AGENT__BACKSTORY,
			description = "Provides context and personality to the agent",
			icon = "https://crew-ai.models.nasdanika.org/images/cv.svg",
			documentation = 
					"""
					Provides context and personality to the agent, enriching interactions.					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createBackstoryProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
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
