package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface CaseExpression extends Expression {
    Expression getOperand();
    void setOperand(Expression value);
    EList<WhenClause> getWhenClauses();
    Expression getElseExpression();
    void setElseExpression(Expression value);
}
