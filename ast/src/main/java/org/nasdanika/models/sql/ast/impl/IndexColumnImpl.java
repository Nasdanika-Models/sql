package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class IndexColumnImpl extends AstNodeImpl implements IndexColumn {
    protected String name;
    protected boolean ascending;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getIndexColumn();
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
    public boolean isAscending() {
        return ascending;
    }

    @Override
    public void setAscending(boolean value) {
        this.ascending = value;
    }
}
