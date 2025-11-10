
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
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for TaxiwayTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxiwayTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TaxiwayPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTaxiwayExtension"/>
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
@XmlType(name = "TaxiwayTimeSliceType", propOrder = {
    "designator",
    "type",
    "width",
    "widthShoulder",
    "length",
    "abandoned",
    "surfaceProperties",
    "associatedAirportHeliport",
    "contaminant",
    "annotation",
    "availability",
    "extension"
})
@Entity(name = "TaxiwayTimeSliceType")
@Table(name = "taxiway_ts", schema = "airport_heliport")
public class TaxiwayTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTaxiwayType> type;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "widthShoulder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthShoulder;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElement(nillable = true)
    protected List<TaxiwayContaminationPropertyType> contaminant;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ManoeuvringAreaAvailabilityPropertyType> availability;
    protected List<TaxiwayExtensionType> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTaxiwayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTaxiwayType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTaxiwayType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeTaxiwayType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidth(JAXBElement<ValDistanceType> value) {
        this.width = value;
    }

    @Transient
    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the widthShoulder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidthShoulder() {
        return widthShoulder;
    }

    /**
     * Sets the value of the widthShoulder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthShoulder(JAXBElement<ValDistanceType> value) {
        this.widthShoulder = value;
    }

    @Transient
    public boolean isSetWidthShoulder() {
        return (this.widthShoulder!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the abandoned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Sets the value of the abandoned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    @Transient
    public boolean isSetAbandoned() {
        return (this.abandoned!= null);
    }

    /**
     * Gets the value of the surfaceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SurfaceCharacteristicsPropertyType> getSurfaceProperties() {
        return surfaceProperties;
    }

    /**
     * Sets the value of the surfaceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    @Transient
    public boolean isSetSurfaceProperties() {
        return (this.surfaceProperties!= null);
    }

    /**
     * Gets the value of the associatedAirportHeliport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirportHeliport() {
        return associatedAirportHeliport;
    }

    /**
     * Sets the value of the associatedAirportHeliport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAssociatedAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirportHeliport = value;
    }

    @Transient
    public boolean isSetAssociatedAirportHeliport() {
        return (this.associatedAirportHeliport!= null);
    }

    /**
     * Gets the value of the contaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxiwayContaminationPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = TaxiwayContaminationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "contaminant_id", referencedColumnName = "hjid")
    public List<TaxiwayContaminationPropertyType> getContaminant() {
        if (contaminant == null) {
            contaminant = new ArrayList<>();
        }
        return this.contaminant;
    }

    /**
     * 
     * 
     */
    public void setContaminant(List<TaxiwayContaminationPropertyType> contaminant) {
        this.contaminant = contaminant;
    }

    @Transient
    public boolean isSetContaminant() {
        return ((this.contaminant!= null)&&(!this.contaminant.isEmpty()));
    }

    public void unsetContaminant() {
        this.contaminant = null;
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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManoeuvringAreaAvailabilityPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = ManoeuvringAreaAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "availability_id", referencedColumnName = "hjid")
    public List<ManoeuvringAreaAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<ManoeuvringAreaAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
     * {@link TaxiwayExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TaxiwayExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_TAXIWAY_TIME_SLICE_0")
    public List<TaxiwayExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TaxiwayExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), TaxiwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeTaxiwayType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTaxiwayType.class, this.getType());
    }

    public void setTypeItem(CodeTaxiwayType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeTaxiwayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), TaxiwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "width")),
        @AttributeOverride(name = "uom", column = @Column(name = "width_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "width_nilreason"))
    })
    public ValDistanceType getWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidth());
    }

    public void setWidthItem(ValDistanceType target) {
        setWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "width"), TaxiwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthshoulder")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthshoulder_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthshoulder_nilreason"))
    })
    public ValDistanceType getWidthShoulderItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthShoulder());
    }

    public void setWidthShoulderItem(ValDistanceType target) {
        setWidthShoulder(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "widthShoulder"), TaxiwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "length")),
        @AttributeOverride(name = "uom", column = @Column(name = "length_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "length_nilreason"))
    })
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), TaxiwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "abandoned")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "abandoned_nilreason"))
    })
    public CodeYesNoType getAbandonedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAbandoned());
    }

    public void setAbandonedItem(CodeYesNoType target) {
        setAbandoned(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "abandoned"), TaxiwayTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SurfaceCharacteristicsPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfaceproperties_id", referencedColumnName = "hjid")
    public SurfaceCharacteristicsPropertyType getSurfacePropertiesItem() {
        return XmlAdapterUtils.unmarshallSource(SurfaceCharacteristicsPropertyType.class, this.getSurfaceProperties());
    }

    public void setSurfacePropertiesItem(SurfaceCharacteristicsPropertyType target) {
        setSurfaceProperties(XmlAdapterUtils.marshallJAXBElement(SurfaceCharacteristicsPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfaceProperties"), TaxiwayTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "associatedairportheliport_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getAssociatedAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAssociatedAirportHeliport());
    }

    public void setAssociatedAirportHeliportItem(AirportHeliportPropertyType target) {
        setAssociatedAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "associatedAirportHeliport"), TaxiwayTimeSliceType.class, target));
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
        final TaxiwayTimeSliceType that = ((TaxiwayTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetSurfaceProperties();
            boolean rhsFieldIsSet = that.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> lhsField;
            lhsField = this.getSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> rhsField;
            rhsField = that.getSurfaceProperties();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceProperties", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceProperties", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<ManoeuvringAreaAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidthShoulder();
            boolean rhsFieldIsSet = that.isSetWidthShoulder();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidthShoulder();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidthShoulder();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthShoulder", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthShoulder", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContaminant();
            boolean rhsFieldIsSet = that.isSetContaminant();
            List<TaxiwayContaminationPropertyType> lhsField;
            lhsField = (this.isSetContaminant()?this.getContaminant():null);
            List<TaxiwayContaminationPropertyType> rhsField;
            rhsField = (that.isSetContaminant()?that.getContaminant():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contaminant", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLength();
            boolean rhsFieldIsSet = that.isSetLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "length", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "length", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssociatedAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getAssociatedAirportHeliport();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedAirportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedAirportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidth();
            boolean rhsFieldIsSet = that.isSetWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "width", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "width", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbandoned();
            boolean rhsFieldIsSet = that.isSetAbandoned();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getAbandoned();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getAbandoned();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abandoned", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abandoned", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeTaxiwayType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeTaxiwayType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TaxiwayExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TaxiwayExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeTaxiwayType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "width", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthShoulder();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthShoulder();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthShoulder", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "length", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbandoned();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAbandoned();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abandoned", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> theField;
            theField = this.getSurfaceProperties();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceProperties", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirportHeliport();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedAirportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContaminant();
            List<TaxiwayContaminationPropertyType> theField;
            theField = (this.isSetContaminant()?this.getContaminant():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contaminant", theField);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TaxiwayExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeTaxiwayType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthShoulder();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthShoulder();
            strategy.appendField(locator, this, "widthShoulder", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbandoned();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getAbandoned();
            strategy.appendField(locator, this, "abandoned", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> theField;
            theField = this.getSurfaceProperties();
            strategy.appendField(locator, this, "surfaceProperties", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirportHeliport();
            strategy.appendField(locator, this, "associatedAirportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContaminant();
            List<TaxiwayContaminationPropertyType> theField;
            theField = (this.isSetContaminant()?this.getContaminant():null);
            strategy.appendField(locator, this, "contaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TaxiwayExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
