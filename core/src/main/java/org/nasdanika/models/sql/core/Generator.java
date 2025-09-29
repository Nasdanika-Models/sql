package org.nasdanika.models.sql.core;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Base class for generating (Java) sources from SQL metadata
 */
public class Generator extends Configuration {
	
	protected String annotationSource;
	
	public Generator() {
		this(ANNOTATION_SOURCE);
	}

	public Generator(String annotationSource) {
		this.annotationSource = annotationSource;
	}
	
	private static final char UNDERSCORE = '_';
	
	public void setAnnotationDetail(EModelElement modelElement, String key, String value) {
		EAnnotation annotation = modelElement.getEAnnotation(annotationSource);
		if (annotation == null) {
			annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(annotationSource);
			modelElement.getEAnnotations().add(annotation);
		}
		annotation.getDetails().put(key, value);
	}
	
	public String getAnnotationDetail(EModelElement modelElement, String key) {
		EAnnotation annotation = modelElement.getEAnnotation(annotationSource);
		if (annotation == null) {
			return null;
		}
		return annotation.getDetails().get(key);
	}

	public String toJavaName(String dbName, boolean capitalize) {
		List<String> dbNameSegments = new ArrayList<>();
		StringBuilder segmentBuilder = new StringBuilder();
		for (char nc: dbName.toCharArray()) {
			if (Character.isJavaIdentifierPart(nc) && nc != UNDERSCORE) {
				if (segmentBuilder.isEmpty() && !Character.isJavaIdentifierStart(nc)) {
					segmentBuilder.append(UNDERSCORE);
					
				}
				segmentBuilder.append(nc);
			} else {
				if (!segmentBuilder.isEmpty()) {
					dbNameSegments.add(segmentBuilder.toString());
				}
				segmentBuilder = new StringBuilder();
			}
		}
		if (!segmentBuilder.isEmpty()) {
			dbNameSegments.add(segmentBuilder.toString());
		}
		StringBuilder ret = new StringBuilder();
		for (String segment: dbNameSegments) {
			String javaSegment = segment.toLowerCase();
			if (capitalize || !ret.isEmpty()) {
				javaSegment = StringUtils.capitalize(javaSegment);
			}
			ret.append(javaSegment);
		}
		return ret.toString();
	}
	
	public EClassifier getType(int sqlType, boolean isNullable) {
		return switch (sqlType) {
			case Types.ARRAY -> EcorePackage.Literals.ESTRING;
			case Types.BIGINT -> EcorePackage.Literals.EBIG_INTEGER;
			case Types.BINARY -> EcorePackage.Literals.EBYTE_ARRAY;
			case Types.BIT -> isNullable ? EcorePackage.Literals.EBOOLEAN_OBJECT : EcorePackage.Literals.EBOOLEAN;
			case Types.BLOB -> EcorePackage.Literals.EBYTE_ARRAY;
			case Types.BOOLEAN -> isNullable ? EcorePackage.Literals.EBOOLEAN_OBJECT : EcorePackage.Literals.EBOOLEAN;
			case Types.CHAR -> EcorePackage.Literals.ESTRING;
			case Types.CLOB -> EcorePackage.Literals.ESTRING;
			case Types.DATALINK -> EcorePackage.Literals.ESTRING;
			case Types.DATE -> EcorePackage.Literals.EDATE;
			case Types.DECIMAL -> EcorePackage.Literals.EBIG_DECIMAL;
			case Types.DISTINCT -> EcorePackage.Literals.ESTRING;
			case Types.DOUBLE -> isNullable ? EcorePackage.Literals.EDOUBLE_OBJECT : EcorePackage.Literals.EDOUBLE;
			case Types.FLOAT -> isNullable ? EcorePackage.Literals.EFLOAT_OBJECT : EcorePackage.Literals.EFLOAT;
			case Types.INTEGER -> isNullable ? EcorePackage.Literals.EINTEGER_OBJECT : EcorePackage.Literals.EINT;
			case Types.JAVA_OBJECT -> EcorePackage.Literals.ESTRING;
			case Types.LONGNVARCHAR -> EcorePackage.Literals.ESTRING;
			case Types.LONGVARBINARY -> EcorePackage.Literals.ESTRING;
			case Types.LONGVARCHAR -> EcorePackage.Literals.ESTRING;
			case Types.NCHAR -> EcorePackage.Literals.ESTRING;
			case Types.NCLOB -> EcorePackage.Literals.ESTRING;
			case Types.NULL -> EcorePackage.Literals.ESTRING;
			case Types.NUMERIC -> EcorePackage.Literals.EBIG_DECIMAL;
			case Types.NVARCHAR -> EcorePackage.Literals.ESTRING;
			case Types.OTHER -> EcorePackage.Literals.ESTRING;
			case Types.REAL -> isNullable ? EcorePackage.Literals.EDOUBLE_OBJECT : EcorePackage.Literals.EDOUBLE;
			case Types.REF -> EcorePackage.Literals.ESTRING;
			case Types.REF_CURSOR -> EcorePackage.Literals.ESTRING;
			case Types.ROWID -> EcorePackage.Literals.ESTRING;
			case Types.SMALLINT -> isNullable ? EcorePackage.Literals.ESHORT_OBJECT : EcorePackage.Literals.ESHORT;
			case Types.SQLXML -> EcorePackage.Literals.ESTRING;
			case Types.STRUCT -> EcorePackage.Literals.ESTRING;
			case Types.TIME -> EcorePackage.Literals.EDATE;
			case Types.TIME_WITH_TIMEZONE -> EcorePackage.Literals.EDATE;
			case Types.TIMESTAMP -> EcorePackage.Literals.EDATE;
			case Types.TIMESTAMP_WITH_TIMEZONE -> EcorePackage.Literals.EDATE;
			case Types.TINYINT -> isNullable ? EcorePackage.Literals.EBYTE_OBJECT : EcorePackage.Literals.EBYTE;
			case Types.VARBINARY -> EcorePackage.Literals.EBYTE_ARRAY;
			case Types.VARCHAR -> EcorePackage.Literals.ESTRING;
			default -> EcorePackage.Literals.ESTRING;
		};
	}
	
	/**
	 * Creates a list of {@link EAttribute}s from {@link ResultSetMetaData}
	 * @param resultSetMetadata
	 * @return
	 * @throws SQLException 
	 */
	public List<EAttribute> createAttributes(ResultSetMetaData resultSetMetadata) throws SQLException {
		List<EAttribute> ret = new ArrayList<>();
		for (int colIdx = 1; colIdx <= resultSetMetadata.getColumnCount(); ++colIdx) {
			EAttribute eAttr = EcoreFactory.eINSTANCE.createEAttribute();
			String colName = resultSetMetadata.getColumnName(colIdx);
			eAttr.setName(toJavaName(colName, false));
			eAttr.setEType(getType(resultSetMetadata.getColumnType(colIdx), resultSetMetadata.isNullable(colIdx) != ResultSetMetaData.columnNoNulls));
			setAnnotationDetail(eAttr, COLUMN_ANNOTATION_KEY, colName);
			ret.add(eAttr);
		}
		return ret;
	}
	
	/**
	 * Creates a new {@link EClass} with {@link EAttribute}s from {@link ResultSetMetaData}
	 * @param resultSetMetadata
	 * @return
	 * @throws SQLException 
	 */
	public EClass createEClass(ResultSetMetaData resultSetMetadata) throws SQLException {
		EClass ret = EcoreFactory.eINSTANCE.createEClass();
		ret.getEStructuralFeatures().addAll(createAttributes(resultSetMetadata));
		return ret;
	}

}
