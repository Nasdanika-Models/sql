package org.nasdanika.models.sql.core;

public class Configuration implements Constants {

	protected String getCatalogAnnotationKey() {
		return CATALOG_ANNOTATION_KEY;
	}

	protected String getSchemaAnnotationKey() {
		return SCHEMA_ANNOTATION_KEY;
	}

	protected String getTableAnnotationKey() {
		return TABLE_ANNOTATION_KEY;
	}

	protected String getColumnAnnotationKey() {
		return COLUMN_ANNOTATION_KEY;
	}

	protected String getKeyMappingAnnotationKey() {
		return KEY_MAPPING_ANNOTATION_KEY;
	}

}
