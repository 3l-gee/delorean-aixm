package com.delorean.aixm.core.metadata.helper;

import com.delorean.aixm.core.org.gmd.v2007.*;
import com.delorean.aixm.core.org.gml.v_3_2.TimePeriodType;
import com.delorean.aixm.core.org.gss.v2007.GMObjectPropertyType;
import com.delorean.aixm.core.org.gts.v2007.TMPrimitivePropertyType;

import javax.xml.namespace.QName;

import com.delorean.aixm.core.org.gco.v2007.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.xml.bind.JAXBElement;

public class CIMetadataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parseMDDistributorPropertyType(MDDistributorPropertyType value){
        if (value.getMDDistributor() != null) {
            return parseMDDistributorType(value.getMDDistributor());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static MDDistributorPropertyType printMDDistributorPropertyType(JsonNode node){
        MDDistributorPropertyType property = new MDDistributorPropertyType();

        if (node.has("distributorContact")){
            property.setMDDistributor(printMDDistributorType(node.get("distributorContact")));
        }

        return property;
    }

    public static JsonNode parseMDDistributorType(MDDistributorType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDistributorContact() != null){
            node.set("distributorContact", parseCIResponsiblePartyPropertyType(value.getDistributorContact()));
        }

        return node;
    }

    public static MDDistributorType printMDDistributorType(JsonNode node){
        MDDistributorType distributor = new MDDistributorType();

        if (node.has("distributorContact")){
            distributor.setDistributorContact(printCIResponsiblePartyPropertyType(node.get("distributorContact")));
        }

        return distributor;
    }

    public static JsonNode parseMDFormatPropertyType(MDFormatPropertyType value){
        if (value.getMDFormat() != null){
            return parseMDFormatType(value.getMDFormat());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static MDFormatPropertyType printMDFormatPropertyType(JsonNode node){
        MDFormatPropertyType property = new MDFormatPropertyType();

        if (node.has("MDFormat")){
            property.setMDFormat(printMDFormatType(node.get("MDFormat")));
        }

        return property;
    }

    public static JsonNode parseMDFormatType(MDFormatType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getName() != null){
            node.set("name", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getName()));
        }

        if (value.getVersion() != null){
            node.set("version", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getVersion()));
        }

        if (value.getAmendmentNumber() != null){
            node.set("amendmentNumber", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getAmendmentNumber()));
        }

        if (value.getSpecification() != null){
            node.set("specification", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getSpecification()));
        }

        if (value.getFileDecompressionTechnique() != null){
            node.set("fileDecompressionTechnique", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getFileDecompressionTechnique()));
        }

        return node;
    }

    public static MDFormatType printMDFormatType(JsonNode node){
        MDFormatType format = new MDFormatType();

        if (node.has("name")){
            format.setName(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("name")));
        }

        if (node.has("version")){
            format.setVersion(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("version")));
        }

        if (node.has("amendmentNumber")){
            format.setAmendmentNumber(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("amendmentNumber")));
        }

        if (node.has("specification")){
            format.setSpecification(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("specification")));
        }

        if (node.has("fileDecompressionTechnique")){
            format.setFileDecompressionTechnique(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("fileDecompressionTechnique")));
        }

        return format;
    }

    public static JsonNode parseRSIdentifierPropertyType(RSIdentifierPropertyType value){
        if (value.getRSIdentifier() != null) {
            return parseRSIdentifierType(value.getRSIdentifier());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static RSIdentifierPropertyType printRSIdentifierPropertyType(JsonNode node){
        RSIdentifierPropertyType property = new RSIdentifierPropertyType();

        if (node.has("RSIdentifier")){
            property.setRSIdentifier(printRSIdentifierType(node.get("RSIdentifier")));
        }

        return property;
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

    public static MDMaintenanceFrequencyCodePropertyType printMDMaintenanceFrequencyCodePropertyType(JsonNode node){
        MDMaintenanceFrequencyCodePropertyType property = new MDMaintenanceFrequencyCodePropertyType();

        if (node.has("scope")){
            property.setMDMaintenanceFrequencyCode(BasicMetaDataHelper.printCodeListValueType(node.get("scope")));
        }

        if (node.has("nilReason")){
            property.setNilReason(node.get("nilReason").asText());
        }

        return property;
    }

    public static JsonNode parseDQDataQualityPropertyType(DQDataQualityPropertyType value){
        if (value.getDQDataQuality() != null ) {
            return parseDQDataQualityType(value.getDQDataQuality());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static DQDataQualityPropertyType printDQDataQualityPropertyType(JsonNode node){
        DQDataQualityPropertyType property = new DQDataQualityPropertyType();

        if (node.has("DQDataQuality")){
            property.setDQDataQuality(printDQDataQualityType(node.get("DQDataQuality")));
        }

        return property;
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

    public static DQDataQualityType printDQDataQualityType(JsonNode node){
        DQDataQualityType dataQuality = new DQDataQualityType();

        if (node.has("scope")){
            dataQuality.setScope(printDQScopePropertyType(node.get("scope")));
        }

        if (node.has("lineage")){
            dataQuality.setLineage(printLILineagePropertyType(node.get("lineage")));
        }

        return dataQuality;
    }

    public static JsonNode parseDQScopePropertyType(DQScopePropertyType value) {
        if (value.getDQScope() != null) {
            return parseDQScopeType(value.getDQScope());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static DQScopePropertyType printDQScopePropertyType(JsonNode node){
        DQScopePropertyType property = new DQScopePropertyType();

        if (node.has("DQScope")){
            property.setDQScope(printDQScopeType(node.get("DQScope")));
        }

        return property;
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

    public static DQScopeType printDQScopeType(JsonNode node){
        DQScopeType scope = new DQScopeType();

        if (node.has("level")){
            scope.setLevel(BasicMetaDataHelper.printMDScopeCodePropertyType(node.get("level")));
        }

        if (node.has("extent")){
            scope.setExtent(printEXExtentPropertyType(node.get("extent")));
        }

        return scope;
    }

    public static JsonNode parseLILineagePropertyType (LILineagePropertyType value) {
        if (value.getLILineage() != null) {
            return parseLILineageType(value.getLILineage());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static LILineagePropertyType printLILineagePropertyType(JsonNode node){
        LILineagePropertyType property = new LILineagePropertyType();

        if (node.has("LILineage")){
            property.setLILineage(printLILineageType(node.get("LILineage")));
        }

        return property;
    }

    public static JsonNode parseLILineageType (LILineageType  value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getStatement() != null){
            node.set("statement", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getStatement()));
        }

        ArrayNode processStepArray = objectMapper.createArrayNode();
        for (LIProcessStepPropertyType processStep : value.getProcessStep()) {
            processStepArray.add(parseLIProcessStepPropertyType(processStep));
        }
        node.set("processStep", processStepArray);

        return node;
    }

    public static LILineageType printLILineageType(JsonNode node){
        LILineageType lineage = new LILineageType();

        if (node.has("statement")){
            lineage.setStatement(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("statement")));
        }

        ArrayNode processStepArray = objectMapper.createArrayNode();
        for (JsonNode processStepNode : node.withArray("processStep")) {
            lineage.getProcessStep().add(printLIProcessStepPropertyType(processStepNode));
        }

        return lineage;
    }

    public static JsonNode parseLIProcessStepPropertyType(LIProcessStepPropertyType value){
        if (value.getLIProcessStep() != null) {
            return parseLIProcessStepType(value.getLIProcessStep());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static LIProcessStepPropertyType printLIProcessStepPropertyType(JsonNode node){
        LIProcessStepPropertyType property = new LIProcessStepPropertyType();

        if (node.has("LIProcessStep")){
            property.setLIProcessStep(printLIProcessStepType(node.get("LIProcessStep")));
        }

        return property;
    }

    public static JsonNode parseLIProcessStepType(LIProcessStepType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDescription() != null){
            node.set("description", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getDescription()));
        }

        if (value.getRationale() != null){
            node.set("rational", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getRationale()));
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

    public static LIProcessStepType printLIProcessStepType(JsonNode node){
        LIProcessStepType processStep = new LIProcessStepType();

        if (node.has("description")){
            processStep.setDescription(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("description")));
        }

        if (node.has("rationale")){
            processStep.setRationale(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("rationale")));
        }

        if (node.has("dateTime")){
            processStep.setDateTime(BasicMetaDataHelper.printDateTimePropertyType(node.get("dateTime")));
        }

        ArrayNode processorArray = node.withArray("processor");
        for (JsonNode processorNode : processorArray) {
            processStep.getProcessor().add(printCIResponsiblePartyPropertyType(processorNode));
        }

        // TODO source

        return processStep;
    }

    public static JsonNode parseMDConstraintsPropertyType(MDConstraintsPropertyType value){
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null && value.getMDConstraints().getValue() instanceof MDConstraintsType) {
            node.set("MDConstraints", parseMDConstraintsType((MDConstraintsType) value.getMDConstraints().getValue()));

        } else if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null && value.getMDConstraints().getValue() instanceof MDLegalConstraintsType) {
            node.set("MDLegalConstraints", parseMDLegalConstraintsType((MDLegalConstraintsType) value.getMDConstraints().getValue()));

        } else if (value.getMDConstraints() != null && value.getMDConstraints().getValue() != null && value.getMDConstraints().getValue() instanceof MDSecurityConstraintsType) {
            node.set("MDSecurityConstraints", parseMDSecurityConstraintsType((MDSecurityConstraintsType) value.getMDConstraints().getValue()));

        } else {
            return objectMapper.createObjectNode().nullNode();
        }

        return node;
    }

    public static MDConstraintsPropertyType printMDConstraintsPropertyType(JsonNode node){
        MDConstraintsPropertyType property = new MDConstraintsPropertyType();

        if (node.has("MDConstraints")){
            MDConstraintsType constraints = printMDConstraintsType(node.get("MDConstraints"));
            property.setMDConstraints(new JAXBElement<MDConstraintsType>(new QName("http://www.isotc211.org/2005/gmd", "MDConstraints"), MDConstraintsType.class, constraints));
        } else if (node.has("MDLegalConstraints")){
            MDLegalConstraintsType legalConstraints = printMDLegalConstraintsType(node.get("MDLegalConstraints"));
            property.setMDConstraints(new JAXBElement<MDLegalConstraintsType>(new QName("http://www.isotc211.org/2005/gmd", "MDLegalConstraints"), MDLegalConstraintsType.class, legalConstraints));
        } else if (node.has("MDSecurityConstraints")){
            MDSecurityConstraintsType securityConstraints = printMDSecurityConstraintsType(node.get("MDSecurityConstraints"));
            property.setMDConstraints(new JAXBElement<MDSecurityConstraintsType>(new QName("http://www.isotc211.org/2005/gmd", "MDSecurityConstraints"), MDSecurityConstraintsType.class, securityConstraints));
        }

        return property;
    }

    public static JsonNode parseMDConstraintsType(MDConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCharacterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        return node;
    }

    private static MDConstraintsType printMDConstraintsType(JsonNode node){
        MDConstraintsType constraints = new MDConstraintsType();

        ArrayNode useLimitationArray = node.withArray("useLimitation");
        for (JsonNode useLimitationNode : useLimitationArray) {
            constraints.getUseLimitation().add(BasicMetaDataHelper.printCharacterStringPropertyType(useLimitationNode));
        }

        return constraints;
    }

    public static JsonNode parseMDLegalConstraintsType(MDLegalConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCharacterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        ArrayNode accessConstraintsArray = objectMapper.createArrayNode();
        for (MDRestrictionCodePropertyType accessConstraints : value.getAccessConstraints()) {
            accessConstraintsArray.add(BasicMetaDataHelper.parseMDRestrictionCodePropertyType(accessConstraints));
        }
        node.set("accessConstraints", accessConstraintsArray);

        return node;
    }

    private static MDLegalConstraintsType printMDLegalConstraintsType(JsonNode node){
        MDLegalConstraintsType legalConstraints = new MDLegalConstraintsType();

        ArrayNode useLimitationArray = node.withArray("useLimitation");
        for (JsonNode useLimitationNode : useLimitationArray) {
            legalConstraints.getUseLimitation().add(BasicMetaDataHelper.printCharacterStringPropertyType(useLimitationNode));
        }

        ArrayNode accessConstraintsArray = node.withArray("accessConstraints");
        for (JsonNode accessConstraintNode : accessConstraintsArray) {
            legalConstraints.getAccessConstraints().add(BasicMetaDataHelper.printMDRestrictionCodePropertyType(accessConstraintNode));
        }

        return legalConstraints;
    }

    public static JsonNode parseMDSecurityConstraintsType(MDSecurityConstraintsType value) {
        ObjectNode node = objectMapper.createObjectNode();

        ArrayNode array = objectMapper.createArrayNode();
        for (CharacterStringPropertyType string : value.getUseLimitation()) {
            array.add(BasicMetaDataHelper.parseCharacterStringPropertyType(string));
        }
        node.set("useLimitation", array);

        if (value.getClassification() != null) {
            node.set("classification", BasicMetaDataHelper.parseMDClassificationCodePropertyType(value.getClassification()));
        }

        return node;
    }

    public static MDSecurityConstraintsType printMDSecurityConstraintsType(JsonNode node){
        MDSecurityConstraintsType securityConstraints = new MDSecurityConstraintsType();

        ArrayNode useLimitationArray = node.withArray("useLimitation");
        for (JsonNode useLimitationNode : useLimitationArray) {
            securityConstraints.getUseLimitation().add(BasicMetaDataHelper.printCharacterStringPropertyType(useLimitationNode));
        }

        if (node.has("classification")){
            securityConstraints.setClassification(BasicMetaDataHelper.printMDClassificationCodePropertyType(node.get("classification")));
        }

        return securityConstraints;
    }

    public static JsonNode parseEXExtentPropertyType(EXExtentPropertyType value) {
        if (value.getEXExtent() != null) {
            return parseEXExtentType(value.getEXExtent());
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
    }

    public static EXExtentPropertyType printEXExtentPropertyType(JsonNode node){
        EXExtentPropertyType property = new EXExtentPropertyType();

        if (node.has("EXExtent")){
            property.setEXExtent(printEXExtentType(node.get("EXExtent")));
        }

        return property;
    }

    public static JsonNode parseEXExtentType(EXExtentType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getDescription() != null) {
            node.set("description", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getDescription()));
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

    public static EXExtentType printEXExtentType(JsonNode node){
        EXExtentType exExtent = new EXExtentType();

        if (node.has("description")){
            exExtent.setDescription(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("description")));
        }

        ArrayNode geographicElementArray = node.withArray("geographicElement");
        for (JsonNode geographicElementNode : geographicElementArray) {
            exExtent.getGeographicElement().add(printEXGeographicExtentPropertyType(geographicElementNode));
        }

        ArrayNode temporalElementArray = node.withArray("temporalElement");
        for (JsonNode temporalElementNode : temporalElementArray) {
            exExtent.getTemporalElement().add(printEXTemporalExtentPropertyType(temporalElementNode));
        }

        return exExtent;
    }

    public static JsonNode parseEXTemporalExtentPropertyType(EXTemporalExtentPropertyType value){
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getEXTemporalExtent() != null && value.getEXTemporalExtent().getValue() != null && value.getEXTemporalExtent().getValue() instanceof EXTemporalExtentType) {
            node.set("extent", parseEXTemporalExtentType((EXTemporalExtentType) value.getEXTemporalExtent().getValue()));
        } else {
            return objectMapper.createObjectNode().nullNode();
        }
        return node;
    }

    public static EXTemporalExtentPropertyType printEXTemporalExtentPropertyType(JsonNode node){
        EXTemporalExtentPropertyType property = new EXTemporalExtentPropertyType();

        if (node.has("EXTemporalExtent")){
            EXTemporalExtentType temporalExtent = printEXTemporalExtentType(node.get("EXTemporalExtent"));
            property.setEXTemporalExtent(new JAXBElement<EXTemporalExtentType>(new QName("http://www.isotc211.org/2005/gmd", "EXTemporalExtent"), EXTemporalExtentType.class, temporalExtent));

        }

        return property;
    }

    public static JsonNode parseEXTemporalExtentType(EXTemporalExtentType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getExtent() != null && value.getExtent().getAbstractTimePrimitive() != null && value.getExtent().getAbstractTimePrimitive().getValue() != null && value.getExtent().getAbstractTimePrimitive().getValue() instanceof TimePeriodType) {
            node.set("EXTemporalExtent", BasicMetaDataHelper.parseTimePeriodType((TimePeriodType) value.getExtent().getAbstractTimePrimitive().getValue()));
        }

        return node;
    }

    public static EXTemporalExtentType printEXTemporalExtentType(JsonNode node){
        EXTemporalExtentType temporalExtent = new EXTemporalExtentType();

        if (node.has("EXTemporalExtent")){
            TimePeriodType timePeriod = BasicMetaDataHelper.printTimePeriodType(node.get("EXTemporalExtent"));
            TMPrimitivePropertyType extent = new TMPrimitivePropertyType();
            extent.setAbstractTimePrimitive(new JAXBElement<TimePeriodType>(new QName("http://www.opengis.net/gml/3.2", "TimePeriod"), TimePeriodType.class, timePeriod));
            temporalExtent.setExtent(extent);
        }

        return temporalExtent;
    }

    public static JsonNode parseEXGeographicExtentPropertyType(EXGeographicExtentPropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();
        if (value.getAbstractEXGeographicExtent() != null && value.getAbstractEXGeographicExtent().getValue() != null & value.getAbstractEXGeographicExtent().getValue() instanceof EXGeographicBoundingBoxType) {
            node.set("EXGeographicBoundingBox", parseEXGeographicBoundingBoxType((EXGeographicBoundingBoxType) value.getAbstractEXGeographicExtent().getValue()));

        } else if (value.getAbstractEXGeographicExtent() != null && value.getAbstractEXGeographicExtent().getValue() != null & value.getAbstractEXGeographicExtent().getValue() instanceof EXGeographicDescriptionType) {
            node.set("EXGeographicDescription", parseEXGeographicDescriptionType((EXGeographicDescriptionType) value.getAbstractEXGeographicExtent().getValue()));

        } else {
            return objectMapper.createObjectNode().nullNode();
        }

        return node;
    }

    public static EXGeographicExtentPropertyType printEXGeographicExtentPropertyType(JsonNode node){
        EXGeographicExtentPropertyType property = new EXGeographicExtentPropertyType();

        if (node.has("EXGeographicBoundingBox")){
            EXGeographicBoundingBoxType boundingBox = printEXGeographicBoundingBoxType(node.get("EXGeographicBoundingBox"));
            property.setAbstractEXGeographicExtent(new JAXBElement<EXGeographicBoundingBoxType>(new QName("http://www.isotc211.org/2005/gmd", "EXGeographicBoundingBox"), EXGeographicBoundingBoxType.class, boundingBox));

        } else if (node.has("EXGeographicDescription")){
            EXGeographicDescriptionType description = printEXGeographicDescriptionType(node.get("EXGeographicDescription"));
            property.setAbstractEXGeographicExtent(new JAXBElement<EXGeographicDescriptionType>(new QName("http://www.isotc211.org/2005/gmd", "EXGeographicDescription"), EXGeographicDescriptionType.class, description));
        }

        return property;
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

    public static EXGeographicDescriptionType printEXGeographicDescriptionType(JsonNode node){
        EXGeographicDescriptionType geographicDescription = new EXGeographicDescriptionType();

        if (node.has("geographicIdentifier")){
            geographicDescription.setGeographicIdentifier(printMDIdentifierPropertyType(node.get("geographicIdentifier")));
        }

        if (node.has("extentTypeCode")){
            geographicDescription.setExtentTypeCode(BasicMetaDataHelper.printBooleanPropertyType(node.get("extentTypeCode")));
        }

        return geographicDescription;
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

    public static EXGeographicBoundingBoxType printEXGeographicBoundingBoxType(JsonNode node){
        EXGeographicBoundingBoxType boundingBox = new EXGeographicBoundingBoxType();

        if (node.has("east")){
            DecimalPropertyType eastBoundLongitude = new DecimalPropertyType();
            eastBoundLongitude.setDecimal(node.get("east").decimalValue());
            boundingBox.setEastBoundLongitude(eastBoundLongitude);
        }

        if (node.has("west")){
            DecimalPropertyType westBoundLongitude = new DecimalPropertyType();
            westBoundLongitude.setDecimal(node.get("west").decimalValue());
            boundingBox.setWestBoundLongitude(westBoundLongitude);
        }

        if (node.has("nord")){
            DecimalPropertyType northBoundLatitude = new DecimalPropertyType();
            northBoundLatitude.setDecimal(node.get("nord").decimalValue());
            boundingBox.setNorthBoundLatitude(northBoundLatitude);
        }

        if (node.has("south")){
            DecimalPropertyType southBoundLatitude = new DecimalPropertyType();
            southBoundLatitude.setDecimal(node.get("south").decimalValue());
            boundingBox.setSouthBoundLatitude(southBoundLatitude);
        }

        if (node.has("extentTypeCode")){
            boundingBox.setExtentTypeCode(BasicMetaDataHelper.printBooleanPropertyType(node.get("extentTypeCode")));
        }

        return boundingBox;
    }

    public static JsonNode parseMDIdentifierPropertyType(MDIdentifierPropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDIdentifier() != null && value.getMDIdentifier().getValue() != null & value.getMDIdentifier().getValue() instanceof MDIdentifierType) {
            node.set("MDIdentifier", parseMDIdentifierType((MDIdentifierType) value.getMDIdentifier().getValue()));

        } else if (value.getMDIdentifier() != null && value.getMDIdentifier().getValue() != null & value.getMDIdentifier().getValue() instanceof RSIdentifierType) {
            node.set("RSIdentifier", parseRSIdentifierType((RSIdentifierType) value.getMDIdentifier().getValue()));
            
        } else {
            return objectMapper.createObjectNode().nullNode();
        }

        return node;
    }

    public static MDIdentifierPropertyType printMDIdentifierPropertyType(JsonNode node){
        MDIdentifierPropertyType property = new MDIdentifierPropertyType();

        if (node.has("MDIdentifier")){
            MDIdentifierType identifier = printMDIdentifierType(node.get("MDIdentifier"));
            property.setMDIdentifier(new JAXBElement<MDIdentifierType>(new QName("http://www.isotc211.org/2005/gmd", "MDIdentifier"), MDIdentifierType.class, identifier));

        } else if (node.has("RSIdentifier")){
            RSIdentifierType identifier = printRSIdentifierType(node.get("RSIdentifier"));
            property.setMDIdentifier(new JAXBElement<RSIdentifierType>(new QName("http://www.isotc211.org/2005/gmd", "RSIdentifier"), RSIdentifierType.class, identifier));
        }

        return property;
    }

    public static JsonNode parseMDIdentifierType (MDIdentifierType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getAuthority() != null) {
            node.set("authority", parseCICitationPropertyType(value.getAuthority()));
        }

        if (value.getCode() != null) {
            node.set("code", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getCode()));
        }

        return node;
    }

    public static MDIdentifierType printMDIdentifierType(JsonNode node){
        MDIdentifierType identifier = new MDIdentifierType();

        if (node.has("authority")){
            identifier.setAuthority(printCICitationPropertyType(node.get("authority")));
        }

        if (node.has("code")){
            identifier.setCode(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("code")));
        }

        return identifier;
    }

    public static JsonNode parseRSIdentifierType (RSIdentifierType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getAuthority() != null) {
            node.set("authority", parseCICitationPropertyType(value.getAuthority()));
        }

        if (value.getCode() != null) {
            node.set("code", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getCode()));
        }

        if (value.getCodeSpace() != null) {
            node.set("codeSpace", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getCodeSpace()));
        }

        if (value.getVersion() != null) {
            node.set("version", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getVersion()));
        }

        return node;
    }

    public static RSIdentifierType printRSIdentifierType(JsonNode node){
        RSIdentifierType identifier = new RSIdentifierType();

        if (node.has("authority")){
            identifier.setAuthority(printCICitationPropertyType(node.get("authority")));
        }

        if (node.has("code")){
            identifier.setCode(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("code")));
        }

        if (node.has("codeSpace")){
            identifier.setCodeSpace(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("codeSpace")));
        }

        if (node.has("version")){
            identifier.setVersion(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("version")));
        }

        return identifier;
    }

    public static JsonNode parseMDTopicCategoryCodePropertyType (MDTopicCategoryCodePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getMDTopicCategoryCode() != null) {
            node.set("MDTopicCategoryCode", parseMDTopicCategoryCodeType(value.getMDTopicCategoryCode()));
        } else {
            node.nullNode();
        }
        return node;
    }

    public static MDTopicCategoryCodePropertyType printMDTopicCategoryCodePropertyType(JsonNode node){
        MDTopicCategoryCodePropertyType property = new MDTopicCategoryCodePropertyType();

        if (node.has("MDTopicCategoryCode")){
            property.setMDTopicCategoryCode(printMDTopicCategoryCodeType(node.get("MDTopicCategoryCode")));
        }

        return property;
    }
    
    public static JsonNode parseMDTopicCategoryCodeType (MDTopicCategoryCodeType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.value() != null) {
            node.set("value", objectMapper.getNodeFactory().textNode(value.value()));
        }

        return node;
    }

    public static MDTopicCategoryCodeType printMDTopicCategoryCodeType(JsonNode node){

        if (node.has("value")){
            MDTopicCategoryCodeType topicCategoryCode = MDTopicCategoryCodeType.fromValue(node.get("value").asText());
            return topicCategoryCode;
        }

        return null;
    }

    public static JsonNode parseCICitationPropertyType (CICitationPropertyType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getCICitation() != null) {
            node.set("CICitation", parseCICitationType(value.getCICitation()));
        } else {
            node.nullNode();
        }
        return node;
    }

    public static CICitationPropertyType printCICitationPropertyType(JsonNode node){
        CICitationPropertyType property = new CICitationPropertyType();

        if (node.has("CICitation")){
            property.setCICitation(printCICitationType(node.get("CICitation")));
        }

        return property;
    }

    public static JsonNode parseCICitationType(CICitationType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if(value.getTitle() != null) {
            node.set("title", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getTitle()));
        }

        ArrayNode cidpArray = objectMapper.createArrayNode();
        for (CIDatePropertyType cidate : value.getDate()) {
            cidpArray.add(parseCIDatePropertyType(cidate));
            
        }
        node.set("date", cidpArray);

        return node;
    }

    public static CICitationType printCICitationType(JsonNode node){
        CICitationType citation = new CICitationType();

        if (node.has("title")){
            citation.setTitle(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("title")));
        }

        ArrayNode dateArray = node.withArray("date");
        for (JsonNode dateNode : dateArray) {
            citation.getDate().add(printCIDatePropertyType(dateNode));
        }

        return citation;
    }

    public static JsonNode parseCIResponsiblePartyPropertyType (CIResponsiblePartyPropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getCIResponsibleParty() != null) {
            node.set("CIResponsibleParty", parseCIResponsiblePartyType(value.getCIResponsibleParty()));
        } else {
            node.nullNode();
        }

        return node;
    }

    public static CIResponsiblePartyPropertyType printCIResponsiblePartyPropertyType(JsonNode node){
        CIResponsiblePartyPropertyType property = new CIResponsiblePartyPropertyType();

        if (node.has("CIResponsibleParty")){
            property.setCIResponsibleParty(printCIResponsiblePartyType(node.get("CIResponsibleParty")));
        }

        return property;
    }

    public static JsonNode parseCIResponsiblePartyType(CIResponsiblePartyType value){
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getIndividualName() != null) {
            node.set("individualName", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getIndividualName()));
        }

        if (value.getOrganisationName() != null) {
            node.set("organisationName", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getOrganisationName()));
        }

        if (value.getPositionName() != null) {
            node.set("positionName", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getPositionName()));
        }

        if (value.getContactInfo() != null) {
            node.set("contactInfo", parseCIContactPropertyType(value.getContactInfo()));
        }

        if (value.getRole() != null) {
            node.set("role", BasicMetaDataHelper.parseCIRoleCodePropertyType(value.getRole()));
        }

        return node;
    }

    public static CIResponsiblePartyType printCIResponsiblePartyType(JsonNode node){
        CIResponsiblePartyType responsibleParty = new CIResponsiblePartyType();

        if (node.has("individualName")){
            responsibleParty.setIndividualName(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("individualName")));
        }

        if (node.has("organisationName")){
            responsibleParty.setOrganisationName(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("organisationName")));
        }

        if (node.has("positionName")){
            responsibleParty.setPositionName(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("positionName")));
        }

        if (node.has("contactInfo")){
            responsibleParty.setContactInfo(printCIContactPropertyType(node.get("contactInfo")));
        }

        if (node.has("role")){
            responsibleParty.setRole(BasicMetaDataHelper.printCIRoleCodePropertyType(node.get("role")));
        }

        return responsibleParty;
    }

    public static JsonNode parseCIContactPropertyType(CIContactPropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getCIContact() != null) {
            node.set("CIContact", parseCIContactType(value.getCIContact()));
        } else {
            node.nullNode();
        }

        return node;
    }

    public static CIContactPropertyType printCIContactPropertyType(JsonNode node){
        CIContactPropertyType property = new CIContactPropertyType();

        if (node.has("CIContact")){
            property.setCIContact(printCIContactType(node.get("CIContact")));
        }

        return property;
    }
    
    public static JsonNode parseCIContactType(CIContactType value) {
        ObjectNode cicpNode = objectMapper.createObjectNode();

        if (value.getPhone() != null) {
            cicpNode.set("phone", BasicMetaDataHelper.parseCITelephonePropertyType(value.getPhone()));
        }

        if (value.getAddress() != null) {
            cicpNode.set("address", BasicMetaDataHelper.parseCIAdressPropertyType(value.getAddress()));
        }

        if (value.getOnlineResource() != null) {
            cicpNode.set("onlineResource", BasicMetaDataHelper.parseCIOnlineRessourcePropertyType(value.getOnlineResource()));
        }

        if (value.getHoursOfService() != null) {
            cicpNode.set("hoursOfService", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getHoursOfService()));
        }

        if (value.getContactInstructions() != null) {
            cicpNode.set("contactInstructions", BasicMetaDataHelper.parseCharacterStringPropertyType(value.getContactInstructions()));
        }

        return cicpNode;
    }

    public static CIContactType printCIContactType(JsonNode node){
        CIContactType contact = new CIContactType();

        if (node.has("phone")){
            contact.setPhone(BasicMetaDataHelper.printCITelephonePropertyType(node.get("phone")));
        }

        if (node.has("address")){
            contact.setAddress(BasicMetaDataHelper.printCIAdressPropertyType(node.get("address")));
        }

        if (node.has("onlineResource")){
            contact.setOnlineResource(BasicMetaDataHelper.printCIOnlineRessourcePropertyType(node.get("onlineResource")));
        }

        if (node.has("hoursOfService")){
            contact.setHoursOfService(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("hoursOfService")));
        }

        if (node.has("contactInstructions")){
            contact.setContactInstructions(BasicMetaDataHelper.printCharacterStringPropertyType(node.get("contactInstructions")));
        }

        return contact;
    }

    public static JsonNode parseCIDatePropertyType(CIDatePropertyType value) {
        ObjectNode node = objectMapper.createObjectNode();

        if (value.getCIDate() != null) {
            node.set("CIDate", parseCIDateType(value.getCIDate()));
        } else {
            node.nullNode();
        }

        return node;
    }

    public static CIDatePropertyType printCIDatePropertyType(JsonNode node){
        CIDatePropertyType property = new CIDatePropertyType();

        if (node.has("CIDate")){
            property.setCIDate(printCIDateType(node.get("CIDate")));
        }

        return property;
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

    public static CIDateType printCIDateType(JsonNode node){
        CIDateType date = new CIDateType();

        if (node.has("date")){
            date.setDate(BasicMetaDataHelper.printDatePropertyType(node.get("date")));
        }

        if (node.has("dateType")){
            JsonNode dateTypeNode = node.get("dateType");
            CIDateTypeCodePropertyType dateType = new CIDateTypeCodePropertyType();

            if (dateTypeNode.has("ciDateTypeCode")){
                dateType.setCIDateTypeCode(BasicMetaDataHelper.printCodeListValueType(dateTypeNode.get("ciDateTypeCode")));
            }

            if (dateTypeNode.has("nilReason")){
                dateType.setNilReason(dateTypeNode.get("nilReason").asText());
            }

            date.setDateType(dateType);
        }

        return date;
    }
}
