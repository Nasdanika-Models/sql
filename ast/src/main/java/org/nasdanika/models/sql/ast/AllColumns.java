package org.nasdanika.models.sql.ast;

public interface AllColumns extends Expression {
    String getTableName();
    void setTableName(String value);
}
