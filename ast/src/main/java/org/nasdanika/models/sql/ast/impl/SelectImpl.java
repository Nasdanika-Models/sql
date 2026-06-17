package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SelectImpl extends StatementImpl implements Select {
    protected boolean distinct;
    protected EList<SelectItem> selectItems;
    protected EList<FromItem> fromItems;
    protected EList<Join> joins;
    protected Expression where;
    protected EList<GroupByElement> groupByElements;
    protected Expression having;
    protected EList<OrderByElement> orderByElements;
    protected Expression limit;
    protected Expression offset;

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
    public EList<SelectItem> getSelectItems() {
        if (selectItems == null) {
            selectItems = new BasicEList<>();
        }
        return selectItems;
    }

    @Override
    public EList<FromItem> getFromItems() {
        if (fromItems == null) {
            fromItems = new BasicEList<>();
        }
        return fromItems;
    }

    @Override
    public EList<Join> getJoins() {
        if (joins == null) {
            joins = new BasicEList<>();
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
    public EList<GroupByElement> getGroupByElements() {
        if (groupByElements == null) {
            groupByElements = new BasicEList<>();
        }
        return groupByElements;
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
    public EList<OrderByElement> getOrderByElements() {
        if (orderByElements == null) {
            orderByElements = new BasicEList<>();
        }
        return orderByElements;
    }

    @Override
    public Expression getLimit() {
        return limit;
    }

    @Override
    public void setLimit(Expression value) {
        this.limit = value;
    }

    @Override
    public Expression getOffset() {
        return offset;
    }

    @Override
    public void setOffset(Expression value) {
        this.offset = value;
    }
}
