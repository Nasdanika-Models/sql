package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.nasdanika.models.sql.ast.*;

public class UniqueConstraintImpl extends TableConstraintImpl implements UniqueConstraint {
    protected EList<String> columnNames;

    protected UniqueConstraintImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getUniqueConstraint();
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getColumnNames() {
        if (columnNames == null) {
            columnNames = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.UNIQUE_CONSTRAINT__COLUMN_NAMES);
        }
        return columnNames;
    }
}
