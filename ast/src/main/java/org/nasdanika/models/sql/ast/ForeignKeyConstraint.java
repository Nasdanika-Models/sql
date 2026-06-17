package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface ForeignKeyConstraint extends TableConstraint {
    EList<String> getColumns();
    String getReferencedTable();
    void setReferencedTable(String value);
    String getReferencedSchema();
    void setReferencedSchema(String value);
    EList<String> getReferencedColumns();
    String getOnDelete();
    void setOnDelete(String value);
    String getOnUpdate();
    void setOnUpdate(String value);
}
