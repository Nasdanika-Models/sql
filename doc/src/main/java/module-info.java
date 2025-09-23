import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.doc.SqlNodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.sql.doc {
		
	requires transitive org.nasdanika.models.sql;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.sql.doc;
	opens org.nasdanika.models.sql.doc; // For loading resources

	provides CapabilityFactory with	SqlNodeProcessorFactoryCapabilityFactory;
	
}
