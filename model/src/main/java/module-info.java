import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.util.SqlEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.sql {
	exports org.nasdanika.models.sql;
	exports org.nasdanika.models.sql.impl;
	exports org.nasdanika.models.sql.util;
	
	opens org.nasdanika.models.sql.util to org.nasdanika.common; // For reflection to generate Ecore
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.drawio;
	requires transitive org.nasdanika.models.sql.core;
	requires transitive freemarker;
	
	provides CapabilityFactory with SqlEPackageResourceSetCapabilityFactory;
	
}