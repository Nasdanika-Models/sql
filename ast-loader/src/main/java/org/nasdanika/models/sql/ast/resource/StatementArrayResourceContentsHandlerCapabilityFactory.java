package org.nasdanika.models.sql.ast.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.ast.loader.SqlPreprocessor;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;

/**
 * Provides an {@link OpenAIClient} instance.  
 */
public class StatementArrayResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler<net.sf.jsqlparser.statement.Statement[]>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type) 
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(org.nasdanika.capability.emf.ResourceContentsHandler.Requirement handlerRequirement) {
		return net.sf.jsqlparser.statement.Statement[].class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "sql".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<net.sf.jsqlparser.statement.Statement[]>>>> createService(
			Class<ResourceContentsHandler<net.sf.jsqlparser.statement.Statement[]>> serviceType, 
			org.nasdanika.capability.emf.ResourceContentsHandler.Requirement serviceRequirement, 
			final Loader loader,
			ProgressMonitor progressMonitor) {
		
		return wrap(new ResourceContentsHandler<net.sf.jsqlparser.statement.Statement[]>() {

			@Override
			public Order getOrder() {
				return Order.of(0);
			}

			@Override
			public net.sf.jsqlparser.statement.Statement[] load(InputStream inputStream, Map<?, ?> options)	throws IOException {
		        StringBuilder builder = new StringBuilder();
		        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                builder.append(line).append('\n');
		            }
		        }
				
		        return SqlPreprocessor.splitAndNormalize(builder.toString())
		        	.stream()
		        	.map(stmt -> {
						try {
							return CCJSqlParserUtil.parse(stmt);
						} catch (JSQLParserException e) {
							serviceRequirement.getResource().getErrors().add(new org.eclipse.emf.ecore.resource.Resource.Diagnostic() {
								
								@Override
								public String getLocation() {
									return null;
								}
								
								@Override
								public String getMessage() {
									return e.getMessage();
								}

								@Override
								public int getLine() {
									return 0;
								}

								@Override
								public int getColumn() {
									return 0;
								}
								
							});
							return null;
						}
					})
		        	.filter(Objects::nonNull)
		        	.toArray(net.sf.jsqlparser.statement.Statement[]::new);
			}
			
		});
	}

}
