package org.nasdanika.models.sql.ast.loader;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.nasdanika.models.sql.ast.*;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.*;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.alter.AlterExpressionType;
import net.sf.jsqlparser.statement.create.index.CreateIndex;
import net.sf.jsqlparser.statement.create.table.ColDataType;
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.create.table.Index;
import net.sf.jsqlparser.statement.create.view.CreateView;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.drop.Drop;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.*;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.statement.update.UpdateSet;

// TODO: Calcite Babel loader - when added, create a separate module with a CalciteLoader
// implementing SqlSourceLoader targeting the same model.

/**
 * JSqlParser-based implementation of SqlSourceLoader.
 * Parses SQL source text using JSqlParser and maps the results to the SQL AST EMF model.
 */
public class JSqlParserLoader implements SqlSourceLoader {

    private static final Pattern GO_PATTERN = Pattern.compile("^\\s*GO\\s*$", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    private static final Pattern BRACKET_ID_PATTERN = Pattern.compile("\\[([^\\]]+)\\]");

    private final SqlAstFactory factory = SqlAstFactory.eINSTANCE;

    @Override
    public SqlScript load(String sql, String sourceUri, String dialect) {
        SqlScript script = factory.createSqlScript();
        script.setSourceUri(sourceUri);
        script.setDialect(dialect);

        // T-SQL preprocessing: split on GO separators
        String preprocessed = preprocessSql(sql);
        List<String> rawStatements = splitStatements(preprocessed);

        for (String rawStmt : rawStatements) {
            String trimmed = rawStmt.trim();
            if (trimmed.isEmpty()) continue;

            Statement statement = parseStatement(trimmed);
            script.getStatements().add(statement);
        }

        return script;
    }

    /**
     * T-SQL preprocessing:
     * - Split batches on GO separators (line-level, case-insensitive)
     * - Replace [bracketed] identifiers with quoted identifiers for JSqlParser compatibility
     */
    private String preprocessSql(String sql) {
        // Replace GO batch separators with semicolons
        String result = GO_PATTERN.matcher(sql).replaceAll(";");
        // Replace [bracketed] identifiers with "quoted" identifiers
        result = replaceBracketedIdentifiers(result);
        return result;
    }

    private String replaceBracketedIdentifiers(String sql) {
        Matcher matcher = BRACKET_ID_PATTERN.matcher(sql);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "\"" + Matcher.quoteReplacement(matcher.group(1)) + "\"");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * Split SQL text into individual statements by semicolons.
     * Respects string literals and nested parentheses.
     */
    private List<String> splitStatements(String sql) {
        List<String> statements = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        int parenDepth = 0;
        boolean inSingleQuote = false;
        boolean inDoubleQuote = false;

        for (int i = 0; i < sql.length(); i++) {
            char c = sql.charAt(i);

            if (inSingleQuote) {
                current.append(c);
                if (c == '\'' && (i + 1 >= sql.length() || sql.charAt(i + 1) != '\'')) {
                    inSingleQuote = false;
                }
                continue;
            }
            if (inDoubleQuote) {
                current.append(c);
                if (c == '"') {
                    inDoubleQuote = false;
                }
                continue;
            }

            if (c == '\'') {
                inSingleQuote = true;
                current.append(c);
            } else if (c == '"') {
                inDoubleQuote = true;
                current.append(c);
            } else if (c == '(') {
                parenDepth++;
                current.append(c);
            } else if (c == ')') {
                parenDepth--;
                current.append(c);
            } else if (c == ';' && parenDepth == 0) {
                String stmt = current.toString().trim();
                if (!stmt.isEmpty()) {
                    statements.add(stmt);
                }
                current = new StringBuilder();
            } else {
                current.append(c);
            }
        }

        String remaining = current.toString().trim();
        if (!remaining.isEmpty()) {
            statements.add(remaining);
        }
        return statements;
    }

    /**
     * Parse a single SQL statement. On failure, returns an UnparsedStatement.
     */
    private Statement parseStatement(String sql) {
        try {
            net.sf.jsqlparser.statement.Statement parsed = CCJSqlParserUtil.parse(sql);
            return mapStatement(parsed, sql);
        } catch (JSQLParserException e) {
            UnparsedStatement unparsed = factory.createUnparsedStatement();
            unparsed.setRawSql(sql);
            unparsed.setErrorMessage(e.getMessage() != null ? e.getMessage() : "Parse error");
            return unparsed;
        }
    }

    private Statement mapStatement(net.sf.jsqlparser.statement.Statement parsed, String rawSql) {
        if (parsed instanceof CreateTable ct) {
            return mapCreateTable(ct);
        } else if (parsed instanceof CreateView cv) {
            return mapCreateView(cv);
        } else if (parsed instanceof CreateIndex ci) {
            return mapCreateIndex(ci);
        } else if (parsed instanceof Drop drop) {
            return mapDrop(drop);
        } else if (parsed instanceof Alter alter) {
            return mapAlter(alter);
        } else if (parsed instanceof net.sf.jsqlparser.statement.select.Select sel) {
            return mapSelect(sel);
        } else if (parsed instanceof Insert ins) {
            return mapInsert(ins);
        } else if (parsed instanceof Update upd) {
            return mapUpdate(upd);
        } else if (parsed instanceof Delete del) {
            return mapDelete(del);
        } else {
            // Unsupported statement type - store as unparsed
            UnparsedStatement unparsed = factory.createUnparsedStatement();
            unparsed.setRawSql(rawSql);
            unparsed.setErrorMessage("Unsupported statement type: " + parsed.getClass().getSimpleName());
            return unparsed;
        }
    }

    private org.nasdanika.models.sql.ast.CreateTable mapCreateTable(CreateTable ct) {
        org.nasdanika.models.sql.ast.CreateTable result = factory.createCreateTable();
        Table table = ct.getTable();
        result.setName(unquote(table.getName()));
        if (table.getSchemaName() != null) {
            result.setSchemaName(unquote(table.getSchemaName()));
        }
        result.setIfNotExists(ct.isIfNotExists());

        // Map columns
        if (ct.getColumnDefinitions() != null) {
            for (ColumnDefinition colDef : ct.getColumnDefinitions()) {
                org.nasdanika.models.sql.ast.ColumnDefinition col = mapColumnDefinition(colDef);
                result.getColumns().add(col);
            }
        }

        // Map table-level constraints (indexes)
        if (ct.getIndexes() != null) {
            for (Index index : ct.getIndexes()) {
                TableConstraint constraint = mapIndex(index);
                if (constraint != null) {
                    result.getConstraints().add(constraint);
                }
            }
        }

        return result;
    }

    private org.nasdanika.models.sql.ast.ColumnDefinition mapColumnDefinition(ColumnDefinition colDef) {
        org.nasdanika.models.sql.ast.ColumnDefinition col = factory.createColumnDefinition();
        col.setName(unquote(colDef.getColumnName()));

        ColDataType colDataType = colDef.getColDataType();
        if (colDataType != null) {
            StringBuilder typeStr = new StringBuilder(colDataType.getDataType());
            if (colDataType.getArgumentsStringList() != null && !colDataType.getArgumentsStringList().isEmpty()) {
                typeStr.append("(").append(String.join(", ", colDataType.getArgumentsStringList())).append(")");
            }
            col.setDataType(typeStr.toString());
        }

        // Parse column specs for nullability, default, etc.
        if (colDef.getColumnSpecs() != null) {
            List<String> specs = colDef.getColumnSpecs();
            for (int i = 0; i < specs.size(); i++) {
                String spec = specs.get(i).toUpperCase();
                if ("NOT".equals(spec) && i + 1 < specs.size() && "NULL".equalsIgnoreCase(specs.get(i + 1))) {
                    col.setNullable(false);
                    i++;
                } else if ("NULL".equals(spec)) {
                    col.setNullable(true);
                } else if ("PRIMARY".equals(spec) && i + 1 < specs.size() && "KEY".equalsIgnoreCase(specs.get(i + 1))) {
                    col.setPrimaryKey(true);
                    i++;
                } else if ("UNIQUE".equals(spec)) {
                    col.setUnique(true);
                } else if ("IDENTITY".equals(spec)) {
                    col.setIdentity(true);
                }
            }
        }

        return col;
    }

    private TableConstraint mapIndex(Index index) {
        String type = index.getType();
        if (type == null) return null;

        type = type.toUpperCase();
        List<String> colNames = new ArrayList<>();
        if (index.getColumns() != null) {
            for (Index.ColumnParams cp : index.getColumns()) {
                colNames.add(unquote(cp.getColumnName()));
            }
        }

        if (type.contains("PRIMARY KEY")) {
            PrimaryKeyConstraint pk = factory.createPrimaryKeyConstraint();
            pk.setName(index.getName() != null ? unquote(index.getName()) : null);
            pk.getColumns().addAll(colNames);
            return pk;
        } else if (type.contains("UNIQUE")) {
            UniqueConstraint uc = factory.createUniqueConstraint();
            uc.setName(index.getName() != null ? unquote(index.getName()) : null);
            uc.getColumns().addAll(colNames);
            return uc;
        } else if (type.contains("FOREIGN KEY")) {
            ForeignKeyConstraint fk = factory.createForeignKeyConstraint();
            fk.setName(index.getName() != null ? unquote(index.getName()) : null);
            fk.getColumns().addAll(colNames);
            // Referenced table info from index specs
            if (index instanceof net.sf.jsqlparser.statement.create.table.ForeignKeyIndex fki) {
                Table refTable = fki.getTable();
                if (refTable != null) {
                    fk.setReferencedTable(unquote(refTable.getName()));
                    if (refTable.getSchemaName() != null) {
                        fk.setReferencedSchema(unquote(refTable.getSchemaName()));
                    }
                }
                if (fki.getReferencedColumnNames() != null) {
                    for (String rc : fki.getReferencedColumnNames()) {
                        fk.getReferencedColumns().add(unquote(rc));
                    }
                }
                if (fki.getOnDeleteReferenceOption() != null) {
                    fk.setOnDelete(fki.getOnDeleteReferenceOption());
                }
                if (fki.getOnUpdateReferenceOption() != null) {
                    fk.setOnUpdate(fki.getOnUpdateReferenceOption());
                }
            }
            return fk;
        } else if (type.contains("CHECK")) {
            CheckConstraint cc = factory.createCheckConstraint();
            cc.setName(index.getName() != null ? unquote(index.getName()) : null);
            return cc;
        }
        return null;
    }

    private org.nasdanika.models.sql.ast.CreateView mapCreateView(CreateView cv) {
        org.nasdanika.models.sql.ast.CreateView result = factory.createCreateView();
        result.setName(unquote(cv.getView().getName()));
        if (cv.getView().getSchemaName() != null) {
            result.setSchemaName(unquote(cv.getView().getSchemaName()));
        }
        result.setOrReplace(cv.isOrReplace());

        // Map the view's select query
        if (cv.getSelect() != null) {
            org.nasdanika.models.sql.ast.Select selectModel = mapSelectBody(cv.getSelect());
            result.setQuery(selectModel);
        }

        return result;
    }

    private org.nasdanika.models.sql.ast.CreateIndex mapCreateIndex(CreateIndex ci) {
        org.nasdanika.models.sql.ast.CreateIndex result = factory.createCreateIndex();
        if (ci.getIndex() != null) {
            result.setName(unquote(ci.getIndex().getName()));
            if (ci.getIndex().getColumns() != null) {
                for (Index.ColumnParams cp : ci.getIndex().getColumns()) {
                    IndexColumn ic = factory.createIndexColumn();
                    ic.setName(unquote(cp.getColumnName()));
                    result.getColumns().add(ic);
                }
            }
            String type = ci.getIndex().getType();
            if (type != null && type.toUpperCase().contains("UNIQUE")) {
                result.setUnique(true);
            }
        }
        if (ci.getTable() != null) {
            result.setTableName(unquote(ci.getTable().getName()));
            if (ci.getTable().getSchemaName() != null) {
                result.setSchemaName(unquote(ci.getTable().getSchemaName()));
            }
        }
        return result;
    }

    private Statement mapDrop(Drop drop) {
        String type = drop.getType().toUpperCase();
        if (type.contains("TABLE")) {
            org.nasdanika.models.sql.ast.DropTable result = factory.createDropTable();
            result.setName(unquote(drop.getName().getName()));
            if (drop.getName().getSchemaName() != null) {
                result.setSchemaName(unquote(drop.getName().getSchemaName()));
            }
            result.setIfExists(drop.isIfExists());
            return result;
        } else if (type.contains("VIEW")) {
            org.nasdanika.models.sql.ast.DropView result = factory.createDropView();
            result.setName(unquote(drop.getName().getName()));
            if (drop.getName().getSchemaName() != null) {
                result.setSchemaName(unquote(drop.getName().getSchemaName()));
            }
            result.setIfExists(drop.isIfExists());
            return result;
        } else if (type.contains("INDEX")) {
            org.nasdanika.models.sql.ast.DropIndex result = factory.createDropIndex();
            result.setName(unquote(drop.getName().getName()));
            if (drop.getName().getSchemaName() != null) {
                result.setSchemaName(unquote(drop.getName().getSchemaName()));
            }
            result.setIfExists(drop.isIfExists());
            return result;
        }
        // Fallback
        UnparsedStatement unparsed = factory.createUnparsedStatement();
        unparsed.setRawSql(drop.toString());
        unparsed.setErrorMessage("Unsupported DROP type: " + type);
        return unparsed;
    }

    private Statement mapAlter(Alter alter) {
        org.nasdanika.models.sql.ast.AlterTable result = factory.createAlterTable();
        if (alter.getTable() != null) {
            result.setName(unquote(alter.getTable().getName()));
            if (alter.getTable().getSchemaName() != null) {
                result.setSchemaName(unquote(alter.getTable().getSchemaName()));
            }
        }

        if (alter.getAlterExpressions() != null) {
            for (var alterExpr : alter.getAlterExpressions()) {
                AlterOperation op = mapAlterExpression(alterExpr);
                if (op != null) {
                    result.getOperations().add(op);
                }
            }
        }
        return result;
    }

    private AlterOperation mapAlterExpression(net.sf.jsqlparser.statement.alter.AlterExpression alterExpr) {
        AlterExpressionType opType = alterExpr.getOperation();
        if (opType == null) return null;

        switch (opType) {
            case ADD:
                if (alterExpr.getColumnName() != null) {
                    AddColumn addCol = factory.createAddColumn();
                    org.nasdanika.models.sql.ast.ColumnDefinition col = factory.createColumnDefinition();
                    col.setName(unquote(alterExpr.getColumnName()));
                    if (alterExpr.getColDataTypeList() != null && !alterExpr.getColDataTypeList().isEmpty()) {
                        var cdt = alterExpr.getColDataTypeList().get(0);
                        if (cdt.getColDataType() != null) {
                            col.setDataType(cdt.getColDataType().getDataType());
                        }
                    }
                    addCol.setColumn(col);
                    return addCol;
                } else if (alterExpr.getIndex() != null) {
                    // Adding constraint
                    AddConstraint addConstraint = factory.createAddConstraint();
                    TableConstraint constraint = mapIndex(alterExpr.getIndex());
                    if (constraint != null) {
                        addConstraint.setConstraint(constraint);
                    }
                    return addConstraint;
                }
                return null;
            case DROP:
                if (alterExpr.getColumnName() != null) {
                    DropColumn dropCol = factory.createDropColumn();
                    dropCol.setColumnName(unquote(alterExpr.getColumnName()));
                    return dropCol;
                } else if (alterExpr.getConstraintName() != null) {
                    org.nasdanika.models.sql.ast.DropConstraint dropConst = factory.createDropConstraint();
                    dropConst.setConstraintName(unquote(alterExpr.getConstraintName()));
                    return dropConst;
                }
                return null;
            case MODIFY:
            case ALTER:
                if (alterExpr.getColumnName() != null) {
                    org.nasdanika.models.sql.ast.AlterColumn alterCol = factory.createAlterColumn();
                    alterCol.setColumnName(unquote(alterExpr.getColumnName()));
                    if (alterExpr.getColDataTypeList() != null && !alterExpr.getColDataTypeList().isEmpty()) {
                        var cdt = alterExpr.getColDataTypeList().get(0);
                        if (cdt.getColDataType() != null) {
                            alterCol.setDataType(cdt.getColDataType().getDataType());
                        }
                    }
                    return alterCol;
                }
                return null;
            default:
                return null;
        }
    }

    private org.nasdanika.models.sql.ast.Select mapSelect(net.sf.jsqlparser.statement.select.Select select) {
        return mapSelectBody(select);
    }

    private org.nasdanika.models.sql.ast.Select mapSelectBody(net.sf.jsqlparser.statement.select.Select select) {
        org.nasdanika.models.sql.ast.Select result = factory.createSelect();
        
        if (select == null) return result;

        // Handle PlainSelect
        PlainSelect ps = select.getPlainSelect();
        if (ps != null) {
            mapPlainSelect(ps, result);
        }

        return result;
    }

    private void mapPlainSelect(PlainSelect ps, org.nasdanika.models.sql.ast.Select result) {
        if (ps.getDistinct() != null) {
            result.setDistinct(true);
        }

        // Select items
        if (ps.getSelectItems() != null) {
            for (SelectItem<?> si : ps.getSelectItems()) {
                org.nasdanika.models.sql.ast.SelectItem item = factory.createSelectItem();
                Expression expr = si.getExpression();
                if (expr instanceof AllColumns) {
                    org.nasdanika.models.sql.ast.AllColumns allCols = factory.createAllColumns();
                    item.setExpression(allCols);
                } else if (expr instanceof AllTableColumns atc) {
                    org.nasdanika.models.sql.ast.AllColumns allCols = factory.createAllColumns();
                    if (atc.getTable() != null) {
                        allCols.setTableName(unquote(atc.getTable().getName()));
                    }
                    item.setExpression(allCols);
                } else {
                    item.setExpression(mapExpression(expr));
                }
                if (si.getAlias() != null) {
                    item.setAlias(si.getAlias().getName());
                }
                result.getSelectItems().add(item);
            }
        }

        // From
        if (ps.getFromItem() != null) {
            FromItem from = mapFromItem(ps.getFromItem());
            if (from != null) {
                result.getFromItems().add(from);
            }
        }

        // Joins
        if (ps.getJoins() != null) {
            for (net.sf.jsqlparser.statement.select.Join j : ps.getJoins()) {
                org.nasdanika.models.sql.ast.Join join = mapJoin(j);
                if (join != null) {
                    result.getJoins().add(join);
                }
            }
        }

        // Where
        if (ps.getWhere() != null) {
            result.setWhere(mapExpression(ps.getWhere()));
        }

        // Group By
        if (ps.getGroupBy() != null && ps.getGroupBy().getGroupByExpressionList() != null) {
            for (Expression expr : ps.getGroupBy().getGroupByExpressionList()) {
                GroupByElement gbe = factory.createGroupByElement();
                gbe.setExpression(mapExpression(expr));
                result.getGroupByElements().add(gbe);
            }
        }

        // Having
        if (ps.getHaving() != null) {
            result.setHaving(mapExpression(ps.getHaving()));
        }

        // Order By
        if (ps.getOrderByElements() != null) {
            for (net.sf.jsqlparser.statement.select.OrderByElement obe : ps.getOrderByElements()) {
                org.nasdanika.models.sql.ast.OrderByElement orderBy = factory.createOrderByElement();
                orderBy.setExpression(mapExpression(obe.getExpression()));
                orderBy.setAscending(obe.isAsc());
                result.getOrderByElements().add(orderBy);
            }
        }

        // Limit
        if (ps.getLimit() != null && ps.getLimit().getRowCount() != null) {
            result.setLimit(mapExpression(ps.getLimit().getRowCount()));
        }

        // Offset
        if (ps.getOffset() != null && ps.getOffset().getOffset() != null) {
            result.setOffset(mapExpression(ps.getOffset().getOffset()));
        }
    }

    private FromItem mapFromItem(net.sf.jsqlparser.statement.select.FromItem fi) {
        if (fi instanceof Table table) {
            TableReference ref = factory.createTableReference();
            ref.setName(unquote(table.getName()));
            if (table.getSchemaName() != null) {
                ref.setSchemaName(unquote(table.getSchemaName()));
            }
            if (fi.getAlias() != null) {
                ref.setAlias(fi.getAlias().getName());
            }
            return ref;
        } else if (fi instanceof ParenthesedSelect ps) {
            org.nasdanika.models.sql.ast.SubSelect sub = factory.createSubSelect();
            sub.setSelect(mapSelectBody(ps));
            if (fi.getAlias() != null) {
                sub.setAlias(fi.getAlias().getName());
            }
            return sub;
        }
        return null;
    }

    private org.nasdanika.models.sql.ast.Join mapJoin(net.sf.jsqlparser.statement.select.Join j) {
        org.nasdanika.models.sql.ast.Join join = factory.createJoin();

        // Determine join type
        if (j.isCross()) {
            join.setType(JoinType.CROSS);
        } else if (j.isFull()) {
            join.setType(JoinType.FULL);
        } else if (j.isLeft()) {
            join.setType(JoinType.LEFT);
        } else if (j.isRight()) {
            join.setType(JoinType.RIGHT);
        } else {
            join.setType(JoinType.INNER);
        }

        // Right side
        if (j.getFromItem() != null) {
            join.setRight(mapFromItem(j.getFromItem()));
        } else if (j.getRightItem() != null) {
            join.setRight(mapFromItem(j.getRightItem()));
        }

        // ON condition
        if (j.getOnExpressions() != null) {
            for (Expression onExpr : j.getOnExpressions()) {
                join.setCondition(mapExpression(onExpr));
                break; // take first
            }
        }

        return join;
    }

    private Statement mapInsert(Insert ins) {
        org.nasdanika.models.sql.ast.Insert result = factory.createInsert();
        if (ins.getTable() != null) {
            result.setTableName(unquote(ins.getTable().getName()));
            if (ins.getTable().getSchemaName() != null) {
                result.setSchemaName(unquote(ins.getTable().getSchemaName()));
            }
        }
        if (ins.getColumns() != null) {
            for (Column col : ins.getColumns()) {
                result.getColumns().add(unquote(col.getColumnName()));
            }
        }

        // Values or Select
        if (ins.getSelect() != null) {
            if (ins.getSelect().getPlainSelect() != null && ins.getSelect().getPlainSelect().getFromItem() == null) {
                // This is VALUES clause represented as select without FROM
                // Map as values
                // JSqlParser represents VALUES as a Select with Values
            }
            // Try to map as a select subquery
            org.nasdanika.models.sql.ast.Select selectModel = mapSelectBody(ins.getSelect());
            result.setSelect(selectModel);
        }

        return result;
    }

    private Statement mapUpdate(Update upd) {
        org.nasdanika.models.sql.ast.Update result = factory.createUpdate();
        if (upd.getTable() != null) {
            result.setTableName(unquote(upd.getTable().getName()));
            if (upd.getTable().getSchemaName() != null) {
                result.setSchemaName(unquote(upd.getTable().getSchemaName()));
            }
        }
        if (upd.getUpdateSets() != null) {
            for (UpdateSet us : upd.getUpdateSets()) {
                if (us.getColumns() != null && us.getValues() != null) {
                    for (int i = 0; i < us.getColumns().size(); i++) {
                        SetClause set = factory.createSetClause();
                        set.setColumn(unquote(us.getColumns().get(i).getColumnName()));
                        if (i < us.getValues().size()) {
                            set.setExpression(mapExpression(us.getValues().get(i)));
                        }
                        result.getSets().add(set);
                    }
                }
            }
        }
        if (upd.getWhere() != null) {
            result.setWhere(mapExpression(upd.getWhere()));
        }
        return result;
    }

    private Statement mapDelete(Delete del) {
        org.nasdanika.models.sql.ast.Delete result = factory.createDelete();
        if (del.getTable() != null) {
            result.setTableName(unquote(del.getTable().getName()));
            if (del.getTable().getSchemaName() != null) {
                result.setSchemaName(unquote(del.getTable().getSchemaName()));
            }
        }
        if (del.getWhere() != null) {
            result.setWhere(mapExpression(del.getWhere()));
        }
        return result;
    }

    /**
     * Map a JSqlParser expression to the AST model expression.
     */
    private org.nasdanika.models.sql.ast.Expression mapExpression(Expression expr) {
        if (expr == null) return null;

        if (expr instanceof Column col) {
            ColumnReference ref = factory.createColumnReference();
            ref.setName(unquote(col.getColumnName()));
            if (col.getTable() != null && col.getTable().getName() != null) {
                ref.setTableName(unquote(col.getTable().getName()));
                if (col.getTable().getSchemaName() != null) {
                    ref.setSchemaName(unquote(col.getTable().getSchemaName()));
                }
            }
            return ref;
        } else if (expr instanceof StringValue sv) {
            Literal lit = factory.createLiteral();
            lit.setValue(sv.getValue());
            lit.setType(LiteralType.STRING);
            return lit;
        } else if (expr instanceof LongValue lv) {
            Literal lit = factory.createLiteral();
            lit.setValue(String.valueOf(lv.getValue()));
            lit.setType(LiteralType.INTEGER);
            return lit;
        } else if (expr instanceof DoubleValue dv) {
            Literal lit = factory.createLiteral();
            lit.setValue(String.valueOf(dv.getValue()));
            lit.setType(LiteralType.FLOAT);
            return lit;
        } else if (expr instanceof NullValue) {
            Literal lit = factory.createLiteral();
            lit.setValue("NULL");
            lit.setType(LiteralType.NULL);
            return lit;
        } else if (expr instanceof Function func) {
            FunctionCall fc = factory.createFunctionCall();
            fc.setName(func.getName());
            if (func.getParameters() != null) {
                for (Expression param : func.getParameters()) {
                    fc.getArguments().add(mapExpression(param));
                }
            }
            if (func.isDistinct()) {
                fc.setDistinct(true);
            }
            return fc;
        } else if (expr instanceof net.sf.jsqlparser.expression.BinaryExpression be) {
            org.nasdanika.models.sql.ast.BinaryExpression binExpr = factory.createBinaryExpression();
            binExpr.setLeft(mapExpression(be.getLeftExpression()));
            binExpr.setRight(mapExpression(be.getRightExpression()));
            binExpr.setOperator(be.getStringExpression());
            return binExpr;
        } else if (expr instanceof Parenthesis p) {
            org.nasdanika.models.sql.ast.Parenthesis paren = factory.createParenthesis();
            paren.setExpression(mapExpression(p.getExpression()));
            return paren;
        } else if (expr instanceof IsNullExpression ine) {
            org.nasdanika.models.sql.ast.IsNullExpression isNull = factory.createIsNullExpression();
            isNull.setExpression(mapExpression(ine.getLeftExpression()));
            isNull.setNot(ine.isNot());
            return isNull;
        } else if (expr instanceof InExpression ie) {
            org.nasdanika.models.sql.ast.InExpression inExpr = factory.createInExpression();
            inExpr.setLeft(mapExpression(ie.getLeftExpression()));
            inExpr.setNot(ie.isNot());
            if (ie.getRightExpression() != null) {
                // Could be a subquery or expression list
                if (ie.getRightExpression() instanceof ParenthesedExpressionList pel) {
                    for (Expression e : pel) {
                        inExpr.getValues().add(mapExpression(e));
                    }
                } else {
                    inExpr.getValues().add(mapExpression(ie.getRightExpression()));
                }
            }
            return inExpr;
        } else if (expr instanceof Between between) {
            BetweenExpression be = factory.createBetweenExpression();
            be.setLeft(mapExpression(between.getLeftExpression()));
            be.setStart(mapExpression(between.getBetweenExpressionStart()));
            be.setEnd(mapExpression(between.getBetweenExpressionEnd()));
            be.setNot(between.isNot());
            return be;
        } else if (expr instanceof ExistsExpression ee) {
            org.nasdanika.models.sql.ast.ExistsExpression exists = factory.createExistsExpression();
            if (ee.getRightExpression() instanceof ParenthesedSelect ps) {
                exists.setSelect(mapSelectBody(ps));
            }
            return exists;
        } else if (expr instanceof CaseExpression ce) {
            org.nasdanika.models.sql.ast.CaseExpression caseExpr = factory.createCaseExpression();
            if (ce.getSwitchExpression() != null) {
                caseExpr.setOperand(mapExpression(ce.getSwitchExpression()));
            }
            if (ce.getWhenClauses() != null) {
                for (WhenClause wc : ce.getWhenClauses()) {
                    org.nasdanika.models.sql.ast.WhenClause whenClause = factory.createWhenClause();
                    whenClause.setCondition(mapExpression(wc.getWhenExpression()));
                    whenClause.setResult(mapExpression(wc.getThenExpression()));
                    caseExpr.getWhenClauses().add(whenClause);
                }
            }
            if (ce.getElseExpression() != null) {
                caseExpr.setElseExpression(mapExpression(ce.getElseExpression()));
            }
            return caseExpr;
        } else if (expr instanceof CastExpression castExpr) {
            org.nasdanika.models.sql.ast.CastExpression cast = factory.createCastExpression();
            cast.setExpression(mapExpression(castExpr.getLeftExpression()));
            if (castExpr.getColDataType() != null) {
                cast.setTargetType(castExpr.getColDataType().getDataType());
            }
            return cast;
        } else if (expr instanceof SignedExpression se) {
            org.nasdanika.models.sql.ast.UnaryExpression unary = factory.createUnaryExpression();
            unary.setOperand(mapExpression(se.getExpression()));
            unary.setOperator(String.valueOf(se.getSign()));
            unary.setPrefix(true);
            return unary;
        } else if (expr instanceof NotExpression ne) {
            org.nasdanika.models.sql.ast.UnaryExpression unary = factory.createUnaryExpression();
            unary.setOperand(mapExpression(ne.getExpression()));
            unary.setOperator("NOT");
            unary.setPrefix(true);
            return unary;
        } else if (expr instanceof ParenthesedSelect ps) {
            SubSelectExpression subExpr = factory.createSubSelectExpression();
            subExpr.setSelect(mapSelectBody(ps));
            return subExpr;
        }

        // Fallback: treat as a literal containing the expression text
        Literal lit = factory.createLiteral();
        lit.setValue(expr.toString());
        lit.setType(LiteralType.STRING);
        return lit;
    }

    /**
     * Remove surrounding quotes/brackets from an identifier.
     */
    private String unquote(String identifier) {
        if (identifier == null) return null;
        if (identifier.startsWith("\"") && identifier.endsWith("\"")) {
            return identifier.substring(1, identifier.length() - 1);
        }
        if (identifier.startsWith("[") && identifier.endsWith("]")) {
            return identifier.substring(1, identifier.length() - 1);
        }
        if (identifier.startsWith("`") && identifier.endsWith("`")) {
            return identifier.substring(1, identifier.length() - 1);
        }
        return identifier;
    }
}
