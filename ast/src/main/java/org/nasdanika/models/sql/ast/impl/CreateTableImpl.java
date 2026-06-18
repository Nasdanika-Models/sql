package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class CreateTableImpl extends StatementImpl implements CreateTable {
    protected String schemaName;
    protected String tableName;
    protected boolean ifNotExists;
    protected EList<ColumnDefinition> columns;
    protected EList<TableConstraint> constraints;

    protected CreateTableImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateTable();
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
    public boolean isIfNotExists() {
        return ifNotExists;
    }

    @Override
    public void setIfNotExists(boolean value) {
        this.ifNotExists = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<ColumnDefinition> getColumns() {
        if (columns == null) {
            columns = new EObjectContainmentEList<>(ColumnDefinition.class, this, SqlAstPackage.CREATE_TABLE__COLUMNS);
        }
        return columns;
    }

    @Override
    public org.eclipse.emf.common.util.EList<TableConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<>(TableConstraint.class, this, SqlAstPackage.CREATE_TABLE__CONSTRAINTS);
        }
        return constraints;
    }
}
