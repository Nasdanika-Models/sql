package org.nasdanika.models.sql.ast;

public interface UnparsedStatement extends Statement {
    String getRawSql();
    void setRawSql(String value);
    String getErrorMessage();
    void setErrorMessage(String value);
}
