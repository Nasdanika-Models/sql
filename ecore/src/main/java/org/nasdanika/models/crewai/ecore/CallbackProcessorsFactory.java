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
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.CALLBACK)
public class CallbackProcessorsFactory {
	private Context context;
	
	public CallbackProcessorsFactory(Context context) {
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
			icon = "https://crew-ai.models.nasdanika.org/images/callback.svg", 
			description = "A function called after completion of tasks and steps",
			documentation = 
                    """
					
					* [Crew](../Crew/index.html)
					    * Step Callback - A function that is called after each step of every agent. 
					    * Task Callback - A function that is called after the completion of each task. Useful for monitoring or additional operations post-task execution.
					* [Agent](../Agent/index.html)
					    * Step Callback - Function called after each agent step, overrides crew callback. 
					* [Task](../Task/index.html) Callback - Function/object to be executed after task completion. 					    
                    					
                    """
	)
	public EClassNodeProcessor createCallbackProcessor(
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

}
