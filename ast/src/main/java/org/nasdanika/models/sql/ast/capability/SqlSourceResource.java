package org.nasdanika.models.sql.ast.capability;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.loader.JSqlParserLoader;
import org.nasdanika.models.sql.ast.loader.SqlSourceLoader;
import org.nasdanika.models.sql.ast.loader.SqlSourceSerializer;

/**
 * EMF Resource that loads .sql files into the SQL AST model.
 * <p>
 * {@code load()} parses SQL text using the configured loader (JSqlParser by default)
 * and populates the resource contents with the AST model.
 * <p>
 * {@code save()} serializes the model back to SQL. Phase 1 normalizes formatting
 * rather than achieving byte-exact round-trip.
 */
public class SqlSourceResource extends ResourceImpl {

    private SqlSourceLoader loader;
    private SqlSourceSerializer serializer;

    public SqlSourceResource(URI uri) {
        super(uri);
        this.loader = new JSqlParserLoader();
        this.serializer = new SqlSourceSerializer();
    }

    public SqlSourceResource(URI uri, SqlSourceLoader loader) {
        super(uri);
        this.loader = loader;
        this.serializer = new SqlSourceSerializer();
    }

    @Override
    protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
        // Read the full SQL text
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }
        String sql = baos.toString(StandardCharsets.UTF_8);

        // Determine dialect from options or URI
        String dialect = null;
        if (options != null && options.containsKey("dialect")) {
            dialect = String.valueOf(options.get("dialect"));
        }

        // Parse
        String sourceUri = getURI() != null ? getURI().toString() : null;
        SqlScript script = loader.load(sql, sourceUri, dialect);

        getContents().clear();
        getContents().add(script);
    }

    @Override
    protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
        try (Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
            for (EObject content : getContents()) {
                if (content instanceof SqlScript script) {
                    writer.write(serializer.serialize(script));
                }
            }
        }
    }
}
