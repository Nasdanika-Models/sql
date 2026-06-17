package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
    protected String name;
    protected EList<Expression> arguments;
    protected boolean distinct;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getFunctionCall();
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
    public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new BasicEList<>();
        }
        return arguments;
    }

    @Override
    public boolean isDistinct() {
        return distinct;
    }

    @Override
    public void setDistinct(boolean value) {
        this.distinct = value;
    }
}
