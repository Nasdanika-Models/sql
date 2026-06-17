package org.nasdanika.models.sql.ast.loader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * T-SQL preprocessor: splits GO batches and normalizes bracketed identifiers.
 */
public class SqlPreprocessor {

    private static final Pattern GO_PATTERN = Pattern.compile("^\\s*GO\\s*$", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    private static final Pattern BRACKET_PATTERN = Pattern.compile("\\[([^\\]]+)\\]");

    public static List<String> splitAndNormalize(String input) {
        if (input == null || input.isBlank()) {
            return Collections.emptyList();
        }

        String[] batches = GO_PATTERN.split(input);
        List<String> statements = new ArrayList<>();
        for (String batch : batches) {
            String normalized = normalizeBrackets(batch.trim());
            if (!normalized.isEmpty()) {
                splitStatements(normalized, statements);
            }
        }

        return statements;
    }

    static String normalizeBrackets(String sql) {
        return BRACKET_PATTERN.matcher(sql).replaceAll("\"$1\"");
    }

    private static void splitStatements(String batch, List<String> result) {
        StringBuilder current = new StringBuilder();
        boolean inSingleQuote = false;
        boolean inDoubleQuote = false;

        for (int i = 0; i < batch.length(); i++) {
            char c = batch.charAt(i);
            if (c == '\'' && !inDoubleQuote) {
                current.append(c);
                if (inSingleQuote && i + 1 < batch.length() && batch.charAt(i + 1) == '\'') {
                    current.append(batch.charAt(++i));
                } else {
                    inSingleQuote = !inSingleQuote;
                }
            } else if (c == '"' && !inSingleQuote) {
                current.append(c);
                if (inDoubleQuote && i + 1 < batch.length() && batch.charAt(i + 1) == '"') {
                    current.append(batch.charAt(++i));
                } else {
                    inDoubleQuote = !inDoubleQuote;
                }
            } else if (c == ';' && !inSingleQuote && !inDoubleQuote) {
                String stmt = current.toString().trim();
                if (!stmt.isEmpty()) {
                    result.add(stmt);
                }
                current.setLength(0);
            } else {
                current.append(c);
            }
        }

        String last = current.toString().trim();
        if (!last.isEmpty()) {
            result.add(last);
        }
    }
}
