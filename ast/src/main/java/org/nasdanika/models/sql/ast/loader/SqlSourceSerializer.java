package org.nasdanika.models.sql.ast.loader;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.sql.ast.*;

/**
 * Serializes the SQL AST model back to SQL text.
 * Phase 1: normalizes formatting rather than achieving byte-exact round-trip.
 */
public class SqlSourceSerializer {

    public String serialize(SqlScript script) {
        StringBuilder sb = new StringBuilder();
        for (Statement stmt : script.getStatements()) {
            if (stmt.getLeadingComment() != null && !stmt.getLeadingComment().isEmpty()) {
                sb.append("-- ").append(stmt.getLeadingComment()).append("\n");
            }
            sb.append(serializeStatement(stmt));
            sb.append(";\n\n");
        }
        return sb.toString().trim() + "\n";
    }

    private String serializeStatement(Statement stmt) {
        if (stmt instanceof CreateTable ct) return serializeCreateTable(ct);
        if (stmt instanceof AlterTable at) return serializeAlterTable(at);
        if (stmt instanceof DropTable dt) return serializeDropTable(dt);
        if (stmt instanceof CreateView cv) return serializeCreateView(cv);
        if (stmt instanceof DropView dv) return serializeDropView(dv);
        if (stmt instanceof CreateIndex ci) return serializeCreateIndex(ci);
        if (stmt instanceof DropIndex di) return serializeDropIndex(di);
        if (stmt instanceof Select sel) return serializeSelect(sel);
        if (stmt instanceof Insert ins) return serializeInsert(ins);
        if (stmt instanceof Update upd) return serializeUpdate(upd);
        if (stmt instanceof Delete del) return serializeDelete(del);
        if (stmt instanceof UnparsedStatement us) return us.getRawSql();
        return "";
    }

    private String serializeCreateTable(CreateTable ct) {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        if (ct.isIfNotExists()) sb.append("IF NOT EXISTS ");
        sb.append(qualifiedName(ct.getSchemaName(), ct.getName()));
        sb.append(" (\n");

        // Columns
        EList<ColumnDefinition> cols = ct.getColumns();
        for (int i = 0; i < cols.size(); i++) {
            sb.append("    ").append(serializeColumnDef(cols.get(i)));
            if (i < cols.size() - 1 || !ct.getConstraints().isEmpty()) sb.append(",");
            sb.append("\n");
        }

        // Constraints
        EList<TableConstraint> constraints = ct.getConstraints();
        for (int i = 0; i < constraints.size(); i++) {
            sb.append("    ").append(serializeConstraint(constraints.get(i)));
            if (i < constraints.size() - 1) sb.append(",");
            sb.append("\n");
        }

        sb.append(")");
        return sb.toString();
    }

    private String serializeColumnDef(ColumnDefinition col) {
        StringBuilder sb = new StringBuilder();
        sb.append(quoteIdentifier(col.getName()));
        if (col.getDataType() != null) {
            sb.append(" ").append(col.getDataType());
        }
        if (col.isIdentity()) sb.append(" IDENTITY");
        if (col.getNullable() != null) {
            sb.append(col.getNullable() ? " NULL" : " NOT NULL");
        }
        if (col.isPrimaryKey()) sb.append(" PRIMARY KEY");
        if (col.isUnique()) sb.append(" UNIQUE");
        if (col.getDefaultExpression() != null) {
            sb.append(" DEFAULT ").append(serializeExpression(col.getDefaultExpression()));
        }
        return sb.toString();
    }

    private String serializeConstraint(TableConstraint constraint) {
        StringBuilder sb = new StringBuilder();
        if (constraint.getName() != null) {
            sb.append("CONSTRAINT ").append(quoteIdentifier(constraint.getName())).append(" ");
        }
        if (constraint instanceof PrimaryKeyConstraint pk) {
            sb.append("PRIMARY KEY (").append(String.join(", ", pk.getColumns())).append(")");
        } else if (constraint instanceof ForeignKeyConstraint fk) {
            sb.append("FOREIGN KEY (").append(String.join(", ", fk.getColumns())).append(")");
            sb.append(" REFERENCES ").append(qualifiedName(fk.getReferencedSchema(), fk.getReferencedTable()));
            if (!fk.getReferencedColumns().isEmpty()) {
                sb.append(" (").append(String.join(", ", fk.getReferencedColumns())).append(")");
            }
            if (fk.getOnDelete() != null) sb.append(" ON DELETE ").append(fk.getOnDelete());
            if (fk.getOnUpdate() != null) sb.append(" ON UPDATE ").append(fk.getOnUpdate());
        } else if (constraint instanceof UniqueConstraint uc) {
            sb.append("UNIQUE (").append(String.join(", ", uc.getColumns())).append(")");
        } else if (constraint instanceof CheckConstraint cc) {
            sb.append("CHECK (").append(serializeExpression(cc.getExpression())).append(")");
        }
        return sb.toString();
    }

    private String serializeAlterTable(AlterTable at) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(qualifiedName(at.getSchemaName(), at.getName()));
        for (AlterOperation op : at.getOperations()) {
            sb.append(" ").append(serializeAlterOp(op));
        }
        return sb.toString();
    }

    private String serializeAlterOp(AlterOperation op) {
        if (op instanceof AddColumn ac) {
            return "ADD COLUMN " + serializeColumnDef(ac.getColumn());
        } else if (op instanceof DropColumn dc) {
            return "DROP COLUMN " + (dc.isIfExists() ? "IF EXISTS " : "") + quoteIdentifier(dc.getColumnName());
        } else if (op instanceof AlterColumn ac) {
            StringBuilder sb = new StringBuilder("ALTER COLUMN " + quoteIdentifier(ac.getColumnName()));
            if (ac.getDataType() != null) sb.append(" ").append(ac.getDataType());
            if (ac.getNullable() != null) sb.append(ac.getNullable() ? " NULL" : " NOT NULL");
            return sb.toString();
        } else if (op instanceof AddConstraint ac) {
            return "ADD " + serializeConstraint(ac.getConstraint());
        } else if (op instanceof DropConstraint dc) {
            return "DROP CONSTRAINT " + quoteIdentifier(dc.getConstraintName());
        }
        return "";
    }

    private String serializeDropTable(DropTable dt) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        if (dt.isIfExists()) sb.append("IF EXISTS ");
        sb.append(qualifiedName(dt.getSchemaName(), dt.getName()));
        if (dt.isCascade()) sb.append(" CASCADE");
        return sb.toString();
    }

    private String serializeCreateView(CreateView cv) {
        StringBuilder sb = new StringBuilder();
        if (cv.isOrReplace()) sb.append("CREATE OR REPLACE VIEW ");
        else sb.append("CREATE VIEW ");
        sb.append(qualifiedName(cv.getSchemaName(), cv.getName()));
        if (cv.getColumnAliases() != null && !cv.getColumnAliases().isEmpty()) {
            sb.append(" (").append(String.join(", ", cv.getColumnAliases())).append(")");
        }
        sb.append(" AS\n");
        if (cv.getQuery() != null) {
            sb.append(serializeSelect(cv.getQuery()));
        }
        return sb.toString();
    }

    private String serializeDropView(DropView dv) {
        StringBuilder sb = new StringBuilder("DROP VIEW ");
        if (dv.isIfExists()) sb.append("IF EXISTS ");
        sb.append(qualifiedName(dv.getSchemaName(), dv.getName()));
        return sb.toString();
    }

    private String serializeCreateIndex(CreateIndex ci) {
        StringBuilder sb = new StringBuilder("CREATE ");
        if (ci.isUnique()) sb.append("UNIQUE ");
        sb.append("INDEX ");
        sb.append(quoteIdentifier(ci.getName()));
        sb.append(" ON ").append(qualifiedName(ci.getSchemaName(), ci.getTableName()));
        sb.append(" (");
        EList<IndexColumn> cols = ci.getColumns();
        for (int i = 0; i < cols.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(quoteIdentifier(cols.get(i).getName()));
            if (!cols.get(i).isAscending()) sb.append(" DESC");
        }
        sb.append(")");
        return sb.toString();
    }

    private String serializeDropIndex(DropIndex di) {
        StringBuilder sb = new StringBuilder("DROP INDEX ");
        if (di.isIfExists()) sb.append("IF EXISTS ");
        sb.append(qualifiedName(di.getSchemaName(), di.getName()));
        return sb.toString();
    }

    private String serializeSelect(Select sel) {
        StringBuilder sb = new StringBuilder("SELECT ");
        if (sel.isDistinct()) sb.append("DISTINCT ");

        // Select items
        EList<SelectItem> items = sel.getSelectItems();
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) sb.append(", ");
            SelectItem item = items.get(i);
            sb.append(serializeExpression(item.getExpression()));
            if (item.getAlias() != null) sb.append(" AS ").append(item.getAlias());
        }

        // FROM
        if (!sel.getFromItems().isEmpty()) {
            sb.append("\nFROM ");
            for (int i = 0; i < sel.getFromItems().size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(serializeFromItem(sel.getFromItems().get(i)));
            }
        }

        // JOINs
        for (Join j : sel.getJoins()) {
            sb.append("\n").append(serializeJoin(j));
        }

        // WHERE
        if (sel.getWhere() != null) {
            sb.append("\nWHERE ").append(serializeExpression(sel.getWhere()));
        }

        // GROUP BY
        if (!sel.getGroupByElements().isEmpty()) {
            sb.append("\nGROUP BY ");
            for (int i = 0; i < sel.getGroupByElements().size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(serializeExpression(sel.getGroupByElements().get(i).getExpression()));
            }
        }

        // HAVING
        if (sel.getHaving() != null) {
            sb.append("\nHAVING ").append(serializeExpression(sel.getHaving()));
        }

        // ORDER BY
        if (!sel.getOrderByElements().isEmpty()) {
            sb.append("\nORDER BY ");
            for (int i = 0; i < sel.getOrderByElements().size(); i++) {
                if (i > 0) sb.append(", ");
                OrderByElement obe = sel.getOrderByElements().get(i);
                sb.append(serializeExpression(obe.getExpression()));
                if (!obe.isAscending()) sb.append(" DESC");
            }
        }

        // LIMIT
        if (sel.getLimit() != null) {
            sb.append("\nLIMIT ").append(serializeExpression(sel.getLimit()));
        }
        if (sel.getOffset() != null) {
            sb.append(" OFFSET ").append(serializeExpression(sel.getOffset()));
        }

        return sb.toString();
    }

    private String serializeFromItem(FromItem fi) {
        if (fi instanceof TableReference tr) {
            String result = qualifiedName(tr.getSchemaName(), tr.getName());
            if (tr.getAlias() != null) result += " " + tr.getAlias();
            return result;
        } else if (fi instanceof SubSelect ss) {
            String result = "(" + serializeSelect(ss.getSelect()) + ")";
            if (ss.getAlias() != null) result += " " + ss.getAlias();
            return result;
        }
        return "";
    }

    private String serializeJoin(Join j) {
        StringBuilder sb = new StringBuilder();
        switch (j.getType()) {
            case LEFT: sb.append("LEFT JOIN "); break;
            case RIGHT: sb.append("RIGHT JOIN "); break;
            case FULL: sb.append("FULL JOIN "); break;
            case CROSS: sb.append("CROSS JOIN "); break;
            default: sb.append("JOIN "); break;
        }
        sb.append(serializeFromItem(j.getRight()));
        if (j.getCondition() != null) {
            sb.append(" ON ").append(serializeExpression(j.getCondition()));
        }
        return sb.toString();
    }

    private String serializeInsert(Insert ins) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(qualifiedName(ins.getSchemaName(), ins.getTableName()));
        if (!ins.getColumns().isEmpty()) {
            sb.append(" (").append(String.join(", ", ins.getColumns())).append(")");
        }
        if (ins.getSelect() != null) {
            sb.append("\n").append(serializeSelect(ins.getSelect()));
        }
        if (!ins.getValuesList().isEmpty()) {
            sb.append(" VALUES ");
            for (int i = 0; i < ins.getValuesList().size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append("(");
                ExpressionList row = ins.getValuesList().get(i);
                for (int j = 0; j < row.getExpressions().size(); j++) {
                    if (j > 0) sb.append(", ");
                    sb.append(serializeExpression(row.getExpressions().get(j)));
                }
                sb.append(")");
            }
        }
        return sb.toString();
    }

    private String serializeUpdate(Update upd) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(qualifiedName(upd.getSchemaName(), upd.getTableName()));
        sb.append(" SET ");
        for (int i = 0; i < upd.getSets().size(); i++) {
            if (i > 0) sb.append(", ");
            SetClause set = upd.getSets().get(i);
            sb.append(quoteIdentifier(set.getColumn())).append(" = ").append(serializeExpression(set.getExpression()));
        }
        if (upd.getWhere() != null) {
            sb.append("\nWHERE ").append(serializeExpression(upd.getWhere()));
        }
        return sb.toString();
    }

    private String serializeDelete(Delete del) {
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(qualifiedName(del.getSchemaName(), del.getTableName()));
        if (del.getWhere() != null) {
            sb.append("\nWHERE ").append(serializeExpression(del.getWhere()));
        }
        return sb.toString();
    }

    private String serializeExpression(Expression expr) {
        if (expr == null) return "NULL";
        if (expr instanceof ColumnReference cr) {
            return qualifiedName(cr.getSchemaName(), cr.getTableName(), cr.getName());
        } else if (expr instanceof Literal lit) {
            if (lit.getType() == LiteralType.STRING) return "'" + lit.getValue().replace("'", "''") + "'";
            if (lit.getType() == LiteralType.NULL) return "NULL";
            return lit.getValue();
        } else if (expr instanceof FunctionCall fc) {
            StringBuilder sb = new StringBuilder(fc.getName()).append("(");
            if (fc.isDistinct()) sb.append("DISTINCT ");
            for (int i = 0; i < fc.getArguments().size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(serializeExpression(fc.getArguments().get(i)));
            }
            sb.append(")");
            return sb.toString();
        } else if (expr instanceof BinaryExpression be) {
            return serializeExpression(be.getLeft()) + " " + be.getOperator() + " " + serializeExpression(be.getRight());
        } else if (expr instanceof UnaryExpression ue) {
            if (ue.isPrefix()) return ue.getOperator() + " " + serializeExpression(ue.getOperand());
            return serializeExpression(ue.getOperand()) + " " + ue.getOperator();
        } else if (expr instanceof Parenthesis p) {
            return "(" + serializeExpression(p.getExpression()) + ")";
        } else if (expr instanceof IsNullExpression ine) {
            return serializeExpression(ine.getExpression()) + (ine.isNot() ? " IS NOT NULL" : " IS NULL");
        } else if (expr instanceof InExpression ie) {
            StringBuilder sb = new StringBuilder(serializeExpression(ie.getLeft()));
            sb.append(ie.isNot() ? " NOT IN (" : " IN (");
            for (int i = 0; i < ie.getValues().size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(serializeExpression(ie.getValues().get(i)));
            }
            sb.append(")");
            return sb.toString();
        } else if (expr instanceof BetweenExpression bte) {
            return serializeExpression(bte.getLeft()) + (bte.isNot() ? " NOT BETWEEN " : " BETWEEN ") +
                    serializeExpression(bte.getStart()) + " AND " + serializeExpression(bte.getEnd());
        } else if (expr instanceof ExistsExpression ee) {
            return "EXISTS (" + serializeSelect(ee.getSelect()) + ")";
        } else if (expr instanceof CaseExpression ce) {
            StringBuilder sb = new StringBuilder("CASE");
            if (ce.getOperand() != null) sb.append(" ").append(serializeExpression(ce.getOperand()));
            for (WhenClause wc : ce.getWhenClauses()) {
                sb.append(" WHEN ").append(serializeExpression(wc.getCondition()));
                sb.append(" THEN ").append(serializeExpression(wc.getResult()));
            }
            if (ce.getElseExpression() != null) {
                sb.append(" ELSE ").append(serializeExpression(ce.getElseExpression()));
            }
            sb.append(" END");
            return sb.toString();
        } else if (expr instanceof CastExpression cast) {
            return "CAST(" + serializeExpression(cast.getExpression()) + " AS " + cast.getTargetType() + ")";
        } else if (expr instanceof AllColumns ac) {
            if (ac.getTableName() != null) return ac.getTableName() + ".*";
            return "*";
        } else if (expr instanceof SubSelectExpression sse) {
            return "(" + serializeSelect(sse.getSelect()) + ")";
        }
        return "NULL";
    }

    private String qualifiedName(String schema, String name) {
        if (schema != null && !schema.isEmpty()) {
            return quoteIdentifier(schema) + "." + quoteIdentifier(name);
        }
        return quoteIdentifier(name);
    }

    private String qualifiedName(String schema, String table, String column) {
        StringBuilder sb = new StringBuilder();
        if (schema != null && !schema.isEmpty()) {
            sb.append(quoteIdentifier(schema)).append(".");
        }
        if (table != null && !table.isEmpty()) {
            sb.append(quoteIdentifier(table)).append(".");
        }
        sb.append(quoteIdentifier(column));
        return sb.toString();
    }

    private String quoteIdentifier(String id) {
        if (id == null) return "";
        // Only quote if contains special chars or is a reserved word
        if (id.contains(" ") || id.contains("-")) {
            return "\"" + id + "\"";
        }
        return id;
    }
}
