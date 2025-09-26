package com.aixm.delorean.core.adapter.type.string;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListDoubleAdapter extends XmlAdapter<String, List<Double>> {

    private static final String SEPARATOR = " ";

    @Override
    public List<Double> unmarshal(String v) {
        if (v == null || v.isEmpty()) {
             return Collections.emptyList();
        } else {
            return Arrays.stream(v.split(SEPARATOR))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Double::valueOf)
                .collect(Collectors.toList());
        }
    }

    @Override
    public String marshal(List<Double> v) {
        if (v == null || v.isEmpty()) {
            return null;
        } else {
            return v.stream()
                .map(d -> d.toString())
                .collect(Collectors.joining(SEPARATOR));
        }
    }
}
