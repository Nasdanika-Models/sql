package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class BetweenExpressionImpl extends ExpressionImpl implements BetweenExpression {
    protected Expression left;
    protected Expression start;
    protected Expression end;
    protected boolean not;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getBetweenExpression();
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
    public Expression getStart() {
        return start;
    }

    @Override
    public void setStart(Expression value) {
        this.start = value;
    }

    @Override
    public Expression getEnd() {
        return end;
    }

    @Override
    public void setEnd(Expression value) {
        this.end = value;
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
