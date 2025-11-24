
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
 * <p>Java class for RadarSystemTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadarSystemTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RadarSystemPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadarSystemExtension"/>
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
@XmlType(name = "RadarSystemTimeSliceType", propOrder = {
    "type",
    "model",
    "generalTerrainMonitor",
    "broadcastIdentifier",
    "radarEquipment",
    "office",
    "airportHeliport",
    "parRunway",
    "location",
    "annotation",
    "extension"
})
@Entity(name = "RadarSystemTimeSliceType")
@Table(name = "radarsystem_ts", schema = "surveillance")
public class RadarSystemTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadarServiceType> type;
    @XmlElementRef(name = "model", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> model;
    @XmlElementRef(name = "generalTerrainMonitor", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> generalTerrainMonitor;
    @XmlElementRef(name = "broadcastIdentifier", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> broadcastIdentifier;
    @XmlElement(nillable = true)
    protected List<RadarComponentPropertyType> radarEquipment;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> office;
    @XmlElementRef(name = "airportHeliport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(name = "PARRunway", nillable = true)
    protected List<RunwayPropertyType> parRunway;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RadarSystemExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadarServiceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadarServiceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadarServiceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRadarServiceType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setModel(JAXBElement<TextNameType> value) {
        this.model = value;
    }

    @Transient
    public boolean isSetModel() {
        return (this.model!= null);
    }

    /**
     * Gets the value of the generalTerrainMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getGeneralTerrainMonitor() {
        return generalTerrainMonitor;
    }

    /**
     * Sets the value of the generalTerrainMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setGeneralTerrainMonitor(JAXBElement<CodeYesNoType> value) {
        this.generalTerrainMonitor = value;
    }

    @Transient
    public boolean isSetGeneralTerrainMonitor() {
        return (this.generalTerrainMonitor!= null);
    }

    /**
     * Gets the value of the broadcastIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getBroadcastIdentifier() {
        return broadcastIdentifier;
    }

    /**
     * Sets the value of the broadcastIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setBroadcastIdentifier(JAXBElement<TextDesignatorType> value) {
        this.broadcastIdentifier = value;
    }

    @Transient
    public boolean isSetBroadcastIdentifier() {
        return (this.broadcastIdentifier!= null);
    }

    /**
     * Gets the value of the radarEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radarEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadarEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadarComponentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RadarComponentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "radarequipment_radarsystem_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "radarequipment", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radarsystempropertygroup", referencedColumnName = "hjid")
    })
    public List<RadarComponentPropertyType> getRadarEquipment() {
        if (radarEquipment == null) {
            radarEquipment = new ArrayList<>();
        }
        return this.radarEquipment;
    }

    /**
     * 
     * 
     */
    public void setRadarEquipment(List<RadarComponentPropertyType> radarEquipment) {
        this.radarEquipment = radarEquipment;
    }

    @Transient
    public boolean isSetRadarEquipment() {
        return ((this.radarEquipment!= null)&&(!this.radarEquipment.isEmpty()));
    }

    public void unsetRadarEquipment() {
        this.radarEquipment = null;
    }

    /**
     * Gets the value of the office property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the office property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffice().add(newItem);
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
    @JoinTable(name = "office_radarsystem_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "office", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radarsystempropertygroup", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getOffice() {
        if (office == null) {
            office = new ArrayList<>();
        }
        return this.office;
    }

    /**
     * 
     * 
     */
    public void setOffice(List<OrganisationAuthorityPropertyType> office) {
        this.office = office;
    }

    @Transient
    public boolean isSetOffice() {
        return ((this.office!= null)&&(!this.office.isEmpty()));
    }

    public void unsetOffice() {
        this.office = null;
    }

    /**
     * Gets the value of the airportHeliport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getAirportHeliport() {
        return airportHeliport;
    }

    /**
     * Sets the value of the airportHeliport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.airportHeliport = value;
    }

    @Transient
    public boolean isSetAirportHeliport() {
        return (this.airportHeliport!= null);
    }

    /**
     * Gets the value of the parRunway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parRunway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARRunway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RunwayPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "parrunway_radarsystem_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "parrunway", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radarsystempropertygroup", referencedColumnName = "hjid")
    })
    public List<RunwayPropertyType> getPARRunway() {
        if (parRunway == null) {
            parRunway = new ArrayList<>();
        }
        return this.parRunway;
    }

    /**
     * 
     * 
     */
    public void setPARRunway(List<RunwayPropertyType> parRunway) {
        this.parRunway = parRunway;
    }

    @Transient
    public boolean isSetPARRunway() {
        return ((this.parRunway!= null)&&(!this.parRunway.isEmpty()));
    }

    public void unsetPARRunway() {
        this.parRunway = null;
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
    @JoinTable(name = "annotation_radarsystem_link", schema = "surveillance", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radarsystempropertygroup", referencedColumnName = "hjid")
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
     * {@link RadarSystemExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RadarSystemExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RadarSystemExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RadarSystemExtensionType> extension) {
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
    public CodeRadarServiceType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadarServiceType.class, this.getType());
    }

    public void setTypeItem(CodeRadarServiceType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRadarServiceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), RadarSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "model")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "model_nilreason"))
    })
    public TextNameType getModelItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getModel());
    }

    public void setModelItem(TextNameType target) {
        setModel(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "model"), RadarSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "generalterrainmonitor")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "generalterrainmonitor_nilreason"))
    })
    public CodeYesNoType getGeneralTerrainMonitorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getGeneralTerrainMonitor());
    }

    public void setGeneralTerrainMonitorItem(CodeYesNoType target) {
        setGeneralTerrainMonitor(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "generalTerrainMonitor"), RadarSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "broadcastidentifier")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "broadcastidentifier_nilreason"))
    })
    public TextDesignatorType getBroadcastIdentifierItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getBroadcastIdentifier());
    }

    public void setBroadcastIdentifierItem(TextDesignatorType target) {
        setBroadcastIdentifier(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "broadcastIdentifier"), RadarSystemTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportheliport_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAirportHeliport());
    }

    public void setAirportHeliportItem(AirportHeliportPropertyType target) {
        setAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "airportHeliport"), RadarSystemTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), RadarSystemTimeSliceType.class, target));
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
        final RadarSystemTimeSliceType that = ((RadarSystemTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetRadarEquipment();
            boolean rhsFieldIsSet = that.isSetRadarEquipment();
            List<RadarComponentPropertyType> lhsField;
            lhsField = (this.isSetRadarEquipment()?this.getRadarEquipment():null);
            List<RadarComponentPropertyType> rhsField;
            rhsField = (that.isSetRadarEquipment()?that.getRadarEquipment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radarEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radarEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetModel();
            boolean rhsFieldIsSet = that.isSetModel();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getModel();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getModel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "model", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "model", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getAirportHeliport();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPARRunway();
            boolean rhsFieldIsSet = that.isSetPARRunway();
            List<RunwayPropertyType> lhsField;
            lhsField = (this.isSetPARRunway()?this.getPARRunway():null);
            List<RunwayPropertyType> rhsField;
            rhsField = (that.isSetPARRunway()?that.getPARRunway():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parRunway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBroadcastIdentifier();
            boolean rhsFieldIsSet = that.isSetBroadcastIdentifier();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getBroadcastIdentifier();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getBroadcastIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "broadcastIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "broadcastIdentifier", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeneralTerrainMonitor();
            boolean rhsFieldIsSet = that.isSetGeneralTerrainMonitor();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getGeneralTerrainMonitor();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getGeneralTerrainMonitor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "generalTerrainMonitor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "generalTerrainMonitor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeRadarServiceType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeRadarServiceType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
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
            boolean lhsFieldIsSet = this.isSetOffice();
            boolean rhsFieldIsSet = that.isSetOffice();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetOffice()?this.getOffice():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetOffice()?that.getOffice():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "office", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "office", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RadarSystemExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RadarSystemExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeRadarServiceType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetModel();
            JAXBElement<TextNameType> theField;
            theField = this.getModel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "model", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeneralTerrainMonitor();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getGeneralTerrainMonitor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "generalTerrainMonitor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBroadcastIdentifier();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getBroadcastIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "broadcastIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarEquipment();
            List<RadarComponentPropertyType> theField;
            theField = (this.isSetRadarEquipment()?this.getRadarEquipment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radarEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffice();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetOffice()?this.getOffice():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "office", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAirportHeliport();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPARRunway();
            List<RunwayPropertyType> theField;
            theField = (this.isSetPARRunway()?this.getPARRunway():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parRunway", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<RadarSystemExtensionType> theField;
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
            JAXBElement<CodeRadarServiceType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetModel();
            JAXBElement<TextNameType> theField;
            theField = this.getModel();
            strategy.appendField(locator, this, "model", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeneralTerrainMonitor();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getGeneralTerrainMonitor();
            strategy.appendField(locator, this, "generalTerrainMonitor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBroadcastIdentifier();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getBroadcastIdentifier();
            strategy.appendField(locator, this, "broadcastIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarEquipment();
            List<RadarComponentPropertyType> theField;
            theField = (this.isSetRadarEquipment()?this.getRadarEquipment():null);
            strategy.appendField(locator, this, "radarEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffice();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetOffice()?this.getOffice():null);
            strategy.appendField(locator, this, "office", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAirportHeliport();
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPARRunway();
            List<RunwayPropertyType> theField;
            theField = (this.isSetPARRunway()?this.getPARRunway():null);
            strategy.appendField(locator, this, "parRunway", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<RadarSystemExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
