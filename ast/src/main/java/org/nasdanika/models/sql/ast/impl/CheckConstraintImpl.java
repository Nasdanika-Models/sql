package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CheckConstraintImpl extends TableConstraintImpl implements CheckConstraint {
    protected Expression expression;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCheckConstraint();
    }

    @Override
    public Expression getExpression() {
        return expression;
    }

    @Override
    public void setExpression(Expression value) {
        this.expression = value;
    }
}
