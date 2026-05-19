package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gmd.v2007.*;
import com.aixm.delorean.core.org.gco.v2007.*;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.aixm.delorean.core.org.gml.v_3_2.TimePeriodType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePositionType;
import com.aixm.delorean.core.org.gml.v_3_2.TimeIndeterminateValueType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class BasicMetaDataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();


    private static final QName CHAR_STRING_QNAME = new QName("http://www.isotc211.org/2005/gco", "CharacterString");

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

    public static MDScopeCodePropertyType printMDScopeCodePropertyType(JsonNode node) {
        MDScopeCodePropertyType value = new MDScopeCodePropertyType();

        if (node.has("mdScopeCode")) {
            value.setMDScopeCode(printCodeListValueType(node.get("mdScopeCode")));
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
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

    public static TimePeriodType printTimePeriodType(JsonNode node) {
        TimePeriodType value = new TimePeriodType();

        if (node.has("begin")) {
            value.setBeginPosition(printTimePositionType(node.get("begin")));
        }

        if (node.has("end")) {
            value.setEndPosition(printTimePositionType(node.get("end")));
        }

        return value;
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

    private static TimePositionType printTimePositionType(JsonNode node) {
        TimePositionType value = new TimePositionType();

        if (node.has("value")) {
            value.setValue(java.util.Collections.singletonList(node.get("value").asText()));
        }

        if (node.has("frame")) {
            value.setFrame(node.get("frame").asText());
        }

        if (node.has("calendarEraName")) {
            value.setCalendarEraName(node.get("calendarEraName").asText());
        }

        if (node.has("indeterminatePosition")) {
            value.setIndeterminatePosition(TimeIndeterminateValueType.fromValue(node.get("indeterminatePosition").asText()));
        }

        return value;
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

    public static MDClassificationCodePropertyType printMDClassificationCodePropertyType(JsonNode node) {
        MDClassificationCodePropertyType value = new MDClassificationCodePropertyType();

        if (node.has("mdClassificationCode")) {
            value.setMDClassificationCode(printCodeListValueType(node.get("mdClassificationCode")));
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
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

    public static MDRestrictionCodePropertyType printMDRestrictionCodePropertyType(JsonNode node) {
        MDRestrictionCodePropertyType value = new MDRestrictionCodePropertyType();

        if (node.has("mdRestrictionCode")) {
            value.setMDRestrictionCode(printCodeListValueType(node.get("mdRestrictionCode")));
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
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

    public static BooleanPropertyType printBooleanPropertyType(JsonNode node) {
        BooleanPropertyType value = new BooleanPropertyType();

        if (node.has("value")) {
            value.setBooleanValue(node.get("value").asBoolean());
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
    }

    public static JsonNode parseCharacterStringPropertyType(CharacterStringPropertyType value) {
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

    public static CharacterStringPropertyType printCharacterStringPropertyType(JsonNode node) {
        CharacterStringPropertyType value = new CharacterStringPropertyType();

        if (node.isTextual()) {
            value.setCharacterString(new JAXBElement<String>(CHAR_STRING_QNAME, String.class, node.asText()));
        } else if (node.has("value") && node.get("value").isTextual()) {
            value.setCharacterString(new JAXBElement<String>(CHAR_STRING_QNAME, String.class, node.get("value").asText()));
        } else if (node.has("codeList") && node.has("codeListValue")) {
            CodeListValueType codeListValue = new CodeListValueType();
            codeListValue.setCodeList(node.get("codeList").asText());
            codeListValue.setCodeListValue(node.get("codeListValue").asText());
            value.setCharacterString(new JAXBElement<CodeListValueType>(CHAR_STRING_QNAME, CodeListValueType.class, codeListValue));
        }

        return value;
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

    public static CodeListValueType printCodeListValueType(JsonNode node) {
        CodeListValueType value = new CodeListValueType();

        if (node.has("value")) {
            value.setValue(node.get("value").asText());
        }

        if (node.has("codeList")) {
            value.setCodeList(node.get("codeList").asText());
        }

        if (node.has("codeListValue")) {
            value.setCodeListValue(node.get("codeListValue").asText());
        }

        if (node.has("codeSpace")) {
            value.setCodeSpace(node.get("codeSpace").asText());
        }

        return value;
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

    public static DatePropertyType printDatePropertyType(JsonNode node) {
        DatePropertyType value = new DatePropertyType();

        if (node.has("date")) {
            value.setDate(node.get("date").asText());
        }

        if (node.has("dateTime")) {
            try {
                value.setDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(node.get("dateTime").asText()));
            } catch (javax.xml.datatype.DatatypeConfigurationException e) {
                throw new RuntimeException("Failed to create XMLGregorianCalendar", e);
            }
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
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

    public static DateTimePropertyType printDateTimePropertyType(JsonNode node) {
        DateTimePropertyType value = new DateTimePropertyType();

        if (node.has("dateTime")) {
            try {
                value.setDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(node.get("dateTime").asText()));
            } catch (javax.xml.datatype.DatatypeConfigurationException e) {
                throw new RuntimeException("Failed to create XMLGregorianCalendar", e);
            }
        }

        if (node.has("nilReason")) {
            value.setNilReason(node.get("nilReason").asText());
        }

        return value;
    }

    public static JsonNode parseCIOnlineRessourcePropertyType(CIOnlineResourcePropertyType value) {
        if (value.getCIOnlineResource() != null) {
            return BasicMetaDataHelper.parseCIOnlineRessourceType(value.getCIOnlineResource());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static CIOnlineResourcePropertyType printCIOnlineRessourcePropertyType(JsonNode node) {
        CIOnlineResourcePropertyType value = new CIOnlineResourcePropertyType();

        if (node.has("CIOnlineResource")) {
            value.setCIOnlineResource(printCIOnlineRessourceType(node.get("CIOnlineResource")));
        }

        return value;
    }

    public static JsonNode parseCIOnlineRessourceType(CIOnlineResourceType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getLinkage() != null) {
            node.set("url", objectMapper.getNodeFactory().textNode(value.getLinkage().getURL()));
        }

        if (value.getProtocol() != null) {
            node.set("protocol", parseCharacterStringPropertyType(value.getProtocol()));
        }

        if (value.getApplicationProfile() != null) {
            node.set("applicationProfile", parseCharacterStringPropertyType(value.getApplicationProfile()));
        }

        if (value.getName() != null) {
            node.set("name", parseCharacterStringPropertyType(value.getName()));
        }

        if (value.getDescription() != null) {
            node.set("description", parseCharacterStringPropertyType(value.getDescription()));
        }

        if (value.getFunction() != null) {
            node.set("function", parseCodeListValueType(value.getFunction().getCIOnLineFunctionCode()));
        }

        return node;
    }

    public static CIOnlineResourceType printCIOnlineRessourceType(JsonNode node) {
        CIOnlineResourceType value = new CIOnlineResourceType();

        if (node.has("url")) {
            value.setLinkage(new URLPropertyType());
            value.getLinkage().setURL(node.get("url").asText());
        }

        if (node.has("protocol")) {
            value.setProtocol(printCharacterStringPropertyType(node.get("protocol")));
        }

        if (node.has("applicationProfile")) {
            value.setApplicationProfile(printCharacterStringPropertyType(node.get("applicationProfile")));
        }

        if (node.has("name")) {
            value.setName(printCharacterStringPropertyType(node.get("name")));
        }

        if (node.has("description")) {
            value.setDescription(printCharacterStringPropertyType(node.get("description")));
        }

        if (node.has("function")) {
            value.setFunction(new CIOnLineFunctionCodePropertyType());
            value.getFunction().setCIOnLineFunctionCode(printCodeListValueType(node.get("function")));
        }

        return value;
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

    public static CIRoleCodePropertyType printCIRoleCodePropertyType(JsonNode node) {
        CIRoleCodePropertyType circp = new CIRoleCodePropertyType();

        if (node.has("code")) {
            circp.setCIRoleCode(printCodeListValueType(node.get("code")));
        }

        if (node.has("nilReason")) {
            circp.setNilReason(node.get("nilReason").asText());
        }

        return circp;
    }

    public static JsonNode parseCITelephonePropertyType(CITelephonePropertyType value) {
        if (value.getCITelephone() != null) {
            return BasicMetaDataHelper.parseCITelephoneType(value.getCITelephone());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static CITelephonePropertyType printCITelephonePropertyType(JsonNode node) {
        CITelephonePropertyType value = new CITelephonePropertyType();

        if (node.has("CITelephone")) {
            value.setCITelephone(printCITelephoneType(node.get("CITelephone")));
        }

        return value;
    }

    public static JsonNode parseCITelephoneType(CITelephoneType value){
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode voiceArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType voice : value.getVoice()) {
            voiceArray.add(parseCharacterStringPropertyType(voice));
        }
        node.set("voice", voiceArray);

        ArrayNode facsimileArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType facsimile : value.getFacsimile()) {
            facsimileArray.add(parseCharacterStringPropertyType(facsimile));
        }

        node.set("facsimile", facsimileArray);

        return node;
    }

    public static CITelephoneType printCITelephoneType(JsonNode node) {
        CITelephoneType value = new CITelephoneType();

        if (node.has("voice")) {
            for (JsonNode voiceNode : node.get("voice")) {
                value.getVoice().add(printCharacterStringPropertyType(voiceNode));
            }
        }

        if (node.has("facsimile")) {
            for (JsonNode facsimileNode : node.get("facsimile")) {
                value.getFacsimile().add(printCharacterStringPropertyType(facsimileNode));
            }
        }

        return value;
    }

    public static JsonNode parseCIAdressPropertyType(CIAddressPropertyType value) {
        if (value.getCIAddress() != null) {
            return BasicMetaDataHelper.parseCIAdressType(value.getCIAddress());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static CIAddressPropertyType printCIAdressPropertyType(JsonNode node) {
        CIAddressPropertyType value = new CIAddressPropertyType();

        if (node.has("CIAddress")) {
            value.setCIAddress(printCIAdressType(node.get("CIAddress")));
        }

        return value;
    }
    
    public static JsonNode parseCIAdressType(CIAddressType value){
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode deliveryPointArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType address : value.getDeliveryPoint()) {
            deliveryPointArray.add(parseCharacterStringPropertyType(address));
        }

        node.set("deliveryPoint", deliveryPointArray);

        if (value.getCity() != null) {
            node.set("city", parseCharacterStringPropertyType(value.getCity()));
        }

        if (value.getPostalCode() != null) {
            node.set("postalCode", parseCharacterStringPropertyType(value.getPostalCode()));
        }

        if (value.getCountry() != null) {
            node.set("country", parseCharacterStringPropertyType(value.getCountry()));
        }

        ArrayNode electronicMailAddressArray = objectMapper.createArrayNode();
        for (CharacterStringPropertyType email : value.getElectronicMailAddress()) {
            electronicMailAddressArray.add(parseCharacterStringPropertyType(email));
        }

        node.set("electronicMailAddress", electronicMailAddressArray);

        return node;
    }

    public static CIAddressType printCIAdressType(JsonNode node) {
        CIAddressType value = new CIAddressType();

        if (node.has("deliveryPoint")) {
            for (JsonNode deliveryPointNode : node.get("deliveryPoint")) {
                value.getDeliveryPoint().add(printCharacterStringPropertyType(deliveryPointNode));
            }
        }

        if (node.has("city")) {
            value.setCity(printCharacterStringPropertyType(node.get("city")));
        }

        if (node.has("postalCode")) {
            value.setPostalCode(printCharacterStringPropertyType(node.get("postalCode")));
        }

        if (node.has("country")) {
            value.setCountry(printCharacterStringPropertyType(node.get("country")));
        }

        if (node.has("electronicMailAddress")) {
            for (JsonNode emailNode : node.get("electronicMailAddress")) {
                value.getElectronicMailAddress().add(printCharacterStringPropertyType(emailNode));
            }
        }

        return value;
    }
}
