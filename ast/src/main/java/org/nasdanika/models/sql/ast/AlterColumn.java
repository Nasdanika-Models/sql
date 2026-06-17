package org.nasdanika.models.sql.ast;

public interface AlterColumn extends AlterOperation {
    String getColumnName();
    void setColumnName(String value);
    String getDataType();
    void setDataType(String value);
    Boolean getNullable();
    void setNullable(Boolean value);
    Expression getDefaultExpression();
    void setDefaultExpression(Expression value);
}
