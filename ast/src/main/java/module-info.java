import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.ast.util.SqlAstEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.sql.ast {
    exports org.nasdanika.models.sql.ast;
    exports org.nasdanika.models.sql.ast.impl;
    exports org.nasdanika.models.sql.ast.util;

    requires transitive org.eclipse.emf.ecore;
    requires transitive org.eclipse.emf.common;
    requires org.nasdanika.capability;

    provides CapabilityFactory with SqlAstEPackageResourceSetCapabilityFactory;
}
