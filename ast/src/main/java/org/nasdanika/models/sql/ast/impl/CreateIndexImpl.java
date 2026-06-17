package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CreateIndexImpl extends StatementImpl implements CreateIndex {
    protected String name;
    protected String tableName;
    protected String schemaName;
    protected boolean unique;
    protected EList<IndexColumn> columns;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateIndex();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String value) {
        this.name = value;
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
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public void setSchemaName(String value) {
        this.schemaName = value;
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
    public EList<IndexColumn> getColumns() {
        if (columns == null) {
            columns = new BasicEList<>();
        }
        return columns;
    }
}
