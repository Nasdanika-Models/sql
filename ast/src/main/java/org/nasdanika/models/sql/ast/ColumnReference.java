package org.nasdanika.models.sql.ast;

public interface ColumnReference extends Expression {
    String getTableName();
    void setTableName(String value);

    String getSchemaName();
    void setSchemaName(String value);

    String getColumnName();
    void setColumnName(String value);
}
