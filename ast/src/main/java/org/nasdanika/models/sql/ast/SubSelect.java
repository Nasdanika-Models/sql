package org.nasdanika.models.sql.ast;

public interface SubSelect extends FromItem {
    Select getSelect();
    void setSelect(Select value);
}
