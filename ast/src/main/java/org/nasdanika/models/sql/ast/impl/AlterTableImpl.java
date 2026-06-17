package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AlterTableImpl extends StatementImpl implements AlterTable {
    protected String name;
    protected String schemaName;
    protected EList<AlterOperation> operations;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAlterTable();
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
    public EList<AlterOperation> getOperations() {
        if (operations == null) {
            operations = new BasicEList<>();
        }
        return operations;
    }
}
