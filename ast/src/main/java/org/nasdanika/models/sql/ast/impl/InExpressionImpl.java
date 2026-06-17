package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class InExpressionImpl extends ExpressionImpl implements InExpression {
    protected Expression left;
    protected EList<Expression> values;
    protected boolean not;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getInExpression();
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
    public EList<Expression> getValues() {
        if (values == null) {
            values = new BasicEList<>();
        }
        return values;
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
