
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
 * <p>Java class for AngleIndicationTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AngleIndicationTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AngleIndicationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAngleIndicationExtension"/>
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
@XmlType(name = "AngleIndicationTimeSliceType", propOrder = {
    "angle",
    "angleType",
    "indicationDirection",
    "trueAngle",
    "cardinalDirection",
    "minimumReceptionAltitude",
    "fix",
    "pointChoiceFixDesignatedPoint",
    "pointChoiceNavaidSystem",
    "pointChoicePosition",
    "pointChoiceRunwayPoint",
    "pointChoiceAimingPoint",
    "pointChoiceAirportReferencePoint",
    "annotation",
    "extension"
})
@Entity(name = "AngleIndicationTimeSliceType")
@Table(name = "angleindication_ts", schema = "navaids_point")
public class AngleIndicationTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "angle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> angle;
    @XmlElementRef(name = "angleType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeBearingType> angleType;
    @XmlElementRef(name = "indicationDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> indicationDirection;
    @XmlElementRef(name = "trueAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueAngle;
    @XmlElementRef(name = "cardinalDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElementRef(name = "minimumReceptionAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumReceptionAltitude;
    @XmlElementRef(name = "fix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> fix;
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
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AngleIndicationExtensionType> extension;

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setAngle(JAXBElement<ValBearingType> value) {
        this.angle = value;
    }

    @Transient
    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Gets the value of the angleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeBearingType> getAngleType() {
        return angleType;
    }

    /**
     * Sets the value of the angleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeBearingType }{@code >}
     *     
     */
    public void setAngleType(JAXBElement<CodeBearingType> value) {
        this.angleType = value;
    }

    @Transient
    public boolean isSetAngleType() {
        return (this.angleType!= null);
    }

    /**
     * Gets the value of the indicationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionReferenceType> getIndicationDirection() {
        return indicationDirection;
    }

    /**
     * Sets the value of the indicationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public void setIndicationDirection(JAXBElement<CodeDirectionReferenceType> value) {
        this.indicationDirection = value;
    }

    @Transient
    public boolean isSetIndicationDirection() {
        return (this.indicationDirection!= null);
    }

    /**
     * Gets the value of the trueAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getTrueAngle() {
        return trueAngle;
    }

    /**
     * Sets the value of the trueAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueAngle(JAXBElement<ValBearingType> value) {
        this.trueAngle = value;
    }

    @Transient
    public boolean isSetTrueAngle() {
        return (this.trueAngle!= null);
    }

    /**
     * Gets the value of the cardinalDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCardinalDirectionType> getCardinalDirection() {
        return cardinalDirection;
    }

    /**
     * Sets the value of the cardinalDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setCardinalDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.cardinalDirection = value;
    }

    @Transient
    public boolean isSetCardinalDirection() {
        return (this.cardinalDirection!= null);
    }

    /**
     * Gets the value of the minimumReceptionAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumReceptionAltitude() {
        return minimumReceptionAltitude;
    }

    /**
     * Sets the value of the minimumReceptionAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumReceptionAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumReceptionAltitude = value;
    }

    @Transient
    public boolean isSetMinimumReceptionAltitude() {
        return (this.minimumReceptionAltitude!= null);
    }

    /**
     * Gets the value of the fix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getFix() {
        return fix;
    }

    /**
     * Sets the value of the fix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setFix(JAXBElement<DesignatedPointPropertyType> value) {
        this.fix = value;
    }

    @Transient
    public boolean isSetFix() {
        return (this.fix!= null);
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
    @JoinTable(name = "annotation_angleindication_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "angleindicationpropertygroup", referencedColumnName = "hjid")
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
     * {@link AngleIndicationExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AngleIndicationExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_ANGLE_INDICATION_T_0")
    public List<AngleIndicationExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AngleIndicationExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "angle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angle_nilreason"))
    })
    public ValBearingType getAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getAngle());
    }

    public void setAngleItem(ValBearingType target) {
        setAngle(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angle"), AngleIndicationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angletype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angletype_nilreason"))
    })
    public CodeBearingType getAngleTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeBearingType.class, this.getAngleType());
    }

    public void setAngleTypeItem(CodeBearingType target) {
        setAngleType(XmlAdapterUtils.marshallJAXBElement(CodeBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleType"), AngleIndicationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "indicationdirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "indicationdirection_nilreason"))
    })
    public CodeDirectionReferenceType getIndicationDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionReferenceType.class, this.getIndicationDirection());
    }

    public void setIndicationDirectionItem(CodeDirectionReferenceType target) {
        setIndicationDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "indicationDirection"), AngleIndicationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "trueangle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "trueangle_nilreason"))
    })
    public ValBearingType getTrueAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getTrueAngle());
    }

    public void setTrueAngleItem(ValBearingType target) {
        setTrueAngle(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueAngle"), AngleIndicationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "cardinaldirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "cardinaldirection_nilreason"))
    })
    public CodeCardinalDirectionType getCardinalDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCardinalDirectionType.class, this.getCardinalDirection());
    }

    public void setCardinalDirectionItem(CodeCardinalDirectionType target) {
        setCardinalDirection(XmlAdapterUtils.marshallJAXBElement(CodeCardinalDirectionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "cardinalDirection"), AngleIndicationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumreceptionaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumreceptionaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumreceptionaltitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumReceptionAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumReceptionAltitude());
    }

    public void setMinimumReceptionAltitudeItem(ValDistanceVerticalType target) {
        setMinimumReceptionAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumReceptionAltitude"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "fix_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getFixItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getFix());
    }

    public void setFixItem(DesignatedPointPropertyType target) {
        setFix(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "fix"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getPointChoiceFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getPointChoiceFixDesignatedPoint());
    }

    public void setPointChoiceFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setPointChoiceFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_fixDesignatedPoint"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getPointChoiceNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getPointChoiceNavaidSystem());
    }

    public void setPointChoiceNavaidSystemItem(NavaidPropertyType target) {
        setPointChoiceNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_navaidSystem"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getPointChoicePositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getPointChoicePosition());
    }

    public void setPointChoicePositionItem(AIXMPointPropertyType target) {
        setPointChoicePosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_position"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getPointChoiceRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getPointChoiceRunwayPoint());
    }

    public void setPointChoiceRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setPointChoiceRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_runwayPoint"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getPointChoiceAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getPointChoiceAimingPoint());
    }

    public void setPointChoiceAimingPointItem(TouchDownLiftOffPropertyType target) {
        setPointChoiceAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_aimingPoint"), AngleIndicationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointchoice_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getPointChoiceAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getPointChoiceAirportReferencePoint());
    }

    public void setPointChoiceAirportReferencePointItem(AirportHeliportPropertyType target) {
        setPointChoiceAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointChoice_airportReferencePoint"), AngleIndicationTimeSliceType.class, target));
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
        final AngleIndicationTimeSliceType that = ((AngleIndicationTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetIndicationDirection();
            boolean rhsFieldIsSet = that.isSetIndicationDirection();
            JAXBElement<CodeDirectionReferenceType> lhsField;
            lhsField = this.getIndicationDirection();
            JAXBElement<CodeDirectionReferenceType> rhsField;
            rhsField = that.getIndicationDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "indicationDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "indicationDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFix();
            boolean rhsFieldIsSet = that.isSetFix();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getFix();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getFix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCardinalDirection();
            boolean rhsFieldIsSet = that.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> lhsField;
            lhsField = this.getCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> rhsField;
            rhsField = that.getCardinalDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cardinalDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cardinalDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AngleIndicationExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AngleIndicationExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleType();
            boolean rhsFieldIsSet = that.isSetAngleType();
            JAXBElement<CodeBearingType> lhsField;
            lhsField = this.getAngleType();
            JAXBElement<CodeBearingType> rhsField;
            rhsField = that.getAngleType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleType", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAngle();
            boolean rhsFieldIsSet = that.isSetAngle();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getAngle();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumReceptionAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumReceptionAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumReceptionAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumReceptionAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumReceptionAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumReceptionAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrueAngle();
            boolean rhsFieldIsSet = that.isSetTrueAngle();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getTrueAngle();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getTrueAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueAngle", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleType();
            JAXBElement<CodeBearingType> theField;
            theField = this.getAngleType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIndicationDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getIndicationDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "indicationDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getCardinalDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cardinalDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumReceptionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumReceptionAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumReceptionAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFix();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getFix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fix", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AngleIndicationExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getAngle();
            strategy.appendField(locator, this, "angle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleType();
            JAXBElement<CodeBearingType> theField;
            theField = this.getAngleType();
            strategy.appendField(locator, this, "angleType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIndicationDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getIndicationDirection();
            strategy.appendField(locator, this, "indicationDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueAngle();
            strategy.appendField(locator, this, "trueAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getCardinalDirection();
            strategy.appendField(locator, this, "cardinalDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumReceptionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumReceptionAltitude();
            strategy.appendField(locator, this, "minimumReceptionAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFix();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getFix();
            strategy.appendField(locator, this, "fix", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AngleIndicationExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
