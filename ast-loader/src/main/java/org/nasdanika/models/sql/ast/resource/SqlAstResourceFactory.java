package org.nasdanika.models.sql.ast.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * ResourceFactory for .sql files, registered for the "sql" extension.
 */
public class SqlAstResourceFactory extends ResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new SqlAstResource(uri);
    }
}
