package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SelectItemImpl extends AstNodeImpl implements SelectItem {
    protected Expression expression;
    protected String alias;
    protected boolean allColumns;
    protected String tableAlias;

    protected SelectItemImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSelectItem();
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
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String value) {
        this.alias = value;
    }

    @Override
    public boolean isAllColumns() {
        return allColumns;
    }

    @Override
    public void setAllColumns(boolean value) {
        this.allColumns = value;
    }

    @Override
    public String getTableAlias() {
        return tableAlias;
    }

    @Override
    public void setTableAlias(String value) {
        this.tableAlias = value;
    }
}
