/**
 */
package org.nasdanika.models.sql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deferrability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.sql.SqlPackage#getDeferrability()
 * @model
 * @generated
 */
public enum Deferrability implements Enumerator {
	/**
	 * The '<em><b>INITIALLY DEFERRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALLY_DEFERRED(5, "INITIALLY_DEFERRED", "INITIALLY_DEFERRED"), /**
	 * The '<em><b>INITIALLY IMMEDIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_IMMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALLY_IMMEDIATE(6, "INITIALLY_IMMEDIATE", "INITIALLY_IMMEDIATE"), /**
	 * The '<em><b>NOT DEFERRABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFERRABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_DEFERRABLE(7, "NOT_DEFERRABLE", "NOT_DEFERRABLE")
	;

	/**
	 * The '<em><b>INITIALLY DEFERRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_DEFERRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALLY_DEFERRED_VALUE = 5;

 /**
	 * The '<em><b>INITIALLY IMMEDIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_IMMEDIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALLY_IMMEDIATE_VALUE = 6;

 /**
	 * The '<em><b>NOT DEFERRABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFERRABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_DEFERRABLE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Deferrability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Deferrability[] VALUES_ARRAY =
		new Deferrability[] {
			INITIALLY_DEFERRED,
			INITIALLY_IMMEDIATE,
			NOT_DEFERRABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Deferrability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Deferrability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deferrability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Deferrability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Deferrability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferrability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Deferrability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Deferrability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferrability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Deferrability get(int value) {
		switch (value) {
			case INITIALLY_DEFERRED_VALUE: return INITIALLY_DEFERRED;
			case INITIALLY_IMMEDIATE_VALUE: return INITIALLY_IMMEDIATE;
			case NOT_DEFERRABLE_VALUE: return NOT_DEFERRABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Deferrability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Deferrability
