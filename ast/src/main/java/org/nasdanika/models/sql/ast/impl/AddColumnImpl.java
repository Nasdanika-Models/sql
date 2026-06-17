package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AddColumnImpl extends AlterOperationImpl implements AddColumn {
    protected ColumnDefinition column;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAddColumn();
    }

    @Override
    public ColumnDefinition getColumn() {
        return column;
    }

    @Override
    public void setColumn(ColumnDefinition value) {
        this.column = value;
    }
}
