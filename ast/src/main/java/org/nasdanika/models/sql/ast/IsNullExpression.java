package org.nasdanika.models.sql.ast;

public interface IsNullExpression extends Expression {
    Expression getExpression();
    void setExpression(Expression value);
    boolean isNot();
    void setNot(boolean value);
}
