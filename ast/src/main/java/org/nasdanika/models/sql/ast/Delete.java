package org.nasdanika.models.sql.ast;

public interface Delete extends Statement {
    String getTableName();
    void setTableName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    Expression getWhere();
    void setWhere(Expression value);
}
