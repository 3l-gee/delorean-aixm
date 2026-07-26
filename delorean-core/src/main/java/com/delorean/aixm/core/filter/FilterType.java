package com.delorean.aixm.core.filter;

public enum FilterType {
    MESSAGE_MEMBER("message member"),
    FEATURE("feature"),
    TIMESLICE("timeslice");

    private final String value;

    FilterType(String value) {
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
