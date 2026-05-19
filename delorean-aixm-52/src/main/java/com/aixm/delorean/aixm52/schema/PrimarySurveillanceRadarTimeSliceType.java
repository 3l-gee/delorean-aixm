
package com.aixm.delorean.aixm52.schema;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

/**
 * <p>
 * Java class for PrimarySurveillanceRadarTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="PrimarySurveillanceRadarTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="serialNumber" type=
"{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="range" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="dualChannel" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="movingTargetIndicator" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="standbyPower" type=
"{http://www.aixm.aero/schema/5.2}CodeStandbyPowerType" minOccurs="0"/>
 *         <element name="digital" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="militaryUseOnly" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="specialUseOnly" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="specialAircraftOnly" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="magneticVariation" type=
"{http://www.aixm.aero/schema/5.2}ValMagneticVariationType" minOccurs="0"/>
 *         <element name="dateMagneticVariation" type=
"{http://www.aixm.aero/schema/5.2}DateYearType" minOccurs="0"/>
 *         <element name="contact" type=
"{http://www.aixm.aero/schema/5.2}ContactInformationPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="verticalCoverageAltitude" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="verticalCoverageDistance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="verticalCoverageAzimuth" type=
"{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="antennaTiltFixed" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="tiltAngle" type=
"{http://www.aixm.aero/schema/5.2}ValAngleType" minOccurs="0"/>
 *         <element name="automatedRadarTerminalSystem" type=
"{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="groundStation" type=
"{http://www.aixm.aero/schema/5.2}SurveillanceGroundStationPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodePrimaryRadarType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractPrimarySurveillanceRadarExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSurveillanceRadarExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractRadarEquipmentExtension"/>
 *                 </choice>
 *                 <attGroup ref=
"{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
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
@XmlType(name = "PrimarySurveillanceRadarTimeSliceType", propOrder = {"aixmName", "serialNumber", "range",
        "dualChannel", "movingTargetIndicator", "standbyPower", "digital", "militaryUseOnly", "specialUseOnly",
        "specialAircraftOnly", "magneticVariation", "dateMagneticVariation", "contact", "location", "annotation",
        "verticalCoverageAltitude", "verticalCoverageDistance", "verticalCoverageAzimuth", "antennaTiltFixed",
        "tiltAngle", "automatedRadarTerminalSystem", "groundStation", "type", "extension"})
@Entity(name = "PrimarySurveillanceRadarTimeSliceType")
@Table(name = "primarysurveillanceradar_t", schema = "surveillance")
public class PrimarySurveillanceRadarTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "serialNumber", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> serialNumber;
    @XmlElementRef(name = "range", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> range;
    @XmlElementRef(name = "dualChannel", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dualChannel;
    @XmlElementRef(name = "movingTargetIndicator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> movingTargetIndicator;
    @XmlElementRef(name = "standbyPower", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStandbyPowerType> standbyPower;
    @XmlElementRef(name = "digital", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> digital;
    @XmlElementRef(name = "militaryUseOnly", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> militaryUseOnly;
    @XmlElementRef(name = "specialUseOnly", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialUseOnly;
    @XmlElementRef(name = "specialAircraftOnly", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAircraftOnly;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "verticalCoverageAltitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> verticalCoverageAltitude;
    @XmlElementRef(name = "verticalCoverageDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalCoverageDistance;
    @XmlElementRef(name = "verticalCoverageAzimuth", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> verticalCoverageAzimuth;
    @XmlElementRef(name = "antennaTiltFixed", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> antennaTiltFixed;
    @XmlElementRef(name = "tiltAngle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> tiltAngle;
    @XmlElementRef(name = "automatedRadarTerminalSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> automatedRadarTerminalSystem;
    @XmlElement(nillable = true)
    protected List<SurveillanceGroundStationPropertyType> groundStation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePrimaryRadarType> type;
    protected List<PrimarySurveillanceRadarExtensionType> extension;

    /**
     * Gets the value of the aixmName property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNameType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNameType
     *            }{@code >}
     *
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName != null);
    }

    /**
     * Gets the value of the serialNumber property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextDesignatorType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setSerialNumber(JAXBElement<TextDesignatorType> value) {
        this.serialNumber = value;
    }

    @Transient
    public boolean isSetSerialNumber() {
        return (this.serialNumber != null);
    }

    /**
     * Gets the value of the range property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setRange(JAXBElement<ValDistanceType> value) {
        this.range = value;
    }

    @Transient
    public boolean isSetRange() {
        return (this.range != null);
    }

    /**
     * Gets the value of the dualChannel property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setDualChannel(JAXBElement<CodeYesNoType> value) {
        this.dualChannel = value;
    }

    @Transient
    public boolean isSetDualChannel() {
        return (this.dualChannel != null);
    }

    /**
     * Gets the value of the movingTargetIndicator property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setMovingTargetIndicator(JAXBElement<CodeYesNoType> value) {
        this.movingTargetIndicator = value;
    }

    @Transient
    public boolean isSetMovingTargetIndicator() {
        return (this.movingTargetIndicator != null);
    }

    /**
     * Gets the value of the standbyPower property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeStandbyPowerType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeStandbyPowerType }{@code >}
     *
     */
    public void setStandbyPower(JAXBElement<CodeStandbyPowerType> value) {
        this.standbyPower = value;
    }

    @Transient
    public boolean isSetStandbyPower() {
        return (this.standbyPower != null);
    }

    /**
     * Gets the value of the digital property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setDigital(JAXBElement<CodeYesNoType> value) {
        this.digital = value;
    }

    @Transient
    public boolean isSetDigital() {
        return (this.digital != null);
    }

    /**
     * Gets the value of the militaryUseOnly property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setMilitaryUseOnly(JAXBElement<CodeYesNoType> value) {
        this.militaryUseOnly = value;
    }

    @Transient
    public boolean isSetMilitaryUseOnly() {
        return (this.militaryUseOnly != null);
    }

    /**
     * Gets the value of the specialUseOnly property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setSpecialUseOnly(JAXBElement<CodeYesNoType> value) {
        this.specialUseOnly = value;
    }

    @Transient
    public boolean isSetSpecialUseOnly() {
        return (this.specialUseOnly != null);
    }

    /**
     * Gets the value of the specialAircraftOnly property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setSpecialAircraftOnly(JAXBElement<CodeYesNoType> value) {
        this.specialAircraftOnly = value;
    }

    @Transient
    public boolean isSetSpecialAircraftOnly() {
        return (this.specialAircraftOnly != null);
    }

    /**
     * Gets the value of the magneticVariation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValMagneticVariationType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValMagneticVariationType }{@code >}
     *
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    @Transient
    public boolean isSetMagneticVariation() {
        return (this.magneticVariation != null);
    }

    /**
     * Gets the value of the dateMagneticVariation property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link DateYearType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link DateYearType
     *            }{@code >}
     *
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    @Transient
    public boolean isSetDateMagneticVariation() {
        return (this.dateMagneticVariation != null);
    }

    /**
     * Gets the value of the contact property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the contact property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getContact().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "prmrsrvllncrdrtmslctp_cntct_link", schema = "surveillance", joinColumns = {
            @JoinColumn(name = "primarysurveillanceradar_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "contact_hjid", referencedColumnName = "hjid")})
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
        return ((this.contact != null) && (!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location != null);
    }

    /**
     * Gets the value of the annotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the annotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "prmrsrvllncrdrtmslctp_annttn_link", schema = "surveillance", joinColumns = {
            @JoinColumn(name = "primarysurveillanceradar_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")})
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
        return ((this.annotation != null) && (!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the verticalCoverageAltitude property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getVerticalCoverageAltitude() {
        return verticalCoverageAltitude;
    }

    /**
     * Sets the value of the verticalCoverageAltitude property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setVerticalCoverageAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.verticalCoverageAltitude = value;
    }

    @Transient
    public boolean isSetVerticalCoverageAltitude() {
        return (this.verticalCoverageAltitude != null);
    }

    /**
     * Gets the value of the verticalCoverageDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getVerticalCoverageDistance() {
        return verticalCoverageDistance;
    }

    /**
     * Sets the value of the verticalCoverageDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setVerticalCoverageDistance(JAXBElement<ValDistanceType> value) {
        this.verticalCoverageDistance = value;
    }

    @Transient
    public boolean isSetVerticalCoverageDistance() {
        return (this.verticalCoverageDistance != null);
    }

    /**
     * Gets the value of the verticalCoverageAzimuth property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValBearingType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValBearingType> getVerticalCoverageAzimuth() {
        return verticalCoverageAzimuth;
    }

    /**
     * Sets the value of the verticalCoverageAzimuth property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValBearingType }{@code >}
     *
     */
    public void setVerticalCoverageAzimuth(JAXBElement<ValBearingType> value) {
        this.verticalCoverageAzimuth = value;
    }

    @Transient
    public boolean isSetVerticalCoverageAzimuth() {
        return (this.verticalCoverageAzimuth != null);
    }

    /**
     * Gets the value of the antennaTiltFixed property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getAntennaTiltFixed() {
        return antennaTiltFixed;
    }

    /**
     * Sets the value of the antennaTiltFixed property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setAntennaTiltFixed(JAXBElement<CodeYesNoType> value) {
        this.antennaTiltFixed = value;
    }

    @Transient
    public boolean isSetAntennaTiltFixed() {
        return (this.antennaTiltFixed != null);
    }

    /**
     * Gets the value of the tiltAngle property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValAngleType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValAngleType> getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Sets the value of the tiltAngle property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link ValAngleType
     *            }{@code >}
     *
     */
    public void setTiltAngle(JAXBElement<ValAngleType> value) {
        this.tiltAngle = value;
    }

    @Transient
    public boolean isSetTiltAngle() {
        return (this.tiltAngle != null);
    }

    /**
     * Gets the value of the automatedRadarTerminalSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextDesignatorType> getAutomatedRadarTerminalSystem() {
        return automatedRadarTerminalSystem;
    }

    /**
     * Sets the value of the automatedRadarTerminalSystem property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setAutomatedRadarTerminalSystem(JAXBElement<TextDesignatorType> value) {
        this.automatedRadarTerminalSystem = value;
    }

    @Transient
    public boolean isSetAutomatedRadarTerminalSystem() {
        return (this.automatedRadarTerminalSystem != null);
    }

    /**
     * Gets the value of the groundStation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the groundStation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getGroundStation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveillanceGroundStationPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SurveillanceGroundStationPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "prmrsrvllncrdrtmslctp_grndsttn_link", schema = "surveillance", joinColumns = {
            @JoinColumn(name = "primarysurveillanceradar_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "groundstation_hjid", referencedColumnName = "hjid")})
    public List<SurveillanceGroundStationPropertyType> getGroundStation() {
        if (groundStation == null) {
            groundStation = new ArrayList<>();
        }
        return this.groundStation;
    }

    /**
     *
     *
     */
    public void setGroundStation(List<SurveillanceGroundStationPropertyType> groundStation) {
        this.groundStation = groundStation;
    }

    @Transient
    public boolean isSetGroundStation() {
        return ((this.groundStation != null) && (!this.groundStation.isEmpty()));
    }

    public void unsetGroundStation() {
        this.groundStation = null;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePrimaryRadarType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePrimaryRadarType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePrimaryRadarType }{@code >}
     *
     */
    public void setType(JAXBElement<CodePrimaryRadarType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimarySurveillanceRadarExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = PrimarySurveillanceRadarExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "primarysurveillanceradare_hjid", referencedColumnName = "hjid")
    public List<PrimarySurveillanceRadarExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<PrimarySurveillanceRadarExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "name", columnDefinition = "VARCHAR", length = 60)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "namenilreason"))})
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class,
                new QName("http://www.aixm.aero/schema/5.2", "name"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "serialnumber", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "serialnumbernilreason"))})
    public TextDesignatorType getSerialNumberItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getSerialNumber());
    }

    public void setSerialNumberItem(TextDesignatorType target) {
        setSerialNumber(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "serialNumber"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "range", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "rangeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "rangeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "rangenilreason"))})
    public ValDistanceType getRangeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRange());
    }

    public void setRangeItem(ValDistanceType target) {
        setRange(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "range"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "dualchannel")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "dualchannelnilreason"))})
    public CodeYesNoType getDualChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDualChannel());
    }

    public void setDualChannelItem(CodeYesNoType target) {
        setDualChannel(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "dualChannel"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "movingtargetindicator")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "movingtargetindicatornilreason"))})
    public CodeYesNoType getMovingTargetIndicatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMovingTargetIndicator());
    }

    public void setMovingTargetIndicatorItem(CodeYesNoType target) {
        setMovingTargetIndicator(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "movingTargetIndicator"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "standbypower")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "standbypowernilreason"))})
    public CodeStandbyPowerType getStandbyPowerItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStandbyPowerType.class, this.getStandbyPower());
    }

    public void setStandbyPowerItem(CodeStandbyPowerType target) {
        setStandbyPower(XmlAdapterUtils.marshallJAXBElement(CodeStandbyPowerType.class,
                new QName("http://www.aixm.aero/schema/5.2", "standbyPower"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "digital")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "digitalnilreason"))})
    public CodeYesNoType getDigitalItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDigital());
    }

    public void setDigitalItem(CodeYesNoType target) {
        setDigital(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "digital"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "militaryuseonly")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "militaryuseonlynilreason"))})
    public CodeYesNoType getMilitaryUseOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMilitaryUseOnly());
    }

    public void setMilitaryUseOnlyItem(CodeYesNoType target) {
        setMilitaryUseOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "militaryUseOnly"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "specialuseonly")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "specialuseonlynilreason"))})
    public CodeYesNoType getSpecialUseOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialUseOnly());
    }

    public void setSpecialUseOnlyItem(CodeYesNoType target) {
        setSpecialUseOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "specialUseOnly"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "specialaircraftonly")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "specialaircraftonlynilreason"))})
    public CodeYesNoType getSpecialAircraftOnlyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialAircraftOnly());
    }

    public void setSpecialAircraftOnlyItem(CodeYesNoType target) {
        setSpecialAircraftOnly(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "specialAircraftOnly"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "magneticvariation", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "magneticvariationnilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "magneticvariationaccuracy"))})
    public ValMagneticVariationType getMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(ValMagneticVariationType.class, this.getMagneticVariation());
    }

    public void setMagneticVariationItem(ValMagneticVariationType target) {
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "magneticVariation"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "datemagneticvariation", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "datemagneticvariationnilreason"))})
    public DateYearType getDateMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(DateYearType.class, this.getDateMagneticVariation());
    }

    public void setDateMagneticVariationItem(DateYearType target) {
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class,
                new QName("http://www.aixm.aero/schema/5.2", "dateMagneticVariation"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "prmrsrvllncrdrtmslctp_lctn_link", schema = "surveillance", joinColumns = {
            @JoinColumn(name = "primarysurveillanceradar_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "verticalcoveragealtitude", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "verticalcoveragealtitudeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "verticalcoveragealtitudeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "verticalcoveragealtitudenilreason"))})
    public ValDistanceVerticalType getVerticalCoverageAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getVerticalCoverageAltitude());
    }

    public void setVerticalCoverageAltitudeItem(ValDistanceVerticalType target) {
        setVerticalCoverageAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "verticalCoverageAltitude"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "verticalcoveragedistance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "verticalcoveragedistanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "verticalcoveragedistanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "verticalcoveragedistancenilreason"))})
    public ValDistanceType getVerticalCoverageDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVerticalCoverageDistance());
    }

    public void setVerticalCoverageDistanceItem(ValDistanceType target) {
        setVerticalCoverageDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "verticalCoverageDistance"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "verticalcoverageazimuth", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "verticalcoverageazimuthnilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "verticalcoverageazimuthaccuracy"))})
    public ValBearingType getVerticalCoverageAzimuthItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getVerticalCoverageAzimuth());
    }

    public void setVerticalCoverageAzimuthItem(ValBearingType target) {
        setVerticalCoverageAzimuth(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class,
                new QName("http://www.aixm.aero/schema/5.2", "verticalCoverageAzimuth"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "antennatiltfixed")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "antennatiltfixednilreason"))})
    public CodeYesNoType getAntennaTiltFixedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAntennaTiltFixed());
    }

    public void setAntennaTiltFixedItem(CodeYesNoType target) {
        setAntennaTiltFixed(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "antennaTiltFixed"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "tiltangle", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "tiltanglenilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "tiltangleaccuracy"))})
    public ValAngleType getTiltAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getTiltAngle());
    }

    public void setTiltAngleItem(ValAngleType target) {
        setTiltAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "tiltAngle"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "automatedradarterminalsystem", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "automatedradarterminalsystemnilreason"))})
    public TextDesignatorType getAutomatedRadarTerminalSystemItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getAutomatedRadarTerminalSystem());
    }

    public void setAutomatedRadarTerminalSystemItem(TextDesignatorType target) {
        setAutomatedRadarTerminalSystem(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "automatedRadarTerminalSystem"),
                PrimarySurveillanceRadarTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodePrimaryRadarType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodePrimaryRadarType.class, this.getType());
    }

    public void setTypeItem(CodePrimaryRadarType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodePrimaryRadarType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), PrimarySurveillanceRadarTimeSliceType.class,
                target));
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PrimarySurveillanceRadarTimeSliceType that = ((PrimarySurveillanceRadarTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetContact();
            boolean rhsFieldIsSet = that.isSetContact();
            List<ContactInformationPropertyType> lhsField;
            lhsField = (this.isSetContact() ? this.getContact() : null);
            List<ContactInformationPropertyType> rhsField;
            rhsField = (that.isSetContact() ? that.getContact() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
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
            boolean lhsFieldIsSet = this.isSetVerticalCoverageAzimuth();
            boolean rhsFieldIsSet = that.isSetVerticalCoverageAzimuth();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getVerticalCoverageAzimuth();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getVerticalCoverageAzimuth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCoverageAzimuth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCoverageAzimuth", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGroundStation();
            boolean rhsFieldIsSet = that.isSetGroundStation();
            List<SurveillanceGroundStationPropertyType> lhsField;
            lhsField = (this.isSetGroundStation() ? this.getGroundStation() : null);
            List<SurveillanceGroundStationPropertyType> rhsField;
            rhsField = (that.isSetGroundStation() ? that.getGroundStation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "groundStation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "groundStation", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAutomatedRadarTerminalSystem();
            boolean rhsFieldIsSet = that.isSetAutomatedRadarTerminalSystem();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getAutomatedRadarTerminalSystem();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getAutomatedRadarTerminalSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "automatedRadarTerminalSystem",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "automatedRadarTerminalSystem",
                    rhsField);
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
            boolean lhsFieldIsSet = this.isSetVerticalCoverageDistance();
            boolean rhsFieldIsSet = that.isSetVerticalCoverageDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVerticalCoverageDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVerticalCoverageDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCoverageDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCoverageDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalCoverageAltitude();
            boolean rhsFieldIsSet = that.isSetVerticalCoverageAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getVerticalCoverageAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getVerticalCoverageAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCoverageAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCoverageAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PrimarySurveillanceRadarExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<PrimarySurveillanceRadarExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation() ? that.getAnnotation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAntennaTiltFixed();
            boolean rhsFieldIsSet = that.isSetAntennaTiltFixed();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getAntennaTiltFixed();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getAntennaTiltFixed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "antennaTiltFixed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "antennaTiltFixed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodePrimaryRadarType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodePrimaryRadarType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTiltAngle();
            boolean rhsFieldIsSet = that.isSetTiltAngle();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getTiltAngle();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getTiltAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tiltAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tiltAngle", rhsField);
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
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateMagneticVariation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact() ? this.getContact() : null);
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
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getVerticalCoverageAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCoverageAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalCoverageDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCoverageDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageAzimuth();
            JAXBElement<ValBearingType> theField;
            theField = this.getVerticalCoverageAzimuth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCoverageAzimuth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntennaTiltFixed();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAntennaTiltFixed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "antennaTiltFixed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTiltAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getTiltAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tiltAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAutomatedRadarTerminalSystem();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getAutomatedRadarTerminalSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "automatedRadarTerminalSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundStation();
            List<SurveillanceGroundStationPropertyType> theField;
            theField = (this.isSetGroundStation() ? this.getGroundStation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "groundStation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodePrimaryRadarType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PrimarySurveillanceRadarExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
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
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            strategy.appendField(locator, this, "dateMagneticVariation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact() ? this.getContact() : null);
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
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getVerticalCoverageAltitude();
            strategy.appendField(locator, this, "verticalCoverageAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalCoverageDistance();
            strategy.appendField(locator, this, "verticalCoverageDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCoverageAzimuth();
            JAXBElement<ValBearingType> theField;
            theField = this.getVerticalCoverageAzimuth();
            strategy.appendField(locator, this, "verticalCoverageAzimuth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntennaTiltFixed();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAntennaTiltFixed();
            strategy.appendField(locator, this, "antennaTiltFixed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTiltAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getTiltAngle();
            strategy.appendField(locator, this, "tiltAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAutomatedRadarTerminalSystem();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getAutomatedRadarTerminalSystem();
            strategy.appendField(locator, this, "automatedRadarTerminalSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundStation();
            List<SurveillanceGroundStationPropertyType> theField;
            theField = (this.isSetGroundStation() ? this.getGroundStation() : null);
            strategy.appendField(locator, this, "groundStation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodePrimaryRadarType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PrimarySurveillanceRadarExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
