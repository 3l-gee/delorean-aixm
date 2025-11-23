
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
 * <p>Java class for AirspaceActivationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceActivationType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleType">
 *       <sequence>
 *         <element name="timeInterval" type="{http://www.aixm.aero/schema/5.1.1}TimesheetPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="specialDateAuthority" type="{http://www.aixm.aero/schema/5.1.1}OrganisationAuthorityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AirspaceActivationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirspaceActivationExtension"/>
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
@XmlType(name = "AirspaceActivationType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "activity",
    "status",
    "levels",
    "user",
    "aircraft",
    "extension"
})
@Entity(name = "AirspaceActivationType")
@Table(name = "airspaceactivation", schema = "airspace")
public class AirspaceActivationType
    extends AbstractPropertiesWithScheduleType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "activity", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceActivityType> activity;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusAirspaceType> status;
    @XmlElement(nillable = true)
    protected List<AirspaceLayerPropertyType> levels;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> user;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraft;
    protected List<AirspaceActivationTypeExtensionType> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TimesheetPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "timeinterval_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "timeinterval", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationtype", referencedColumnName = "hjid")
    })
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<>();
        }
        return this.timeInterval;
    }

    /**
     * 
     * 
     */
    public void setTimeInterval(List<TimesheetPropertyType> timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Transient
    public boolean isSetTimeInterval() {
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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
    @JoinTable(name = "annotation_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationtype", referencedColumnName = "hjid")
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "specialdateauthority_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "specialdateauthority", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationtype", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<>();
        }
        return this.specialDateAuthority;
    }

    /**
     * 
     * 
     */
    public void setSpecialDateAuthority(List<OrganisationAuthorityPropertyType> specialDateAuthority) {
        this.specialDateAuthority = specialDateAuthority;
    }

    @Transient
    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceActivityType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirspaceActivityType> getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceActivityType }{@code >}
     *     
     */
    public void setActivity(JAXBElement<CodeAirspaceActivityType> value) {
        this.activity = value;
    }

    @Transient
    public boolean isSetActivity() {
        return (this.activity!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusAirspaceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeStatusAirspaceType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusAirspaceType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeStatusAirspaceType> value) {
        this.status = value;
    }

    @Transient
    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceLayerPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspaceLayerPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "levels_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "levels", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspaceLayerPropertyType> getLevels() {
        if (levels == null) {
            levels = new ArrayList<>();
        }
        return this.levels;
    }

    /**
     * 
     * 
     */
    public void setLevels(List<AirspaceLayerPropertyType> levels) {
        this.levels = levels;
    }

    @Transient
    public boolean isSetLevels() {
        return ((this.levels!= null)&&(!this.levels.isEmpty()));
    }

    public void unsetLevels() {
        this.levels = null;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "user_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "user_", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationpropertygroup", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getUser() {
        if (user == null) {
            user = new ArrayList<>();
        }
        return this.user;
    }

    /**
     * 
     * 
     */
    public void setUser(List<OrganisationAuthorityPropertyType> user) {
        this.user = user;
    }

    @Transient
    public boolean isSetUser() {
        return ((this.user!= null)&&(!this.user.isEmpty()));
    }

    public void unsetUser() {
        this.user = null;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "aircraft_airspaceactivation_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "aircraft", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspaceactivationpropertygroup", referencedColumnName = "hjid")
    })
    public List<AircraftCharacteristicPropertyType> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<>();
        }
        return this.aircraft;
    }

    /**
     * 
     * 
     */
    public void setAircraft(List<AircraftCharacteristicPropertyType> aircraft) {
        this.aircraft = aircraft;
    }

    @Transient
    public boolean isSetAircraft() {
        return ((this.aircraft!= null)&&(!this.aircraft.isEmpty()));
    }

    public void unsetAircraft() {
        this.aircraft = null;
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
     * {@link AirspaceActivationTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirspaceActivationTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AIRSPACE_ACTIVATIO_0")
    public List<AirspaceActivationTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AirspaceActivationTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "activity")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "activity_nilreason"))
    })
    public CodeAirspaceActivityType getActivityItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirspaceActivityType.class, this.getActivity());
    }

    public void setActivityItem(CodeAirspaceActivityType target) {
        setActivity(XmlAdapterUtils.marshallJAXBElement(CodeAirspaceActivityType.class, new QName("http://www.aixm.aero/schema/5.1.1", "activity"), AirspaceActivationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "status")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "status_nilreason"))
    })
    public CodeStatusAirspaceType getStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStatusAirspaceType.class, this.getStatus());
    }

    public void setStatusItem(CodeStatusAirspaceType target) {
        setStatus(XmlAdapterUtils.marshallJAXBElement(CodeStatusAirspaceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "status"), AirspaceActivationType.class, target));
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
        final AirspaceActivationType that = ((AirspaceActivationType) object);
        {
            boolean lhsFieldIsSet = this.isSetAircraft();
            boolean rhsFieldIsSet = that.isSetAircraft();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraft()?this.getAircraft():null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraft()?that.getAircraft():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraft", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraft", rhsField);
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
            boolean lhsFieldIsSet = this.isSetActivity();
            boolean rhsFieldIsSet = that.isSetActivity();
            JAXBElement<CodeAirspaceActivityType> lhsField;
            lhsField = this.getActivity();
            JAXBElement<CodeAirspaceActivityType> rhsField;
            rhsField = that.getActivity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "activity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "activity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUser();
            boolean rhsFieldIsSet = that.isSetUser();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetUser()?this.getUser():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetUser()?that.getUser():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "user", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "user", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirspaceActivationTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AirspaceActivationTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLevels();
            boolean rhsFieldIsSet = that.isSetLevels();
            List<AirspaceLayerPropertyType> lhsField;
            lhsField = (this.isSetLevels()?this.getLevels():null);
            List<AirspaceLayerPropertyType> rhsField;
            rhsField = (that.isSetLevels()?that.getLevels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "levels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "levels", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialDateAuthority();
            boolean rhsFieldIsSet = that.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetSpecialDateAuthority()?that.getSpecialDateAuthority():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialDateAuthority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialDateAuthority", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStatus();
            boolean rhsFieldIsSet = that.isSetStatus();
            JAXBElement<CodeStatusAirspaceType> lhsField;
            lhsField = this.getStatus();
            JAXBElement<CodeStatusAirspaceType> rhsField;
            rhsField = that.getStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            List<TimesheetPropertyType> lhsField;
            lhsField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            List<TimesheetPropertyType> rhsField;
            rhsField = (that.isSetTimeInterval()?that.getTimeInterval():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
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
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialDateAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivity();
            JAXBElement<CodeAirspaceActivityType> theField;
            theField = this.getActivity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "activity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusAirspaceType> theField;
            theField = this.getStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevels();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetLevels()?this.getLevels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "levels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUser();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetUser()?this.getUser():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "user", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraft();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraft()?this.getAircraft():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraft", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirspaceActivationTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            strategy.appendField(locator, this, "specialDateAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivity();
            JAXBElement<CodeAirspaceActivityType> theField;
            theField = this.getActivity();
            strategy.appendField(locator, this, "activity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusAirspaceType> theField;
            theField = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevels();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetLevels()?this.getLevels():null);
            strategy.appendField(locator, this, "levels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUser();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetUser()?this.getUser():null);
            strategy.appendField(locator, this, "user", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraft();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraft()?this.getAircraft():null);
            strategy.appendField(locator, this, "aircraft", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirspaceActivationTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
