
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DatePropertyType;
import com.aixm.delorean.core.org.gco.v2007.ObjectReferencePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about the metadata
 * 
 * <p>Java class for MD_Metadata_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Metadata_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="fileIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" minOccurs="0"/>
 *         <element name="parentIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="hierarchyLevel" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hierarchyLevelName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *         <element name="dateStamp" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/>
 *         <element name="metadataStandardName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="metadataStandardVersion" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="dataSetURI" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="locale" type="{http://www.isotc211.org/2005/gmd}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="spatialRepresentationInfo" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="referenceSystemInfo" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="metadataExtensionInfo" type="{http://www.isotc211.org/2005/gmd}MD_MetadataExtensionInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="identificationInfo" type="{http://www.isotc211.org/2005/gmd}MD_Identification_PropertyType" maxOccurs="unbounded"/>
 *         <element name="contentInfo" type="{http://www.isotc211.org/2005/gmd}MD_ContentInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributionInfo" type="{http://www.isotc211.org/2005/gmd}MD_Distribution_PropertyType" minOccurs="0"/>
 *         <element name="dataQualityInfo" type="{http://www.isotc211.org/2005/gmd}DQ_DataQuality_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="portrayalCatalogueInfo" type="{http://www.isotc211.org/2005/gmd}MD_PortrayalCatalogueReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="metadataConstraints" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="applicationSchemaInfo" type="{http://www.isotc211.org/2005/gmd}MD_ApplicationSchemaInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="metadataMaintenance" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceInformation_PropertyType" minOccurs="0"/>
 *         <element name="series" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="describes" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="propertyType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureAttribute" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Metadata_Type", propOrder = {
    "fileIdentifier",
    "language",
    "characterSet",
    "parentIdentifier",
    "hierarchyLevel",
    "hierarchyLevelName",
    "contact",
    "dateStamp",
    "metadataStandardName",
    "metadataStandardVersion",
    "dataSetURI",
    "locale",
    "spatialRepresentationInfo",
    "referenceSystemInfo",
    "metadataExtensionInfo",
    "identificationInfo",
    "contentInfo",
    "distributionInfo",
    "dataQualityInfo",
    "portrayalCatalogueInfo",
    "metadataConstraints",
    "applicationSchemaInfo",
    "metadataMaintenance",
    "series",
    "describes",
    "propertyType",
    "featureType",
    "featureAttribute"
})
public class MDMetadataType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fileIdentifier;
    protected CharacterStringPropertyType language;
    protected MDCharacterSetCodePropertyType characterSet;
    protected CharacterStringPropertyType parentIdentifier;
    protected List<MDScopeCodePropertyType> hierarchyLevel;
    protected List<CharacterStringPropertyType> hierarchyLevelName;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> contact;
    @XmlElement(required = true)
    protected DatePropertyType dateStamp;
    protected CharacterStringPropertyType metadataStandardName;
    protected CharacterStringPropertyType metadataStandardVersion;
    protected CharacterStringPropertyType dataSetURI;
    protected List<PTLocalePropertyType> locale;
    protected List<MDSpatialRepresentationPropertyType> spatialRepresentationInfo;
    protected List<MDReferenceSystemPropertyType> referenceSystemInfo;
    protected List<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo;
    @XmlElement(required = true)
    protected List<MDIdentificationPropertyType> identificationInfo;
    protected List<MDContentInformationPropertyType> contentInfo;
    protected MDDistributionPropertyType distributionInfo;
    protected List<DQDataQualityPropertyType> dataQualityInfo;
    protected List<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo;
    protected List<MDConstraintsPropertyType> metadataConstraints;
    protected List<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo;
    protected MDMaintenanceInformationPropertyType metadataMaintenance;
    protected List<DSAggregatePropertyType> series;
    protected List<DSDataSetPropertyType> describes;
    protected List<ObjectReferencePropertyType> propertyType;
    protected List<ObjectReferencePropertyType> featureType;
    protected List<ObjectReferencePropertyType> featureAttribute;

    /**
     * Gets the value of the fileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * Sets the value of the fileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileIdentifier(CharacterStringPropertyType value) {
        this.fileIdentifier = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setLanguage(CharacterStringPropertyType value) {
        this.language = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterSet(MDCharacterSetCodePropertyType value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the parentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * Sets the value of the parentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setParentIdentifier(CharacterStringPropertyType value) {
        this.parentIdentifier = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getHierarchyLevel() {
        if (hierarchyLevel == null) {
            hierarchyLevel = new ArrayList<>();
        }
        return this.hierarchyLevel;
    }

    /**
     * 
     * 
     */
    public void setHierarchyLevel(List<MDScopeCodePropertyType> hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    /**
     * Gets the value of the hierarchyLevelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getHierarchyLevelName() {
        if (hierarchyLevelName == null) {
            hierarchyLevelName = new ArrayList<>();
        }
        return this.hierarchyLevelName;
    }

    /**
     * 
     * 
     */
    public void setHierarchyLevelName(List<CharacterStringPropertyType> hierarchyLevelName) {
        this.hierarchyLevelName = hierarchyLevelName;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * 
     * 
     */
    public void setContact(List<CIResponsiblePartyPropertyType> contact) {
        this.contact = contact;
    }

    /**
     * Gets the value of the dateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateStamp() {
        return dateStamp;
    }

    /**
     * Sets the value of the dateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateStamp(DatePropertyType value) {
        this.dateStamp = value;
    }

    /**
     * Gets the value of the metadataStandardName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardName() {
        return metadataStandardName;
    }

    /**
     * Sets the value of the metadataStandardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardName(CharacterStringPropertyType value) {
        this.metadataStandardName = value;
    }

    /**
     * Gets the value of the metadataStandardVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    /**
     * Sets the value of the metadataStandardVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardVersion(CharacterStringPropertyType value) {
        this.metadataStandardVersion = value;
    }

    /**
     * Gets the value of the dataSetURI property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataSetURI() {
        return dataSetURI;
    }

    /**
     * Sets the value of the dataSetURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataSetURI(CharacterStringPropertyType value) {
        this.dataSetURI = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getLocale() {
        if (locale == null) {
            locale = new ArrayList<>();
        }
        return this.locale;
    }

    /**
     * 
     * 
     */
    public void setLocale(List<PTLocalePropertyType> locale) {
        this.locale = locale;
    }

    /**
     * Gets the value of the spatialRepresentationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationPropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo() {
        if (spatialRepresentationInfo == null) {
            spatialRepresentationInfo = new ArrayList<>();
        }
        return this.spatialRepresentationInfo;
    }

    /**
     * 
     * 
     */
    public void setSpatialRepresentationInfo(List<MDSpatialRepresentationPropertyType> spatialRepresentationInfo) {
        this.spatialRepresentationInfo = spatialRepresentationInfo;
    }

    /**
     * Gets the value of the referenceSystemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceSystemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDReferenceSystemPropertyType }
     * 
     * 
     */
    public List<MDReferenceSystemPropertyType> getReferenceSystemInfo() {
        if (referenceSystemInfo == null) {
            referenceSystemInfo = new ArrayList<>();
        }
        return this.referenceSystemInfo;
    }

    /**
     * 
     * 
     */
    public void setReferenceSystemInfo(List<MDReferenceSystemPropertyType> referenceSystemInfo) {
        this.referenceSystemInfo = referenceSystemInfo;
    }

    /**
     * Gets the value of the metadataExtensionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataExtensionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataExtensionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataExtensionInformationPropertyType }
     * 
     * 
     */
    public List<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo() {
        if (metadataExtensionInfo == null) {
            metadataExtensionInfo = new ArrayList<>();
        }
        return this.metadataExtensionInfo;
    }

    /**
     * 
     * 
     */
    public void setMetadataExtensionInfo(List<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo) {
        this.metadataExtensionInfo = metadataExtensionInfo;
    }

    /**
     * Gets the value of the identificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentificationPropertyType }
     * 
     * 
     */
    public List<MDIdentificationPropertyType> getIdentificationInfo() {
        if (identificationInfo == null) {
            identificationInfo = new ArrayList<>();
        }
        return this.identificationInfo;
    }

    /**
     * 
     * 
     */
    public void setIdentificationInfo(List<MDIdentificationPropertyType> identificationInfo) {
        this.identificationInfo = identificationInfo;
    }

    /**
     * Gets the value of the contentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDContentInformationPropertyType }
     * 
     * 
     */
    public List<MDContentInformationPropertyType> getContentInfo() {
        if (contentInfo == null) {
            contentInfo = new ArrayList<>();
        }
        return this.contentInfo;
    }

    /**
     * 
     * 
     */
    public void setContentInfo(List<MDContentInformationPropertyType> contentInfo) {
        this.contentInfo = contentInfo;
    }

    /**
     * Gets the value of the distributionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public MDDistributionPropertyType getDistributionInfo() {
        return distributionInfo;
    }

    /**
     * Sets the value of the distributionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public void setDistributionInfo(MDDistributionPropertyType value) {
        this.distributionInfo = value;
    }

    /**
     * Gets the value of the dataQualityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataQualityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataQualityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQDataQualityPropertyType }
     * 
     * 
     */
    public List<DQDataQualityPropertyType> getDataQualityInfo() {
        if (dataQualityInfo == null) {
            dataQualityInfo = new ArrayList<>();
        }
        return this.dataQualityInfo;
    }

    /**
     * 
     * 
     */
    public void setDataQualityInfo(List<DQDataQualityPropertyType> dataQualityInfo) {
        this.dataQualityInfo = dataQualityInfo;
    }

    /**
     * Gets the value of the portrayalCatalogueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDPortrayalCatalogueReferencePropertyType }
     * 
     * 
     */
    public List<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo() {
        if (portrayalCatalogueInfo == null) {
            portrayalCatalogueInfo = new ArrayList<>();
        }
        return this.portrayalCatalogueInfo;
    }

    /**
     * 
     * 
     */
    public void setPortrayalCatalogueInfo(List<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo) {
        this.portrayalCatalogueInfo = portrayalCatalogueInfo;
    }

    /**
     * Gets the value of the metadataConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getMetadataConstraints() {
        if (metadataConstraints == null) {
            metadataConstraints = new ArrayList<>();
        }
        return this.metadataConstraints;
    }

    /**
     * 
     * 
     */
    public void setMetadataConstraints(List<MDConstraintsPropertyType> metadataConstraints) {
        this.metadataConstraints = metadataConstraints;
    }

    /**
     * Gets the value of the applicationSchemaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSchemaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSchemaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDApplicationSchemaInformationPropertyType }
     * 
     * 
     */
    public List<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo() {
        if (applicationSchemaInfo == null) {
            applicationSchemaInfo = new ArrayList<>();
        }
        return this.applicationSchemaInfo;
    }

    /**
     * 
     * 
     */
    public void setApplicationSchemaInfo(List<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo) {
        this.applicationSchemaInfo = applicationSchemaInfo;
    }

    /**
     * Gets the value of the metadataMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public MDMaintenanceInformationPropertyType getMetadataMaintenance() {
        return metadataMaintenance;
    }

    /**
     * Sets the value of the metadataMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public void setMetadataMaintenance(MDMaintenanceInformationPropertyType value) {
        this.metadataMaintenance = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSeries() {
        if (series == null) {
            series = new ArrayList<>();
        }
        return this.series;
    }

    /**
     * 
     * 
     */
    public void setSeries(List<DSAggregatePropertyType> series) {
        this.series = series;
    }

    /**
     * Gets the value of the describes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getDescribes() {
        if (describes == null) {
            describes = new ArrayList<>();
        }
        return this.describes;
    }

    /**
     * 
     * 
     */
    public void setDescribes(List<DSDataSetPropertyType> describes) {
        this.describes = describes;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getPropertyType() {
        if (propertyType == null) {
            propertyType = new ArrayList<>();
        }
        return this.propertyType;
    }

    /**
     * 
     * 
     */
    public void setPropertyType(List<ObjectReferencePropertyType> propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureType() {
        if (featureType == null) {
            featureType = new ArrayList<>();
        }
        return this.featureType;
    }

    /**
     * 
     * 
     */
    public void setFeatureType(List<ObjectReferencePropertyType> featureType) {
        this.featureType = featureType;
    }

    /**
     * Gets the value of the featureAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureAttribute() {
        if (featureAttribute == null) {
            featureAttribute = new ArrayList<>();
        }
        return this.featureAttribute;
    }

    /**
     * 
     * 
     */
    public void setFeatureAttribute(List<ObjectReferencePropertyType> featureAttribute) {
        this.featureAttribute = featureAttribute;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDMetadataType that = ((MDMetadataType) object);
        {
            boolean lhsFieldIsSet = (this.dateStamp!= null);
            boolean rhsFieldIsSet = (that.dateStamp!= null);
            DatePropertyType lhsField;
            lhsField = this.getDateStamp();
            DatePropertyType rhsField;
            rhsField = that.getDateStamp();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateStamp", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateStamp", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.language!= null);
            boolean rhsFieldIsSet = (that.language!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getLanguage();
            CharacterStringPropertyType rhsField;
            rhsField = that.getLanguage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "language", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "language", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.characterSet!= null);
            boolean rhsFieldIsSet = (that.characterSet!= null);
            MDCharacterSetCodePropertyType lhsField;
            lhsField = this.getCharacterSet();
            MDCharacterSetCodePropertyType rhsField;
            rhsField = that.getCharacterSet();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "characterSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "characterSet", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.featureType!= null)&&(!this.featureType.isEmpty()));
            boolean rhsFieldIsSet = ((that.featureType!= null)&&(!that.featureType.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.featureType!= null)&&(!this.featureType.isEmpty()))?this.getFeatureType():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.featureType!= null)&&(!that.featureType.isEmpty()))?that.getFeatureType():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.locale!= null)&&(!this.locale.isEmpty()));
            boolean rhsFieldIsSet = ((that.locale!= null)&&(!that.locale.isEmpty()));
            List<PTLocalePropertyType> lhsField;
            lhsField = (((this.locale!= null)&&(!this.locale.isEmpty()))?this.getLocale():null);
            List<PTLocalePropertyType> rhsField;
            rhsField = (((that.locale!= null)&&(!that.locale.isEmpty()))?that.getLocale():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locale", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locale", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.fileIdentifier!= null);
            boolean rhsFieldIsSet = (that.fileIdentifier!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getFileIdentifier();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFileIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileIdentifier", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.distributionInfo!= null);
            boolean rhsFieldIsSet = (that.distributionInfo!= null);
            MDDistributionPropertyType lhsField;
            lhsField = this.getDistributionInfo();
            MDDistributionPropertyType rhsField;
            rhsField = that.getDistributionInfo();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributionInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributionInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.applicationSchemaInfo!= null)&&(!that.applicationSchemaInfo.isEmpty()));
            List<MDApplicationSchemaInformationPropertyType> lhsField;
            lhsField = (((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()))?this.getApplicationSchemaInfo():null);
            List<MDApplicationSchemaInformationPropertyType> rhsField;
            rhsField = (((that.applicationSchemaInfo!= null)&&(!that.applicationSchemaInfo.isEmpty()))?that.getApplicationSchemaInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicationSchemaInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicationSchemaInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.propertyType!= null)&&(!this.propertyType.isEmpty()));
            boolean rhsFieldIsSet = ((that.propertyType!= null)&&(!that.propertyType.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.propertyType!= null)&&(!this.propertyType.isEmpty()))?this.getPropertyType():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.propertyType!= null)&&(!that.propertyType.isEmpty()))?that.getPropertyType():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "propertyType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "propertyType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.describes!= null)&&(!this.describes.isEmpty()));
            boolean rhsFieldIsSet = ((that.describes!= null)&&(!that.describes.isEmpty()));
            List<DSDataSetPropertyType> lhsField;
            lhsField = (((this.describes!= null)&&(!this.describes.isEmpty()))?this.getDescribes():null);
            List<DSDataSetPropertyType> rhsField;
            rhsField = (((that.describes!= null)&&(!that.describes.isEmpty()))?that.getDescribes():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "describes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "describes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.metadataStandardName!= null);
            boolean rhsFieldIsSet = (that.metadataStandardName!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getMetadataStandardName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getMetadataStandardName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metadataStandardName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metadataStandardName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()));
            boolean rhsFieldIsSet = ((that.metadataConstraints!= null)&&(!that.metadataConstraints.isEmpty()));
            List<MDConstraintsPropertyType> lhsField;
            lhsField = (((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()))?this.getMetadataConstraints():null);
            List<MDConstraintsPropertyType> rhsField;
            rhsField = (((that.metadataConstraints!= null)&&(!that.metadataConstraints.isEmpty()))?that.getMetadataConstraints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metadataConstraints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metadataConstraints", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.series!= null)&&(!this.series.isEmpty()));
            boolean rhsFieldIsSet = ((that.series!= null)&&(!that.series.isEmpty()));
            List<DSAggregatePropertyType> lhsField;
            lhsField = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            List<DSAggregatePropertyType> rhsField;
            rhsField = (((that.series!= null)&&(!that.series.isEmpty()))?that.getSeries():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "series", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "series", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.spatialRepresentationInfo!= null)&&(!that.spatialRepresentationInfo.isEmpty()));
            List<MDSpatialRepresentationPropertyType> lhsField;
            lhsField = (((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()))?this.getSpatialRepresentationInfo():null);
            List<MDSpatialRepresentationPropertyType> rhsField;
            rhsField = (((that.spatialRepresentationInfo!= null)&&(!that.spatialRepresentationInfo.isEmpty()))?that.getSpatialRepresentationInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialRepresentationInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialRepresentationInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()));
            boolean rhsFieldIsSet = ((that.hierarchyLevel!= null)&&(!that.hierarchyLevel.isEmpty()));
            List<MDScopeCodePropertyType> lhsField;
            lhsField = (((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()))?this.getHierarchyLevel():null);
            List<MDScopeCodePropertyType> rhsField;
            rhsField = (((that.hierarchyLevel!= null)&&(!that.hierarchyLevel.isEmpty()))?that.getHierarchyLevel():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hierarchyLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hierarchyLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.contentInfo!= null)&&(!that.contentInfo.isEmpty()));
            List<MDContentInformationPropertyType> lhsField;
            lhsField = (((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()))?this.getContentInfo():null);
            List<MDContentInformationPropertyType> rhsField;
            rhsField = (((that.contentInfo!= null)&&(!that.contentInfo.isEmpty()))?that.getContentInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contentInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contentInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.parentIdentifier!= null);
            boolean rhsFieldIsSet = (that.parentIdentifier!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getParentIdentifier();
            CharacterStringPropertyType rhsField;
            rhsField = that.getParentIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parentIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parentIdentifier", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.metadataExtensionInfo!= null)&&(!that.metadataExtensionInfo.isEmpty()));
            List<MDMetadataExtensionInformationPropertyType> lhsField;
            lhsField = (((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()))?this.getMetadataExtensionInfo():null);
            List<MDMetadataExtensionInformationPropertyType> rhsField;
            rhsField = (((that.metadataExtensionInfo!= null)&&(!that.metadataExtensionInfo.isEmpty()))?that.getMetadataExtensionInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metadataExtensionInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metadataExtensionInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()));
            boolean rhsFieldIsSet = ((that.hierarchyLevelName!= null)&&(!that.hierarchyLevelName.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()))?this.getHierarchyLevelName():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.hierarchyLevelName!= null)&&(!that.hierarchyLevelName.isEmpty()))?that.getHierarchyLevelName():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hierarchyLevelName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hierarchyLevelName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.contact!= null)&&(!this.contact.isEmpty()));
            boolean rhsFieldIsSet = ((that.contact!= null)&&(!that.contact.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.contact!= null)&&(!that.contact.isEmpty()))?that.getContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.referenceSystemInfo!= null)&&(!that.referenceSystemInfo.isEmpty()));
            List<MDReferenceSystemPropertyType> lhsField;
            lhsField = (((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()))?this.getReferenceSystemInfo():null);
            List<MDReferenceSystemPropertyType> rhsField;
            rhsField = (((that.referenceSystemInfo!= null)&&(!that.referenceSystemInfo.isEmpty()))?that.getReferenceSystemInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceSystemInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceSystemInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.metadataMaintenance!= null);
            boolean rhsFieldIsSet = (that.metadataMaintenance!= null);
            MDMaintenanceInformationPropertyType lhsField;
            lhsField = this.getMetadataMaintenance();
            MDMaintenanceInformationPropertyType rhsField;
            rhsField = that.getMetadataMaintenance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metadataMaintenance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metadataMaintenance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.portrayalCatalogueInfo!= null)&&(!that.portrayalCatalogueInfo.isEmpty()));
            List<MDPortrayalCatalogueReferencePropertyType> lhsField;
            lhsField = (((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()))?this.getPortrayalCatalogueInfo():null);
            List<MDPortrayalCatalogueReferencePropertyType> rhsField;
            rhsField = (((that.portrayalCatalogueInfo!= null)&&(!that.portrayalCatalogueInfo.isEmpty()))?that.getPortrayalCatalogueInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "portrayalCatalogueInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "portrayalCatalogueInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.dataSetURI!= null);
            boolean rhsFieldIsSet = (that.dataSetURI!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getDataSetURI();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDataSetURI();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataSetURI", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataSetURI", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.dataQualityInfo!= null)&&(!that.dataQualityInfo.isEmpty()));
            List<DQDataQualityPropertyType> lhsField;
            lhsField = (((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()))?this.getDataQualityInfo():null);
            List<DQDataQualityPropertyType> rhsField;
            rhsField = (((that.dataQualityInfo!= null)&&(!that.dataQualityInfo.isEmpty()))?that.getDataQualityInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataQualityInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataQualityInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()));
            boolean rhsFieldIsSet = ((that.featureAttribute!= null)&&(!that.featureAttribute.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()))?this.getFeatureAttribute():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.featureAttribute!= null)&&(!that.featureAttribute.isEmpty()))?that.getFeatureAttribute():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureAttribute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureAttribute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.metadataStandardVersion!= null);
            boolean rhsFieldIsSet = (that.metadataStandardVersion!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getMetadataStandardVersion();
            CharacterStringPropertyType rhsField;
            rhsField = that.getMetadataStandardVersion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metadataStandardVersion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metadataStandardVersion", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.identificationInfo!= null)&&(!that.identificationInfo.isEmpty()));
            List<MDIdentificationPropertyType> lhsField;
            lhsField = (((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()))?this.getIdentificationInfo():null);
            List<MDIdentificationPropertyType> rhsField;
            rhsField = (((that.identificationInfo!= null)&&(!that.identificationInfo.isEmpty()))?that.getIdentificationInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "identificationInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "identificationInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = (this.fileIdentifier!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.language!= null);
            CharacterStringPropertyType theField;
            theField = this.getLanguage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "language", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.characterSet!= null);
            MDCharacterSetCodePropertyType theField;
            theField = this.getCharacterSet();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "characterSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.parentIdentifier!= null);
            CharacterStringPropertyType theField;
            theField = this.getParentIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parentIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()));
            List<MDScopeCodePropertyType> theField;
            theField = (((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()))?this.getHierarchyLevel():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hierarchyLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()))?this.getHierarchyLevelName():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hierarchyLevelName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.contact!= null)&&(!this.contact.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateStamp!= null);
            DatePropertyType theField;
            theField = this.getDateStamp();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateStamp", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataStandardName!= null);
            CharacterStringPropertyType theField;
            theField = this.getMetadataStandardName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metadataStandardName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataStandardVersion!= null);
            CharacterStringPropertyType theField;
            theField = this.getMetadataStandardVersion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metadataStandardVersion", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataSetURI!= null);
            CharacterStringPropertyType theField;
            theField = this.getDataSetURI();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataSetURI", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.locale!= null)&&(!this.locale.isEmpty()));
            List<PTLocalePropertyType> theField;
            theField = (((this.locale!= null)&&(!this.locale.isEmpty()))?this.getLocale():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locale", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()));
            List<MDSpatialRepresentationPropertyType> theField;
            theField = (((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()))?this.getSpatialRepresentationInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialRepresentationInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()));
            List<MDReferenceSystemPropertyType> theField;
            theField = (((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()))?this.getReferenceSystemInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceSystemInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()));
            List<MDMetadataExtensionInformationPropertyType> theField;
            theField = (((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()))?this.getMetadataExtensionInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metadataExtensionInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()));
            List<MDIdentificationPropertyType> theField;
            theField = (((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()))?this.getIdentificationInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "identificationInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()));
            List<MDContentInformationPropertyType> theField;
            theField = (((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()))?this.getContentInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contentInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.distributionInfo!= null);
            MDDistributionPropertyType theField;
            theField = this.getDistributionInfo();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributionInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()));
            List<DQDataQualityPropertyType> theField;
            theField = (((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()))?this.getDataQualityInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataQualityInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()));
            List<MDPortrayalCatalogueReferencePropertyType> theField;
            theField = (((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()))?this.getPortrayalCatalogueInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "portrayalCatalogueInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()));
            List<MDConstraintsPropertyType> theField;
            theField = (((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()))?this.getMetadataConstraints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metadataConstraints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()));
            List<MDApplicationSchemaInformationPropertyType> theField;
            theField = (((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()))?this.getApplicationSchemaInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicationSchemaInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataMaintenance!= null);
            MDMaintenanceInformationPropertyType theField;
            theField = this.getMetadataMaintenance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metadataMaintenance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.series!= null)&&(!this.series.isEmpty()));
            List<DSAggregatePropertyType> theField;
            theField = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "series", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.describes!= null)&&(!this.describes.isEmpty()));
            List<DSDataSetPropertyType> theField;
            theField = (((this.describes!= null)&&(!this.describes.isEmpty()))?this.getDescribes():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "describes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.propertyType!= null)&&(!this.propertyType.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.propertyType!= null)&&(!this.propertyType.isEmpty()))?this.getPropertyType():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "propertyType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureType!= null)&&(!this.featureType.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureType!= null)&&(!this.featureType.isEmpty()))?this.getFeatureType():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()))?this.getFeatureAttribute():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureAttribute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.fileIdentifier!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileIdentifier();
            strategy.appendField(locator, this, "fileIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.language!= null);
            CharacterStringPropertyType theField;
            theField = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.characterSet!= null);
            MDCharacterSetCodePropertyType theField;
            theField = this.getCharacterSet();
            strategy.appendField(locator, this, "characterSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.parentIdentifier!= null);
            CharacterStringPropertyType theField;
            theField = this.getParentIdentifier();
            strategy.appendField(locator, this, "parentIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()));
            List<MDScopeCodePropertyType> theField;
            theField = (((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()))?this.getHierarchyLevel():null);
            strategy.appendField(locator, this, "hierarchyLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()))?this.getHierarchyLevelName():null);
            strategy.appendField(locator, this, "hierarchyLevelName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.contact!= null)&&(!this.contact.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateStamp!= null);
            DatePropertyType theField;
            theField = this.getDateStamp();
            strategy.appendField(locator, this, "dateStamp", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataStandardName!= null);
            CharacterStringPropertyType theField;
            theField = this.getMetadataStandardName();
            strategy.appendField(locator, this, "metadataStandardName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataStandardVersion!= null);
            CharacterStringPropertyType theField;
            theField = this.getMetadataStandardVersion();
            strategy.appendField(locator, this, "metadataStandardVersion", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataSetURI!= null);
            CharacterStringPropertyType theField;
            theField = this.getDataSetURI();
            strategy.appendField(locator, this, "dataSetURI", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.locale!= null)&&(!this.locale.isEmpty()));
            List<PTLocalePropertyType> theField;
            theField = (((this.locale!= null)&&(!this.locale.isEmpty()))?this.getLocale():null);
            strategy.appendField(locator, this, "locale", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()));
            List<MDSpatialRepresentationPropertyType> theField;
            theField = (((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()))?this.getSpatialRepresentationInfo():null);
            strategy.appendField(locator, this, "spatialRepresentationInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()));
            List<MDReferenceSystemPropertyType> theField;
            theField = (((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()))?this.getReferenceSystemInfo():null);
            strategy.appendField(locator, this, "referenceSystemInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()));
            List<MDMetadataExtensionInformationPropertyType> theField;
            theField = (((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()))?this.getMetadataExtensionInfo():null);
            strategy.appendField(locator, this, "metadataExtensionInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()));
            List<MDIdentificationPropertyType> theField;
            theField = (((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()))?this.getIdentificationInfo():null);
            strategy.appendField(locator, this, "identificationInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()));
            List<MDContentInformationPropertyType> theField;
            theField = (((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()))?this.getContentInfo():null);
            strategy.appendField(locator, this, "contentInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.distributionInfo!= null);
            MDDistributionPropertyType theField;
            theField = this.getDistributionInfo();
            strategy.appendField(locator, this, "distributionInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()));
            List<DQDataQualityPropertyType> theField;
            theField = (((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()))?this.getDataQualityInfo():null);
            strategy.appendField(locator, this, "dataQualityInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()));
            List<MDPortrayalCatalogueReferencePropertyType> theField;
            theField = (((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()))?this.getPortrayalCatalogueInfo():null);
            strategy.appendField(locator, this, "portrayalCatalogueInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()));
            List<MDConstraintsPropertyType> theField;
            theField = (((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()))?this.getMetadataConstraints():null);
            strategy.appendField(locator, this, "metadataConstraints", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()));
            List<MDApplicationSchemaInformationPropertyType> theField;
            theField = (((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()))?this.getApplicationSchemaInfo():null);
            strategy.appendField(locator, this, "applicationSchemaInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.metadataMaintenance!= null);
            MDMaintenanceInformationPropertyType theField;
            theField = this.getMetadataMaintenance();
            strategy.appendField(locator, this, "metadataMaintenance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.series!= null)&&(!this.series.isEmpty()));
            List<DSAggregatePropertyType> theField;
            theField = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            strategy.appendField(locator, this, "series", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.describes!= null)&&(!this.describes.isEmpty()));
            List<DSDataSetPropertyType> theField;
            theField = (((this.describes!= null)&&(!this.describes.isEmpty()))?this.getDescribes():null);
            strategy.appendField(locator, this, "describes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.propertyType!= null)&&(!this.propertyType.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.propertyType!= null)&&(!this.propertyType.isEmpty()))?this.getPropertyType():null);
            strategy.appendField(locator, this, "propertyType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureType!= null)&&(!this.featureType.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureType!= null)&&(!this.featureType.isEmpty()))?this.getFeatureType():null);
            strategy.appendField(locator, this, "featureType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()))?this.getFeatureAttribute():null);
            strategy.appendField(locator, this, "featureAttribute", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
