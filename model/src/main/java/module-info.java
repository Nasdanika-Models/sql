import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.util.SqlEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.sql {
	exports org.nasdanika.models.sql;
	exports org.nasdanika.models.sql.impl;
	exports org.nasdanika.models.sql.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	requires transitive org.nasdanika.models.sql.core;
	
	provides CapabilityFactory with SqlEPackageResourceSetCapabilityFactory;
	
}