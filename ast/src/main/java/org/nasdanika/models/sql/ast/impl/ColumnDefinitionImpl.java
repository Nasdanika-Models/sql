package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class ColumnDefinitionImpl extends AstNodeImpl implements ColumnDefinition {
    protected String name;
    protected String dataType;
    protected Boolean nullable;
    protected String defaultValue;
    protected boolean identity;
    protected boolean computed;
    protected String computedExpression;
    protected EList<TableConstraint> inlineConstraints;

    protected ColumnDefinitionImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getColumnDefinition();
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
    public String getDataType() {
        return dataType;
    }

    @Override
    public void setDataType(String value) {
        this.dataType = value;
    }

    @Override
    public Boolean getNullable() {
        return nullable;
    }

    @Override
    public void setNullable(Boolean value) {
        this.nullable = value;
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    @Override
    public boolean isIdentity() {
        return identity;
    }

    @Override
    public void setIdentity(boolean value) {
        this.identity = value;
    }

    @Override
    public boolean isComputed() {
        return computed;
    }

    @Override
    public void setComputed(boolean value) {
        this.computed = value;
    }

    @Override
    public String getComputedExpression() {
        return computedExpression;
    }

    @Override
    public void setComputedExpression(String value) {
        this.computedExpression = value;
    }

    @Override
    public org.eclipse.emf.common.util.EList<TableConstraint> getInlineConstraints() {
        if (inlineConstraints == null) {
            inlineConstraints = new EObjectContainmentEList<>(TableConstraint.class, this, SqlAstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS);
        }
        return inlineConstraints;
    }
}
