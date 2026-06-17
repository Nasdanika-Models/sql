package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface Update extends Statement {
    String getTableName();
    void setTableName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    EList<SetClause> getSets();
    Expression getWhere();
    void setWhere(Expression value);
}
