
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for PrecisionApproachRadarTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrecisionApproachRadarTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}PrecisionApproachRadarPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPrecisionApproachRadarExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadarEquipmentExtension"/>
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
@XmlType(name = "PrecisionApproachRadarTimeSliceType", propOrder = {
    "aixmName",
    "serialNumber",
    "range",
    "rangeAccuracy",
    "dualChannel",
    "movingTargetIndicator",
    "standbyPower",
    "digital",
    "militaryUseOnly",
    "specialUseOnly",
    "specialAircraftOnly",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "contact",
    "location",
    "annotation",
    "precisionApproachRadarType",
    "slope",
    "slopeAccuracy",
    "reflector",
    "extension"
})
@Entity(name = "PrecisionApproachRadarTimeSliceType")
@Table(name = "precisionapproachradar_ts", schema = "surveillance")
public class PrecisionApproachRadarTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "serialNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> serialNumber;
    @XmlElementRef(name = "range", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> range;
    @XmlElementRef(name = "rangeAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> rangeAccuracy;
    @XmlElementRef(name = "dualChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dualChannel;
    @XmlElementRef(name = "movingTargetIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> movingTargetIndicator;
    @XmlElementRef(name = "standbyPower", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStandbyPowerType> standbyPower;
    @XmlElementRef(name = "digital", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> digital;
    @XmlElementRef(name = "militaryUseOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> militaryUseOnly;
    @XmlElementRef(name = "specialUseOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialUseOnly;
    @XmlElementRef(name = "specialAircraftOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAircraftOnly;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "precisionApproachRadarType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePARType> precisionApproachRadarType;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slope;
    @XmlElementRef(name = "slopeAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopeAccuracy;
    @XmlElement(nillable = true)
    protected List<ReflectorPropertyType> reflector;
    protected List<PrecisionApproachRadarExtensionType> extension;

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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<TextDesignatorType> value) {
        this.serialNumber = value;
    }

    @Transient
    public boolean isSetSerialNumber() {
        return (this.serialNumber!= null);
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRange(JAXBElement<ValDistanceType> value) {
        this.range = value;
    }

    @Transient
    public boolean isSetRange() {
        return (this.range!= null);
    }

    /**
     * Gets the value of the rangeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getRangeAccuracy() {
        return rangeAccuracy;
    }

    /**
     * Sets the value of the rangeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRangeAccuracy(JAXBElement<ValDistanceType> value) {
        this.rangeAccuracy = value;
    }

    @Transient
    public boolean isSetRangeAccuracy() {
        return (this.rangeAccuracy!= null);
    }

    /**
     * Gets the value of the dualChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDualChannel() {
        return dualChannel;
    }

    /**
     * Sets the value of the dualChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDualChannel(JAXBElement<CodeYesNoType> value) {
        this.dualChannel = value;
    }

    @Transient
    public boolean isSetDualChannel() {
        return (this.dualChannel!= null);
    }

    /**
     * Gets the value of the movingTargetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMovingTargetIndicator() {
        return movingTargetIndicator;
    }

    /**
     * Sets the value of the movingTargetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMovingTargetIndicator(JAXBElement<CodeYesNoType> value) {
        this.movingTargetIndicator = value;
    }

    @Transient
    public boolean isSetMovingTargetIndicator() {
        return (this.movingTargetIndicator!= null);
    }

    /**
     * Gets the value of the standbyPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeStandbyPowerType> getStandbyPower() {
        return standbyPower;
    }

    /**
     * Sets the value of the standbyPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    public void setStandbyPower(JAXBElement<CodeStandbyPowerType> value) {
        this.standbyPower = value;
    }

    @Transient
    public boolean isSetStandbyPower() {
        return (this.standbyPower!= null);
    }

    /**
     * Gets the value of the digital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDigital() {
        return digital;
    }

    /**
     * Sets the value of the digital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDigital(JAXBElement<CodeYesNoType> value) {
        this.digital = value;
    }

    @Transient
    public boolean isSetDigital() {
        return (this.digital!= null);
    }

    /**
     * Gets the value of the militaryUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMilitaryUseOnly() {
        return militaryUseOnly;
    }

    /**
     * Sets the value of the militaryUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMilitaryUseOnly(JAXBElement<CodeYesNoType> value) {
        this.militaryUseOnly = value;
    }

    @Transient
    public boolean isSetMilitaryUseOnly() {
        return (this.militaryUseOnly!= null);
    }

    /**
     * Gets the value of the specialUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSpecialUseOnly() {
        return specialUseOnly;
    }

    /**
     * Sets the value of the specialUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialUseOnly(JAXBElement<CodeYesNoType> value) {
        this.specialUseOnly = value;
    }

    @Transient
    public boolean isSetSpecialUseOnly() {
        return (this.specialUseOnly!= null);
    }

    /**
     * Gets the value of the specialAircraftOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSpecialAircraftOnly() {
        return specialAircraftOnly;
    }

    /**
     * Sets the value of the specialAircraftOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialAircraftOnly(JAXBElement<CodeYesNoType> value) {
        this.specialAircraftOnly = value;
    }

    @Transient
    public boolean isSetSpecialAircraftOnly() {
        return (this.specialAircraftOnly!= null);
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
    @JoinTable(name = "contact_precisionapproachradar_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "contact", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "precisionapproachradarpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location!= null);
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
    @JoinTable(name = "annotation_precisionapproachradar_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "precisionapproachradarpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the precisionApproachRadarType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePARType> getPrecisionApproachRadarType() {
        return precisionApproachRadarType;
    }

    /**
     * Sets the value of the precisionApproachRadarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    public void setPrecisionApproachRadarType(JAXBElement<CodePARType> value) {
        this.precisionApproachRadarType = value;
    }

    @Transient
    public boolean isSetPrecisionApproachRadarType() {
        return (this.precisionApproachRadarType!= null);
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValAngleType> value) {
        this.slope = value;
    }

    @Transient
    public boolean isSetSlope() {
        return (this.slope!= null);
    }

    /**
     * Gets the value of the slopeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getSlopeAccuracy() {
        return slopeAccuracy;
    }

    /**
     * Sets the value of the slopeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopeAccuracy(JAXBElement<ValAngleType> value) {
        this.slopeAccuracy = value;
    }

    @Transient
    public boolean isSetSlopeAccuracy() {
        return (this.slopeAccuracy!= null);
    }

    /**
     * Gets the value of the reflector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectorPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ReflectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "reflector_precisionapproachradar_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "reflector", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "precisionapproachradarpropertygroup", referencedColumnName = "hjid")
    })
    public List<ReflectorPropertyType> getReflector() {
        if (reflector == null) {
            reflector = new ArrayList<>();
        }
        return this.reflector;
    }

    /**
     * 
     * 
     */
    public void setReflector(List<ReflectorPropertyType> reflector) {
        this.reflector = reflector;
    }

    @Transient
    public boolean isSetReflector() {
        return ((this.reflector!= null)&&(!this.reflector.isEmpty()));
    }

    public void unsetReflector() {
        this.reflector = null;
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
     * {@link PrecisionApproachRadarExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = PrecisionApproachRadarExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<PrecisionApproachRadarExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<PrecisionApproachRadarExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "serialnumber")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "serialnumber_nilreason"))
    })
    public TextDesignatorType getSerialNumberItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getSerialNumber());
    }

    public void setSerialNumberItem(TextDesignatorType target) {
        setSerialNumber(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "serialNumber"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "range")),
        @AttributeOverride(name = "uom", column = @Column(name = "range_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "range_nilreason"))
    })
    public ValDistanceType getRangeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRange());
    }

    public void setRangeItem(ValDistanceType target) {
        setRange(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "range"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "rangeaccuracy")),
        @AttributeOverride(name = "uom", column = @Column(name = "rangeaccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rangeaccuracy_nilreason"))
    })
    public ValDistanceType getRangeAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRangeAccuracy());
    }

    public void setRangeAccuracyItem(ValDistanceType target) {
        setRangeAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rangeAccuracy"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "dualchannel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "dualchannel_nilreason"))
    })
    public CodeYesNoType getDualChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDualChannel());
    }

    public void setDualChannelItem(CodeYesNoType target) {
        setDualChannel(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dualChannel"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "movingtargetindicator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "movingtargetindicator_nilreason"))
    })
    public CodeYesNoType getMovingTargetIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMovingTargetIndicator());
    }

    public void setMovingTargetIndicatorItem(CodeYesNoType target) {
        setMovingTargetIndicator(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "movingTargetIndicator"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "standbypower")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "standbypower_nilreason"))
    })
    public CodeStandbyPowerType getStandbyPowerItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStandbyPowerType.class, this.getStandbyPower());
    }

    public void setStandbyPowerItem(CodeStandbyPowerType target) {
        setStandbyPower(XmlAdapterUtils.marshallJAXBElement(CodeStandbyPowerType.class, new QName("http://www.aixm.aero/schema/5.1.1", "standbyPower"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "digital")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "digital_nilreason"))
    })
    public CodeYesNoType getDigitalItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDigital());
    }

    public void setDigitalItem(CodeYesNoType target) {
        setDigital(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "digital"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "militaryuseonly")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "militaryuseonly_nilreason"))
    })
    public CodeYesNoType getMilitaryUseOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMilitaryUseOnly());
    }

    public void setMilitaryUseOnlyItem(CodeYesNoType target) {
        setMilitaryUseOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "militaryUseOnly"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "specialuseonly")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "specialuseonly_nilreason"))
    })
    public CodeYesNoType getSpecialUseOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialUseOnly());
    }

    public void setSpecialUseOnlyItem(CodeYesNoType target) {
        setSpecialUseOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "specialUseOnly"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "specialaircraftonly")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "specialaircraftonly_nilreason"))
    })
    public CodeYesNoType getSpecialAircraftOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialAircraftOnly());
    }

    public void setSpecialAircraftOnlyItem(CodeYesNoType target) {
        setSpecialAircraftOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "specialAircraftOnly"), PrecisionApproachRadarTimeSliceType.class, target));
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
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariation"), PrecisionApproachRadarTimeSliceType.class, target));
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
        setMagneticVariationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariationAccuracy"), PrecisionApproachRadarTimeSliceType.class, target));
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
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateMagneticVariation"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "precisionapproachradartype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "precisionapproachradartype_nilreason"))
    })
    public CodePARType getPrecisionApproachRadarTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodePARType.class, this.getPrecisionApproachRadarType());
    }

    public void setPrecisionApproachRadarTypeItem(CodePARType target) {
        setPrecisionApproachRadarType(XmlAdapterUtils.marshallJAXBElement(CodePARType.class, new QName("http://www.aixm.aero/schema/5.1.1", "precisionApproachRadarType"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slope")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slope_nilreason"))
    })
    public ValAngleType getSlopeItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getSlope());
    }

    public void setSlopeItem(ValAngleType target) {
        setSlope(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slope"), PrecisionApproachRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopeaccuracy")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopeaccuracy_nilreason"))
    })
    public ValAngleType getSlopeAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getSlopeAccuracy());
    }

    public void setSlopeAccuracyItem(ValAngleType target) {
        setSlopeAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slopeAccuracy"), PrecisionApproachRadarTimeSliceType.class, target));
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
        final PrecisionApproachRadarTimeSliceType that = ((PrecisionApproachRadarTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSpecialAircraftOnly();
            boolean rhsFieldIsSet = that.isSetSpecialAircraftOnly();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSpecialAircraftOnly();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSpecialAircraftOnly();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialAircraftOnly", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialAircraftOnly", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSpecialUseOnly();
            boolean rhsFieldIsSet = that.isSetSpecialUseOnly();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSpecialUseOnly();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSpecialUseOnly();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialUseOnly", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialUseOnly", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMovingTargetIndicator();
            boolean rhsFieldIsSet = that.isSetMovingTargetIndicator();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMovingTargetIndicator();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMovingTargetIndicator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "movingTargetIndicator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "movingTargetIndicator", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPrecisionApproachRadarType();
            boolean rhsFieldIsSet = that.isSetPrecisionApproachRadarType();
            JAXBElement<CodePARType> lhsField;
            lhsField = this.getPrecisionApproachRadarType();
            JAXBElement<CodePARType> rhsField;
            rhsField = that.getPrecisionApproachRadarType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "precisionApproachRadarType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "precisionApproachRadarType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStandbyPower();
            boolean rhsFieldIsSet = that.isSetStandbyPower();
            JAXBElement<CodeStandbyPowerType> lhsField;
            lhsField = this.getStandbyPower();
            JAXBElement<CodeStandbyPowerType> rhsField;
            rhsField = that.getStandbyPower();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "standbyPower", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "standbyPower", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSerialNumber();
            boolean rhsFieldIsSet = that.isSetSerialNumber();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getSerialNumber();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getSerialNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serialNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serialNumber", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSlopeAccuracy();
            boolean rhsFieldIsSet = that.isSetSlopeAccuracy();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getSlopeAccuracy();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getSlopeAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slopeAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slopeAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReflector();
            boolean rhsFieldIsSet = that.isSetReflector();
            List<ReflectorPropertyType> lhsField;
            lhsField = (this.isSetReflector()?this.getReflector():null);
            List<ReflectorPropertyType> rhsField;
            rhsField = (that.isSetReflector()?that.getReflector():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reflector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reflector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRange();
            boolean rhsFieldIsSet = that.isSetRange();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRange();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRange();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "range", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "range", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryUseOnly();
            boolean rhsFieldIsSet = that.isSetMilitaryUseOnly();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMilitaryUseOnly();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMilitaryUseOnly();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryUseOnly", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryUseOnly", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDigital();
            boolean rhsFieldIsSet = that.isSetDigital();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDigital();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDigital();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "digital", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "digital", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRangeAccuracy();
            boolean rhsFieldIsSet = that.isSetRangeAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRangeAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRangeAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rangeAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rangeAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDualChannel();
            boolean rhsFieldIsSet = that.isSetDualChannel();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDualChannel();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDualChannel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dualChannel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dualChannel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlope();
            boolean rhsFieldIsSet = that.isSetSlope();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getSlope();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getSlope();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PrecisionApproachRadarExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<PrecisionApproachRadarExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSerialNumber();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getSerialNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serialNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRange();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "range", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRangeAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRangeAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rangeAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDualChannel();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDualChannel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dualChannel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMovingTargetIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMovingTargetIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "movingTargetIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandbyPower();
            JAXBElement<CodeStandbyPowerType> theField;
            theField = this.getStandbyPower();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "standbyPower", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDigital();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDigital();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "digital", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryUseOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMilitaryUseOnly();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryUseOnly", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialUseOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialUseOnly();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialUseOnly", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialAircraftOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialAircraftOnly();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialAircraftOnly", theField);
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
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
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
            boolean theFieldIsSet = this.isSetPrecisionApproachRadarType();
            JAXBElement<CodePARType> theField;
            theField = this.getPrecisionApproachRadarType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "precisionApproachRadarType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlope();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopeAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slopeAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReflector();
            List<ReflectorPropertyType> theField;
            theField = (this.isSetReflector()?this.getReflector():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reflector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PrecisionApproachRadarExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSerialNumber();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRange();
            strategy.appendField(locator, this, "range", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRangeAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRangeAccuracy();
            strategy.appendField(locator, this, "rangeAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDualChannel();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDualChannel();
            strategy.appendField(locator, this, "dualChannel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMovingTargetIndicator();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMovingTargetIndicator();
            strategy.appendField(locator, this, "movingTargetIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandbyPower();
            JAXBElement<CodeStandbyPowerType> theField;
            theField = this.getStandbyPower();
            strategy.appendField(locator, this, "standbyPower", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDigital();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDigital();
            strategy.appendField(locator, this, "digital", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryUseOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMilitaryUseOnly();
            strategy.appendField(locator, this, "militaryUseOnly", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialUseOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialUseOnly();
            strategy.appendField(locator, this, "specialUseOnly", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialAircraftOnly();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialAircraftOnly();
            strategy.appendField(locator, this, "specialAircraftOnly", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrecisionApproachRadarType();
            JAXBElement<CodePARType> theField;
            theField = this.getPrecisionApproachRadarType();
            strategy.appendField(locator, this, "precisionApproachRadarType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlope();
            strategy.appendField(locator, this, "slope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopeAccuracy();
            strategy.appendField(locator, this, "slopeAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReflector();
            List<ReflectorPropertyType> theField;
            theField = (this.isSetReflector()?this.getReflector():null);
            strategy.appendField(locator, this, "reflector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PrecisionApproachRadarExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
