package org.nasdanika.models.sql.ast;

public interface DropIndex extends Statement {
    String getName();
    void setName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    boolean isIfExists();
    void setIfExists(boolean value);
}
