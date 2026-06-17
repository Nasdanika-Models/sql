package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * Root of the SQL source AST. Contains an ordered list of statements.
 */
public interface SqlScript extends EObject {
    String getSourceUri();
    void setSourceUri(String value);
    String getDialect();
    void setDialect(String value);
    EList<Statement> getStatements();
}
