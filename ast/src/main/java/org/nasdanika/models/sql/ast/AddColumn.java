package org.nasdanika.models.sql.ast;

public interface AddColumn extends AlterOperation {
    ColumnDefinition getColumn();
    void setColumn(ColumnDefinition value);
}
