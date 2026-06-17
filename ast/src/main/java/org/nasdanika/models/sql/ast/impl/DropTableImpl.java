package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class DropTableImpl extends StatementImpl implements DropTable {
    protected String name;
    protected String schemaName;
    protected boolean ifExists;
    protected boolean cascade;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getDropTable();
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

    @Override
    public boolean isCascade() {
        return cascade;
    }

    @Override
    public void setCascade(boolean value) {
        this.cascade = value;
    }
}
