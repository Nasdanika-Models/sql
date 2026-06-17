package org.nasdanika.models.sql.ast;

public interface DropTable extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    boolean isIfExists();
    void setIfExists(boolean value);
}
