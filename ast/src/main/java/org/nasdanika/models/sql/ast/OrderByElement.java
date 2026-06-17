package org.nasdanika.models.sql.ast;

public interface OrderByElement extends AstNode {
    Expression getExpression();
    void setExpression(Expression value);
    boolean isAscending();
    void setAscending(boolean value);
}
