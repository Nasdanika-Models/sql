package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class CreateViewImpl extends StatementImpl implements CreateView {
    protected String schemaName;
    protected String viewName;
    protected boolean orReplace;
    protected Select query;

    protected CreateViewImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getCreateView();
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
    public String getViewName() {
        return viewName;
    }

    @Override
    public void setViewName(String value) {
        this.viewName = value;
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
    public Select getQuery() {
        return query;
    }

    @Override
    public void setQuery(Select value) {
        this.query = value;
    }
}
