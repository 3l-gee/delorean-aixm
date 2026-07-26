package com.delorean.aixm.core.filter;

public class FilterUtility {

    public static EvaluationType parseEvaluationType(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Evaluation type cannot be null or empty. Valid values are: INCLUDE, EXCLUDE.");
        }

        String trimmed = value.trim();
        for (EvaluationType type : EvaluationType.values()) {
            if (type.getValue().equalsIgnoreCase(trimmed) || type.name().equalsIgnoreCase(trimmed)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Invalid evaluation type: " + value + ". Valid values are: INCLUDE, EXCLUDE.");
    }

    public static FilterType parseFilterType(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Filter type cannot be null or empty. Valid values are: MESSAGE_MEMBER, FEATURE, TIMESLICE.");
        }

        String normalized = value.trim().replace(" ", "_");
        for (FilterType type : FilterType.values()) {
            if (type.getValue().equalsIgnoreCase(normalized) || type.name().equalsIgnoreCase(normalized)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Invalid filter type: " + value + ". Valid values are: MESSAGE_MEMBER, FEATURE, TIMESLICE.");
    }

    public static NullHandlingType parseNullHandlingType(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Null handling type cannot be null or empty. Valid values are: MATCH_ALL, MATCH_NONE, THROW_EXCEPTION.");
        }
        String trimmed = value.trim();
        for (NullHandlingType type : NullHandlingType.values()) {
            if (type.getValue().equalsIgnoreCase(trimmed) || type.name().equalsIgnoreCase(trimmed)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Invalid null handling type: " + value + ". Valid values are: MATCH_ALL, MATCH_NONE, THROW_EXCEPTION.");
    }
    
}
