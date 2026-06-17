package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SetClauseImpl extends AstNodeImpl implements SetClause {
    protected String column;
    protected Expression expression;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSetClause();
    }

    @Override
    public String getColumn() {
        return column;
    }

    @Override
    public void setColumn(String value) {
        this.column = value;
    }

    @Override
    public Expression getExpression() {
        return expression;
    }

    @Override
    public void setExpression(Expression value) {
        this.expression = value;
    }
}
