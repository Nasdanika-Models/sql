package org.nasdanika.models.sql.ast;

public interface DropConstraint extends AlterOperation {
    String getConstraintName();
    void setConstraintName(String value);
}
