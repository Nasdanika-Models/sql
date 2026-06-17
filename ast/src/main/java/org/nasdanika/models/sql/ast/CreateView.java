package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface CreateView extends Statement {
    String getName();
    void setName(String value);
    String getSchemaName();
    void setSchemaName(String value);
    boolean isOrReplace();
    void setOrReplace(boolean value);
    EList<String> getColumnAliases();
    Select getQuery();
    void setQuery(Select value);
}
