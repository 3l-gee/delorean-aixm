
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for FASDataBlockType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FASDataBlockType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FASDataBlockPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFASDataBlockExtension"/>
 *                 </choice>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FASDataBlockType", propOrder = {
    "horizontalAlarmLimit",
    "verticalAlarmLimit",
    "thresholdCourseWidth",
    "lengthOffset",
    "crcRemainder",
    "operationType",
    "serviceProviderSBAS",
    "approachPerformanceDesignator",
    "routeIndicator",
    "referencePathDataSelector",
    "referencePathIdentifier",
    "codeICAO",
    "annotation",
    "extension"
})
@Entity(name = "FASDataBlockType")
@Table(name = "fasdatablock", schema = "procedure")
public class FASDataBlockType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "horizontalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> horizontalAlarmLimit;
    @XmlElementRef(name = "verticalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> verticalAlarmLimit;
    @XmlElementRef(name = "thresholdCourseWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> thresholdCourseWidth;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthOffset;
    @XmlElementRef(name = "CRCRemainder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValHexType> crcRemainder;
    @XmlElementRef(name = "operationType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> operationType;
    @XmlElementRef(name = "serviceProviderSBAS", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> serviceProviderSBAS;
    @XmlElementRef(name = "approachPerformanceDesignator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> approachPerformanceDesignator;
    @XmlElementRef(name = "routeIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteIndicatorType> routeIndicator;
    @XmlElementRef(name = "referencePathDataSelector", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> referencePathDataSelector;
    @XmlElementRef(name = "referencePathIdentifier", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferencePathIdentifierType> referencePathIdentifier;
    @XmlElementRef(name = "codeICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOCountryType> codeICAO;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FASDataBlockTypeExtensionType> extension;

    /**
     * Gets the value of the horizontalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAlarmLimitType> getHorizontalAlarmLimit() {
        return horizontalAlarmLimit;
    }

    /**
     * Sets the value of the horizontalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setHorizontalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.horizontalAlarmLimit = value;
    }

    @Transient
    public boolean isSetHorizontalAlarmLimit() {
        return (this.horizontalAlarmLimit!= null);
    }

    /**
     * Gets the value of the verticalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAlarmLimitType> getVerticalAlarmLimit() {
        return verticalAlarmLimit;
    }

    /**
     * Sets the value of the verticalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setVerticalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.verticalAlarmLimit = value;
    }

    @Transient
    public boolean isSetVerticalAlarmLimit() {
        return (this.verticalAlarmLimit!= null);
    }

    /**
     * Gets the value of the thresholdCourseWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getThresholdCourseWidth() {
        return thresholdCourseWidth;
    }

    /**
     * Sets the value of the thresholdCourseWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setThresholdCourseWidth(JAXBElement<ValDistanceType> value) {
        this.thresholdCourseWidth = value;
    }

    @Transient
    public boolean isSetThresholdCourseWidth() {
        return (this.thresholdCourseWidth!= null);
    }

    /**
     * Gets the value of the lengthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Sets the value of the lengthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceType> value) {
        this.lengthOffset = value;
    }

    @Transient
    public boolean isSetLengthOffset() {
        return (this.lengthOffset!= null);
    }

    /**
     * Gets the value of the crcRemainder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValHexType> getCRCRemainder() {
        return crcRemainder;
    }

    /**
     * Sets the value of the crcRemainder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public void setCRCRemainder(JAXBElement<ValHexType> value) {
        this.crcRemainder = value;
    }

    @Transient
    public boolean isSetCRCRemainder() {
        return (this.crcRemainder!= null);
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOperationType(JAXBElement<NoSequenceType> value) {
        this.operationType = value;
    }

    @Transient
    public boolean isSetOperationType() {
        return (this.operationType!= null);
    }

    /**
     * Gets the value of the serviceProviderSBAS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getServiceProviderSBAS() {
        return serviceProviderSBAS;
    }

    /**
     * Sets the value of the serviceProviderSBAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setServiceProviderSBAS(JAXBElement<NoSequenceType> value) {
        this.serviceProviderSBAS = value;
    }

    @Transient
    public boolean isSetServiceProviderSBAS() {
        return (this.serviceProviderSBAS!= null);
    }

    /**
     * Gets the value of the approachPerformanceDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getApproachPerformanceDesignator() {
        return approachPerformanceDesignator;
    }

    /**
     * Sets the value of the approachPerformanceDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setApproachPerformanceDesignator(JAXBElement<NoSequenceType> value) {
        this.approachPerformanceDesignator = value;
    }

    @Transient
    public boolean isSetApproachPerformanceDesignator() {
        return (this.approachPerformanceDesignator!= null);
    }

    /**
     * Gets the value of the routeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteIndicatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteIndicatorType> getRouteIndicator() {
        return routeIndicator;
    }

    /**
     * Sets the value of the routeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteIndicatorType }{@code >}
     *     
     */
    public void setRouteIndicator(JAXBElement<CodeRouteIndicatorType> value) {
        this.routeIndicator = value;
    }

    @Transient
    public boolean isSetRouteIndicator() {
        return (this.routeIndicator!= null);
    }

    /**
     * Gets the value of the referencePathDataSelector property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getReferencePathDataSelector() {
        return referencePathDataSelector;
    }

    /**
     * Sets the value of the referencePathDataSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setReferencePathDataSelector(JAXBElement<NoSequenceType> value) {
        this.referencePathDataSelector = value;
    }

    @Transient
    public boolean isSetReferencePathDataSelector() {
        return (this.referencePathDataSelector!= null);
    }

    /**
     * Gets the value of the referencePathIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeReferencePathIdentifierType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeReferencePathIdentifierType> getReferencePathIdentifier() {
        return referencePathIdentifier;
    }

    /**
     * Sets the value of the referencePathIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeReferencePathIdentifierType }{@code >}
     *     
     */
    public void setReferencePathIdentifier(JAXBElement<CodeReferencePathIdentifierType> value) {
        this.referencePathIdentifier = value;
    }

    @Transient
    public boolean isSetReferencePathIdentifier() {
        return (this.referencePathIdentifier!= null);
    }

    /**
     * Gets the value of the codeICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOCountryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeICAOCountryType> getCodeICAO() {
        return codeICAO;
    }

    /**
     * Sets the value of the codeICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOCountryType }{@code >}
     *     
     */
    public void setCodeICAO(JAXBElement<CodeICAOCountryType> value) {
        this.codeICAO = value;
    }

    @Transient
    public boolean isSetCodeICAO() {
        return (this.codeICAO!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     * 
     * 
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FASDataBlockTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FASDataBlockTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FASDATA_BLOCK_TYPE_0")
    public List<FASDataBlockTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FASDataBlockTypeExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "horizontalalarmlimit")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "horizontalalarmlimit_nilreason"))
    })
    public ValAlarmLimitType getHorizontalAlarmLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValAlarmLimitType.class, this.getHorizontalAlarmLimit());
    }

    public void setHorizontalAlarmLimitItem(ValAlarmLimitType target) {
        setHorizontalAlarmLimit(XmlAdapterUtils.marshallJAXBElement(ValAlarmLimitType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalAlarmLimit"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalalarmlimit")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalalarmlimit_nilreason"))
    })
    public ValAlarmLimitType getVerticalAlarmLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValAlarmLimitType.class, this.getVerticalAlarmLimit());
    }

    public void setVerticalAlarmLimitItem(ValAlarmLimitType target) {
        setVerticalAlarmLimit(XmlAdapterUtils.marshallJAXBElement(ValAlarmLimitType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalAlarmLimit"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdcoursewidth")),
        @AttributeOverride(name = "uom", column = @Column(name = "thresholdcoursewidth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdcoursewidth_nilreason"))
    })
    public ValDistanceType getThresholdCourseWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getThresholdCourseWidth());
    }

    public void setThresholdCourseWidthItem(ValDistanceType target) {
        setThresholdCourseWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "thresholdCourseWidth"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lengthoffset")),
        @AttributeOverride(name = "uom", column = @Column(name = "lengthoffset_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lengthoffset_nilreason"))
    })
    public ValDistanceType getLengthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLengthOffset());
    }

    public void setLengthOffsetItem(ValDistanceType target) {
        setLengthOffset(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lengthOffset"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "crcremainder")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "crcremainder_nilreason"))
    })
    public ValHexType getCRCRemainderItem() {
        return XmlAdapterUtils.unmarshallSource(ValHexType.class, this.getCRCRemainder());
    }

    public void setCRCRemainderItem(ValHexType target) {
        setCRCRemainder(XmlAdapterUtils.marshallJAXBElement(ValHexType.class, new QName("http://www.aixm.aero/schema/5.1.1", "CRCRemainder"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "operationtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "operationtype_nilreason"))
    })
    public NoSequenceType getOperationTypeItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getOperationType());
    }

    public void setOperationTypeItem(NoSequenceType target) {
        setOperationType(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "operationType"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "serviceprovidersbas")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "serviceprovidersbas_nilreason"))
    })
    public NoSequenceType getServiceProviderSBASItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getServiceProviderSBAS());
    }

    public void setServiceProviderSBASItem(NoSequenceType target) {
        setServiceProviderSBAS(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "serviceProviderSBAS"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachperformancedesignator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachperformancedesignator_nilreason"))
    })
    public NoSequenceType getApproachPerformanceDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getApproachPerformanceDesignator());
    }

    public void setApproachPerformanceDesignatorItem(NoSequenceType target) {
        setApproachPerformanceDesignator(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachPerformanceDesignator"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "routeindicator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "routeindicator_nilreason"))
    })
    public CodeRouteIndicatorType getRouteIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteIndicatorType.class, this.getRouteIndicator());
    }

    public void setRouteIndicatorItem(CodeRouteIndicatorType target) {
        setRouteIndicator(XmlAdapterUtils.marshallJAXBElement(CodeRouteIndicatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "routeIndicator"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencepathdataselector")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencepathdataselector_nilreason"))
    })
    public NoSequenceType getReferencePathDataSelectorItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getReferencePathDataSelector());
    }

    public void setReferencePathDataSelectorItem(NoSequenceType target) {
        setReferencePathDataSelector(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "referencePathDataSelector"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencepathidentifier")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencepathidentifier_nilreason"))
    })
    public CodeReferencePathIdentifierType getReferencePathIdentifierItem() {
        return XmlAdapterUtils.unmarshallSource(CodeReferencePathIdentifierType.class, this.getReferencePathIdentifier());
    }

    public void setReferencePathIdentifierItem(CodeReferencePathIdentifierType target) {
        setReferencePathIdentifier(XmlAdapterUtils.marshallJAXBElement(CodeReferencePathIdentifierType.class, new QName("http://www.aixm.aero/schema/5.1.1", "referencePathIdentifier"), FASDataBlockType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "codeicao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "codeicao_nilreason"))
    })
    public CodeICAOCountryType getCodeICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeICAOCountryType.class, this.getCodeICAO());
    }

    public void setCodeICAOItem(CodeICAOCountryType target) {
        setCodeICAO(XmlAdapterUtils.marshallJAXBElement(CodeICAOCountryType.class, new QName("http://www.aixm.aero/schema/5.1.1", "codeICAO"), FASDataBlockType.class, target));
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
        final FASDataBlockType that = ((FASDataBlockType) object);
        {
            boolean lhsFieldIsSet = this.isSetHorizontalAlarmLimit();
            boolean rhsFieldIsSet = that.isSetHorizontalAlarmLimit();
            JAXBElement<ValAlarmLimitType> lhsField;
            lhsField = this.getHorizontalAlarmLimit();
            JAXBElement<ValAlarmLimitType> rhsField;
            rhsField = that.getHorizontalAlarmLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalAlarmLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalAlarmLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeICAO();
            boolean rhsFieldIsSet = that.isSetCodeICAO();
            JAXBElement<CodeICAOCountryType> lhsField;
            lhsField = this.getCodeICAO();
            JAXBElement<CodeICAOCountryType> rhsField;
            rhsField = that.getCodeICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferencePathDataSelector();
            boolean rhsFieldIsSet = that.isSetReferencePathDataSelector();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getReferencePathDataSelector();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getReferencePathDataSelector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referencePathDataSelector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referencePathDataSelector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCRCRemainder();
            boolean rhsFieldIsSet = that.isSetCRCRemainder();
            JAXBElement<ValHexType> lhsField;
            lhsField = this.getCRCRemainder();
            JAXBElement<ValHexType> rhsField;
            rhsField = that.getCRCRemainder();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "crcRemainder", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "crcRemainder", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachPerformanceDesignator();
            boolean rhsFieldIsSet = that.isSetApproachPerformanceDesignator();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getApproachPerformanceDesignator();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getApproachPerformanceDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachPerformanceDesignator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachPerformanceDesignator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRouteIndicator();
            boolean rhsFieldIsSet = that.isSetRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> lhsField;
            lhsField = this.getRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> rhsField;
            rhsField = that.getRouteIndicator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "routeIndicator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "routeIndicator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferencePathIdentifier();
            boolean rhsFieldIsSet = that.isSetReferencePathIdentifier();
            JAXBElement<CodeReferencePathIdentifierType> lhsField;
            lhsField = this.getReferencePathIdentifier();
            JAXBElement<CodeReferencePathIdentifierType> rhsField;
            rhsField = that.getReferencePathIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referencePathIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referencePathIdentifier", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FASDataBlockTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FASDataBlockTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdCourseWidth();
            boolean rhsFieldIsSet = that.isSetThresholdCourseWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getThresholdCourseWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getThresholdCourseWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdCourseWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdCourseWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServiceProviderSBAS();
            boolean rhsFieldIsSet = that.isSetServiceProviderSBAS();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getServiceProviderSBAS();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getServiceProviderSBAS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceProviderSBAS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceProviderSBAS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperationType();
            boolean rhsFieldIsSet = that.isSetOperationType();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getOperationType();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getOperationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation()?this.getAnnotation():null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation()?that.getAnnotation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalAlarmLimit();
            boolean rhsFieldIsSet = that.isSetVerticalAlarmLimit();
            JAXBElement<ValAlarmLimitType> lhsField;
            lhsField = this.getVerticalAlarmLimit();
            JAXBElement<ValAlarmLimitType> rhsField;
            rhsField = that.getVerticalAlarmLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalAlarmLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalAlarmLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLengthOffset();
            boolean rhsFieldIsSet = that.isSetLengthOffset();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLengthOffset();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLengthOffset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lengthOffset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lengthOffset", rhsField);
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
            boolean theFieldIsSet = this.isSetHorizontalAlarmLimit();
            JAXBElement<ValAlarmLimitType> theField;
            theField = this.getHorizontalAlarmLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalAlarmLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAlarmLimit();
            JAXBElement<ValAlarmLimitType> theField;
            theField = this.getVerticalAlarmLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalAlarmLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCourseWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getThresholdCourseWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdCourseWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthOffset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lengthOffset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCRCRemainder();
            JAXBElement<ValHexType> theField;
            theField = this.getCRCRemainder();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "crcRemainder", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationType();
            JAXBElement<NoSequenceType> theField;
            theField = this.getOperationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProviderSBAS();
            JAXBElement<NoSequenceType> theField;
            theField = this.getServiceProviderSBAS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceProviderSBAS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachPerformanceDesignator();
            JAXBElement<NoSequenceType> theField;
            theField = this.getApproachPerformanceDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachPerformanceDesignator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> theField;
            theField = this.getRouteIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routeIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePathDataSelector();
            JAXBElement<NoSequenceType> theField;
            theField = this.getReferencePathDataSelector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referencePathDataSelector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePathIdentifier();
            JAXBElement<CodeReferencePathIdentifierType> theField;
            theField = this.getReferencePathIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referencePathIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeICAO();
            JAXBElement<CodeICAOCountryType> theField;
            theField = this.getCodeICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FASDataBlockTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHorizontalAlarmLimit();
            JAXBElement<ValAlarmLimitType> theField;
            theField = this.getHorizontalAlarmLimit();
            strategy.appendField(locator, this, "horizontalAlarmLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAlarmLimit();
            JAXBElement<ValAlarmLimitType> theField;
            theField = this.getVerticalAlarmLimit();
            strategy.appendField(locator, this, "verticalAlarmLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCourseWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getThresholdCourseWidth();
            strategy.appendField(locator, this, "thresholdCourseWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthOffset();
            strategy.appendField(locator, this, "lengthOffset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCRCRemainder();
            JAXBElement<ValHexType> theField;
            theField = this.getCRCRemainder();
            strategy.appendField(locator, this, "crcRemainder", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationType();
            JAXBElement<NoSequenceType> theField;
            theField = this.getOperationType();
            strategy.appendField(locator, this, "operationType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProviderSBAS();
            JAXBElement<NoSequenceType> theField;
            theField = this.getServiceProviderSBAS();
            strategy.appendField(locator, this, "serviceProviderSBAS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachPerformanceDesignator();
            JAXBElement<NoSequenceType> theField;
            theField = this.getApproachPerformanceDesignator();
            strategy.appendField(locator, this, "approachPerformanceDesignator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> theField;
            theField = this.getRouteIndicator();
            strategy.appendField(locator, this, "routeIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePathDataSelector();
            JAXBElement<NoSequenceType> theField;
            theField = this.getReferencePathDataSelector();
            strategy.appendField(locator, this, "referencePathDataSelector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePathIdentifier();
            JAXBElement<CodeReferencePathIdentifierType> theField;
            theField = this.getReferencePathIdentifier();
            strategy.appendField(locator, this, "referencePathIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeICAO();
            JAXBElement<CodeICAOCountryType> theField;
            theField = this.getCodeICAO();
            strategy.appendField(locator, this, "codeICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FASDataBlockTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
