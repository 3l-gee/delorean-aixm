package com.delorean.aixm.core.filter;

public enum NullHandlingType {
    /**
     * Treat a null value as a match (returns true).
     */
    MATCH_ALL("match all"),
    MATCH_NONE("match none"),
    THROW_EXCEPTION("throw exception");

    private final String value;

    NullHandlingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}