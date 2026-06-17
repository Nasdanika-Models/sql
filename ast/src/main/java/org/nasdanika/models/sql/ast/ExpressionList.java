package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface ExpressionList extends AstNode {
    EList<Expression> getExpressions();
}
