package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DropViewImpl extends StatementImpl implements DropView {
    protected String name;
    protected String schemaName;
    protected boolean ifExists;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDropView();
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
    public boolean isIfExists() {
        return ifExists;
    }

    @Override
    public void setIfExists(boolean value) {
        this.ifExists = value;
    }
}
