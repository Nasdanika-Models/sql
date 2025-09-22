/**
 */
package org.nasdanika.models.sql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Imported Key Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.sql.SqlPackage#getImportedKeyRule()
 * @model
 * @generated
 */
public enum ImportedKeyRule implements Enumerator {
	/**
	 * The '<em><b>KEY CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_CASCADE(0, "KEY_CASCADE", "KEY_CASCADE"),

	/**
	 * The '<em><b>KEY RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_RESTRICT(1, "KEY_RESTRICT", "KEY_RESTRICT"),

	/**
	 * The '<em><b>KEY SET NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_SET_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_SET_NULL(2, "KEY_SET_NULL", "KEY_SET_NULL"),

	/**
	 * The '<em><b>NO ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ACTION(3, "NO_ACTION", "NO_ACTION"),

	/**
	 * The '<em><b>KEY SET DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_SET_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_SET_DEFAULT(4, "KEY_SET_DEFAULT", "KEY_SET_DEFAULT");

	/**
	 * The '<em><b>KEY CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_CASCADE_VALUE = 0;

	/**
	 * The '<em><b>KEY RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_RESTRICT_VALUE = 1;

	/**
	 * The '<em><b>KEY SET NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_SET_NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_SET_NULL_VALUE = 2;

	/**
	 * The '<em><b>NO ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ACTION_VALUE = 3;

	/**
	 * The '<em><b>KEY SET DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_SET_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_SET_DEFAULT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Imported Key Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImportedKeyRule[] VALUES_ARRAY =
		new ImportedKeyRule[] {
			KEY_CASCADE,
			KEY_RESTRICT,
			KEY_SET_NULL,
			NO_ACTION,
			KEY_SET_DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Imported Key Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImportedKeyRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Imported Key Rule</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportedKeyRule get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportedKeyRule result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imported Key Rule</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportedKeyRule getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportedKeyRule result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imported Key Rule</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportedKeyRule get(int value) {
		switch (value) {
			case KEY_CASCADE_VALUE: return KEY_CASCADE;
			case KEY_RESTRICT_VALUE: return KEY_RESTRICT;
			case KEY_SET_NULL_VALUE: return KEY_SET_NULL;
			case NO_ACTION_VALUE: return NO_ACTION;
			case KEY_SET_DEFAULT_VALUE: return KEY_SET_DEFAULT;
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
	private ImportedKeyRule(int value, String name, String literal) {
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
	
} //ImportedKeyRule
