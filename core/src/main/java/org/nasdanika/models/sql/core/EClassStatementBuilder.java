package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Builds SQL statements and other objects for EMF &lt;-&gt; JDBC interaction using 
 * model annotations
 */
public class EClassStatementBuilder implements Injector<EObject>, Factory<EObject> {
	
	/**
	 * Default annotation source
	 */
	public static final String ANNOTATION_SOURCE = "urn:org.nasdanika.models.sql";
	
	/**
	 * {@link EClass} annotation for catalog name 
	 */
	public static final String CATALOG_ANNOTATION_KEY = "catalog";
	
	protected String getCatalogAnnotationKey() {
		return CATALOG_ANNOTATION_KEY;
	}
	
	/**
	 * {@link EClass} annotation for schema name 
	 */
	public static final String SCHEMA_ANNOTATION_KEY = "schema";
	
	protected String getSchemaAnnotationKey() {
		return SCHEMA_ANNOTATION_KEY;
	}
	
	/**
	 * {@link EClass} annotation for table name 
	 */	
	public static final String TABLE_ANNOTATION_KEY = "table";
	
	protected String getTableAnnotationKey() {
		return TABLE_ANNOTATION_KEY;
	}	
		
	/**
	 * {@link EAttribute} annotation for column name 
	 */	
	public static final String COLUMN_ANNOTATION_KEY = "column";
	
	protected String getColumnAnnotationKey() {
		return COLUMN_ANNOTATION_KEY;
	}	
	
	/**
	 * {@link EReference} annotation - a YAML map of the foreign key column to the primary key column 
	 */	
	public static final String KEY_MAPPING_ANNOTATION_KEY = "keyMapping";
	
	protected String getKeyMappingAnnotationKey() {
		return KEY_MAPPING_ANNOTATION_KEY;
	}

	protected EClass eClass;

	protected String annotationSource;

	protected Predicate<? super EAttribute> attributePredicate;
	
	public EClassStatementBuilder(EClass eClass) {
		this(eClass, ANNOTATION_SOURCE);
	}

	public EClassStatementBuilder(EClass eClass, String annotationSource) {
		this(eClass, annotationSource, null);
	}
	
	public EClassStatementBuilder(EClass eClass, String annotationSource, Predicate<? super EAttribute> attributePredicate) {
		this.eClass = eClass;
		this.annotationSource = annotationSource;
		this.attributePredicate = attributePredicate;
	}
	
	public EAnnotation getAnnotation(EModelElement modelElement) {
		return modelElement == null ? null : modelElement.getEAnnotation(annotationSource);
	}
	
	public String getAnnotationDetail(EModelElement modelElement, String key) {
		return getAnnotationDetail(modelElement, key, null); 
	}
	
	public String getAnnotationDetail(EModelElement modelElement, String key, String defaultValue) {
		EAnnotation ann = getAnnotation(modelElement);
		if (ann == null || !ann.getDetails().containsKey(key)) {
			return defaultValue;
		}
		return ann.getDetails().get(key);
	}
		
	public String getAnnotationDetail(String key) {
		return getAnnotationDetail(key, null); 
	}
	
	public String getAnnotationDetail(String key, String defaultValue) {
		return NcoreUtil.lineage(eClass)
			.stream()
			.map(c -> getAnnotationDetail(c, key))
			.filter(v -> !Util.isBlank(v))
			.findFirst()
			.orElse(defaultValue);
	}
	
	public String getColumn(EModelElement modelElement) {
		return getAnnotationDetail(modelElement, getColumnAnnotationKey());
	}
		
	public String getTable() {
		return getAnnotationDetail(getTableAnnotationKey());
	}
		
	public String getTable(boolean fullyQualified) {
		return getTable(fullyQualified, ".");
	}
		
	public String getTable(boolean fullyQualified, String catalogSeparator) {
		if (fullyQualified) {
			StringBuilder sb = new StringBuilder();
			String catalog = getCatalog();
			if (!Util.isBlank(catalog)) {
				sb.append(catalog).append(catalogSeparator);
			}
			String schema = getSchema();
			if (!Util.isBlank(schema)) {
				if (!sb.isEmpty()) {
					sb.append(".");					
				}
				sb.append(schema);
			}
			if (!sb.isEmpty()) {
				sb.append(".");					
			}
			sb.append(getTable());
		}
		return getTable();
	}
		
	public String getSchema() {
		return getAnnotationDetail(getSchemaAnnotationKey());
	}
	
	public String getCatalog() {
		return getAnnotationDetail(getCatalogAnnotationKey());
	}
	
	public StringBuilder buildQuery(String... extraColumns) {
		return buildQuery(false, null, extraColumns);
	}
	
	public StringBuilder buildQuery(boolean fullyQualified, String catalogSeparator, String... extraColumns) {
		List<String> columns = eClass
			.getEAllAttributes()	
			.stream()
			.filter(a -> attributePredicate == null || attributePredicate.test(a))
			.map(this::getColumn)
			.filter(Objects::nonNull)
			.toList();

		int columnCounter = 0;
		StringBuilder queryBuilder = new StringBuilder("SELECT ");
		for (String col: columns) {
			if (columnCounter++ > 0) {
				queryBuilder.append(", ");
			}
			queryBuilder.append(col);
		}
		for (String col: extraColumns) {
			if (columnCounter++ > 0) {
				queryBuilder.append(", ");
			}
			queryBuilder.append(col);
		}
		queryBuilder
			.append(" FROM ")
			.append(getTable(fullyQualified, catalogSeparator));
		
		return queryBuilder;
	}
	
	public Injector<EObject> createInjector(EAttribute eAttribute) {
		String column = getColumn(eAttribute);
		if (Util.isBlank(column)) {
			return null;
		}
		
		return (resultSet, target) -> {
			EDataType type = eAttribute.getEAttributeType();
			if (type == EcorePackage.Literals.ESTRING) {
				target.eSet(eAttribute, resultSet.getString(column));
			} else if (type == EcorePackage.Literals.EDATE) {
				target.eSet(eAttribute, resultSet.getDate(column));
			} else if (type == EcorePackage.Literals.EINT) {
				target.eSet(eAttribute, resultSet.getInt(column));
			} else if (type == EcorePackage.Literals.EBIG_DECIMAL) {
				target.eSet(eAttribute, resultSet.getBigDecimal(column));
			} else if (type == EcorePackage.Literals.ESHORT) {
				target.eSet(eAttribute, resultSet.getShort(column));
			} else if (type == EcorePackage.Literals.EBOOLEAN) {
				target.eSet(eAttribute, resultSet.getBoolean(column));
			} else if (type == EcorePackage.Literals.EDOUBLE) {
				target.eSet(eAttribute, resultSet.getDouble(column));
			} else if (type == EcorePackage.Literals.ELONG) {
				target.eSet(eAttribute, resultSet.getLong(column));
			} else if (type == EcorePackage.Literals.EFLOAT) {
				target.eSet(eAttribute, resultSet.getFloat(column));
			} else {
				target.eSet(eAttribute, resultSet.getObject(column));
			}
		};
	}
	
	@Override
	public void inject(ResultSet resultSet, EObject target) throws SQLException {		
		if (target != null) {
			List<Injector<EObject>> attributeInjectors = eClass
				.getEAllAttributes()	
				.stream()
				.filter(a -> attributePredicate == null || attributePredicate.test(a))
				.map(this::createInjector)
				.filter(Objects::nonNull)
				.toList();

			for (Injector<EObject> ai: attributeInjectors) {
				ai.inject(resultSet, target);
			}
		}
	}

	@Override
	public EObject create(ResultSet resultSet) throws SQLException {
		EObject ret = eClass.getEPackage().getEFactoryInstance().create(eClass);
		inject(resultSet, ret);
		return ret;
	}

}
