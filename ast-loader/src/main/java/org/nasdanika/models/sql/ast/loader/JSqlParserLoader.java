package org.nasdanika.models.sql.ast.loader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;

import org.nasdanika.models.sql.ast.AddColumn;
import org.nasdanika.models.sql.ast.AddConstraint;
import org.nasdanika.models.sql.ast.AllColumns;
import org.nasdanika.models.sql.ast.AlterTable;
import org.nasdanika.models.sql.ast.AstNode;
import org.nasdanika.models.sql.ast.BinaryExpression;
import org.nasdanika.models.sql.ast.CaseExpression;
import org.nasdanika.models.sql.ast.CheckConstraint;
import org.nasdanika.models.sql.ast.ColumnDefinition;
import org.nasdanika.models.sql.ast.ColumnReference;
import org.nasdanika.models.sql.ast.CreateIndex;
import org.nasdanika.models.sql.ast.CreateTable;
import org.nasdanika.models.sql.ast.Delete;
import org.nasdanika.models.sql.ast.DropColumn;
import org.nasdanika.models.sql.ast.DropIndex;
import org.nasdanika.models.sql.ast.DropTable;
import org.nasdanika.models.sql.ast.DropView;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.ExpressionList;
import org.nasdanika.models.sql.ast.ForeignKeyConstraint;
import org.nasdanika.models.sql.ast.FromItem;
import org.nasdanika.models.sql.ast.FunctionCall;
import org.nasdanika.models.sql.ast.Insert;
import org.nasdanika.models.sql.ast.Join;
import org.nasdanika.models.sql.ast.JoinType;
import org.nasdanika.models.sql.ast.Literal;
import org.nasdanika.models.sql.ast.OrderByItem;
import org.nasdanika.models.sql.ast.Parenthesis;
import org.nasdanika.models.sql.ast.PrimaryKeyConstraint;
import org.nasdanika.models.sql.ast.Select;
import org.nasdanika.models.sql.ast.SelectItem;
import org.nasdanika.models.sql.ast.SetClause;
import org.nasdanika.models.sql.ast.SortDirection;
import org.nasdanika.models.sql.ast.SourceSpan;
import org.nasdanika.models.sql.ast.SqlAstFactory;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;
import org.nasdanika.models.sql.ast.SubSelect;
import org.nasdanika.models.sql.ast.TableConstraint;
import org.nasdanika.models.sql.ast.TableReference;
import org.nasdanika.models.sql.ast.UnaryExpression;
import org.nasdanika.models.sql.ast.UniqueConstraint;
import org.nasdanika.models.sql.ast.UnparsedStatement;
import org.nasdanika.models.sql.ast.Update;
import org.nasdanika.models.sql.ast.WhenClause;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.DoubleValue;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.NotExpression;
import net.sf.jsqlparser.expression.NullValue;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.parser.ASTNodeAccess;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.parser.SimpleNode;
import net.sf.jsqlparser.parser.Token;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.ReferentialAction;
import net.sf.jsqlparser.statement.alter.AlterExpression;
import net.sf.jsqlparser.statement.alter.AlterOperation;
import net.sf.jsqlparser.statement.create.table.ForeignKeyIndex;
import net.sf.jsqlparser.statement.create.table.Index;
import net.sf.jsqlparser.statement.create.table.NamedConstraint;
import net.sf.jsqlparser.statement.select.AllTableColumns;
import net.sf.jsqlparser.statement.select.GroupByElement;
import net.sf.jsqlparser.statement.select.OrderByElement;
import net.sf.jsqlparser.statement.select.ParenthesedSelect;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Values;
import net.sf.jsqlparser.statement.update.UpdateSet;

/**
 * JSqlParser-based loader that converts SQL text into the parser-neutral EMF AST model.
 * <p>
 * This is the only class with a JSqlParser dependency. A future Apache Calcite loader
 * can target the same model interfaces.
 * </p>
 */
public class JSqlParserLoader implements Function<String, SqlScript> {

    private static final Set<String> COLUMN_SPEC_TERMINATORS = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(
            "CONSTRAINT", "NOT", "NULL", "DEFAULT", "PRIMARY", "KEY", "UNIQUE", "REFERENCES", "CHECK",
            "AUTO_INCREMENT", "IDENTITY", "AS", "COLLATE", "COMMENT", "ENCRYPTED", "MASKED", "GENERATED",
            "VISIBLE", "INVISIBLE", "WITH")));

    private final SqlAstFactory factory = SqlAstFactory.eINSTANCE;

    @Override
    public SqlScript apply(String sqlText) {
        return load(sqlText, null, null);
    }

    public SqlScript load(String sqlText, String sourceUri, String dialect) {
        SqlScript script = factory.createSqlScript();
        if (sourceUri != null) {
            script.setSourceUri(sourceUri);
        }
        if (dialect != null) {
            script.setDialect(dialect);
        }
        script.getLeadingComments().addAll(extractLeadingComments(sqlText));

        for (String statementText : SqlPreprocessor.splitAndNormalize(sqlText)) {
            script.getStatements().add(parseStatement(statementText));
        }

        return script;
    }

    private Statement parseStatement(String sql) {
        try {
            net.sf.jsqlparser.statement.Statement parsed = CCJSqlParserUtil.parse(sql);
            Statement converted = convertStatement(parsed);
            if (converted != null) {
                converted.setRawSql(sql);
                applySourceInfo(converted, parsed);
                return converted;
            }
        } catch (Exception e) {
            return unparsed(sql, e);
        }
        return unparsed(sql, null);
    }

    private Statement convertStatement(net.sf.jsqlparser.statement.Statement statement) {
        try {
            if (statement instanceof net.sf.jsqlparser.statement.create.table.CreateTable createTable) {
                return convertCreateTable(createTable);
            }
            if (statement instanceof net.sf.jsqlparser.statement.alter.Alter alter) {
                return convertAlter(alter);
            }
            if (statement instanceof net.sf.jsqlparser.statement.drop.Drop drop) {
                return convertDrop(drop);
            }
            if (statement instanceof net.sf.jsqlparser.statement.create.view.CreateView createView) {
                return convertCreateView(createView);
            }
            if (statement instanceof net.sf.jsqlparser.statement.create.index.CreateIndex createIndex) {
                return convertCreateIndex(createIndex);
            }
            if (statement instanceof net.sf.jsqlparser.statement.select.Select select) {
                return convertSelect(select);
            }
            if (statement instanceof net.sf.jsqlparser.statement.insert.Insert insert) {
                return convertInsert(insert);
            }
            if (statement instanceof net.sf.jsqlparser.statement.update.Update update) {
                return convertUpdate(update);
            }
            if (statement instanceof net.sf.jsqlparser.statement.delete.Delete delete) {
                return convertDelete(delete);
            }
        } catch (Exception e) {
            if (statement != null) {
                return unparsed(statement.toString(), e);
            }
        }
        return null;
    }

    private CreateTable convertCreateTable(net.sf.jsqlparser.statement.create.table.CreateTable source) {
        CreateTable target = factory.createCreateTable();
        populateQualifiedTable(target, source.getTable());
        target.setIfNotExists(source.isIfNotExists());
        applySourceInfo(target, source);

        if (source.getColumnDefinitions() != null) {
            for (net.sf.jsqlparser.statement.create.table.ColumnDefinition columnDefinition : source.getColumnDefinitions()) {
                safeAdd(target.getColumns(), convertColumnDefinition(columnDefinition));
            }
        }

        if (source.getIndexes() != null) {
            for (Index index : source.getIndexes()) {
                safeAdd(target.getConstraints(), convertTableConstraint(index));
            }
        }

        return target;
    }

    private AlterTable convertAlter(net.sf.jsqlparser.statement.alter.Alter source) {
        AlterTable target = factory.createAlterTable();
        populateQualifiedTable(target, source.getTable());
        applySourceInfo(target, source);

        if (source.getAlterExpressions() != null) {
            for (AlterExpression alterExpression : source.getAlterExpressions()) {
                for (org.nasdanika.models.sql.ast.AlterOperation operation : convertAlterExpression(alterExpression)) {
                    safeAdd(target.getOperations(), operation);
                }
            }
        }

        return target;
    }

    private List<org.nasdanika.models.sql.ast.AlterOperation> convertAlterExpression(AlterExpression source) {
        List<org.nasdanika.models.sql.ast.AlterOperation> result = new ArrayList<>();
        if (source == null || source.getOperation() == null) {
            return result;
        }

        if (source.getOperation() == AlterOperation.ADD) {
            if (source.getColDataTypeList() != null && !source.getColDataTypeList().isEmpty()) {
                for (AlterExpression.ColumnDataType columnDataType : source.getColDataTypeList()) {
                    ColumnDefinition column = convertColumnDefinition(columnDataType);
                    if (column != null) {
                        AddColumn addColumn = factory.createAddColumn();
                        addColumn.setColumn(column);
                        applySourceInfo(addColumn, source);
                        result.add(addColumn);
                    }
                }
            }

            TableConstraint constraint = convertAlterConstraint(source);
            if (constraint != null) {
                AddConstraint addConstraint = factory.createAddConstraint();
                addConstraint.setConstraint(constraint);
                applySourceInfo(addConstraint, source);
                result.add(addConstraint);
            }
        } else if (source.getOperation() == AlterOperation.DROP && source.getColumnName() != null) {
            DropColumn dropColumn = factory.createDropColumn();
            dropColumn.setColumnName(unquoteIdentifier(source.getColumnName()));
            applySourceInfo(dropColumn, source);
            result.add(dropColumn);
        }

        return result;
    }

    private TableConstraint convertAlterConstraint(AlterExpression source) {
        if (source.getIndex() != null) {
            return convertTableConstraint(source.getIndex());
        }

        if (source.getPkColumns() != null && !source.getPkColumns().isEmpty()) {
            PrimaryKeyConstraint primaryKey = factory.createPrimaryKeyConstraint();
            primaryKey.setName(trimToNull(source.getConstraintName()));
            addAll(primaryKey.getColumnNames(), source.getPkColumns());
            applySourceInfo(primaryKey, source);
            return primaryKey;
        }

        if ((source.getUkColumns() != null && !source.getUkColumns().isEmpty()) || source.getUk()) {
            UniqueConstraint uniqueConstraint = factory.createUniqueConstraint();
            uniqueConstraint.setName(firstNonBlank(source.getUkName(), source.getConstraintName()));
            addAll(uniqueConstraint.getColumnNames(), source.getUkColumns());
            applySourceInfo(uniqueConstraint, source);
            return uniqueConstraint;
        }

        if (source.getFkColumns() != null && !source.getFkColumns().isEmpty() && source.getFkSourceTable() != null) {
            ForeignKeyConstraint foreignKey = factory.createForeignKeyConstraint();
            foreignKey.setName(trimToNull(source.getConstraintName()));
            addAll(foreignKey.getColumnNames(), source.getFkColumns());
            foreignKey.setReferencedSchema(trimToNull(source.getFkSourceSchema()));
            foreignKey.setReferencedTable(unquoteIdentifier(source.getFkSourceTable()));
            addAll(foreignKey.getReferencedColumns(), source.getFkSourceColumns());
            foreignKey.setOnDelete(convertReferentialAction(source.getReferentialAction(ReferentialAction.Type.DELETE)));
            foreignKey.setOnUpdate(convertReferentialAction(source.getReferentialAction(ReferentialAction.Type.UPDATE)));
            applySourceInfo(foreignKey, source);
            return foreignKey;
        }

        return null;
    }

    private Statement convertDrop(net.sf.jsqlparser.statement.drop.Drop source) {
        String type = upper(source.getType());
        if ("TABLE".equals(type)) {
            DropTable target = factory.createDropTable();
            populateQualifiedTable(target, source.getName());
            target.setIfExists(hasIfExists(source.getParameters()));
            applySourceInfo(target, source);
            return target;
        }
        if ("VIEW".equals(type)) {
            DropView target = factory.createDropView();
            populateQualifiedView(target, source.getName());
            target.setIfExists(hasIfExists(source.getParameters()));
            applySourceInfo(target, source);
            return target;
        }
        if ("INDEX".equals(type)) {
            DropIndex target = factory.createDropIndex();
            populateQualifiedIndex(target, source.getName());
            populateDropIndexTable(target, source.getParameters());
            applySourceInfo(target, source);
            return target;
        }
        return null;
    }

    private org.nasdanika.models.sql.ast.CreateView convertCreateView(net.sf.jsqlparser.statement.create.view.CreateView source) {
        org.nasdanika.models.sql.ast.CreateView target = factory.createCreateView();
        populateQualifiedView(target, source.getView());
        target.setOrReplace(source.isOrReplace());
        target.setQuery(convertSelect(source.getSelect()));
        applySourceInfo(target, source);
        return target;
    }

    private CreateIndex convertCreateIndex(net.sf.jsqlparser.statement.create.index.CreateIndex source) {
        CreateIndex target = factory.createCreateIndex();
        Index index = source.getIndex();
        if (index != null) {
            target.setIndexName(unquoteIdentifier(index.getName()));
            List<String> nameParts = index.getNameParts();
            if (nameParts != null && nameParts.size() > 1) {
                target.setSchemaName(unquoteIdentifier(nameParts.get(nameParts.size() - 2)));
            }
            target.setUnique(containsWord(index.getType(), "UNIQUE"));
            addAll(target.getColumnNames(), index.getColumnsNames());
        }
        if (source.getTable() != null) {
            if (target.getSchemaName() == null) {
                target.setSchemaName(unquoteIdentifier(source.getTable().getSchemaName()));
            }
            target.setTableName(unquoteIdentifier(source.getTable().getName()));
        }
        applySourceInfo(target, source);
        return target;
    }

    private Select convertSelect(net.sf.jsqlparser.statement.select.Select source) {
        Select target = factory.createSelect();
        applySourceInfo(target, source);

        PlainSelect plainSelect = source == null ? null : source.getPlainSelect();
        if (plainSelect == null && source instanceof PlainSelect ps) {
            plainSelect = ps;
        }
        if (plainSelect == null && source instanceof ParenthesedSelect parenthesedSelect) {
            plainSelect = parenthesedSelect.getPlainSelect();
        }
        if (plainSelect == null) {
            return target;
        }

        target.setDistinct(plainSelect.getDistinct() != null);

        if (plainSelect.getSelectItems() != null) {
            for (net.sf.jsqlparser.statement.select.SelectItem<?> selectItem : plainSelect.getSelectItems()) {
                safeAdd(target.getSelectItems(), convertSelectItem(selectItem));
            }
        }

        safeAdd(target.getFromItems(), convertFromItem(plainSelect.getFromItem()));

        if (plainSelect.getJoins() != null) {
            for (net.sf.jsqlparser.statement.select.Join join : plainSelect.getJoins()) {
                safeAdd(target.getJoins(), convertJoin(join));
            }
        }

        target.setWhere(convertExpression(plainSelect.getWhere()));

        GroupByElement groupBy = plainSelect.getGroupBy();
        if (groupBy != null && groupBy.getGroupByExpressions() != null) {
            for (Object expression : groupBy.getGroupByExpressions().getExpressions()) {
                if (expression instanceof net.sf.jsqlparser.expression.Expression jsqlExpression) {
                    safeAdd(target.getGroupBy(), convertExpression(jsqlExpression));
                }
            }
        }

        target.setHaving(convertExpression(plainSelect.getHaving()));

        if (source.getOrderByElements() != null) {
            for (OrderByElement orderByElement : source.getOrderByElements()) {
                safeAdd(target.getOrderBy(), convertOrderByItem(orderByElement));
            }
        }

        return target;
    }

    private SelectItem convertSelectItem(net.sf.jsqlparser.statement.select.SelectItem<?> source) {
        SelectItem target = factory.createSelectItem();
        applySourceInfo(target, source);

        if (source != null) {
            if (source.getAlias() != null) {
                target.setAlias(source.getAlias().getName());
            }
            Object expression = source.getExpression();
            if (expression instanceof net.sf.jsqlparser.statement.select.AllColumns) {
                target.setAllColumns(true);
                if (expression instanceof AllTableColumns allTableColumns && allTableColumns.getTable() != null) {
                    target.setTableAlias(unquoteIdentifier(allTableColumns.getTable().getName()));
                }
            } else if (expression instanceof net.sf.jsqlparser.expression.Expression jsqlExpression) {
                target.setExpression(convertExpression(jsqlExpression));
            }
        }

        return target;
    }

    private FromItem convertFromItem(net.sf.jsqlparser.statement.select.FromItem source) {
        if (source == null) {
            return null;
        }

        try {
            if (source instanceof Table table) {
                TableReference tableReference = factory.createTableReference();
                tableReference.setSchemaName(unquoteIdentifier(table.getSchemaName()));
                tableReference.setTableName(unquoteIdentifier(table.getName()));
                tableReference.setAlias(aliasName(table.getAlias()));
                applySourceInfo(tableReference, table);
                return tableReference;
            }
            if (source instanceof ParenthesedSelect parenthesedSelect) {
                SubSelect subSelect = factory.createSubSelect();
                subSelect.setAlias(aliasName(parenthesedSelect.getAlias()));
                if (parenthesedSelect.getPlainSelect() != null) {
                    subSelect.setSelect(convertSelect(parenthesedSelect.getPlainSelect()));
                }
                applySourceInfo(subSelect, parenthesedSelect);
                return subSelect;
            }
            if (source instanceof net.sf.jsqlparser.statement.select.Select select) {
                SubSelect subSelect = factory.createSubSelect();
                subSelect.setAlias(aliasName(select.getAlias()));
                subSelect.setSelect(convertSelect(select));
                applySourceInfo(subSelect, select);
                return subSelect;
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }

    private Join convertJoin(net.sf.jsqlparser.statement.select.Join source) {
        Join target = factory.createJoin();
        target.setType(convertJoinType(source));
        target.setRightItem(convertFromItem(source.getRightItem()));
        target.setOnCondition(combineExpressions(source.getOnExpressions()));
        applySourceInfo(target, source);
        return target;
    }

    private JoinType convertJoinType(net.sf.jsqlparser.statement.select.Join source) {
        if (source == null) {
            return JoinType.INNER;
        }
        if (source.isCross()) {
            return JoinType.CROSS;
        }
        if (source.isNatural()) {
            return JoinType.NATURAL;
        }
        if (source.isLeft()) {
            return JoinType.LEFT;
        }
        if (source.isRight()) {
            return JoinType.RIGHT;
        }
        if (source.isFull()) {
            return JoinType.FULL;
        }
        return JoinType.INNER;
    }

    private OrderByItem convertOrderByItem(OrderByElement source) {
        OrderByItem target = factory.createOrderByItem();
        target.setExpression(convertExpression(source == null ? null : source.getExpression()));
        if (source != null && source.isAscDescPresent()) {
            target.setDirection(source.isAsc() ? SortDirection.ASC : SortDirection.DESC);
        }
        applySourceInfo(target, source);
        return target;
    }

    private Insert convertInsert(net.sf.jsqlparser.statement.insert.Insert source) {
        Insert target = factory.createInsert();
        populateQualifiedTable(target, source.getTable());
        applySourceInfo(target, source);

        if (source.getColumns() != null) {
            for (net.sf.jsqlparser.schema.Column column : source.getColumns().getExpressions()) {
                target.getColumnNames().add(unquoteIdentifier(column.getColumnName()));
            }
        }

        Values values = source.getValues();
        if (values != null && values.getExpressions() != null) {
            for (Object expression : values.getExpressions().getExpressions()) {
                if (expression instanceof net.sf.jsqlparser.expression.Expression jsqlExpression) {
                    safeAdd(target.getValues(), convertExpression(jsqlExpression));
                }
            }
        }

        if (source.getSelect() != null && !(source.getSelect() instanceof Values)) {
            target.setSelect(convertSelect(source.getSelect()));
        }

        return target;
    }

    private Update convertUpdate(net.sf.jsqlparser.statement.update.Update source) {
        Update target = factory.createUpdate();
        populateQualifiedTable(target, source.getTable());
        target.setWhere(convertExpression(source.getWhere()));
        applySourceInfo(target, source);

        if (source.getUpdateSets() != null && !source.getUpdateSets().isEmpty()) {
            for (UpdateSet updateSet : source.getUpdateSets()) {
                if (updateSet.getColumns() == null || updateSet.getValues() == null) {
                    continue;
                }
                int size = Math.min(updateSet.getColumns().size(), updateSet.getValues().size());
                for (int i = 0; i < size; i++) {
                    SetClause setClause = factory.createSetClause();
                    net.sf.jsqlparser.schema.Column column = updateSet.getColumn(i);
                    setClause.setColumnName(column == null ? null : unquoteIdentifier(column.getColumnName()));
                    setClause.setValue(convertExpression(updateSet.getValue(i)));
                    applySourceInfo(setClause, updateSet);
                    target.getSets().add(setClause);
                }
            }
        } else if (source.getColumns() != null && source.getExpressions() != null) {
            int size = Math.min(source.getColumns().size(), source.getExpressions().size());
            for (int i = 0; i < size; i++) {
                SetClause setClause = factory.createSetClause();
                setClause.setColumnName(unquoteIdentifier(source.getColumns().get(i).getColumnName()));
                setClause.setValue(convertExpression(source.getExpressions().get(i)));
                applySourceInfo(setClause, source);
                target.getSets().add(setClause);
            }
        }

        return target;
    }

    private Delete convertDelete(net.sf.jsqlparser.statement.delete.Delete source) {
        Delete target = factory.createDelete();
        populateQualifiedTable(target, source.getTable());
        target.setWhere(convertExpression(source.getWhere()));
        applySourceInfo(target, source);
        return target;
    }

    private ColumnDefinition convertColumnDefinition(net.sf.jsqlparser.statement.create.table.ColumnDefinition source) {
        if (source == null) {
            return null;
        }

        ColumnDefinition target = factory.createColumnDefinition();
        target.setName(unquoteIdentifier(source.getColumnName()));
        if (source.getColDataType() != null) {
            target.setDataType(renderDataType(source.getColDataType()));
        }
        applyColumnSpecs(target, source.getColumnSpecs());
        applySourceInfo(target, source);
        return target;
    }

    private void applyColumnSpecs(ColumnDefinition target, List<String> specs) {
        if (target == null || specs == null || specs.isEmpty()) {
            return;
        }

        String pendingConstraintName = null;
        for (int i = 0; i < specs.size(); i++) {
            String token = specs.get(i);
            String upper = upper(token);
            if (upper.isEmpty()) {
                continue;
            }

            if ("CONSTRAINT".equals(upper) && i + 1 < specs.size()) {
                pendingConstraintName = unquoteIdentifier(specs.get(++i));
                continue;
            }

            if ("NOT".equals(upper) && hasToken(specs, i + 1, "NULL")) {
                target.setNullable(Boolean.FALSE);
                i++;
                continue;
            }

            if ("NULL".equals(upper)) {
                target.setNullable(Boolean.TRUE);
                continue;
            }

            if ("DEFAULT".equals(upper)) {
                int next = consumeValueTokens(specs, i + 1);
                target.setDefaultValue(joinTokens(specs.subList(i + 1, next)));
                i = next - 1;
                continue;
            }

            if ("AUTO_INCREMENT".equals(upper) || "IDENTITY".equals(upper)) {
                target.setIdentity(true);
                continue;
            }

            if ("AS".equals(upper)) {
                int next = consumeValueTokens(specs, i + 1);
                target.setComputed(true);
                target.setComputedExpression(joinTokens(specs.subList(i + 1, next)));
                i = next - 1;
                continue;
            }

            if ("PRIMARY".equals(upper) && hasToken(specs, i + 1, "KEY")) {
                PrimaryKeyConstraint primaryKey = factory.createPrimaryKeyConstraint();
                primaryKey.setName(pendingConstraintName);
                primaryKey.getColumnNames().add(target.getName());
                target.getInlineConstraints().add(primaryKey);
                pendingConstraintName = null;
                i++;
                continue;
            }

            if ("UNIQUE".equals(upper)) {
                UniqueConstraint uniqueConstraint = factory.createUniqueConstraint();
                uniqueConstraint.setName(pendingConstraintName);
                uniqueConstraint.getColumnNames().add(target.getName());
                target.getInlineConstraints().add(uniqueConstraint);
                pendingConstraintName = null;
                continue;
            }

            if ("REFERENCES".equals(upper)) {
                ForeignKeyConstraint foreignKey = factory.createForeignKeyConstraint();
                foreignKey.setName(pendingConstraintName);
                foreignKey.getColumnNames().add(target.getName());
                i = populateInlineForeignKey(foreignKey, specs, i + 1);
                target.getInlineConstraints().add(foreignKey);
                pendingConstraintName = null;
                continue;
            }

            if ("CHECK".equals(upper)) {
                int next = consumeValueTokens(specs, i + 1);
                String expressionText = joinTokens(specs.subList(i + 1, next));
                CheckConstraint checkConstraint = factory.createCheckConstraint();
                checkConstraint.setName(pendingConstraintName);
                checkConstraint.setExpressionText(expressionText);
                checkConstraint.setExpression(parseExpression(expressionText));
                target.getInlineConstraints().add(checkConstraint);
                pendingConstraintName = null;
                i = next - 1;
            }
        }
    }

    private TableConstraint convertTableConstraint(Index source) {
        if (source == null) {
            return null;
        }

        try {
            if (source instanceof ForeignKeyIndex foreignKeyIndex) {
                ForeignKeyConstraint target = factory.createForeignKeyConstraint();
                target.setName(trimToNull(foreignKeyIndex.getName()));
                addAll(target.getColumnNames(), foreignKeyIndex.getColumnsNames());
                if (foreignKeyIndex.getTable() != null) {
                    target.setReferencedSchema(unquoteIdentifier(foreignKeyIndex.getTable().getSchemaName()));
                    target.setReferencedTable(unquoteIdentifier(foreignKeyIndex.getTable().getName()));
                }
                addAll(target.getReferencedColumns(), foreignKeyIndex.getReferencedColumnNames());
                target.setOnDelete(firstNonBlank(
                        convertReferentialAction(foreignKeyIndex.getReferentialAction(ReferentialAction.Type.DELETE)),
                        trimToNull(foreignKeyIndex.getOnDeleteReferenceOption())));
                target.setOnUpdate(firstNonBlank(
                        convertReferentialAction(foreignKeyIndex.getReferentialAction(ReferentialAction.Type.UPDATE)),
                        trimToNull(foreignKeyIndex.getOnUpdateReferenceOption())));
                applySourceInfo(target, foreignKeyIndex);
                return target;
            }

            if (source instanceof net.sf.jsqlparser.statement.create.table.CheckConstraint checkSource) {
                CheckConstraint target = factory.createCheckConstraint();
                target.setName(trimToNull(checkSource.getName()));
                if (checkSource.getExpression() != null) {
                    target.setExpression(convertExpression(checkSource.getExpression()));
                    target.setExpressionText(checkSource.getExpression().toString());
                }
                applySourceInfo(target, checkSource);
                return target;
            }

            String type = upper(source.getType());
            if (containsWord(type, "PRIMARY")) {
                PrimaryKeyConstraint target = factory.createPrimaryKeyConstraint();
                target.setName(extractConstraintName(source));
                addAll(target.getColumnNames(), source.getColumnsNames());
                applySourceInfo(target, source);
                return target;
            }
            if (containsWord(type, "UNIQUE")) {
                UniqueConstraint target = factory.createUniqueConstraint();
                target.setName(extractConstraintName(source));
                addAll(target.getColumnNames(), source.getColumnsNames());
                applySourceInfo(target, source);
                return target;
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }

    private Expression parseExpression(String sql) {
        if (sql == null || sql.isBlank()) {
            return null;
        }
        try {
            return convertExpression(CCJSqlParserUtil.parseExpression(sql));
        } catch (JSQLParserException e) {
            return null;
        }
    }

    private Expression convertExpression(net.sf.jsqlparser.expression.Expression source) {
        if (source == null) {
            return null;
        }

        try {
            if (source instanceof net.sf.jsqlparser.schema.Column column) {
                ColumnReference target = factory.createColumnReference();
                target.setSchemaName(unquoteIdentifier(column.getSchemaName()));
                target.setTableName(unquoteIdentifier(column.getTableName()));
                target.setColumnName(unquoteIdentifier(column.getColumnName()));
                applySourceInfo(target, column);
                return target;
            }
            if (source instanceof StringValue stringValue) {
                Literal target = factory.createLiteral();
                target.setValue(stringValue.getValue());
                target.setType("string");
                applySourceInfo(target, stringValue);
                return target;
            }
            if (source instanceof LongValue longValue) {
                Literal target = factory.createLiteral();
                target.setValue(longValue.getStringValue());
                target.setType("long");
                applySourceInfo(target, longValue);
                return target;
            }
            if (source instanceof DoubleValue doubleValue) {
                Literal target = factory.createLiteral();
                target.setValue(Double.toString(doubleValue.getValue()));
                target.setType("double");
                applySourceInfo(target, doubleValue);
                return target;
            }
            if (source instanceof NullValue nullValue) {
                Literal target = factory.createLiteral();
                target.setValue(null);
                target.setType("null");
                applySourceInfo(target, nullValue);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.expression.Function function) {
                FunctionCall target = factory.createFunctionCall();
                List<String> multipartName = function.getMultipartName();
                target.setName(unquoteIdentifier(function.getName()));
                if (multipartName != null && multipartName.size() > 1) {
                    target.setSchemaName(unquoteIdentifier(String.join(".", multipartName.subList(0, multipartName.size() - 1))));
                }
                target.setDistinct(function.isDistinct());
                target.setAllColumns(function.isAllColumns());
                if (function.getParameters() != null) {
                    for (Object argument : function.getParameters().getExpressions()) {
                        if (argument instanceof net.sf.jsqlparser.expression.Expression expression) {
                            safeAdd(target.getArguments(), convertExpression(expression));
                        }
                    }
                }
                applySourceInfo(target, function);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.expression.BinaryExpression binaryExpression) {
                BinaryExpression target = factory.createBinaryExpression();
                target.setLeft(convertExpression(binaryExpression.getLeftExpression()));
                target.setRight(convertExpression(binaryExpression.getRightExpression()));
                target.setOperator(binaryExpression.getStringExpression());
                applySourceInfo(target, binaryExpression);
                return target;
            }
            if (source instanceof NotExpression notExpression) {
                UnaryExpression target = factory.createUnaryExpression();
                target.setOperand(convertExpression(notExpression.getExpression()));
                target.setOperator("NOT");
                target.setPrefix(true);
                applySourceInfo(target, notExpression);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.expression.Parenthesis parenthesis) {
                Parenthesis target = factory.createParenthesis();
                target.setExpression(convertExpression(parenthesis.getExpression()));
                applySourceInfo(target, parenthesis);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.expression.CaseExpression caseExpression) {
                CaseExpression target = factory.createCaseExpression();
                target.setSwitchExpression(convertExpression(caseExpression.getSwitchExpression()));
                target.setElseExpression(convertExpression(caseExpression.getElseExpression()));
                if (caseExpression.getWhenClauses() != null) {
                    for (net.sf.jsqlparser.expression.WhenClause whenClause : caseExpression.getWhenClauses()) {
                        WhenClause targetWhenClause = factory.createWhenClause();
                        targetWhenClause.setCondition(convertExpression(whenClause.getWhenExpression()));
                        targetWhenClause.setResult(convertExpression(whenClause.getThenExpression()));
                        applySourceInfo(targetWhenClause, whenClause);
                        target.getWhenClauses().add(targetWhenClause);
                    }
                }
                applySourceInfo(target, caseExpression);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.statement.select.AllColumns) {
                AllColumns target = factory.createAllColumns();
                applySourceInfo(target, source);
                return target;
            }
            if (source instanceof net.sf.jsqlparser.expression.operators.relational.ExpressionList<?> expressionList) {
                ExpressionList target = factory.createExpressionList();
                for (Object expression : expressionList.getExpressions()) {
                    if (expression instanceof net.sf.jsqlparser.expression.Expression jsqlExpression) {
                        safeAdd(target.getExpressions(), convertExpression(jsqlExpression));
                    }
                }
                applySourceInfo(target, source);
                return target;
            }
        } catch (Exception e) {
            Literal fallback = factory.createLiteral();
            fallback.setValue(source.toString());
            fallback.setType(source.getClass().getSimpleName());
            applySourceInfo(fallback, source);
            return fallback;
        }

        Literal fallback = factory.createLiteral();
        fallback.setValue(source.toString());
        fallback.setType(source.getClass().getSimpleName());
        applySourceInfo(fallback, source);
        return fallback;
    }

    private Expression combineExpressions(Collection<net.sf.jsqlparser.expression.Expression> expressions) {
        if (expressions == null || expressions.isEmpty()) {
            return null;
        }

        Iterator<net.sf.jsqlparser.expression.Expression> iterator = expressions.iterator();
        Expression combined = convertExpression(iterator.next());
        while (iterator.hasNext()) {
            BinaryExpression and = factory.createBinaryExpression();
            and.setLeft(combined);
            and.setRight(convertExpression(iterator.next()));
            and.setOperator("AND");
            combined = and;
        }
        return combined;
    }

    private void applySourceInfo(AstNode target, Object source) {
        if (target == null) {
            return;
        }
        target.setSourceSpan(createSourceSpan(source));
        String comment = extractComment(source);
        if (comment != null && !comment.isBlank()) {
            target.setComment(comment);
        }
    }

    private SourceSpan createSourceSpan(Object source) {
        if (!(source instanceof ASTNodeAccess access)) {
            return null;
        }
        SimpleNode astNode = access.getASTNode();
        if (astNode == null) {
            return null;
        }
        Token first = astNode.jjtGetFirstToken();
        Token last = astNode.jjtGetLastToken();
        if (first == null && last == null) {
            return null;
        }
        SourceSpan span = factory.createSourceSpan();
        if (first != null) {
            span.setStartLine(first.beginLine);
            span.setStartColumn(first.beginColumn);
            span.setStartOffset(0);
        }
        if (last != null) {
            span.setEndLine(last.endLine);
            span.setEndColumn(last.endColumn);
            span.setEndOffset(0);
        }
        return span;
    }

    private String extractComment(Object source) {
        if (!(source instanceof ASTNodeAccess access)) {
            return null;
        }
        SimpleNode astNode = access.getASTNode();
        if (astNode == null) {
            return null;
        }
        Token first = astNode.jjtGetFirstToken();
        if (first == null) {
            return null;
        }
        List<String> comments = new ArrayList<>();
        for (Token special = first.specialToken; special != null; special = special.specialToken) {
            String image = trimToNull(special.image);
            if (image != null) {
                comments.add(image);
            }
        }
        return comments.isEmpty() ? null : String.join("\n", comments);
    }

    private UnparsedStatement unparsed(String sql, Exception exception) {
        UnparsedStatement target = factory.createUnparsedStatement();
        target.setRawSql(sql);
        target.setErrorMessage(exception == null || exception.getMessage() == null
                ? "Failed to parse statement"
                : "Failed to parse statement: " + exception.getMessage());
        return target;
    }

    private void populateQualifiedTable(CreateTable target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedTable(AlterTable target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedTable(Insert target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedTable(Update target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedTable(Delete target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedTable(DropTable target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setTableName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedView(org.nasdanika.models.sql.ast.CreateView target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setViewName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedView(DropView target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setViewName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateQualifiedIndex(DropIndex target, Table table) {
        if (target != null && table != null) {
            target.setSchemaName(unquoteIdentifier(table.getSchemaName()));
            target.setIndexName(unquoteIdentifier(table.getName()));
        }
    }

    private void populateDropIndexTable(DropIndex target, List<String> parameters) {
        if (target == null || parameters == null || parameters.isEmpty()) {
            return;
        }
        for (int i = 0; i < parameters.size(); i++) {
            if ("ON".equalsIgnoreCase(parameters.get(i)) && i + 1 < parameters.size()) {
                String qualifiedName = parameters.get(i + 1);
                int idx = qualifiedName.lastIndexOf('.');
                if (idx >= 0) {
                    target.setSchemaName(firstNonBlank(target.getSchemaName(), unquoteIdentifier(qualifiedName.substring(0, idx))));
                    target.setTableName(unquoteIdentifier(qualifiedName.substring(idx + 1)));
                } else {
                    target.setTableName(unquoteIdentifier(qualifiedName));
                }
                break;
            }
        }
    }

    private String renderDataType(net.sf.jsqlparser.statement.create.table.ColDataType dataType) {
        StringBuilder builder = new StringBuilder();
        builder.append(dataType.getDataType());
        if (dataType.getArgumentsStringList() != null && !dataType.getArgumentsStringList().isEmpty()) {
            builder.append('(').append(String.join(", ", dataType.getArgumentsStringList())).append(')');
        }
        if (dataType.getCharacterSet() != null && !dataType.getCharacterSet().isBlank()) {
            builder.append(" CHARACTER SET ").append(dataType.getCharacterSet());
        }
        if (dataType.getArrayData() != null) {
            for (Integer ignored : dataType.getArrayData()) {
                builder.append("[]");
            }
        }
        return builder.toString();
    }

    private int populateInlineForeignKey(ForeignKeyConstraint target, List<String> specs, int startIndex) {
        if (startIndex >= specs.size()) {
            return startIndex;
        }

        String tableToken = specs.get(startIndex);
        String[] qualifiedName = splitQualifiedName(tableToken);
        target.setReferencedSchema(qualifiedName[0]);
        target.setReferencedTable(qualifiedName[1]);

        int i = startIndex + 1;
        if (i < specs.size()) {
            int next = consumeParenthesizedTokens(specs, i);
            if (next > i) {
                addAll(target.getReferencedColumns(), splitColumnTokens(specs.subList(i, next)));
                i = next;
            }
        }

        while (i < specs.size()) {
            String upper = upper(specs.get(i));
            if ("ON".equals(upper) && i + 2 < specs.size()) {
                String actionType = upper(specs.get(i + 1));
                String actionToken = specs.get(i + 2);
                int consumed = 3;
                String actionUpper = upper(actionToken);
                if (("SET".equals(actionUpper) || "NO".equals(actionUpper)) && i + 3 < specs.size()) {
                    actionToken = actionToken + " " + specs.get(i + 3);
                    consumed = 4;
                }
                String actionValue = normalizeActionToken(actionToken);
                if ("DELETE".equals(actionType)) {
                    target.setOnDelete(actionValue);
                } else if ("UPDATE".equals(actionType)) {
                    target.setOnUpdate(actionValue);
                }
                i += consumed;
            } else if (COLUMN_SPEC_TERMINATORS.contains(upper)) {
                break;
            } else {
                i++;
            }
        }

        return i - 1;
    }

    private int consumeValueTokens(List<String> tokens, int start) {
        int depth = 0;
        for (int i = start; i < tokens.size(); i++) {
            String token = tokens.get(i);
            depth += count(token, '(') - count(token, ')');
            if (depth <= 0 && i > start && COLUMN_SPEC_TERMINATORS.contains(upper(token))) {
                return i;
            }
        }
        return tokens.size();
    }

    private int consumeParenthesizedTokens(List<String> tokens, int start) {
        int depth = 0;
        boolean seenParen = false;
        for (int i = start; i < tokens.size(); i++) {
            String token = tokens.get(i);
            int open = count(token, '(');
            int close = count(token, ')');
            if (open > 0) {
                seenParen = true;
            }
            depth += open - close;
            if (seenParen && depth <= 0) {
                return i + 1;
            }
            if (!seenParen) {
                break;
            }
        }
        return start;
    }

    private List<String> splitColumnTokens(List<String> tokens) {
        if (tokens == null || tokens.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        String joined = joinTokens(tokens).trim();
        if (joined.startsWith("(")) {
            joined = joined.substring(1);
        }
        if (joined.endsWith(")")) {
            joined = joined.substring(0, joined.length() - 1);
        }
        for (String item : joined.split(",")) {
            String value = unquoteIdentifier(item.trim());
            if (!value.isEmpty()) {
                result.add(value);
            }
        }
        return result;
    }

    private String convertReferentialAction(ReferentialAction action) {
        if (action == null || action.getAction() == null) {
            return null;
        }
        return action.getAction().name();
    }

    private String extractConstraintName(Index source) {
        String name = trimToNull(source.getName());
        if (name != null) {
            return unquoteIdentifier(name);
        }
        if (source instanceof NamedConstraint namedConstraint) {
            return trimToNull(namedConstraint.getName());
        }
        return null;
    }

    private boolean hasIfExists(List<String> parameters) {
        if (parameters == null || parameters.isEmpty()) {
            return false;
        }
        for (int i = 0; i < parameters.size() - 1; i++) {
            if ("IF".equalsIgnoreCase(parameters.get(i)) && "EXISTS".equalsIgnoreCase(parameters.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    private List<String> extractLeadingComments(String sqlText) {
        if (sqlText == null || sqlText.isBlank()) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        List<String> lines = Arrays.asList(sqlText.split("\\R", -1));
        boolean inBlock = false;
        StringBuilder block = new StringBuilder();
        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.isEmpty()) {
                if (!result.isEmpty() || inBlock) {
                    continue;
                }
                continue;
            }
            if (inBlock) {
                block.append(line).append('\n');
                if (trimmed.contains("*/")) {
                    result.add(block.toString().trim());
                    block.setLength(0);
                    inBlock = false;
                }
                continue;
            }
            if (trimmed.startsWith("--")) {
                result.add(trimmed);
                continue;
            }
            if (trimmed.startsWith("/*")) {
                block.append(line).append('\n');
                if (trimmed.contains("*/")) {
                    result.add(block.toString().trim());
                    block.setLength(0);
                } else {
                    inBlock = true;
                }
                continue;
            }
            break;
        }
        return result;
    }

    private void addAll(List<String> target, List<String> values) {
        if (target == null || values == null) {
            return;
        }
        for (String value : values) {
            String normalized = unquoteIdentifier(value);
            if (!normalized.isBlank()) {
                target.add(normalized);
            }
        }
    }

    private <T> void safeAdd(List<T> target, T value) {
        if (target != null && value != null) {
            target.add(value);
        }
    }

    private boolean hasToken(List<String> tokens, int index, String expected) {
        return index >= 0 && index < tokens.size() && expected.equalsIgnoreCase(tokens.get(index));
    }

    private String joinTokens(List<String> tokens) {
        if (tokens == null || tokens.isEmpty()) {
            return "";
        }
        StringJoiner joiner = new StringJoiner(" ");
        for (String token : tokens) {
            joiner.add(token);
        }
        return joiner.toString().trim();
    }

    private String normalizeActionToken(String token) {
        String upper = upper(token);
        return switch (upper) {
            case "CASCADE" -> "CASCADE";
            case "RESTRICT" -> "RESTRICT";
            case "NULL", "SET NULL" -> "SET_NULL";
            case "DEFAULT", "SET DEFAULT" -> "SET_DEFAULT";
            case "NO", "NO ACTION" -> "NO_ACTION";
            default -> upper.replace(' ', '_');
        };
    }

    private String aliasName(Alias alias) {
        return alias == null ? null : trimToNull(alias.getName());
    }

    private String[] splitQualifiedName(String token) {
        String normalized = unquoteIdentifier(token);
        int idx = normalized.lastIndexOf('.');
        if (idx < 0) {
            return new String[] { null, normalized };
        }
        return new String[] { unquoteIdentifier(normalized.substring(0, idx)), unquoteIdentifier(normalized.substring(idx + 1)) };
    }

    private int count(String value, char ch) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    private boolean containsWord(String text, String word) {
        return text != null && upper(text).contains(word);
    }

    private String upper(String value) {
        return value == null ? "" : value.trim().toUpperCase(Locale.ROOT);
    }

    private String trimToNull(String value) {
        return value == null || value.isBlank() ? null : value.trim();
    }

    private String firstNonBlank(String... values) {
        if (values == null) {
            return null;
        }
        for (String value : values) {
            if (value != null && !value.isBlank()) {
                return value;
            }
        }
        return null;
    }

    private String unquoteIdentifier(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        if (trimmed.length() >= 2) {
            if ((trimmed.startsWith("\"") && trimmed.endsWith("\""))
                    || (trimmed.startsWith("[") && trimmed.endsWith("]"))
                    || (trimmed.startsWith("`") && trimmed.endsWith("`"))) {
                trimmed = trimmed.substring(1, trimmed.length() - 1);
            }
        }
        return trimmed;
    }
}
