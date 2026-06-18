package org.nasdanika.models.sql.ast;

public interface DropIndex extends Statement {
    String getIndexName();
    void setIndexName(String value);

    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);
}
