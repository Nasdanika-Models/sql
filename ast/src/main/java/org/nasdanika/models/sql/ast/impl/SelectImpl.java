package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class SelectImpl extends StatementImpl implements Select {
    protected boolean distinct;
    protected EList<SelectItem> selectItems;
    protected EList<FromItem> fromItems;
    protected EList<Join> joins;
    protected Expression where;
    protected EList<Expression> groupBy;
    protected Expression having;
    protected EList<OrderByItem> orderBy;

    protected SelectImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSelect();
    }

    @Override
    public boolean isDistinct() {
        return distinct;
    }

    @Override
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<SelectItem> getSelectItems() {
        if (selectItems == null) {
            selectItems = new EObjectContainmentEList<>(SelectItem.class, this, SqlAstPackage.SELECT__SELECT_ITEMS);
        }
        return selectItems;
    }

    @Override
    public org.eclipse.emf.common.util.EList<FromItem> getFromItems() {
        if (fromItems == null) {
            fromItems = new EObjectContainmentEList<>(FromItem.class, this, SqlAstPackage.SELECT__FROM_ITEMS);
        }
        return fromItems;
    }

    @Override
    public org.eclipse.emf.common.util.EList<Join> getJoins() {
        if (joins == null) {
            joins = new EObjectContainmentEList<>(Join.class, this, SqlAstPackage.SELECT__JOINS);
        }
        return joins;
    }

    @Override
    public Expression getWhere() {
        return where;
    }

    @Override
    public void setWhere(Expression value) {
        this.where = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<Expression> getGroupBy() {
        if (groupBy == null) {
            groupBy = new EObjectContainmentEList<>(Expression.class, this, SqlAstPackage.SELECT__GROUP_BY);
        }
        return groupBy;
    }

    @Override
    public Expression getHaving() {
        return having;
    }

    @Override
    public void setHaving(Expression value) {
        this.having = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<OrderByItem> getOrderBy() {
        if (orderBy == null) {
            orderBy = new EObjectContainmentEList<>(OrderByItem.class, this, SqlAstPackage.SELECT__ORDER_BY);
        }
        return orderBy;
    }
}
