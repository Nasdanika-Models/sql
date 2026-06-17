package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class JoinImpl extends AstNodeImpl implements Join {
    protected JoinType type;
    protected FromItem rightItem;
    protected Expression onCondition;

    protected JoinImpl() {
        super();
    }

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
    public FromItem getRightItem() {
        return rightItem;
    }

    @Override
    public void setRightItem(FromItem value) {
        this.rightItem = value;
    }

    @Override
    public Expression getOnCondition() {
        return onCondition;
    }

    @Override
    public void setOnCondition(Expression value) {
        this.onCondition = value;
    }
}
