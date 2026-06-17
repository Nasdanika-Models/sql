package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression {
    protected Expression switchExpression;
    protected EList<WhenClause> whenClauses;
    protected Expression elseExpression;

    protected CaseExpressionImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCaseExpression();
    }

    @Override
    public Expression getSwitchExpression() {
        return switchExpression;
    }

    @Override
    public void setSwitchExpression(Expression value) {
        this.switchExpression = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<WhenClause> getWhenClauses() {
        if (whenClauses == null) {
            whenClauses = new EObjectContainmentEList<>(WhenClause.class, this, SqlAstPackage.CASE_EXPRESSION__WHEN_CLAUSES);
        }
        return whenClauses;
    }

    @Override
    public Expression getElseExpression() {
        return elseExpression;
    }

    @Override
    public void setElseExpression(Expression value) {
        this.elseExpression = value;
    }
}
