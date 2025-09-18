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

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.CREW)
public class CrewProcessorsFactory {
	private Context context;
	
	public CrewProcessorsFactory(Context context) {
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
			icon = "https://crew-ai.models.nasdanika.org/images/navy.svg", 
			description = "A collaborative group of agents working together to complete a set of tasks",
			documentation = 
                    """					
                    A [crew](https://docs.crewai.com/concepts/crews) represents a collaborative group of [agents](../Agent/index.html) working together to 
                    accomplish a set of [tasks](../Task/index.html). 
                    Each crew defines the strategy for task execution, agent collaboration, and the overall workflow.					
                    """
	)
	public EClassNodeProcessor createFamilyProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__TOOLS,
			description = "Tools used by agents and tasks",
			documentation = 
					"""
					Tools containment reference. 					  					  				
					
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__AGENTS,
			description = "Crew agents",
			documentation = 
					"""
					Agents in this crew. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createAgentsProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__TASKS,
			description = "Tasks",
			documentation = 
					"""
					Tasks containment reference. 					  					  				
					
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__BEFORE_KICKOFF,
			description = "A function to be executed before the crew starts",
			documentation = 
					"""
					Executes before the crew starts. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createBeforeKickoffProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__AFTER_KICKOFF,
			description = "method to be executed after the crew finishes",
			documentation = 
					"""
					Executes after the crew finishes. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createAfterKickoffProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__PROCESS,
			description = "The process flow",
			documentation = 
					"""
					 					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createProcessProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__KNOWLEDGE_SOURCES,
			description = "Knowledge sources used by agents",
			documentation = 
					"""
					Knowledge sources used by [agents](../../../../Agent/index.html) 					  					  				
					
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__LANGUAGE_MODELS,
			description = "Language models used by the crew and its agents",
			documentation = 
					"""
					Language models used by the crew and its [agents](../../../../Agent/index.html) 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createLanguageModelsProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__MANAGER_AGENT,
			description = "A custom agent for managing the crew",
			documentation = 
					"""
					A custom agent managing the crew. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createManagerAgentProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__MANAGER_LLM,
			description = "The language model used by the manager agent in a hierarchical process",
			documentation = 
					"""
					The language model used by the manager agent in a hierarchical process. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createManagerLlmProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__FUNCTION_CALLING_LLM,
			description = "Used to do functiona calling for tools for all agents in the crew",
			documentation = 
					"""
					If passed, the crew will use this LLM to do function calling for [tools](../../../../Tool/index.html) for all [agents](../../../../Agent/index.html) in the crew. 
					Each agent can have its own [LLM](../../../../LargeLanguageModel/index.html), which overrides the crew’s LLM for function calling.					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createFunctionCallingProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__PLANNING_LLM,
			description = "The language model used by the AgentPlanner",
			documentation = 
					"""
					The language model used by the AgentPlanner in a planning process 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createPlanningLlmProcessor(
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__EMBEDDER,
			description = "Configuration for the embedder to be used by the crew",
			documentation = 
					"""
					Configuration for the embedder to be used by the crew. 					  					  				
					
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__STEP_CALLBACK,
			description = "A function that is called after each step of every agent",
			documentation = 
					"""
					A function that is called after each step of every [agent](../../../../Agent/index.html).
					This can be used to log the agent’s actions or to perform other operations; it won’t override the agent-specific step callback. 					  					  				
					
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
			classID = CrewaiPackage.CREW,
			featureID = CrewaiPackage.CREW__TASK_CALLBACK,
			description = "A function that is called after the completion of each task",
			documentation = 
					"""
					A function that is called after the completion of each [task](../../../../Task/index.html).
					Useful for monitoring or additional operations post-task execution. 					  					  				
					
					"""
	)
	public EReferenceNodeProcessor createTaskCallbackProcessor(
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

}
