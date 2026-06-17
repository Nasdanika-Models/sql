package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class ExpressionListImpl extends AstNodeImpl implements ExpressionList {
    protected EList<Expression> expressions;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getExpressionList();
    }

    @Override
    public EList<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new BasicEList<>();
        }
        return expressions;
    }
}
