package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public abstract class FromItemImpl extends AstNodeImpl implements FromItem {
    protected String alias;

    protected FromItemImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getFromItem();
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String value) {
        this.alias = value;
    }
}
