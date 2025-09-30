package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
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
public class Connector<T extends EObject> extends Configuration implements Injector<T>, Factory<T> {
	
	protected EClass eClass;

	protected String annotationSource;

	protected Predicate<? super EAttribute> attributePredicate;
	
	public Connector(EClass eClass) {
		this(eClass, ANNOTATION_SOURCE);
	}

	public Connector(EClass eClass, String annotationSource) {
		this(eClass, annotationSource, null);
	}
	
	public Connector(EClass eClass, String annotationSource, Predicate<? super EAttribute> attributePredicate) {
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
	
	public String getEnumLiteral(EModelElement modelElement) {
		return getAnnotationDetail(modelElement, getEnumLiteralAnnotationKey());
	}
	
	public String getEnumValue(EModelElement modelElement) {
		return getAnnotationDetail(modelElement, getEnumValueAnnotationKey());
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
		StringBuilder sb = new StringBuilder();
		if (fullyQualified) {
			String catalog = getCatalog();
			if (!Util.isBlank(catalog)) {
				sb.append(catalog).append(catalogSeparator);
			}
			String schema = getSchema();
			if (!Util.isBlank(schema)) {
				sb.append(schema).append(".");
			}
		}
		sb.append(getTable());
		return sb.toString();
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
	
	/**
	 * Override if {@link EEnum enum} {@link EEnumLiteral literals} do not cover all values 
	 * and there is a "catch all" literal.
	 * @param eAttribute
	 * @param value
	 * @return
	 */
	protected Enumerator getCatchAllEnumLiteralInstance(EAttribute eAttribute, String value) {
		return null;
	}
	
	/**
	 * Override if {@link EEnum enum} {@link EEnumLiteral literals} do not cover all values 
	 * and there is a "catch all" literal.
	 * @param eAttribute
	 * @param value
	 * @return
	 */
	protected Enumerator getCatchAllEnumLiteralInstance(EAttribute eAttribute, int value) {
		return null;
	}
	
	public Injector<EObject> createInjector(EAttribute eAttribute) {
		EDataType type = eAttribute.getEAttributeType();
		if (type instanceof EEnum) {
			String literal = getEnumLiteral(eAttribute);
			if (Util.isBlank(literal)) {
				String valueColumn = getEnumValue(eAttribute);
				if (!Util.isBlank(valueColumn)) {
					return (resultSet, target) -> {					
						int val = resultSet.getInt(valueColumn);
						Enumerator enumLiteralInstance = ((EEnum) type)
								.getELiterals()
								.stream()
								.filter(l -> l.getValue() == val)
								.findFirst()
								.map(EEnumLiteral::getInstance)
								.orElse(getCatchAllEnumLiteralInstance(eAttribute, val));
						target.eSet(eAttribute, enumLiteralInstance);
					};
				}				
			} else {
				String literalColumn = getEnumLiteral(eAttribute);
				if (!Util.isBlank(literalColumn)) {
					return (resultSet, target) -> {					
						String val = resultSet.getString(literalColumn);
						Enumerator enumLiteralInstance = ((EEnum) type)
								.getELiterals()
								.stream().filter(l -> l.getLiteral().equals(val))
								.findFirst()
								.map(EEnumLiteral::getInstance)
								.orElse(getCatchAllEnumLiteralInstance(eAttribute, val));
						target.eSet(eAttribute, enumLiteralInstance);
					};
				}								
			}
		}
		
		String column = getColumn(eAttribute);
		if (Util.isBlank(column)) {
			return null;
		}
		
		return (resultSet, target) -> {
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
				target.eSet(eAttribute, resultSet.getObject(column, type.getInstanceClass()));
			}
		};
	}
	
	@Override
	public void inject(ResultSet resultSet, T target) throws SQLException {		
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
	public T create(ResultSet resultSet) throws SQLException {
		@SuppressWarnings("unchecked")
		T ret = (T) eClass.getEPackage().getEFactoryInstance().create(eClass);
		inject(resultSet, ret);
		return ret;
	}
	
	/**
	 * Populates a reference creating objects of its type. Applicable to homogeneous concrete references
	 * @param resultSet
	 * @param target
	 * @param eReference
	 * @throws SQLException
	 */
	static void loadReference(
			ResultSet resultSet, 
			EObject target, 
			EReference eReference) throws SQLException {
		loadReference(resultSet, target, eReference, ANNOTATION_SOURCE);
	}
		
	/**
	 * Populates a reference creating objects of its type. Applicable to homogeneous concrete references
	 * @param resultSet
	 * @param target
	 * @param eReference
	 * @throws SQLException
	 */
	static void loadReference(
			ResultSet resultSet, 
			EObject target, 
			EReference eReference,
			String annotationSource) throws SQLException {
		loadReference(resultSet, target, eReference, annotationSource, null);
	}
			
	/**
	 * Populates a reference creating objects of its type. Applicable to homogeneous concrete references
	 * @param resultSet
	 * @param target
	 * @param eReference
	 * @throws SQLException
	 */
	static void loadReference(
			ResultSet resultSet, 
			EObject target, 
			EReference eReference,
			String annotationSource, 
			Predicate<? super EAttribute> attributePredicate) throws SQLException {
		EClass refType = eReference.getEReferenceType();
		Connector<EObject> connector = new Connector<>(refType, annotationSource, attributePredicate);
		if (eReference.isMany()) {
			@SuppressWarnings("unchecked")
			Collection<EObject> refVal = (Collection<EObject>) target.eGet(eReference);
			connector.load(resultSet, refVal::add);
		} else {
			target.eSet(eReference, connector.create(resultSet));
		}
	}		

}
