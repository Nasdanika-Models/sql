package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CastExpressionImpl extends ExpressionImpl implements CastExpression {
    protected Expression expression;
    protected String targetType;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCastExpression();
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
    public String getTargetType() {
        return targetType;
    }

    @Override
    public void setTargetType(String value) {
        this.targetType = value;
    }
}
