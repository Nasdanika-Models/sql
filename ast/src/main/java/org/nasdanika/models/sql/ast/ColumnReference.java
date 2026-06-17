package org.nasdanika.models.sql.ast;

public interface ColumnReference extends Expression {
    String getName();
    void setName(String value);
    String getTableName();
    void setTableName(String value);
    String getSchemaName();
    void setSchemaName(String value);
}
