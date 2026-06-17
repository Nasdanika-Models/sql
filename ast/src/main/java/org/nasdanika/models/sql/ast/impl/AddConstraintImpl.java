package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AddConstraintImpl extends AlterOperationImpl implements AddConstraint {
    protected TableConstraint constraint;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAddConstraint();
    }

    @Override
    public TableConstraint getConstraint() {
        return constraint;
    }

    @Override
    public void setConstraint(TableConstraint value) {
        this.constraint = value;
    }
}
