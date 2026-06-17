package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SubSelectImpl extends FromItemImpl implements SubSelect {
    protected Select select;

    protected SubSelectImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSubSelect();
    }

    @Override
    public Select getSelect() {
        return select;
    }

    @Override
    public void setSelect(Select value) {
        this.select = value;
    }
}
