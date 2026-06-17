package org.nasdanika.models.sql.ast;

public interface ColumnDefinition extends AstNode {
    String getName();
    void setName(String value);
    String getDataType();
    void setDataType(String value);
    Boolean getNullable();
    void setNullable(Boolean value);
    Expression getDefaultExpression();
    void setDefaultExpression(Expression value);
    boolean isPrimaryKey();
    void setPrimaryKey(boolean value);
    boolean isUnique();
    void setUnique(boolean value);
    boolean isIdentity();
    void setIdentity(boolean value);
    boolean isComputed();
    void setComputed(boolean value);
    Expression getComputedExpression();
    void setComputedExpression(Expression value);
    String getInlineComment();
    void setInlineComment(String value);
}
