package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface ColumnDefinition extends AstNode {
    String getName();
    void setName(String value);

    String getDataType();
    void setDataType(String value);

    Boolean getNullable();
    void setNullable(Boolean value);

    String getDefaultValue();
    void setDefaultValue(String value);

    boolean isIdentity();
    void setIdentity(boolean value);

    boolean isComputed();
    void setComputed(boolean value);

    String getComputedExpression();
    void setComputedExpression(String value);

    EList<TableConstraint> getInlineConstraints();
}
