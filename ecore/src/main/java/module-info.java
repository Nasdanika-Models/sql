import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.crewai.ecore.ECoreGenCrewAIProcessorsCapabilityFactory;

module org.nasdanika.models.crewai.ecore {
		
	requires transitive org.nasdanika.models.crewai;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.crewai.ecore;
	opens org.nasdanika.models.crewai.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenCrewAIProcessorsCapabilityFactory; 		
	
}
