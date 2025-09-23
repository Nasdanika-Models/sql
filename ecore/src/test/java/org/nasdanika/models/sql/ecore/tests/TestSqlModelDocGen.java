package org.nasdanika.models.sql.ecore.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreNodeProcessorFactory;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.models.sql.ecore.EcoreGenSqlProcessorsFactory;
//import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestSqlModelDocGen {
	
	@Test
	public void testGenerateSqlModelDoc() throws IOException, DiagnosticException {
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		List<Function<URI,Action>> actionProviders = new ArrayList<>();		
		EcoreGenSqlProcessorsFactory ecoreGenFamilyProcessorFactory = new EcoreGenSqlProcessorsFactory(context);		
		EcoreNodeProcessorFactory ecoreNodeProcessorFactory = new EcoreNodeProcessorFactory(
				context, 
				(uri, pm) -> {
					for (Function<URI, Action> ap: actionProviders) {
						Action prototype = ap.apply(uri);
						if (prototype != null) {
							return prototype;
						}
					}
					return null;
				},
				diagnosticConsumer,
				ecoreGenFamilyProcessorFactory);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "sql.xmi");
		
		
		Map<EPackage, URI> packageURIMap = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),	
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/"))	
			);
			
		EcoreHtmlAppGenerator eCoreHtmlAppGenerator = new EcoreHtmlAppGenerator(
				SqlPackage.eINSTANCE, 
				packageURIMap, 
				ecoreNodeProcessorFactory);
		
		eCoreHtmlAppGenerator.generateHtmlAppModel(diagnosticConsumer, output, progressMonitor);
				
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		URI pageTeplateURI = URI.createFileURI(new File("page-template.yml").getAbsolutePath());//.appendFragment("/");
		String siteMapDomain = "https://sql.models.nasdanika.org";		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path) && !path.startsWith("images/") && !path.startsWith("libraries/");			
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTeplateURI, // Theme.Cerulean.pageTemplateCdnURI, 
				siteMapDomain, 
				new File("../docs"), 
				new File("target/doc-site-work-dir"), 
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
		
		if (errorCount != 95) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
	}
				
}
