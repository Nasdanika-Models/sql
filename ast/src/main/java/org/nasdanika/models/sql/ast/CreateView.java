package org.nasdanika.models.sql.ast;

public interface CreateView extends Statement {
    String getSchemaName();
    void setSchemaName(String value);

    String getViewName();
    void setViewName(String value);

    boolean isOrReplace();
    void setOrReplace(boolean value);

    Select getQuery();
    void setQuery(Select value);
}
