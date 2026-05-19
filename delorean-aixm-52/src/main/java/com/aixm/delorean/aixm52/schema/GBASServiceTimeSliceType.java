
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
 * Java class for GBASServiceTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="GBASServiceTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="approachServiceType" type=
"{http://www.aixm.aero/schema/5.2}CodeGBASApproachServiceType" minOccurs="0"/>
 *         <element name="positioningService" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="channelRSDS" type=
"{http://www.aixm.aero/schema/5.2}ValChannelNumberType" minOccurs="0"/>
 *         <element name="regionalService" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="approachServicePoint" type=
"{http://www.aixm.aero/schema/5.2}CodeCourseQualityGBASType" minOccurs="0"/>
 *         <element name="minimumDecisionHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="augmentationSystem" type=
"{http://www.aixm.aero/schema/5.2}GBASPropertyType" minOccurs="0"/>
 *         <element name="flightInspectionArc" type=
"{http://www.aixm.aero/schema/5.2}FlightInspectionTrajectoryPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}NavaidOperationalStatusPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="area" type=
"{http://www.aixm.aero/schema/5.2}SurfacePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="centrePoint" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="servedApproach" type=
"{http://www.aixm.aero/schema/5.2}RunwayDirectionPropertyType" maxOccurs=
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
"{http://www.aixm.aero/schema/5.2}AbstractGBASServiceExtension"/>
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
@XmlType(name = "GBASServiceTimeSliceType", propOrder = {"aixmName", "approachServiceType", "positioningService",
        "channelRSDS", "regionalService", "approachServicePoint", "minimumDecisionHeight", "augmentationSystem",
        "flightInspectionArc", "availability", "area", "centrePoint", "servedApproach", "annotation", "extension"})
@Entity(name = "GBASServiceTimeSliceType")
@Table(name = "gbasservice_t", schema = "navaids_point")
public class GBASServiceTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "approachServiceType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeGBASApproachServiceType> approachServiceType;
    @XmlElementRef(name = "positioningService", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> positioningService;
    @XmlElementRef(name = "channelRSDS", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValChannelNumberType> channelRSDS;
    @XmlElementRef(name = "regionalService", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> regionalService;
    @XmlElementRef(name = "approachServicePoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseQualityGBASType> approachServicePoint;
    @XmlElementRef(name = "minimumDecisionHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumDecisionHeight;
    @XmlElementRef(name = "augmentationSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<GBASPropertyType> augmentationSystem;
    @XmlElement(nillable = true)
    protected List<FlightInspectionTrajectoryPropertyType> flightInspectionArc;
    @XmlElement(nillable = true)
    protected List<NavaidOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AIXMSurfacePropertyType> area;
    @XmlElementRef(name = "centrePoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> centrePoint;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> servedApproach;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<GBASServiceExtensionType> extension;

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
     * Gets the value of the approachServiceType property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeGBASApproachServiceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeGBASApproachServiceType> getApproachServiceType() {
        return approachServiceType;
    }

    /**
     * Sets the value of the approachServiceType property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeGBASApproachServiceType }{@code >}
     *
     */
    public void setApproachServiceType(JAXBElement<CodeGBASApproachServiceType> value) {
        this.approachServiceType = value;
    }

    @Transient
    public boolean isSetApproachServiceType() {
        return (this.approachServiceType != null);
    }

    /**
     * Gets the value of the positioningService property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getPositioningService() {
        return positioningService;
    }

    /**
     * Sets the value of the positioningService property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setPositioningService(JAXBElement<CodeYesNoType> value) {
        this.positioningService = value;
    }

    @Transient
    public boolean isSetPositioningService() {
        return (this.positioningService != null);
    }

    /**
     * Gets the value of the channelRSDS property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValChannelNumberType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValChannelNumberType> getChannelRSDS() {
        return channelRSDS;
    }

    /**
     * Sets the value of the channelRSDS property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValChannelNumberType }{@code >}
     *
     */
    public void setChannelRSDS(JAXBElement<ValChannelNumberType> value) {
        this.channelRSDS = value;
    }

    @Transient
    public boolean isSetChannelRSDS() {
        return (this.channelRSDS != null);
    }

    /**
     * Gets the value of the regionalService property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRegionalService() {
        return regionalService;
    }

    /**
     * Sets the value of the regionalService property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setRegionalService(JAXBElement<CodeYesNoType> value) {
        this.regionalService = value;
    }

    @Transient
    public boolean isSetRegionalService() {
        return (this.regionalService != null);
    }

    /**
     * Gets the value of the approachServicePoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeCourseQualityGBASType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeCourseQualityGBASType> getApproachServicePoint() {
        return approachServicePoint;
    }

    /**
     * Sets the value of the approachServicePoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeCourseQualityGBASType }{@code >}
     *
     */
    public void setApproachServicePoint(JAXBElement<CodeCourseQualityGBASType> value) {
        this.approachServicePoint = value;
    }

    @Transient
    public boolean isSetApproachServicePoint() {
        return (this.approachServicePoint != null);
    }

    /**
     * Gets the value of the minimumDecisionHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumDecisionHeight() {
        return minimumDecisionHeight;
    }

    /**
     * Sets the value of the minimumDecisionHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumDecisionHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumDecisionHeight = value;
    }

    @Transient
    public boolean isSetMinimumDecisionHeight() {
        return (this.minimumDecisionHeight != null);
    }

    /**
     * Gets the value of the augmentationSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link GBASPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<GBASPropertyType> getAugmentationSystem() {
        return augmentationSystem;
    }

    /**
     * Sets the value of the augmentationSystem property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link GBASPropertyType }{@code >}
     *
     */
    public void setAugmentationSystem(JAXBElement<GBASPropertyType> value) {
        this.augmentationSystem = value;
    }

    @Transient
    public boolean isSetAugmentationSystem() {
        return (this.augmentationSystem != null);
    }

    /**
     * Gets the value of the flightInspectionArc property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the flightInspectionArc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getFlightInspectionArc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInspectionTrajectoryPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = FlightInspectionTrajectoryPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbassrvctmslctp_flghtinspctnarc_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "flightinspectionarc_hjid", referencedColumnName = "hjid")})
    public List<FlightInspectionTrajectoryPropertyType> getFlightInspectionArc() {
        if (flightInspectionArc == null) {
            flightInspectionArc = new ArrayList<>();
        }
        return this.flightInspectionArc;
    }

    /**
     *
     *
     */
    public void setFlightInspectionArc(List<FlightInspectionTrajectoryPropertyType> flightInspectionArc) {
        this.flightInspectionArc = flightInspectionArc;
    }

    @Transient
    public boolean isSetFlightInspectionArc() {
        return ((this.flightInspectionArc != null) && (!this.flightInspectionArc.isEmpty()));
    }

    public void unsetFlightInspectionArc() {
        this.flightInspectionArc = null;
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
    @JoinTable(name = "gbassrvctmslctp_avlblt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the area property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the area property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getArea().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIXMSurfacePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AIXMSurfacePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbassrvctmslctp_ar_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "area_hjid", referencedColumnName = "hjid")})
    public List<AIXMSurfacePropertyType> getArea() {
        if (area == null) {
            area = new ArrayList<>();
        }
        return this.area;
    }

    /**
     *
     *
     */
    public void setArea(List<AIXMSurfacePropertyType> area) {
        this.area = area;
    }

    @Transient
    public boolean isSetArea() {
        return ((this.area != null) && (!this.area.isEmpty()));
    }

    public void unsetArea() {
        this.area = null;
    }

    /**
     * Gets the value of the centrePoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getCentrePoint() {
        return centrePoint;
    }

    /**
     * Sets the value of the centrePoint property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setCentrePoint(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.centrePoint = value;
    }

    @Transient
    public boolean isSetCentrePoint() {
        return (this.centrePoint != null);
    }

    /**
     * Gets the value of the servedApproach property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the servedApproach property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getServedApproach().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayDirectionPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbassrvctmslctp_srvdapprch_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "servedapproach_hjid", referencedColumnName = "hjid")})
    public List<RunwayDirectionPropertyType> getServedApproach() {
        if (servedApproach == null) {
            servedApproach = new ArrayList<>();
        }
        return this.servedApproach;
    }

    /**
     *
     *
     */
    public void setServedApproach(List<RunwayDirectionPropertyType> servedApproach) {
        this.servedApproach = servedApproach;
    }

    @Transient
    public boolean isSetServedApproach() {
        return ((this.servedApproach != null) && (!this.servedApproach.isEmpty()));
    }

    public void unsetServedApproach() {
        this.servedApproach = null;
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
    @JoinTable(name = "gbassrvctmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link GBASServiceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = GBASServiceExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "gbasservicee_hjid", referencedColumnName = "hjid")
    public List<GBASServiceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<GBASServiceExtensionType> extension) {
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
                new QName("http://www.aixm.aero/schema/5.2", "name"), GBASServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "approachservicetype", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "approachservicetypenilreason"))})
    public CodeGBASApproachServiceType getApproachServiceTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeGBASApproachServiceType.class, this.getApproachServiceType());
    }

    public void setApproachServiceTypeItem(CodeGBASApproachServiceType target) {
        setApproachServiceType(XmlAdapterUtils.marshallJAXBElement(CodeGBASApproachServiceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "approachServiceType"), GBASServiceTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "positioningservice")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "positioningservicenilreason"))})
    public CodeYesNoType getPositioningServiceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getPositioningService());
    }

    public void setPositioningServiceItem(CodeYesNoType target) {
        setPositioningService(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "positioningService"), GBASServiceTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "channelrsds", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "channelrsdsnilreason"))})
    public ValChannelNumberType getChannelRSDSItem() {
        return XmlAdapterUtils.unmarshallSource(ValChannelNumberType.class, this.getChannelRSDS());
    }

    public void setChannelRSDSItem(ValChannelNumberType target) {
        setChannelRSDS(XmlAdapterUtils.marshallJAXBElement(ValChannelNumberType.class,
                new QName("http://www.aixm.aero/schema/5.2", "channelRSDS"), GBASServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "regionalservice")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "regionalservicenilreason"))})
    public CodeYesNoType getRegionalServiceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRegionalService());
    }

    public void setRegionalServiceItem(CodeYesNoType target) {
        setRegionalService(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "regionalService"), GBASServiceTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "approachservicepoint")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "approachservicepointnilreason"))})
    public CodeCourseQualityGBASType getApproachServicePointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseQualityGBASType.class, this.getApproachServicePoint());
    }

    public void setApproachServicePointItem(CodeCourseQualityGBASType target) {
        setApproachServicePoint(XmlAdapterUtils.marshallJAXBElement(CodeCourseQualityGBASType.class,
                new QName("http://www.aixm.aero/schema/5.2", "approachServicePoint"), GBASServiceTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumdecisionheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumdecisionheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumdecisionheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumdecisionheightnilreason"))})
    public ValDistanceVerticalType getMinimumDecisionHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumDecisionHeight());
    }

    public void setMinimumDecisionHeightItem(ValDistanceVerticalType target) {
        setMinimumDecisionHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumDecisionHeight"), GBASServiceTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = GBASPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbassrvctmslctp_agmnttnsstm_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "augmentationsystem_hjid", referencedColumnName = "hjid")})
    public GBASPropertyType getAugmentationSystemItem() {
        return XmlAdapterUtils.unmarshallSource(GBASPropertyType.class, this.getAugmentationSystem());
    }

    public void setAugmentationSystemItem(GBASPropertyType target) {
        setAugmentationSystem(XmlAdapterUtils.marshallJAXBElement(GBASPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "augmentationSystem"), GBASServiceTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gbassrvctmslctp_cntrpnt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "gbasservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centrepoint_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getCentrePointItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getCentrePoint());
    }

    public void setCentrePointItem(AIXMElevatedPointPropertyType target) {
        setCentrePoint(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centrePoint"), GBASServiceTimeSliceType.class, target));
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
        final GBASServiceTimeSliceType that = ((GBASServiceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetRegionalService();
            boolean rhsFieldIsSet = that.isSetRegionalService();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRegionalService();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRegionalService();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "regionalService", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "regionalService", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCentrePoint();
            boolean rhsFieldIsSet = that.isSetCentrePoint();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getCentrePoint();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getCentrePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centrePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centrePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPositioningService();
            boolean rhsFieldIsSet = that.isSetPositioningService();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getPositioningService();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getPositioningService();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "positioningService", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "positioningService", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServedApproach();
            boolean rhsFieldIsSet = that.isSetServedApproach();
            List<RunwayDirectionPropertyType> lhsField;
            lhsField = (this.isSetServedApproach() ? this.getServedApproach() : null);
            List<RunwayDirectionPropertyType> rhsField;
            rhsField = (that.isSetServedApproach() ? that.getServedApproach() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "servedApproach", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "servedApproach", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<GBASServiceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<GBASServiceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetChannelRSDS();
            boolean rhsFieldIsSet = that.isSetChannelRSDS();
            JAXBElement<ValChannelNumberType> lhsField;
            lhsField = this.getChannelRSDS();
            JAXBElement<ValChannelNumberType> rhsField;
            rhsField = that.getChannelRSDS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "channelRSDS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "channelRSDS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArea();
            boolean rhsFieldIsSet = that.isSetArea();
            List<AIXMSurfacePropertyType> lhsField;
            lhsField = (this.isSetArea() ? this.getArea() : null);
            List<AIXMSurfacePropertyType> rhsField;
            rhsField = (that.isSetArea() ? that.getArea() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "area", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "area", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachServicePoint();
            boolean rhsFieldIsSet = that.isSetApproachServicePoint();
            JAXBElement<CodeCourseQualityGBASType> lhsField;
            lhsField = this.getApproachServicePoint();
            JAXBElement<CodeCourseQualityGBASType> rhsField;
            rhsField = that.getApproachServicePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachServicePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachServicePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAugmentationSystem();
            boolean rhsFieldIsSet = that.isSetAugmentationSystem();
            JAXBElement<GBASPropertyType> lhsField;
            lhsField = this.getAugmentationSystem();
            JAXBElement<GBASPropertyType> rhsField;
            rhsField = that.getAugmentationSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "augmentationSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "augmentationSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumDecisionHeight();
            boolean rhsFieldIsSet = that.isSetMinimumDecisionHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumDecisionHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumDecisionHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumDecisionHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumDecisionHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachServiceType();
            boolean rhsFieldIsSet = that.isSetApproachServiceType();
            JAXBElement<CodeGBASApproachServiceType> lhsField;
            lhsField = this.getApproachServiceType();
            JAXBElement<CodeGBASApproachServiceType> rhsField;
            rhsField = that.getApproachServiceType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachServiceType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachServiceType", rhsField);
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
            boolean lhsFieldIsSet = this.isSetFlightInspectionArc();
            boolean rhsFieldIsSet = that.isSetFlightInspectionArc();
            List<FlightInspectionTrajectoryPropertyType> lhsField;
            lhsField = (this.isSetFlightInspectionArc() ? this.getFlightInspectionArc() : null);
            List<FlightInspectionTrajectoryPropertyType> rhsField;
            rhsField = (that.isSetFlightInspectionArc() ? that.getFlightInspectionArc() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightInspectionArc", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightInspectionArc", rhsField);
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
            boolean theFieldIsSet = this.isSetApproachServiceType();
            JAXBElement<CodeGBASApproachServiceType> theField;
            theField = this.getApproachServiceType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachServiceType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPositioningService();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPositioningService();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "positioningService", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannelRSDS();
            JAXBElement<ValChannelNumberType> theField;
            theField = this.getChannelRSDS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "channelRSDS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRegionalService();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRegionalService();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "regionalService", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachServicePoint();
            JAXBElement<CodeCourseQualityGBASType> theField;
            theField = this.getApproachServicePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachServicePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDecisionHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDecisionHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumDecisionHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentationSystem();
            JAXBElement<GBASPropertyType> theField;
            theField = this.getAugmentationSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "augmentationSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightInspectionArc();
            List<FlightInspectionTrajectoryPropertyType> theField;
            theField = (this.isSetFlightInspectionArc() ? this.getFlightInspectionArc() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightInspectionArc", theField);
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
            boolean theFieldIsSet = this.isSetArea();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetArea() ? this.getArea() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "area", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePoint();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getCentrePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centrePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedApproach();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetServedApproach() ? this.getServedApproach() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "servedApproach", theField);
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
            List<GBASServiceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetApproachServiceType();
            JAXBElement<CodeGBASApproachServiceType> theField;
            theField = this.getApproachServiceType();
            strategy.appendField(locator, this, "approachServiceType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPositioningService();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPositioningService();
            strategy.appendField(locator, this, "positioningService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannelRSDS();
            JAXBElement<ValChannelNumberType> theField;
            theField = this.getChannelRSDS();
            strategy.appendField(locator, this, "channelRSDS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRegionalService();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRegionalService();
            strategy.appendField(locator, this, "regionalService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachServicePoint();
            JAXBElement<CodeCourseQualityGBASType> theField;
            theField = this.getApproachServicePoint();
            strategy.appendField(locator, this, "approachServicePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDecisionHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDecisionHeight();
            strategy.appendField(locator, this, "minimumDecisionHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentationSystem();
            JAXBElement<GBASPropertyType> theField;
            theField = this.getAugmentationSystem();
            strategy.appendField(locator, this, "augmentationSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightInspectionArc();
            List<FlightInspectionTrajectoryPropertyType> theField;
            theField = (this.isSetFlightInspectionArc() ? this.getFlightInspectionArc() : null);
            strategy.appendField(locator, this, "flightInspectionArc", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<NavaidOperationalStatusPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArea();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetArea() ? this.getArea() : null);
            strategy.appendField(locator, this, "area", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentrePoint();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getCentrePoint();
            strategy.appendField(locator, this, "centrePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServedApproach();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetServedApproach() ? this.getServedApproach() : null);
            strategy.appendField(locator, this, "servedApproach", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GBASServiceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
