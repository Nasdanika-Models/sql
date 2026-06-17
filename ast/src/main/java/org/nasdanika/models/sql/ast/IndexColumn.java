package org.nasdanika.models.sql.ast;

public interface IndexColumn extends AstNode {
    String getName();
    void setName(String value);
    boolean isAscending();
    void setAscending(boolean value);
}
