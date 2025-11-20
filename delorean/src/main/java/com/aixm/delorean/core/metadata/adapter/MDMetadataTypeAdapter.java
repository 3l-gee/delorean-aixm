package com.aixm.delorean.core.metadata.adapter;

import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CodeListValueType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyType;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;

// https://ext.eurocontrol.int/aixm_confluence/display/ACGAMD/Metadata
public class MDMetadataTypeAdapter extends XmlAdapter<MDMetadataType, JsonNode> {

    ObjectMapper objectMapper = new ObjectMapper();

    private JsonNode cicpconverter(CIContactPropertyType cicp){
        if (cicp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode cicpNode = objectMapper.createObjectNode();


    }

    private JsonNode citpconverter(CITelephonePropertyType citp){
        if (citp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode citpNode = objectMapper.createObjectNode();

    }

    private JsonNode clvconverter(CodeListValueType clv) {
        if (clv == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode clvNode = objectMapper.createObjectNode();
        if (clv.getValue() != null) {
            clvNode.put("value", clv.getValue());
        }

        if (clv.getCodeList() != null) {
            clvNode.put("codeList", clv.getCodeList());
        }

        if (clv.getCodeListValue() != null) {
            clvNode.put("codeListValue", clv.getCodeListValue());
        }

        if (clv.getCodeSpace() != null) {
            clvNode.put("codeSpace", clv.getCodeSpace());
        }

        return clvNode;
    }

    private JsonNode cspconverter(CharacterStringPropertyType csp) {
        if (csp == null || csp.getCharacterString() == null) {
            return objectMapper.createObjectNode().nullNode();
        }

        if (csp.getCharacterString() != null && csp.getCharacterString().getValue() != null && csp.getCharacterString().getValue() instanceof String) {
            String value = (String) csp.getCharacterString().getValue();
            return objectMapper.getNodeFactory().textNode(value.toString());

        }

        if (csp.getCharacterString() != null && csp.getCharacterString().getValue() != null && csp.getCharacterString().getValue() instanceof CodeListValueType) {
            CodeListValueType value = (CodeListValueType) csp.getCharacterString().getValue();
            return clvconverter(value);

        }

        return null;

    }



    @Override
    public JsonNode unmarshal(MDMetadataType mdmetadata) {
        if (mdmetadata == null) {
            return null;
        }

        try {
            ObjectNode result = objectMapper.createObjectNode();

            // characterSet
            ObjectNode characterSet = objectMapper.createObjectNode();
            characterSet.set("mdCharacterSetCode", clvconverter(mdmetadata.getCharacterSet().getMDCharacterSetCode()));
            characterSet.set("nilReason", mdmetadata.getCharacterSet().getNilReason() != null ? objectMapper.getNodeFactory().textNode(mdmetadata.getCharacterSet().getNilReason()) : objectMapper.getNodeFactory().nullNode());


            // contact
            ArrayNode contacts = objectMapper.createArrayNode();
            for (CIResponsiblePartyPropertyType contact : mdmetadata.getContact()) {
                CIResponsiblePartyType party = contact.getCIResponsibleParty();

                ObjectNode partyNode = objectMapper.createObjectNode();
                partyNode.set("individualName", cspconverter(party.getIndividualName()));
                partyNode.set("positionName", cspconverter(party.getPositionName()));
                partyNode.set("organisationName", cspconverter(party.getOrganisationName()));
                // partyNode.set("contactInfo", cspconverter(party.getContactInfo().toString()));
                partyNode.set("role", cspconverter(party.getRole()));

                contact.add(partyNode);
            }
            contact.put("organisationName", cspconverter(mdmetadata.getFileIdentifier()));
            contact.put("role", cspconverter(mdmetadata.getFileIdentifier()));
            result.set("contacts", contacts);

            // dateStamp
            // identificationInfo
            // dataQualityInfo
            // dataIntegrity
            // qualityClassification
            // horzUnit
            // vertUnit


            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MDMetadataType marshal(JsonNode v) {
        if (v == null) {
            return null;
        }

        try {
            MDMetadataType result = objectMapper.treeToValue(v, MDMetadataType.class);

            // characterSet
            // contact
            // dateStamp
            // identificationInfo
            // dataQualityInfo
            // dataIntegrity
            // qualityClassification
            // horzUnit
            // vertUnit

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
