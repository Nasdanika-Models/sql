package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface FunctionCall extends Expression {
    String getName();
    void setName(String value);
    EList<Expression> getArguments();
    boolean isDistinct();
    void setDistinct(boolean value);
}
