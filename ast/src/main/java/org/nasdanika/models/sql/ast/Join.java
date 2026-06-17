package org.nasdanika.models.sql.ast;

public interface Join extends AstNode {
    JoinType getType();
    void setType(JoinType value);

    FromItem getRightItem();
    void setRightItem(FromItem value);

    Expression getOnCondition();
    void setOnCondition(Expression value);
}
