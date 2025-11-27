package com.aixm.delorean.aixm511.xhtml.adapter;

import java.util.List;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import org.w3c.dom.Element;
import com.aixm.delorean.core.xhtml.helper.XHTMLHelper;

public class XHTMLTypeAdapter extends XmlAdapter<List<Element>, String> {

    @Override
    public String unmarshal(List<Element> v) throws Exception {
        if (v == null || v.isEmpty()) {
            return null;
        }

        return XHTMLHelper.parseXhtml(v);
    }

    @Override
    public List<Element> marshal(String v) throws Exception {
        if (v == null || v.isBlank()) {
            return null;
        }

        return XHTMLHelper.printXhtml(v);

    }
    
}
