package org.nasdanika.models.sql.ast.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.capability.emf.ResourceEObjectContentsHandler;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;
import org.nasdanika.models.sql.ast.loader.JSqlParserLoader;


public class SqlScriptResourceContentsHandler implements ResourceEObjectContentsHandler<SqlScript> {
	
	private URI uri;

	public SqlScriptResourceContentsHandler(URI uri) {
		this.uri = uri;
	}

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public SqlScript load(InputStream inputStream, Map<?, ?> options) throws IOException {
	       StringBuilder builder = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                builder.append(line).append('\n');
	            }
	        }

	        JSqlParserLoader loader = new JSqlParserLoader();
	        String sourceUri = uri == null ? null : uri.toString();
	        return loader.load(builder.toString(), sourceUri, null);
	}	
	
	@Override
	public void save(SqlScript script, OutputStream outputStream, Map<?, ?> options) throws IOException {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8))) {
            for (Statement statement : script.getStatements()) {
                String rawSql = statement.getRawSql();
                if (rawSql != null && !rawSql.isBlank()) {
                    writer.println(rawSql.endsWith(";") ? rawSql : rawSql + ";");
                    writer.println();
                }
            }
        }
	}

}
