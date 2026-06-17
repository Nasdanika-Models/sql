package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface CreateIndex extends Statement {
    String getIndexName();
    void setIndexName(String value);

    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    boolean isUnique();
    void setUnique(boolean value);

    EList<String> getColumnNames();
}
