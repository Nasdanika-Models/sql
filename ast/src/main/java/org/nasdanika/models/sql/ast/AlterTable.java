package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface AlterTable extends Statement {
    String getName();
    void setName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    EList<AlterOperation> getOperations();
}
