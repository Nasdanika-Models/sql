package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EObject;

public interface AstNode extends EObject {
    SourceSpan getSourceSpan();
    void setSourceSpan(SourceSpan value);

    String getComment();
    void setComment(String value);
}
