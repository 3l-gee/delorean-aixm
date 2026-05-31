package com.aixm.delorean.aixm52.filter.type;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.core.filter.AbstractFilterSpecification;
import com.aixm.delorean.core.org.gml.v_3_2.CodeWithAuthorityType;

public class FeatureIdentifierSpecification implements AbstractFilterSpecification<AbstractAIXMFeatureType> {
    private final Set<String> identifiers;

    public FeatureIdentifierSpecification(String... identifiers) {
        if (identifiers == null) {
            this.identifiers = Collections.emptySet();
        } else {
            this.identifiers = java.util.Arrays.stream(identifiers)
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureIdentifierSpecification(Collection<String> identifiers) {
        if (identifiers == null) {
            this.identifiers = Collections.emptySet();
        } else {
            this.identifiers = identifiers.stream()
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    @Override
    public boolean isSatisfiedBy(AbstractAIXMFeatureType feature) {
        if (feature == null) return false;

        CodeWithAuthorityType identifier = feature.getIdentifier();
        if (identifier == null) return false;

        String value = identifier.getValue();
        if (value == null) return false;

        return identifiers.contains(value.toLowerCase());
    }
}
