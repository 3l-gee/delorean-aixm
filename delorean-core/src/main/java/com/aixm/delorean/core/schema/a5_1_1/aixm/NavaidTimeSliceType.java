
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
 * <p>Java class for NavaidTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NavaidPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNavaidExtension"/>
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
@XmlType(name = "NavaidTimeSliceType", propOrder = {
    "type",
    "designator",
    "aixmName",
    "flightChecked",
    "purpose",
    "signalPerformance",
    "courseQuality",
    "integrityLevel",
    "touchDownLiftOff",
    "navaidEquipment",
    "location",
    "runwayDirection",
    "servedAirport",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "NavaidTimeSliceType")
@Table(name = "navaid_ts", schema = "navaids_point")
public class NavaidTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidServiceType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidPurposeType> purpose;
    @XmlElementRef(name = "signalPerformance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSignalPerformanceILSType> signalPerformance;
    @XmlElementRef(name = "courseQuality", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseQualityILSType> courseQuality;
    @XmlElementRef(name = "integrityLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIntegrityLevelILSType> integrityLevel;
    @XmlElement(nillable = true)
    protected List<TouchDownLiftOffPropertyType> touchDownLiftOff;
    @XmlElement(nillable = true)
    protected List<NavaidComponentPropertyType> navaidEquipment;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runwayDirection;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> servedAirport;
    @XmlElement(nillable = true)
    protected List<NavaidOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavaidExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidServiceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavaidServiceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidServiceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNavaidServiceType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidPurposeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavaidPurposeType> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidPurposeType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<CodeNavaidPurposeType> value) {
        this.purpose = value;
    }

    @Transient
    public boolean isSetPurpose() {
        return (this.purpose!= null);
    }

    /**
     * Gets the value of the signalPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSignalPerformanceILSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSignalPerformanceILSType> getSignalPerformance() {
        return signalPerformance;
    }

    /**
     * Sets the value of the signalPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSignalPerformanceILSType }{@code >}
     *     
     */
    public void setSignalPerformance(JAXBElement<CodeSignalPerformanceILSType> value) {
        this.signalPerformance = value;
    }

    @Transient
    public boolean isSetSignalPerformance() {
        return (this.signalPerformance!= null);
    }

    /**
     * Gets the value of the courseQuality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseQualityILSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCourseQualityILSType> getCourseQuality() {
        return courseQuality;
    }

    /**
     * Sets the value of the courseQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseQualityILSType }{@code >}
     *     
     */
    public void setCourseQuality(JAXBElement<CodeCourseQualityILSType> value) {
        this.courseQuality = value;
    }

    @Transient
    public boolean isSetCourseQuality() {
        return (this.courseQuality!= null);
    }

    /**
     * Gets the value of the integrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIntegrityLevelILSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeIntegrityLevelILSType> getIntegrityLevel() {
        return integrityLevel;
    }

    /**
     * Sets the value of the integrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIntegrityLevelILSType }{@code >}
     *     
     */
    public void setIntegrityLevel(JAXBElement<CodeIntegrityLevelILSType> value) {
        this.integrityLevel = value;
    }

    @Transient
    public boolean isSetIntegrityLevel() {
        return (this.integrityLevel!= null);
    }

    /**
     * Gets the value of the touchDownLiftOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the touchDownLiftOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTouchDownLiftOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchDownLiftOffPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "touchdownliftoff_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "touchdownliftoff", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
    })
    public List<TouchDownLiftOffPropertyType> getTouchDownLiftOff() {
        if (touchDownLiftOff == null) {
            touchDownLiftOff = new ArrayList<>();
        }
        return this.touchDownLiftOff;
    }

    /**
     * 
     * 
     */
    public void setTouchDownLiftOff(List<TouchDownLiftOffPropertyType> touchDownLiftOff) {
        this.touchDownLiftOff = touchDownLiftOff;
    }

    @Transient
    public boolean isSetTouchDownLiftOff() {
        return ((this.touchDownLiftOff!= null)&&(!this.touchDownLiftOff.isEmpty()));
    }

    public void unsetTouchDownLiftOff() {
        this.touchDownLiftOff = null;
    }

    /**
     * Gets the value of the navaidEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidComponentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavaidComponentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "navaidequipment_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "navaidequipment", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
    })
    public List<NavaidComponentPropertyType> getNavaidEquipment() {
        if (navaidEquipment == null) {
            navaidEquipment = new ArrayList<>();
        }
        return this.navaidEquipment;
    }

    /**
     * 
     * 
     */
    public void setNavaidEquipment(List<NavaidComponentPropertyType> navaidEquipment) {
        this.navaidEquipment = navaidEquipment;
    }

    @Transient
    public boolean isSetNavaidEquipment() {
        return ((this.navaidEquipment!= null)&&(!this.navaidEquipment.isEmpty()));
    }

    public void unsetNavaidEquipment() {
        this.navaidEquipment = null;
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
     * Gets the value of the runwayDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "runwaydirection_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "runwaydirection", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
    })
    public List<RunwayDirectionPropertyType> getRunwayDirection() {
        if (runwayDirection == null) {
            runwayDirection = new ArrayList<>();
        }
        return this.runwayDirection;
    }

    /**
     * 
     * 
     */
    public void setRunwayDirection(List<RunwayDirectionPropertyType> runwayDirection) {
        this.runwayDirection = runwayDirection;
    }

    @Transient
    public boolean isSetRunwayDirection() {
        return ((this.runwayDirection!= null)&&(!this.runwayDirection.isEmpty()));
    }

    public void unsetRunwayDirection() {
        this.runwayDirection = null;
    }

    /**
     * Gets the value of the servedAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servedAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServedAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "servedairport_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "servedairport", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportPropertyType> getServedAirport() {
        if (servedAirport == null) {
            servedAirport = new ArrayList<>();
        }
        return this.servedAirport;
    }

    /**
     * 
     * 
     */
    public void setServedAirport(List<AirportHeliportPropertyType> servedAirport) {
        this.servedAirport = servedAirport;
    }

    @Transient
    public boolean isSetServedAirport() {
        return ((this.servedAirport!= null)&&(!this.servedAirport.isEmpty()));
    }

    public void unsetServedAirport() {
        this.servedAirport = null;
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
    @JoinTable(name = "availability_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "annotation_navaid_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navaidpropertygroup", referencedColumnName = "hjid")
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
     * {@link NavaidExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NavaidExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_NAVAID_TIME_SLICE__0")
    public List<NavaidExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NavaidExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeNavaidServiceType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavaidServiceType.class, this.getType());
    }

    public void setTypeItem(CodeNavaidServiceType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeNavaidServiceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), NavaidTimeSliceType.class, target));
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
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeNavaidDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), NavaidTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), NavaidTimeSliceType.class, target));
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
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), NavaidTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "purpose")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "purpose_nilreason"))
    })
    public CodeNavaidPurposeType getPurposeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavaidPurposeType.class, this.getPurpose());
    }

    public void setPurposeItem(CodeNavaidPurposeType target) {
        setPurpose(XmlAdapterUtils.marshallJAXBElement(CodeNavaidPurposeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "purpose"), NavaidTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "signalperformance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "signalperformance_nilreason"))
    })
    public CodeSignalPerformanceILSType getSignalPerformanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSignalPerformanceILSType.class, this.getSignalPerformance());
    }

    public void setSignalPerformanceItem(CodeSignalPerformanceILSType target) {
        setSignalPerformance(XmlAdapterUtils.marshallJAXBElement(CodeSignalPerformanceILSType.class, new QName("http://www.aixm.aero/schema/5.1.1", "signalPerformance"), NavaidTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursequality")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursequality_nilreason"))
    })
    public CodeCourseQualityILSType getCourseQualityItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseQualityILSType.class, this.getCourseQuality());
    }

    public void setCourseQualityItem(CodeCourseQualityILSType target) {
        setCourseQuality(XmlAdapterUtils.marshallJAXBElement(CodeCourseQualityILSType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseQuality"), NavaidTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "integritylevel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "integritylevel_nilreason"))
    })
    public CodeIntegrityLevelILSType getIntegrityLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeIntegrityLevelILSType.class, this.getIntegrityLevel());
    }

    public void setIntegrityLevelItem(CodeIntegrityLevelILSType target) {
        setIntegrityLevel(XmlAdapterUtils.marshallJAXBElement(CodeIntegrityLevelILSType.class, new QName("http://www.aixm.aero/schema/5.1.1", "integrityLevel"), NavaidTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), NavaidTimeSliceType.class, target));
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
        final NavaidTimeSliceType that = ((NavaidTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetTouchDownLiftOff();
            boolean rhsFieldIsSet = that.isSetTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> lhsField;
            lhsField = (this.isSetTouchDownLiftOff()?this.getTouchDownLiftOff():null);
            List<TouchDownLiftOffPropertyType> rhsField;
            rhsField = (that.isSetTouchDownLiftOff()?that.getTouchDownLiftOff():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "touchDownLiftOff", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "touchDownLiftOff", rhsField);
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
            boolean lhsFieldIsSet = this.isSetIntegrityLevel();
            boolean rhsFieldIsSet = that.isSetIntegrityLevel();
            JAXBElement<CodeIntegrityLevelILSType> lhsField;
            lhsField = this.getIntegrityLevel();
            JAXBElement<CodeIntegrityLevelILSType> rhsField;
            rhsField = that.getIntegrityLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "integrityLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "integrityLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseQuality();
            boolean rhsFieldIsSet = that.isSetCourseQuality();
            JAXBElement<CodeCourseQualityILSType> lhsField;
            lhsField = this.getCourseQuality();
            JAXBElement<CodeCourseQualityILSType> rhsField;
            rhsField = that.getCourseQuality();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseQuality", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseQuality", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayDirection();
            boolean rhsFieldIsSet = that.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> lhsField;
            lhsField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            List<RunwayDirectionPropertyType> rhsField;
            rhsField = (that.isSetRunwayDirection()?that.getRunwayDirection():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<NavaidExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NavaidExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignalPerformance();
            boolean rhsFieldIsSet = that.isSetSignalPerformance();
            JAXBElement<CodeSignalPerformanceILSType> lhsField;
            lhsField = this.getSignalPerformance();
            JAXBElement<CodeSignalPerformanceILSType> rhsField;
            rhsField = that.getSignalPerformance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "signalPerformance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "signalPerformance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetNavaidEquipment();
            List<NavaidComponentPropertyType> lhsField;
            lhsField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            List<NavaidComponentPropertyType> rhsField;
            rhsField = (that.isSetNavaidEquipment()?that.getNavaidEquipment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeNavaidServiceType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeNavaidServiceType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPurpose();
            boolean rhsFieldIsSet = that.isSetPurpose();
            JAXBElement<CodeNavaidPurposeType> lhsField;
            lhsField = this.getPurpose();
            JAXBElement<CodeNavaidPurposeType> rhsField;
            rhsField = that.getPurpose();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "purpose", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "purpose", rhsField);
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
            boolean lhsFieldIsSet = this.isSetServedAirport();
            boolean rhsFieldIsSet = that.isSetServedAirport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetServedAirport()?this.getServedAirport():null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetServedAirport()?that.getServedAirport():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "servedAirport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "servedAirport", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeNavaidServiceType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightChecked", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeNavaidPurposeType> theField;
            theField = this.getPurpose();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "purpose", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalPerformance();
            JAXBElement<CodeSignalPerformanceILSType> theField;
            theField = this.getSignalPerformance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "signalPerformance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseQuality();
            JAXBElement<CodeCourseQualityILSType> theField;
            theField = this.getCourseQuality();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseQuality", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntegrityLevel();
            JAXBElement<CodeIntegrityLevelILSType> theField;
            theField = this.getIntegrityLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "integrityLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetTouchDownLiftOff()?this.getTouchDownLiftOff():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "touchDownLiftOff", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidComponentPropertyType> theField;
            theField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidEquipment", theField);
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
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetServedAirport()?this.getServedAirport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "servedAirport", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<NavaidExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeNavaidServiceType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            strategy.appendField(locator, this, "flightChecked", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeNavaidPurposeType> theField;
            theField = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalPerformance();
            JAXBElement<CodeSignalPerformanceILSType> theField;
            theField = this.getSignalPerformance();
            strategy.appendField(locator, this, "signalPerformance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseQuality();
            JAXBElement<CodeCourseQualityILSType> theField;
            theField = this.getCourseQuality();
            strategy.appendField(locator, this, "courseQuality", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntegrityLevel();
            JAXBElement<CodeIntegrityLevelILSType> theField;
            theField = this.getIntegrityLevel();
            strategy.appendField(locator, this, "integrityLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetTouchDownLiftOff()?this.getTouchDownLiftOff():null);
            strategy.appendField(locator, this, "touchDownLiftOff", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidComponentPropertyType> theField;
            theField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            strategy.appendField(locator, this, "navaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            strategy.appendField(locator, this, "runwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetServedAirport()?this.getServedAirport():null);
            strategy.appendField(locator, this, "servedAirport", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<NavaidExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
