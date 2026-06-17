package org.nasdanika.models.sql.ast;

public interface GroupByElement extends AstNode {
    Expression getExpression();
    void setExpression(Expression value);
}
