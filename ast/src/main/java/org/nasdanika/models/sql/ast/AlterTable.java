package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface AlterTable extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    EList<AlterOperation> getOperations();
}
