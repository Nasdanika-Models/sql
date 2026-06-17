package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SubSelectExpressionImpl extends ExpressionImpl implements SubSelectExpression {
    protected Select select;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSubSelectExpression();
    }

    @Override
    public Select getSelect() {
        return select;
    }

    @Override
    public void setSelect(Select value) {
        this.select = value;
    }
}
