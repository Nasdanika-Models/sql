package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression {
    protected Expression operand;
    protected String operator;
    protected boolean prefix;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getUnaryExpression();
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
    public String getOperator() {
        return operator;
    }

    @Override
    public void setOperator(String value) {
        this.operator = value;
    }

    @Override
    public boolean isPrefix() {
        return prefix;
    }

    @Override
    public void setPrefix(boolean value) {
        this.prefix = value;
    }
}
