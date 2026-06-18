package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.nasdanika.models.sql.ast.*;

public class ForeignKeyConstraintImpl extends TableConstraintImpl implements ForeignKeyConstraint {
    protected EList<String> columnNames;
    protected String referencedTable;
    protected String referencedSchema;
    protected EList<String> referencedColumns;
    protected String onDelete;
    protected String onUpdate;

    protected ForeignKeyConstraintImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getForeignKeyConstraint();
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getColumnNames() {
        if (columnNames == null) {
            columnNames = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES);
        }
        return columnNames;
    }

    @Override
    public String getReferencedTable() {
        return referencedTable;
    }

    @Override
    public void setReferencedTable(String value) {
        this.referencedTable = value;
    }

    @Override
    public String getReferencedSchema() {
        return referencedSchema;
    }

    @Override
    public void setReferencedSchema(String value) {
        this.referencedSchema = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getReferencedColumns() {
        if (referencedColumns == null) {
            referencedColumns = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS);
        }
        return referencedColumns;
    }

    @Override
    public String getOnDelete() {
        return onDelete;
    }

    @Override
    public void setOnDelete(String value) {
        this.onDelete = value;
    }

    @Override
    public String getOnUpdate() {
        return onUpdate;
    }

    @Override
    public void setOnUpdate(String value) {
        this.onUpdate = value;
    }
}
