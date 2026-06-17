package org.nasdanika.models.sql.ast;

public interface FromItem extends AstNode {
    String getAlias();
    void setAlias(String value);
}
