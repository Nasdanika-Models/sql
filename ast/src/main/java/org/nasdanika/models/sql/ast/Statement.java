package org.nasdanika.models.sql.ast;

public interface Statement extends AstNode {
    String getRawSql();
    void setRawSql(String value);
}
