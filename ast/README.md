# SQL AST Module

## Overview

This module provides a **source-level (AST) metamodel** for SQL files, distinct from the existing JDBC-metadata-level schema model.

### Source-AST vs. JDBC-Schema Distinction

| Aspect | JDBC Schema Model (`model/`) | SQL AST Model (`ast/` + `ast-loader/`) |
|--------|------------------------------|----------------------------------------|
| **Input** | Live database connection (JDBC `DatabaseMetaData`) | `.sql` source files (text) |
| **Represents** | Resolved, runtime schema objects | Source-level syntax tree (statements, expressions) |
| **Comments** | Not available | Preserved as model features |
| **View bodies** | Not available (JDBC doesn't expose query text) | Full SELECT subtree captured |
| **Procedure bodies** | Not available | Stored as raw text |
| **Ordering** | Alphabetical/unordered | Source file order preserved |
| **Error tolerance** | N/A (DB guarantees validity) | Unparseable statements kept as `UnparsedStatement` |

The AST model is the input for:
- **DB-less documentation** — generate docs from `.sql` source without a running database
- **Schema drift detection** — diff two versions via EMF Compare using stable match IDs
- **Column-level lineage** — analyze `SELECT` subtrees in views/CTAS
- **Migration folding** — apply ordered `.sql` files to build a resolved schema

The resolved schema model (existing `model/` module) is a **separate, later model-to-model transform** from the AST — not the AST itself.

## Module Structure

```
ast/              - EMF metamodel (Ecore), no parser dependency
ast-loader/       - JSqlParser-based loader, Resource, ResourceFactory
```

### `ast` module
- **Artifact:** `org.nasdanika.models.sql:ast`
- Contains the Ecore metamodel (`model/sql-ast.ecore`) and generated Java model code
- **No parser dependency** — the model is parser-neutral

### `ast-loader` module
- **Artifact:** `org.nasdanika.models.sql:ast-loader`
- Contains the JSqlParser-based loader that maps parsed SQL into the AST model
- Provides `SqlAstResource` (load/save) and `SqlAstResourceFactory` (registered for `.sql`)
- Depends on JSqlParser (≥5.0)

## Usage

### Loading a .sql file

```java
// Register the resource factory
Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
    .put("sql", new SqlAstResourceFactory());

// Register the EPackage
EPackage.Registry.INSTANCE.put(SqlAstPackage.eNS_URI, SqlAstPackage.eINSTANCE);

// Load
ResourceSet resourceSet = new ResourceSetImpl();
Resource resource = resourceSet.getResource(URI.createFileURI("schema.sql"), true);
SqlScript script = (SqlScript) resource.getContents().get(0);

for (Statement stmt : script.getStatements()) {
    if (stmt instanceof CreateTable ct) {
        System.out.println("Table: " + ct.getTableName());
    }
}
```

### Programmatic loading (without Resource)

```java
JSqlParserLoader loader = new JSqlParserLoader();
SqlScript script = loader.load(sqlText, "file:///schema.sql", "tsql");
```

### Save (serialize back to SQL)

```java
resource.save(null); // Writes normalized SQL back
```

> **Note:** Save produces normalized formatting. Byte-exact round-trip is not guaranteed;
> however, the semantic content (statements, structure) is preserved.

## T-SQL Support

The loader includes a preprocessor for MS SQL / T-SQL:
- Splits batches on `GO` separators (line-level, case-insensitive)
- Handles `[bracketed]` identifiers (normalized to double-quoted)
- Unparseable T-SQL constructs (e.g., `MERGE`) are captured as `UnparsedStatement`

## Adding a Calcite Loader (Future)

To add an Apache Calcite-based loader:

1. Create a new Maven module (e.g., `ast-loader-calcite`)
2. Depend on `org.nasdanika.models.sql:ast` (the model) — NOT on `ast-loader`
3. Implement the same `Function<String, SqlScript>` interface
4. Register an alternative `ResourceFactory` for `.sql` or a different extension
5. **Shade Calcite** with relocation (Guava, Avatica) to avoid classpath conflicts

The parser-neutral model is what makes this isolation possible — clients select the parser via Maven dependency; only the loader is parser-specific.

## Metamodel Highlights

- **Root:** `SqlScript` — ordered list of `Statement`s + file metadata
- **Statements:** `CreateTable`, `AlterTable`, `DropTable`, `CreateView`, `DropView`, `CreateIndex`, `DropIndex`, `Select`, `Insert`, `Update`, `Delete`, `UnparsedStatement`
- **Expressions:** `ColumnReference`, `Literal`, `FunctionCall`, `BinaryExpression`, `UnaryExpression`, `Parenthesis`, `CaseExpression`
- **Source spans:** Every node carries optional start/end line/column/offset
- **Comments:** Preserved as model features for documentation generation
- **Soft references:** `ColumnReference` holds qualified-name parts; resolution is a separate pass
