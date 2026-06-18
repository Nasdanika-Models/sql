package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface SqlScript extends AstNode {
    String getSourceUri();
    void setSourceUri(String value);

    String getDialect();
    void setDialect(String value);

    EList<Statement> getStatements();

    EList<String> getLeadingComments();
}
