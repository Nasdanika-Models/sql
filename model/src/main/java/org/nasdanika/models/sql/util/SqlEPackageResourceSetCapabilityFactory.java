package org.nasdanika.models.sql.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.sql.SqlPackage;

public class SqlEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return SqlPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://sql.models.nasdanika.org/");
	}

}
