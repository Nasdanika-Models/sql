package org.nasdanika.models.sql.ast;

public interface Join extends AstNode {
    JoinType getType();
    void setType(JoinType value);
    FromItem getRight();
    void setRight(FromItem value);
    Expression getCondition();
    void setCondition(Expression value);
}
