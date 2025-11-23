
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
 * <p>Java class for AzimuthTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AzimuthTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AzimuthPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAzimuthExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNavaidEquipmentExtension"/>
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
@XmlType(name = "AzimuthTimeSliceType", propOrder = {
    "designator",
    "aixmName",
    "emissionClass",
    "mobile",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "flightChecked",
    "location",
    "authority",
    "monitoring",
    "availability",
    "annotation",
    "type",
    "trueBearing",
    "trueBearingAccuracy",
    "magneticBearing",
    "angleProportionalLeft",
    "angleProportionalRight",
    "angleCoverLeft",
    "angleCoverRight",
    "channel",
    "extension"
})
@Entity(name = "AzimuthTimeSliceType")
@Table(name = "azimuth_ts", schema = "navaids_point")
public class AzimuthTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "emissionClass", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioEmissionType> emissionClass;
    @XmlElementRef(name = "mobile", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mobile;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<AuthorityForNavaidEquipmentPropertyType> authority;
    @XmlElement(nillable = true)
    protected List<NavaidEquipmentMonitoringPropertyType> monitoring;
    @XmlElement(nillable = true)
    protected List<NavaidOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMLSAzimuthType> type;
    @XmlElementRef(name = "trueBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueBearing;
    @XmlElementRef(name = "trueBearingAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> trueBearingAccuracy;
    @XmlElementRef(name = "magneticBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticBearing;
    @XmlElementRef(name = "angleProportionalLeft", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleProportionalLeft;
    @XmlElementRef(name = "angleProportionalRight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleProportionalRight;
    @XmlElementRef(name = "angleCoverLeft", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleCoverLeft;
    @XmlElementRef(name = "angleCoverRight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleCoverRight;
    @XmlElementRef(name = "channel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMLSChannelType> channel;
    protected List<AzimuthExtensionType> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavaidDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeNavaidDesignatorType> value) {
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
     * Gets the value of the emissionClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadioEmissionType> getEmissionClass() {
        return emissionClass;
    }

    /**
     * Sets the value of the emissionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public void setEmissionClass(JAXBElement<CodeRadioEmissionType> value) {
        this.emissionClass = value;
    }

    @Transient
    public boolean isSetEmissionClass() {
        return (this.emissionClass!= null);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMobile(JAXBElement<CodeYesNoType> value) {
        this.mobile = value;
    }

    @Transient
    public boolean isSetMobile() {
        return (this.mobile!= null);
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
     * Gets the value of the flightChecked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Sets the value of the flightChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    @Transient
    public boolean isSetFlightChecked() {
        return (this.flightChecked!= null);
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
     * Gets the value of the authority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityForNavaidEquipmentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AuthorityForNavaidEquipmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "authority_azimuth_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "authority", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "azimuthpropertygroup", referencedColumnName = "hjid")
    })
    public List<AuthorityForNavaidEquipmentPropertyType> getAuthority() {
        if (authority == null) {
            authority = new ArrayList<>();
        }
        return this.authority;
    }

    /**
     * 
     * 
     */
    public void setAuthority(List<AuthorityForNavaidEquipmentPropertyType> authority) {
        this.authority = authority;
    }

    @Transient
    public boolean isSetAuthority() {
        return ((this.authority!= null)&&(!this.authority.isEmpty()));
    }

    public void unsetAuthority() {
        this.authority = null;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidEquipmentMonitoringPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavaidEquipmentMonitoringPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "monitoring_azimuth_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "monitoring", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "azimuthpropertygroup", referencedColumnName = "hjid")
    })
    public List<NavaidEquipmentMonitoringPropertyType> getMonitoring() {
        if (monitoring == null) {
            monitoring = new ArrayList<>();
        }
        return this.monitoring;
    }

    /**
     * 
     * 
     */
    public void setMonitoring(List<NavaidEquipmentMonitoringPropertyType> monitoring) {
        this.monitoring = monitoring;
    }

    @Transient
    public boolean isSetMonitoring() {
        return ((this.monitoring!= null)&&(!this.monitoring.isEmpty()));
    }

    public void unsetMonitoring() {
        this.monitoring = null;
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
     * {@link NavaidOperationalStatusPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavaidOperationalStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_azimuth_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "azimuthpropertygroup", referencedColumnName = "hjid")
    })
    public List<NavaidOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<NavaidOperationalStatusPropertyType> availability) {
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
    @JoinTable(name = "annotation_azimuth_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "azimuthpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMLSAzimuthType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMLSAzimuthType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMLSAzimuthType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeMLSAzimuthType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the trueBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getTrueBearing() {
        return trueBearing;
    }

    /**
     * Sets the value of the trueBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueBearing(JAXBElement<ValBearingType> value) {
        this.trueBearing = value;
    }

    @Transient
    public boolean isSetTrueBearing() {
        return (this.trueBearing!= null);
    }

    /**
     * Gets the value of the trueBearingAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getTrueBearingAccuracy() {
        return trueBearingAccuracy;
    }

    /**
     * Sets the value of the trueBearingAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setTrueBearingAccuracy(JAXBElement<ValAngleType> value) {
        this.trueBearingAccuracy = value;
    }

    @Transient
    public boolean isSetTrueBearingAccuracy() {
        return (this.trueBearingAccuracy!= null);
    }

    /**
     * Gets the value of the magneticBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getMagneticBearing() {
        return magneticBearing;
    }

    /**
     * Sets the value of the magneticBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setMagneticBearing(JAXBElement<ValBearingType> value) {
        this.magneticBearing = value;
    }

    @Transient
    public boolean isSetMagneticBearing() {
        return (this.magneticBearing!= null);
    }

    /**
     * Gets the value of the angleProportionalLeft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleProportionalLeft() {
        return angleProportionalLeft;
    }

    /**
     * Sets the value of the angleProportionalLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleProportionalLeft(JAXBElement<ValAngleType> value) {
        this.angleProportionalLeft = value;
    }

    @Transient
    public boolean isSetAngleProportionalLeft() {
        return (this.angleProportionalLeft!= null);
    }

    /**
     * Gets the value of the angleProportionalRight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleProportionalRight() {
        return angleProportionalRight;
    }

    /**
     * Sets the value of the angleProportionalRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleProportionalRight(JAXBElement<ValAngleType> value) {
        this.angleProportionalRight = value;
    }

    @Transient
    public boolean isSetAngleProportionalRight() {
        return (this.angleProportionalRight!= null);
    }

    /**
     * Gets the value of the angleCoverLeft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleCoverLeft() {
        return angleCoverLeft;
    }

    /**
     * Sets the value of the angleCoverLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleCoverLeft(JAXBElement<ValAngleType> value) {
        this.angleCoverLeft = value;
    }

    @Transient
    public boolean isSetAngleCoverLeft() {
        return (this.angleCoverLeft!= null);
    }

    /**
     * Gets the value of the angleCoverRight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleCoverRight() {
        return angleCoverRight;
    }

    /**
     * Sets the value of the angleCoverRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleCoverRight(JAXBElement<ValAngleType> value) {
        this.angleCoverRight = value;
    }

    @Transient
    public boolean isSetAngleCoverRight() {
        return (this.angleCoverRight!= null);
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMLSChannelType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMLSChannelType> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMLSChannelType }{@code >}
     *     
     */
    public void setChannel(JAXBElement<CodeMLSChannelType> value) {
        this.channel = value;
    }

    @Transient
    public boolean isSetChannel() {
        return (this.channel!= null);
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
     * {@link AzimuthExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AzimuthExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AZIMUTH_TIME_SLICE_0")
    public List<AzimuthExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AzimuthExtensionType> extension) {
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
    public CodeNavaidDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavaidDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeNavaidDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeNavaidDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), AzimuthTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "emissionclass")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "emissionclass_nilreason"))
    })
    public CodeRadioEmissionType getEmissionClassItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadioEmissionType.class, this.getEmissionClass());
    }

    public void setEmissionClassItem(CodeRadioEmissionType target) {
        setEmissionClass(XmlAdapterUtils.marshallJAXBElement(CodeRadioEmissionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emissionClass"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "mobile")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "mobile_nilreason"))
    })
    public CodeYesNoType getMobileItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMobile());
    }

    public void setMobileItem(CodeYesNoType target) {
        setMobile(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "mobile"), AzimuthTimeSliceType.class, target));
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
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariation"), AzimuthTimeSliceType.class, target));
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
        setMagneticVariationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariationAccuracy"), AzimuthTimeSliceType.class, target));
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
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateMagneticVariation"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "flightchecked")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightchecked_nilreason"))
    })
    public CodeYesNoType getFlightCheckedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlightChecked());
    }

    public void setFlightCheckedItem(CodeYesNoType target) {
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), AzimuthTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeMLSAzimuthType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMLSAzimuthType.class, this.getType());
    }

    public void setTypeItem(CodeMLSAzimuthType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeMLSAzimuthType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truebearing")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truebearing_nilreason"))
    })
    public ValBearingType getTrueBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getTrueBearing());
    }

    public void setTrueBearingItem(ValBearingType target) {
        setTrueBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueBearing"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truebearingaccuracy")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truebearingaccuracy_nilreason"))
    })
    public ValAngleType getTrueBearingAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getTrueBearingAccuracy());
    }

    public void setTrueBearingAccuracyItem(ValAngleType target) {
        setTrueBearingAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueBearingAccuracy"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticbearing")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticbearing_nilreason"))
    })
    public ValBearingType getMagneticBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getMagneticBearing());
    }

    public void setMagneticBearingItem(ValBearingType target) {
        setMagneticBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticBearing"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angleproportionalleft")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angleproportionalleft_nilreason"))
    })
    public ValAngleType getAngleProportionalLeftItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleProportionalLeft());
    }

    public void setAngleProportionalLeftItem(ValAngleType target) {
        setAngleProportionalLeft(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleProportionalLeft"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angleproportionalright")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angleproportionalright_nilreason"))
    })
    public ValAngleType getAngleProportionalRightItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleProportionalRight());
    }

    public void setAngleProportionalRightItem(ValAngleType target) {
        setAngleProportionalRight(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleProportionalRight"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anglecoverleft")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anglecoverleft_nilreason"))
    })
    public ValAngleType getAngleCoverLeftItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleCoverLeft());
    }

    public void setAngleCoverLeftItem(ValAngleType target) {
        setAngleCoverLeft(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleCoverLeft"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anglecoverright")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anglecoverright_nilreason"))
    })
    public ValAngleType getAngleCoverRightItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleCoverRight());
    }

    public void setAngleCoverRightItem(ValAngleType target) {
        setAngleCoverRight(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleCoverRight"), AzimuthTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "channel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "channel_nilreason"))
    })
    public CodeMLSChannelType getChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMLSChannelType.class, this.getChannel());
    }

    public void setChannelItem(CodeMLSChannelType target) {
        setChannel(XmlAdapterUtils.marshallJAXBElement(CodeMLSChannelType.class, new QName("http://www.aixm.aero/schema/5.1.1", "channel"), AzimuthTimeSliceType.class, target));
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
        final AzimuthTimeSliceType that = ((AzimuthTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeMLSAzimuthType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeMLSAzimuthType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeNavaidDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeNavaidDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMobile();
            boolean rhsFieldIsSet = that.isSetMobile();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMobile();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMobile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mobile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mobile", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleCoverRight();
            boolean rhsFieldIsSet = that.isSetAngleCoverRight();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleCoverRight();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleCoverRight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleCoverRight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleCoverRight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<NavaidOperationalStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticBearing();
            boolean rhsFieldIsSet = that.isSetMagneticBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getMagneticBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getMagneticBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticBearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetChannel();
            boolean rhsFieldIsSet = that.isSetChannel();
            JAXBElement<CodeMLSChannelType> lhsField;
            lhsField = this.getChannel();
            JAXBElement<CodeMLSChannelType> rhsField;
            rhsField = that.getChannel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "channel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "channel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrueBearingAccuracy();
            boolean rhsFieldIsSet = that.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getTrueBearingAccuracy();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getTrueBearingAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueBearingAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueBearingAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleProportionalLeft();
            boolean rhsFieldIsSet = that.isSetAngleProportionalLeft();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleProportionalLeft();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleProportionalLeft();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleProportionalLeft", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleProportionalLeft", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrueBearing();
            boolean rhsFieldIsSet = that.isSetTrueBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getTrueBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getTrueBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueBearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightChecked();
            boolean rhsFieldIsSet = that.isSetFlightChecked();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFlightChecked();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFlightChecked();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightChecked", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightChecked", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AzimuthExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AzimuthExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleProportionalRight();
            boolean rhsFieldIsSet = that.isSetAngleProportionalRight();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleProportionalRight();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleProportionalRight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleProportionalRight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleProportionalRight", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMonitoring();
            boolean rhsFieldIsSet = that.isSetMonitoring();
            List<NavaidEquipmentMonitoringPropertyType> lhsField;
            lhsField = (this.isSetMonitoring()?this.getMonitoring():null);
            List<NavaidEquipmentMonitoringPropertyType> rhsField;
            rhsField = (that.isSetMonitoring()?that.getMonitoring():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "monitoring", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "monitoring", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAngleCoverLeft();
            boolean rhsFieldIsSet = that.isSetAngleCoverLeft();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleCoverLeft();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleCoverLeft();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleCoverLeft", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleCoverLeft", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmissionClass();
            boolean rhsFieldIsSet = that.isSetEmissionClass();
            JAXBElement<CodeRadioEmissionType> lhsField;
            lhsField = this.getEmissionClass();
            JAXBElement<CodeRadioEmissionType> rhsField;
            rhsField = that.getEmissionClass();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emissionClass", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emissionClass", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAuthority();
            boolean rhsFieldIsSet = that.isSetAuthority();
            List<AuthorityForNavaidEquipmentPropertyType> lhsField;
            lhsField = (this.isSetAuthority()?this.getAuthority():null);
            List<AuthorityForNavaidEquipmentPropertyType> rhsField;
            rhsField = (that.isSetAuthority()?that.getAuthority():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authority", rhsField);
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
            JAXBElement<CodeNavaidDesignatorType> theField;
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
            boolean theFieldIsSet = this.isSetEmissionClass();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmissionClass();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emissionClass", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMobile();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMobile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mobile", theField);
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
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightChecked", theField);
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
            boolean theFieldIsSet = this.isSetAuthority();
            List<AuthorityForNavaidEquipmentPropertyType> theField;
            theField = (this.isSetAuthority()?this.getAuthority():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMonitoring();
            List<NavaidEquipmentMonitoringPropertyType> theField;
            theField = (this.isSetMonitoring()?this.getMonitoring():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "monitoring", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeMLSAzimuthType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getTrueBearingAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueBearingAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleProportionalLeft();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleProportionalLeft();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleProportionalLeft", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleProportionalRight();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleProportionalRight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleProportionalRight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleCoverLeft();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleCoverLeft();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleCoverLeft", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleCoverRight();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleCoverRight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleCoverRight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannel();
            JAXBElement<CodeMLSChannelType> theField;
            theField = this.getChannel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "channel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AzimuthExtensionType> theField;
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
            JAXBElement<CodeNavaidDesignatorType> theField;
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
            boolean theFieldIsSet = this.isSetEmissionClass();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmissionClass();
            strategy.appendField(locator, this, "emissionClass", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMobile();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMobile();
            strategy.appendField(locator, this, "mobile", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            strategy.appendField(locator, this, "flightChecked", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAuthority();
            List<AuthorityForNavaidEquipmentPropertyType> theField;
            theField = (this.isSetAuthority()?this.getAuthority():null);
            strategy.appendField(locator, this, "authority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMonitoring();
            List<NavaidEquipmentMonitoringPropertyType> theField;
            theField = (this.isSetMonitoring()?this.getMonitoring():null);
            strategy.appendField(locator, this, "monitoring", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeMLSAzimuthType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueBearing();
            strategy.appendField(locator, this, "trueBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getTrueBearingAccuracy();
            strategy.appendField(locator, this, "trueBearingAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticBearing();
            strategy.appendField(locator, this, "magneticBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleProportionalLeft();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleProportionalLeft();
            strategy.appendField(locator, this, "angleProportionalLeft", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleProportionalRight();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleProportionalRight();
            strategy.appendField(locator, this, "angleProportionalRight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleCoverLeft();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleCoverLeft();
            strategy.appendField(locator, this, "angleCoverLeft", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleCoverRight();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleCoverRight();
            strategy.appendField(locator, this, "angleCoverRight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannel();
            JAXBElement<CodeMLSChannelType> theField;
            theField = this.getChannel();
            strategy.appendField(locator, this, "channel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AzimuthExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
