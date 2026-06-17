package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CreateViewImpl extends StatementImpl implements CreateView {
    protected String name;
    protected String schemaName;
    protected boolean orReplace;
    protected EList<String> columnAliases;
    protected Select query;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateView();
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
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    @Override
    public boolean isOrReplace() {
        return orReplace;
    }

    @Override
    public void setOrReplace(boolean value) {
        this.orReplace = value;
    }

    @Override
    public EList<String> getColumnAliases() {
        if (columnAliases == null) {
            columnAliases = new BasicEList<>();
        }
        return columnAliases;
    }

    @Override
    public Select getQuery() {
        return query;
    }

    @Override
    public void setQuery(Select value) {
        this.query = value;
    }
}
