package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression {
    protected Expression operand;
    protected EList<WhenClause> whenClauses;
    protected Expression elseExpression;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCaseExpression();
    }

    @Override
    public Expression getOperand() {
        return operand;
    }

    @Override
    public void setOperand(Expression value) {
        this.operand = value;
    }

    @Override
    public EList<WhenClause> getWhenClauses() {
        if (whenClauses == null) {
            whenClauses = new BasicEList<>();
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
