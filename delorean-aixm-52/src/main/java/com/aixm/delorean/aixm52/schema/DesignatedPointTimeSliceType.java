
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
 * Java class for DesignatedPointTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="DesignatedPointTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}CodeDesignatedPointDesignatorType" minOccurs=
"0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeDesignatedPointType" minOccurs="0"/>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}PointPropertyType" minOccurs="0"/>
 *         <element name="aimingPoint" type=
"{http://www.aixm.aero/schema/5.2}TouchDownLiftOffPropertyType" minOccurs="0"/>
 *         <element name="airportHeliport" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="runwayPoint" type=
"{http://www.aixm.aero/schema/5.2}RunwayCentrelinePointPropertyType" minOccurs=
"0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="codeICAOCountry" type=
"{http://www.aixm.aero/schema/5.2}CodeICAOCountryType" minOccurs="0"/>
 *         <element name="fix" type=
"{http://www.aixm.aero/schema/5.2}PointReferencePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractDesignatedPointExtension"/>
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
@XmlType(name = "DesignatedPointTimeSliceType", propOrder = {"designator", "type", "aixmName", "location",
        "aimingPoint", "airportHeliport", "runwayPoint", "annotation", "codeICAOCountry", "fix", "extension"})
@Entity(name = "DesignatedPointTimeSliceType")
@Table(name = "designatedpoint_t", schema = "navaids_point")
public class DesignatedPointTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignatedPointDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignatedPointType> type;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> location;
    @XmlElementRef(name = "aimingPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> aimingPoint;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElementRef(name = "runwayPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> runwayPoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "codeICAOCountry", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOCountryType> codeICAOCountry;
    @XmlElement(nillable = true)
    protected List<PointReferencePropertyType> fix;
    protected List<DesignatedPointExtensionType> extension;

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeDesignatedPointDesignatorType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeDesignatedPointDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeDesignatedPointDesignatorType }{@code >}
     *
     */
    public void setDesignator(JAXBElement<CodeDesignatedPointDesignatorType> value) {
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
     *         }{@code <}{@link CodeDesignatedPointType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeDesignatedPointType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeDesignatedPointType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeDesignatedPointType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
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
     * Gets the value of the location property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    public void setLocation(JAXBElement<AIXMPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location != null);
    }

    /**
     * Gets the value of the aimingPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getAimingPoint() {
        return aimingPoint;
    }

    /**
     * Sets the value of the aimingPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    public void setAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.aimingPoint = value;
    }

    @Transient
    public boolean isSetAimingPoint() {
        return (this.aimingPoint != null);
    }

    /**
     * Gets the value of the airportHeliport property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the airportHeliport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAirportHeliport().add(newItem);
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
    @JoinTable(name = "dsgntdpnttmslctp_arprthlprt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "airportheliport_hjid", referencedColumnName = "hjid")})
    public List<AirportHeliportPropertyType> getAirportHeliport() {
        if (airportHeliport == null) {
            airportHeliport = new ArrayList<>();
        }
        return this.airportHeliport;
    }

    /**
     *
     *
     */
    public void setAirportHeliport(List<AirportHeliportPropertyType> airportHeliport) {
        this.airportHeliport = airportHeliport;
    }

    @Transient
    public boolean isSetAirportHeliport() {
        return ((this.airportHeliport != null) && (!this.airportHeliport.isEmpty()));
    }

    public void unsetAirportHeliport() {
        this.airportHeliport = null;
    }

    /**
     * Gets the value of the runwayPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getRunwayPoint() {
        return runwayPoint;
    }

    /**
     * Sets the value of the runwayPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    public void setRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.runwayPoint = value;
    }

    @Transient
    public boolean isSetRunwayPoint() {
        return (this.runwayPoint != null);
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
    @JoinTable(name = "dsgntdpnttmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the codeICAOCountry property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeICAOCountryType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeICAOCountryType> getCodeICAOCountry() {
        return codeICAOCountry;
    }

    /**
     * Sets the value of the codeICAOCountry property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeICAOCountryType }{@code >}
     *
     */
    public void setCodeICAOCountry(JAXBElement<CodeICAOCountryType> value) {
        this.codeICAOCountry = value;
    }

    @Transient
    public boolean isSetCodeICAOCountry() {
        return (this.codeICAOCountry != null);
    }

    /**
     * Gets the value of the fix property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the fix property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getFix().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointReferencePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = PointReferencePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dsgntdpnttmslctp_fx_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "fix_hjid", referencedColumnName = "hjid")})
    public List<PointReferencePropertyType> getFix() {
        if (fix == null) {
            fix = new ArrayList<>();
        }
        return this.fix;
    }

    /**
     *
     *
     */
    public void setFix(List<PointReferencePropertyType> fix) {
        this.fix = fix;
    }

    @Transient
    public boolean isSetFix() {
        return ((this.fix != null) && (!this.fix.isEmpty()));
    }

    public void unsetFix() {
        this.fix = null;
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
     * {@link DesignatedPointExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = DesignatedPointExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "designatedpointe_hjid", referencedColumnName = "hjid")
    public List<DesignatedPointExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<DesignatedPointExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 5)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public CodeDesignatedPointDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDesignatedPointDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeDesignatedPointDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeDesignatedPointDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), DesignatedPointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeDesignatedPointType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDesignatedPointType.class, this.getType());
    }

    public void setTypeItem(CodeDesignatedPointType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeDesignatedPointType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), DesignatedPointTimeSliceType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "name"), DesignatedPointTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dsgntdpnttmslctp_lctn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), DesignatedPointTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dsgntdpnttmslctp_amngpnt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "aimingpoint_hjid", referencedColumnName = "hjid")})
    public TouchDownLiftOffPropertyType getAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getAimingPoint());
    }

    public void setAimingPointItem(TouchDownLiftOffPropertyType target) {
        setAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "aimingPoint"), DesignatedPointTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "dsgntdpnttmslctp_rnwpnt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "designatedpoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "runwaypoint_hjid", referencedColumnName = "hjid")})
    public RunwayCentrelinePointPropertyType getRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getRunwayPoint());
    }

    public void setRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "runwayPoint"), DesignatedPointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "codeicaocountry", columnDefinition = "VARCHAR", length = 2)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "codeicaocountrynilreason"))})
    public CodeICAOCountryType getCodeICAOCountryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeICAOCountryType.class, this.getCodeICAOCountry());
    }

    public void setCodeICAOCountryItem(CodeICAOCountryType target) {
        setCodeICAOCountry(XmlAdapterUtils.marshallJAXBElement(CodeICAOCountryType.class,
                new QName("http://www.aixm.aero/schema/5.2", "codeICAOCountry"), DesignatedPointTimeSliceType.class,
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
        final DesignatedPointTimeSliceType that = ((DesignatedPointTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAirportHeliport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetAirportHeliport() ? that.getAirportHeliport() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeICAOCountry();
            boolean rhsFieldIsSet = that.isSetCodeICAOCountry();
            JAXBElement<CodeICAOCountryType> lhsField;
            lhsField = this.getCodeICAOCountry();
            JAXBElement<CodeICAOCountryType> rhsField;
            rhsField = that.getCodeICAOCountry();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeICAOCountry", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeICAOCountry", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAimingPoint();
            boolean rhsFieldIsSet = that.isSetAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFix();
            boolean rhsFieldIsSet = that.isSetFix();
            List<PointReferencePropertyType> lhsField;
            lhsField = (this.isSetFix() ? this.getFix() : null);
            List<PointReferencePropertyType> rhsField;
            rhsField = (that.isSetFix() ? that.getFix() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<DesignatedPointExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<DesignatedPointExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeDesignatedPointType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeDesignatedPointType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeDesignatedPointDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeDesignatedPointDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayPoint();
            boolean rhsFieldIsSet = that.isSetRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayPoint", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeDesignatedPointDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeDesignatedPointType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
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
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayPoint", theField);
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
            boolean theFieldIsSet = this.isSetCodeICAOCountry();
            JAXBElement<CodeICAOCountryType> theField;
            theField = this.getCodeICAOCountry();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeICAOCountry", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFix();
            List<PointReferencePropertyType> theField;
            theField = (this.isSetFix() ? this.getFix() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DesignatedPointExtensionType> theField;
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
            JAXBElement<CodeDesignatedPointDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeDesignatedPointType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getAimingPoint();
            strategy.appendField(locator, this, "aimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getRunwayPoint();
            strategy.appendField(locator, this, "runwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeICAOCountry();
            JAXBElement<CodeICAOCountryType> theField;
            theField = this.getCodeICAOCountry();
            strategy.appendField(locator, this, "codeICAOCountry", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFix();
            List<PointReferencePropertyType> theField;
            theField = (this.isSetFix() ? this.getFix() : null);
            strategy.appendField(locator, this, "fix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DesignatedPointExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
