
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
 * <p>Java class for AirportHeliportTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirportHeliportTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AirportHeliportPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirportHeliportExtension"/>
 *                 </sequence>
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
@XmlType(name = "AirportHeliportTimeSliceType", propOrder = {
    "designator",
    "aixmName",
    "locationIndicatorICAO",
    "designatorIATA",
    "type",
    "certifiedICAO",
    "privateUse",
    "controlType",
    "fieldElevation",
    "fieldElevationAccuracy",
    "verticalDatum",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "magneticVariationChange",
    "referenceTemperature",
    "altimeterCheckLocation",
    "secondaryPowerSupply",
    "windDirectionIndicator",
    "landingDirectionIndicator",
    "transitionAltitude",
    "transitionLevel",
    "lowestTemperature",
    "abandoned",
    "certificationDate",
    "certificationExpirationDate",
    "contaminant",
    "servedCity",
    "responsibleOrganisation",
    "arp",
    "aviationBoundary",
    "altimeterSource",
    "contact",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "AirportHeliportTimeSliceType")
@Table(name = "airportheliport_ts", schema = "airport_heliport")
public class AirportHeliportTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportHeliportDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "locationIndicatorICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOType> locationIndicatorICAO;
    @XmlElementRef(name = "designatorIATA", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIATAType> designatorIATA;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportHeliportType> type;
    @XmlElementRef(name = "certifiedICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> certifiedICAO;
    @XmlElementRef(name = "privateUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> privateUse;
    @XmlElementRef(name = "controlType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> controlType;
    @XmlElementRef(name = "fieldElevation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> fieldElevation;
    @XmlElementRef(name = "fieldElevationAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> fieldElevationAccuracy;
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalDatumType> verticalDatum;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElementRef(name = "magneticVariationChange", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationChangeType> magneticVariationChange;
    @XmlElementRef(name = "referenceTemperature", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> referenceTemperature;
    @XmlElementRef(name = "altimeterCheckLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> altimeterCheckLocation;
    @XmlElementRef(name = "secondaryPowerSupply", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> secondaryPowerSupply;
    @XmlElementRef(name = "windDirectionIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> windDirectionIndicator;
    @XmlElementRef(name = "landingDirectionIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> landingDirectionIndicator;
    @XmlElementRef(name = "transitionAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> transitionAltitude;
    @XmlElementRef(name = "transitionLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFLType> transitionLevel;
    @XmlElementRef(name = "lowestTemperature", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> lowestTemperature;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "certificationDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateType> certificationDate;
    @XmlElementRef(name = "certificationExpirationDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateType> certificationExpirationDate;
    @XmlElement(nillable = true)
    protected List<AirportHeliportContaminationPropertyType> contaminant;
    @XmlElement(nillable = true)
    protected List<CityPropertyType> servedCity;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> responsibleOrganisation;
    @XmlElementRef(name = "ARP", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> arp;
    @XmlElementRef(name = "aviationBoundary", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedSurfacePropertyType> aviationBoundary;
    @XmlElement(nillable = true)
    protected List<AltimeterSourcePropertyType> altimeterSource;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElement(nillable = true)
    protected List<AirportHeliportAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirportHeliportExtensionType> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirportHeliportDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeAirportHeliportDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getAixmName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName!= null);
    }

    /**
     * Gets the value of the locationIndicatorICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeICAOType> getLocationIndicatorICAO() {
        return locationIndicatorICAO;
    }

    /**
     * Sets the value of the locationIndicatorICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOType }{@code >}
     *     
     */
    public void setLocationIndicatorICAO(JAXBElement<CodeICAOType> value) {
        this.locationIndicatorICAO = value;
    }

    @Transient
    public boolean isSetLocationIndicatorICAO() {
        return (this.locationIndicatorICAO!= null);
    }

    /**
     * Gets the value of the designatorIATA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIATAType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeIATAType> getDesignatorIATA() {
        return designatorIATA;
    }

    /**
     * Sets the value of the designatorIATA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIATAType }{@code >}
     *     
     */
    public void setDesignatorIATA(JAXBElement<CodeIATAType> value) {
        this.designatorIATA = value;
    }

    @Transient
    public boolean isSetDesignatorIATA() {
        return (this.designatorIATA!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirportHeliportType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirportHeliportType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the certifiedICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getCertifiedICAO() {
        return certifiedICAO;
    }

    /**
     * Sets the value of the certifiedICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCertifiedICAO(JAXBElement<CodeYesNoType> value) {
        this.certifiedICAO = value;
    }

    @Transient
    public boolean isSetCertifiedICAO() {
        return (this.certifiedICAO!= null);
    }

    /**
     * Gets the value of the privateUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getPrivateUse() {
        return privateUse;
    }

    /**
     * Sets the value of the privateUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPrivateUse(JAXBElement<CodeYesNoType> value) {
        this.privateUse = value;
    }

    @Transient
    public boolean isSetPrivateUse() {
        return (this.privateUse!= null);
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryOperationsType> getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setControlType(JAXBElement<CodeMilitaryOperationsType> value) {
        this.controlType = value;
    }

    @Transient
    public boolean isSetControlType() {
        return (this.controlType!= null);
    }

    /**
     * Gets the value of the fieldElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getFieldElevation() {
        return fieldElevation;
    }

    /**
     * Sets the value of the fieldElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setFieldElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.fieldElevation = value;
    }

    @Transient
    public boolean isSetFieldElevation() {
        return (this.fieldElevation!= null);
    }

    /**
     * Gets the value of the fieldElevationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getFieldElevationAccuracy() {
        return fieldElevationAccuracy;
    }

    /**
     * Sets the value of the fieldElevationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setFieldElevationAccuracy(JAXBElement<ValDistanceVerticalType> value) {
        this.fieldElevationAccuracy = value;
    }

    @Transient
    public boolean isSetFieldElevationAccuracy() {
        return (this.fieldElevationAccuracy!= null);
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalDatumType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    public void setVerticalDatum(JAXBElement<CodeVerticalDatumType> value) {
        this.verticalDatum = value;
    }

    @Transient
    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

    /**
     * Gets the value of the magneticVariation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValMagneticVariationType> getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Sets the value of the magneticVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    @Transient
    public boolean isSetMagneticVariation() {
        return (this.magneticVariation!= null);
    }

    /**
     * Gets the value of the magneticVariationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getMagneticVariationAccuracy() {
        return magneticVariationAccuracy;
    }

    /**
     * Sets the value of the magneticVariationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setMagneticVariationAccuracy(JAXBElement<ValAngleType> value) {
        this.magneticVariationAccuracy = value;
    }

    @Transient
    public boolean isSetMagneticVariationAccuracy() {
        return (this.magneticVariationAccuracy!= null);
    }

    /**
     * Gets the value of the dateMagneticVariation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateYearType> getDateMagneticVariation() {
        return dateMagneticVariation;
    }

    /**
     * Sets the value of the dateMagneticVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    @Transient
    public boolean isSetDateMagneticVariation() {
        return (this.dateMagneticVariation!= null);
    }

    /**
     * Gets the value of the magneticVariationChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationChangeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValMagneticVariationChangeType> getMagneticVariationChange() {
        return magneticVariationChange;
    }

    /**
     * Sets the value of the magneticVariationChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationChangeType }{@code >}
     *     
     */
    public void setMagneticVariationChange(JAXBElement<ValMagneticVariationChangeType> value) {
        this.magneticVariationChange = value;
    }

    @Transient
    public boolean isSetMagneticVariationChange() {
        return (this.magneticVariationChange!= null);
    }

    /**
     * Gets the value of the referenceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValTemperatureType> getReferenceTemperature() {
        return referenceTemperature;
    }

    /**
     * Sets the value of the referenceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setReferenceTemperature(JAXBElement<ValTemperatureType> value) {
        this.referenceTemperature = value;
    }

    @Transient
    public boolean isSetReferenceTemperature() {
        return (this.referenceTemperature!= null);
    }

    /**
     * Gets the value of the altimeterCheckLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getAltimeterCheckLocation() {
        return altimeterCheckLocation;
    }

    /**
     * Sets the value of the altimeterCheckLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAltimeterCheckLocation(JAXBElement<CodeYesNoType> value) {
        this.altimeterCheckLocation = value;
    }

    @Transient
    public boolean isSetAltimeterCheckLocation() {
        return (this.altimeterCheckLocation!= null);
    }

    /**
     * Gets the value of the secondaryPowerSupply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSecondaryPowerSupply() {
        return secondaryPowerSupply;
    }

    /**
     * Sets the value of the secondaryPowerSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSecondaryPowerSupply(JAXBElement<CodeYesNoType> value) {
        this.secondaryPowerSupply = value;
    }

    @Transient
    public boolean isSetSecondaryPowerSupply() {
        return (this.secondaryPowerSupply!= null);
    }

    /**
     * Gets the value of the windDirectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getWindDirectionIndicator() {
        return windDirectionIndicator;
    }

    /**
     * Sets the value of the windDirectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWindDirectionIndicator(JAXBElement<CodeYesNoType> value) {
        this.windDirectionIndicator = value;
    }

    @Transient
    public boolean isSetWindDirectionIndicator() {
        return (this.windDirectionIndicator!= null);
    }

    /**
     * Gets the value of the landingDirectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLandingDirectionIndicator() {
        return landingDirectionIndicator;
    }

    /**
     * Sets the value of the landingDirectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLandingDirectionIndicator(JAXBElement<CodeYesNoType> value) {
        this.landingDirectionIndicator = value;
    }

    @Transient
    public boolean isSetLandingDirectionIndicator() {
        return (this.landingDirectionIndicator!= null);
    }

    /**
     * Gets the value of the transitionAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getTransitionAltitude() {
        return transitionAltitude;
    }

    /**
     * Sets the value of the transitionAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setTransitionAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.transitionAltitude = value;
    }

    @Transient
    public boolean isSetTransitionAltitude() {
        return (this.transitionAltitude!= null);
    }

    /**
     * Gets the value of the transitionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFLType> getTransitionLevel() {
        return transitionLevel;
    }

    /**
     * Sets the value of the transitionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public void setTransitionLevel(JAXBElement<ValFLType> value) {
        this.transitionLevel = value;
    }

    @Transient
    public boolean isSetTransitionLevel() {
        return (this.transitionLevel!= null);
    }

    /**
     * Gets the value of the lowestTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValTemperatureType> getLowestTemperature() {
        return lowestTemperature;
    }

    /**
     * Sets the value of the lowestTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setLowestTemperature(JAXBElement<ValTemperatureType> value) {
        this.lowestTemperature = value;
    }

    @Transient
    public boolean isSetLowestTemperature() {
        return (this.lowestTemperature!= null);
    }

    /**
     * Gets the value of the abandoned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Sets the value of the abandoned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    @Transient
    public boolean isSetAbandoned() {
        return (this.abandoned!= null);
    }

    /**
     * Gets the value of the certificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateType> getCertificationDate() {
        return certificationDate;
    }

    /**
     * Sets the value of the certificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public void setCertificationDate(JAXBElement<DateType> value) {
        this.certificationDate = value;
    }

    @Transient
    public boolean isSetCertificationDate() {
        return (this.certificationDate!= null);
    }

    /**
     * Gets the value of the certificationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateType> getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    /**
     * Sets the value of the certificationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public void setCertificationExpirationDate(JAXBElement<DateType> value) {
        this.certificationExpirationDate = value;
    }

    @Transient
    public boolean isSetCertificationExpirationDate() {
        return (this.certificationExpirationDate!= null);
    }

    /**
     * Gets the value of the contaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportContaminationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirportHeliportContaminationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "contaminant_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "contaminant", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportContaminationPropertyType> getContaminant() {
        if (contaminant == null) {
            contaminant = new ArrayList<>();
        }
        return this.contaminant;
    }

    /**
     * 
     * 
     */
    public void setContaminant(List<AirportHeliportContaminationPropertyType> contaminant) {
        this.contaminant = contaminant;
    }

    @Transient
    public boolean isSetContaminant() {
        return ((this.contaminant!= null)&&(!this.contaminant.isEmpty()));
    }

    public void unsetContaminant() {
        this.contaminant = null;
    }

    /**
     * Gets the value of the servedCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servedCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServedCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = CityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "servedcity_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "servedcity", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
    })
    public List<CityPropertyType> getServedCity() {
        if (servedCity == null) {
            servedCity = new ArrayList<>();
        }
        return this.servedCity;
    }

    /**
     * 
     * 
     */
    public void setServedCity(List<CityPropertyType> servedCity) {
        this.servedCity = servedCity;
    }

    @Transient
    public boolean isSetServedCity() {
        return ((this.servedCity!= null)&&(!this.servedCity.isEmpty()));
    }

    public void unsetServedCity() {
        this.servedCity = null;
    }

    /**
     * Gets the value of the responsibleOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Sets the value of the responsibleOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> value) {
        this.responsibleOrganisation = value;
    }

    @Transient
    public boolean isSetResponsibleOrganisation() {
        return (this.responsibleOrganisation!= null);
    }

    /**
     * Gets the value of the arp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getARP() {
        return arp;
    }

    /**
     * Sets the value of the arp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setARP(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.arp = value;
    }

    @Transient
    public boolean isSetARP() {
        return (this.arp!= null);
    }

    /**
     * Gets the value of the aviationBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedSurfacePropertyType> getAviationBoundary() {
        return aviationBoundary;
    }

    /**
     * Sets the value of the aviationBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setAviationBoundary(JAXBElement<AIXMElevatedSurfacePropertyType> value) {
        this.aviationBoundary = value;
    }

    @Transient
    public boolean isSetAviationBoundary() {
        return (this.aviationBoundary!= null);
    }

    /**
     * Gets the value of the altimeterSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altimeterSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltimeterSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltimeterSourcePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AltimeterSourcePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "altimetersource_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "altimetersource", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
    })
    public List<AltimeterSourcePropertyType> getAltimeterSource() {
        if (altimeterSource == null) {
            altimeterSource = new ArrayList<>();
        }
        return this.altimeterSource;
    }

    /**
     * 
     * 
     */
    public void setAltimeterSource(List<AltimeterSourcePropertyType> altimeterSource) {
        this.altimeterSource = altimeterSource;
    }

    @Transient
    public boolean isSetAltimeterSource() {
        return ((this.altimeterSource!= null)&&(!this.altimeterSource.isEmpty()));
    }

    public void unsetAltimeterSource() {
        this.altimeterSource = null;
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
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "contact_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "contact", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
    })
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * 
     * 
     */
    public void setContact(List<ContactInformationPropertyType> contact) {
        this.contact = contact;
    }

    @Transient
    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirportHeliportAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<AirportHeliportAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_airportheliport_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportheliportpropertygroup", referencedColumnName = "hjid")
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
     * {@link AirportHeliportExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirportHeliportExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AIRPORT_HELIPORT_T_0")
    public List<AirportHeliportExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AirportHeliportExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public CodeAirportHeliportDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirportHeliportDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeAirportHeliportDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeAirportHeliportDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "locationindicatoricao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "locationindicatoricao_nilreason"))
    })
    public CodeICAOType getLocationIndicatorICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeICAOType.class, this.getLocationIndicatorICAO());
    }

    public void setLocationIndicatorICAOItem(CodeICAOType target) {
        setLocationIndicatorICAO(XmlAdapterUtils.marshallJAXBElement(CodeICAOType.class, new QName("http://www.aixm.aero/schema/5.1.1", "locationIndicatorICAO"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatoriata")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatoriata_nilreason"))
    })
    public CodeIATAType getDesignatorIATAItem() {
        return XmlAdapterUtils.unmarshallSource(CodeIATAType.class, this.getDesignatorIATA());
    }

    public void setDesignatorIATAItem(CodeIATAType target) {
        setDesignatorIATA(XmlAdapterUtils.marshallJAXBElement(CodeIATAType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorIATA"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeAirportHeliportType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirportHeliportType.class, this.getType());
    }

    public void setTypeItem(CodeAirportHeliportType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAirportHeliportType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "certifiedicao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "certifiedicao_nilreason"))
    })
    public CodeYesNoType getCertifiedICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getCertifiedICAO());
    }

    public void setCertifiedICAOItem(CodeYesNoType target) {
        setCertifiedICAO(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "certifiedICAO"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "privateuse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "privateuse_nilreason"))
    })
    public CodeYesNoType getPrivateUseItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getPrivateUse());
    }

    public void setPrivateUseItem(CodeYesNoType target) {
        setPrivateUse(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "privateUse"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "controltype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "controltype_nilreason"))
    })
    public CodeMilitaryOperationsType getControlTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryOperationsType.class, this.getControlType());
    }

    public void setControlTypeItem(CodeMilitaryOperationsType target) {
        setControlType(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryOperationsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "controlType"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "fieldelevation")),
        @AttributeOverride(name = "uom", column = @Column(name = "fieldelevation_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "fieldelevation_nilreason"))
    })
    public ValDistanceVerticalType getFieldElevationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getFieldElevation());
    }

    public void setFieldElevationItem(ValDistanceVerticalType target) {
        setFieldElevation(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "fieldElevation"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "fieldelevationaccuracy")),
        @AttributeOverride(name = "uom", column = @Column(name = "fieldelevationaccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "fieldelevationaccuracy_nilreason"))
    })
    public ValDistanceVerticalType getFieldElevationAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getFieldElevationAccuracy());
    }

    public void setFieldElevationAccuracyItem(ValDistanceVerticalType target) {
        setFieldElevationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "fieldElevationAccuracy"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticaldatum")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticaldatum_nilreason"))
    })
    public CodeVerticalDatumType getVerticalDatumItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalDatumType.class, this.getVerticalDatum());
    }

    public void setVerticalDatumItem(CodeVerticalDatumType target) {
        setVerticalDatum(XmlAdapterUtils.marshallJAXBElement(CodeVerticalDatumType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalDatum"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticvariation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticvariation_nilreason"))
    })
    public ValMagneticVariationType getMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(ValMagneticVariationType.class, this.getMagneticVariation());
    }

    public void setMagneticVariationItem(ValMagneticVariationType target) {
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariation"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticvariationaccuracy")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticvariationaccuracy_nilreason"))
    })
    public ValAngleType getMagneticVariationAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getMagneticVariationAccuracy());
    }

    public void setMagneticVariationAccuracyItem(ValAngleType target) {
        setMagneticVariationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariationAccuracy"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "datemagneticvariation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "datemagneticvariation_nilreason"))
    })
    public DateYearType getDateMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(DateYearType.class, this.getDateMagneticVariation());
    }

    public void setDateMagneticVariationItem(DateYearType target) {
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateMagneticVariation"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticvariationchange")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticvariationchange_nilreason"))
    })
    public ValMagneticVariationChangeType getMagneticVariationChangeItem() {
        return XmlAdapterUtils.unmarshallSource(ValMagneticVariationChangeType.class, this.getMagneticVariationChange());
    }

    public void setMagneticVariationChangeItem(ValMagneticVariationChangeType target) {
        setMagneticVariationChange(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationChangeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariationChange"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencetemperature")),
        @AttributeOverride(name = "uom", column = @Column(name = "referencetemperature_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencetemperature_nilreason"))
    })
    public ValTemperatureType getReferenceTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getReferenceTemperature());
    }

    public void setReferenceTemperatureItem(ValTemperatureType target) {
        setReferenceTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "referenceTemperature"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altimeterchecklocation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altimeterchecklocation_nilreason"))
    })
    public CodeYesNoType getAltimeterCheckLocationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAltimeterCheckLocation());
    }

    public void setAltimeterCheckLocationItem(CodeYesNoType target) {
        setAltimeterCheckLocation(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altimeterCheckLocation"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "secondarypowersupply")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "secondarypowersupply_nilreason"))
    })
    public CodeYesNoType getSecondaryPowerSupplyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSecondaryPowerSupply());
    }

    public void setSecondaryPowerSupplyItem(CodeYesNoType target) {
        setSecondaryPowerSupply(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "secondaryPowerSupply"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "winddirectionindicator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "winddirectionindicator_nilreason"))
    })
    public CodeYesNoType getWindDirectionIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getWindDirectionIndicator());
    }

    public void setWindDirectionIndicatorItem(CodeYesNoType target) {
        setWindDirectionIndicator(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "windDirectionIndicator"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "landingdirectionindicator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "landingdirectionindicator_nilreason"))
    })
    public CodeYesNoType getLandingDirectionIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLandingDirectionIndicator());
    }

    public void setLandingDirectionIndicatorItem(CodeYesNoType target) {
        setLandingDirectionIndicator(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "landingDirectionIndicator"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "transitionaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "transitionaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "transitionaltitude_nilreason"))
    })
    public ValDistanceVerticalType getTransitionAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getTransitionAltitude());
    }

    public void setTransitionAltitudeItem(ValDistanceVerticalType target) {
        setTransitionAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "transitionAltitude"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "transitionlevel")),
        @AttributeOverride(name = "uom", column = @Column(name = "transitionlevel_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "transitionlevel_nilreason"))
    })
    public ValFLType getTransitionLevelItem() {
        return XmlAdapterUtils.unmarshallSource(ValFLType.class, this.getTransitionLevel());
    }

    public void setTransitionLevelItem(ValFLType target) {
        setTransitionLevel(XmlAdapterUtils.marshallJAXBElement(ValFLType.class, new QName("http://www.aixm.aero/schema/5.1.1", "transitionLevel"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowesttemperature")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowesttemperature_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowesttemperature_nilreason"))
    })
    public ValTemperatureType getLowestTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getLowestTemperature());
    }

    public void setLowestTemperatureItem(ValTemperatureType target) {
        setLowestTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowestTemperature"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "abandoned")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "abandoned_nilreason"))
    })
    public CodeYesNoType getAbandonedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAbandoned());
    }

    public void setAbandonedItem(CodeYesNoType target) {
        setAbandoned(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "abandoned"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "certificationdate")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "certificationdate_nilreason"))
    })
    public DateType getCertificationDateItem() {
        return XmlAdapterUtils.unmarshallSource(DateType.class, this.getCertificationDate());
    }

    public void setCertificationDateItem(DateType target) {
        setCertificationDate(XmlAdapterUtils.marshallJAXBElement(DateType.class, new QName("http://www.aixm.aero/schema/5.1.1", "certificationDate"), AirportHeliportTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "certificationexpirationdate")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "certificationexpirationdate_nilreason"))
    })
    public DateType getCertificationExpirationDateItem() {
        return XmlAdapterUtils.unmarshallSource(DateType.class, this.getCertificationExpirationDate());
    }

    public void setCertificationExpirationDateItem(DateType target) {
        setCertificationExpirationDate(XmlAdapterUtils.marshallJAXBElement(DateType.class, new QName("http://www.aixm.aero/schema/5.1.1", "certificationExpirationDate"), AirportHeliportTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportResponsibilityOrganisationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "responsibleorganisation_id", referencedColumnName = "hjid")
    public AirportHeliportResponsibilityOrganisationPropertyType getResponsibleOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportResponsibilityOrganisationPropertyType.class, this.getResponsibleOrganisation());
    }

    public void setResponsibleOrganisationItem(AirportHeliportResponsibilityOrganisationPropertyType target) {
        setResponsibleOrganisation(XmlAdapterUtils.marshallJAXBElement(AirportHeliportResponsibilityOrganisationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "responsibleOrganisation"), AirportHeliportTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "arp_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getARPItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getARP());
    }

    public void setARPItem(AIXMElevatedPointPropertyType target) {
        setARP(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "ARP"), AirportHeliportTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aviationboundary_id", referencedColumnName = "hjid")
    public AIXMElevatedSurfacePropertyType getAviationBoundaryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedSurfacePropertyType.class, this.getAviationBoundary());
    }

    public void setAviationBoundaryItem(AIXMElevatedSurfacePropertyType target) {
        setAviationBoundary(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "aviationBoundary"), AirportHeliportTimeSliceType.class, target));
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
        final AirportHeliportTimeSliceType that = ((AirportHeliportTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<AirportHeliportAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<AirportHeliportAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFieldElevation();
            boolean rhsFieldIsSet = that.isSetFieldElevation();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getFieldElevation();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getFieldElevation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fieldElevation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fieldElevation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetResponsibleOrganisation();
            boolean rhsFieldIsSet = that.isSetResponsibleOrganisation();
            JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> lhsField;
            lhsField = this.getResponsibleOrganisation();
            JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> rhsField;
            rhsField = that.getResponsibleOrganisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "responsibleOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "responsibleOrganisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAixmName();
            boolean rhsFieldIsSet = that.isSetAixmName();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getAixmName();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getAixmName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aixmName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aixmName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContaminant();
            boolean rhsFieldIsSet = that.isSetContaminant();
            List<AirportHeliportContaminationPropertyType> lhsField;
            lhsField = (this.isSetContaminant()?this.getContaminant():null);
            List<AirportHeliportContaminationPropertyType> rhsField;
            rhsField = (that.isSetContaminant()?that.getContaminant():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contaminant", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticVariationAccuracy();
            boolean rhsFieldIsSet = that.isSetMagneticVariationAccuracy();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getMagneticVariationAccuracy();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getMagneticVariationAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticVariationAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticVariationAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransitionLevel();
            boolean rhsFieldIsSet = that.isSetTransitionLevel();
            JAXBElement<ValFLType> lhsField;
            lhsField = this.getTransitionLevel();
            JAXBElement<ValFLType> rhsField;
            rhsField = that.getTransitionLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transitionLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transitionLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirportHeliportExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AirportHeliportExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCertificationExpirationDate();
            boolean rhsFieldIsSet = that.isSetCertificationExpirationDate();
            JAXBElement<DateType> lhsField;
            lhsField = this.getCertificationExpirationDate();
            JAXBElement<DateType> rhsField;
            rhsField = that.getCertificationExpirationDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "certificationExpirationDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "certificationExpirationDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWindDirectionIndicator();
            boolean rhsFieldIsSet = that.isSetWindDirectionIndicator();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getWindDirectionIndicator();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getWindDirectionIndicator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "windDirectionIndicator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "windDirectionIndicator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAirportHeliportType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAirportHeliportType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPrivateUse();
            boolean rhsFieldIsSet = that.isSetPrivateUse();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getPrivateUse();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getPrivateUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "privateUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "privateUse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetControlType();
            boolean rhsFieldIsSet = that.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> lhsField;
            lhsField = this.getControlType();
            JAXBElement<CodeMilitaryOperationsType> rhsField;
            rhsField = that.getControlType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCertificationDate();
            boolean rhsFieldIsSet = that.isSetCertificationDate();
            JAXBElement<DateType> lhsField;
            lhsField = this.getCertificationDate();
            JAXBElement<DateType> rhsField;
            rhsField = that.getCertificationDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "certificationDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "certificationDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeAirportHeliportDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeAirportHeliportDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServedCity();
            boolean rhsFieldIsSet = that.isSetServedCity();
            List<CityPropertyType> lhsField;
            lhsField = (this.isSetServedCity()?this.getServedCity():null);
            List<CityPropertyType> rhsField;
            rhsField = (that.isSetServedCity()?that.getServedCity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "servedCity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "servedCity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateMagneticVariation();
            boolean rhsFieldIsSet = that.isSetDateMagneticVariation();
            JAXBElement<DateYearType> lhsField;
            lhsField = this.getDateMagneticVariation();
            JAXBElement<DateYearType> rhsField;
            rhsField = that.getDateMagneticVariation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateMagneticVariation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateMagneticVariation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltimeterSource();
            boolean rhsFieldIsSet = that.isSetAltimeterSource();
            List<AltimeterSourcePropertyType> lhsField;
            lhsField = (this.isSetAltimeterSource()?this.getAltimeterSource():null);
            List<AltimeterSourcePropertyType> rhsField;
            rhsField = (that.isSetAltimeterSource()?that.getAltimeterSource():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeterSource", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeterSource", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceTemperature();
            boolean rhsFieldIsSet = that.isSetReferenceTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getReferenceTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getReferenceTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceTemperature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationIndicatorICAO();
            boolean rhsFieldIsSet = that.isSetLocationIndicatorICAO();
            JAXBElement<CodeICAOType> lhsField;
            lhsField = this.getLocationIndicatorICAO();
            JAXBElement<CodeICAOType> rhsField;
            rhsField = that.getLocationIndicatorICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationIndicatorICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationIndicatorICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbandoned();
            boolean rhsFieldIsSet = that.isSetAbandoned();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getAbandoned();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getAbandoned();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abandoned", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abandoned", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAviationBoundary();
            boolean rhsFieldIsSet = that.isSetAviationBoundary();
            JAXBElement<AIXMElevatedSurfacePropertyType> lhsField;
            lhsField = this.getAviationBoundary();
            JAXBElement<AIXMElevatedSurfacePropertyType> rhsField;
            rhsField = that.getAviationBoundary();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aviationBoundary", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aviationBoundary", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContact();
            boolean rhsFieldIsSet = that.isSetContact();
            List<ContactInformationPropertyType> lhsField;
            lhsField = (this.isSetContact()?this.getContact():null);
            List<ContactInformationPropertyType> rhsField;
            rhsField = (that.isSetContact()?that.getContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorIATA();
            boolean rhsFieldIsSet = that.isSetDesignatorIATA();
            JAXBElement<CodeIATAType> lhsField;
            lhsField = this.getDesignatorIATA();
            JAXBElement<CodeIATAType> rhsField;
            rhsField = that.getDesignatorIATA();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorIATA", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorIATA", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSecondaryPowerSupply();
            boolean rhsFieldIsSet = that.isSetSecondaryPowerSupply();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSecondaryPowerSupply();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSecondaryPowerSupply();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "secondaryPowerSupply", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "secondaryPowerSupply", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowestTemperature();
            boolean rhsFieldIsSet = that.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getLowestTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getLowestTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowestTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowestTemperature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCertifiedICAO();
            boolean rhsFieldIsSet = that.isSetCertifiedICAO();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getCertifiedICAO();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getCertifiedICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "certifiedICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "certifiedICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticVariation();
            boolean rhsFieldIsSet = that.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> lhsField;
            lhsField = this.getMagneticVariation();
            JAXBElement<ValMagneticVariationType> rhsField;
            rhsField = that.getMagneticVariation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticVariation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticVariation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltimeterCheckLocation();
            boolean rhsFieldIsSet = that.isSetAltimeterCheckLocation();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getAltimeterCheckLocation();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getAltimeterCheckLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeterCheckLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeterCheckLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLandingDirectionIndicator();
            boolean rhsFieldIsSet = that.isSetLandingDirectionIndicator();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLandingDirectionIndicator();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLandingDirectionIndicator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingDirectionIndicator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingDirectionIndicator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetARP();
            boolean rhsFieldIsSet = that.isSetARP();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getARP();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getARP();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arp", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arp", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransitionAltitude();
            boolean rhsFieldIsSet = that.isSetTransitionAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getTransitionAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getTransitionAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transitionAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transitionAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFieldElevationAccuracy();
            boolean rhsFieldIsSet = that.isSetFieldElevationAccuracy();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getFieldElevationAccuracy();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getFieldElevationAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fieldElevationAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fieldElevationAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalDatum();
            boolean rhsFieldIsSet = that.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> lhsField;
            lhsField = this.getVerticalDatum();
            JAXBElement<CodeVerticalDatumType> rhsField;
            rhsField = that.getVerticalDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalDatum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticVariationChange();
            boolean rhsFieldIsSet = that.isSetMagneticVariationChange();
            JAXBElement<ValMagneticVariationChangeType> lhsField;
            lhsField = this.getMagneticVariationChange();
            JAXBElement<ValMagneticVariationChangeType> rhsField;
            rhsField = that.getMagneticVariationChange();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticVariationChange", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticVariationChange", rhsField);
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeAirportHeliportDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationIndicatorICAO();
            JAXBElement<CodeICAOType> theField;
            theField = this.getLocationIndicatorICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationIndicatorICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorIATA();
            JAXBElement<CodeIATAType> theField;
            theField = this.getDesignatorIATA();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorIATA", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAirportHeliportType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertifiedICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCertifiedICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "certifiedICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrivateUse();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPrivateUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "privateUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getControlType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFieldElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getFieldElevation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fieldElevation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFieldElevationAccuracy();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getFieldElevationAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fieldElevationAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> theField;
            theField = this.getVerticalDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> theField;
            theField = this.getMagneticVariation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticVariation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariationAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getMagneticVariationAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticVariationAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateMagneticVariation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariationChange();
            JAXBElement<ValMagneticVariationChangeType> theField;
            theField = this.getMagneticVariationChange();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticVariationChange", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getReferenceTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterCheckLocation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAltimeterCheckLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeterCheckLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSecondaryPowerSupply();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSecondaryPowerSupply();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "secondaryPowerSupply", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWindDirectionIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWindDirectionIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "windDirectionIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingDirectionIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLandingDirectionIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingDirectionIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransitionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getTransitionAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transitionAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransitionLevel();
            JAXBElement<ValFLType> theField;
            theField = this.getTransitionLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transitionLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getLowestTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowestTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbandoned();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAbandoned();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abandoned", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertificationDate();
            JAXBElement<DateType> theField;
            theField = this.getCertificationDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "certificationDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertificationExpirationDate();
            JAXBElement<DateType> theField;
            theField = this.getCertificationExpirationDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "certificationExpirationDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContaminant();
            List<AirportHeliportContaminationPropertyType> theField;
            theField = (this.isSetContaminant()?this.getContaminant():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contaminant", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedCity();
            List<CityPropertyType> theField;
            theField = (this.isSetServedCity()?this.getServedCity():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "servedCity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResponsibleOrganisation();
            JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> theField;
            theField = this.getResponsibleOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "responsibleOrganisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetARP();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getARP();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arp", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAviationBoundary();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getAviationBoundary();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aviationBoundary", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterSource();
            List<AltimeterSourcePropertyType> theField;
            theField = (this.isSetAltimeterSource()?this.getAltimeterSource():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeterSource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<AirportHeliportAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            List<AirportHeliportExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeAirportHeliportDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationIndicatorICAO();
            JAXBElement<CodeICAOType> theField;
            theField = this.getLocationIndicatorICAO();
            strategy.appendField(locator, this, "locationIndicatorICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorIATA();
            JAXBElement<CodeIATAType> theField;
            theField = this.getDesignatorIATA();
            strategy.appendField(locator, this, "designatorIATA", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAirportHeliportType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertifiedICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCertifiedICAO();
            strategy.appendField(locator, this, "certifiedICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrivateUse();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPrivateUse();
            strategy.appendField(locator, this, "privateUse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getControlType();
            strategy.appendField(locator, this, "controlType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFieldElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getFieldElevation();
            strategy.appendField(locator, this, "fieldElevation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFieldElevationAccuracy();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getFieldElevationAccuracy();
            strategy.appendField(locator, this, "fieldElevationAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> theField;
            theField = this.getVerticalDatum();
            strategy.appendField(locator, this, "verticalDatum", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> theField;
            theField = this.getMagneticVariation();
            strategy.appendField(locator, this, "magneticVariation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariationAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getMagneticVariationAccuracy();
            strategy.appendField(locator, this, "magneticVariationAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            strategy.appendField(locator, this, "dateMagneticVariation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariationChange();
            JAXBElement<ValMagneticVariationChangeType> theField;
            theField = this.getMagneticVariationChange();
            strategy.appendField(locator, this, "magneticVariationChange", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getReferenceTemperature();
            strategy.appendField(locator, this, "referenceTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterCheckLocation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAltimeterCheckLocation();
            strategy.appendField(locator, this, "altimeterCheckLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSecondaryPowerSupply();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSecondaryPowerSupply();
            strategy.appendField(locator, this, "secondaryPowerSupply", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWindDirectionIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWindDirectionIndicator();
            strategy.appendField(locator, this, "windDirectionIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingDirectionIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLandingDirectionIndicator();
            strategy.appendField(locator, this, "landingDirectionIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransitionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getTransitionAltitude();
            strategy.appendField(locator, this, "transitionAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransitionLevel();
            JAXBElement<ValFLType> theField;
            theField = this.getTransitionLevel();
            strategy.appendField(locator, this, "transitionLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getLowestTemperature();
            strategy.appendField(locator, this, "lowestTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbandoned();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAbandoned();
            strategy.appendField(locator, this, "abandoned", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertificationDate();
            JAXBElement<DateType> theField;
            theField = this.getCertificationDate();
            strategy.appendField(locator, this, "certificationDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCertificationExpirationDate();
            JAXBElement<DateType> theField;
            theField = this.getCertificationExpirationDate();
            strategy.appendField(locator, this, "certificationExpirationDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContaminant();
            List<AirportHeliportContaminationPropertyType> theField;
            theField = (this.isSetContaminant()?this.getContaminant():null);
            strategy.appendField(locator, this, "contaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedCity();
            List<CityPropertyType> theField;
            theField = (this.isSetServedCity()?this.getServedCity():null);
            strategy.appendField(locator, this, "servedCity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResponsibleOrganisation();
            JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> theField;
            theField = this.getResponsibleOrganisation();
            strategy.appendField(locator, this, "responsibleOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetARP();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getARP();
            strategy.appendField(locator, this, "arp", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAviationBoundary();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getAviationBoundary();
            strategy.appendField(locator, this, "aviationBoundary", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterSource();
            List<AltimeterSourcePropertyType> theField;
            theField = (this.isSetAltimeterSource()?this.getAltimeterSource():null);
            strategy.appendField(locator, this, "altimeterSource", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<AirportHeliportAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirportHeliportExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
