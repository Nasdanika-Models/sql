package org.nasdanika.models.sql.ast;

public interface ExistsExpression extends Expression {
    Select getSelect();
    void setSelect(Select value);
}
