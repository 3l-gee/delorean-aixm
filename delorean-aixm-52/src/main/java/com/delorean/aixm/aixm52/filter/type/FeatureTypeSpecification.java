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
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeatureTypeSpecification extends AbstractFilterSpecification<AbstractAIXMFeatureType> {
    private final Set<String> targetTypes;

    @Override
    public String getDescription() {
        String typeList = String.join(", ", targetTypes);
        return String.format("%s features with types: [%s] (missing data will %s)", 
            getEvaluationType().getValue(), 
            typeList,
            getNullHandling().getValue());
    }

    public FeatureTypeSpecification(String nullHandling, String evaluationType, String... targetTypes) {
        super(nullHandling, evaluationType);
        setType(FilterType.FEATURE);
        if (targetTypes == null) {
            this.targetTypes = Collections.emptySet();
        } else {
            this.targetTypes = java.util.Arrays.stream(targetTypes)
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureTypeSpecification(String nullHandling, String evaluationType, Collection<String> targetTypes) {
        super(nullHandling, evaluationType);
        setType(FilterType.FEATURE);
        if (targetTypes == null) {
            this.targetTypes = Collections.emptySet();
        } else {
            this.targetTypes = targetTypes.stream()
                    .filter(java.util.Objects::nonNull)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }
    }

    public FeatureTypeSpecification(JsonNode json){
        super(json);
        setType(FilterType.FEATURE);

        if (json == null || json.isNull() || json.isEmpty()) {
            throw new IllegalArgumentException("Cannot construct FeatureTypeSpecification from null or empty JSON.");
        }
        log.atDebug().setMessage("Parsing following json for FeatureTypeSpecification: {}").addArgument(() -> json).log();

        List<String> targetTypesList = new ArrayList<>();
        JsonNode targetTypesNode = json.path("identifiers");

        if (targetTypesNode.isArray()) {
            targetTypesNode.forEach(type -> {
                if (type != null && !type.asText().isBlank()) {
                    targetTypesList.add(type.asText());
                }
            });
        }

        this.targetTypes = targetTypesList.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toSet());

    }

    @Override
    public boolean matchesCriteria(AbstractAIXMFeatureType feature) {
        if (feature == null) {
            return handleNullCase();
        }
        
        String className = feature.getClass().getSimpleName().toLowerCase();
        return targetTypes.contains(className);
    }
}