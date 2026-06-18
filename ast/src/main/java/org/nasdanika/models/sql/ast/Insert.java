package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface Insert extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    EList<String> getColumnNames();

    EList<Expression> getValues();

    Select getSelect();
    void setSelect(Select value);
}
