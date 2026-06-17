package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class ColumnDefinitionImpl extends AstNodeImpl implements ColumnDefinition {
    protected String name;
    protected String dataType;
    protected Boolean nullable;
    protected Expression defaultExpression;
    protected boolean primaryKey;
    protected boolean unique;
    protected boolean identity;
    protected boolean computed;
    protected Expression computedExpression;
    protected String inlineComment;

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
    public Expression getDefaultExpression() {
        return defaultExpression;
    }

    @Override
    public void setDefaultExpression(Expression value) {
        this.defaultExpression = value;
    }

    @Override
    public boolean isPrimaryKey() {
        return primaryKey;
    }

    @Override
    public void setPrimaryKey(boolean value) {
        this.primaryKey = value;
    }

    @Override
    public boolean isUnique() {
        return unique;
    }

    @Override
    public void setUnique(boolean value) {
        this.unique = value;
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
    public Expression getComputedExpression() {
        return computedExpression;
    }

    @Override
    public void setComputedExpression(Expression value) {
        this.computedExpression = value;
    }

    @Override
    public String getInlineComment() {
        return inlineComment;
    }

    @Override
    public void setInlineComment(String value) {
        this.inlineComment = value;
    }
}
