package org.nasdanika.models.sql.ast;

public interface TableReference extends FromItem {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);
}
