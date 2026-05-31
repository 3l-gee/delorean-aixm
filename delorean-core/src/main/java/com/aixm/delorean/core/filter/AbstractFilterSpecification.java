package com.aixm.delorean.core.filter;

public interface AbstractFilterSpecification<T> {
    /**
     * @param target The object being evaluated (e.g., DMEType, DMETimeSlicePropertyType).
     * @return true if the object matches the criteria and should be retained.
     */
    boolean isSatisfiedBy(T target);
}