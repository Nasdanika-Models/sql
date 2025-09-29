package org.nasdanika.models.sql.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

public interface Constants {

	/**
	 * Default annotation source
	 */
	String ANNOTATION_SOURCE = "urn:org.nasdanika.models.sql";
	/**
	 * {@link EClass} annotation for catalog name 
	 */
	String CATALOG_ANNOTATION_KEY = "catalog";
	/**
	 * {@link EClass} annotation for schema name 
	 */
	String SCHEMA_ANNOTATION_KEY = "schema";
	/**
	 * {@link EClass} annotation for table name 
	 */
	String TABLE_ANNOTATION_KEY = "table";
	/**
	 * {@link EAttribute} annotation for column name 
	 */
	String COLUMN_ANNOTATION_KEY = "column";
	/**
	 * {@link EReference} annotation for key name 
	 */
	String KEY_ANNOTATION_KEY = "key";
	/**
	 * {@link EClass} annotation for the primary key. Value is a YAML list with primary key columns 
	 */
	String PRIMARY_KEY_ANNOTATION_KEY = "primary-key";
	/**
	 * {@link EAttribute} annotation for column name to use as enum literal value when resolving {@link EEnum} literal. 
	 */
	String ENUM_LITERAL_ANNOTATION_KEY = "enum-literal";
	/**
	 * {@link EAttribute} annotation for column name to use as enum value value when resolving {@link EEnum} literal. 
	 */
	String ENUM_VALUE_ANNOTATION_KEY = "enum-value";
	/**
	 * {@link EReference} annotation - a YAML map of the foreign key column to the primary key column 
	 */
	String KEY_MAPPING_ANNOTATION_KEY = "key-mapping";

}
