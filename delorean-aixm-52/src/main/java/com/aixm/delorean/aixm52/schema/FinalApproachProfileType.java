
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
 * Java class for FinalApproachProfileType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FinalApproachProfileType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="startPoint" type=
"{http://www.aixm.aero/schema/5.2}CodeFinalSegmentPointType" minOccurs="0"/>
 *         <element name="endPoint" type=
"{http://www.aixm.aero/schema/5.2}CodeFinalSegmentPointType" minOccurs="0"/>
 *         <element name="time" type=
"{http://www.aixm.aero/schema/5.2}ValDurationType" minOccurs="0"/>
 *         <element name="distance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="speed" type=
"{http://www.aixm.aero/schema/5.2}ValSpeedType" minOccurs="0"/>
 *         <element name="speedReference" type=
"{http://www.aixm.aero/schema/5.2}CodeSpeedReferenceType" minOccurs="0"/>
 *         <element name="rateOfDescent" type=
"{http://www.aixm.aero/schema/5.2}ValSpeedType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractFinalApproachProfileExtension"/>
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
@XmlType(name = "FinalApproachProfileType", propOrder = {"startPoint", "endPoint", "time", "distance", "speed",
        "speedReference", "rateOfDescent", "annotation", "extension"})
@Entity(name = "FinalApproachProfileType")
@Table(name = "finalapproachprofile_o", schema = "procedure")
public class FinalApproachProfileType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "startPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFinalSegmentPointType> startPoint;
    @XmlElementRef(name = "endPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFinalSegmentPointType> endPoint;
    @XmlElementRef(name = "time", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> time;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "rateOfDescent", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> rateOfDescent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FinalApproachProfileExtensionType> extension;

    /**
     * Gets the value of the startPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeFinalSegmentPointType> getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *
     */
    public void setStartPoint(JAXBElement<CodeFinalSegmentPointType> value) {
        this.startPoint = value;
    }

    @Transient
    public boolean isSetStartPoint() {
        return (this.startPoint != null);
    }

    /**
     * Gets the value of the endPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeFinalSegmentPointType> getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *
     */
    public void setEndPoint(JAXBElement<CodeFinalSegmentPointType> value) {
        this.endPoint = value;
    }

    @Transient
    public boolean isSetEndPoint() {
        return (this.endPoint != null);
    }

    /**
     * Gets the value of the time property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDurationType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDurationType> getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDurationType }{@code >}
     *
     */
    public void setTime(JAXBElement<ValDurationType> value) {
        this.time = value;
    }

    @Transient
    public boolean isSetTime() {
        return (this.time != null);
    }

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
     * Gets the value of the speed property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *            }{@code >}
     *
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    @Transient
    public boolean isSetSpeed() {
        return (this.speed != null);
    }

    /**
     * Gets the value of the speedReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Sets the value of the speedReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    @Transient
    public boolean isSetSpeedReference() {
        return (this.speedReference != null);
    }

    /**
     * Gets the value of the rateOfDescent property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValSpeedType> getRateOfDescent() {
        return rateOfDescent;
    }

    /**
     * Sets the value of the rateOfDescent property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *            }{@code >}
     *
     */
    public void setRateOfDescent(JAXBElement<ValSpeedType> value) {
        this.rateOfDescent = value;
    }

    @Transient
    public boolean isSetRateOfDescent() {
        return (this.rateOfDescent != null);
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
    @JoinTable(name = "fnlapprchprfltp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "finalapproachprofile_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link FinalApproachProfileExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = FinalApproachProfileExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachprofile_oe_hjid", referencedColumnName = "hjid")
    public List<FinalApproachProfileExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<FinalApproachProfileExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "startpoint")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "startpointnilreason"))})
    public CodeFinalSegmentPointType getStartPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFinalSegmentPointType.class, this.getStartPoint());
    }

    public void setStartPointItem(CodeFinalSegmentPointType target) {
        setStartPoint(XmlAdapterUtils.marshallJAXBElement(CodeFinalSegmentPointType.class,
                new QName("http://www.aixm.aero/schema/5.2", "startPoint"), FinalApproachProfileType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "endpoint")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "endpointnilreason"))})
    public CodeFinalSegmentPointType getEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFinalSegmentPointType.class, this.getEndPoint());
    }

    public void setEndPointItem(CodeFinalSegmentPointType target) {
        setEndPoint(XmlAdapterUtils.marshallJAXBElement(CodeFinalSegmentPointType.class,
                new QName("http://www.aixm.aero/schema/5.2", "endPoint"), FinalApproachProfileType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "time", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "timeuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "timenilreason"))})
    public ValDurationType getTimeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getTime());
    }

    public void setTimeItem(ValDurationType target) {
        setTime(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "time"), FinalApproachProfileType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "distance"), FinalApproachProfileType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "speed", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "speeduom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "speednilreason"))})
    public ValSpeedType getSpeedItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeed());
    }

    public void setSpeedItem(ValSpeedType target) {
        setSpeed(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class,
                new QName("http://www.aixm.aero/schema/5.2", "speed"), FinalApproachProfileType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "speedreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "speedreferencenilreason"))})
    public CodeSpeedReferenceType getSpeedReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpeedReferenceType.class, this.getSpeedReference());
    }

    public void setSpeedReferenceItem(CodeSpeedReferenceType target) {
        setSpeedReference(XmlAdapterUtils.marshallJAXBElement(CodeSpeedReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "speedReference"), FinalApproachProfileType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "rateofdescent", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "rateofdescentuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "rateofdescentnilreason"))})
    public ValSpeedType getRateOfDescentItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getRateOfDescent());
    }

    public void setRateOfDescentItem(ValSpeedType target) {
        setRateOfDescent(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class,
                new QName("http://www.aixm.aero/schema/5.2", "rateOfDescent"), FinalApproachProfileType.class, target));
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
        final FinalApproachProfileType that = ((FinalApproachProfileType) object);
        {
            boolean lhsFieldIsSet = this.isSetEndPoint();
            boolean rhsFieldIsSet = that.isSetEndPoint();
            JAXBElement<CodeFinalSegmentPointType> lhsField;
            lhsField = this.getEndPoint();
            JAXBElement<CodeFinalSegmentPointType> rhsField;
            rhsField = that.getEndPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeed();
            boolean rhsFieldIsSet = that.isSetSpeed();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeed();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedReference();
            boolean rhsFieldIsSet = that.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> lhsField;
            lhsField = this.getSpeedReference();
            JAXBElement<CodeSpeedReferenceType> rhsField;
            rhsField = that.getSpeedReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRateOfDescent();
            boolean rhsFieldIsSet = that.isSetRateOfDescent();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getRateOfDescent();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getRateOfDescent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rateOfDescent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rateOfDescent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalApproachProfileExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<FinalApproachProfileExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartPoint();
            boolean rhsFieldIsSet = that.isSetStartPoint();
            JAXBElement<CodeFinalSegmentPointType> lhsField;
            lhsField = this.getStartPoint();
            JAXBElement<CodeFinalSegmentPointType> rhsField;
            rhsField = that.getStartPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTime();
            boolean rhsFieldIsSet = that.isSetTime();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getTime();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "time", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "time", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetStartPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getStartPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getEndPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTime();
            JAXBElement<ValDurationType> theField;
            theField = this.getTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "time", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRateOfDescent();
            JAXBElement<ValSpeedType> theField;
            theField = this.getRateOfDescent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rateOfDescent", theField);
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
            List<FinalApproachProfileExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetStartPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getStartPoint();
            strategy.appendField(locator, this, "startPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getEndPoint();
            strategy.appendField(locator, this, "endPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTime();
            JAXBElement<ValDurationType> theField;
            theField = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            strategy.appendField(locator, this, "speedReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRateOfDescent();
            JAXBElement<ValSpeedType> theField;
            theField = this.getRateOfDescent();
            strategy.appendField(locator, this, "rateOfDescent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalApproachProfileExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
