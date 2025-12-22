package com.aixm.delorean.core.metadata.helper;

import com.aixm.delorean.core.org.gmd.v2007.*;
import com.aixm.delorean.core.org.gco.v2007.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.xml.bind.JAXBElement;

// https://ext.eurocontrol.int/aixm_confluence/display/ACGAMD/Metadata
public class MetadataHelper {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parseMdMetadata (MDMetadataType mdMetadata) {
        if (mdMetadata == null) {
            return null;
        }

        ObjectNode result = objectMapper.createObjectNode();

        // characterSet
        result.set("characterSet", BasicMetaDataHelper.parseCodeListValueType(mdMetadata.getCharacterSet().getMDCharacterSetCode()));

        // contact
        ArrayNode contactArray = objectMapper.createArrayNode();
        for (CIResponsiblePartyPropertyType crpp : mdMetadata.getContact()) {
            contactArray.add(CIMetadataHelper.parseCIResponsiblePartyPropertyType(crpp));
        }
        result.set("contact", contactArray);

        // dateStamp
        if (mdMetadata.getDateStamp() != null) {
            result.set("dateStamp", BasicMetaDataHelper.parseDatePropertyType(mdMetadata.getDateStamp()));
        }

        // Identification
        ArrayNode identificationInfoArray = objectMapper.createArrayNode();
        for (MDIdentificationPropertyType identificationInformation : mdMetadata.getIdentificationInfo()) {
            JAXBElement<? extends AbstractMDIdentificationType> aitElement = identificationInformation.getAbstractMDIdentification();
            if (aitElement == null ) {
                continue;
            } 

            AbstractMDIdentificationType abstractIdentification = aitElement.getValue();

            if (abstractIdentification == null){
                continue;

            }

            ObjectNode aitNode = objectMapper.createObjectNode();
            
            if (MDDataIdentificationType.class.isAssignableFrom(abstractIdentification.getClass())) {
                MDDataIdentificationType dataIdentification = (MDDataIdentificationType) abstractIdentification;
                // Citation
                aitNode.set("citation", CIMetadataHelper.parseCICitationPropertyType(dataIdentification.getCitation()));
                
                // PointOfContact
                ArrayNode pointOfContactArray = objectMapper.createArrayNode();
                for (CIResponsiblePartyPropertyType cirpp : dataIdentification.getPointOfContact()){
                    pointOfContactArray.add(CIMetadataHelper.parseCIResponsiblePartyPropertyType(cirpp));
                }
                aitNode.set("pointOfContact", pointOfContactArray);

                // Language
                ArrayNode languageArray = objectMapper.createArrayNode();
                for (CharacterStringPropertyType csp : dataIdentification.getLanguage()){
                    languageArray.add(BasicMetaDataHelper.parseCaracterStringPropertyType(csp));
                }
                aitNode.set("language", languageArray);

                // TopicCategory
                ArrayNode topicArray = objectMapper.createArrayNode();
                for (MDTopicCategoryCodePropertyType mdtccp : dataIdentification.getTopicCategory()){
                    topicArray.add(CIMetadataHelper.parseMDTopicCategoryCodePropertyType(mdtccp));
                }
                aitNode.set("topicCategory", topicArray);

                // Extent  (Description, GeographicDescription, GeographicalExtent, Validity)
                ArrayNode extentArray = objectMapper.createArrayNode();
                for (EXExtentPropertyType exep : dataIdentification.getExtent()) {
                    extentArray.add(CIMetadataHelper.parseEXExtentPropertyType(exep));
                }
                aitNode.set("extent", topicArray);

                // Resource Constraints (useLimitation, acessConstraintss, classification)
                ArrayNode ressourceConstraintsArray = objectMapper.createArrayNode();
                for (MDConstraintsPropertyType mdcp : dataIdentification.getResourceConstraints()) {
                    ressourceConstraintsArray.add(CIMetadataHelper.parseMDConstraintsPropertyType(mdcp));
                }
                aitNode.set("resourceConstraints", topicArray);

                // Abstract 
                aitNode.set("abstract", BasicMetaDataHelper.parseCaracterStringPropertyType(dataIdentification.getAbstractValue()));
                
            } else if (MDServiceIdentificationType.class.isAssignableFrom(abstractIdentification.getClass())) {
                MDServiceIdentificationType ServiceIdentification = (MDServiceIdentificationType) abstractIdentification;
                



            } else {
                throw new IllegalArgumentException("Only MDDataIdentificationType and MDServiceIdentificationType are supported as extension of AbstractMDIdentificationType");
            }

            identificationInfoArray.add(aitNode);
        }

        // Quality (Scope, Lineage, ProcessStep, Description, DateTime, Lineage) missing (Data Quality measure, Compliance)
        ArrayNode dataQualityArray = objectMapper.createArrayNode();
        for (DQDataQualityPropertyType dataQuality : mdMetadata.getDataQualityInfo()) {
            dataQualityArray.add(CIMetadataHelper.parseDQDataQualityPropertyType(dataQuality));
        }
        result.set("dataQuality", contactArray);

        // Maintenance (MaintenanceAndUpdateFreq, Maintenance Note, Contact)
        ObjectNode maintenanceInformationNode = objectMapper.createObjectNode();
        if (mdMetadata.getMetadataMaintenance() != null && mdMetadata.getMetadataMaintenance().getMDMaintenanceInformation() != null) {
            MDMaintenanceInformationType  maintenanceInformation = mdMetadata.getMetadataMaintenance().getMDMaintenanceInformation();

            if (maintenanceInformation.getMaintenanceAndUpdateFrequency() != null) {
                maintenanceInformationNode.set("maintenanceAndUpdateFrequency", CIMetadataHelper.parseMDMaintenanceFrequencyCodePropertyType(maintenanceInformation.getMaintenanceAndUpdateFrequency()));
            }

            ArrayNode maintenanceNoteArray = objectMapper.createArrayNode();
            for (CharacterStringPropertyType maintenanceNote : maintenanceInformation.getMaintenanceNote()) {
                maintenanceNoteArray.add(BasicMetaDataHelper.parseCaracterStringPropertyType(maintenanceNote));
            }
            maintenanceInformationNode.set("maintenanceNote", maintenanceNoteArray);

            ArrayNode maintenanceContactArray = objectMapper.createArrayNode();
            for (CIResponsiblePartyPropertyType maintenanceContact : maintenanceInformation.getContact()) {
                maintenanceContactArray.add(CIMetadataHelper.parseCIResponsiblePartyPropertyType(maintenanceContact));
            }
            maintenanceInformationNode.set("contact", maintenanceContactArray);
        }
        result.set("maintenance", maintenanceInformationNode);

        // Reference system (Temporal reference system, ReferenceSystemIdentifier, Authority, Code, CodeSpace, Version)
        ArrayNode referenceSystemArray = objectMapper.createArrayNode();
        for (MDReferenceSystemPropertyType referenceSystemProperty : mdMetadata.getReferenceSystemInfo()){

            if (referenceSystemProperty == null) {
                continue;
            }

            ObjectNode referenceSystemNode = objectMapper.createObjectNode();
            MDReferenceSystemType referenceSystem = referenceSystemProperty.getMDReferenceSystem();

            if (referenceSystem.getReferenceSystemIdentifier() != null){
                referenceSystemNode.set("referenceSystemIdentifier", CIMetadataHelper.parseRSIdentifierPropertyType(referenceSystem.getReferenceSystemIdentifier()));
            }

            referenceSystemArray.add(referenceSystemNode);

        }
        result.set("referenceSystemInfo", referenceSystemArray);

        // Distribution (DistributorFormat, DistributorContact, Name, Version)
        ObjectNode distributionNode = objectMapper.createObjectNode();
        if (mdMetadata.getDistributionInfo() != null && mdMetadata.getDistributionInfo().getMDDistribution() != null){
            MDDistributionType distribution = mdMetadata.getDistributionInfo().getMDDistribution();

            ArrayNode formatArray = objectMapper.createArrayNode();
            for (MDFormatPropertyType format : distribution.getDistributionFormat()){
                formatArray.add(CIMetadataHelper.parseMDFormatPropertyType(format));
            }
            distributionNode.set("format", formatArray);

            ArrayNode distributorArray = objectMapper.createArrayNode();
            for (MDDistributorPropertyType distributor : distribution.getDistributor()){
                distributorArray.add(CIMetadataHelper.parseMDDistributorPropertyType(distributor));
            }
            distributionNode.set("distributor", distributorArray);
        }
        result.set("referenceSystemInfo", distributionNode);
        
        // dataIntegrity
        // qualityClassification
        // horzUnit 
        // vertUnit
        
        return result;
    }






    public static MDMetadataType printMdMetadata (JsonNode mdMetadataNode) {

        return null;
    }
    
}
