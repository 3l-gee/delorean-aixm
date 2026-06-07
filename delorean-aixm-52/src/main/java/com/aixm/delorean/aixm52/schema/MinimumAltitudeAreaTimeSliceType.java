
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
 * Java class for MinimumAltitudeAreaTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="MinimumAltitudeAreaTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeAreaAltitudeType" minOccurs="0"/>
 *         <element name="lowestTemperature" type=
"{http://www.aixm.aero/schema/5.2}ValTemperatureType" minOccurs="0"/>
 *         <element name="designCriteria" type=
"{http://www.aixm.aero/schema/5.2}DesignStandardPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="sector" type=
"{http://www.aixm.aero/schema/5.2}MinimumAltitudeAreaSectorPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="centrePoint_fixDesignatedPoint" type=
"{http://www.aixm.aero/schema/5.2}DesignatedPointPropertyType" minOccurs="0"/>
 *           <element name="centrePoint_navaidSystem" type=
"{http://www.aixm.aero/schema/5.2}NavaidPropertyType" minOccurs="0"/>
 *           <element name="centrePoint_position" type=
"{http://www.aixm.aero/schema/5.2}PointPropertyType" minOccurs="0"/>
 *           <element name="centrePoint_runwayPoint" type=
"{http://www.aixm.aero/schema/5.2}RunwayCentrelinePointPropertyType" minOccurs=
"0"/>
 *           <element name="centrePoint_aimingPoint" type=
"{http://www.aixm.aero/schema/5.2}TouchDownLiftOffPropertyType" minOccurs="0"/>
 *           <element name="centrePoint_airportReferencePoint" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="concernedAirspace" type=
"{http://www.aixm.aero/schema/5.2}AirspacePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="location" type=
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
"{http://www.aixm.aero/schema/5.2}AbstractMinimumAltitudeAreaExtension"/>
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
@XmlType(name = "MinimumAltitudeAreaTimeSliceType", propOrder = {"type", "lowestTemperature", "designCriteria",
        "sector", "centrePointFixDesignatedPoint", "centrePointNavaidSystem", "centrePointPosition",
        "centrePointRunwayPoint", "centrePointAimingPoint", "centrePointAirportReferencePoint", "concernedAirspace",
        "location", "annotation", "extension"})
@Entity(name = "MinimumAltitudeAreaTimeSliceType")
@Table(name = "minimumaltitudearea_t", schema = "procedure")
public class MinimumAltitudeAreaTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAreaAltitudeType> type;
    @XmlElementRef(name = "lowestTemperature", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> lowestTemperature;
    @XmlElement(nillable = true)
    protected List<DesignStandardPropertyType> designCriteria;
    @XmlElement(nillable = true)
    protected List<MinimumAltitudeAreaSectorPropertyType> sector;
    @XmlElementRef(name = "centrePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> centrePointFixDesignatedPoint;
    @XmlElementRef(name = "centrePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> centrePointNavaidSystem;
    @XmlElementRef(name = "centrePoint_position", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> centrePointPosition;
    @XmlElementRef(name = "centrePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> centrePointRunwayPoint;
    @XmlElementRef(name = "centrePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> centrePointAimingPoint;
    @XmlElementRef(name = "centrePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> centrePointAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> concernedAirspace;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MinimumAltitudeAreaTimeSliceExtensionType> extension;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAreaAltitudeType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAreaAltitudeType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAreaAltitudeType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeAreaAltitudeType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the lowestTemperature property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValTemperatureType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValTemperatureType> getLowestTemperature() {
        return lowestTemperature;
    }

    /**
     * Sets the value of the lowestTemperature property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValTemperatureType }{@code >}
     *
     */
    public void setLowestTemperature(JAXBElement<ValTemperatureType> value) {
        this.lowestTemperature = value;
    }

    @Transient
    public boolean isSetLowestTemperature() {
        return (this.lowestTemperature != null);
    }

    /**
     * Gets the value of the designCriteria property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the designCriteria property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDesignCriteria().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignStandardPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = DesignStandardPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_dsgncrtr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "designcriteria_hjid", referencedColumnName = "hjid")})
    public List<DesignStandardPropertyType> getDesignCriteria() {
        if (designCriteria == null) {
            designCriteria = new ArrayList<>();
        }
        return this.designCriteria;
    }

    /**
     *
     *
     */
    public void setDesignCriteria(List<DesignStandardPropertyType> designCriteria) {
        this.designCriteria = designCriteria;
    }

    @Transient
    public boolean isSetDesignCriteria() {
        return ((this.designCriteria != null) && (!this.designCriteria.isEmpty()));
    }

    public void unsetDesignCriteria() {
        this.designCriteria = null;
    }

    /**
     * Gets the value of the sector property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the sector property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSector().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinimumAltitudeAreaSectorPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = MinimumAltitudeAreaSectorPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_sctr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "sector_hjid", referencedColumnName = "hjid")})
    public List<MinimumAltitudeAreaSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<>();
        }
        return this.sector;
    }

    /**
     *
     *
     */
    public void setSector(List<MinimumAltitudeAreaSectorPropertyType> sector) {
        this.sector = sector;
    }

    @Transient
    public boolean isSetSector() {
        return ((this.sector != null) && (!this.sector.isEmpty()));
    }

    public void unsetSector() {
        this.sector = null;
    }

    /**
     * Gets the value of the centrePointFixDesignatedPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getCentrePointFixDesignatedPoint() {
        return centrePointFixDesignatedPoint;
    }

    /**
     * Sets the value of the centrePointFixDesignatedPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *
     */
    public void setCentrePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.centrePointFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetCentrePointFixDesignatedPoint() {
        return (this.centrePointFixDesignatedPoint != null);
    }

    /**
     * Gets the value of the centrePointNavaidSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link NavaidPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getCentrePointNavaidSystem() {
        return centrePointNavaidSystem;
    }

    /**
     * Sets the value of the centrePointNavaidSystem property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link NavaidPropertyType }{@code >}
     *
     */
    public void setCentrePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.centrePointNavaidSystem = value;
    }

    @Transient
    public boolean isSetCentrePointNavaidSystem() {
        return (this.centrePointNavaidSystem != null);
    }

    /**
     * Gets the value of the centrePointPosition property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getCentrePointPosition() {
        return centrePointPosition;
    }

    /**
     * Sets the value of the centrePointPosition property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMPointPropertyType }{@code >}
     *
     */
    public void setCentrePointPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.centrePointPosition = value;
    }

    @Transient
    public boolean isSetCentrePointPosition() {
        return (this.centrePointPosition != null);
    }

    /**
     * Gets the value of the centrePointRunwayPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getCentrePointRunwayPoint() {
        return centrePointRunwayPoint;
    }

    /**
     * Sets the value of the centrePointRunwayPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *
     */
    public void setCentrePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.centrePointRunwayPoint = value;
    }

    @Transient
    public boolean isSetCentrePointRunwayPoint() {
        return (this.centrePointRunwayPoint != null);
    }

    /**
     * Gets the value of the centrePointAimingPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getCentrePointAimingPoint() {
        return centrePointAimingPoint;
    }

    /**
     * Sets the value of the centrePointAimingPoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *
     */
    public void setCentrePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.centrePointAimingPoint = value;
    }

    @Transient
    public boolean isSetCentrePointAimingPoint() {
        return (this.centrePointAimingPoint != null);
    }

    /**
     * Gets the value of the centrePointAirportReferencePoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getCentrePointAirportReferencePoint() {
        return centrePointAirportReferencePoint;
    }

    /**
     * Sets the value of the centrePointAirportReferencePoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    public void setCentrePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.centrePointAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetCentrePointAirportReferencePoint() {
        return (this.centrePointAirportReferencePoint != null);
    }

    /**
     * Gets the value of the concernedAirspace property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the concernedAirspace property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConcernedAirspace().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AirspacePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cncrndarspc_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "concernedairspace_hjid", referencedColumnName = "hjid")})
    public List<AirspacePropertyType> getConcernedAirspace() {
        if (concernedAirspace == null) {
            concernedAirspace = new ArrayList<>();
        }
        return this.concernedAirspace;
    }

    /**
     *
     *
     */
    public void setConcernedAirspace(List<AirspacePropertyType> concernedAirspace) {
        this.concernedAirspace = concernedAirspace;
    }

    @Transient
    public boolean isSetConcernedAirspace() {
        return ((this.concernedAirspace != null) && (!this.concernedAirspace.isEmpty()));
    }

    public void unsetConcernedAirspace() {
        this.concernedAirspace = null;
    }

    /**
     * Gets the value of the location property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the location property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getLocation().add(newItem);
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
    @JoinTable(name = "mnmmalttdartmslctp_lctn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public List<AirportHeliportPropertyType> getLocation() {
        if (location == null) {
            location = new ArrayList<>();
        }
        return this.location;
    }

    /**
     *
     *
     */
    public void setLocation(List<AirportHeliportPropertyType> location) {
        this.location = location;
    }

    @Transient
    public boolean isSetLocation() {
        return ((this.location != null) && (!this.location.isEmpty()));
    }

    public void unsetLocation() {
        this.location = null;
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
    @JoinTable(name = "mnmmalttdartmslctp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link MinimumAltitudeAreaTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = MinimumAltitudeAreaTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "minimumaltitudearea_te_hjid", referencedColumnName = "hjid")
    public List<MinimumAltitudeAreaTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<MinimumAltitudeAreaTimeSliceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeAreaAltitudeType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAreaAltitudeType.class, this.getType());
    }

    public void setTypeItem(CodeAreaAltitudeType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAreaAltitudeType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lowesttemperature", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lowesttemperatureuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lowesttemperatureaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowesttemperaturenilreason"))})
    public ValTemperatureType getLowestTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getLowestTemperature());
    }

    public void setLowestTemperatureItem(ValTemperatureType target) {
        setLowestTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowestTemperature"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntfxdsgntdpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointfixdesignatedpoint_hjid", referencedColumnName = "hjid")})
    public DesignatedPointPropertyType getCentrePointFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class,
                this.getCentrePointFixDesignatedPoint());
    }

    public void setCentrePointFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setCentrePointFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_fixDesignatedPoint"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntnvdsstm_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointnavaidsystem_hjid", referencedColumnName = "hjid")})
    public NavaidPropertyType getCentrePointNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getCentrePointNavaidSystem());
    }

    public void setCentrePointNavaidSystemItem(NavaidPropertyType target) {
        setCentrePointNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_navaidSystem"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntpstn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointposition_hjid", referencedColumnName = "hjid")})
    public AIXMPointPropertyType getCentrePointPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getCentrePointPosition());
    }

    public void setCentrePointPositionItem(AIXMPointPropertyType target) {
        setCentrePointPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_position"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntrnwpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointrunwaypoint_hjid", referencedColumnName = "hjid")})
    public RunwayCentrelinePointPropertyType getCentrePointRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class,
                this.getCentrePointRunwayPoint());
    }

    public void setCentrePointRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setCentrePointRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_runwayPoint"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntamngpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointaimingpoint_hjid", referencedColumnName = "hjid")})
    public TouchDownLiftOffPropertyType getCentrePointAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getCentrePointAimingPoint());
    }

    public void setCentrePointAimingPointItem(TouchDownLiftOffPropertyType target) {
        setCentrePointAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_aimingPoint"),
                MinimumAltitudeAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmmalttdartmslctp_cntrpntarprtrfrncpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minimumaltitudearea_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepointairportreferencepoint_hjid", referencedColumnName = "hjid")})
    public AirportHeliportPropertyType getCentrePointAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class,
                this.getCentrePointAirportReferencePoint());
    }

    public void setCentrePointAirportReferencePointItem(AirportHeliportPropertyType target) {
        setCentrePointAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint_airportReferencePoint"),
                MinimumAltitudeAreaTimeSliceType.class, target));
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
        final MinimumAltitudeAreaTimeSliceType that = ((MinimumAltitudeAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAreaAltitudeType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAreaAltitudeType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointAimingPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getCentrePointAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getCentrePointAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointAirportReferencePoint",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointAirportReferencePoint",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<MinimumAltitudeAreaTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<MinimumAltitudeAreaTimeSliceExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetCentrePointPosition();
            boolean rhsFieldIsSet = that.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getCentrePointPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getCentrePointFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointFixDesignatedPoint",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointFixDesignatedPoint",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowestTemperature();
            boolean rhsFieldIsSet = that.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getLowestTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getLowestTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowestTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowestTemperature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetLocation() ? this.getLocation() : null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetLocation() ? that.getLocation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetConcernedAirspace();
            boolean rhsFieldIsSet = that.isSetConcernedAirspace();
            List<AirspacePropertyType> lhsField;
            lhsField = (this.isSetConcernedAirspace() ? this.getConcernedAirspace() : null);
            List<AirspacePropertyType> rhsField;
            rhsField = (that.isSetConcernedAirspace() ? that.getConcernedAirspace() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "concernedAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "concernedAirspace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignCriteria();
            boolean rhsFieldIsSet = that.isSetDesignCriteria();
            List<DesignStandardPropertyType> lhsField;
            lhsField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
            List<DesignStandardPropertyType> rhsField;
            rhsField = (that.isSetDesignCriteria() ? that.getDesignCriteria() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designCriteria", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designCriteria", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointNavaidSystem();
            boolean rhsFieldIsSet = that.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getCentrePointNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSector();
            boolean rhsFieldIsSet = that.isSetSector();
            List<MinimumAltitudeAreaSectorPropertyType> lhsField;
            lhsField = (this.isSetSector() ? this.getSector() : null);
            List<MinimumAltitudeAreaSectorPropertyType> rhsField;
            rhsField = (that.isSetSector() ? that.getSector() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentrePointRunwayPoint();
            boolean rhsFieldIsSet = that.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getCentrePointRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePointRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePointRunwayPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAreaAltitudeType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getLowestTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowestTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignCriteria();
            List<DesignStandardPropertyType> theField;
            theField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designCriteria", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<MinimumAltitudeAreaSectorPropertyType> theField;
            theField = (this.isSetSector() ? this.getSector() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getCentrePointFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getCentrePointNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getCentrePointPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getCentrePointRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getCentrePointAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getCentrePointAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePointAirportReferencePoint",
                    theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConcernedAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetConcernedAirspace() ? this.getConcernedAirspace() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "concernedAirspace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetLocation() ? this.getLocation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
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
            List<MinimumAltitudeAreaTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAreaAltitudeType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowestTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getLowestTemperature();
            strategy.appendField(locator, this, "lowestTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignCriteria();
            List<DesignStandardPropertyType> theField;
            theField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
            strategy.appendField(locator, this, "designCriteria", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<MinimumAltitudeAreaSectorPropertyType> theField;
            theField = (this.isSetSector() ? this.getSector() : null);
            strategy.appendField(locator, this, "sector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getCentrePointFixDesignatedPoint();
            strategy.appendField(locator, this, "centrePointFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getCentrePointNavaidSystem();
            strategy.appendField(locator, this, "centrePointNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getCentrePointPosition();
            strategy.appendField(locator, this, "centrePointPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getCentrePointRunwayPoint();
            strategy.appendField(locator, this, "centrePointRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getCentrePointAimingPoint();
            strategy.appendField(locator, this, "centrePointAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getCentrePointAirportReferencePoint();
            strategy.appendField(locator, this, "centrePointAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConcernedAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetConcernedAirspace() ? this.getConcernedAirspace() : null);
            strategy.appendField(locator, this, "concernedAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetLocation() ? this.getLocation() : null);
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<MinimumAltitudeAreaTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
