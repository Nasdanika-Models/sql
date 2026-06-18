package org.nasdanika.models.sql.ast;

public interface AddConstraint extends AlterOperation {
    TableConstraint getConstraint();
    void setConstraint(TableConstraint value);
}
