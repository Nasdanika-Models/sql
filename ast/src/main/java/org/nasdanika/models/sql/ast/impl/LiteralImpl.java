package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class LiteralImpl extends ExpressionImpl implements Literal {
    protected String value;
    protected LiteralType type;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getLiteral();
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public LiteralType getType() {
        return type;
    }

    @Override
    public void setType(LiteralType value) {
        this.type = value;
    }
}
