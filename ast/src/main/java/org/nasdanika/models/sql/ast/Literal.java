package org.nasdanika.models.sql.ast;

public interface Literal extends Expression {
    String getValue();
    void setValue(String value);

    String getType();
    void setType(String value);
}
