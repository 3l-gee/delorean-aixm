package com.delorean.aixm.core.metadata.helper;

import com.delorean.aixm.core.org.gmd.v2007.*;

import java.io.StringWriter;

import com.delorean.aixm.core.org.gco.v2007.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

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
                    languageArray.add(BasicMetaDataHelper.parseCharacterStringPropertyType(csp));
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
                aitNode.set("abstract", BasicMetaDataHelper.parseCharacterStringPropertyType(dataIdentification.getAbstractValue()));
                
            } else if (MDServiceIdentificationType.class.isAssignableFrom(abstractIdentification.getClass())) {
                MDServiceIdentificationType ServiceIdentification = (MDServiceIdentificationType) abstractIdentification;
                



            } else {
                throw new IllegalArgumentException("Only MDDataIdentificationType and MDServiceIdentificationType are supported as extension of AbstractMDIdentificationType");
            }

            identificationInfoArray.add(aitNode);
        }

        result.set("identificationInfo", identificationInfoArray);

        // Quality (Scope, Lineage, ProcessStep, Description, DateTime, Lineage) missing (Data Quality measure, Compliance)
        ArrayNode dataQualityArray = objectMapper.createArrayNode();
        for (DQDataQualityPropertyType dataQuality : mdMetadata.getDataQualityInfo()) {
            dataQualityArray.add(CIMetadataHelper.parseDQDataQualityPropertyType(dataQuality));
        }
        result.set("dataQuality", dataQualityArray);

        // Maintenance (MaintenanceAndUpdateFreq, Maintenance Note, Contact)
        ObjectNode maintenanceInformationNode = objectMapper.createObjectNode();
        if (mdMetadata.getMetadataMaintenance() != null && mdMetadata.getMetadataMaintenance().getMDMaintenanceInformation() != null) {
            MDMaintenanceInformationType  maintenanceInformation = mdMetadata.getMetadataMaintenance().getMDMaintenanceInformation();

            if (maintenanceInformation.getMaintenanceAndUpdateFrequency() != null) {
                maintenanceInformationNode.set("maintenanceAndUpdateFrequency", CIMetadataHelper.parseMDMaintenanceFrequencyCodePropertyType(maintenanceInformation.getMaintenanceAndUpdateFrequency()));
            }

            ArrayNode maintenanceNoteArray = objectMapper.createArrayNode();
            for (CharacterStringPropertyType maintenanceNote : maintenanceInformation.getMaintenanceNote()) {
                maintenanceNoteArray.add(BasicMetaDataHelper.parseCharacterStringPropertyType(maintenanceNote));
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


    public static MDMetadataType printMdMetadata(JsonNode mdMetadataNode) {
        if (mdMetadataNode == null || mdMetadataNode.isNull()) {
            return null;
        }

        MDMetadataType metadata = new MDMetadataType();

        // characterSet
        if (mdMetadataNode.has("characterSet")) {
            MDCharacterSetCodePropertyType characterSet = new MDCharacterSetCodePropertyType();
            characterSet.setMDCharacterSetCode(
                BasicMetaDataHelper.printCodeListValueType(mdMetadataNode.get("characterSet"))
            );

            metadata.setCharacterSet(characterSet);
        }

        // contact
        if (mdMetadataNode.has("contact") && mdMetadataNode.get("contact").isArray()) {
            for (JsonNode contactNode : mdMetadataNode.get("contact")) {
                metadata.getContact().add(
                    CIMetadataHelper.printCIResponsiblePartyPropertyType(contactNode)
                );
            }
        }

        // dateStamp
        if (mdMetadataNode.has("dateStamp")) {
            metadata.setDateStamp(
                BasicMetaDataHelper.printDatePropertyType(
                    mdMetadataNode.get("dateStamp")
                )
            );
        }

        // identificationInfo
        if (mdMetadataNode.has("identificationInfo")
                && mdMetadataNode.get("identificationInfo").isArray()) {

            for (JsonNode identificationNode : mdMetadataNode.get("identificationInfo")) {

                MDDataIdentificationType identification = new MDDataIdentificationType();

                // citation
                if (identificationNode.has("citation")) {
                    identification.setCitation(
                        CIMetadataHelper.printCICitationPropertyType(
                            identificationNode.get("citation")
                        )
                    );
                }

                // pointOfContact
                if (identificationNode.has("pointOfContact")) {
                    for (JsonNode pocNode : identificationNode.get("pointOfContact")) {
                        identification.getPointOfContact().add(
                            CIMetadataHelper.printCIResponsiblePartyPropertyType(pocNode)
                        );
                    }
                }

                // language
                if (identificationNode.has("language")) {
                    for (JsonNode languageNode : identificationNode.get("language")) {
                        identification.getLanguage().add(
                            BasicMetaDataHelper.printCharacterStringPropertyType(languageNode)
                        );
                    }
                }

                // topicCategory
                if (identificationNode.has("topicCategory")) {
                    for (JsonNode topicNode : identificationNode.get("topicCategory")) {
                        identification.getTopicCategory().add(
                            CIMetadataHelper.printMDTopicCategoryCodePropertyType(topicNode)
                        );
                    }
                }

                // extent
                if (identificationNode.has("extent")) {
                    for (JsonNode extentNode : identificationNode.get("extent")) {
                        identification.getExtent().add(
                            CIMetadataHelper.printEXExtentPropertyType(extentNode)
                        );
                    }
                }

                // resourceConstraints
                if (identificationNode.has("resourceConstraints")) {
                    for (JsonNode constraintNode : identificationNode.get("resourceConstraints")) {
                        identification.getResourceConstraints().add(
                            CIMetadataHelper.printMDConstraintsPropertyType(constraintNode)
                        );
                    }
                }

                // abstract
                if (identificationNode.has("abstract")) {
                    identification.setAbstractValue(
                        BasicMetaDataHelper.printCharacterStringPropertyType(
                            identificationNode.get("abstract")
                        )
                    );
                }

                MDIdentificationPropertyType identificationProperty = new MDIdentificationPropertyType();
                identificationProperty.setAbstractMDIdentification(new JAXBElement<>(
                    new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DataIdentification"),
                    MDDataIdentificationType.class,
                    identification
                ));
                metadata.getIdentificationInfo().add(identificationProperty);
            }
        }

        // dataQuality
        if (mdMetadataNode.has("dataQuality")
                && mdMetadataNode.get("dataQuality").isArray()) {

            for (JsonNode qualityNode : mdMetadataNode.get("dataQuality")) {
                metadata.getDataQualityInfo().add(
                    CIMetadataHelper.printDQDataQualityPropertyType(qualityNode)
                );
            }
        }

        // maintenance
        if (mdMetadataNode.has("maintenance")) {

            JsonNode maintenanceNode = mdMetadataNode.get("maintenance");

            MDMaintenanceInformationType maintenance =
                    new MDMaintenanceInformationType();

            if (maintenanceNode.has("maintenanceAndUpdateFrequency")) {
                maintenance.setMaintenanceAndUpdateFrequency(
                    CIMetadataHelper.printMDMaintenanceFrequencyCodePropertyType(
                        maintenanceNode.get("maintenanceAndUpdateFrequency")
                    )
                );
            }

            if (maintenanceNode.has("maintenanceNote")) {
                for (JsonNode noteNode : maintenanceNode.get("maintenanceNote")) {
                    maintenance.getMaintenanceNote().add(
                        BasicMetaDataHelper.printCharacterStringPropertyType(noteNode)
                    );
                }
            }

            if (maintenanceNode.has("contact")) {
                for (JsonNode contactNode : maintenanceNode.get("contact")) {
                    maintenance.getContact().add(
                        CIMetadataHelper.printCIResponsiblePartyPropertyType(contactNode)
                    );
                }
            }

            MDMaintenanceInformationPropertyType property =
                    new MDMaintenanceInformationPropertyType();

            property.setMDMaintenanceInformation(maintenance);

            metadata.setMetadataMaintenance(property);
        }

        // referenceSystemInfo
        if (mdMetadataNode.has("referenceSystemInfo")
                && mdMetadataNode.get("referenceSystemInfo").isArray()) {

            for (JsonNode rsNode : mdMetadataNode.get("referenceSystemInfo")) {

                MDReferenceSystemType referenceSystem =
                        new MDReferenceSystemType();

                if (rsNode.has("referenceSystemIdentifier")) {
                    referenceSystem.setReferenceSystemIdentifier(
                        CIMetadataHelper.printRSIdentifierPropertyType(
                            rsNode.get("referenceSystemIdentifier")
                        )
                    );
                }

                MDReferenceSystemPropertyType property =
                        new MDReferenceSystemPropertyType();

                property.setMDReferenceSystem(referenceSystem);

                metadata.getReferenceSystemInfo().add(property);
            }
        }

        // distribution
        if (mdMetadataNode.has("distribution")) {

            JsonNode distributionNode = mdMetadataNode.get("distribution");

            MDDistributionType distribution = new MDDistributionType();

            // format
            if (distributionNode.has("format")) {
                for (JsonNode formatNode : distributionNode.get("format")) {
                    distribution.getDistributionFormat().add(
                        CIMetadataHelper.printMDFormatPropertyType(formatNode)
                    );
                }
            }

            // distributor
            if (distributionNode.has("distributor")) {
                for (JsonNode distributorNode : distributionNode.get("distributor")) {
                    distribution.getDistributor().add(
                        CIMetadataHelper.printMDDistributorPropertyType(distributorNode)
                    );
                }
            }

            MDDistributionPropertyType property =
                    new MDDistributionPropertyType();

            property.setMDDistribution(distribution);

            metadata.setDistributionInfo(property);
        }

        return metadata;
    }
}
