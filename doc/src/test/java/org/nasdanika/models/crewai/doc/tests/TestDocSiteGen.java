package org.nasdanika.models.crewai.doc.tests;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiFactory;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;

public class TestDocSiteGen {
	
	protected Crew createSampleCrew(CapabilityLoader capabilityLoader) {
		// Building
		CrewaiFactory crewaiFactory = CrewaiFactory.eINSTANCE;
		
		// Tools
		Tool serper = crewaiFactory.createTool();
		serper.setName("Serper");
		serper.setDescription("Searches internet");
		serper.setCode("SerperDevTool()");		
		serper.setImports(
				"""
				module: crewai_tools
				item: SerperDevTool
				""");
		
		// Agents
		Agent researcher = crewaiFactory.createAgent();
		researcher.setComment(
			"""
			Some important
			comment 
			about the researcher
			""");
		researcher.setId("researcher"); // Element id
		researcher.setName("Senior Data Researcher"); // Element label
		researcher.setConfiguration(
			"""
			role: >
			  {topic} Senior Data Researcher
			goal: >
			  Uncover cutting-edge developments in {topic}
			backstory: >
			  You're a seasoned researcher with a knack for uncovering the latest
			  developments in {topic}. Known for your ability to find the most relevant
              information and present it in a clear and concise manner.			
			""");
		
		Agent reportingAnalyst = crewaiFactory.createAgent();
		reportingAnalyst.setId("reporting_analyst");
		reportingAnalyst.setName("Reporting Analyst");
		reportingAnalyst.setConfiguration(
			"""
			role: >
			  {topic} Reporting Analyst
			goal: >
			  Create detailed reports based on {topic} data analysis and research findings
			backstory: >
			  You're a meticulous analyst with a keen eye for detail. You're known for
			  your ability to turn complex data into clear and concise reports, making
			  it easy for others to understand and act on the information you provide.
    		""");
				
		// Tasks		
		Task researchTask = crewaiFactory.createTask();
		researchTask.setId("research_task");
		researchTask.setName("Research Task");
		researchTask.setConfiguration(
			"""
			description: >
			  Conduct a thorough research about {topic}
			  Make sure you find any interesting and relevant information given
			  the current year is 2025.
			expected_output: >
			  A list with 10 bullet points of the most relevant information about {topic}
			""");
		researchTask.setAgent(researcher);
		researchTask.getTools().add(serper);
				
		Task reportingTask = crewaiFactory.createTask();
		reportingTask.setId("reporting_task");
		reportingTask.setName("Reporting Task");
		reportingTask.setConfiguration(
			"""
			description: >
			  Review the context you got and expand each topic into a full section for a report.
			  Make sure the report is detailed and contains any and all relevant information.
			expected_output: >
			  A fully fledge reports with the mains topics, each with a full section of information.
			  Formatted as markdown without '```'
			output_file: report.md
  			""");
		reportingTask.setAgent(reportingAnalyst);
				
		// Crew
		Crew crew = crewaiFactory.createCrew();
		crew.setId("LatestAiDevelopmentCrew");
		crew.setName("Latest AI Development Crew");
		
		// Example of importing using spel token
//		crew.setCode("""
//				my_var = ${spel:addItemImport('my_module', 'my_item').item}
//				""");
		
		EList<Agent> agents = crew.getAgents();
		agents.add(researcher);
		agents.add(reportingAnalyst);
		
		EList<Task> tasks = crew.getTasks();
		tasks.add(researchTask);
		tasks.add(reportingTask);
		
		crew.getTools().add(serper);
		return crew;
	}	
	
	@Test
	public void testGenerateCrewDocSite() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Crew crew = createSampleCrew(capabilityLoader);		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
				Collections.singleton(crew), 
				context,
				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
				null, // Predicate<Object> factoryPredicate,
				null, // Predicate<EPackage> ePackagePredicate,
				diagnosticConsumer,
				progressMonitor);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "crew-actions.xmi");
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "crew-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			@Override
			protected Context createContext(ProgressMonitor progressMonitor) {
				return context;
			}
			
		};		
		
		String siteMapDomain = "https://something.org";		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				Theme.Cerulean.pageTemplateCdnURI, 
				siteMapDomain, 
				new File("target/sample-crew-docs"),  
				new File("target/family-doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errorCount != 4) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}				
	}
	
}
