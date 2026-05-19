
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
 * Java class for GBASTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="GBASTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}CodeICAOType" minOccurs="0"/>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="maximumUseDistance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="flightChecked" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="operator" type=
"{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" minOccurs=
"0"/>
 *         <element name="augmentedSystem" type=
"{http://www.aixm.aero/schema/5.2}SatelliteSystemPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="antenna" type=
"{http://www.aixm.aero/schema/5.2}VDBAntennaPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}NavaidOperationalStatusPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="referencePoint" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="servedAirport" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractGBASExtension"/>
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
@XmlType(name = "GBASTimeSliceType", propOrder = {"designator", "aixmName", "maximumUseDistance", "flightChecked",
        "operator", "augmentedSystem", "antenna", "availability", "referencePoint", "servedAirport", "annotation",
        "extension"})
@Entity(name = "GBASTimeSliceType")
@Table(name = "gbas_t", schema = "navaids_point")
public class GBASTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "maximumUseDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> maximumUseDistance;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "operator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> operator;
    @XmlElement(nillable = true)
    protected List<SatelliteSystemPropertyType> augmentedSystem;
    @XmlElement(nillable = true)
    protected List<VDBAntennaPropertyType> antenna;
    @XmlElement(nillable = true)
    protected List<NavaidOperationalStatusPropertyType> availability;
    @XmlElementRef(name = "referencePoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> referencePoint;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> servedAirport;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<GBASExtensionType> extension;

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeICAOType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeICAOType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link CodeICAOType
     *            }{@code >}
     *
     */
    public void setDesignator(JAXBElement<CodeICAOType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

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
     * Gets the value of the maximumUseDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getMaximumUseDistance() {
        return maximumUseDistance;
    }

    /**
     * Sets the value of the maximumUseDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setMaximumUseDistance(JAXBElement<ValDistanceType> value) {
        this.maximumUseDistance = value;
    }

    @Transient
    public boolean isSetMaximumUseDistance() {
        return (this.maximumUseDistance != null);
    }

    /**
     * Gets the value of the flightChecked property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Sets the value of the flightChecked property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    @Transient
    public boolean isSetFlightChecked() {
        return (this.flightChecked != null);
    }

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    public void setOperator(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.operator = value;
    }

    @Transient
    public boolean isSetOperator() {
        return (this.operator != null);
    }

    /**
     * Gets the value of the augmentedSystem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the augmentedSystem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAugmentedSystem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SatelliteSystemPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteSystemPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_agmntdsstm_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "augmentedsystem_hjid", referencedColumnName = "hjid")})
    public List<SatelliteSystemPropertyType> getAugmentedSystem() {
        if (augmentedSystem == null) {
            augmentedSystem = new ArrayList<>();
        }
        return this.augmentedSystem;
    }

    /**
     *
     *
     */
    public void setAugmentedSystem(List<SatelliteSystemPropertyType> augmentedSystem) {
        this.augmentedSystem = augmentedSystem;
    }

    @Transient
    public boolean isSetAugmentedSystem() {
        return ((this.augmentedSystem != null) && (!this.augmentedSystem.isEmpty()));
    }

    public void unsetAugmentedSystem() {
        this.augmentedSystem = null;
    }

    /**
     * Gets the value of the antenna property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the antenna property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAntenna().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VDBAntennaPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = VDBAntennaPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_antnn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "antenna_hjid", referencedColumnName = "hjid")})
    public List<VDBAntennaPropertyType> getAntenna() {
        if (antenna == null) {
            antenna = new ArrayList<>();
        }
        return this.antenna;
    }

    /**
     *
     *
     */
    public void setAntenna(List<VDBAntennaPropertyType> antenna) {
        this.antenna = antenna;
    }

    @Transient
    public boolean isSetAntenna() {
        return ((this.antenna != null) && (!this.antenna.isEmpty()));
    }

    public void unsetAntenna() {
        this.antenna = null;
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
     * {@link NavaidOperationalStatusPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NavaidOperationalStatusPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_avlblt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<NavaidOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<NavaidOperationalStatusPropertyType> availability) {
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
     * Gets the value of the referencePoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setReferencePoint(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.referencePoint = value;
    }

    @Transient
    public boolean isSetReferencePoint() {
        return (this.referencePoint != null);
    }

    /**
     * Gets the value of the servedAirport property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the servedAirport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getServedAirport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_srvdarprt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "servedairport_hjid", referencedColumnName = "hjid")})
    public List<AirportHeliportPropertyType> getServedAirport() {
        if (servedAirport == null) {
            servedAirport = new ArrayList<>();
        }
        return this.servedAirport;
    }

    /**
     *
     *
     */
    public void setServedAirport(List<AirportHeliportPropertyType> servedAirport) {
        this.servedAirport = servedAirport;
    }

    @Transient
    public boolean isSetServedAirport() {
        return ((this.servedAirport != null) && (!this.servedAirport.isEmpty()));
    }

    public void unsetServedAirport() {
        this.servedAirport = null;
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
    @JoinTable(name = "gbastmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link GBASExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = GBASExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "gbase_hjid", referencedColumnName = "hjid")
    public List<GBASExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<GBASExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 4)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public CodeICAOType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeICAOType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeICAOType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeICAOType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), GBASTimeSliceType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "name"), GBASTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "maximumusedistance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "maximumusedistanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "maximumusedistanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maximumusedistancenilreason"))})
    public ValDistanceType getMaximumUseDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getMaximumUseDistance());
    }

    public void setMaximumUseDistanceItem(ValDistanceType target) {
        setMaximumUseDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maximumUseDistance"), GBASTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "flightchecked")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "flightcheckednilreason"))})
    public CodeYesNoType getFlightCheckedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlightChecked());
    }

    public void setFlightCheckedItem(CodeYesNoType target) {
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "flightChecked"), GBASTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_oprtr_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "operator_hjid", referencedColumnName = "hjid")})
    public OrganisationAuthorityPropertyType getOperatorItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getOperator());
    }

    public void setOperatorItem(OrganisationAuthorityPropertyType target) {
        setOperator(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "operator"), GBASTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbastmslctp_rfrncpnt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbas_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "referencepoint_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getReferencePoint());
    }

    public void setReferencePointItem(AIXMElevatedPointPropertyType target) {
        setReferencePoint(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "referencePoint"), GBASTimeSliceType.class, target));
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
        final GBASTimeSliceType that = ((GBASTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAugmentedSystem();
            boolean rhsFieldIsSet = that.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> lhsField;
            lhsField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            List<SatelliteSystemPropertyType> rhsField;
            rhsField = (that.isSetAugmentedSystem() ? that.getAugmentedSystem() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "augmentedSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "augmentedSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightChecked();
            boolean rhsFieldIsSet = that.isSetFlightChecked();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFlightChecked();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFlightChecked();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightChecked", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightChecked", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<NavaidOperationalStatusPropertyType> rhsField;
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
            List<GBASExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<GBASExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServedAirport();
            boolean rhsFieldIsSet = that.isSetServedAirport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetServedAirport() ? this.getServedAirport() : null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetServedAirport() ? that.getServedAirport() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "servedAirport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "servedAirport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperator();
            boolean rhsFieldIsSet = that.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getOperator();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getOperator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAntenna();
            boolean rhsFieldIsSet = that.isSetAntenna();
            List<VDBAntennaPropertyType> lhsField;
            lhsField = (this.isSetAntenna() ? this.getAntenna() : null);
            List<VDBAntennaPropertyType> rhsField;
            rhsField = (that.isSetAntenna() ? that.getAntenna() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "antenna", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "antenna", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferencePoint();
            boolean rhsFieldIsSet = that.isSetReferencePoint();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getReferencePoint();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeICAOType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeICAOType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumUseDistance();
            boolean rhsFieldIsSet = that.isSetMaximumUseDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getMaximumUseDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getMaximumUseDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumUseDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumUseDistance", rhsField);
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
            JAXBElement<CodeICAOType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumUseDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMaximumUseDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumUseDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightChecked", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOperator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> theField;
            theField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "augmentedSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntenna();
            List<VDBAntennaPropertyType> theField;
            theField = (this.isSetAntenna() ? this.getAntenna() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "antenna", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePoint();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetServedAirport() ? this.getServedAirport() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "servedAirport", theField);
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
            List<GBASExtensionType> theField;
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
            JAXBElement<CodeICAOType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumUseDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMaximumUseDistance();
            strategy.appendField(locator, this, "maximumUseDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            strategy.appendField(locator, this, "flightChecked", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> theField;
            theField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            strategy.appendField(locator, this, "augmentedSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntenna();
            List<VDBAntennaPropertyType> theField;
            theField = (this.isSetAntenna() ? this.getAntenna() : null);
            strategy.appendField(locator, this, "antenna", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencePoint();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getReferencePoint();
            strategy.appendField(locator, this, "referencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetServedAirport() ? this.getServedAirport() : null);
            strategy.appendField(locator, this, "servedAirport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GBASExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
