package org.nasdanika.models.sql.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ENamedElementComparator;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.bootstrap.Table;
import org.nasdanika.models.sql.DataType;
import org.nasdanika.models.sql.SqlPackage;

public class DataTypeNodeProcessor extends ModelElementNodeProcessor<DataType> {

	public DataTypeNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return DATA_TYPE_ICON;
	}
		
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Map<String, Collection<EObject>> properties = new LinkedHashMap<>();
		for (EAttribute attr: SqlPackage.Literals.DATA_TYPE.getEAttributes().stream().sorted(ENamedElementComparator.INSTANCE).toList()) {
			DataType dataType = getTarget();
			if (dataType.eIsSet(attr)) {
				Object val = dataType.eGet(attr);
				properties.put(Util.nameToLabel(attr.getName()), Collections.singleton(createText(String.valueOf(val))));							
			}
		}
		return properties.entrySet();
	}	
	
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		
		Table propertiesTable = createPropertiesTable(progressMonitor);
		if (propertiesTable != null) {
			action.getContent().add(0, propertiesTable);
		}
				
		return action;
	}
			
}
