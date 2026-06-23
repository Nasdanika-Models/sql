import org.nasdanika.models.sql.ast.resource.SqlScriptArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.sql.ast.resource.SqlScriptResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.sql.ast.resource.SqlScriptResourceFactoryCapabilityFactory;
import org.nasdanika.models.sql.ast.resource.StatementArrayResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.sql.ast.loader {
    exports org.nasdanika.models.sql.ast.loader;
    exports org.nasdanika.models.sql.ast.resource;

    requires transitive org.nasdanika.models.sql.ast;
    requires net.sf.jsqlparser;
    requires transitive org.nasdanika.capability;
    requires org.nasdanika.common;
    requires org.eclipse.emf.common;
    requires org.eclipse.emf.ecore;

    provides org.nasdanika.capability.CapabilityFactory with
		SqlScriptResourceFactoryCapabilityFactory,
		SqlScriptResourceContentsHandlerCapabilityFactory,
		SqlScriptArrayResourceContentsHandlerCapabilityFactory,
		StatementArrayResourceContentsHandlerCapabilityFactory;

}
