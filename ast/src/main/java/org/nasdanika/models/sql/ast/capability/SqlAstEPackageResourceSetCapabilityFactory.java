package org.nasdanika.models.sql.ast.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.sql.ast.SqlAstPackage;

/**
 * Registers the SQL AST EPackage with the capability framework.
 */
public class SqlAstEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

    @Override
    protected EPackage getEPackage() {
        return SqlAstPackage.eINSTANCE;
    }

    @Override
    protected URI getDocumentationURI() {
        return URI.createURI("https://sql.models.nasdanika.org/ast/");
    }
}
