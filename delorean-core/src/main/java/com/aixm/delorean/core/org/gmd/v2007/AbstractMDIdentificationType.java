
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Basic information about data
 * 
 * <p>Java class for AbstractMD_Identification_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractMD_Identification_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="citation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/>
 *         <element name="abstract" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="purpose" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="credit" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="status" type="{http://www.isotc211.org/2005/gmd}MD_ProgressCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pointOfContact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceMaintenance" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="graphicOverview" type="{http://www.isotc211.org/2005/gmd}MD_BrowseGraphic_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="descriptiveKeywords" type="{http://www.isotc211.org/2005/gmd}MD_Keywords_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceSpecificUsage" type="{http://www.isotc211.org/2005/gmd}MD_Usage_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceConstraints" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="aggregationInfo" type="{http://www.isotc211.org/2005/gmd}MD_AggregateInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMD_Identification_Type", propOrder = {
    "citation",
    "abstractValue",
    "purpose",
    "credit",
    "status",
    "pointOfContact",
    "resourceMaintenance",
    "graphicOverview",
    "resourceFormat",
    "descriptiveKeywords",
    "resourceSpecificUsage",
    "resourceConstraints",
    "aggregationInfo"
})
@XmlSeeAlso({
    MDDataIdentificationType.class,
    MDServiceIdentificationType.class
})
public abstract class AbstractMDIdentificationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CICitationPropertyType citation;
    @XmlElement(name = "abstract", required = true)
    protected CharacterStringPropertyType abstractValue;
    protected CharacterStringPropertyType purpose;
    protected List<CharacterStringPropertyType> credit;
    protected List<MDProgressCodePropertyType> status;
    protected List<CIResponsiblePartyPropertyType> pointOfContact;
    protected List<MDMaintenanceInformationPropertyType> resourceMaintenance;
    protected List<MDBrowseGraphicPropertyType> graphicOverview;
    protected List<MDFormatPropertyType> resourceFormat;
    protected List<MDKeywordsPropertyType> descriptiveKeywords;
    protected List<MDUsagePropertyType> resourceSpecificUsage;
    protected List<MDConstraintsPropertyType> resourceConstraints;
    protected List<MDAggregateInformationPropertyType> aggregationInfo;

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getCitation() {
        return citation;
    }

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setCitation(CICitationPropertyType value) {
        this.citation = value;
    }

    /**
     * Gets the value of the abstractValue property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAbstractValue() {
        return abstractValue;
    }

    /**
     * Sets the value of the abstractValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAbstractValue(CharacterStringPropertyType value) {
        this.abstractValue = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPurpose(CharacterStringPropertyType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getCredit() {
        if (credit == null) {
            credit = new ArrayList<>();
        }
        return this.credit;
    }

    /**
     * 
     * 
     */
    public void setCredit(List<CharacterStringPropertyType> credit) {
        this.credit = credit;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDProgressCodePropertyType }
     * 
     * 
     */
    public List<MDProgressCodePropertyType> getStatus() {
        if (status == null) {
            status = new ArrayList<>();
        }
        return this.status;
    }

    /**
     * 
     * 
     */
    public void setStatus(List<MDProgressCodePropertyType> status) {
        this.status = status;
    }

    /**
     * Gets the value of the pointOfContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getPointOfContact() {
        if (pointOfContact == null) {
            pointOfContact = new ArrayList<>();
        }
        return this.pointOfContact;
    }

    /**
     * 
     * 
     */
    public void setPointOfContact(List<CIResponsiblePartyPropertyType> pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    /**
     * Gets the value of the resourceMaintenance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceMaintenance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceMaintenance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMaintenanceInformationPropertyType }
     * 
     * 
     */
    public List<MDMaintenanceInformationPropertyType> getResourceMaintenance() {
        if (resourceMaintenance == null) {
            resourceMaintenance = new ArrayList<>();
        }
        return this.resourceMaintenance;
    }

    /**
     * 
     * 
     */
    public void setResourceMaintenance(List<MDMaintenanceInformationPropertyType> resourceMaintenance) {
        this.resourceMaintenance = resourceMaintenance;
    }

    /**
     * Gets the value of the graphicOverview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicOverview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicOverview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDBrowseGraphicPropertyType }
     * 
     * 
     */
    public List<MDBrowseGraphicPropertyType> getGraphicOverview() {
        if (graphicOverview == null) {
            graphicOverview = new ArrayList<>();
        }
        return this.graphicOverview;
    }

    /**
     * 
     * 
     */
    public void setGraphicOverview(List<MDBrowseGraphicPropertyType> graphicOverview) {
        this.graphicOverview = graphicOverview;
    }

    /**
     * Gets the value of the resourceFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getResourceFormat() {
        if (resourceFormat == null) {
            resourceFormat = new ArrayList<>();
        }
        return this.resourceFormat;
    }

    /**
     * 
     * 
     */
    public void setResourceFormat(List<MDFormatPropertyType> resourceFormat) {
        this.resourceFormat = resourceFormat;
    }

    /**
     * Gets the value of the descriptiveKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDKeywordsPropertyType }
     * 
     * 
     */
    public List<MDKeywordsPropertyType> getDescriptiveKeywords() {
        if (descriptiveKeywords == null) {
            descriptiveKeywords = new ArrayList<>();
        }
        return this.descriptiveKeywords;
    }

    /**
     * 
     * 
     */
    public void setDescriptiveKeywords(List<MDKeywordsPropertyType> descriptiveKeywords) {
        this.descriptiveKeywords = descriptiveKeywords;
    }

    /**
     * Gets the value of the resourceSpecificUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecificUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecificUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDUsagePropertyType }
     * 
     * 
     */
    public List<MDUsagePropertyType> getResourceSpecificUsage() {
        if (resourceSpecificUsage == null) {
            resourceSpecificUsage = new ArrayList<>();
        }
        return this.resourceSpecificUsage;
    }

    /**
     * 
     * 
     */
    public void setResourceSpecificUsage(List<MDUsagePropertyType> resourceSpecificUsage) {
        this.resourceSpecificUsage = resourceSpecificUsage;
    }

    /**
     * Gets the value of the resourceConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getResourceConstraints() {
        if (resourceConstraints == null) {
            resourceConstraints = new ArrayList<>();
        }
        return this.resourceConstraints;
    }

    /**
     * 
     * 
     */
    public void setResourceConstraints(List<MDConstraintsPropertyType> resourceConstraints) {
        this.resourceConstraints = resourceConstraints;
    }

    /**
     * Gets the value of the aggregationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDAggregateInformationPropertyType }
     * 
     * 
     */
    public List<MDAggregateInformationPropertyType> getAggregationInfo() {
        if (aggregationInfo == null) {
            aggregationInfo = new ArrayList<>();
        }
        return this.aggregationInfo;
    }

    /**
     * 
     * 
     */
    public void setAggregationInfo(List<MDAggregateInformationPropertyType> aggregationInfo) {
        this.aggregationInfo = aggregationInfo;
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
        final AbstractMDIdentificationType that = ((AbstractMDIdentificationType) object);
        {
            boolean lhsFieldIsSet = ((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()));
            boolean rhsFieldIsSet = ((that.resourceSpecificUsage!= null)&&(!that.resourceSpecificUsage.isEmpty()));
            List<MDUsagePropertyType> lhsField;
            lhsField = (((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()))?this.getResourceSpecificUsage():null);
            List<MDUsagePropertyType> rhsField;
            rhsField = (((that.resourceSpecificUsage!= null)&&(!that.resourceSpecificUsage.isEmpty()))?that.getResourceSpecificUsage():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resourceSpecificUsage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resourceSpecificUsage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.purpose!= null);
            boolean rhsFieldIsSet = (that.purpose!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getPurpose();
            CharacterStringPropertyType rhsField;
            rhsField = that.getPurpose();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "purpose", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "purpose", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()));
            boolean rhsFieldIsSet = ((that.pointOfContact!= null)&&(!that.pointOfContact.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()))?this.getPointOfContact():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.pointOfContact!= null)&&(!that.pointOfContact.isEmpty()))?that.getPointOfContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointOfContact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointOfContact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()));
            boolean rhsFieldIsSet = ((that.graphicOverview!= null)&&(!that.graphicOverview.isEmpty()));
            List<MDBrowseGraphicPropertyType> lhsField;
            lhsField = (((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()))?this.getGraphicOverview():null);
            List<MDBrowseGraphicPropertyType> rhsField;
            rhsField = (((that.graphicOverview!= null)&&(!that.graphicOverview.isEmpty()))?that.getGraphicOverview():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "graphicOverview", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "graphicOverview", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()));
            boolean rhsFieldIsSet = ((that.resourceConstraints!= null)&&(!that.resourceConstraints.isEmpty()));
            List<MDConstraintsPropertyType> lhsField;
            lhsField = (((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()))?this.getResourceConstraints():null);
            List<MDConstraintsPropertyType> rhsField;
            rhsField = (((that.resourceConstraints!= null)&&(!that.resourceConstraints.isEmpty()))?that.getResourceConstraints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resourceConstraints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resourceConstraints", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.citation!= null);
            boolean rhsFieldIsSet = (that.citation!= null);
            CICitationPropertyType lhsField;
            lhsField = this.getCitation();
            CICitationPropertyType rhsField;
            rhsField = that.getCitation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "citation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "citation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()));
            boolean rhsFieldIsSet = ((that.descriptiveKeywords!= null)&&(!that.descriptiveKeywords.isEmpty()));
            List<MDKeywordsPropertyType> lhsField;
            lhsField = (((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()))?this.getDescriptiveKeywords():null);
            List<MDKeywordsPropertyType> rhsField;
            rhsField = (((that.descriptiveKeywords!= null)&&(!that.descriptiveKeywords.isEmpty()))?that.getDescriptiveKeywords():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "descriptiveKeywords", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "descriptiveKeywords", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.credit!= null)&&(!this.credit.isEmpty()));
            boolean rhsFieldIsSet = ((that.credit!= null)&&(!that.credit.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.credit!= null)&&(!this.credit.isEmpty()))?this.getCredit():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.credit!= null)&&(!that.credit.isEmpty()))?that.getCredit():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "credit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "credit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.aggregationInfo!= null)&&(!that.aggregationInfo.isEmpty()));
            List<MDAggregateInformationPropertyType> lhsField;
            lhsField = (((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()))?this.getAggregationInfo():null);
            List<MDAggregateInformationPropertyType> rhsField;
            rhsField = (((that.aggregationInfo!= null)&&(!that.aggregationInfo.isEmpty()))?that.getAggregationInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aggregationInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aggregationInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()));
            boolean rhsFieldIsSet = ((that.resourceFormat!= null)&&(!that.resourceFormat.isEmpty()));
            List<MDFormatPropertyType> lhsField;
            lhsField = (((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()))?this.getResourceFormat():null);
            List<MDFormatPropertyType> rhsField;
            rhsField = (((that.resourceFormat!= null)&&(!that.resourceFormat.isEmpty()))?that.getResourceFormat():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resourceFormat", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resourceFormat", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()));
            boolean rhsFieldIsSet = ((that.resourceMaintenance!= null)&&(!that.resourceMaintenance.isEmpty()));
            List<MDMaintenanceInformationPropertyType> lhsField;
            lhsField = (((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()))?this.getResourceMaintenance():null);
            List<MDMaintenanceInformationPropertyType> rhsField;
            rhsField = (((that.resourceMaintenance!= null)&&(!that.resourceMaintenance.isEmpty()))?that.getResourceMaintenance():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resourceMaintenance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resourceMaintenance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.abstractValue!= null);
            boolean rhsFieldIsSet = (that.abstractValue!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getAbstractValue();
            CharacterStringPropertyType rhsField;
            rhsField = that.getAbstractValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.status!= null)&&(!this.status.isEmpty()));
            boolean rhsFieldIsSet = ((that.status!= null)&&(!that.status.isEmpty()));
            List<MDProgressCodePropertyType> lhsField;
            lhsField = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            List<MDProgressCodePropertyType> rhsField;
            rhsField = (((that.status!= null)&&(!that.status.isEmpty()))?that.getStatus():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
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
            boolean theFieldIsSet = (this.citation!= null);
            CICitationPropertyType theField;
            theField = this.getCitation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "citation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.abstractValue!= null);
            CharacterStringPropertyType theField;
            theField = this.getAbstractValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.purpose!= null);
            CharacterStringPropertyType theField;
            theField = this.getPurpose();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "purpose", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.credit!= null)&&(!this.credit.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.credit!= null)&&(!this.credit.isEmpty()))?this.getCredit():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "credit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.status!= null)&&(!this.status.isEmpty()));
            List<MDProgressCodePropertyType> theField;
            theField = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()))?this.getPointOfContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointOfContact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()));
            List<MDMaintenanceInformationPropertyType> theField;
            theField = (((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()))?this.getResourceMaintenance():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resourceMaintenance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()));
            List<MDBrowseGraphicPropertyType> theField;
            theField = (((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()))?this.getGraphicOverview():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "graphicOverview", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()));
            List<MDFormatPropertyType> theField;
            theField = (((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()))?this.getResourceFormat():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resourceFormat", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()));
            List<MDKeywordsPropertyType> theField;
            theField = (((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()))?this.getDescriptiveKeywords():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "descriptiveKeywords", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()));
            List<MDUsagePropertyType> theField;
            theField = (((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()))?this.getResourceSpecificUsage():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resourceSpecificUsage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()));
            List<MDConstraintsPropertyType> theField;
            theField = (((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()))?this.getResourceConstraints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resourceConstraints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()));
            List<MDAggregateInformationPropertyType> theField;
            theField = (((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()))?this.getAggregationInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aggregationInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.citation!= null);
            CICitationPropertyType theField;
            theField = this.getCitation();
            strategy.appendField(locator, this, "citation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.abstractValue!= null);
            CharacterStringPropertyType theField;
            theField = this.getAbstractValue();
            strategy.appendField(locator, this, "abstractValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.purpose!= null);
            CharacterStringPropertyType theField;
            theField = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.credit!= null)&&(!this.credit.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.credit!= null)&&(!this.credit.isEmpty()))?this.getCredit():null);
            strategy.appendField(locator, this, "credit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.status!= null)&&(!this.status.isEmpty()));
            List<MDProgressCodePropertyType> theField;
            theField = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.pointOfContact!= null)&&(!this.pointOfContact.isEmpty()))?this.getPointOfContact():null);
            strategy.appendField(locator, this, "pointOfContact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()));
            List<MDMaintenanceInformationPropertyType> theField;
            theField = (((this.resourceMaintenance!= null)&&(!this.resourceMaintenance.isEmpty()))?this.getResourceMaintenance():null);
            strategy.appendField(locator, this, "resourceMaintenance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()));
            List<MDBrowseGraphicPropertyType> theField;
            theField = (((this.graphicOverview!= null)&&(!this.graphicOverview.isEmpty()))?this.getGraphicOverview():null);
            strategy.appendField(locator, this, "graphicOverview", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()));
            List<MDFormatPropertyType> theField;
            theField = (((this.resourceFormat!= null)&&(!this.resourceFormat.isEmpty()))?this.getResourceFormat():null);
            strategy.appendField(locator, this, "resourceFormat", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()));
            List<MDKeywordsPropertyType> theField;
            theField = (((this.descriptiveKeywords!= null)&&(!this.descriptiveKeywords.isEmpty()))?this.getDescriptiveKeywords():null);
            strategy.appendField(locator, this, "descriptiveKeywords", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()));
            List<MDUsagePropertyType> theField;
            theField = (((this.resourceSpecificUsage!= null)&&(!this.resourceSpecificUsage.isEmpty()))?this.getResourceSpecificUsage():null);
            strategy.appendField(locator, this, "resourceSpecificUsage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()));
            List<MDConstraintsPropertyType> theField;
            theField = (((this.resourceConstraints!= null)&&(!this.resourceConstraints.isEmpty()))?this.getResourceConstraints():null);
            strategy.appendField(locator, this, "resourceConstraints", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()));
            List<MDAggregateInformationPropertyType> theField;
            theField = (((this.aggregationInfo!= null)&&(!this.aggregationInfo.isEmpty()))?this.getAggregationInfo():null);
            strategy.appendField(locator, this, "aggregationInfo", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
