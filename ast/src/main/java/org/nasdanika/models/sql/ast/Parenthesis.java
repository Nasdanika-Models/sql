package org.nasdanika.models.sql.ast;

public interface Parenthesis extends Expression {
    Expression getExpression();
    void setExpression(Expression value);
}
