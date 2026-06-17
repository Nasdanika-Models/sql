package org.nasdanika.models.sql.ast;

public interface WhenClause extends AstNode {
    Expression getCondition();
    void setCondition(Expression value);
    Expression getResult();
    void setResult(Expression value);
}
