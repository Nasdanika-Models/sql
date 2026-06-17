package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface Insert extends Statement {
    String getTableName();
    void setTableName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    EList<String> getColumns();
    EList<ExpressionList> getValuesList();
    Select getSelect();
    void setSelect(Select value);
}
