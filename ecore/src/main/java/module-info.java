import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.ast.ecore.EcoreGenAstProcessorsCapabilityFactory;
import org.nasdanika.models.sql.ecore.EcoreGenSqlProcessorsCapabilityFactory;

module org.nasdanika.models.sql.ecore {
		
	requires transitive org.nasdanika.models.sql;
	requires transitive org.nasdanika.models.sql.ast;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.sql.ecore;
	opens org.nasdanika.models.sql.ecore; // For loading resources
	
	exports org.nasdanika.models.sql.ast.ecore;
	opens org.nasdanika.models.sql.ast.ecore; // For loading resources

	provides CapabilityFactory with	
		EcoreGenSqlProcessorsCapabilityFactory,
		EcoreGenAstProcessorsCapabilityFactory; 		
	
}
