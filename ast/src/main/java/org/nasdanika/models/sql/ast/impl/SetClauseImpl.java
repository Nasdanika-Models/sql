package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SetClauseImpl extends AstNodeImpl implements SetClause {
    protected String columnName;
    protected Expression value;

    protected SetClauseImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSetClause();
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public void setColumnName(String value) {
        this.columnName = value;
    }

    @Override
    public Expression getValue() {
        return value;
    }

    @Override
    public void setValue(Expression value) {
        this.value = value;
    }
}
