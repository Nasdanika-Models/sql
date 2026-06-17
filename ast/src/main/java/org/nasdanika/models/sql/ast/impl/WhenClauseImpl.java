package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class WhenClauseImpl extends AstNodeImpl implements WhenClause {
    protected Expression condition;
    protected Expression result;

    protected WhenClauseImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getWhenClause();
    }

    @Override
    public Expression getCondition() {
        return condition;
    }

    @Override
    public void setCondition(Expression value) {
        this.condition = value;
    }

    @Override
    public Expression getResult() {
        return result;
    }

    @Override
    public void setResult(Expression value) {
        this.result = value;
    }
}
