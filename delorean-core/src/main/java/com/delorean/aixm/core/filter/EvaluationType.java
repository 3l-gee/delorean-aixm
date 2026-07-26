package com.delorean.aixm.core.filter;

public enum EvaluationType {
    INCLUDE("include"), 
    EXCLUDE("exclude");

    private final String value;

    EvaluationType(String value) {
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