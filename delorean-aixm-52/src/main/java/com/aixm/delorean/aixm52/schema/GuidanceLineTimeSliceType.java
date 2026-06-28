
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
 * Java class for GuidanceLineTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="GuidanceLineTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeGuidanceLineType" minOccurs="0"/>
 *         <element name="connectedTouchDownLiftOff" type=
"{http://www.aixm.aero/schema/5.2}TouchDownLiftOffPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="connectedRunwayCentrelinePoint" type=
"{http://www.aixm.aero/schema/5.2}RunwayCentrelinePointPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="connectedApron" type=
"{http://www.aixm.aero/schema/5.2}ApronPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="connectedStand" type=
"{http://www.aixm.aero/schema/5.2}AircraftStandPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extent" type=
"{http://www.aixm.aero/schema/5.2}ElevatedCurvePropertyType" minOccurs="0"/>
 *         <element name="connectedTaxiway" type=
"{http://www.aixm.aero/schema/5.2}TaxiwayPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}GuidanceLineDirectionPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractGuidanceLineExtension"/>
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
@XmlType(name = "GuidanceLineTimeSliceType", propOrder = {"designator", "type", "connectedTouchDownLiftOff",
        "connectedRunwayCentrelinePoint", "connectedApron", "connectedStand", "extent", "connectedTaxiway",
        "annotation", "availability", "extension"})
@Entity(name = "GuidanceLineTimeSliceType")
@Table(name = "guidanceline_t", schema = "airport_heliport")
public class GuidanceLineTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeGuidanceLineType> type;
    @XmlElement(nillable = true)
    protected List<TouchDownLiftOffPropertyType> connectedTouchDownLiftOff;
    @XmlElement(nillable = true)
    protected List<RunwayCentrelinePointPropertyType> connectedRunwayCentrelinePoint;
    @XmlElement(nillable = true)
    protected List<ApronPropertyType> connectedApron;
    @XmlElement(nillable = true)
    protected List<AircraftStandPropertyType> connectedStand;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedCurvePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<TaxiwayPropertyType> connectedTaxiway;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<GuidanceLineDirectionPropertyType> availability;
    protected List<GuidanceLineTimeSliceExtensionType> extension;

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNameType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextNameType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNameType
     *            }{@code >}
     *
     */
    public void setDesignator(JAXBElement<TextNameType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeGuidanceLineType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeGuidanceLineType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeGuidanceLineType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeGuidanceLineType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the connectedTouchDownLiftOff property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the connectedTouchDownLiftOff property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConnectedTouchDownLiftOff().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchDownLiftOffPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_cnnctdtchdwnlftoff_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "connectedtouchdownliftoff_hjid", referencedColumnName = "hjid")})
    public List<TouchDownLiftOffPropertyType> getConnectedTouchDownLiftOff() {
        if (connectedTouchDownLiftOff == null) {
            connectedTouchDownLiftOff = new ArrayList<>();
        }
        return this.connectedTouchDownLiftOff;
    }

    /**
     *
     *
     */
    public void setConnectedTouchDownLiftOff(List<TouchDownLiftOffPropertyType> connectedTouchDownLiftOff) {
        this.connectedTouchDownLiftOff = connectedTouchDownLiftOff;
    }

    @Transient
    public boolean isSetConnectedTouchDownLiftOff() {
        return ((this.connectedTouchDownLiftOff != null) && (!this.connectedTouchDownLiftOff.isEmpty()));
    }

    public void unsetConnectedTouchDownLiftOff() {
        this.connectedTouchDownLiftOff = null;
    }

    /**
     * Gets the value of the connectedRunwayCentrelinePoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the connectedRunwayCentrelinePoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConnectedRunwayCentrelinePoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayCentrelinePointPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_cnnctdrnwcntrlnpnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "connectedrunwaycentrelinepoint_hjid", referencedColumnName = "hjid")})
    public List<RunwayCentrelinePointPropertyType> getConnectedRunwayCentrelinePoint() {
        if (connectedRunwayCentrelinePoint == null) {
            connectedRunwayCentrelinePoint = new ArrayList<>();
        }
        return this.connectedRunwayCentrelinePoint;
    }

    /**
     *
     *
     */
    public void setConnectedRunwayCentrelinePoint(
            List<RunwayCentrelinePointPropertyType> connectedRunwayCentrelinePoint) {
        this.connectedRunwayCentrelinePoint = connectedRunwayCentrelinePoint;
    }

    @Transient
    public boolean isSetConnectedRunwayCentrelinePoint() {
        return ((this.connectedRunwayCentrelinePoint != null) && (!this.connectedRunwayCentrelinePoint.isEmpty()));
    }

    public void unsetConnectedRunwayCentrelinePoint() {
        this.connectedRunwayCentrelinePoint = null;
    }

    /**
     * Gets the value of the connectedApron property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the connectedApron property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConnectedApron().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApronPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ApronPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_cnnctdaprn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "connectedapron_hjid", referencedColumnName = "hjid")})
    public List<ApronPropertyType> getConnectedApron() {
        if (connectedApron == null) {
            connectedApron = new ArrayList<>();
        }
        return this.connectedApron;
    }

    /**
     *
     *
     */
    public void setConnectedApron(List<ApronPropertyType> connectedApron) {
        this.connectedApron = connectedApron;
    }

    @Transient
    public boolean isSetConnectedApron() {
        return ((this.connectedApron != null) && (!this.connectedApron.isEmpty()));
    }

    public void unsetConnectedApron() {
        this.connectedApron = null;
    }

    /**
     * Gets the value of the connectedStand property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the connectedStand property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConnectedStand().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftStandPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AircraftStandPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_cnnctdstnd_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "connectedstand_hjid", referencedColumnName = "hjid")})
    public List<AircraftStandPropertyType> getConnectedStand() {
        if (connectedStand == null) {
            connectedStand = new ArrayList<>();
        }
        return this.connectedStand;
    }

    /**
     *
     *
     */
    public void setConnectedStand(List<AircraftStandPropertyType> connectedStand) {
        this.connectedStand = connectedStand;
    }

    @Transient
    public boolean isSetConnectedStand() {
        return ((this.connectedStand != null) && (!this.connectedStand.isEmpty()));
    }

    public void unsetConnectedStand() {
        this.connectedStand = null;
    }

    /**
     * Gets the value of the extent property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedCurvePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *
     */
    public void setExtent(JAXBElement<AIXMElevatedCurvePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent != null);
    }

    /**
     * Gets the value of the connectedTaxiway property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the connectedTaxiway property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConnectedTaxiway().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxiwayPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = TaxiwayPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_cnnctdtxw_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "connectedtaxiway_hjid", referencedColumnName = "hjid")})
    public List<TaxiwayPropertyType> getConnectedTaxiway() {
        if (connectedTaxiway == null) {
            connectedTaxiway = new ArrayList<>();
        }
        return this.connectedTaxiway;
    }

    /**
     *
     *
     */
    public void setConnectedTaxiway(List<TaxiwayPropertyType> connectedTaxiway) {
        this.connectedTaxiway = connectedTaxiway;
    }

    @Transient
    public boolean isSetConnectedTaxiway() {
        return ((this.connectedTaxiway != null) && (!this.connectedTaxiway.isEmpty()));
    }

    public void unsetConnectedTaxiway() {
        this.connectedTaxiway = null;
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
    @JoinTable(name = "gdnclntmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link GuidanceLineDirectionPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = GuidanceLineDirectionPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_avlblt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<GuidanceLineDirectionPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<GuidanceLineDirectionPropertyType> availability) {
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
     * {@link GuidanceLineTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = GuidanceLineTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidanceline_te_hjid", referencedColumnName = "hjid")
    public List<GuidanceLineTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<GuidanceLineTimeSliceExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 60)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextNameType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextNameType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextNameType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), GuidanceLineTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeGuidanceLineType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeGuidanceLineType.class, this.getType());
    }

    public void setTypeItem(CodeGuidanceLineType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeGuidanceLineType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), GuidanceLineTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedCurvePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclntmslctp_extnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidanceline_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "extent_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedCurvePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedCurvePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMElevatedCurvePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedCurvePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "extent"), GuidanceLineTimeSliceType.class, target));
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
        final GuidanceLineTimeSliceType that = ((GuidanceLineTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetConnectedTaxiway();
            boolean rhsFieldIsSet = that.isSetConnectedTaxiway();
            List<TaxiwayPropertyType> lhsField;
            lhsField = (this.isSetConnectedTaxiway() ? this.getConnectedTaxiway() : null);
            List<TaxiwayPropertyType> rhsField;
            rhsField = (that.isSetConnectedTaxiway() ? that.getConnectedTaxiway() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "connectedTaxiway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "connectedTaxiway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeGuidanceLineType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeGuidanceLineType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<GuidanceLineDirectionPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<GuidanceLineDirectionPropertyType> rhsField;
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
            List<GuidanceLineTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<GuidanceLineTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetConnectedStand();
            boolean rhsFieldIsSet = that.isSetConnectedStand();
            List<AircraftStandPropertyType> lhsField;
            lhsField = (this.isSetConnectedStand() ? this.getConnectedStand() : null);
            List<AircraftStandPropertyType> rhsField;
            rhsField = (that.isSetConnectedStand() ? that.getConnectedStand() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "connectedStand", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "connectedStand", rhsField);
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
            boolean lhsFieldIsSet = this.isSetConnectedTouchDownLiftOff();
            boolean rhsFieldIsSet = that.isSetConnectedTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> lhsField;
            lhsField = (this.isSetConnectedTouchDownLiftOff() ? this.getConnectedTouchDownLiftOff() : null);
            List<TouchDownLiftOffPropertyType> rhsField;
            rhsField = (that.isSetConnectedTouchDownLiftOff() ? that.getConnectedTouchDownLiftOff() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "connectedTouchDownLiftOff", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "connectedTouchDownLiftOff", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetConnectedApron();
            boolean rhsFieldIsSet = that.isSetConnectedApron();
            List<ApronPropertyType> lhsField;
            lhsField = (this.isSetConnectedApron() ? this.getConnectedApron() : null);
            List<ApronPropertyType> rhsField;
            rhsField = (that.isSetConnectedApron() ? that.getConnectedApron() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "connectedApron", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "connectedApron", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetConnectedRunwayCentrelinePoint();
            boolean rhsFieldIsSet = that.isSetConnectedRunwayCentrelinePoint();
            List<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = (this.isSetConnectedRunwayCentrelinePoint() ? this.getConnectedRunwayCentrelinePoint() : null);
            List<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = (that.isSetConnectedRunwayCentrelinePoint() ? that.getConnectedRunwayCentrelinePoint() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "connectedRunwayCentrelinePoint",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "connectedRunwayCentrelinePoint",
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextNameType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeGuidanceLineType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetConnectedTouchDownLiftOff() ? this.getConnectedTouchDownLiftOff() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "connectedTouchDownLiftOff", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedRunwayCentrelinePoint();
            List<RunwayCentrelinePointPropertyType> theField;
            theField = (this.isSetConnectedRunwayCentrelinePoint() ? this.getConnectedRunwayCentrelinePoint() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "connectedRunwayCentrelinePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedApron();
            List<ApronPropertyType> theField;
            theField = (this.isSetConnectedApron() ? this.getConnectedApron() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "connectedApron", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedStand();
            List<AircraftStandPropertyType> theField;
            theField = (this.isSetConnectedStand() ? this.getConnectedStand() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "connectedStand", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedTaxiway();
            List<TaxiwayPropertyType> theField;
            theField = (this.isSetConnectedTaxiway() ? this.getConnectedTaxiway() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "connectedTaxiway", theField);
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
            List<GuidanceLineDirectionPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GuidanceLineTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextNameType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeGuidanceLineType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedTouchDownLiftOff();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetConnectedTouchDownLiftOff() ? this.getConnectedTouchDownLiftOff() : null);
            strategy.appendField(locator, this, "connectedTouchDownLiftOff", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedRunwayCentrelinePoint();
            List<RunwayCentrelinePointPropertyType> theField;
            theField = (this.isSetConnectedRunwayCentrelinePoint() ? this.getConnectedRunwayCentrelinePoint() : null);
            strategy.appendField(locator, this, "connectedRunwayCentrelinePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedApron();
            List<ApronPropertyType> theField;
            theField = (this.isSetConnectedApron() ? this.getConnectedApron() : null);
            strategy.appendField(locator, this, "connectedApron", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedStand();
            List<AircraftStandPropertyType> theField;
            theField = (this.isSetConnectedStand() ? this.getConnectedStand() : null);
            strategy.appendField(locator, this, "connectedStand", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConnectedTaxiway();
            List<TaxiwayPropertyType> theField;
            theField = (this.isSetConnectedTaxiway() ? this.getConnectedTaxiway() : null);
            strategy.appendField(locator, this, "connectedTaxiway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GuidanceLineDirectionPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GuidanceLineTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
