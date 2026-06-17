package org.nasdanika.models.sql.ast;

public interface SelectItem extends AstNode {
    Expression getExpression();
    void setExpression(Expression value);
    String getAlias();
    void setAlias(String value);
}
