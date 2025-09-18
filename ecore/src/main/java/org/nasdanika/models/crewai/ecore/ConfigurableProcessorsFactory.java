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
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.CONFIGURABLE)
public class ConfigurableProcessorsFactory {
	private Context context;
	
	public ConfigurableProcessorsFactory(Context context) {
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
			icon = "https://crew-ai.models.nasdanika.org/images/web-management.svg", 
			description = "An element with YAML configuration",
			documentation = 
                    """
					
					Base class for [Agent](../Agent/index.html) and [Task](../Task/index.html) which can be configured with YAML.
										
                    """
	)
	public EClassNodeProcessor createConfigurablerocessor(
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
			classID = CrewaiPackage.CONFIGURABLE,
			featureID = CrewaiPackage.CONFIGURABLE__CONFIGURATION,
			description = "YAML configuration",
			documentation = 
					"""
					YAML configuration. 					  					  									
					"""
	)
	public EAttributeNodeProcessor createConfigurationProcessor(
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
			classID = CrewaiPackage.CONFIGURABLE,
			featureID = CrewaiPackage.CONFIGURABLE__CONFIG_MAP,
			description = "Computed configuration map",
			documentation = 
					"""
					Configuration map computed from YAML configuration and other features. 					  					  									
					"""
	)
	public EAttributeNodeProcessor createConfiMapProcessor(
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
