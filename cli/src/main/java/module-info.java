import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.sql.cli.CatalogDiagramFactory;
import org.nasdanika.models.sql.cli.MetaDataCommandFactory;
import org.nasdanika.models.sql.cli.SqlCommandFactory;

module org.nasdanika.models.crewai.cli {
	
	requires transitive org.nasdanika.cli;
	requires transitive org.nasdanika.models.sql;
	requires org.nasdanika.emf;
	requires freemarker;
	
	exports org.nasdanika.models.sql.cli;
	opens org.nasdanika.models.sql.cli;
		
	provides CapabilityFactory with 
		SqlCommandFactory,
		CatalogDiagramFactory,
		MetaDataCommandFactory;

}
