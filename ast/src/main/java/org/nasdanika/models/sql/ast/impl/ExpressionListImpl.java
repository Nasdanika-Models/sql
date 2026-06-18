package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class ExpressionListImpl extends ExpressionImpl implements ExpressionList {
    protected EList<Expression> expressions;

    protected ExpressionListImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getExpressionList();
    }

    @Override
    public org.eclipse.emf.common.util.EList<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new EObjectContainmentEList<>(Expression.class, this, SqlAstPackage.EXPRESSION_LIST__EXPRESSIONS);
        }
        return expressions;
    }
}
