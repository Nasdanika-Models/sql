package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EObject;

public interface SourceSpan extends EObject {
    int getStartLine();
    void setStartLine(int value);

    int getStartColumn();
    void setStartColumn(int value);

    int getEndLine();
    void setEndLine(int value);

    int getEndColumn();
    void setEndColumn(int value);

    int getStartOffset();
    void setStartOffset(int value);

    int getEndOffset();
    void setEndOffset(int value);
}
