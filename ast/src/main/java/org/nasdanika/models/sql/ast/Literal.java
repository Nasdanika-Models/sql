package org.nasdanika.models.sql.ast;

public interface Literal extends Expression {
    String getValue();
    void setValue(String value);
    LiteralType getType();
    void setType(LiteralType value);
}
