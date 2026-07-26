package com.delorean.aixm.aixm52.filter.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.delorean.aixm.aixm52.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.core.filter.AbstractFilterSpecification;
import com.delorean.aixm.core.filter.FilterType;
import com.delorean.aixm.core.org.gml.v_3_2.CodeWithAuthorityType;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeatureIdentifierSpecification extends AbstractFilterSpecification<AbstractAIXMFeatureType> {
    private final Set<String> identifiers;

    @Override
    public String getDescription() {
        String identifierList = String.join(", ", identifiers);
        return String.format("%s features with identifiers: [%s] (missing data will %s)", 
            getEvaluationType().getValue(), 
            identifierList,
            getNullHandling().getValue());
    }

    public FeatureIdentifierSpecification(String nullHandling, String evaluationType, String... identifiers) {
        super(nullHandling, evaluationType);
        setType(FilterType.FEATURE);
        if (identifiers == null) {
            this.identifiers = Collections.emptySet();
        } else {
            this.identifiers = java.util.Arrays.stream(identifiers)
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureIdentifierSpecification(String nullHandling, String evaluationType, Collection<String> identifiers) {
        super(nullHandling, evaluationType);
        setType(FilterType.FEATURE);
        if (identifiers == null) {
            this.identifiers = Collections.emptySet();
        } else {
            this.identifiers = identifiers.stream()
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureIdentifierSpecification(JsonNode json){
        super(json);
        setType(FilterType.FEATURE);

        if (json == null || json.isNull() || json.isEmpty()) {
            throw new IllegalArgumentException("Cannot construct FeatureIdentifierSpecification from null or empty JSON.");
        }

        log.atDebug().setMessage("Parsing following json for FeatureIdentifierSpecification: {}").addArgument(() -> json).log();

        List<String> identifiersList = new ArrayList<>();
        JsonNode identifiersNode = json.path("identifiers");

        if (identifiersNode.isArray()) {
            identifiersNode.forEach(identifier -> {
                if (identifier != null && !identifier.asText().isBlank()) {
                    identifiersList.add(identifier.asText());
                }
            });
        }

        this.identifiers = identifiersList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean matchesCriteria(AbstractAIXMFeatureType feature) {
        if (feature == null) {
            return handleNullCase();
        }

        CodeWithAuthorityType identifier = feature.getIdentifier();
        if (identifier == null) {
            return handleNullCase();
        }

        String value = identifier.getValue();
        if (value == null) {
            return handleNullCase();
        }

        return identifiers.contains(value.toLowerCase());
    }


}
