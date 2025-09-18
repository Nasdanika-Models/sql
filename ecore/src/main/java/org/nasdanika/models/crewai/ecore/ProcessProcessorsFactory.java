package org.nasdanika.models.crewai.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EEnumNodeProcessor;

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.PROCESS)
public class ProcessProcessorsFactory {
	private Context context;
	
	public ProcessProcessorsFactory(Context context) {
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
			icon = "https://crew-ai.models.nasdanika.org/images/milestone.svg", 
			description = "Processes orchestrate the execution of tasks by agents",
			documentation = 
                    """
					
                    [Processes](https://docs.crewai.com/concepts/processes) enable individual [agents](../Agent/index.html) to operate as a cohesive unit, 
                    streamlining their efforts to achieve common objectives with efficiency and coherence.					
                    """
	)
	public EEnumNodeProcessor createFamilyProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EEnumNodeProcessor(config, context, prototypeProvider) {
			
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
