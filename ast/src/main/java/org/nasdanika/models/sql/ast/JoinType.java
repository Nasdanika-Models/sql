package org.nasdanika.models.sql.ast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum JoinType implements Enumerator {
    INNER(0, "INNER", "INNER"),
    LEFT(1, "LEFT", "LEFT"),
    RIGHT(2, "RIGHT", "RIGHT"),
    FULL(3, "FULL", "FULL"),
    CROSS(4, "CROSS", "CROSS"),
    NATURAL(5, "NATURAL", "NATURAL");

    public static final int INNER_VALUE = 0;
    public static final int LEFT_VALUE = 1;
    public static final int RIGHT_VALUE = 2;
    public static final int FULL_VALUE = 3;
    public static final int CROSS_VALUE = 4;
    public static final int NATURAL_VALUE = 5;

    private static final JoinType[] VALUES_ARRAY = new JoinType[] { INNER, LEFT, RIGHT, FULL, CROSS, NATURAL };
    public static final List<JoinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    public static JoinType get(String literal) {
        for (JoinType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    public static JoinType getByName(String name) {
        for (JoinType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    public static JoinType get(int value) {
        return switch (value) {
            case INNER_VALUE -> INNER;
            case LEFT_VALUE -> LEFT;
            case RIGHT_VALUE -> RIGHT;
            case FULL_VALUE -> FULL;
            case CROSS_VALUE -> CROSS;
            case NATURAL_VALUE -> NATURAL;
            default -> null;
        };
    }

    private final int value;
    private final String name;
    private final String literal;

    JoinType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    @Override
    public String toString() {
        return literal;
    }
}
