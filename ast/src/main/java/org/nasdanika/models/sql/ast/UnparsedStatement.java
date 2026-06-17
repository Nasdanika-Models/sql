package org.nasdanika.models.sql.ast;

public interface UnparsedStatement extends Statement {
    String getErrorMessage();
    void setErrorMessage(String value);
}
