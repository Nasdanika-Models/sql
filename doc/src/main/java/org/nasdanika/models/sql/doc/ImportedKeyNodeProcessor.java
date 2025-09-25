package org.nasdanika.models.sql.doc;

import java.util.Collection;

import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.ImportedKey;

public class ImportedKeyNodeProcessor extends ModelElementNodeProcessor<ImportedKey> {

	public ImportedKeyNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return IMPORTED_KEY_ICON;
	}
			
}
