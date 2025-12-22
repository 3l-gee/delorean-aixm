package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gmd.v2007.*;
import com.aixm.delorean.core.org.gco.v2007.*;

import com.aixm.delorean.core.org.gml.v_3_2.TimePeriodType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePositionType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class BasicMetaDataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parseMDScopeCodePropertyType(MDScopeCodePropertyType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDScopeCode() != null) {
            node.set("begin", parseCodeListValueType(value.getMDScopeCode()));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseTimePeriodType(TimePeriodType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getBeginPosition() != null) {
            node.set("begin", parseTimePositionType(value.getBeginPosition()));
        }

        if (value.getEndPosition() != null) {
            node.set("end", parseTimePositionType(value.getBeginPosition()));
        }

        return node;
    }

    public static JsonNode parseTimePositionType(TimePositionType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getValue() != null) {
            node.set("value", objectMapper.getNodeFactory().textNode(value.getValue().getFirst()));
        }

        if (value.getFrame() != null) {
            node.set("frame", objectMapper.getNodeFactory().textNode(value.getFrame()));
        }

        if (value.getCalendarEraName() != null) {
            node.set("calendarEraName", objectMapper.getNodeFactory().textNode(value.getCalendarEraName()));
        }

        if (value.getCalendarEraName() != null) {
            node.set("calendarEraName", objectMapper.getNodeFactory().textNode(value.getCalendarEraName()));
        }

        if (value.getIndeterminatePosition() != null) {
            node.set("indeterminatePosition", objectMapper.getNodeFactory().textNode((value.getIndeterminatePosition().toString())));
        }

        return node;
    }

    public static JsonNode parseMDClassificationCodePropertyType(MDClassificationCodePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDClassificationCode() != null) {
            node.set("mdClassificationCode", parseCodeListValueType(value.getMDClassificationCode()));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseMDRestrictionCodePropertyType(MDRestrictionCodePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDRestrictionCode() != null) {
            node.set("mdRestrictionCode", parseCodeListValueType(value.getMDRestrictionCode()));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseBooleanPropertyType(BooleanPropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getBooleanValue() != null) {
            node.set("value", objectMapper.getNodeFactory().booleanNode(value.getBooleanValue()));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseCaracterStringPropertyType(CharacterStringPropertyType value) {
        if (value == null || value.getCharacterString() == null) {
            return objectMapper.createObjectNode().nullNode();
        }

        if (value.getCharacterString() != null && value.getCharacterString().getValue() != null && value.getCharacterString().getValue() instanceof String) {
            String string = (String) value.getCharacterString().getValue();
            return objectMapper.getNodeFactory().textNode(string.toString());

        }

        if (value.getCharacterString() != null && value.getCharacterString().getValue() != null && value.getCharacterString().getValue() instanceof CodeListValueType) {
            CodeListValueType codeListe = (CodeListValueType) value.getCharacterString().getValue();
            return parseCodeListValueType(codeListe);

        }

        return null;
    }

    public static JsonNode parseCodeListValueType(CodeListValueType value) {
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getValue() != null) {
            node.put("value", value.getValue());
        }

        if (value.getCodeList() != null) {
            node.put("codeList", value.getCodeList());
        }

        if (value.getCodeListValue() != null) {
            node.put("codeListValue", value.getCodeListValue());
        }

        if (value.getCodeSpace() != null) {
            node.put("codeSpace", value.getCodeSpace());
        }

        return node;
    }

    public static JsonNode parseDatePropertyType(DatePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getDate() != null) {
            node.set("date", objectMapper.getNodeFactory().textNode(value.getDate()));
        }  

        if (value.getDateTime() != null) {
            String isoDateTime = value.getDateTime().toXMLFormat();
            node.set("dateTime", objectMapper.getNodeFactory().textNode(isoDateTime));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseDateTimePropertyType(DateTimePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDateTime() != null) {
            String isoDateTime = value.getDateTime().toXMLFormat();
            node.set("dateTime", objectMapper.getNodeFactory().textNode(isoDateTime));
        }

        if (value.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseCIOnlineRessourcePropertyType(CIOnlineResourcePropertyType value) {
        if (value.getCIOnlineResource() != null) {
            return BasicMetaDataHelper.parseCIOnlineRessourceType(value.getCIOnlineResource());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseCIOnlineRessourceType(CIOnlineResourceType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getLinkage() != null) {
            node.set("url", objectMapper.getNodeFactory().textNode(value.getLinkage().getURL()));
        }

        if (value.getProtocol() != null) {
            node.set("protocol", parseCaracterStringPropertyType(value.getProtocol()));
        }

        if (value.getApplicationProfile() != null) {
            node.set("applicationProfile", parseCaracterStringPropertyType(value.getApplicationProfile()));
        }

        if (value.getName() != null) {
            node.set("name", parseCaracterStringPropertyType(value.getName()));
        }

        if (value.getDescription() != null) {
            node.set("description", parseCaracterStringPropertyType(value.getDescription()));
        }

        if (value.getFunction() != null) {
            node.set("function", parseCodeListValueType(value.getFunction().getCIOnLineFunctionCode()));
        }

        return node;
    }

    public static JsonNode parseCIRoleCodePropertyType(CIRoleCodePropertyType circp) {
        if (circp == null) {
           return objectMapper.createObjectNode().nullNode();
        }

        ObjectNode node = objectMapper.createObjectNode();
        if (circp.getCIRoleCode() != null) {
            node.set("code", parseCodeListValueType(circp.getCIRoleCode()));
        }

        if (circp.getNilReason() != null) {
            node.set("nilReason", objectMapper.getNodeFactory().textNode(circp.getNilReason()));

        }
        
        return node;
    }

    public static JsonNode parseCIOnlineRessourcePropertyType(CITelephonePropertyType value) {
        if (value.getCITelephone() != null) {
            return BasicMetaDataHelper.parseCITelephoneType(value.getCITelephone());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseCITelephoneType(CITelephoneType value){
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode voiceArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType voice : value.getVoice()) {
            voiceArray.add(parseCaracterStringPropertyType(voice));
        }
        node.set("voice", voiceArray);

        ArrayNode facsimileArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType facsimile : value.getFacsimile()) {
            facsimileArray.add(parseCaracterStringPropertyType(facsimile));
        }

        node.set("facsimile", facsimileArray);

        return node;
    }

    public static JsonNode parseCIAdressPropertyType(CIAddressPropertyType value) {
        if (value.getCIAddress() != null) {
            return BasicMetaDataHelper.parseCIAdressType(value.getCIAddress());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }
    
    public static JsonNode parseCIAdressType(CIAddressType value){
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode deliveryPointArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType address : value.getDeliveryPoint()) {
            deliveryPointArray.add(parseCaracterStringPropertyType(address));
        }

        node.set("deliveryPoint", deliveryPointArray);

        if (value.getCity() != null) {
            node.set("city", parseCaracterStringPropertyType(value.getCity()));
        }

        if (value.getPostalCode() != null) {
            node.set("postalCode", parseCaracterStringPropertyType(value.getPostalCode()));
        }

        if (value.getCountry() != null) {
            node.set("country", parseCaracterStringPropertyType(value.getCountry()));
        }

        ArrayNode electronicMailAddressArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType email : value.getElectronicMailAddress()) {
            electronicMailAddressArray.add(parseCaracterStringPropertyType(email));
        }

        node.set("electronicMailAddress", electronicMailAddressArray);

        return node;
    }

    
}
