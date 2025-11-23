package com.aixm.delorean.core.metadata.adapter;

import java.io.StringReader;
import java.io.StringWriter;

import com.aixm.delorean.core.metadata.helper.MetadataHelper;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
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
