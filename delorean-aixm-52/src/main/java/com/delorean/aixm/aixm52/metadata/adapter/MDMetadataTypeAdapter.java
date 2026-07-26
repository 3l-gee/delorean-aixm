package com.delorean.aixm.aixm52.metadata.adapter;

import com.delorean.aixm.core.metadata.helper.MetadataHelper;
import com.delorean.aixm.core.org.gmd.v2007.MDMetadataType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

// https://ext.eurocontrol.int/aixm_confluence/display/ACGAMD/Metadata
public class MDMetadataTypeAdapter extends XmlAdapter<MDMetadataType, JsonNode> {

    ObjectMapper objectMapper = new ObjectMapper();

    // XML -> String (store raw XML)
    @Override 
    public JsonNode unmarshal(MDMetadataType mdmetadata) {
        if (mdmetadata == null) {
            return null; 
        } 

        try { 
            JsonNode parsedMetadata = MetadataHelper.parseMdMetadata(mdmetadata); 
            return parsedMetadata; 
        } catch (Exception e) { throw new RuntimeException(e); 

        } 
    }

    @Override 
    public MDMetadataType marshal(JsonNode v) {
        if (v == null) { 
            return null; 
        } 

        try { 
            // MDMetadataType result = objectMapper.treeToValue(v, MDMetadataType.class);
            return null;
        } catch (Exception e) {
             throw new RuntimeException(e); 
        } 
    } 
}
