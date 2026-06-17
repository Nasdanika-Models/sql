package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class UpdateImpl extends StatementImpl implements Update {
    protected String tableName;
    protected String schemaName;
    protected EList<SetClause> sets;
    protected Expression where;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getUpdate();
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
    public EList<SetClause> getSets() {
        if (sets == null) {
            sets = new BasicEList<>();
        }
        return sets;
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
