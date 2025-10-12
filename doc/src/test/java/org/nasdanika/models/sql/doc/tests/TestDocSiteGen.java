package org.nasdanika.models.sql.doc.tests;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;
import org.nasdanika.models.sql.Database;

public class TestDocSiteGen {
		
	@Test
	public void testGenerateDatabaseDocSite() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		Resource resource = resourceSet.getResource(URI.createFileURI("test-metadata.xml"), true);
		Database database = (Database) resource.getContents().get(0);
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
				Collections.singleton(database), 
				context,
				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
				null, // Predicate<Object> factoryPredicate,
				null, // Predicate<EPackage> ePackagePredicate,
				diagnosticConsumer,
				progressMonitor);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "sql-actions.xmi");
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "sql-actions.yml";
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
				new File("target/sample-database-docs"),  
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
		
		if (errorCount != 90) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}				
	}
	
}
