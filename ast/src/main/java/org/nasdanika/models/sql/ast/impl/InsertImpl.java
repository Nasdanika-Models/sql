package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class InsertImpl extends StatementImpl implements Insert {
    protected String tableName;
    protected String schemaName;
    protected EList<String> columns;
    protected EList<ExpressionList> valuesList;
    protected Select select;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getInsert();
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
    public EList<String> getColumns() {
        if (columns == null) {
            columns = new BasicEList<>();
        }
        return columns;
    }

    @Override
    public EList<ExpressionList> getValuesList() {
        if (valuesList == null) {
            valuesList = new BasicEList<>();
        }
        return valuesList;
    }

    @Override
    public Select getSelect() {
        return select;
    }

    @Override
    public void setSelect(Select value) {
        this.select = value;
    }
}
