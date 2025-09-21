package org.nasdanika.models.sql.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * {@link EReference} annotation - a YAML map of the foreign key column to the primary key column 
	 */
	String KEY_MAPPING_ANNOTATION_KEY = "keyMapping";

}
