
package com.aixm.delorean.aixm51.schema;

import jakarta.persistence.CascadeType;
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
 * Java class for DeicingAreaTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="DeicingAreaTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="associatedApron" type=
"{http://www.aixm.aero/schema/5.1}ApronPropertyType" minOccurs="0"/>
 *         <element name="taxiwayLocation" type=
"{http://www.aixm.aero/schema/5.1}TaxiwayPropertyType" minOccurs="0"/>
 *         <element name="standLocation" type=
"{http://www.aixm.aero/schema/5.1}AircraftStandPropertyType" minOccurs="0"/>
 *         <element name="surfaceProperties" type=
"{http://www.aixm.aero/schema/5.1}SurfaceCharacteristicsPropertyType" minOccurs=
"0"/>
 *         <element name="extent" type=
"{http://www.aixm.aero/schema/5.1}ElevatedSurfacePropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.1}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.1}ApronAreaAvailabilityPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.1}AbstractDeicingAreaExtension"/>
 *                 </sequence>
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
@XmlType(name = "DeicingAreaTimeSliceType", propOrder = {"associatedApron", "taxiwayLocation", "standLocation",
        "surfaceProperties", "extent", "annotation", "availability", "extension"})
@Entity(name = "DeicingAreaTimeSliceType")
@Table(name = "deicingarea_t", schema = "airport_heliport")
public class DeicingAreaTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "associatedApron", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ApronPropertyType> associatedApron;
    @XmlElementRef(name = "taxiwayLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxiwayPropertyType> taxiwayLocation;
    @XmlElementRef(name = "standLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftStandPropertyType> standLocation;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ApronAreaAvailabilityPropertyType> availability;
    protected List<DeicingAreaTimeSliceExtensionType> extension;

    /**
     * Gets the value of the associatedApron property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ApronPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ApronPropertyType> getAssociatedApron() {
        return associatedApron;
    }

    /**
     * Sets the value of the associatedApron property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ApronPropertyType }{@code >}
     *
     */
    public void setAssociatedApron(JAXBElement<ApronPropertyType> value) {
        this.associatedApron = value;
    }

    @Transient
    public boolean isSetAssociatedApron() {
        return (this.associatedApron != null);
    }

    /**
     * Gets the value of the taxiwayLocation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TaxiwayPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TaxiwayPropertyType> getTaxiwayLocation() {
        return taxiwayLocation;
    }

    /**
     * Sets the value of the taxiwayLocation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TaxiwayPropertyType }{@code >}
     *
     */
    public void setTaxiwayLocation(JAXBElement<TaxiwayPropertyType> value) {
        this.taxiwayLocation = value;
    }

    @Transient
    public boolean isSetTaxiwayLocation() {
        return (this.taxiwayLocation != null);
    }

    /**
     * Gets the value of the standLocation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AircraftStandPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AircraftStandPropertyType> getStandLocation() {
        return standLocation;
    }

    /**
     * Sets the value of the standLocation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AircraftStandPropertyType }{@code >}
     *
     */
    public void setStandLocation(JAXBElement<AircraftStandPropertyType> value) {
        this.standLocation = value;
    }

    @Transient
    public boolean isSetStandLocation() {
        return (this.standLocation != null);
    }

    /**
     * Gets the value of the surfaceProperties property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    @Transient
    public boolean isSetSurfaceProperties() {
        return (this.surfaceProperties != null);
    }

    /**
     * Gets the value of the extent property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedSurfacePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *
     */
    public void setExtent(JAXBElement<AIXMElevatedSurfacePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent != null);
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
    @JoinTable(name = "dcngartmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the availability property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the availability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAvailability().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApronAreaAvailabilityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ApronAreaAvailabilityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_avlblt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<ApronAreaAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<ApronAreaAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability != null) && (!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
     * {@link DeicingAreaTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = DeicingAreaTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "deicingarea_te_hjid", referencedColumnName = "hjid")
    public List<DeicingAreaTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<DeicingAreaTimeSliceExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @OneToOne(targetEntity = ApronPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_assctdaprn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "associatedapron_hjid", referencedColumnName = "hjid")})
    public ApronPropertyType getAssociatedApronItem() {
        return XmlAdapterUtils.unmarshallSource(ApronPropertyType.class, this.getAssociatedApron());
    }

    public void setAssociatedApronItem(ApronPropertyType target) {
        setAssociatedApron(XmlAdapterUtils.marshallJAXBElement(ApronPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1", "associatedApron"), DeicingAreaTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = TaxiwayPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_txwlctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "taxiwaylocation_hjid", referencedColumnName = "hjid")})
    public TaxiwayPropertyType getTaxiwayLocationItem() {
        return XmlAdapterUtils.unmarshallSource(TaxiwayPropertyType.class, this.getTaxiwayLocation());
    }

    public void setTaxiwayLocationItem(TaxiwayPropertyType target) {
        setTaxiwayLocation(XmlAdapterUtils.marshallJAXBElement(TaxiwayPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1", "taxiwayLocation"), DeicingAreaTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AircraftStandPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_stndlctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "standlocation_hjid", referencedColumnName = "hjid")})
    public AircraftStandPropertyType getStandLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AircraftStandPropertyType.class, this.getStandLocation());
    }

    public void setStandLocationItem(AircraftStandPropertyType target) {
        setStandLocation(XmlAdapterUtils.marshallJAXBElement(AircraftStandPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1", "standLocation"), DeicingAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SurfaceCharacteristicsPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_srfcprprts_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "surfaceproperties_hjid", referencedColumnName = "hjid")})
    public SurfaceCharacteristicsPropertyType getSurfacePropertiesItem() {
        return XmlAdapterUtils.unmarshallSource(SurfaceCharacteristicsPropertyType.class, this.getSurfaceProperties());
    }

    public void setSurfacePropertiesItem(SurfaceCharacteristicsPropertyType target) {
        setSurfaceProperties(XmlAdapterUtils.marshallJAXBElement(SurfaceCharacteristicsPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1", "surfaceProperties"), DeicingAreaTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AIXMElevatedSurfacePropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dcngartmslctp_extnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "deicingarea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "extent_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedSurfacePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedSurfacePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMElevatedSurfacePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedSurfacePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1", "extent"), DeicingAreaTimeSliceType.class, target));
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
        final DeicingAreaTimeSliceType that = ((DeicingAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetTaxiwayLocation();
            boolean rhsFieldIsSet = that.isSetTaxiwayLocation();
            JAXBElement<TaxiwayPropertyType> lhsField;
            lhsField = this.getTaxiwayLocation();
            JAXBElement<TaxiwayPropertyType> rhsField;
            rhsField = that.getTaxiwayLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "taxiwayLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "taxiwayLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetStandLocation();
            boolean rhsFieldIsSet = that.isSetStandLocation();
            JAXBElement<AircraftStandPropertyType> lhsField;
            lhsField = this.getStandLocation();
            JAXBElement<AircraftStandPropertyType> rhsField;
            rhsField = that.getStandLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "standLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "standLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ApronAreaAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<ApronAreaAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability() ? that.getAvailability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<DeicingAreaTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<DeicingAreaTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetAssociatedApron();
            boolean rhsFieldIsSet = that.isSetAssociatedApron();
            JAXBElement<ApronPropertyType> lhsField;
            lhsField = this.getAssociatedApron();
            JAXBElement<ApronPropertyType> rhsField;
            rhsField = that.getAssociatedApron();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedApron", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedApron", rhsField);
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
            boolean theFieldIsSet = this.isSetAssociatedApron();
            JAXBElement<ApronPropertyType> theField;
            theField = this.getAssociatedApron();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedApron", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTaxiwayLocation();
            JAXBElement<TaxiwayPropertyType> theField;
            theField = this.getTaxiwayLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "taxiwayLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandLocation();
            JAXBElement<AircraftStandPropertyType> theField;
            theField = this.getStandLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "standLocation", theField);
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
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<ApronAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DeicingAreaTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAssociatedApron();
            JAXBElement<ApronPropertyType> theField;
            theField = this.getAssociatedApron();
            strategy.appendField(locator, this, "associatedApron", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTaxiwayLocation();
            JAXBElement<TaxiwayPropertyType> theField;
            theField = this.getTaxiwayLocation();
            strategy.appendField(locator, this, "taxiwayLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandLocation();
            JAXBElement<AircraftStandPropertyType> theField;
            theField = this.getStandLocation();
            strategy.appendField(locator, this, "standLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> theField;
            theField = this.getSurfaceProperties();
            strategy.appendField(locator, this, "surfaceProperties", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ApronAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DeicingAreaTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
