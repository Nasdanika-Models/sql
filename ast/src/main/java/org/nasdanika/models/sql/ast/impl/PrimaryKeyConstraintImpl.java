package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class PrimaryKeyConstraintImpl extends TableConstraintImpl implements PrimaryKeyConstraint {
    protected EList<String> columns;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getPrimaryKeyConstraint();
    }

    @Override
    public EList<String> getColumns() {
        if (columns == null) {
            columns = new BasicEList<>();
        }
        return columns;
    }
}
