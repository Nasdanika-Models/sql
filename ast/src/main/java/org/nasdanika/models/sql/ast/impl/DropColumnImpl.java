package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DropColumnImpl extends AlterOperationImpl implements DropColumn {
    protected String columnName;
    protected boolean ifExists;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDropColumn();
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public void setColumnName(String value) {
        this.columnName = value;
    }

    @Override
    public boolean isIfExists() {
        return ifExists;
    }

    @Override
    public void setIfExists(boolean value) {
        this.ifExists = value;
    }
}
