import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.crewai.cli.CrewAIGeneratorCommandFactory;

module org.nasdanika.models.crewai.cli {
	
	requires transitive org.nasdanika.cli;
	requires transitive org.nasdanika.models.crewai;
	
	exports org.nasdanika.models.crewai.cli;
	opens org.nasdanika.models.crewai.cli;
		
	provides CapabilityFactory with 
		CrewAIGeneratorCommandFactory;

}
