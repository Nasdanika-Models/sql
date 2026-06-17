package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class OrderByElementImpl extends AstNodeImpl implements OrderByElement {
    protected Expression expression;
    protected boolean ascending;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getOrderByElement();
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
    public boolean isAscending() {
        return ascending;
    }

    @Override
    public void setAscending(boolean value) {
        this.ascending = value;
    }
}
