package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class AlterTableImpl extends StatementImpl implements AlterTable {
    protected String schemaName;
    protected String tableName;
    protected EList<AlterOperation> operations;

    protected AlterTableImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAlterTable();
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
    public org.eclipse.emf.common.util.EList<AlterOperation> getOperations() {
        if (operations == null) {
            operations = new EObjectContainmentEList<>(AlterOperation.class, this, SqlAstPackage.ALTER_TABLE__OPERATIONS);
        }
        return operations;
    }
}
