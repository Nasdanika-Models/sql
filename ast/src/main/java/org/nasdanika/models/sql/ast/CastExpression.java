package org.nasdanika.models.sql.ast;

public interface CastExpression extends Expression {
    Expression getExpression();
    void setExpression(Expression value);
    String getTargetType();
    void setTargetType(String value);
}
