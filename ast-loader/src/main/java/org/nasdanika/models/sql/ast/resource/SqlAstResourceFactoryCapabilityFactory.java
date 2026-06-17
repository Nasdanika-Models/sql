package org.nasdanika.models.sql.ast.resource;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

/**
 * Registers the SqlAstResourceFactory for the "sql" file extension via the capability system.
 */
public class SqlAstResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

    @Override
    protected Factory getResourceFactory(ResourceSet resourceSet, Loader loader, ProgressMonitor progressMonitor) {
        return new SqlAstResourceFactory();
    }

    @Override
    protected String getExtension() {
        return "sql";
    }
}
