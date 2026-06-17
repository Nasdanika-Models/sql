package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AllColumnsImpl extends ExpressionImpl implements AllColumns {
    protected String tableName;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAllColumns();
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public void setTableName(String value) {
        this.tableName = value;
    }
}
