package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class JoinImpl extends AstNodeImpl implements Join {
    protected JoinType type;
    protected FromItem right;
    protected Expression condition;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getJoin();
    }

    @Override
    public JoinType getType() {
        return type;
    }

    @Override
    public void setType(JoinType value) {
        this.type = value;
    }

    @Override
    public FromItem getRight() {
        return right;
    }

    @Override
    public void setRight(FromItem value) {
        this.right = value;
    }

    @Override
    public Expression getCondition() {
        return condition;
    }

    @Override
    public void setCondition(Expression value) {
        this.condition = value;
    }
}
