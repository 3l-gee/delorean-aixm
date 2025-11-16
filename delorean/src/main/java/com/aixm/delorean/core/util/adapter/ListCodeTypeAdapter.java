package com.aixm.delorean.core.util.adapter;

import jakarta.persistence.Converter;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.CodeType;

@Converter
public class ListCodeTypeAdapter extends XmlAdapter<List<CodeType>, String[]> {

    @Override
    public String[] unmarshal(List<CodeType> list) {
        if (list == null) {
            return null;
        }

        return list.stream()
            .limit(32)
            .map(code -> {
                String cs = code.getCodeSpace();
                String val = code.getValue();
                if (cs == null) cs = "";
                if (val == null) val = "";
                return cs + ":" + val;
            })
            .toArray(String[]::new);
    }

    @Override
    public List<CodeType> marshal(String[] array) {
        if (array == null) return null;

        List<CodeType> list = new ArrayList<>(array.length);

        for (String s : array) {
            if (s == null) continue;

            String cs = null;
            String val = s;

            int idx = s.indexOf(':');
            if (idx >= 0) {
                cs = s.substring(0, idx);
                val = s.substring(idx + 1);
            }

            CodeType c = new CodeType();
            c.setCodeSpace(cs == null || cs.isEmpty() ? null : cs);
            c.setValue(val);
            list.add(c);
        }

        return list;
    }
}
