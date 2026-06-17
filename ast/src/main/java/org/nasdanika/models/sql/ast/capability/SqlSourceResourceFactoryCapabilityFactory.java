package org.nasdanika.models.sql.ast.capability;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

/**
 * Registers the SqlSourceResourceFactory for the "sql" extension via the capability framework.
 */
public class SqlSourceResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

    @Override
    protected Factory getResourceFactory(
            ResourceSet resourceSet,
            Loader loader,
            ProgressMonitor progressMonitor) {
        return new SqlSourceResourceFactory();
    }

    @Override
    protected String getExtension() {
        return "sql";
    }
}
