package org.nasdanika.models.sql.ast.loader;

import org.nasdanika.models.sql.ast.SqlScript;

/**
 * Parser-neutral interface for loading SQL source text into the AST model.
 * Implementations are parser-specific (e.g., JSqlParser, Calcite).
 */
public interface SqlSourceLoader {

    /**
     * Parse SQL source text into an AST model.
     * @param sql the SQL source text
     * @param sourceUri optional source URI for traceability
     * @param dialect optional dialect hint (e.g., "tsql", "mysql", "postgresql")
     * @return the parsed SQL script model
     */
    SqlScript load(String sql, String sourceUri, String dialect);
}
