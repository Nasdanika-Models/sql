package org.nasdanika.models.sql.ast;

public interface DropView extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getViewName();
    void setViewName(String value);

    boolean isIfExists();
    void setIfExists(boolean value);
}
