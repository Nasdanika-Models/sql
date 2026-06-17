package org.nasdanika.models.sql.ast;

public interface BinaryExpression extends Expression {
    Expression getLeft();
    void setLeft(Expression value);
    String getOperator();
    void setOperator(String value);
    Expression getRight();
    void setRight(Expression value);
}
