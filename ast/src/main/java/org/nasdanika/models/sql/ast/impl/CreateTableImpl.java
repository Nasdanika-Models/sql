package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CreateTableImpl extends StatementImpl implements CreateTable {
    protected String name;
    protected String schemaName;
    protected boolean ifNotExists;
    protected EList<ColumnDefinition> columns;
    protected EList<TableConstraint> constraints;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateTable();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String value) {
        this.name = value;
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
    public boolean isIfNotExists() {
        return ifNotExists;
    }

    @Override
    public void setIfNotExists(boolean value) {
        this.ifNotExists = value;
    }

    @Override
    public EList<ColumnDefinition> getColumns() {
        if (columns == null) {
            columns = new BasicEList<>();
        }
        return columns;
    }

    @Override
    public EList<TableConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new BasicEList<>();
        }
        return constraints;
    }
}
