package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gmd.v2007.*;
import com.aixm.delorean.core.org.gml.v_3_2.TimePeriodType;
import com.aixm.delorean.core.org.gss.v2007.GMObjectPropertyType;
import com.aixm.delorean.core.org.gco.v2007.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CIMetadataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parseMDDistributorPropertyType(MDDistributorPropertyType value){
        if (value.getMDDistributor() != null) {
            return parseMDDistributorType(value.getMDDistributor());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseMDDistributorType(MDDistributorType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDistributorContact() != null){
            node.set("distributorContact", parseCIResponsiblePartyPropertyType(value.getDistributorContact()));
        }

        return node;
    }

    public static JsonNode parseMDFormatPropertyType(MDFormatPropertyType value){
        if (value.getMDFormat() != null){
            return parseMDFormatType(value.getMDFormat());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseMDFormatType(MDFormatType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getName() != null){
            node.set("name", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getName()));
        }

        if (value.getVersion() != null){
            node.set("version", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getVersion()));
        }

        if (value.getAmendmentNumber() != null){
            node.set("amendmentNumber", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getAmendmentNumber()));
        }

        if (value.getSpecification() != null){
            node.set("specification", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getSpecification()));
        }

        if (value.getFileDecompressionTechnique() != null){
            node.set("fileDecompressionTechnique", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getFileDecompressionTechnique()));
        }

        return node;
    }

    public static JsonNode parseRSIdentifierPropertyType(RSIdentifierPropertyType value){
        if (value.getRSIdentifier() != null) {
            return parseRSIdentifierType(value.getRSIdentifier());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseMDMaintenanceFrequencyCodePropertyType(MDMaintenanceFrequencyCodePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDMaintenanceFrequencyCode() != null){
            node.set("scope", BasicMetaDataHelper.parseCodeListValueType(value.getMDMaintenanceFrequencyCode()));
        }

        if (value.getNilReason() != null){
            node.set("nilReason", objectMapper.getNodeFactory().textNode(value.getNilReason()));
        }

        return node;
    }

    public static JsonNode parseDQDataQualityPropertyType(DQDataQualityPropertyType value){
        if (value.getDQDataQuality() != null ) {
            return parseDQDataQualityType(value.getDQDataQuality());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseDQDataQualityType(DQDataQualityType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getScope() != null){
            node.set("scope", parseDQScopePropertyType(value.getScope()));
        }

        if (value.getLineage() != null){
            node.set("lineage", parseLILineagePropertyType(value.getLineage()));
        }

        return node;
    }

    public static JsonNode parseDQScopePropertyType(DQScopePropertyType value) {
        if (value.getDQScope() != null) {
            return parseDQScopeType(value.getDQScope());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseDQScopeType (DQScopeType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getLevel() != null){
            node.set("level", BasicMetaDataHelper.parseMDScopeCodePropertyType(value.getLevel()));
        }

        if (value.getExtent() != null){
            node.set("extent", parseEXExtentPropertyType(value.getExtent()));
        }

        return node;
    }

    public static JsonNode parseLILineagePropertyType (LILineagePropertyType value) {
        if (value.getLILineage() != null) {
            return parseLILineageType(value.getLILineage());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseLILineageType (LILineageType  value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getStatement() != null){
            node.set("statement", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getStatement()));
        }

        ArrayNode processStepArray = objectMapper.createArrayNode();
        for (LIProcessStepPropertyType processStep : value.getProcessStep()) {
            processStepArray.add(parseLIProcessStepPropertyType(processStep));
        }
        node.set("processStep", processStepArray);

        return node;
    }

    public static JsonNode parseLIProcessStepPropertyType(LIProcessStepPropertyType value){
        if (value.getLIProcessStep() != null) {
            return parseLIProcessStepType(value.getLIProcessStep());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseLIProcessStepType(LIProcessStepType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDescription() != null){
            node.set("description", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getDescription()));
        }

        if (value.getRationale() != null){
            node.set("rational", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getRationale()));
        }

        if (value.getDateTime() != null){
            node.set("rational", BasicMetaDataHelper.parseDateTimePropertyType(value.getDateTime()));
        }

        ArrayNode processStepArray = objectMapper.createArrayNode();
        for (CIResponsiblePartyPropertyType processStep : value.getProcessor()) {
            processStepArray.add(parseCIResponsiblePartyPropertyType(processStep));
        }
        node.set("processStep", processStepArray);

        ArrayNode sourceArray = objectMapper.createArrayNode();
        for (LISourcePropertyType source : value.getSource()) {
            // TODO 
        }
        node.set("processStep", sourceArray);

        return node;
    }

    public static JsonNode parseMDConstraintsPropertyType(MDConstraintsPropertyType value){
        if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null & value.getMDConstraints().getValue() instanceof MDConstraintsType) {
            return parseMDConstraintsType((MDConstraintsType) value.getMDConstraints().getValue());

        } else if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null & value.getMDConstraints().getValue() instanceof MDLegalConstraintsType) {
            return parseMDLegalConstraintsType((MDLegalConstraintsType) value.getMDConstraints().getValue());

        } else if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null & value.getMDConstraints().getValue() instanceof MDSecurityConstraintsType) {
            return parseMDSecurityConstraintsType((MDSecurityConstraintsType) value.getMDConstraints().getValue());

        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseMDConstraintsType(MDConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCaracterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        return node;
    }

    public static JsonNode parseMDLegalConstraintsType(MDLegalConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCaracterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        ArrayNode accessConstraintsArray = objectMapper.createArrayNode();
        for (MDRestrictionCodePropertyType accessConstraints : value.getAccessConstraints()) {
            accessConstraintsArray.add(BasicMetaDataHelper.parseMDRestrictionCodePropertyType(accessConstraints));
        }
        node.set("accessConstraints", accessConstraintsArray);

        return node;
    }

    public static JsonNode parseMDSecurityConstraintsType(MDSecurityConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCaracterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        if (value.getClassification() != null) {
            node.set("classification", BasicMetaDataHelper.parseMDClassificationCodePropertyType(value.getClassification()));
        }

        return node;
    }

    public static JsonNode parseEXExtentPropertyType(EXExtentPropertyType value) {
        if (value.getEXExtent() != null) {
            return parseEXExtentType(value.getEXExtent());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseEXExtentType(EXExtentType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDescription() != null) {
            node.set("description", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getDescription()));
        }

        ArrayNode exgepArray = objectMapper.createArrayNode();
        for (EXGeographicExtentPropertyType exgep : value.getGeographicElement()){
            exgepArray.add(parseEXGeographicExtentPropertyType(exgep));
        }
        node.set("geographicElement", exgepArray);


        ArrayNode extepArray = objectMapper.createArrayNode();
        for (EXTemporalExtentPropertyType extep : value.getTemporalElement()){
            extepArray.add(parseEXTemporalExtentPropertyType(extep));
        }
        node.set("temporalElement", extepArray);

        return node;
    }

    public static JsonNode parseEXTemporalExtentPropertyType(EXTemporalExtentPropertyType value){
        if (value.getEXTemporalExtent() != null && value.getEXTemporalExtent().getValue() != null && value.getEXTemporalExtent().getValue() instanceof EXTemporalExtentType) {
            return parseEXTemporalExtentType((EXTemporalExtentType) value.getEXTemporalExtent().getValue());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseEXTemporalExtentType(EXTemporalExtentType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getExtent() != null && value.getExtent().getAbstractTimePrimitive() != null && value.getExtent().getAbstractTimePrimitive().getValue() != null && value.getExtent().getAbstractTimePrimitive().getValue() instanceof TimePeriodType) {
            node.set("extent", BasicMetaDataHelper.parseTimePeriodType((TimePeriodType) value.getExtent().getAbstractTimePrimitive().getValue()));
        }

        return node;
    }

    public static JsonNode parseEXGeographicExtentPropertyType(EXGeographicExtentPropertyType value) {
        if (value.getAbstractEXGeographicExtent() != null && value.getAbstractEXGeographicExtent().getValue() != null & value.getAbstractEXGeographicExtent().getValue() instanceof EXGeographicBoundingBoxType) {
            return parseEXGeographicBoundingBoxType((EXGeographicBoundingBoxType) value.getAbstractEXGeographicExtent().getValue());

        } else if (value.getAbstractEXGeographicExtent() != null && value.getAbstractEXGeographicExtent().getValue() != null & value.getAbstractEXGeographicExtent().getValue() instanceof EXGeographicDescriptionType) {
            return parseEXGeographicDescriptionType((EXGeographicDescriptionType) value.getAbstractEXGeographicExtent().getValue());

        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseEXGeographicDescriptionType(EXGeographicDescriptionType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getGeographicIdentifier() != null) {
            node.set("geographicIdentifier", parseMDIdentifierPropertyType(value.getGeographicIdentifier()));
        }

        if (value.getExtentTypeCode() != null) {
            node.set("extentTypeCode", BasicMetaDataHelper.parseBooleanPropertyType(value.getExtentTypeCode()));
        }

        return node;
    }

    public static JsonNode parseEXGeographicBoundingBoxType(EXGeographicBoundingBoxType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getEastBoundLongitude() != null && value.getEastBoundLongitude().getDecimal() != null) {
            node.set("east", objectMapper.getNodeFactory().numberNode(value.getEastBoundLongitude().getDecimal()));
        }
        
        if (value.getWestBoundLongitude() != null && value.getWestBoundLongitude().getDecimal() != null) {
            node.set("west", objectMapper.getNodeFactory().numberNode(value.getWestBoundLongitude().getDecimal()));
        }

        if (value.getNorthBoundLatitude() != null && value.getNorthBoundLatitude().getDecimal() != null) {
            node.set("nord", objectMapper.getNodeFactory().numberNode(value.getNorthBoundLatitude().getDecimal()));
        }
        
        if (value.getSouthBoundLatitude() != null && value.getSouthBoundLatitude().getDecimal() != null) {
            node.set("south", objectMapper.getNodeFactory().numberNode(value.getSouthBoundLatitude().getDecimal()));
        }

        if (value.getExtentTypeCode() != null) {
            node.set("extentTypeCode", BasicMetaDataHelper.parseBooleanPropertyType(value.getExtentTypeCode()));
        }

        return node;
    }

    public static JsonNode parseMDIdentifierPropertyType(MDIdentifierPropertyType value) {
        if (value.getMDIdentifier() != null && value.getMDIdentifier().getValue() != null & value.getMDIdentifier().getValue() instanceof MDIdentifierType) {
            return parseMDIdentifierType((MDIdentifierType) value.getMDIdentifier().getValue());

        } else if (value.getMDIdentifier() != null && value.getMDIdentifier().getValue() != null & value.getMDIdentifier().getValue() instanceof RSIdentifierType) {
            return parseRSIdentifierType((RSIdentifierType) value.getMDIdentifier().getValue());
            
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseMDIdentifierType (MDIdentifierType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getAuthority() != null) {
            node.set("authority", parseCICitationPropertyType(value.getAuthority()));
        }

        if (value.getCode() != null) {
            node.set("code", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getCode()));
        }

        return node;
    }

    public static JsonNode parseRSIdentifierType (RSIdentifierType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getAuthority() != null) {
            node.set("authority", parseCICitationPropertyType(value.getAuthority()));
        }

        if (value.getCode() != null) {
            node.set("code", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getCode()));
        }

        if (value.getCodeSpace() != null) {
            node.set("codeSpace", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getCodeSpace()));
        }

        if (value.getVersion() != null) {
            node.set("version", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getVersion()));
        }

        return node;
    }

    public static JsonNode parseMDTopicCategoryCodePropertyType (MDTopicCategoryCodePropertyType value) {
        if (value.getMDTopicCategoryCode() != null) {
            return parseMDTopicCategoryCodeType(value.getMDTopicCategoryCode());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }
    
    public static JsonNode parseMDTopicCategoryCodeType (MDTopicCategoryCodeType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.value() != null) {
            node.set("value", objectMapper.getNodeFactory().textNode(value.value()));
        }

        return node;
    }

    public static JsonNode parseCICitationPropertyType (CICitationPropertyType value){
        if (value.getCICitation() != null) {
            return parseCICitationType(value.getCICitation());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseCICitationType(CICitationType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if(value.getTitle() != null) {
            node.set("title", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getTitle()));
        }

        ArrayNode cidpArray = objectMapper.createArrayNode();
        for (CIDatePropertyType cidate : value.getDate()) {
            cidpArray.add(parseCIDatePropertyType(cidate));
            
        }
        node.set("date", cidpArray);

        return node;
    }

    public static JsonNode parseCIResponsiblePartyPropertyType (CIResponsiblePartyPropertyType value) {
        if (value.getCIResponsibleParty() != null) {
            return parseCIResponsiblePartyType(value.getCIResponsibleParty());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseCIResponsiblePartyType(CIResponsiblePartyType value){
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getIndividualName() != null) {
            node.set("individualName", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getIndividualName()));
        }

        if (value.getOrganisationName() != null) {
            node.set("organisationName", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getOrganisationName()));
        }

        if (value.getPositionName() != null) {
            node.set("positionName", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getPositionName()));
        }

        if (value.getContactInfo() != null) {
            node.set("contactInfo", parsCIContactPropertyType(value.getContactInfo()));
        }

        if (value.getRole() != null) {
            node.set("role", BasicMetaDataHelper.parseCIRoleCodePropertyType(value.getRole()));
        }
        return node;
    }

    public static JsonNode parsCIContactPropertyType(CIContactPropertyType value) {
        if (value.getCIContact() != null) {
            return parseCIContactType(value.getCIContact());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }
    
    public static JsonNode parseCIContactType(CIContactType value) {
        ObjectNode cicpNode = objectMapper.createObjectNode();
        if (value.getPhone() != null) {
            cicpNode.set("phone", BasicMetaDataHelper.parseCIOnlineRessourcePropertyType(value.getPhone()));
        }

        if (value.getAddress() != null) {
            cicpNode.set("address", BasicMetaDataHelper.parseCIAdressPropertyType(value.getAddress()));
        }

        if (value.getOnlineResource() != null) {
            cicpNode.set("onlineResource", BasicMetaDataHelper.parseCIOnlineRessourcePropertyType(value.getOnlineResource()));
        }

        if (value.getHoursOfService() != null) {
            cicpNode.set("hoursOfService", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getHoursOfService()));
        }

        if (value.getContactInstructions() != null) {
            cicpNode.set("contactInstructions", BasicMetaDataHelper.parseCaracterStringPropertyType(value.getContactInstructions()));
        }

        return cicpNode;
    }

    public static JsonNode parseCIDatePropertyType(CIDatePropertyType value) {
        if (value.getCIDate() != null) {
            return parseCIDateType(value.getCIDate());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static JsonNode parseCIDateType(CIDateType value) {
        ObjectNode node = objectMapper.createObjectNode();
        DatePropertyType date = value.getDate();
        if (date != null) {
            node.set("date", BasicMetaDataHelper.parseDatePropertyType(date));
        }

        CIDateTypeCodePropertyType dateType = value.getDateType();
        if (dateType != null) {

            ObjectNode dateTypeNode = objectMapper.createObjectNode();
            CodeListValueType clv = dateType.getCIDateTypeCode();
            if (clv != null) {
                dateTypeNode.set("ciDateTypeCode", BasicMetaDataHelper.parseCodeListValueType(clv));
            }

            String nilReason = dateType.getNilReason();
            if (nilReason != null) {
                dateTypeNode.set("nilReason", objectMapper.getNodeFactory().textNode(nilReason));
            }

            node.set("dateType", dateTypeNode);
        }

        return node;
    }
}
