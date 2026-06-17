package org.nasdanika.models.sql.ast;

public interface Delete extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    Expression getWhere();
    void setWhere(Expression value);
}
