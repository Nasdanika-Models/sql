import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.ast.capability.SqlAstEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.sql.ast.capability.SqlSourceResourceFactoryCapabilityFactory;

module org.nasdanika.models.sql.ast {

    exports org.nasdanika.models.sql.ast;
    exports org.nasdanika.models.sql.ast.impl;
    exports org.nasdanika.models.sql.ast.loader;
    exports org.nasdanika.models.sql.ast.capability;

    requires transitive org.eclipse.emf.ecore;
    requires transitive org.eclipse.emf.common;
    requires transitive org.nasdanika.capability;

    requires net.sf.jsqlparser;

    provides CapabilityFactory with
        SqlAstEPackageResourceSetCapabilityFactory,
        SqlSourceResourceFactoryCapabilityFactory;
}
