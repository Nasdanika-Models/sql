package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.nasdanika.models.sql.ast.*;

public class CreateIndexImpl extends StatementImpl implements CreateIndex {
    protected String indexName;
    protected String schemaName;
    protected String tableName;
    protected boolean unique;
    protected EList<String> columnNames;

    protected CreateIndexImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateIndex();
    }

    @Override
    public String getIndexName() {
        return indexName;
    }

    @Override
    public void setIndexName(String value) {
        this.indexName = value;
    }

    @Override
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public void setTableName(String value) {
        this.tableName = value;
    }

    @Override
    public boolean isUnique() {
        return unique;
    }

    @Override
    public void setUnique(boolean value) {
        this.unique = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getColumnNames() {
        if (columnNames == null) {
            columnNames = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.CREATE_INDEX__COLUMN_NAMES);
        }
        return columnNames;
    }
}
