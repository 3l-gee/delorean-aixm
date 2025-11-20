package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CodeListValueType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyPropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyType;
import com.aixm.delorean.core.org.gmd.v2007.CITelephonePropertyType;
import com.aixm.delorean.core.org.gmd.v2007.CIRoleCodePropertyType;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MetadataHelper {

    ObjectMapper objectMapper = new ObjectMapper();

    public JsonNode parseMdMetadata (MDMetadataType mdMetadata) {
        if (mdMetadata == null) {
            return null;
        }

        try {
            ObjectNode result = objectMapper.createObjectNode();

            // characterSet
            ObjectNode characterSet = objectMapper.createObjectNode();
            characterSet.set("mdCharacterSetCode", parseclv(mdMetadata.getCharacterSet().getMDCharacterSetCode()));
            characterSet.set("nilReason", mdMetadata.getCharacterSet().getNilReason() != null ? objectMapper.getNodeFactory().textNode(mdMetadata.getCharacterSet().getNilReason()) : objectMapper.getNodeFactory().nullNode());

            // contact
            for (CIResponsiblePartyPropertyType crpp : mdMetadata.getContact()) {
                CIResponsiblePartyType crp = crpp.getCIResponsibleParty();
                if (crp != null) {
                    ObjectNode crpNode = objectMapper.createObjectNode();
                    crpNode.set("role", parsecircp(crp.getRole()));
                    crpNode.set("individualName", parsecsp(crp.getIndividualName()));
                    crpNode.set("organisationName", parsecsp(crp.getOrganisationName()));
                    crpNode.set("positionName", parsecsp(crp.getPositionName()));
                    if (crp.getContactInfo() != null && crp.getContactInfo().getCIContact() != null) {
                        crpNode.set("contactInfo", parseicip(crp.getContactInfo().getCIContact()));
                    }

                    // add to result
                    if (!result.has("contact")) {
                        ArrayNode contactArray = objectMapper.createArrayNode();
                        result.set("contact", contactArray);
                    }
                    ((ArrayNode) result.get("contact")).add(crpNode);
                }
            }
            // dateStamp
            // identificationInfo
            // dataQualityInfo
            // dataIntegrity
            // qualityClassification
            // horzUnit
            // vertUnit
        
    }

    private JsonNode parsecircp(CIRoleCodePropertyType circp) {
        if (circp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode circpNode = objectMapper.createObjectNode();
        circpNode.set("code", parseclv(circp.getCIRoleCode()));
        circpNode.set("nilReason", circp.getNilReason() != null ? objectMapper.getNodeFactory().textNode(circp.getNilReason()) : objectMapper.getNodeFactory().nullNode());

        return circpNode;
    }

    private JsonNode parsecsp(CharacterStringPropertyType csp) {
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

    private JsonNode parseicip(CIContactPropertyType cicp){
        if (cicp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (cicp.getCIContact() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CIContactType cic = cicp.getCIContact();


        ObjectNode cicpNode = objectMapper.createObjectNode();

    }

    private JsonNode parsecitp (CITelephonePropertyType citp){
        if (citp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        if (citp.getCITelephone() == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        CITelephoneType cit = citp.getCITelephone();

        ObjectNode citpNode = objectMapper.createObjectNode();

    }

    private JsonNode parseclv(CodeListValueType clv) {
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




    public MDMetadataType printMdMetadata (JsonNode mdMetadataNode) {

    }
    
}
