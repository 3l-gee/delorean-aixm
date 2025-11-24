package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CodeListValueType;
import com.aixm.delorean.core.org.gmd.v2007.CIAddressPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIAddressType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyType;
import com.aixm.delorean.core.org.gmd.v2007.CITelephonePropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CITelephoneType;
import com.aixm.delorean.core.org.gmd.v2007.CIRoleCodePropertyType;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.aixm.delorean.core.org.gmd.v2007.CIOnlineResourcePropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIOnlineResourceType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

// https://ext.eurocontrol.int/aixm_confluence/display/ACGAMD/Metadata
public class MetadataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parseMdMetadata (MDMetadataType mdMetadata) {
        if (mdMetadata == null) {
            return null;
        }

        ObjectNode result = objectMapper.createObjectNode();

        // characterSet
        result.set("characterSet", parseclv(mdMetadata.getCharacterSet().getMDCharacterSetCode()));

        // contact
        ArrayNode contactArray = objectMapper.createArrayNode();
        for (CIResponsiblePartyPropertyType crpp : mdMetadata.getContact()) {
            CIResponsiblePartyType crp = crpp.getCIResponsibleParty();
            if (crp != null) {
                ObjectNode crpNode = objectMapper.createObjectNode();

                if (crp.getIndividualName() != null) {
                    crpNode.set("individualName", parsecsp(crp.getIndividualName()));
                } else {
                    crpNode.set("individualName", objectMapper.getNodeFactory().nullNode());
                }

                if (crp.getOrganisationName() != null) {
                    crpNode.set("organisationName", parsecsp(crp.getOrganisationName()));
                } else {
                    crpNode.set("organisationName", objectMapper.getNodeFactory().nullNode());
                }

                if (crp.getPositionName() != null) {
                    crpNode.set("positionName", parsecsp(crp.getPositionName()));
                } else {
                    crpNode.set("positionName", objectMapper.getNodeFactory().nullNode());
                }

                if (crp.getContactInfo() != null) {
                    crpNode.set("contactInfo", parseicip(crp.getContactInfo()));
                } else {
                    crpNode.set("contactInfo", objectMapper.getNodeFactory().nullNode());
                }

                if (crp.getRole() != null) {
                    crpNode.set("role", parsecircp(crp.getRole()));
                } else {
                    crpNode.set("role", objectMapper.getNodeFactory().nullNode());
                }

                contactArray.add(crpNode);
            }
        }

        result.set("contact", contactArray);


        // dateStamp
        // identificationInfo
        // dataQualityInfo
        // dataIntegrity
        // qualityClassification
        // horzUnit
        // vertUnit
        
        return result;
    }

    private static JsonNode parsecircp(CIRoleCodePropertyType circp) {
        if (circp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode circpNode = objectMapper.createObjectNode();
        circpNode.set("code", parseclv(circp.getCIRoleCode()));
        circpNode.set("nilReason", circp.getNilReason() != null ? objectMapper.getNodeFactory().textNode(circp.getNilReason()) : objectMapper.getNodeFactory().nullNode());

        return circpNode;
    }

    private static JsonNode parseicip(CIContactPropertyType cicp){
        if (cicp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (cicp.getCIContact() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CIContactType cic = cicp.getCIContact();
        ObjectNode cicpNode = objectMapper.createObjectNode();
        if (cic.getPhone() != null) {
            cicpNode.set("phone", parsecitp(cic.getPhone()));
        }

        if (cic.getAddress() != null) {
            cicpNode.set("address", parseCiap(cic.getAddress()));
        }

        if (cic.getOnlineResource() != null) {
            cicpNode.set("onlineResource", parseciorp(cic.getOnlineResource()));
        }

        if (cic.getHoursOfService() != null) {
            cicpNode.set("hoursOfService", parsecsp(cic.getHoursOfService()));
        }

        if (cic.getContactInstructions() != null) {
            cicpNode.set("contactInstructions", parsecsp(cic.getContactInstructions()));
        }

        return cicpNode;

    }

    private static JsonNode parseciorp (CIOnlineResourcePropertyType ciorp){
        if (ciorp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (ciorp.getCIOnlineResource() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CIOnlineResourceType cior = ciorp.getCIOnlineResource();
        ObjectNode ciorpNode = objectMapper.createObjectNode();

        if (cior.getLinkage() != null) {
            ciorpNode.set("url", objectMapper.getNodeFactory().textNode(cior.getLinkage().getURL()));
        }

        if (cior.getProtocol() != null) {
            ciorpNode.set("protocol", parsecsp(cior.getProtocol()));
        }

        if (cior.getApplicationProfile() != null) {
            ciorpNode.set("applicationProfile", parsecsp(cior.getApplicationProfile()));
        }

        if (cior.getName() != null) {
            ciorpNode.set("name", parsecsp(cior.getName()));
        }

        if (cior.getDescription() != null) {
            ciorpNode.set("description", parsecsp(cior.getDescription()));
        }

        if (cior.getFunction() != null) {
            ciorpNode.set("function", parseclv(cior.getFunction().getCIOnLineFunctionCode()));
        }

        return ciorpNode;
    }

    private static JsonNode parsecitp (CITelephonePropertyType citp){
        if (citp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (citp.getCITelephone() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CITelephoneType cit = citp.getCITelephone();
        ObjectNode citpNode = objectMapper.createObjectNode();

        ArrayNode voiceArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType voice : cit.getVoice()) {
            voiceArray.add(parsecsp(voice));
        }
        citpNode.set("voice", voiceArray);

        ArrayNode facsimileArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType facsimile : cit.getFacsimile()) {
            facsimileArray.add(parsecsp(facsimile));
        }

        citpNode.set("facsimile", facsimileArray);

        return citpNode;
    }

    private static JsonNode parseCiap (CIAddressPropertyType ciap){
        if (ciap == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (ciap.getCIAddress() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CIAddressType cia = ciap.getCIAddress();
        ObjectNode ciapNode = objectMapper.createObjectNode();

        ArrayNode deliveryPointArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType address : cia.getDeliveryPoint()) {
            deliveryPointArray.add(parsecsp(address));
        }

        ciapNode.set("deliveryPoint", deliveryPointArray);

        if (cia.getCity() != null) {
            ciapNode.set("city", parsecsp(cia.getCity()));
        }

        if (cia.getPostalCode() != null) {
            ciapNode.set("postalCode", parsecsp(cia.getPostalCode()));
        }

        if (cia.getCountry() != null) {
            ciapNode.set("country", parsecsp(cia.getCountry()));
        }

        ArrayNode electronicMailAddressArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType email : cia.getElectronicMailAddress()) {
            electronicMailAddressArray.add(parsecsp(email));
        }

        ciapNode.set("electronicMailAddress", electronicMailAddressArray);

        return ciapNode;
    }

    private static JsonNode parseclv(CodeListValueType clv) {
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

    private static JsonNode parsecsp(CharacterStringPropertyType csp) {
        if (csp == null || csp.getCharacterString() == null) {
            return objectMapper.createObjectNode().nullNode();
        }

        if (csp.getCharacterString() != null && csp.getCharacterString().getValue() != null && csp.getCharacterString().getValue() instanceof String) {
            String value = (String) csp.getCharacterString().getValue();
            return objectMapper.getNodeFactory().textNode(value.toString());

        }

        if (csp.getCharacterString() != null && csp.getCharacterString().getValue() != null && csp.getCharacterString().getValue() instanceof CodeListValueType) {
            CodeListValueType value = (CodeListValueType) csp.getCharacterString().getValue();
            return parseclv(value);

        }

        return null;

    }

    public static MDMetadataType printMdMetadata (JsonNode mdMetadataNode) {

        return null;
    }
    
}
