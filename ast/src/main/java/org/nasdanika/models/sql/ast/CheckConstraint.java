package org.nasdanika.models.sql.ast;

public interface CheckConstraint extends TableConstraint {
    Expression getExpression();
    void setExpression(Expression value);

    String getExpressionText();
    void setExpressionText(String value);
}
