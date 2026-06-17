package org.nasdanika.models.sql.ast;

public interface TableReference extends FromItem {
    String getName();
    void setName(String value);
    String getSchemaName();
    void setSchemaName(String value);
}
