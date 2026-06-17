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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;
import org.nasdanika.models.sql.ast.loader.JSqlParserLoader;

/**
 * EMF Resource for .sql files.
 */
public class SqlAstResource extends ResourceImpl {

    public SqlAstResource(URI uri) {
        super(uri);
    }

    @Override
    protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
            }
        }

        JSqlParserLoader loader = new JSqlParserLoader();
        String sourceUri = getURI() == null ? null : getURI().toString();
        SqlScript script = loader.load(builder.toString(), sourceUri, null);

        getContents().clear();
        getContents().add(script);
    }

    @Override
    protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8))) {
            for (EObject content : getContents()) {
                if (content instanceof SqlScript script) {
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
    }
}
