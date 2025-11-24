
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
 * <p>Java class for ElevationTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElevationTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ElevationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractElevationExtension"/>
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
@XmlType(name = "ElevationTimeSliceType", propOrder = {
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
    "angleNominal",
    "angleMinimum",
    "angleSpan",
    "angleAccuracy",
    "extension"
})
@Entity(name = "ElevationTimeSliceType")
@Table(name = "elevation_ts", schema = "navaids_point")
public class ElevationTimeSliceType
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
    @XmlElementRef(name = "angleNominal", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleNominal;
    @XmlElementRef(name = "angleMinimum", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleMinimum;
    @XmlElementRef(name = "angleSpan", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleSpan;
    @XmlElementRef(name = "angleAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleAccuracy;
    protected List<ElevationExtensionType> extension;

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
    @JoinTable(name = "authority_elevation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "authority", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "elevationpropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "monitoring_elevation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "monitoring", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "elevationpropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "availability_elevation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "elevationpropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "annotation_elevation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "elevationpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the angleNominal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleNominal() {
        return angleNominal;
    }

    /**
     * Sets the value of the angleNominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleNominal(JAXBElement<ValAngleType> value) {
        this.angleNominal = value;
    }

    @Transient
    public boolean isSetAngleNominal() {
        return (this.angleNominal!= null);
    }

    /**
     * Gets the value of the angleMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleMinimum() {
        return angleMinimum;
    }

    /**
     * Sets the value of the angleMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleMinimum(JAXBElement<ValAngleType> value) {
        this.angleMinimum = value;
    }

    @Transient
    public boolean isSetAngleMinimum() {
        return (this.angleMinimum!= null);
    }

    /**
     * Gets the value of the angleSpan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleSpan() {
        return angleSpan;
    }

    /**
     * Sets the value of the angleSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleSpan(JAXBElement<ValAngleType> value) {
        this.angleSpan = value;
    }

    @Transient
    public boolean isSetAngleSpan() {
        return (this.angleSpan!= null);
    }

    /**
     * Gets the value of the angleAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleAccuracy() {
        return angleAccuracy;
    }

    /**
     * Sets the value of the angleAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleAccuracy(JAXBElement<ValAngleType> value) {
        this.angleAccuracy = value;
    }

    @Transient
    public boolean isSetAngleAccuracy() {
        return (this.angleAccuracy!= null);
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
     * {@link ElevationExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ElevationExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<ElevationExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ElevationExtensionType> extension) {
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
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeNavaidDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), ElevationTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), ElevationTimeSliceType.class, target));
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
        setEmissionClass(XmlAdapterUtils.marshallJAXBElement(CodeRadioEmissionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emissionClass"), ElevationTimeSliceType.class, target));
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
        setMobile(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "mobile"), ElevationTimeSliceType.class, target));
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
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariation"), ElevationTimeSliceType.class, target));
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
        setMagneticVariationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticVariationAccuracy"), ElevationTimeSliceType.class, target));
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
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateMagneticVariation"), ElevationTimeSliceType.class, target));
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
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), ElevationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), ElevationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anglenominal")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anglenominal_nilreason"))
    })
    public ValAngleType getAngleNominalItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleNominal());
    }

    public void setAngleNominalItem(ValAngleType target) {
        setAngleNominal(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleNominal"), ElevationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angleminimum")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angleminimum_nilreason"))
    })
    public ValAngleType getAngleMinimumItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleMinimum());
    }

    public void setAngleMinimumItem(ValAngleType target) {
        setAngleMinimum(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleMinimum"), ElevationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anglespan")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anglespan_nilreason"))
    })
    public ValAngleType getAngleSpanItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleSpan());
    }

    public void setAngleSpanItem(ValAngleType target) {
        setAngleSpan(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleSpan"), ElevationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angleaccuracy")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angleaccuracy_nilreason"))
    })
    public ValAngleType getAngleAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleAccuracy());
    }

    public void setAngleAccuracyItem(ValAngleType target) {
        setAngleAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleAccuracy"), ElevationTimeSliceType.class, target));
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
        final ElevationTimeSliceType that = ((ElevationTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetAngleNominal();
            boolean rhsFieldIsSet = that.isSetAngleNominal();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleNominal();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleNominal();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleNominal", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleNominal", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAngleMinimum();
            boolean rhsFieldIsSet = that.isSetAngleMinimum();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleMinimum();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleMinimum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleMinimum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleMinimum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleSpan();
            boolean rhsFieldIsSet = that.isSetAngleSpan();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleSpan();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleSpan();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleSpan", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleSpan", rhsField);
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
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ElevationExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ElevationExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleAccuracy();
            boolean rhsFieldIsSet = that.isSetAngleAccuracy();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleAccuracy();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleAccuracy", rhsField);
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
            boolean theFieldIsSet = this.isSetAngleNominal();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleNominal();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleNominal", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleMinimum();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleMinimum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleMinimum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleSpan();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleSpan();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleSpan", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ElevationExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAngleNominal();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleNominal();
            strategy.appendField(locator, this, "angleNominal", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleMinimum();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleMinimum();
            strategy.appendField(locator, this, "angleMinimum", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleSpan();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleSpan();
            strategy.appendField(locator, this, "angleSpan", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleAccuracy();
            strategy.appendField(locator, this, "angleAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ElevationExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
