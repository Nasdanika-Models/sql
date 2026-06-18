package org.nasdanika.models.sql.ast;

public interface OrderByItem extends AstNode {
    Expression getExpression();
    void setExpression(Expression value);

    SortDirection getDirection();
    void setDirection(SortDirection value);
}
