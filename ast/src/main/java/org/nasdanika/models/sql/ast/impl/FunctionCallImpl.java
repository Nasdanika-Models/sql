package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
    protected String name;
    protected String schemaName;
    protected EList<Expression> arguments;
    protected boolean distinct;
    protected boolean allColumns;

    protected FunctionCallImpl() {
        super();
    }

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
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<>(Expression.class, this, SqlAstPackage.FUNCTION_CALL__ARGUMENTS);
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

    @Override
    public boolean isAllColumns() {
        return allColumns;
    }

    @Override
    public void setAllColumns(boolean value) {
        this.allColumns = value;
    }
}
