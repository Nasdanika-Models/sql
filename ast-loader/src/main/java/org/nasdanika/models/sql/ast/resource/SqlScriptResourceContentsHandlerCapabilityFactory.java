package org.nasdanika.models.sql.ast.resource;

import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.ast.SqlScript;

/**
 * Provides an {@link OpenAIClient} instance.  
 */
public class SqlScriptResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler<SqlScript>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type) 
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(org.nasdanika.capability.emf.ResourceContentsHandler.Requirement handlerRequirement) {
		return SqlScript.class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "sql".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<SqlScript>>>> createService(
			Class<ResourceContentsHandler<SqlScript>> serviceType, 
			org.nasdanika.capability.emf.ResourceContentsHandler.Requirement serviceRequirement, 
			final Loader loader,
			ProgressMonitor progressMonitor) {
		
		return wrap(new SqlScriptResourceContentsHandler(serviceRequirement.getResource().getURI()));
	}

}
