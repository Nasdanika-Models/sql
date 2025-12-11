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
import org.nasdanika.graph.processor.OutgoingEndpoint;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.bootstrap.Table;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.SqlPackage;

public class ColumnNodeProcessor extends ModelElementNodeProcessor<Column> {

	public ColumnNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return COLUMN_ICON;
	}
		
	private WidgetFactory typeWidgetFactory;
	
	@OutgoingEndpoint("reference.name == 'type'")
	public final void setTypeEndpoint(WidgetFactory typeWidgetFactory) {
		this.typeWidgetFactory = typeWidgetFactory;
	}	
		
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Map<String, Collection<EObject>> properties = new LinkedHashMap<>();
		for (EAttribute attr: SqlPackage.Literals.COLUMN.getEAttributes().stream().sorted(ENamedElementComparator.INSTANCE).toList()) {
			Column column = getTarget();
			if (column.eIsSet(attr)) {
				Object val = column.eGet(attr);
				properties.put(Util.nameToLabel(attr.getName()), Collections.singleton(createText(String.valueOf(val))));							
			}
		}
		if (typeWidgetFactory != null) {
			properties.put("Type", Collections.singleton((EObject) createTypeLink(progressMonitor)));
		}
		return properties.entrySet();
	}

	public Object createTypeLink(ProgressMonitor progressMonitor) {
		return typeWidgetFactory.createLink(progressMonitor);
	}	
	
	public WidgetFactory getTypeWidgetFactory() {
		return typeWidgetFactory;
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
