
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
 * Java class for FlightInspectionTrajectoryType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FlightInspectionTrajectoryType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="elevation" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="elevationReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="arcRadius" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="groundTrajectory" type=
"{http://www.aixm.aero/schema/5.2}CurvePropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractFlightInspectionTrajectoryExtension"/>
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
@XmlType(name = "FlightInspectionTrajectoryType", propOrder = {"aixmName", "elevation", "elevationReference",
        "arcRadius", "groundTrajectory", "annotation", "extension"})
@Entity(name = "FlightInspectionTrajectoryType")
@Table(name = "flightinspectiontrajectory_o", schema = "navaids_point")
public class FlightInspectionTrajectoryType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "elevation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevation;
    @XmlElementRef(name = "elevationReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> elevationReference;
    @XmlElementRef(name = "arcRadius", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> arcRadius;
    @XmlElementRef(name = "groundTrajectory", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> groundTrajectory;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightInspectionTrajectoryTypeExtensionType> extension;

    /**
     * Gets the value of the aixmName property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNameType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNameType
     *            }{@code >}
     *
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName != null);
    }

    /**
     * Gets the value of the elevation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.elevation = value;
    }

    @Transient
    public boolean isSetElevation() {
        return (this.elevation != null);
    }

    /**
     * Gets the value of the elevationReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getElevationReference() {
        return elevationReference;
    }

    /**
     * Sets the value of the elevationReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setElevationReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.elevationReference = value;
    }

    @Transient
    public boolean isSetElevationReference() {
        return (this.elevationReference != null);
    }

    /**
     * Gets the value of the arcRadius property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getArcRadius() {
        return arcRadius;
    }

    /**
     * Sets the value of the arcRadius property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setArcRadius(JAXBElement<ValDistanceType> value) {
        this.arcRadius = value;
    }

    @Transient
    public boolean isSetArcRadius() {
        return (this.arcRadius != null);
    }

    /**
     * Gets the value of the groundTrajectory property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getGroundTrajectory() {
        return groundTrajectory;
    }

    /**
     * Sets the value of the groundTrajectory property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *
     */
    public void setGroundTrajectory(JAXBElement<AIXMCurvePropertyType> value) {
        this.groundTrajectory = value;
    }

    @Transient
    public boolean isSetGroundTrajectory() {
        return (this.groundTrajectory != null);
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
    @JoinTable(name = "flghtinspctntrjctrtp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "flightinspectiontrajectory_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link FlightInspectionTrajectoryTypeExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = FlightInspectionTrajectoryTypeExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightinspectiontrajectorye_hjid", referencedColumnName = "hjid")
    public List<FlightInspectionTrajectoryTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<FlightInspectionTrajectoryTypeExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "name", columnDefinition = "VARCHAR", length = 60)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "namenilreason"))})
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class,
                new QName("http://www.aixm.aero/schema/5.2", "name"), FlightInspectionTrajectoryType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "elevation", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "elevationuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "elevationaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "elevationnilreason"))})
    public ValDistanceVerticalType getElevationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getElevation());
    }

    public void setElevationItem(ValDistanceVerticalType target) {
        setElevation(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "elevation"), FlightInspectionTrajectoryType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "elevationreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "elevationreferencenilreason"))})
    public CodeVerticalReferenceType getElevationReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getElevationReference());
    }

    public void setElevationReferenceItem(CodeVerticalReferenceType target) {
        setElevationReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "elevationReference"),
                FlightInspectionTrajectoryType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "arcradius", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "arcradiusuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "arcradiusaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "arcradiusnilreason"))})
    public ValDistanceType getArcRadiusItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getArcRadius());
    }

    public void setArcRadiusItem(ValDistanceType target) {
        setArcRadius(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "arcRadius"), FlightInspectionTrajectoryType.class,
                target));
    }

    @OneToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "flghtinspctntrjctrtp_grndtrjctr_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "flightinspectiontrajectory_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "groundtrajectory_hjid", referencedColumnName = "hjid")})
    public AIXMCurvePropertyType getGroundTrajectoryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getGroundTrajectory());
    }

    public void setGroundTrajectoryItem(AIXMCurvePropertyType target) {
        setGroundTrajectory(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "groundTrajectory"), FlightInspectionTrajectoryType.class,
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
        final FlightInspectionTrajectoryType that = ((FlightInspectionTrajectoryType) object);
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
            boolean lhsFieldIsSet = this.isSetElevation();
            boolean rhsFieldIsSet = that.isSetElevation();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getElevation();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getElevation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArcRadius();
            boolean rhsFieldIsSet = that.isSetArcRadius();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getArcRadius();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getArcRadius();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcRadius", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcRadius", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FlightInspectionTrajectoryTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<FlightInspectionTrajectoryTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGroundTrajectory();
            boolean rhsFieldIsSet = that.isSetGroundTrajectory();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getGroundTrajectory();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getGroundTrajectory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "groundTrajectory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "groundTrajectory", rhsField);
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
            boolean lhsFieldIsSet = this.isSetElevationReference();
            boolean rhsFieldIsSet = that.isSetElevationReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getElevationReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getElevationReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevationReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevationReference", rhsField);
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getElevationReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevationReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getArcRadius();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcRadius", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundTrajectory();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getGroundTrajectory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "groundTrajectory", theField);
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
            List<FlightInspectionTrajectoryTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevation();
            strategy.appendField(locator, this, "elevation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getElevationReference();
            strategy.appendField(locator, this, "elevationReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getArcRadius();
            strategy.appendField(locator, this, "arcRadius", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundTrajectory();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getGroundTrajectory();
            strategy.appendField(locator, this, "groundTrajectory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightInspectionTrajectoryTypeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
