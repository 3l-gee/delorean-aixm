package com.delorean.aixm.core.filter;

import com.fasterxml.jackson.databind.JsonNode;

public abstract class AbstractFilterSpecification<T> {
    private FilterType type;
    private final EvaluationType evaluationType;
    private final NullHandlingType nullHandling;
    private String description;

    protected AbstractFilterSpecification(String nullHandling, String evaluationType) {
        this.evaluationType = FilterUtility.parseEvaluationType(evaluationType);
        this.nullHandling = FilterUtility.parseNullHandlingType(nullHandling);
    }

    protected AbstractFilterSpecification(JsonNode json) {
        this(
            json != null && json.has("nullHandling") ? json.path("nullHandling").asText() : "MATCH_NONE",
            json != null && json.has("evaluationType") ? json.path("evaluationType").asText() : "INCLUDE"
        );
    }

    public FilterType getType() {
        return type;
    }

    public void setType(FilterType type) {
        this.type = type;
    }

    public EvaluationType getEvaluationType() {
        return evaluationType;
    }

    public NullHandlingType getNullHandling() {
        return nullHandling;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @param target The object being evaluated (e.g., DMEType, DMETimeSlicePropertyType).
     * @return true if the object matches the criteria and should be retained.
     */
    public boolean isSatisfiedBy(T target) {
        boolean isMatched = matchesCriteria(target);
        return evaluationType == EvaluationType.INCLUDE ? isMatched : !isMatched;
    }

    /**
     * Determines if the target object matches the criteria defined by the filter specification.
     * This method should be implemented by subclasses to provide specific matching logic.
     *
     * @param target The object being evaluated (e.g., DMEType, DMETimeSlicePropertyType).
     * @return true if the object matches the criteria; false otherwise.
     */
    public boolean matchesCriteria(T target) {
        return false;
    }

    /**
     * Uniform handler for any missing data point. 
     * A null feature and a null identifier will return the exact same result.
     */
    public boolean handleNullCase() {
        NullHandlingType handling = getNullHandling();
        if (handling == null) {
            throw new IllegalStateException("Null handling strategy is not defined for this filter specification.");
        }

        return switch (handling) {
            case MATCH_ALL          -> true;
            case MATCH_NONE         -> false;
            case THROW_EXCEPTION    -> throw new IllegalStateException("Null value encountered during feature identifier evaluation.");
        };
    }
}