
package com.aixm.delorean.core.adapter.type.string;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListStringAdapter extends XmlAdapter<String, List<String>> {

    private static final String SEPARATOR = " ";

    @Override
    public List<String> unmarshal(String v) {
        if (v == null || v.isEmpty()) {
             return Collections.emptyList();
        } else {
            return Arrays.stream(v.split(SEPARATOR))
            .map(String::trim)
            .collect(Collectors.toList());
        }
    }

    @Override
    public String marshal(List<String> v) {
        if (v == null || v.isEmpty()) {
            return null;
        } else {
            return String.join(SEPARATOR, v);
        }
    }
}
