package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * Base interface for all SQL AST nodes. Carries source location information.
 */
public interface AstNode extends EObject {
    int getStartLine();
    void setStartLine(int value);
    int getStartColumn();
    void setStartColumn(int value);
    int getStartOffset();
    void setStartOffset(int value);
    int getEndLine();
    void setEndLine(int value);
    int getEndColumn();
    void setEndColumn(int value);
    int getEndOffset();
    void setEndOffset(int value);
    String getComment();
    void setComment(String value);
}
