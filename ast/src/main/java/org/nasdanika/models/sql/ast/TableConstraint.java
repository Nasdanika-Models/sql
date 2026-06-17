package org.nasdanika.models.sql.ast;

public interface TableConstraint extends AstNode {
    String getName();
    void setName(String value);
}
