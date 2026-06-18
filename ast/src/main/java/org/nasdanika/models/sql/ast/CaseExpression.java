package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface CaseExpression extends Expression {
    Expression getSwitchExpression();
    void setSwitchExpression(Expression value);

    EList<WhenClause> getWhenClauses();

    Expression getElseExpression();
    void setElseExpression(Expression value);
}
