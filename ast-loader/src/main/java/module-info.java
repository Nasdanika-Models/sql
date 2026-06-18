module org.nasdanika.models.sql.ast.loader {
    exports org.nasdanika.models.sql.ast.loader;
    exports org.nasdanika.models.sql.ast.resource;

    requires transitive org.nasdanika.models.sql.ast;
    requires net.sf.jsqlparser;
    requires org.nasdanika.capability;
    requires org.nasdanika.common;
    requires org.eclipse.emf.common;
    requires org.eclipse.emf.ecore;

    provides org.nasdanika.capability.CapabilityFactory with
            org.nasdanika.models.sql.ast.resource.SqlAstResourceFactoryCapabilityFactory;
}
