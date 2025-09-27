import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.cli.SqlCommandFactory;

module org.nasdanika.models.crewai.cli {
	
	requires transitive org.nasdanika.cli;
	requires transitive org.nasdanika.models.sql;
	
	exports org.nasdanika.models.sql.cli;
	opens org.nasdanika.models.sql.cli;
		
	provides CapabilityFactory with 
		SqlCommandFactory;

}
