package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
    protected Expression left;
    protected String operator;
    protected Expression right;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getBinaryExpression();
    }

    @Override
    public Expression getLeft() {
        return left;
    }

    @Override
    public void setLeft(Expression value) {
        this.left = value;
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
    public Expression getRight() {
        return right;
    }

    @Override
    public void setRight(Expression value) {
        this.right = value;
    }
}
