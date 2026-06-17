package org.nasdanika.models.sql.ast;

public interface SetClause extends AstNode {
    String getColumnName();
    void setColumnName(String value);

    Expression getValue();
    void setValue(Expression value);
}
