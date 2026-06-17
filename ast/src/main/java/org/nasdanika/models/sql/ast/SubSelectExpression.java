package org.nasdanika.models.sql.ast;

public interface SubSelectExpression extends Expression {
    Select getSelect();
    void setSelect(Select value);
}
