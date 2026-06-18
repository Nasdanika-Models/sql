package org.nasdanika.models.sql.ast;

public interface UnaryExpression extends Expression {
    Expression getOperand();
    void setOperand(Expression value);

    String getOperator();
    void setOperator(String value);

    boolean isPrefix();
    void setPrefix(boolean value);
}
