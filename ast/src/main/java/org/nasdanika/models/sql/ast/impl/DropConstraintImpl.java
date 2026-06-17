package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DropConstraintImpl extends AlterOperationImpl implements DropConstraint {
    protected String constraintName;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDropConstraint();
    }

    @Override
    public String getConstraintName() {
        return constraintName;
    }

    @Override
    public void setConstraintName(String value) {
        this.constraintName = value;
    }
}
