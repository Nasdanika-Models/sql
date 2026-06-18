package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class InsertImpl extends StatementImpl implements Insert {
    protected String schemaName;
    protected String tableName;
    protected EList<String> columnNames;
    protected EList<Expression> values;
    protected Select select;

    protected InsertImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getInsert();
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
    public org.eclipse.emf.common.util.EList<String> getColumnNames() {
        if (columnNames == null) {
            columnNames = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.INSERT__COLUMN_NAMES);
        }
        return columnNames;
    }

    @Override
    public org.eclipse.emf.common.util.EList<Expression> getValues() {
        if (values == null) {
            values = new EObjectContainmentEList<>(Expression.class, this, SqlAstPackage.INSERT__VALUES);
        }
        return values;
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
