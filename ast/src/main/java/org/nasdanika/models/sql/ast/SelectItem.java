package org.nasdanika.models.sql.ast;

public interface SelectItem extends AstNode {
    Expression getExpression();
    void setExpression(Expression value);

    String getAlias();
    void setAlias(String value);

    boolean isAllColumns();
    void setAllColumns(boolean value);

    String getTableAlias();
    void setTableAlias(String value);
}
