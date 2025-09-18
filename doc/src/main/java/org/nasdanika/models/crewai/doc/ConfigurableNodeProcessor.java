package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Content;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.Configurable;
import org.yaml.snakeyaml.Yaml;

public class ConfigurableNodeProcessor<T extends Configurable> extends CodeNodeProcessor<T> {

	public ConfigurableNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return CONFIGURABLE_ICON;
	}	
	
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		if (documentationFactories != null && !documentationFactories.isEmpty()) {
			Configurable target = getTarget();
			String configuration = target.getConfiguration();
			if (!Util.isBlank(configuration)) {
				Optional<DocumentationFactory> dfo = documentationFactories
						.stream()
						.filter(df -> df.canHandle(Content.MARKDOWN))
						.findAny();
					
				if (dfo.isPresent()) {
					Collection<EObject> documentation = dfo.get().createDocumentation(
							target, 
							"""
							```yaml
							%s
							```
							""".formatted(configuration), 
							Content.MARKDOWN, 
							target.eResource() == null ? null : target.eResource().getURI(),
							Collections.<String,String>emptyMap()::get,
							progressMonitor);

					if (!documentation.isEmpty()) {
						Action configurationAction = getRoleActionByLocation(
								action.getNavigation(), 
								"configuration.html", 
								"Configuration", 
								CONFIGURABLE_ICON);
						
						configurationAction.getContent().addAll(documentation);
					}					
				}
			}
		}
				
		return action;
	}
	
}
