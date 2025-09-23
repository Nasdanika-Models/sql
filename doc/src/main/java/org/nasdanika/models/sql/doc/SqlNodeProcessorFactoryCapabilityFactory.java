package org.nasdanika.models.sql.doc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.app.graph.emf.HtmlAppGenerator.NodeProcessorFactoryRequirement;

import reactor.core.publisher.Flux;

public class SqlNodeProcessorFactoryCapabilityFactory implements CapabilityFactory<NodeProcessorFactoryRequirement, Object> {

	@Override
	public boolean canHandle(Object requirement) {
		return requirement instanceof NodeProcessorFactoryRequirement;
	}

	@Override
	public CompletionStage<Iterable<CapabilityProvider<Object>>> create(
			NodeProcessorFactoryRequirement requirement,
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		Requirement<Object, DocumentationFactory> docFactoriesRequirement = ServiceCapabilityFactory.createRequirement(DocumentationFactory.class, null, new DocumentationFactory.Requirement(true));
		CompletionStage<Iterable<CapabilityProvider<DocumentationFactory>>> cpi = loader.load(docFactoriesRequirement, progressMonitor);
		
		return cpi.thenApply(dfcps -> createFactory(dfcps, requirement));
	}
	
	private Iterable<CapabilityProvider<Object>> createFactory(
			Iterable<CapabilityProvider<DocumentationFactory>> dfcps,
			NodeProcessorFactoryRequirement requirement) {
		
		Collection<DocumentationFactory> documentationFactories = new ArrayList<>();
		for (CapabilityProvider<DocumentationFactory> cp: dfcps) {				
			cp.getPublisher().subscribe(df -> documentationFactories.add(df));
		}				

		SqlNodeProcessorFactory factory = new SqlNodeProcessorFactory(
				requirement.context(), 
				requirement.prototypeProvider(),
				documentationFactories);
		
		if (requirement.factoryPredicate() == null || requirement.factoryPredicate().test(factory)) {
			CapabilityProvider<Object> capabilityProvider = new CapabilityProvider<Object>() {
				
				@Override
				public Flux<Object> getPublisher() {
					return Flux.just(factory);
				}
				
			};			
			
			return Collections.singleton(capabilityProvider);
		}
		return Collections.emptyList();		
	}

}