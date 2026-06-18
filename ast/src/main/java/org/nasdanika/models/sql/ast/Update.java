package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface Update extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getTableName();
    void setTableName(String value);

    EList<SetClause> getSets();

    Expression getWhere();
    void setWhere(Expression value);
}
