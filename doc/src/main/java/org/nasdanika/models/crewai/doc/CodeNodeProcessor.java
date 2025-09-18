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
import org.nasdanika.models.bootstrap.Table;
import org.nasdanika.models.crewai.Code;

public class CodeNodeProcessor<T extends Code> extends ModelElementNodeProcessor<T> {

	public CodeNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return CODE_ICON;
	}	
	
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		
		Table propertiesTable = createPropertiesTable(progressMonitor);
		if (propertiesTable != null) {
			action.getContent().add(0, propertiesTable);
		}
		
		if (documentationFactories != null && !documentationFactories.isEmpty()) {
			Code target = getTarget();
			String code = target.getCode();
			if (!Util.isBlank(code)) {
				Optional<DocumentationFactory> dfo = documentationFactories
						.stream()
						.filter(df -> df.canHandle(Content.MARKDOWN))
						.findAny();
					
				if (dfo.isPresent()) {
					Collection<EObject> documentation = dfo.get().createDocumentation(
							target, 
							"""
							```python
							%s
							```
							""".formatted(code), 
							Content.MARKDOWN, 
							target.eResource() == null ? null : target.eResource().getURI(),
							Collections.<String,String>emptyMap()::get,
							progressMonitor);

					if (!documentation.isEmpty()) {
						Action codeAction = getRoleActionByLocation(
								action.getNavigation(), 
								"code.html", 
								"Code", 
								CODE_ICON);
						
						String comment = target.getComment();
						if (!Util.isBlank(comment)) {
							codeAction.getContent().add(createText(comment));
						}
						
						codeAction.getContent().addAll(documentation);
						createImportsSection(codeAction, progressMonitor);						
					}					
				}
			}
		}
				
		return action;
	}
	
	protected void createImportsSection(Action codeAction, ProgressMonitor progressMonitor) {
		// TODO - as a table
		if (documentationFactories != null && !documentationFactories.isEmpty()) {
			Code target = getTarget();
			String imports = target.getImports();
			if (!Util.isBlank(imports)) {
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
							""".formatted(imports), 
							Content.MARKDOWN, 
							target.eResource() == null ? null : target.eResource().getURI(),
							Collections.<String,String>emptyMap()::get,
							progressMonitor);

					if (!documentation.isEmpty()) {						
						Action importsAction = getRoleActionByName(
								codeAction.getSections(), 
								"imports", 
								"Imports", 
								null);
						
						importsAction.getContent().addAll(documentation);
					}					
				}
			}
		}
	}
	
	
}
