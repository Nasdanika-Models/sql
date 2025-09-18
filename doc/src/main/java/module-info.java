import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.crewai.doc.CrewAINodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.crewai.doc {
		
	requires transitive org.nasdanika.models.crewai;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.crewai.doc;
	opens org.nasdanika.models.crewai.doc; // For loading resources

	provides CapabilityFactory with	CrewAINodeProcessorFactoryCapabilityFactory;
	
}
