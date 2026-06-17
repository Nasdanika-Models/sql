package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface Select extends Statement {
    boolean isDistinct();
    void setDistinct(boolean value);
    EList<SelectItem> getSelectItems();
    EList<FromItem> getFromItems();
    EList<Join> getJoins();
    Expression getWhere();
    void setWhere(Expression value);
    EList<GroupByElement> getGroupByElements();
    Expression getHaving();
    void setHaving(Expression value);
    EList<OrderByElement> getOrderByElements();
    Expression getLimit();
    void setLimit(Expression value);
    Expression getOffset();
    void setOffset(Expression value);
}
