package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class IsNullExpressionImpl extends ExpressionImpl implements IsNullExpression {
    protected Expression expression;
    protected boolean not;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getIsNullExpression();
    }

    @Override
    public Expression getExpression() {
        return expression;
    }

    @Override
    public void setExpression(Expression value) {
        this.expression = value;
    }

    @Override
    public boolean isNot() {
        return not;
    }

    @Override
    public void setNot(boolean value) {
        this.not = value;
    }
}
