
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
 * <p>Java class for AerialRefuellingPointType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingPointType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentPointType">
 *       <sequence>
 *         <element name="reportingATC" type="{http://www.aixm.aero/schema/5.1.1}CodeATCReportingType" minOccurs="0"/>
 *         <element name="flyOver" type="{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="waypoint" type="{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="radarGuidance" type="{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="facilityMakeup" type="{http://www.aixm.aero/schema/5.1.1}PointReferencePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="pointChoice_fixDesignatedPoint" type="{http://www.aixm.aero/schema/5.1.1}DesignatedPointPropertyType" minOccurs="0"/>
 *           <element name="pointChoice_navaidSystem" type="{http://www.aixm.aero/schema/5.1.1}NavaidPropertyType" minOccurs="0"/>
 *           <element name="pointChoice_position" type="{http://www.aixm.aero/schema/5.1.1}PointPropertyType" minOccurs="0"/>
 *           <element name="pointChoice_runwayPoint" type="{http://www.aixm.aero/schema/5.1.1}RunwayCentrelinePointPropertyType" minOccurs="0"/>
 *           <element name="pointChoice_aimingPoint" type="{http://www.aixm.aero/schema/5.1.1}TouchDownLiftOffPropertyType" minOccurs="0"/>
 *           <element name="pointChoice_airportReferencePoint" type="{http://www.aixm.aero/schema/5.1.1}AirportHeliportPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="extendedServiceVolume" type="{http://www.aixm.aero/schema/5.1.1}RadioFrequencyAreaPropertyType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingPointPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentPointExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAerialRefuellingPointExtension"/>
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
@XmlType(name = "AerialRefuellingPointType", propOrder = {
    "reportingATC",
    "flyOver",
    "waypoint",
    "radarGuidance",
    "facilityMakeup",
    "pointChoiceFixDesignatedPoint",
    "pointChoiceNavaidSystem",
    "pointChoicePosition",
    "pointChoiceRunwayPoint",
    "pointChoiceAimingPoint",
    "pointChoiceAirportReferencePoint",
    "extendedServiceVolume",
    "annotation",
    "sequence",
    "usageType",
    "extension"
})
@Entity(name = "AerialRefuellingPointType")
@Table(name = "aerialrefuellingpoint", schema = "aerial_refuelling")
public class AerialRefuellingPointType
    extends AbstractSegmentPointType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "reportingATC", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeATCReportingType> reportingATC;
    @XmlElementRef(name = "flyOver", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flyOver;
    @XmlElementRef(name = "waypoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> waypoint;
    @XmlElementRef(name = "radarGuidance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> radarGuidance;
    @XmlElement(nillable = true)
    protected List<PointReferencePropertyType> facilityMakeup;
    @XmlElementRef(name = "pointChoice_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointChoiceFixDesignatedPoint;
    @XmlElementRef(name = "pointChoice_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointChoiceNavaidSystem;
    @XmlElementRef(name = "pointChoice_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> pointChoicePosition;
    @XmlElementRef(name = "pointChoice_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointChoiceRunwayPoint;
    @XmlElementRef(name = "pointChoice_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointChoiceAimingPoint;
    @XmlElementRef(name = "pointChoice_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointChoiceAirportReferencePoint;
    @XmlElementRef(name = "extendedServiceVolume", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadioFrequencyAreaPropertyType> extendedServiceVolume;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "sequence", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> sequence;
    @XmlElementRef(name = "usageType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAerialRefuellingPointType> usageType;
    protected List<AerialRefuellingPointTypeExtensionType> extension;

    /**
     * Gets the value of the reportingATC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeATCReportingType> getReportingATC() {
        return reportingATC;
    }

    /**
     * Sets the value of the reportingATC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    public void setReportingATC(JAXBElement<CodeATCReportingType> value) {
        this.reportingATC = value;
    }

    @Transient
    public boolean isSetReportingATC() {
        return (this.reportingATC!= null);
    }

    /**
     * Gets the value of the flyOver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFlyOver() {
        return flyOver;
    }

    /**
     * Sets the value of the flyOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlyOver(JAXBElement<CodeYesNoType> value) {
        this.flyOver = value;
    }

    @Transient
    public boolean isSetFlyOver() {
        return (this.flyOver!= null);
    }

    /**
     * Gets the value of the waypoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getWaypoint() {
        return waypoint;
    }

    /**
     * Sets the value of the waypoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWaypoint(JAXBElement<CodeYesNoType> value) {
        this.waypoint = value;
    }

    @Transient
    public boolean isSetWaypoint() {
        return (this.waypoint!= null);
    }

    /**
     * Gets the value of the radarGuidance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRadarGuidance() {
        return radarGuidance;
    }

    /**
     * Sets the value of the radarGuidance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRadarGuidance(JAXBElement<CodeYesNoType> value) {
        this.radarGuidance = value;
    }

    @Transient
    public boolean isSetRadarGuidance() {
        return (this.radarGuidance!= null);
    }

    /**
     * Gets the value of the facilityMakeup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMakeup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMakeup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointReferencePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = PointReferencePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "facilitymakeup_aerialrefuellingpoint_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "facilitymakeup", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpointtype", referencedColumnName = "hjid")
    })
    public List<PointReferencePropertyType> getFacilityMakeup() {
        if (facilityMakeup == null) {
            facilityMakeup = new ArrayList<>();
        }
        return this.facilityMakeup;
    }

    /**
     * 
     * 
     */
    public void setFacilityMakeup(List<PointReferencePropertyType> facilityMakeup) {
        this.facilityMakeup = facilityMakeup;
    }

    @Transient
    public boolean isSetFacilityMakeup() {
        return ((this.facilityMakeup!= null)&&(!this.facilityMakeup.isEmpty()));
    }

    public void unsetFacilityMakeup() {
        this.facilityMakeup = null;
    }

    /**
     * Gets the value of the pointChoiceFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getPointChoiceFixDesignatedPoint() {
        return pointChoiceFixDesignatedPoint;
    }

    /**
     * Sets the value of the pointChoiceFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointChoiceFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetPointChoiceFixDesignatedPoint() {
        return (this.pointChoiceFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the pointChoiceNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getPointChoiceNavaidSystem() {
        return pointChoiceNavaidSystem;
    }

    /**
     * Sets the value of the pointChoiceNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointChoiceNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointChoiceNavaidSystem = value;
    }

    @Transient
    public boolean isSetPointChoiceNavaidSystem() {
        return (this.pointChoiceNavaidSystem!= null);
    }

    /**
     * Gets the value of the pointChoicePosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getPointChoicePosition() {
        return pointChoicePosition;
    }

    /**
     * Sets the value of the pointChoicePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setPointChoicePosition(JAXBElement<AIXMPointPropertyType> value) {
        this.pointChoicePosition = value;
    }

    @Transient
    public boolean isSetPointChoicePosition() {
        return (this.pointChoicePosition!= null);
    }

    /**
     * Gets the value of the pointChoiceRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointChoiceRunwayPoint() {
        return pointChoiceRunwayPoint;
    }

    /**
     * Sets the value of the pointChoiceRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointChoiceRunwayPoint = value;
    }

    @Transient
    public boolean isSetPointChoiceRunwayPoint() {
        return (this.pointChoiceRunwayPoint!= null);
    }

    /**
     * Gets the value of the pointChoiceAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getPointChoiceAimingPoint() {
        return pointChoiceAimingPoint;
    }

    /**
     * Sets the value of the pointChoiceAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointChoiceAimingPoint = value;
    }

    @Transient
    public boolean isSetPointChoiceAimingPoint() {
        return (this.pointChoiceAimingPoint!= null);
    }

    /**
     * Gets the value of the pointChoiceAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getPointChoiceAirportReferencePoint() {
        return pointChoiceAirportReferencePoint;
    }

    /**
     * Sets the value of the pointChoiceAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointChoiceAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetPointChoiceAirportReferencePoint() {
        return (this.pointChoiceAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the extendedServiceVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RadioFrequencyAreaPropertyType> getExtendedServiceVolume() {
        return extendedServiceVolume;
    }

    /**
     * Sets the value of the extendedServiceVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaPropertyType }{@code >}
     *     
     */
    public void setExtendedServiceVolume(JAXBElement<RadioFrequencyAreaPropertyType> value) {
        this.extendedServiceVolume = value;
    }

    @Transient
    public boolean isSetExtendedServiceVolume() {
        return (this.extendedServiceVolume!= null);
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
    @JoinTable(name = "annotation_aerialrefuellingpoint_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpointtype", referencedColumnName = "hjid")
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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setSequence(JAXBElement<NoSequenceType> value) {
        this.sequence = value;
    }

    @Transient
    public boolean isSetSequence() {
        return (this.sequence!= null);
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPointType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAerialRefuellingPointType> getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPointType }{@code >}
     *     
     */
    public void setUsageType(JAXBElement<CodeAerialRefuellingPointType> value) {
        this.usageType = value;
    }

    @Transient
    public boolean isSetUsageType() {
        return (this.usageType!= null);
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
     * {@link AerialRefuellingPointTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AerialRefuellingPointTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AERIAL_REFUELLING__2")
    public List<AerialRefuellingPointTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AerialRefuellingPointTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "reportingatc")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "reportingatc_nilreason"))
    })
    public CodeATCReportingType getReportingATCItem() {
        return XmlAdapterUtils.unmarshallSource(CodeATCReportingType.class, this.getReportingATC());
    }

    public void setReportingATCItem(CodeATCReportingType target) {
        setReportingATC(XmlAdapterUtils.marshallJAXBElement(CodeATCReportingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reportingATC"), AerialRefuellingPointType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "flyover")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flyover_nilreason"))
    })
    public CodeYesNoType getFlyOverItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlyOver());
    }

    public void setFlyOverItem(CodeYesNoType target) {
        setFlyOver(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flyOver"), AerialRefuellingPointType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "waypoint")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "waypoint_nilreason"))
    })
    public CodeYesNoType getWaypointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getWaypoint());
    }

    public void setWaypointItem(CodeYesNoType target) {
        setWaypoint(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "waypoint"), AerialRefuellingPointType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "radarguidance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "radarguidance_nilreason"))
    })
    public CodeYesNoType getRadarGuidanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRadarGuidance());
    }

    public void setRadarGuidanceItem(CodeYesNoType target) {
        setRadarGuidance(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "radarGuidance"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getPointChoiceFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getPointChoiceFixDesignatedPoint());
    }

    public void setPointChoiceFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setPointChoiceFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_fixDesignatedPoint"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getPointChoiceNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getPointChoiceNavaidSystem());
    }

    public void setPointChoiceNavaidSystemItem(NavaidPropertyType target) {
        setPointChoiceNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_navaidSystem"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getPointChoicePositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getPointChoicePosition());
    }

    public void setPointChoicePositionItem(AIXMPointPropertyType target) {
        setPointChoicePosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_position"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getPointChoiceRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getPointChoiceRunwayPoint());
    }

    public void setPointChoiceRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setPointChoiceRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_runwayPoint"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getPointChoiceAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getPointChoiceAimingPoint());
    }

    public void setPointChoiceAimingPointItem(TouchDownLiftOffPropertyType target) {
        setPointChoiceAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_aimingPoint"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getPointChoiceAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getPointChoiceAirportReferencePoint());
    }

    public void setPointChoiceAirportReferencePointItem(AirportHeliportPropertyType target) {
        setPointChoiceAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_airportReferencePoint"), AerialRefuellingPointType.class, target));
    }

    @ManyToOne(targetEntity = RadioFrequencyAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extendedservicevolume_id", referencedColumnName = "hjid")
    public RadioFrequencyAreaPropertyType getExtendedServiceVolumeItem() {
        return XmlAdapterUtils.unmarshallSource(RadioFrequencyAreaPropertyType.class, this.getExtendedServiceVolume());
    }

    public void setExtendedServiceVolumeItem(RadioFrequencyAreaPropertyType target) {
        setExtendedServiceVolume(XmlAdapterUtils.marshallJAXBElement(RadioFrequencyAreaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extendedServiceVolume"), AerialRefuellingPointType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "sequence")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "sequence_nilreason"))
    })
    public NoSequenceType getSequenceItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getSequence());
    }

    public void setSequenceItem(NoSequenceType target) {
        setSequence(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "sequence"), AerialRefuellingPointType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "usagetype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "usagetype_nilreason"))
    })
    public CodeAerialRefuellingPointType getUsageTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAerialRefuellingPointType.class, this.getUsageType());
    }

    public void setUsageTypeItem(CodeAerialRefuellingPointType target) {
        setUsageType(XmlAdapterUtils.marshallJAXBElement(CodeAerialRefuellingPointType.class, new QName("http://www.aixm.aero/schema/5.1.1", "usageType"), AerialRefuellingPointType.class, target));
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
        final AerialRefuellingPointType that = ((AerialRefuellingPointType) object);
        {
            boolean lhsFieldIsSet = this.isSetWaypoint();
            boolean rhsFieldIsSet = that.isSetWaypoint();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getWaypoint();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getWaypoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "waypoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "waypoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoiceNavaidSystem();
            boolean rhsFieldIsSet = that.isSetPointChoiceNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getPointChoiceNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getPointChoiceNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoiceNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoiceNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlyOver();
            boolean rhsFieldIsSet = that.isSetFlyOver();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFlyOver();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFlyOver();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flyOver", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flyOver", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoiceRunwayPoint();
            boolean rhsFieldIsSet = that.isSetPointChoiceRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getPointChoiceRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getPointChoiceRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoiceRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoiceRunwayPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetReportingATC();
            boolean rhsFieldIsSet = that.isSetReportingATC();
            JAXBElement<CodeATCReportingType> lhsField;
            lhsField = this.getReportingATC();
            JAXBElement<CodeATCReportingType> rhsField;
            rhsField = that.getReportingATC();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reportingATC", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reportingATC", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFacilityMakeup();
            boolean rhsFieldIsSet = that.isSetFacilityMakeup();
            List<PointReferencePropertyType> lhsField;
            lhsField = (this.isSetFacilityMakeup()?this.getFacilityMakeup():null);
            List<PointReferencePropertyType> rhsField;
            rhsField = (that.isSetFacilityMakeup()?that.getFacilityMakeup():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "facilityMakeup", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "facilityMakeup", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AerialRefuellingPointTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AerialRefuellingPointTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoiceFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetPointChoiceFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getPointChoiceFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getPointChoiceFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoiceFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoiceFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadarGuidance();
            boolean rhsFieldIsSet = that.isSetRadarGuidance();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRadarGuidance();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRadarGuidance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radarGuidance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radarGuidance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSequence();
            boolean rhsFieldIsSet = that.isSetSequence();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getSequence();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getSequence();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sequence", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sequence", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoiceAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetPointChoiceAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getPointChoiceAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getPointChoiceAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoiceAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoiceAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoiceAimingPoint();
            boolean rhsFieldIsSet = that.isSetPointChoiceAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getPointChoiceAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getPointChoiceAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoiceAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoiceAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUsageType();
            boolean rhsFieldIsSet = that.isSetUsageType();
            JAXBElement<CodeAerialRefuellingPointType> lhsField;
            lhsField = this.getUsageType();
            JAXBElement<CodeAerialRefuellingPointType> rhsField;
            rhsField = that.getUsageType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usageType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usageType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtendedServiceVolume();
            boolean rhsFieldIsSet = that.isSetExtendedServiceVolume();
            JAXBElement<RadioFrequencyAreaPropertyType> lhsField;
            lhsField = this.getExtendedServiceVolume();
            JAXBElement<RadioFrequencyAreaPropertyType> rhsField;
            rhsField = that.getExtendedServiceVolume();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extendedServiceVolume", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extendedServiceVolume", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointChoicePosition();
            boolean rhsFieldIsSet = that.isSetPointChoicePosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getPointChoicePosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getPointChoicePosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointChoicePosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointChoicePosition", rhsField);
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
            boolean theFieldIsSet = this.isSetReportingATC();
            JAXBElement<CodeATCReportingType> theField;
            theField = this.getReportingATC();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reportingATC", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlyOver();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlyOver();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flyOver", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWaypoint();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWaypoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "waypoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarGuidance();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRadarGuidance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radarGuidance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityMakeup();
            List<PointReferencePropertyType> theField;
            theField = (this.isSetFacilityMakeup()?this.getFacilityMakeup():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "facilityMakeup", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPointChoiceFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoiceFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getPointChoiceNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoiceNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoicePosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getPointChoicePosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoicePosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getPointChoiceRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoiceRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getPointChoiceAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoiceAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getPointChoiceAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointChoiceAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtendedServiceVolume();
            JAXBElement<RadioFrequencyAreaPropertyType> theField;
            theField = this.getExtendedServiceVolume();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extendedServiceVolume", theField);
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
            boolean theFieldIsSet = this.isSetSequence();
            JAXBElement<NoSequenceType> theField;
            theField = this.getSequence();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sequence", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsageType();
            JAXBElement<CodeAerialRefuellingPointType> theField;
            theField = this.getUsageType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usageType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AerialRefuellingPointTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetReportingATC();
            JAXBElement<CodeATCReportingType> theField;
            theField = this.getReportingATC();
            strategy.appendField(locator, this, "reportingATC", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlyOver();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlyOver();
            strategy.appendField(locator, this, "flyOver", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWaypoint();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWaypoint();
            strategy.appendField(locator, this, "waypoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarGuidance();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRadarGuidance();
            strategy.appendField(locator, this, "radarGuidance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityMakeup();
            List<PointReferencePropertyType> theField;
            theField = (this.isSetFacilityMakeup()?this.getFacilityMakeup():null);
            strategy.appendField(locator, this, "facilityMakeup", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPointChoiceFixDesignatedPoint();
            strategy.appendField(locator, this, "pointChoiceFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getPointChoiceNavaidSystem();
            strategy.appendField(locator, this, "pointChoiceNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoicePosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getPointChoicePosition();
            strategy.appendField(locator, this, "pointChoicePosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getPointChoiceRunwayPoint();
            strategy.appendField(locator, this, "pointChoiceRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getPointChoiceAimingPoint();
            strategy.appendField(locator, this, "pointChoiceAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointChoiceAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getPointChoiceAirportReferencePoint();
            strategy.appendField(locator, this, "pointChoiceAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtendedServiceVolume();
            JAXBElement<RadioFrequencyAreaPropertyType> theField;
            theField = this.getExtendedServiceVolume();
            strategy.appendField(locator, this, "extendedServiceVolume", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSequence();
            JAXBElement<NoSequenceType> theField;
            theField = this.getSequence();
            strategy.appendField(locator, this, "sequence", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsageType();
            JAXBElement<CodeAerialRefuellingPointType> theField;
            theField = this.getUsageType();
            strategy.appendField(locator, this, "usageType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AerialRefuellingPointTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
