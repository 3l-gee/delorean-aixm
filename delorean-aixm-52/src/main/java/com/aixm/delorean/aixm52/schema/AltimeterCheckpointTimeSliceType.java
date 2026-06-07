
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
 * Java class for AltimeterCheckpointTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AltimeterCheckpointTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="category" type=
"{http://www.aixm.aero/schema/5.2}CodeCheckpointCategoryType" minOccurs="0"/>
 *         <element name="upperLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="upperLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="lowerLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="lowerLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="altitudeInterpretation" type=
"{http://www.aixm.aero/schema/5.2}CodeAltitudeUseType" minOccurs="0"/>
 *         <element name="distance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="angle" type=
"{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="position" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="airportHeliport" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="locationOnRunway" type=
"{http://www.aixm.aero/schema/5.2}RunwayCentrelinePointPropertyType" minOccurs=
"0"/>
 *         <element name="locationOnApron" type=
"{http://www.aixm.aero/schema/5.2}ApronPropertyType" minOccurs="0"/>
 *         <element name="locationOnStand" type=
"{http://www.aixm.aero/schema/5.2}AircraftStandPropertyType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractAltimeterCheckpointExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractNavigationSystemCheckpointExtension"/>
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
@XmlType(name = "AltimeterCheckpointTimeSliceType", propOrder = {"category", "upperLimit", "upperLimitReference",
        "lowerLimit", "lowerLimitReference", "altitudeInterpretation", "distance", "angle", "position",
        "airportHeliport", "annotation", "locationOnRunway", "locationOnApron", "locationOnStand", "extension"})
@Entity(name = "AltimeterCheckpointTimeSliceType")
@Table(name = "altimetercheckpoint_t", schema = "navaids_point")
public class AltimeterCheckpointTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "category", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCheckpointCategoryType> category;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "altitudeInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> altitudeInterpretation;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "angle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> angle;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> position;
    @XmlElementRef(name = "airportHeliport", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "locationOnRunway", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> locationOnRunway;
    @XmlElementRef(name = "locationOnApron", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ApronPropertyType> locationOnApron;
    @XmlElementRef(name = "locationOnStand", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftStandPropertyType> locationOnStand;
    protected List<AltimeterCheckpointTimeSliceExtensionType> extension;

    /**
     * Gets the value of the category property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeCheckpointCategoryType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeCheckpointCategoryType> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeCheckpointCategoryType }{@code >}
     *
     */
    public void setCategory(JAXBElement<CodeCheckpointCategoryType> value) {
        this.category = value;
    }

    @Transient
    public boolean isSetCategory() {
        return (this.category != null);
    }

    /**
     * Gets the value of the upperLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    @Transient
    public boolean isSetUpperLimit() {
        return (this.upperLimit != null);
    }

    /**
     * Gets the value of the upperLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Sets the value of the upperLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    @Transient
    public boolean isSetUpperLimitReference() {
        return (this.upperLimitReference != null);
    }

    /**
     * Gets the value of the lowerLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    @Transient
    public boolean isSetLowerLimit() {
        return (this.lowerLimit != null);
    }

    /**
     * Gets the value of the lowerLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Sets the value of the lowerLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    @Transient
    public boolean isSetLowerLimitReference() {
        return (this.lowerLimitReference != null);
    }

    /**
     * Gets the value of the altitudeInterpretation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAltitudeUseType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAltitudeUseType> getAltitudeInterpretation() {
        return altitudeInterpretation;
    }

    /**
     * Sets the value of the altitudeInterpretation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAltitudeUseType }{@code >}
     *
     */
    public void setAltitudeInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.altitudeInterpretation = value;
    }

    @Transient
    public boolean isSetAltitudeInterpretation() {
        return (this.altitudeInterpretation != null);
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
     * Gets the value of the angle property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValBearingType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValBearingType }{@code >}
     *
     */
    public void setAngle(JAXBElement<ValBearingType> value) {
        this.angle = value;
    }

    @Transient
    public boolean isSetAngle() {
        return (this.angle != null);
    }

    /**
     * Gets the value of the position property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setPosition(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.position = value;
    }

    @Transient
    public boolean isSetPosition() {
        return (this.position != null);
    }

    /**
     * Gets the value of the airportHeliport property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirportHeliportPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    public void setAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.airportHeliport = value;
    }

    @Transient
    public boolean isSetAirportHeliport() {
        return (this.airportHeliport != null);
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
    @JoinTable(name = "altmtrchckpnttmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the locationOnRunway property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getLocationOnRunway() {
        return locationOnRunway;
    }

    /**
     * Sets the value of the locationOnRunway property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    public void setLocationOnRunway(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.locationOnRunway = value;
    }

    @Transient
    public boolean isSetLocationOnRunway() {
        return (this.locationOnRunway != null);
    }

    /**
     * Gets the value of the locationOnApron property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ApronPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ApronPropertyType> getLocationOnApron() {
        return locationOnApron;
    }

    /**
     * Sets the value of the locationOnApron property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ApronPropertyType }{@code >}
     *
     */
    public void setLocationOnApron(JAXBElement<ApronPropertyType> value) {
        this.locationOnApron = value;
    }

    @Transient
    public boolean isSetLocationOnApron() {
        return (this.locationOnApron != null);
    }

    /**
     * Gets the value of the locationOnStand property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AircraftStandPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AircraftStandPropertyType> getLocationOnStand() {
        return locationOnStand;
    }

    /**
     * Sets the value of the locationOnStand property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AircraftStandPropertyType }{@code >}
     *
     */
    public void setLocationOnStand(JAXBElement<AircraftStandPropertyType> value) {
        this.locationOnStand = value;
    }

    @Transient
    public boolean isSetLocationOnStand() {
        return (this.locationOnStand != null);
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
     * {@link AltimeterCheckpointTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = AltimeterCheckpointTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "altimetercheckpoint_te_hjid", referencedColumnName = "hjid")
    public List<AltimeterCheckpointTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<AltimeterCheckpointTimeSliceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "category")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "categorynilreason"))})
    public CodeCheckpointCategoryType getCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCheckpointCategoryType.class, this.getCategory());
    }

    public void setCategoryItem(CodeCheckpointCategoryType target) {
        setCategory(XmlAdapterUtils.marshallJAXBElement(CodeCheckpointCategoryType.class,
                new QName("http://www.aixm.aero/schema/5.2", "category"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "upperlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "upperlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "upperlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitnilreason"))})
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimit"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "upperlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreferencenilreason"))})
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimitReference"),
                AltimeterCheckpointTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lowerlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "lowerlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lowerlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitnilreason"))})
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimit"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreferencenilreason"))})
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimitReference"),
                AltimeterCheckpointTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "altitudeinterpretation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeinterpretationnilreason"))})
    public CodeAltitudeUseType getAltitudeInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeUseType.class, this.getAltitudeInterpretation());
    }

    public void setAltitudeInterpretationItem(CodeAltitudeUseType target) {
        setAltitudeInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class,
                new QName("http://www.aixm.aero/schema/5.2", "altitudeInterpretation"),
                AltimeterCheckpointTimeSliceType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "distance"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "angle", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "anglenilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "angleaccuracy"))})
    public ValBearingType getAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getAngle());
    }

    public void setAngleItem(ValBearingType target) {
        setAngle(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class,
                new QName("http://www.aixm.aero/schema/5.2", "angle"), AltimeterCheckpointTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrchckpnttmslctp_pstn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "position_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getPosition());
    }

    public void setPositionItem(AIXMElevatedPointPropertyType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "position"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrchckpnttmslctp_arprthlprt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "airportheliport_hjid", referencedColumnName = "hjid")})
    public AirportHeliportPropertyType getAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAirportHeliport());
    }

    public void setAirportHeliportItem(AirportHeliportPropertyType target) {
        setAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "airportHeliport"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrchckpnttmslctp_lctnonrnw_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "locationonrunway_hjid", referencedColumnName = "hjid")})
    public RunwayCentrelinePointPropertyType getLocationOnRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getLocationOnRunway());
    }

    public void setLocationOnRunwayItem(RunwayCentrelinePointPropertyType target) {
        setLocationOnRunway(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "locationOnRunway"),
                AltimeterCheckpointTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = ApronPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrchckpnttmslctp_lctnonaprn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "locationonapron_hjid", referencedColumnName = "hjid")})
    public ApronPropertyType getLocationOnApronItem() {
        return XmlAdapterUtils.unmarshallSource(ApronPropertyType.class, this.getLocationOnApron());
    }

    public void setLocationOnApronItem(ApronPropertyType target) {
        setLocationOnApron(XmlAdapterUtils.marshallJAXBElement(ApronPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "locationOnApron"), AltimeterCheckpointTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AircraftStandPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrchckpnttmslctp_lctnonstnd_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "altimetercheckpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "locationonstand_hjid", referencedColumnName = "hjid")})
    public AircraftStandPropertyType getLocationOnStandItem() {
        return XmlAdapterUtils.unmarshallSource(AircraftStandPropertyType.class, this.getLocationOnStand());
    }

    public void setLocationOnStandItem(AircraftStandPropertyType target) {
        setLocationOnStand(XmlAdapterUtils.marshallJAXBElement(AircraftStandPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "locationOnStand"), AltimeterCheckpointTimeSliceType.class,
                target));
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
        final AltimeterCheckpointTimeSliceType that = ((AltimeterCheckpointTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetUpperLimitReference();
            boolean rhsFieldIsSet = that.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getUpperLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationOnStand();
            boolean rhsFieldIsSet = that.isSetLocationOnStand();
            JAXBElement<AircraftStandPropertyType> lhsField;
            lhsField = this.getLocationOnStand();
            JAXBElement<AircraftStandPropertyType> rhsField;
            rhsField = that.getLocationOnStand();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationOnStand", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationOnStand", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getPosition();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCategory();
            boolean rhsFieldIsSet = that.isSetCategory();
            JAXBElement<CodeCheckpointCategoryType> lhsField;
            lhsField = this.getCategory();
            JAXBElement<CodeCheckpointCategoryType> rhsField;
            rhsField = that.getCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "category", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "category", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationOnApron();
            boolean rhsFieldIsSet = that.isSetLocationOnApron();
            JAXBElement<ApronPropertyType> lhsField;
            lhsField = this.getLocationOnApron();
            JAXBElement<ApronPropertyType> rhsField;
            rhsField = that.getLocationOnApron();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationOnApron", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationOnApron", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeInterpretation();
            boolean rhsFieldIsSet = that.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> lhsField;
            lhsField = this.getAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> rhsField;
            rhsField = that.getAltitudeInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationOnRunway();
            boolean rhsFieldIsSet = that.isSetLocationOnRunway();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getLocationOnRunway();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getLocationOnRunway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationOnRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationOnRunway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLimit();
            boolean rhsFieldIsSet = that.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimit();
            boolean rhsFieldIsSet = that.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimitReference();
            boolean rhsFieldIsSet = that.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getLowerLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AltimeterCheckpointTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<AltimeterCheckpointTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
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
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeCheckpointCategoryType> theField;
            theField = this.getCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "category", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeInterpretation", theField);
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
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnRunway();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getLocationOnRunway();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationOnRunway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnApron();
            JAXBElement<ApronPropertyType> theField;
            theField = this.getLocationOnApron();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationOnApron", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnStand();
            JAXBElement<AircraftStandPropertyType> theField;
            theField = this.getLocationOnStand();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationOnStand", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltimeterCheckpointTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeCheckpointCategoryType> theField;
            theField = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeInterpretation();
            strategy.appendField(locator, this, "altitudeInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getAngle();
            strategy.appendField(locator, this, "angle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAirportHeliport();
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnRunway();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getLocationOnRunway();
            strategy.appendField(locator, this, "locationOnRunway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnApron();
            JAXBElement<ApronPropertyType> theField;
            theField = this.getLocationOnApron();
            strategy.appendField(locator, this, "locationOnApron", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationOnStand();
            JAXBElement<AircraftStandPropertyType> theField;
            theField = this.getLocationOnStand();
            strategy.appendField(locator, this, "locationOnStand", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltimeterCheckpointTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
