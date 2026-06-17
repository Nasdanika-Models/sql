package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface InExpression extends Expression {
    Expression getLeft();
    void setLeft(Expression value);
    EList<Expression> getValues();
    boolean isNot();
    void setNot(boolean value);
}
