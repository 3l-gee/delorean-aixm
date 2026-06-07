
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
 * Java class for FinalApproachControlPositionType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FinalApproachControlPositionType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="distance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <choice>
 *           <element name="relativeFrom_fixDesignatedPoint" type=
"{http://www.aixm.aero/schema/5.2}DesignatedPointPropertyType" minOccurs="0"/>
 *           <element name="relativeFrom_navaidSystem" type=
"{http://www.aixm.aero/schema/5.2}NavaidPropertyType" minOccurs="0"/>
 *           <element name="relativeFrom_position" type=
"{http://www.aixm.aero/schema/5.2}PointPropertyType" minOccurs="0"/>
 *           <element name="relativeFrom_runwayPoint" type=
"{http://www.aixm.aero/schema/5.2}RunwayCentrelinePointPropertyType" minOccurs=
"0"/>
 *           <element name="relativeFrom_aimingPoint" type=
"{http://www.aixm.aero/schema/5.2}TouchDownLiftOffPropertyType" minOccurs="0"/>
 *           <element name="relativeFrom_airportReferencePoint" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractFinalApproachControlPositionExtension"/>
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
@XmlType(name = "FinalApproachControlPositionType", propOrder = {"distance", "relativeFromFixDesignatedPoint",
        "relativeFromNavaidSystem", "relativeFromPosition", "relativeFromRunwayPoint", "relativeFromAimingPoint",
        "relativeFromAirportReferencePoint", "annotation", "extension"})
@Entity(name = "FinalApproachControlPositionType")
@Table(name = "finalapproachcontrolposition_o", schema = "procedure")
public class FinalApproachControlPositionType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "relativeFrom_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> relativeFromFixDesignatedPoint;
    @XmlElementRef(name = "relativeFrom_navaidSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> relativeFromNavaidSystem;
    @XmlElementRef(name = "relativeFrom_position", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> relativeFromPosition;
    @XmlElementRef(name = "relativeFrom_runwayPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> relativeFromRunwayPoint;
    @XmlElementRef(name = "relativeFrom_aimingPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> relativeFromAimingPoint;
    @XmlElementRef(name = "relativeFrom_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> relativeFromAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FinalApproachControlPositionExtensionType> extension;

    /**
     * Gets the value of the distance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setDistance(JAXBElement<ValDistanceType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance != null);
    }

    /**
     * Gets the value of the relativeFromFixDesignatedPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getRelativeFromFixDesignatedPoint() {
        return relativeFromFixDesignatedPoint;
    }

    /**
     * Sets the value of the relativeFromFixDesignatedPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *
     */
    public void setRelativeFromFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.relativeFromFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetRelativeFromFixDesignatedPoint() {
        return (this.relativeFromFixDesignatedPoint != null);
    }

    /**
     * Gets the value of the relativeFromNavaidSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link NavaidPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getRelativeFromNavaidSystem() {
        return relativeFromNavaidSystem;
    }

    /**
     * Sets the value of the relativeFromNavaidSystem property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link NavaidPropertyType }{@code >}
     *
     */
    public void setRelativeFromNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.relativeFromNavaidSystem = value;
    }

    @Transient
    public boolean isSetRelativeFromNavaidSystem() {
        return (this.relativeFromNavaidSystem != null);
    }

    /**
     * Gets the value of the relativeFromPosition property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getRelativeFromPosition() {
        return relativeFromPosition;
    }

    /**
     * Sets the value of the relativeFromPosition property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    public void setRelativeFromPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.relativeFromPosition = value;
    }

    @Transient
    public boolean isSetRelativeFromPosition() {
        return (this.relativeFromPosition != null);
    }

    /**
     * Gets the value of the relativeFromRunwayPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getRelativeFromRunwayPoint() {
        return relativeFromRunwayPoint;
    }

    /**
     * Sets the value of the relativeFromRunwayPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    public void setRelativeFromRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.relativeFromRunwayPoint = value;
    }

    @Transient
    public boolean isSetRelativeFromRunwayPoint() {
        return (this.relativeFromRunwayPoint != null);
    }

    /**
     * Gets the value of the relativeFromAimingPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getRelativeFromAimingPoint() {
        return relativeFromAimingPoint;
    }

    /**
     * Sets the value of the relativeFromAimingPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    public void setRelativeFromAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.relativeFromAimingPoint = value;
    }

    @Transient
    public boolean isSetRelativeFromAimingPoint() {
        return (this.relativeFromAimingPoint != null);
    }

    /**
     * Gets the value of the relativeFromAirportReferencePoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getRelativeFromAirportReferencePoint() {
        return relativeFromAirportReferencePoint;
    }

    /**
     * Sets the value of the relativeFromAirportReferencePoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    public void setRelativeFromAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.relativeFromAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetRelativeFromAirportReferencePoint() {
        return (this.relativeFromAirportReferencePoint != null);
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
    @JoinTable(name = "fnlapprchcntrlpstntp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link FinalApproachControlPositionExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = FinalApproachControlPositionExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachcontrolposition_oe_hjid", referencedColumnName = "hjid")
    public List<FinalApproachControlPositionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<FinalApproachControlPositionExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "distance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "distanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "distanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "distancenilreason"))})
    public ValDistanceType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDistance());
    }

    public void setDistanceItem(ValDistanceType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "distance"), FinalApproachControlPositionType.class,
                target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmfxdsgntdpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromfixdesignatedpoint_hjid", referencedColumnName = "hjid")})
    public DesignatedPointPropertyType getRelativeFromFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class,
                this.getRelativeFromFixDesignatedPoint());
    }

    public void setRelativeFromFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setRelativeFromFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_fixDesignatedPoint"),
                FinalApproachControlPositionType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmnvdsstm_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromnavaidsystem_hjid", referencedColumnName = "hjid")})
    public NavaidPropertyType getRelativeFromNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getRelativeFromNavaidSystem());
    }

    public void setRelativeFromNavaidSystemItem(NavaidPropertyType target) {
        setRelativeFromNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_navaidSystem"),
                FinalApproachControlPositionType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmpstn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromposition_hjid", referencedColumnName = "hjid")})
    public AIXMPointPropertyType getRelativeFromPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getRelativeFromPosition());
    }

    public void setRelativeFromPositionItem(AIXMPointPropertyType target) {
        setRelativeFromPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_position"),
                FinalApproachControlPositionType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmrnwpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromrunwaypoint_hjid", referencedColumnName = "hjid")})
    public RunwayCentrelinePointPropertyType getRelativeFromRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class,
                this.getRelativeFromRunwayPoint());
    }

    public void setRelativeFromRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setRelativeFromRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_runwayPoint"),
                FinalApproachControlPositionType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmamngpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromaimingpoint_hjid", referencedColumnName = "hjid")})
    public TouchDownLiftOffPropertyType getRelativeFromAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getRelativeFromAimingPoint());
    }

    public void setRelativeFromAimingPointItem(TouchDownLiftOffPropertyType target) {
        setRelativeFromAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_aimingPoint"),
                FinalApproachControlPositionType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlpstntp_rltvfrmarprtrfrncpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachcontrolposition_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "relativefromairportreferencepoint_hjid", referencedColumnName = "hjid")})
    public AirportHeliportPropertyType getRelativeFromAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class,
                this.getRelativeFromAirportReferencePoint());
    }

    public void setRelativeFromAirportReferencePointItem(AirportHeliportPropertyType target) {
        setRelativeFromAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeFrom_airportReferencePoint"),
                FinalApproachControlPositionType.class, target));
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
        final FinalApproachControlPositionType that = ((FinalApproachControlPositionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeFromFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetRelativeFromFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getRelativeFromFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getRelativeFromFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromFixDesignatedPoint",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromFixDesignatedPoint",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeFromAimingPoint();
            boolean rhsFieldIsSet = that.isSetRelativeFromAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getRelativeFromAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getRelativeFromAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeFromNavaidSystem();
            boolean rhsFieldIsSet = that.isSetRelativeFromNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getRelativeFromNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getRelativeFromNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromNavaidSystem", rhsField);
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
            boolean lhsFieldIsSet = this.isSetRelativeFromRunwayPoint();
            boolean rhsFieldIsSet = that.isSetRelativeFromRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getRelativeFromRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getRelativeFromRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalApproachControlPositionExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<FinalApproachControlPositionExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeFromPosition();
            boolean rhsFieldIsSet = that.isSetRelativeFromPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getRelativeFromPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getRelativeFromPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeFromAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetRelativeFromAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getRelativeFromAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getRelativeFromAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeFromAirportReferencePoint",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeFromAirportReferencePoint",
                    rhsField);
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
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getRelativeFromFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getRelativeFromNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getRelativeFromPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getRelativeFromRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getRelativeFromAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getRelativeFromAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeFromAirportReferencePoint",
                    theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalApproachControlPositionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getRelativeFromFixDesignatedPoint();
            strategy.appendField(locator, this, "relativeFromFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getRelativeFromNavaidSystem();
            strategy.appendField(locator, this, "relativeFromNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getRelativeFromPosition();
            strategy.appendField(locator, this, "relativeFromPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getRelativeFromRunwayPoint();
            strategy.appendField(locator, this, "relativeFromRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getRelativeFromAimingPoint();
            strategy.appendField(locator, this, "relativeFromAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeFromAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getRelativeFromAirportReferencePoint();
            strategy.appendField(locator, this, "relativeFromAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalApproachControlPositionExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
