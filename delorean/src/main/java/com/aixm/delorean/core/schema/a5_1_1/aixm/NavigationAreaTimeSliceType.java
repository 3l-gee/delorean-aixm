
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
 * <p>Java class for NavigationAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavigationAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NavigationAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNavigationAreaExtension"/>
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
@XmlType(name = "NavigationAreaTimeSliceType", propOrder = {
    "navigationAreaType",
    "minimumCeiling",
    "minimumVisibility",
    "departure",
    "sector",
    "centrePointFixDesignatedPoint",
    "centrePointNavaidSystem",
    "centrePointPosition",
    "centrePointRunwayPoint",
    "centrePointAimingPoint",
    "centrePointAirportReferencePoint",
    "annotation",
    "extension"
})
@Entity(name = "NavigationAreaTimeSliceType")
@Table(name = "navigationarea_ts", schema = "procedure")
public class NavigationAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "navigationAreaType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationAreaType> navigationAreaType;
    @XmlElementRef(name = "minimumCeiling", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCeiling;
    @XmlElementRef(name = "minimumVisibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> minimumVisibility;
    @XmlElementRef(name = "departure", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> departure;
    @XmlElement(nillable = true)
    protected List<NavigationAreaSectorPropertyType> sector;
    @XmlElementRef(name = "centrePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> centrePointFixDesignatedPoint;
    @XmlElementRef(name = "centrePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> centrePointNavaidSystem;
    @XmlElementRef(name = "centrePoint_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> centrePointPosition;
    @XmlElementRef(name = "centrePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> centrePointRunwayPoint;
    @XmlElementRef(name = "centrePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> centrePointAimingPoint;
    @XmlElementRef(name = "centrePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> centrePointAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavigationAreaExtensionType> extension;

    /**
     * Gets the value of the navigationAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavigationAreaType> getNavigationAreaType() {
        return navigationAreaType;
    }

    /**
     * Sets the value of the navigationAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaType }{@code >}
     *     
     */
    public void setNavigationAreaType(JAXBElement<CodeNavigationAreaType> value) {
        this.navigationAreaType = value;
    }

    @Transient
    public boolean isSetNavigationAreaType() {
        return (this.navigationAreaType!= null);
    }

    /**
     * Gets the value of the minimumCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumCeiling() {
        return minimumCeiling;
    }

    /**
     * Sets the value of the minimumCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCeiling(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCeiling = value;
    }

    @Transient
    public boolean isSetMinimumCeiling() {
        return (this.minimumCeiling!= null);
    }

    /**
     * Gets the value of the minimumVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getMinimumVisibility() {
        return minimumVisibility;
    }

    /**
     * Sets the value of the minimumVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setMinimumVisibility(JAXBElement<ValDistanceType> value) {
        this.minimumVisibility = value;
    }

    @Transient
    public boolean isSetMinimumVisibility() {
        return (this.minimumVisibility!= null);
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentDeparturePropertyType> getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.departure = value;
    }

    @Transient
    public boolean isSetDeparture() {
        return (this.departure!= null);
    }

    /**
     * Gets the value of the sector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationAreaSectorPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavigationAreaSectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "sector_navigationarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "sector", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navigationareapropertygroup", referencedColumnName = "hjid")
    })
    public List<NavigationAreaSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<>();
        }
        return this.sector;
    }

    /**
     * 
     * 
     */
    public void setSector(List<NavigationAreaSectorPropertyType> sector) {
        this.sector = sector;
    }

    @Transient
    public boolean isSetSector() {
        return ((this.sector!= null)&&(!this.sector.isEmpty()));
    }

    public void unsetSector() {
        this.sector = null;
    }

    /**
     * Gets the value of the centrePointFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getCentrePointFixDesignatedPoint() {
        return centrePointFixDesignatedPoint;
    }

    /**
     * Sets the value of the centrePointFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setCentrePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.centrePointFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetCentrePointFixDesignatedPoint() {
        return (this.centrePointFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the centrePointNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getCentrePointNavaidSystem() {
        return centrePointNavaidSystem;
    }

    /**
     * Sets the value of the centrePointNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setCentrePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.centrePointNavaidSystem = value;
    }

    @Transient
    public boolean isSetCentrePointNavaidSystem() {
        return (this.centrePointNavaidSystem!= null);
    }

    /**
     * Gets the value of the centrePointPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getCentrePointPosition() {
        return centrePointPosition;
    }

    /**
     * Sets the value of the centrePointPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setCentrePointPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.centrePointPosition = value;
    }

    @Transient
    public boolean isSetCentrePointPosition() {
        return (this.centrePointPosition!= null);
    }

    /**
     * Gets the value of the centrePointRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getCentrePointRunwayPoint() {
        return centrePointRunwayPoint;
    }

    /**
     * Sets the value of the centrePointRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setCentrePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.centrePointRunwayPoint = value;
    }

    @Transient
    public boolean isSetCentrePointRunwayPoint() {
        return (this.centrePointRunwayPoint!= null);
    }

    /**
     * Gets the value of the centrePointAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getCentrePointAimingPoint() {
        return centrePointAimingPoint;
    }

    /**
     * Sets the value of the centrePointAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setCentrePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.centrePointAimingPoint = value;
    }

    @Transient
    public boolean isSetCentrePointAimingPoint() {
        return (this.centrePointAimingPoint!= null);
    }

    /**
     * Gets the value of the centrePointAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getCentrePointAirportReferencePoint() {
        return centrePointAirportReferencePoint;
    }

    /**
     * Sets the value of the centrePointAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setCentrePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.centrePointAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetCentrePointAirportReferencePoint() {
        return (this.centrePointAirportReferencePoint!= null);
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
    @JoinTable(name = "annotation_navigationarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navigationareapropertygroup", referencedColumnName = "hjid")
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
     * {@link NavigationAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NavigationAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_NAVIGATION_AREA_TI_0")
    public List<NavigationAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NavigationAreaExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "navigationareatype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "navigationareatype_nilreason"))
    })
    public CodeNavigationAreaType getNavigationAreaTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavigationAreaType.class, this.getNavigationAreaType());
    }

    public void setNavigationAreaTypeItem(CodeNavigationAreaType target) {
        setNavigationAreaType(XmlAdapterUtils.marshallJAXBElement(CodeNavigationAreaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "navigationAreaType"), NavigationAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumceiling")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumceiling_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumceiling_nilreason"))
    })
    public ValDistanceVerticalType getMinimumCeilingItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumCeiling());
    }

    public void setMinimumCeilingItem(ValDistanceVerticalType target) {
        setMinimumCeiling(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumCeiling"), NavigationAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumvisibility")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumvisibility_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumvisibility_nilreason"))
    })
    public ValDistanceType getMinimumVisibilityItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getMinimumVisibility());
    }

    public void setMinimumVisibilityItem(ValDistanceType target) {
        setMinimumVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumVisibility"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentDeparturePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_id", referencedColumnName = "hjid")
    public StandardInstrumentDeparturePropertyType getDepartureItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentDeparturePropertyType.class, this.getDeparture());
    }

    public void setDepartureItem(StandardInstrumentDeparturePropertyType target) {
        setDeparture(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentDeparturePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "departure"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getCentrePointFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getCentrePointFixDesignatedPoint());
    }

    public void setCentrePointFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setCentrePointFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_fixDesignatedPoint"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getCentrePointNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getCentrePointNavaidSystem());
    }

    public void setCentrePointNavaidSystemItem(NavaidPropertyType target) {
        setCentrePointNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_navaidSystem"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getCentrePointPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getCentrePointPosition());
    }

    public void setCentrePointPositionItem(AIXMPointPropertyType target) {
        setCentrePointPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_position"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getCentrePointRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getCentrePointRunwayPoint());
    }

    public void setCentrePointRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setCentrePointRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_runwayPoint"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getCentrePointAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getCentrePointAimingPoint());
    }

    public void setCentrePointAimingPointItem(TouchDownLiftOffPropertyType target) {
        setCentrePointAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_aimingPoint"), NavigationAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "centrepoint_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getCentrePointAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getCentrePointAirportReferencePoint());
    }

    public void setCentrePointAirportReferencePointItem(AirportHeliportPropertyType target) {
        setCentrePointAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "centrePoint_airportReferencePoint"), NavigationAreaTimeSliceType.class, target));
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
        final NavigationAreaTimeSliceType that = ((NavigationAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinimumCeiling();
            boolean rhsFieldIsSet = that.isSetMinimumCeiling();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumCeiling();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumCeiling();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumCeiling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumCeiling", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<NavigationAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NavigationAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointAimingPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getCentrePointAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSector();
            boolean rhsFieldIsSet = that.isSetSector();
            List<NavigationAreaSectorPropertyType> lhsField;
            lhsField = (this.isSetSector()?this.getSector():null);
            List<NavigationAreaSectorPropertyType> rhsField;
            rhsField = (that.isSetSector()?that.getSector():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointPosition();
            boolean rhsFieldIsSet = that.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getCentrePointPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointRunwayPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getCentrePointRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDeparture();
            boolean rhsFieldIsSet = that.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> lhsField;
            lhsField = this.getDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> rhsField;
            rhsField = that.getDeparture();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "departure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "departure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavigationAreaType();
            boolean rhsFieldIsSet = that.isSetNavigationAreaType();
            JAXBElement<CodeNavigationAreaType> lhsField;
            lhsField = this.getNavigationAreaType();
            JAXBElement<CodeNavigationAreaType> rhsField;
            rhsField = that.getNavigationAreaType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationAreaType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationAreaType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumVisibility();
            boolean rhsFieldIsSet = that.isSetMinimumVisibility();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getMinimumVisibility();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getMinimumVisibility();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumVisibility", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumVisibility", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getCentrePointAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointNavaidSystem();
            boolean rhsFieldIsSet = that.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getCentrePointNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getCentrePointFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointFixDesignatedPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetNavigationAreaType();
            JAXBElement<CodeNavigationAreaType> theField;
            theField = this.getNavigationAreaType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationAreaType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCeiling();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCeiling();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumCeiling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMinimumVisibility();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumVisibility", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getDeparture();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "departure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<NavigationAreaSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getCentrePointFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getCentrePointNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getCentrePointPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getCentrePointRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getCentrePointAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getCentrePointAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointAirportReferencePoint", theField);
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
            List<NavigationAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetNavigationAreaType();
            JAXBElement<CodeNavigationAreaType> theField;
            theField = this.getNavigationAreaType();
            strategy.appendField(locator, this, "navigationAreaType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCeiling();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCeiling();
            strategy.appendField(locator, this, "minimumCeiling", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMinimumVisibility();
            strategy.appendField(locator, this, "minimumVisibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getDeparture();
            strategy.appendField(locator, this, "departure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<NavigationAreaSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            strategy.appendField(locator, this, "sector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getCentrePointFixDesignatedPoint();
            strategy.appendField(locator, this, "centrePointFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getCentrePointNavaidSystem();
            strategy.appendField(locator, this, "centrePointNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getCentrePointPosition();
            strategy.appendField(locator, this, "centrePointPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getCentrePointRunwayPoint();
            strategy.appendField(locator, this, "centrePointRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getCentrePointAimingPoint();
            strategy.appendField(locator, this, "centrePointAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getCentrePointAirportReferencePoint();
            strategy.appendField(locator, this, "centrePointAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NavigationAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
