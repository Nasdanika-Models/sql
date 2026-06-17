package org.nasdanika.models.sql.ast;

public interface SetClause extends AstNode {
    String getColumn();
    void setColumn(String value);
    Expression getExpression();
    void setExpression(Expression value);
}
