package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

public interface UniqueConstraint extends TableConstraint {
    EList<String> getColumns();
}
