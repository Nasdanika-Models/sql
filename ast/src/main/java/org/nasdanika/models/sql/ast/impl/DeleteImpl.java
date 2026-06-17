package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DeleteImpl extends StatementImpl implements Delete {
    protected String tableName;
    protected String schemaName;
    protected Expression where;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDelete();
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public void setTableName(String value) {
        this.tableName = value;
    }

    @Override
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    @Override
    public Expression getWhere() {
        return where;
    }

    @Override
    public void setWhere(Expression value) {
        this.where = value;
    }
}
