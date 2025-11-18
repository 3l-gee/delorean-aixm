package com.aixm.delorean.core.util.adapter;

import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;


public class MDMetadataTypeAdapter extends XmlAdapter<MDMetadataType, String> {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String unmarshal(MDMetadataType v) {
        if (v == null) {
            return null;
        }

        try {
            String result = objectMapper.writeValueAsString(v);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MDMetadataType marshal(String v) {
        if (v == null) {
            return null;
        }

        try {
            MDMetadataType result = objectMapper.readValue(v, MDMetadataType.class);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }   
}
