package org.nasdanika.models.sql.ast.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * ResourceFactory for .sql files. Creates SqlSourceResource instances.
 * Register for the "sql" file extension.
 */
public class SqlSourceResourceFactory extends ResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new SqlSourceResource(uri);
    }
}
