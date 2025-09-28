package org.nasdanika.models.sql.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.drawio.Connection;
import org.nasdanika.drawio.Document;
import org.nasdanika.drawio.Layer;
import org.nasdanika.drawio.Model;
import org.nasdanika.drawio.Node;
import org.nasdanika.drawio.Page;
import org.nasdanika.drawio.Root;
import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.Table;

/**
 * Generates Draw.io diagram from database metadata
 */
public class DiagramGenerator {
	
	/**
	 * Space between diagram nodes
	 * @return
	 */
	protected int getDiagramGutter() {
		return 20;
	}

	protected int getDiagramNodeHeight() {
		return 30;
	}

	protected int getDiagramNodeWidth() {
		return 120;
	}
	
	public record SchemaGenerationResult(Map<Table,Node> tableMap, Map<ForeignKey,Connection> foreignKeyMap) {}	
	
	/**
	 * Generates table nodes and foreign key connections for a given schema in a given layer 
	 * @param schema
	 * @param layer
	 */
	public SchemaGenerationResult generateSchemaLayer(
			Schema schema, 
			Layer layer,
			Predicate<Table> tablePredicate) {		
		Map<Table, CompletableFuture<Node>> nodeMap = new HashMap<>();
		Function<Table, CompletableFuture<Node>> nodeProvider = k -> nodeMap.computeIfAbsent(k, kk -> new CompletableFuture<>());
		Function<Table, CompletionStage<Node>> nodeCompletionStageProvider = k -> nodeProvider.apply(k);
		Map<ForeignKey, Connection> foreignKeyMap = new HashMap<>();
		for (Table table: schema.getTables()) {
			if (tablePredicate == null || tablePredicate.test(table)) {
				Node tableNode = generateTableNode(schema, table, layer, nodeCompletionStageProvider, foreignKeyMap::put);
				nodeProvider.apply(table).complete(tableNode);
			}
		}
		Map<Table, Node> tableMap = nodeMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().join()));
		return new SchemaGenerationResult(tableMap, foreignKeyMap);
	}
	
	protected Node generateTableNode(
			Schema schema,
			Table table, 
			Layer layer, 
			Function<Table, CompletionStage<Node>> nodeProvider,
			BiConsumer<ForeignKey, Connection> connectionConsumer) {
		Node diagramNode = layer.createNode();
		diagramNode.setLabel(table.getName());
		
		// Simple initial layout in a grid
		EList<Table> tables = schema.getTables(); 
		int idx = tables.indexOf(table);
		int width = getDiagramNodeWidth();
		int height = getDiagramNodeHeight();
		int gutter = getDiagramGutter();
		int rowSize = (int) Math.sqrt((tables.size() * (height + gutter))/(width + gutter)) ;
		int row = rowSize == 0 ? 0 : idx / rowSize;
		int col = idx - row * rowSize;
		
		diagramNode.getGeometry().setBounds(col * (width + gutter), row * (height + gutter), width, height);
				
		for (ForeignKey importedKey: table.getImportedKeys()) {
			PrimaryKey primaryKey = Objects.requireNonNull(importedKey.getPrimaryKey(), "Primary key is not set for " + schema.getName() + "." + table.getName() + "." + importedKey.getName());
			nodeProvider.apply((Table) primaryKey.eContainer()).thenAccept(pkNode -> {
				Connection connection = createDrawioConnection(layer, importedKey, diagramNode, pkNode);
				connectionConsumer.accept(importedKey, connection);
			});
		}
		
		return diagramNode;	
	}
		
	/**
	 * Override to customize connection creation
	 * @param layer
	 * @param dependency
	 * @param diagramNode
	 * @param targetNode
	 */
	protected Connection createDrawioConnection(
			Layer layer,
			ForeignKey foreignKey,
			org.nasdanika.drawio.Node fkNode,
			org.nasdanika.drawio.Node pkNode) {
		Connection connection = layer.createConnection(fkNode, pkNode);
		connection.setLabel(foreignKey.getName());
		return connection;
	}
	
	public record CatalogGenerationResult(
			Map<Schema,SchemaGenerationResult> schemaResults, 
			Map<Schema,Page> schemaPageMap, 
			Document document) {}

	/**
	 * Generates a {@link Document} from {@link Catalog} with a {@link Page} per {@link Schema} matching the predicate
	 * @param schemaPredicate
	 * @param tablePredicate
	 * @return
	 * @throws ParserConfigurationException 
	 */
	public CatalogGenerationResult generateCatalog(
			Catalog catalog,
			Predicate<Schema> schemaPredicate, 
			Predicate<Table> tablePredicate,
			double layoutWidth, 
			double layoutHeight) throws ParserConfigurationException {
		
		Document document = Document.create(false, null);
		Map<Schema, SchemaGenerationResult> schemaResults = new LinkedHashMap<>();
		Map<Schema, Page> schemaPageMap = new LinkedHashMap<>();
		for (Schema schema: catalog.getSchemas()) {
			if (schemaPredicate == null || schemaPredicate.test(schema)) {
				Page page = document.createPage();
				page.setName(schema.getName());
				
				Model model = page.getModel();
				Root root = model.getRoot();
				Layer backgroundLayer = root.getLayers().get(0);
				org.nasdanika.drawio.Util.forceLayout(root, layoutWidth, layoutHeight);
				
				SchemaGenerationResult schemaResult = generateSchemaLayer(schema, backgroundLayer, tablePredicate);
				schemaResults.put(schema, schemaResult);
				schemaPageMap.put(schema, page);
			}
		}
		return new CatalogGenerationResult(schemaResults, schemaPageMap, document);
	}

}
