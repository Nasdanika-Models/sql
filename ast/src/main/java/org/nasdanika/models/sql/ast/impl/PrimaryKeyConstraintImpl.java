package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.nasdanika.models.sql.ast.*;

public class PrimaryKeyConstraintImpl extends TableConstraintImpl implements PrimaryKeyConstraint {
    protected EList<String> columnNames;

    protected PrimaryKeyConstraintImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getPrimaryKeyConstraint();
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getColumnNames() {
        if (columnNames == null) {
            columnNames = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_NAMES);
        }
        return columnNames;
    }
}
