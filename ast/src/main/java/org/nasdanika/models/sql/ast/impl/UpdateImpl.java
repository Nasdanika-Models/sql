package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class UpdateImpl extends StatementImpl implements Update {
    protected String schemaName;
    protected String tableName;
    protected EList<SetClause> sets;
    protected Expression where;

    protected UpdateImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getUpdate();
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
    public String getTableName() {
        return tableName;
    }

    @Override
    public void setTableName(String value) {
        this.tableName = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<SetClause> getSets() {
        if (sets == null) {
            sets = new EObjectContainmentEList<>(SetClause.class, this, SqlAstPackage.UPDATE__SETS);
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
