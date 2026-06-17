package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public abstract class ExpressionImpl extends AstNodeImpl implements Expression {
    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getExpression();
    }
}
