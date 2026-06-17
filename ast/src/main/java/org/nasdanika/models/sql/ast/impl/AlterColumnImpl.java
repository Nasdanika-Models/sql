package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AlterColumnImpl extends AlterOperationImpl implements AlterColumn {
    protected String columnName;
    protected String dataType;
    protected Boolean nullable;
    protected Expression defaultExpression;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAlterColumn();
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public void setColumnName(String value) {
        this.columnName = value;
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
}
