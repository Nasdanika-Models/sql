package org.nasdanika.models.sql.ast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum SortDirection implements Enumerator {
    ASC(0, "ASC", "ASC"),
    DESC(1, "DESC", "DESC");

    public static final int ASC_VALUE = 0;
    public static final int DESC_VALUE = 1;

    private static final SortDirection[] VALUES_ARRAY = new SortDirection[] { ASC, DESC };
    public static final List<SortDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    public static SortDirection get(String literal) {
        for (SortDirection result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    public static SortDirection getByName(String name) {
        for (SortDirection result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    public static SortDirection get(int value) {
        return switch (value) {
            case ASC_VALUE -> ASC;
            case DESC_VALUE -> DESC;
            default -> null;
        };
    }

    private final int value;
    private final String name;
    private final String literal;

    SortDirection(int value, String name, String literal) {
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
