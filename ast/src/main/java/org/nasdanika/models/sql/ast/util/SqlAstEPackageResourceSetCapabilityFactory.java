package org.nasdanika.models.sql.ast.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.sql.ast.SqlAstPackage;

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
