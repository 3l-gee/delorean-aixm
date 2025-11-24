
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
 * <p>Java class for AerialRefuellingAnchorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingAnchorType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingAnchorPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAerialRefuellingAnchorExtension"/>
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
@XmlType(name = "AerialRefuellingAnchorType", propOrder = {
    "outboundCourse",
    "outboundCourseType",
    "inboundCourse",
    "turnDirection",
    "speedLimit",
    "legSeparation",
    "legLength",
    "refuellingBaseLevel",
    "refuellingBaseLevelReference",
    "extent",
    "verticalExtent",
    "point",
    "annotation",
    "extension"
})
@Entity(name = "AerialRefuellingAnchorType")
@Table(name = "aerialrefuellinganchor", schema = "aerial_refuelling")
public class AerialRefuellingAnchorType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "outboundCourse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> outboundCourse;
    @XmlElementRef(name = "outboundCourseType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> outboundCourseType;
    @XmlElementRef(name = "inboundCourse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> inboundCourse;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "legSeparation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legSeparation;
    @XmlElementRef(name = "legLength", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legLength;
    @XmlElementRef(name = "refuellingBaseLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> refuellingBaseLevel;
    @XmlElementRef(name = "refuellingBaseLevelReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> refuellingBaseLevelReference;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<AirspaceLayerPropertyType> verticalExtent;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingPointPropertyType> point;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AerialRefuellingAnchorTypeExtensionType> extension;

    /**
     * Gets the value of the outboundCourse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getOutboundCourse() {
        return outboundCourse;
    }

    /**
     * Sets the value of the outboundCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setOutboundCourse(JAXBElement<ValBearingType> value) {
        this.outboundCourse = value;
    }

    @Transient
    public boolean isSetOutboundCourse() {
        return (this.outboundCourse!= null);
    }

    /**
     * Gets the value of the outboundCourseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCourseType> getOutboundCourseType() {
        return outboundCourseType;
    }

    /**
     * Sets the value of the outboundCourseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public void setOutboundCourseType(JAXBElement<CodeCourseType> value) {
        this.outboundCourseType = value;
    }

    @Transient
    public boolean isSetOutboundCourseType() {
        return (this.outboundCourseType!= null);
    }

    /**
     * Gets the value of the inboundCourse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getInboundCourse() {
        return inboundCourse;
    }

    /**
     * Sets the value of the inboundCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setInboundCourse(JAXBElement<ValBearingType> value) {
        this.inboundCourse = value;
    }

    @Transient
    public boolean isSetInboundCourse() {
        return (this.inboundCourse!= null);
    }

    /**
     * Gets the value of the turnDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Sets the value of the turnDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    @Transient
    public boolean isSetTurnDirection() {
        return (this.turnDirection!= null);
    }

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeedLimit(JAXBElement<ValSpeedType> value) {
        this.speedLimit = value;
    }

    @Transient
    public boolean isSetSpeedLimit() {
        return (this.speedLimit!= null);
    }

    /**
     * Gets the value of the legSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLegSeparation() {
        return legSeparation;
    }

    /**
     * Sets the value of the legSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegSeparation(JAXBElement<ValDistanceType> value) {
        this.legSeparation = value;
    }

    @Transient
    public boolean isSetLegSeparation() {
        return (this.legSeparation!= null);
    }

    /**
     * Gets the value of the legLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLegLength() {
        return legLength;
    }

    /**
     * Sets the value of the legLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegLength(JAXBElement<ValDistanceType> value) {
        this.legLength = value;
    }

    @Transient
    public boolean isSetLegLength() {
        return (this.legLength!= null);
    }

    /**
     * Gets the value of the refuellingBaseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getRefuellingBaseLevel() {
        return refuellingBaseLevel;
    }

    /**
     * Sets the value of the refuellingBaseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setRefuellingBaseLevel(JAXBElement<ValDistanceVerticalType> value) {
        this.refuellingBaseLevel = value;
    }

    @Transient
    public boolean isSetRefuellingBaseLevel() {
        return (this.refuellingBaseLevel!= null);
    }

    /**
     * Gets the value of the refuellingBaseLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getRefuellingBaseLevelReference() {
        return refuellingBaseLevelReference;
    }

    /**
     * Sets the value of the refuellingBaseLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setRefuellingBaseLevelReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.refuellingBaseLevelReference = value;
    }

    @Transient
    public boolean isSetRefuellingBaseLevelReference() {
        return (this.refuellingBaseLevelReference!= null);
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<AIXMSurfacePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the verticalExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalExtent().add(newItem);
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
    @JoinTable(name = "verticalextent_aerialrefuellinganchor_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "verticalextent", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellinganchorpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspaceLayerPropertyType> getVerticalExtent() {
        if (verticalExtent == null) {
            verticalExtent = new ArrayList<>();
        }
        return this.verticalExtent;
    }

    /**
     * 
     * 
     */
    public void setVerticalExtent(List<AirspaceLayerPropertyType> verticalExtent) {
        this.verticalExtent = verticalExtent;
    }

    @Transient
    public boolean isSetVerticalExtent() {
        return ((this.verticalExtent!= null)&&(!this.verticalExtent.isEmpty()));
    }

    public void unsetVerticalExtent() {
        this.verticalExtent = null;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingPointPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AerialRefuellingPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "point_aerialrefuellinganchor_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "point", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellinganchorpropertygroup", referencedColumnName = "hjid")
    })
    public List<AerialRefuellingPointPropertyType> getPoint() {
        if (point == null) {
            point = new ArrayList<>();
        }
        return this.point;
    }

    /**
     * 
     * 
     */
    public void setPoint(List<AerialRefuellingPointPropertyType> point) {
        this.point = point;
    }

    @Transient
    public boolean isSetPoint() {
        return ((this.point!= null)&&(!this.point.isEmpty()));
    }

    public void unsetPoint() {
        this.point = null;
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
    @JoinTable(name = "annotation_aerialrefuellinganchor_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellinganchorpropertygroup", referencedColumnName = "hjid")
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
     * {@link AerialRefuellingAnchorTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AerialRefuellingAnchorTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<AerialRefuellingAnchorTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AerialRefuellingAnchorTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "outboundcourse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcourse_nilreason"))
    })
    public ValBearingType getOutboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getOutboundCourse());
    }

    public void setOutboundCourseItem(ValBearingType target) {
        setOutboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundCourse"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outboundcoursetype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcoursetype_nilreason"))
    })
    public CodeCourseType getOutboundCourseTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseType.class, this.getOutboundCourseType());
    }

    public void setOutboundCourseTypeItem(CodeCourseType target) {
        setOutboundCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundCourseType"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "inboundcourse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "inboundcourse_nilreason"))
    })
    public ValBearingType getInboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getInboundCourse());
    }

    public void setInboundCourseItem(ValBearingType target) {
        setInboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "inboundCourse"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turndirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turndirection_nilreason"))
    })
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "speedlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedlimit_nilreason"))
    })
    public ValSpeedType getSpeedLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeedLimit());
    }

    public void setSpeedLimitItem(ValSpeedType target) {
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedLimit"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "legseparation")),
        @AttributeOverride(name = "uom", column = @Column(name = "legseparation_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "legseparation_nilreason"))
    })
    public ValDistanceType getLegSeparationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLegSeparation());
    }

    public void setLegSeparationItem(ValDistanceType target) {
        setLegSeparation(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legSeparation"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "leglength")),
        @AttributeOverride(name = "uom", column = @Column(name = "leglength_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "leglength_nilreason"))
    })
    public ValDistanceType getLegLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLegLength());
    }

    public void setLegLengthItem(ValDistanceType target) {
        setLegLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legLength"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "refuellingbaselevel")),
        @AttributeOverride(name = "uom", column = @Column(name = "refuellingbaselevel_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "refuellingbaselevel_nilreason"))
    })
    public ValDistanceVerticalType getRefuellingBaseLevelItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getRefuellingBaseLevel());
    }

    public void setRefuellingBaseLevelItem(ValDistanceVerticalType target) {
        setRefuellingBaseLevel(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "refuellingBaseLevel"), AerialRefuellingAnchorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "refuellingbaselevelreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "refuellingbaselevelreference_nilreason"))
    })
    public CodeVerticalReferenceType getRefuellingBaseLevelReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getRefuellingBaseLevelReference());
    }

    public void setRefuellingBaseLevelReferenceItem(CodeVerticalReferenceType target) {
        setRefuellingBaseLevelReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "refuellingBaseLevelReference"), AerialRefuellingAnchorType.class, target));
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMSurfacePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent"), AerialRefuellingAnchorType.class, target));
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
        final AerialRefuellingAnchorType that = ((AerialRefuellingAnchorType) object);
        {
            boolean lhsFieldIsSet = this.isSetRefuellingBaseLevel();
            boolean rhsFieldIsSet = that.isSetRefuellingBaseLevel();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getRefuellingBaseLevel();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getRefuellingBaseLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "refuellingBaseLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "refuellingBaseLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedLimit();
            boolean rhsFieldIsSet = that.isSetSpeedLimit();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeedLimit();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeedLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPoint();
            boolean rhsFieldIsSet = that.isSetPoint();
            List<AerialRefuellingPointPropertyType> lhsField;
            lhsField = (this.isSetPoint()?this.getPoint():null);
            List<AerialRefuellingPointPropertyType> rhsField;
            rhsField = (that.isSetPoint()?that.getPoint():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "point", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "point", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTurnDirection();
            boolean rhsFieldIsSet = that.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getTurnDirection();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getTurnDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRefuellingBaseLevelReference();
            boolean rhsFieldIsSet = that.isSetRefuellingBaseLevelReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getRefuellingBaseLevelReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getRefuellingBaseLevelReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "refuellingBaseLevelReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "refuellingBaseLevelReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOutboundCourse();
            boolean rhsFieldIsSet = that.isSetOutboundCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getOutboundCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getOutboundCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundCourse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundCourse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegLength();
            boolean rhsFieldIsSet = that.isSetLegLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLegLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLegLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legLength", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInboundCourse();
            boolean rhsFieldIsSet = that.isSetInboundCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getInboundCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getInboundCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "inboundCourse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "inboundCourse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOutboundCourseType();
            boolean rhsFieldIsSet = that.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> lhsField;
            lhsField = this.getOutboundCourseType();
            JAXBElement<CodeCourseType> rhsField;
            rhsField = that.getOutboundCourseType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundCourseType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundCourseType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegSeparation();
            boolean rhsFieldIsSet = that.isSetLegSeparation();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLegSeparation();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLegSeparation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legSeparation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legSeparation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AerialRefuellingAnchorTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AerialRefuellingAnchorTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalExtent();
            boolean rhsFieldIsSet = that.isSetVerticalExtent();
            List<AirspaceLayerPropertyType> lhsField;
            lhsField = (this.isSetVerticalExtent()?this.getVerticalExtent():null);
            List<AirspaceLayerPropertyType> rhsField;
            rhsField = (that.isSetVerticalExtent()?that.getVerticalExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetOutboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getOutboundCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundCourse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getOutboundCourseType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundCourseType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getInboundCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "inboundCourse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegSeparation();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegSeparation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legSeparation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRefuellingBaseLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRefuellingBaseLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "refuellingBaseLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRefuellingBaseLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getRefuellingBaseLevelReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "refuellingBaseLevelReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtent();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetVerticalExtent()?this.getVerticalExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPoint();
            List<AerialRefuellingPointPropertyType> theField;
            theField = (this.isSetPoint()?this.getPoint():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "point", theField);
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
            List<AerialRefuellingAnchorTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetOutboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getOutboundCourse();
            strategy.appendField(locator, this, "outboundCourse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getOutboundCourseType();
            strategy.appendField(locator, this, "outboundCourseType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getInboundCourse();
            strategy.appendField(locator, this, "inboundCourse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            strategy.appendField(locator, this, "turnDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            strategy.appendField(locator, this, "speedLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegSeparation();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegSeparation();
            strategy.appendField(locator, this, "legSeparation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLength();
            strategy.appendField(locator, this, "legLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRefuellingBaseLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRefuellingBaseLevel();
            strategy.appendField(locator, this, "refuellingBaseLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRefuellingBaseLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getRefuellingBaseLevelReference();
            strategy.appendField(locator, this, "refuellingBaseLevelReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtent();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetVerticalExtent()?this.getVerticalExtent():null);
            strategy.appendField(locator, this, "verticalExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPoint();
            List<AerialRefuellingPointPropertyType> theField;
            theField = (this.isSetPoint()?this.getPoint():null);
            strategy.appendField(locator, this, "point", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AerialRefuellingAnchorTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
