package org.nasdanika.models.sql.ast;

public interface BetweenExpression extends Expression {
    Expression getLeft();
    void setLeft(Expression value);
    Expression getStart();
    void setStart(Expression value);
    Expression getEnd();
    void setEnd(Expression value);
    boolean isNot();
    void setNot(boolean value);
}
