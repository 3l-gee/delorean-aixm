
package com.delorean.aixm.aixm52.schema;

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
import jakarta.persistence.JoinTable;
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
 * <p>Java class for FinalApproachSegmentDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalApproachSegmentDataType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="approachPerformanceDesignator" type="{http://www.aixm.aero/schema/5.2}NoNumberType" minOccurs="0"/>
 *         <element name="codeICAO" type="{http://www.aixm.aero/schema/5.2}CodeICAOCountryType" minOccurs="0"/>
 *         <element name="CRCRemainder" type="{http://www.aixm.aero/schema/5.2}ValHexType" minOccurs="0"/>
 *         <element name="horizontalAlarmLimit" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="lengthOffset" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="operationType" type="{http://www.aixm.aero/schema/5.2}NoNumberType" minOccurs="0"/>
 *         <element name="referencePathDataSelector" type="{http://www.aixm.aero/schema/5.2}NoSequenceType" minOccurs="0"/>
 *         <element name="referencePathIdentifier" type="{http://www.aixm.aero/schema/5.2}CodeReferencePathIdentifierType" minOccurs="0"/>
 *         <element name="routeIndicator" type="{http://www.aixm.aero/schema/5.2}CodeRouteIndicatorType" minOccurs="0"/>
 *         <element name="serviceProviderSBAS" type="{http://www.aixm.aero/schema/5.2}NoNumberType" minOccurs="0"/>
 *         <element name="thresholdCourseWidth" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="verticalAlarmLimit" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="airportID" type="{http://www.aixm.aero/schema/5.2}CodeAirportHeliportDesignatorType" minOccurs="0"/>
 *         <element name="runwayNumber" type="{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="runwayLetter" type="{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="thresholdPointLatitude" type="{http://www.aixm.aero/schema/5.2}TextLatitudeDMSType" minOccurs="0"/>
 *         <element name="thresholdPointLongitude" type="{http://www.aixm.aero/schema/5.2}TextLongitudeDMSType" minOccurs="0"/>
 *         <element name="thresholdPointHeight" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="finalPointLatitude" type="{http://www.aixm.aero/schema/5.2}TextLatitudeDMSType" minOccurs="0"/>
 *         <element name="finalPointLongitude" type="{http://www.aixm.aero/schema/5.2}TextLongitudeDMSType" minOccurs="0"/>
 *         <element name="deltaFinalPointLatitude" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="deltaFinalPointLongitude" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="thresholdCrossingHeight" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="thresholdCrossingHeightUnits" type="{http://www.aixm.aero/schema/5.2}NoNumberType" minOccurs="0"/>
 *         <element name="glidepathAngle" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="thresholdOrthoHeight" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="finalPointOrthoHeight" type="{http://www.aixm.aero/schema/5.2}TextDecimalType" minOccurs="0"/>
 *         <element name="FASDataBlock" type="{http://www.aixm.aero/schema/5.2}ValHexType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractFinalApproachSegmentDataExtension"/>
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
@XmlType(name = "FinalApproachSegmentDataType", propOrder = {
    "approachPerformanceDesignator",
    "codeICAO",
    "crcRemainder",
    "horizontalAlarmLimit",
    "lengthOffset",
    "operationType",
    "referencePathDataSelector",
    "referencePathIdentifier",
    "routeIndicator",
    "serviceProviderSBAS",
    "thresholdCourseWidth",
    "verticalAlarmLimit",
    "airportID",
    "runwayNumber",
    "runwayLetter",
    "thresholdPointLatitude",
    "thresholdPointLongitude",
    "thresholdPointHeight",
    "finalPointLatitude",
    "finalPointLongitude",
    "deltaFinalPointLatitude",
    "deltaFinalPointLongitude",
    "thresholdCrossingHeight",
    "thresholdCrossingHeightUnits",
    "glidepathAngle",
    "thresholdOrthoHeight",
    "finalPointOrthoHeight",
    "fasDataBlock",
    "annotation",
    "extension"
})
@Entity(name = "FinalApproachSegmentDataType")
@Table(name = "finalapproachsegmentdata_o", schema = "procedure")
public class FinalApproachSegmentDataType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "approachPerformanceDesignator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> approachPerformanceDesignator;
    @XmlElementRef(name = "codeICAO", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOCountryType> codeICAO;
    @XmlElementRef(name = "CRCRemainder", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValHexType> crcRemainder;
    @XmlElementRef(name = "horizontalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> horizontalAlarmLimit;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> lengthOffset;
    @XmlElementRef(name = "operationType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> operationType;
    @XmlElementRef(name = "referencePathDataSelector", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> referencePathDataSelector;
    @XmlElementRef(name = "referencePathIdentifier", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferencePathIdentifierType> referencePathIdentifier;
    @XmlElementRef(name = "routeIndicator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteIndicatorType> routeIndicator;
    @XmlElementRef(name = "serviceProviderSBAS", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> serviceProviderSBAS;
    @XmlElementRef(name = "thresholdCourseWidth", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> thresholdCourseWidth;
    @XmlElementRef(name = "verticalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> verticalAlarmLimit;
    @XmlElementRef(name = "airportID", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportHeliportDesignatorType> airportID;
    @XmlElementRef(name = "runwayNumber", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> runwayNumber;
    @XmlElementRef(name = "runwayLetter", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> runwayLetter;
    @XmlElementRef(name = "thresholdPointLatitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextLatitudeDMSType> thresholdPointLatitude;
    @XmlElementRef(name = "thresholdPointLongitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextLongitudeDMSType> thresholdPointLongitude;
    @XmlElementRef(name = "thresholdPointHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> thresholdPointHeight;
    @XmlElementRef(name = "finalPointLatitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextLatitudeDMSType> finalPointLatitude;
    @XmlElementRef(name = "finalPointLongitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextLongitudeDMSType> finalPointLongitude;
    @XmlElementRef(name = "deltaFinalPointLatitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> deltaFinalPointLatitude;
    @XmlElementRef(name = "deltaFinalPointLongitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> deltaFinalPointLongitude;
    @XmlElementRef(name = "thresholdCrossingHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> thresholdCrossingHeight;
    @XmlElementRef(name = "thresholdCrossingHeightUnits", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> thresholdCrossingHeightUnits;
    @XmlElementRef(name = "glidepathAngle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> glidepathAngle;
    @XmlElementRef(name = "thresholdOrthoHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> thresholdOrthoHeight;
    @XmlElementRef(name = "finalPointOrthoHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDecimalType> finalPointOrthoHeight;
    @XmlElementRef(name = "FASDataBlock", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValHexType> fasDataBlock;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FinalApproachSegmentDataExtensionType> extension;

    /**
     * Gets the value of the approachPerformanceDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getApproachPerformanceDesignator() {
        return approachPerformanceDesignator;
    }

    /**
     * Sets the value of the approachPerformanceDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setApproachPerformanceDesignator(JAXBElement<NoNumberType> value) {
        this.approachPerformanceDesignator = value;
    }

    @Transient
    public boolean isSetApproachPerformanceDesignator() {
        return (this.approachPerformanceDesignator!= null);
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
     * Gets the value of the horizontalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getHorizontalAlarmLimit() {
        return horizontalAlarmLimit;
    }

    /**
     * Sets the value of the horizontalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setHorizontalAlarmLimit(JAXBElement<TextDecimalType> value) {
        this.horizontalAlarmLimit = value;
    }

    @Transient
    public boolean isSetHorizontalAlarmLimit() {
        return (this.horizontalAlarmLimit!= null);
    }

    /**
     * Gets the value of the lengthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Sets the value of the lengthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<TextDecimalType> value) {
        this.lengthOffset = value;
    }

    @Transient
    public boolean isSetLengthOffset() {
        return (this.lengthOffset!= null);
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setOperationType(JAXBElement<NoNumberType> value) {
        this.operationType = value;
    }

    @Transient
    public boolean isSetOperationType() {
        return (this.operationType!= null);
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
     * Gets the value of the serviceProviderSBAS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getServiceProviderSBAS() {
        return serviceProviderSBAS;
    }

    /**
     * Sets the value of the serviceProviderSBAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setServiceProviderSBAS(JAXBElement<NoNumberType> value) {
        this.serviceProviderSBAS = value;
    }

    @Transient
    public boolean isSetServiceProviderSBAS() {
        return (this.serviceProviderSBAS!= null);
    }

    /**
     * Gets the value of the thresholdCourseWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getThresholdCourseWidth() {
        return thresholdCourseWidth;
    }

    /**
     * Sets the value of the thresholdCourseWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setThresholdCourseWidth(JAXBElement<TextDecimalType> value) {
        this.thresholdCourseWidth = value;
    }

    @Transient
    public boolean isSetThresholdCourseWidth() {
        return (this.thresholdCourseWidth!= null);
    }

    /**
     * Gets the value of the verticalAlarmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getVerticalAlarmLimit() {
        return verticalAlarmLimit;
    }

    /**
     * Sets the value of the verticalAlarmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setVerticalAlarmLimit(JAXBElement<TextDecimalType> value) {
        this.verticalAlarmLimit = value;
    }

    @Transient
    public boolean isSetVerticalAlarmLimit() {
        return (this.verticalAlarmLimit!= null);
    }

    /**
     * Gets the value of the airportID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirportHeliportDesignatorType> getAirportID() {
        return airportID;
    }

    /**
     * Sets the value of the airportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    public void setAirportID(JAXBElement<CodeAirportHeliportDesignatorType> value) {
        this.airportID = value;
    }

    @Transient
    public boolean isSetAirportID() {
        return (this.airportID!= null);
    }

    /**
     * Gets the value of the runwayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getRunwayNumber() {
        return runwayNumber;
    }

    /**
     * Sets the value of the runwayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setRunwayNumber(JAXBElement<TextDesignatorType> value) {
        this.runwayNumber = value;
    }

    @Transient
    public boolean isSetRunwayNumber() {
        return (this.runwayNumber!= null);
    }

    /**
     * Gets the value of the runwayLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getRunwayLetter() {
        return runwayLetter;
    }

    /**
     * Sets the value of the runwayLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setRunwayLetter(JAXBElement<TextDesignatorType> value) {
        this.runwayLetter = value;
    }

    @Transient
    public boolean isSetRunwayLetter() {
        return (this.runwayLetter!= null);
    }

    /**
     * Gets the value of the thresholdPointLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextLatitudeDMSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextLatitudeDMSType> getThresholdPointLatitude() {
        return thresholdPointLatitude;
    }

    /**
     * Sets the value of the thresholdPointLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextLatitudeDMSType }{@code >}
     *     
     */
    public void setThresholdPointLatitude(JAXBElement<TextLatitudeDMSType> value) {
        this.thresholdPointLatitude = value;
    }

    @Transient
    public boolean isSetThresholdPointLatitude() {
        return (this.thresholdPointLatitude!= null);
    }

    /**
     * Gets the value of the thresholdPointLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextLongitudeDMSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextLongitudeDMSType> getThresholdPointLongitude() {
        return thresholdPointLongitude;
    }

    /**
     * Sets the value of the thresholdPointLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextLongitudeDMSType }{@code >}
     *     
     */
    public void setThresholdPointLongitude(JAXBElement<TextLongitudeDMSType> value) {
        this.thresholdPointLongitude = value;
    }

    @Transient
    public boolean isSetThresholdPointLongitude() {
        return (this.thresholdPointLongitude!= null);
    }

    /**
     * Gets the value of the thresholdPointHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getThresholdPointHeight() {
        return thresholdPointHeight;
    }

    /**
     * Sets the value of the thresholdPointHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setThresholdPointHeight(JAXBElement<TextDecimalType> value) {
        this.thresholdPointHeight = value;
    }

    @Transient
    public boolean isSetThresholdPointHeight() {
        return (this.thresholdPointHeight!= null);
    }

    /**
     * Gets the value of the finalPointLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextLatitudeDMSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextLatitudeDMSType> getFinalPointLatitude() {
        return finalPointLatitude;
    }

    /**
     * Sets the value of the finalPointLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextLatitudeDMSType }{@code >}
     *     
     */
    public void setFinalPointLatitude(JAXBElement<TextLatitudeDMSType> value) {
        this.finalPointLatitude = value;
    }

    @Transient
    public boolean isSetFinalPointLatitude() {
        return (this.finalPointLatitude!= null);
    }

    /**
     * Gets the value of the finalPointLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextLongitudeDMSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextLongitudeDMSType> getFinalPointLongitude() {
        return finalPointLongitude;
    }

    /**
     * Sets the value of the finalPointLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextLongitudeDMSType }{@code >}
     *     
     */
    public void setFinalPointLongitude(JAXBElement<TextLongitudeDMSType> value) {
        this.finalPointLongitude = value;
    }

    @Transient
    public boolean isSetFinalPointLongitude() {
        return (this.finalPointLongitude!= null);
    }

    /**
     * Gets the value of the deltaFinalPointLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getDeltaFinalPointLatitude() {
        return deltaFinalPointLatitude;
    }

    /**
     * Sets the value of the deltaFinalPointLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setDeltaFinalPointLatitude(JAXBElement<TextDecimalType> value) {
        this.deltaFinalPointLatitude = value;
    }

    @Transient
    public boolean isSetDeltaFinalPointLatitude() {
        return (this.deltaFinalPointLatitude!= null);
    }

    /**
     * Gets the value of the deltaFinalPointLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getDeltaFinalPointLongitude() {
        return deltaFinalPointLongitude;
    }

    /**
     * Sets the value of the deltaFinalPointLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setDeltaFinalPointLongitude(JAXBElement<TextDecimalType> value) {
        this.deltaFinalPointLongitude = value;
    }

    @Transient
    public boolean isSetDeltaFinalPointLongitude() {
        return (this.deltaFinalPointLongitude!= null);
    }

    /**
     * Gets the value of the thresholdCrossingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getThresholdCrossingHeight() {
        return thresholdCrossingHeight;
    }

    /**
     * Sets the value of the thresholdCrossingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setThresholdCrossingHeight(JAXBElement<TextDecimalType> value) {
        this.thresholdCrossingHeight = value;
    }

    @Transient
    public boolean isSetThresholdCrossingHeight() {
        return (this.thresholdCrossingHeight!= null);
    }

    /**
     * Gets the value of the thresholdCrossingHeightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getThresholdCrossingHeightUnits() {
        return thresholdCrossingHeightUnits;
    }

    /**
     * Sets the value of the thresholdCrossingHeightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setThresholdCrossingHeightUnits(JAXBElement<NoNumberType> value) {
        this.thresholdCrossingHeightUnits = value;
    }

    @Transient
    public boolean isSetThresholdCrossingHeightUnits() {
        return (this.thresholdCrossingHeightUnits!= null);
    }

    /**
     * Gets the value of the glidepathAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getGlidepathAngle() {
        return glidepathAngle;
    }

    /**
     * Sets the value of the glidepathAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setGlidepathAngle(JAXBElement<TextDecimalType> value) {
        this.glidepathAngle = value;
    }

    @Transient
    public boolean isSetGlidepathAngle() {
        return (this.glidepathAngle!= null);
    }

    /**
     * Gets the value of the thresholdOrthoHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getThresholdOrthoHeight() {
        return thresholdOrthoHeight;
    }

    /**
     * Sets the value of the thresholdOrthoHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setThresholdOrthoHeight(JAXBElement<TextDecimalType> value) {
        this.thresholdOrthoHeight = value;
    }

    @Transient
    public boolean isSetThresholdOrthoHeight() {
        return (this.thresholdOrthoHeight!= null);
    }

    /**
     * Gets the value of the finalPointOrthoHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDecimalType> getFinalPointOrthoHeight() {
        return finalPointOrthoHeight;
    }

    /**
     * Sets the value of the finalPointOrthoHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDecimalType }{@code >}
     *     
     */
    public void setFinalPointOrthoHeight(JAXBElement<TextDecimalType> value) {
        this.finalPointOrthoHeight = value;
    }

    @Transient
    public boolean isSetFinalPointOrthoHeight() {
        return (this.finalPointOrthoHeight!= null);
    }

    /**
     * Gets the value of the fasDataBlock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValHexType> getFASDataBlock() {
        return fasDataBlock;
    }

    /**
     * Sets the value of the fasDataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public void setFASDataBlock(JAXBElement<ValHexType> value) {
        this.fasDataBlock = value;
    }

    @Transient
    public boolean isSetFASDataBlock() {
        return (this.fasDataBlock!= null);
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
    @JoinTable(name = "fnlapprchsgmntdttp_annttn_l", schema = "procedure", joinColumns = {
        @JoinColumn(name = "finalapproachsegmentdata_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
    })
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
     * {@link FinalApproachSegmentDataExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FinalApproachSegmentDataExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachsegmentdata_oe_hjid", referencedColumnName = "hjid")
    public List<FinalApproachSegmentDataExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FinalApproachSegmentDataExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "approachperformancedesignator", columnDefinition = "nonumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachperformancedesignatornilreason", columnDefinition = "nilreason"))
    })
    public NoNumberType getApproachPerformanceDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getApproachPerformanceDesignator());
    }

    public void setApproachPerformanceDesignatorItem(NoNumberType target) {
        setApproachPerformanceDesignator(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "approachPerformanceDesignator"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "codeicao", columnDefinition = "alphanumeric")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "codeicaonilreason", columnDefinition = "nilreason"))
    })
    public CodeICAOCountryType getCodeICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeICAOCountryType.class, this.getCodeICAO());
    }

    public void setCodeICAOItem(CodeICAOCountryType target) {
        setCodeICAO(XmlAdapterUtils.marshallJAXBElement(CodeICAOCountryType.class, new QName("http://www.aixm.aero/schema/5.2", "codeICAO"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "crcremainder", columnDefinition = "valhexbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "crcremaindernilreason", columnDefinition = "nilreason"))
    })
    public ValHexType getCRCRemainderItem() {
        return XmlAdapterUtils.unmarshallSource(ValHexType.class, this.getCRCRemainder());
    }

    public void setCRCRemainderItem(ValHexType target) {
        setCRCRemainder(XmlAdapterUtils.marshallJAXBElement(ValHexType.class, new QName("http://www.aixm.aero/schema/5.2", "CRCRemainder"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "horizontalalarmlimit", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "horizontalalarmlimitnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getHorizontalAlarmLimitItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getHorizontalAlarmLimit());
    }

    public void setHorizontalAlarmLimitItem(TextDecimalType target) {
        setHorizontalAlarmLimit(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "horizontalAlarmLimit"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lengthoffset", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lengthoffsetnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getLengthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getLengthOffset());
    }

    public void setLengthOffsetItem(TextDecimalType target) {
        setLengthOffset(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "lengthOffset"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "operationtype", columnDefinition = "nonumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "operationtypenilreason", columnDefinition = "nilreason"))
    })
    public NoNumberType getOperationTypeItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getOperationType());
    }

    public void setOperationTypeItem(NoNumberType target) {
        setOperationType(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "operationType"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencepathdataselector", columnDefinition = "nosequencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencepathdataselectornilreason", columnDefinition = "nilreason"))
    })
    public NoSequenceType getReferencePathDataSelectorItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getReferencePathDataSelector());
    }

    public void setReferencePathDataSelectorItem(NoSequenceType target) {
        setReferencePathDataSelector(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.2", "referencePathDataSelector"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencepathidentifier", columnDefinition = "alphanumeric")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencepathidentifiernilreason", columnDefinition = "nilreason"))
    })
    public CodeReferencePathIdentifierType getReferencePathIdentifierItem() {
        return XmlAdapterUtils.unmarshallSource(CodeReferencePathIdentifierType.class, this.getReferencePathIdentifier());
    }

    public void setReferencePathIdentifierItem(CodeReferencePathIdentifierType target) {
        setReferencePathIdentifier(XmlAdapterUtils.marshallJAXBElement(CodeReferencePathIdentifierType.class, new QName("http://www.aixm.aero/schema/5.2", "referencePathIdentifier"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "routeindicator", columnDefinition = "alpha")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "routeindicatornilreason", columnDefinition = "nilreason"))
    })
    public CodeRouteIndicatorType getRouteIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteIndicatorType.class, this.getRouteIndicator());
    }

    public void setRouteIndicatorItem(CodeRouteIndicatorType target) {
        setRouteIndicator(XmlAdapterUtils.marshallJAXBElement(CodeRouteIndicatorType.class, new QName("http://www.aixm.aero/schema/5.2", "routeIndicator"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "serviceprovidersbas", columnDefinition = "nonumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "serviceprovidersbasnilreason", columnDefinition = "nilreason"))
    })
    public NoNumberType getServiceProviderSBASItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getServiceProviderSBAS());
    }

    public void setServiceProviderSBASItem(NoNumberType target) {
        setServiceProviderSBAS(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "serviceProviderSBAS"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdcoursewidth", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdcoursewidthnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getThresholdCourseWidthItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getThresholdCourseWidth());
    }

    public void setThresholdCourseWidthItem(TextDecimalType target) {
        setThresholdCourseWidth(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdCourseWidth"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalalarmlimit", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalalarmlimitnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getVerticalAlarmLimitItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getVerticalAlarmLimit());
    }

    public void setVerticalAlarmLimitItem(TextDecimalType target) {
        setVerticalAlarmLimit(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "verticalAlarmLimit"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "airportid", columnDefinition = "alphanumeric")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "airportidnilreason", columnDefinition = "nilreason"))
    })
    public CodeAirportHeliportDesignatorType getAirportIDItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirportHeliportDesignatorType.class, this.getAirportID());
    }

    public void setAirportIDItem(CodeAirportHeliportDesignatorType target) {
        setAirportID(XmlAdapterUtils.marshallJAXBElement(CodeAirportHeliportDesignatorType.class, new QName("http://www.aixm.aero/schema/5.2", "airportID"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "runwaynumber", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "runwaynumbernilreason", columnDefinition = "nilreason"))
    })
    public TextDesignatorType getRunwayNumberItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getRunwayNumber());
    }

    public void setRunwayNumberItem(TextDesignatorType target) {
        setRunwayNumber(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.2", "runwayNumber"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "runwayletter", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "runwayletternilreason", columnDefinition = "nilreason"))
    })
    public TextDesignatorType getRunwayLetterItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getRunwayLetter());
    }

    public void setRunwayLetterItem(TextDesignatorType target) {
        setRunwayLetter(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.2", "runwayLetter"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdpointlatitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdpointlatitudenilreason", columnDefinition = "nilreason"))
    })
    public TextLatitudeDMSType getThresholdPointLatitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextLatitudeDMSType.class, this.getThresholdPointLatitude());
    }

    public void setThresholdPointLatitudeItem(TextLatitudeDMSType target) {
        setThresholdPointLatitude(XmlAdapterUtils.marshallJAXBElement(TextLatitudeDMSType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdPointLatitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdpointlongitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdpointlongitudenilreason", columnDefinition = "nilreason"))
    })
    public TextLongitudeDMSType getThresholdPointLongitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextLongitudeDMSType.class, this.getThresholdPointLongitude());
    }

    public void setThresholdPointLongitudeItem(TextLongitudeDMSType target) {
        setThresholdPointLongitude(XmlAdapterUtils.marshallJAXBElement(TextLongitudeDMSType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdPointLongitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdpointheight", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdpointheightnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getThresholdPointHeightItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getThresholdPointHeight());
    }

    public void setThresholdPointHeightItem(TextDecimalType target) {
        setThresholdPointHeight(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdPointHeight"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "finalpointlatitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "finalpointlatitudenilreason", columnDefinition = "nilreason"))
    })
    public TextLatitudeDMSType getFinalPointLatitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextLatitudeDMSType.class, this.getFinalPointLatitude());
    }

    public void setFinalPointLatitudeItem(TextLatitudeDMSType target) {
        setFinalPointLatitude(XmlAdapterUtils.marshallJAXBElement(TextLatitudeDMSType.class, new QName("http://www.aixm.aero/schema/5.2", "finalPointLatitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "finalpointlongitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "finalpointlongitudenilreason", columnDefinition = "nilreason"))
    })
    public TextLongitudeDMSType getFinalPointLongitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextLongitudeDMSType.class, this.getFinalPointLongitude());
    }

    public void setFinalPointLongitudeItem(TextLongitudeDMSType target) {
        setFinalPointLongitude(XmlAdapterUtils.marshallJAXBElement(TextLongitudeDMSType.class, new QName("http://www.aixm.aero/schema/5.2", "finalPointLongitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "deltafinalpointlatitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "deltafinalpointlatitudenilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getDeltaFinalPointLatitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getDeltaFinalPointLatitude());
    }

    public void setDeltaFinalPointLatitudeItem(TextDecimalType target) {
        setDeltaFinalPointLatitude(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "deltaFinalPointLatitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "deltafinalpointlongitude", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "deltafinalpointlongitudenilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getDeltaFinalPointLongitudeItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getDeltaFinalPointLongitude());
    }

    public void setDeltaFinalPointLongitudeItem(TextDecimalType target) {
        setDeltaFinalPointLongitude(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "deltaFinalPointLongitude"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdcrossingheight", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdcrossingheightnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getThresholdCrossingHeightItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getThresholdCrossingHeight());
    }

    public void setThresholdCrossingHeightItem(TextDecimalType target) {
        setThresholdCrossingHeight(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdCrossingHeight"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdcrossingheightunits", columnDefinition = "nonumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdcrossingheightunitsnilreason", columnDefinition = "nilreason"))
    })
    public NoNumberType getThresholdCrossingHeightUnitsItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getThresholdCrossingHeightUnits());
    }

    public void setThresholdCrossingHeightUnitsItem(NoNumberType target) {
        setThresholdCrossingHeightUnits(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdCrossingHeightUnits"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "glidepathangle", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "glidepathanglenilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getGlidepathAngleItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getGlidepathAngle());
    }

    public void setGlidepathAngleItem(TextDecimalType target) {
        setGlidepathAngle(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "glidepathAngle"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "thresholdorthoheight", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "thresholdorthoheightnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getThresholdOrthoHeightItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getThresholdOrthoHeight());
    }

    public void setThresholdOrthoHeightItem(TextDecimalType target) {
        setThresholdOrthoHeight(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "thresholdOrthoHeight"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "finalpointorthoheight", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "finalpointorthoheightnilreason", columnDefinition = "nilreason"))
    })
    public TextDecimalType getFinalPointOrthoHeightItem() {
        return XmlAdapterUtils.unmarshallSource(TextDecimalType.class, this.getFinalPointOrthoHeight());
    }

    public void setFinalPointOrthoHeightItem(TextDecimalType target) {
        setFinalPointOrthoHeight(XmlAdapterUtils.marshallJAXBElement(TextDecimalType.class, new QName("http://www.aixm.aero/schema/5.2", "finalPointOrthoHeight"), FinalApproachSegmentDataType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "fasdatablock", columnDefinition = "valhexbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "fasdatablocknilreason", columnDefinition = "nilreason"))
    })
    public ValHexType getFASDataBlockItem() {
        return XmlAdapterUtils.unmarshallSource(ValHexType.class, this.getFASDataBlock());
    }

    public void setFASDataBlockItem(ValHexType target) {
        setFASDataBlock(XmlAdapterUtils.marshallJAXBElement(ValHexType.class, new QName("http://www.aixm.aero/schema/5.2", "FASDataBlock"), FinalApproachSegmentDataType.class, target));
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
        final FinalApproachSegmentDataType that = ((FinalApproachSegmentDataType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalPointLatitude();
            boolean rhsFieldIsSet = that.isSetFinalPointLatitude();
            JAXBElement<TextLatitudeDMSType> lhsField;
            lhsField = this.getFinalPointLatitude();
            JAXBElement<TextLatitudeDMSType> rhsField;
            rhsField = that.getFinalPointLatitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPointLatitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPointLatitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLengthOffset();
            boolean rhsFieldIsSet = that.isSetLengthOffset();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getLengthOffset();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getLengthOffset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lengthOffset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lengthOffset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAirportID();
            boolean rhsFieldIsSet = that.isSetAirportID();
            JAXBElement<CodeAirportHeliportDesignatorType> lhsField;
            lhsField = this.getAirportID();
            JAXBElement<CodeAirportHeliportDesignatorType> rhsField;
            rhsField = that.getAirportID();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportID", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportID", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdCrossingHeightUnits();
            boolean rhsFieldIsSet = that.isSetThresholdCrossingHeightUnits();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getThresholdCrossingHeightUnits();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getThresholdCrossingHeightUnits();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdCrossingHeightUnits", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdCrossingHeightUnits", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachPerformanceDesignator();
            boolean rhsFieldIsSet = that.isSetApproachPerformanceDesignator();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getApproachPerformanceDesignator();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getApproachPerformanceDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachPerformanceDesignator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachPerformanceDesignator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdCrossingHeight();
            boolean rhsFieldIsSet = that.isSetThresholdCrossingHeight();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getThresholdCrossingHeight();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getThresholdCrossingHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdCrossingHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdCrossingHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServiceProviderSBAS();
            boolean rhsFieldIsSet = that.isSetServiceProviderSBAS();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getServiceProviderSBAS();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getServiceProviderSBAS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceProviderSBAS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceProviderSBAS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDeltaFinalPointLongitude();
            boolean rhsFieldIsSet = that.isSetDeltaFinalPointLongitude();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getDeltaFinalPointLongitude();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getDeltaFinalPointLongitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "deltaFinalPointLongitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "deltaFinalPointLongitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalApproachSegmentDataExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FinalApproachSegmentDataExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayLetter();
            boolean rhsFieldIsSet = that.isSetRunwayLetter();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getRunwayLetter();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getRunwayLetter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayLetter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayLetter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDeltaFinalPointLatitude();
            boolean rhsFieldIsSet = that.isSetDeltaFinalPointLatitude();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getDeltaFinalPointLatitude();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getDeltaFinalPointLatitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "deltaFinalPointLatitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "deltaFinalPointLatitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdPointHeight();
            boolean rhsFieldIsSet = that.isSetThresholdPointHeight();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getThresholdPointHeight();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getThresholdPointHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdPointHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdPointHeight", rhsField);
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
            boolean lhsFieldIsSet = this.isSetThresholdPointLongitude();
            boolean rhsFieldIsSet = that.isSetThresholdPointLongitude();
            JAXBElement<TextLongitudeDMSType> lhsField;
            lhsField = this.getThresholdPointLongitude();
            JAXBElement<TextLongitudeDMSType> rhsField;
            rhsField = that.getThresholdPointLongitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdPointLongitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdPointLongitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHorizontalAlarmLimit();
            boolean rhsFieldIsSet = that.isSetHorizontalAlarmLimit();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getHorizontalAlarmLimit();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getHorizontalAlarmLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalAlarmLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalAlarmLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalPointOrthoHeight();
            boolean rhsFieldIsSet = that.isSetFinalPointOrthoHeight();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getFinalPointOrthoHeight();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getFinalPointOrthoHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPointOrthoHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPointOrthoHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdPointLatitude();
            boolean rhsFieldIsSet = that.isSetThresholdPointLatitude();
            JAXBElement<TextLatitudeDMSType> lhsField;
            lhsField = this.getThresholdPointLatitude();
            JAXBElement<TextLatitudeDMSType> rhsField;
            rhsField = that.getThresholdPointLatitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdPointLatitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdPointLatitude", rhsField);
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
            boolean lhsFieldIsSet = this.isSetThresholdOrthoHeight();
            boolean rhsFieldIsSet = that.isSetThresholdOrthoHeight();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getThresholdOrthoHeight();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getThresholdOrthoHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdOrthoHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdOrthoHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetThresholdCourseWidth();
            boolean rhsFieldIsSet = that.isSetThresholdCourseWidth();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getThresholdCourseWidth();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getThresholdCourseWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thresholdCourseWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thresholdCourseWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayNumber();
            boolean rhsFieldIsSet = that.isSetRunwayNumber();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getRunwayNumber();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getRunwayNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalPointLongitude();
            boolean rhsFieldIsSet = that.isSetFinalPointLongitude();
            JAXBElement<TextLongitudeDMSType> lhsField;
            lhsField = this.getFinalPointLongitude();
            JAXBElement<TextLongitudeDMSType> rhsField;
            rhsField = that.getFinalPointLongitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPointLongitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPointLongitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalAlarmLimit();
            boolean rhsFieldIsSet = that.isSetVerticalAlarmLimit();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getVerticalAlarmLimit();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getVerticalAlarmLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalAlarmLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalAlarmLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperationType();
            boolean rhsFieldIsSet = that.isSetOperationType();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getOperationType();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getOperationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationType", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGlidepathAngle();
            boolean rhsFieldIsSet = that.isSetGlidepathAngle();
            JAXBElement<TextDecimalType> lhsField;
            lhsField = this.getGlidepathAngle();
            JAXBElement<TextDecimalType> rhsField;
            rhsField = that.getGlidepathAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "glidepathAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "glidepathAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFASDataBlock();
            boolean rhsFieldIsSet = that.isSetFASDataBlock();
            JAXBElement<ValHexType> lhsField;
            lhsField = this.getFASDataBlock();
            JAXBElement<ValHexType> rhsField;
            rhsField = that.getFASDataBlock();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fasDataBlock", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fasDataBlock", rhsField);
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
            boolean theFieldIsSet = this.isSetApproachPerformanceDesignator();
            JAXBElement<NoNumberType> theField;
            theField = this.getApproachPerformanceDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachPerformanceDesignator", theField);
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
            boolean theFieldIsSet = this.isSetCRCRemainder();
            JAXBElement<ValHexType> theField;
            theField = this.getCRCRemainder();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "crcRemainder", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalAlarmLimit();
            JAXBElement<TextDecimalType> theField;
            theField = this.getHorizontalAlarmLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalAlarmLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<TextDecimalType> theField;
            theField = this.getLengthOffset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lengthOffset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationType();
            JAXBElement<NoNumberType> theField;
            theField = this.getOperationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationType", theField);
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
            boolean theFieldIsSet = this.isSetRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> theField;
            theField = this.getRouteIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routeIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProviderSBAS();
            JAXBElement<NoNumberType> theField;
            theField = this.getServiceProviderSBAS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceProviderSBAS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCourseWidth();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdCourseWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdCourseWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAlarmLimit();
            JAXBElement<TextDecimalType> theField;
            theField = this.getVerticalAlarmLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalAlarmLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportID();
            JAXBElement<CodeAirportHeliportDesignatorType> theField;
            theField = this.getAirportID();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportID", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayNumber();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getRunwayNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayLetter();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getRunwayLetter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayLetter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointLatitude();
            JAXBElement<TextLatitudeDMSType> theField;
            theField = this.getThresholdPointLatitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdPointLatitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointLongitude();
            JAXBElement<TextLongitudeDMSType> theField;
            theField = this.getThresholdPointLongitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdPointLongitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdPointHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdPointHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointLatitude();
            JAXBElement<TextLatitudeDMSType> theField;
            theField = this.getFinalPointLatitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPointLatitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointLongitude();
            JAXBElement<TextLongitudeDMSType> theField;
            theField = this.getFinalPointLongitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPointLongitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeltaFinalPointLatitude();
            JAXBElement<TextDecimalType> theField;
            theField = this.getDeltaFinalPointLatitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "deltaFinalPointLatitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeltaFinalPointLongitude();
            JAXBElement<TextDecimalType> theField;
            theField = this.getDeltaFinalPointLongitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "deltaFinalPointLongitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCrossingHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdCrossingHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdCrossingHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCrossingHeightUnits();
            JAXBElement<NoNumberType> theField;
            theField = this.getThresholdCrossingHeightUnits();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdCrossingHeightUnits", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGlidepathAngle();
            JAXBElement<TextDecimalType> theField;
            theField = this.getGlidepathAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "glidepathAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdOrthoHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdOrthoHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thresholdOrthoHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointOrthoHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getFinalPointOrthoHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPointOrthoHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFASDataBlock();
            JAXBElement<ValHexType> theField;
            theField = this.getFASDataBlock();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fasDataBlock", theField);
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
            List<FinalApproachSegmentDataExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetApproachPerformanceDesignator();
            JAXBElement<NoNumberType> theField;
            theField = this.getApproachPerformanceDesignator();
            strategy.appendField(locator, this, "approachPerformanceDesignator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeICAO();
            JAXBElement<CodeICAOCountryType> theField;
            theField = this.getCodeICAO();
            strategy.appendField(locator, this, "codeICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCRCRemainder();
            JAXBElement<ValHexType> theField;
            theField = this.getCRCRemainder();
            strategy.appendField(locator, this, "crcRemainder", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalAlarmLimit();
            JAXBElement<TextDecimalType> theField;
            theField = this.getHorizontalAlarmLimit();
            strategy.appendField(locator, this, "horizontalAlarmLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<TextDecimalType> theField;
            theField = this.getLengthOffset();
            strategy.appendField(locator, this, "lengthOffset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationType();
            JAXBElement<NoNumberType> theField;
            theField = this.getOperationType();
            strategy.appendField(locator, this, "operationType", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetRouteIndicator();
            JAXBElement<CodeRouteIndicatorType> theField;
            theField = this.getRouteIndicator();
            strategy.appendField(locator, this, "routeIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProviderSBAS();
            JAXBElement<NoNumberType> theField;
            theField = this.getServiceProviderSBAS();
            strategy.appendField(locator, this, "serviceProviderSBAS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCourseWidth();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdCourseWidth();
            strategy.appendField(locator, this, "thresholdCourseWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAlarmLimit();
            JAXBElement<TextDecimalType> theField;
            theField = this.getVerticalAlarmLimit();
            strategy.appendField(locator, this, "verticalAlarmLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportID();
            JAXBElement<CodeAirportHeliportDesignatorType> theField;
            theField = this.getAirportID();
            strategy.appendField(locator, this, "airportID", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayNumber();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getRunwayNumber();
            strategy.appendField(locator, this, "runwayNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayLetter();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getRunwayLetter();
            strategy.appendField(locator, this, "runwayLetter", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointLatitude();
            JAXBElement<TextLatitudeDMSType> theField;
            theField = this.getThresholdPointLatitude();
            strategy.appendField(locator, this, "thresholdPointLatitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointLongitude();
            JAXBElement<TextLongitudeDMSType> theField;
            theField = this.getThresholdPointLongitude();
            strategy.appendField(locator, this, "thresholdPointLongitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdPointHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdPointHeight();
            strategy.appendField(locator, this, "thresholdPointHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointLatitude();
            JAXBElement<TextLatitudeDMSType> theField;
            theField = this.getFinalPointLatitude();
            strategy.appendField(locator, this, "finalPointLatitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointLongitude();
            JAXBElement<TextLongitudeDMSType> theField;
            theField = this.getFinalPointLongitude();
            strategy.appendField(locator, this, "finalPointLongitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeltaFinalPointLatitude();
            JAXBElement<TextDecimalType> theField;
            theField = this.getDeltaFinalPointLatitude();
            strategy.appendField(locator, this, "deltaFinalPointLatitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeltaFinalPointLongitude();
            JAXBElement<TextDecimalType> theField;
            theField = this.getDeltaFinalPointLongitude();
            strategy.appendField(locator, this, "deltaFinalPointLongitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCrossingHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdCrossingHeight();
            strategy.appendField(locator, this, "thresholdCrossingHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdCrossingHeightUnits();
            JAXBElement<NoNumberType> theField;
            theField = this.getThresholdCrossingHeightUnits();
            strategy.appendField(locator, this, "thresholdCrossingHeightUnits", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGlidepathAngle();
            JAXBElement<TextDecimalType> theField;
            theField = this.getGlidepathAngle();
            strategy.appendField(locator, this, "glidepathAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThresholdOrthoHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getThresholdOrthoHeight();
            strategy.appendField(locator, this, "thresholdOrthoHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPointOrthoHeight();
            JAXBElement<TextDecimalType> theField;
            theField = this.getFinalPointOrthoHeight();
            strategy.appendField(locator, this, "finalPointOrthoHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFASDataBlock();
            JAXBElement<ValHexType> theField;
            theField = this.getFASDataBlock();
            strategy.appendField(locator, this, "fasDataBlock", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalApproachSegmentDataExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
