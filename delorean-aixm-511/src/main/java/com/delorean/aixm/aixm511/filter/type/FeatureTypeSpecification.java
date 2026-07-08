package com.delorean.aixm.aixm511.filter.type;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import com.delorean.aixm.aixm511.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.core.filter.AbstractFilterSpecification;

public class FeatureTypeSpecification implements AbstractFilterSpecification<AbstractAIXMFeatureType> {
    private final Set<String> targetTypes;

    public FeatureTypeSpecification(String... targetTypes) {
        if (targetTypes == null) {
            this.targetTypes = Collections.emptySet();
        } else {
            this.targetTypes = java.util.Arrays.stream(targetTypes)
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureTypeSpecification(Collection<String> targetTypes) {
        if (targetTypes == null) {
            this.targetTypes = Collections.emptySet();
        } else {
            this.targetTypes = targetTypes.stream()
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    @Override
    public boolean isSatisfiedBy(AbstractAIXMFeatureType feature) {
        if (feature == null) return false;
        
        if (targetTypes.isEmpty()) return true;
        
        String className = feature.getClass().getSimpleName().toLowerCase();
        return targetTypes.contains(className);
    }
}