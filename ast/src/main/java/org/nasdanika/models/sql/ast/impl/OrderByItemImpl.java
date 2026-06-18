package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class OrderByItemImpl extends AstNodeImpl implements OrderByItem {
    protected Expression expression;
    protected SortDirection direction;

    protected OrderByItemImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getOrderByItem();
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
    public SortDirection getDirection() {
        return direction;
    }

    @Override
    public void setDirection(SortDirection value) {
        this.direction = value;
    }
}
