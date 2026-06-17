package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface CreateTable extends Statement {
    String getName();
    void setName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    boolean isIfNotExists();
    void setIfNotExists(boolean value);
    EList<ColumnDefinition> getColumns();
    EList<TableConstraint> getConstraints();
}
