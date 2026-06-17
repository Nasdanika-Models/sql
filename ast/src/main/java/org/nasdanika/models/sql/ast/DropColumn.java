package org.nasdanika.models.sql.ast;

public interface DropColumn extends AlterOperation {
    String getColumnName();
    void setColumnName(String value);
}
