package org.nasdanika.models.sql.ast;

/**
 * Abstract base for all SQL statements.
 */
public interface Statement extends AstNode {
    String getLeadingComment();
    void setLeadingComment(String value);
}
