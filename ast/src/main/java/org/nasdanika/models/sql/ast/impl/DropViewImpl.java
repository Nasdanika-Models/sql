package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DropViewImpl extends StatementImpl implements DropView {
    protected String schemaName;
    protected String viewName;
    protected boolean ifExists;

    protected DropViewImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDropView();
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
    public boolean isIfExists() {
        return ifExists;
    }

    @Override
    public void setIfExists(boolean value) {
        this.ifExists = value;
    }
}
