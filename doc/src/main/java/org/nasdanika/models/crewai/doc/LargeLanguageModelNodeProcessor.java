package org.nasdanika.models.crewai.doc;

import java.util.Collection;

import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.LargeLanguageModel;

public class LargeLanguageModelNodeProcessor extends ModelElementNodeProcessor<LargeLanguageModel> {

	public LargeLanguageModelNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		
	
	@Override
	protected String getTypeIcon() {
		return LLM_ICON;
	}
	
	// TODO - agents using this LLM, aggregation of incoming references
	
}
