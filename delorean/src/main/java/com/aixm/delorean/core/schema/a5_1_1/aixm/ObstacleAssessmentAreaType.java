
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
 * <p>Java class for ObstacleAssessmentAreaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstacleAssessmentAreaType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ObstacleAssessmentAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstacleAssessmentAreaExtension"/>
 *                 </choice>
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
@XmlType(name = "ObstacleAssessmentAreaType", propOrder = {
    "type",
    "sectionNumber",
    "slope",
    "assessedAltitude",
    "slopeLowerAltitude",
    "gradientLowHigh",
    "surfaceZone",
    "safetyRegulation",
    "aircraftCategory",
    "significantObstacle",
    "surface",
    "startingCurve",
    "annotation",
    "extension"
})
@Entity(name = "ObstacleAssessmentAreaType")
@Table(name = "obstacleassessmentarea", schema = "shared")
public class ObstacleAssessmentAreaType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAssessmentSurfaceType> type;
    @XmlElementRef(name = "sectionNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> sectionNumber;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slope;
    @XmlElementRef(name = "assessedAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> assessedAltitude;
    @XmlElementRef(name = "slopeLowerAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> slopeLowerAltitude;
    @XmlElementRef(name = "gradientLowHigh", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> gradientLowHigh;
    @XmlElementRef(name = "surfaceZone", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstructionIdSurfaceZoneType> surfaceZone;
    @XmlElementRef(name = "safetyRegulation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> safetyRegulation;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElement(nillable = true)
    protected List<ObstructionPropertyType> significantObstacle;
    @XmlElementRef(name = "surface", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> surface;
    @XmlElementRef(name = "startingCurve", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> startingCurve;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstacleAssessmentAreaTypeExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeObstacleAssessmentSurfaceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeObstacleAssessmentSurfaceType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setSectionNumber(JAXBElement<NoNumberType> value) {
        this.sectionNumber = value;
    }

    @Transient
    public boolean isSetSectionNumber() {
        return (this.sectionNumber!= null);
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValSlopeType> value) {
        this.slope = value;
    }

    @Transient
    public boolean isSetSlope() {
        return (this.slope!= null);
    }

    /**
     * Gets the value of the assessedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAssessedAltitude() {
        return assessedAltitude;
    }

    /**
     * Sets the value of the assessedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAssessedAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.assessedAltitude = value;
    }

    @Transient
    public boolean isSetAssessedAltitude() {
        return (this.assessedAltitude!= null);
    }

    /**
     * Gets the value of the slopeLowerAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getSlopeLowerAltitude() {
        return slopeLowerAltitude;
    }

    /**
     * Sets the value of the slopeLowerAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setSlopeLowerAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.slopeLowerAltitude = value;
    }

    @Transient
    public boolean isSetSlopeLowerAltitude() {
        return (this.slopeLowerAltitude!= null);
    }

    /**
     * Gets the value of the gradientLowHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getGradientLowHigh() {
        return gradientLowHigh;
    }

    /**
     * Sets the value of the gradientLowHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setGradientLowHigh(JAXBElement<ValSlopeType> value) {
        this.gradientLowHigh = value;
    }

    @Transient
    public boolean isSetGradientLowHigh() {
        return (this.gradientLowHigh!= null);
    }

    /**
     * Gets the value of the surfaceZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstructionIdSurfaceZoneType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeObstructionIdSurfaceZoneType> getSurfaceZone() {
        return surfaceZone;
    }

    /**
     * Sets the value of the surfaceZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstructionIdSurfaceZoneType }{@code >}
     *     
     */
    public void setSurfaceZone(JAXBElement<CodeObstructionIdSurfaceZoneType> value) {
        this.surfaceZone = value;
    }

    @Transient
    public boolean isSetSurfaceZone() {
        return (this.surfaceZone!= null);
    }

    /**
     * Gets the value of the safetyRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getSafetyRegulation() {
        return safetyRegulation;
    }

    /**
     * Sets the value of the safetyRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setSafetyRegulation(JAXBElement<TextNameType> value) {
        this.safetyRegulation = value;
    }

    @Transient
    public boolean isSetSafetyRegulation() {
        return (this.safetyRegulation!= null);
    }

    /**
     * Gets the value of the aircraftCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "aircraftcategory_obstacleassessmentarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "aircraftcategory", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacleassessmentareapropertygroup", referencedColumnName = "hjid")
    })
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<>();
        }
        return this.aircraftCategory;
    }

    /**
     * 
     * 
     */
    public void setAircraftCategory(List<AircraftCharacteristicPropertyType> aircraftCategory) {
        this.aircraftCategory = aircraftCategory;
    }

    @Transient
    public boolean isSetAircraftCategory() {
        return ((this.aircraftCategory!= null)&&(!this.aircraftCategory.isEmpty()));
    }

    public void unsetAircraftCategory() {
        this.aircraftCategory = null;
    }

    /**
     * Gets the value of the significantObstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significantObstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificantObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ObstructionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "significantobstacle_obstacleassessmentarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "significantobstacle", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacleassessmentareapropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstructionPropertyType> getSignificantObstacle() {
        if (significantObstacle == null) {
            significantObstacle = new ArrayList<>();
        }
        return this.significantObstacle;
    }

    /**
     * 
     * 
     */
    public void setSignificantObstacle(List<ObstructionPropertyType> significantObstacle) {
        this.significantObstacle = significantObstacle;
    }

    @Transient
    public boolean isSetSignificantObstacle() {
        return ((this.significantObstacle!= null)&&(!this.significantObstacle.isEmpty()));
    }

    public void unsetSignificantObstacle() {
        this.significantObstacle = null;
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setSurface(JAXBElement<AIXMSurfacePropertyType> value) {
        this.surface = value;
    }

    @Transient
    public boolean isSetSurface() {
        return (this.surface!= null);
    }

    /**
     * Gets the value of the startingCurve property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getStartingCurve() {
        return startingCurve;
    }

    /**
     * Sets the value of the startingCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    public void setStartingCurve(JAXBElement<AIXMCurvePropertyType> value) {
        this.startingCurve = value;
    }

    @Transient
    public boolean isSetStartingCurve() {
        return (this.startingCurve!= null);
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
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_obstacleassessmentarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacleassessmentareapropertygroup", referencedColumnName = "hjid")
    })
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
     * {@link ObstacleAssessmentAreaTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstacleAssessmentAreaTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_OBSTACLE_ASSESSMEN_0")
    public List<ObstacleAssessmentAreaTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ObstacleAssessmentAreaTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeObstacleAssessmentSurfaceType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeObstacleAssessmentSurfaceType.class, this.getType());
    }

    public void setTypeItem(CodeObstacleAssessmentSurfaceType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeObstacleAssessmentSurfaceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "sectionnumber")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "sectionnumber_nilreason"))
    })
    public NoNumberType getSectionNumberItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getSectionNumber());
    }

    public void setSectionNumberItem(NoNumberType target) {
        setSectionNumber(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "sectionNumber"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slope")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slope_nilreason"))
    })
    public ValSlopeType getSlopeItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getSlope());
    }

    public void setSlopeItem(ValSlopeType target) {
        setSlope(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slope"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "assessedaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "assessedaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "assessedaltitude_nilreason"))
    })
    public ValDistanceVerticalType getAssessedAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAssessedAltitude());
    }

    public void setAssessedAltitudeItem(ValDistanceVerticalType target) {
        setAssessedAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "assessedAltitude"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopeloweraltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "slopeloweraltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopeloweraltitude_nilreason"))
    })
    public ValDistanceVerticalType getSlopeLowerAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getSlopeLowerAltitude());
    }

    public void setSlopeLowerAltitudeItem(ValDistanceVerticalType target) {
        setSlopeLowerAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slopeLowerAltitude"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "gradientlowhigh")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "gradientlowhigh_nilreason"))
    })
    public ValSlopeType getGradientLowHighItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getGradientLowHigh());
    }

    public void setGradientLowHighItem(ValSlopeType target) {
        setGradientLowHigh(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "gradientLowHigh"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "surfacezone")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "surfacezone_nilreason"))
    })
    public CodeObstructionIdSurfaceZoneType getSurfaceZoneItem() {
        return XmlAdapterUtils.unmarshallSource(CodeObstructionIdSurfaceZoneType.class, this.getSurfaceZone());
    }

    public void setSurfaceZoneItem(CodeObstructionIdSurfaceZoneType target) {
        setSurfaceZone(XmlAdapterUtils.marshallJAXBElement(CodeObstructionIdSurfaceZoneType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfaceZone"), ObstacleAssessmentAreaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "safetyregulation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "safetyregulation_nilreason"))
    })
    public TextNameType getSafetyRegulationItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getSafetyRegulation());
    }

    public void setSafetyRegulationItem(TextNameType target) {
        setSafetyRegulation(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "safetyRegulation"), ObstacleAssessmentAreaType.class, target));
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surface_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getSurfaceItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getSurface());
    }

    public void setSurfaceItem(AIXMSurfacePropertyType target) {
        setSurface(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surface"), ObstacleAssessmentAreaType.class, target));
    }

    @ManyToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "startingcurve_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getStartingCurveItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getStartingCurve());
    }

    public void setStartingCurveItem(AIXMCurvePropertyType target) {
        setStartingCurve(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startingCurve"), ObstacleAssessmentAreaType.class, target));
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
        final ObstacleAssessmentAreaType that = ((ObstacleAssessmentAreaType) object);
        {
            boolean lhsFieldIsSet = this.isSetSectionNumber();
            boolean rhsFieldIsSet = that.isSetSectionNumber();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getSectionNumber();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getSectionNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sectionNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sectionNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartingCurve();
            boolean rhsFieldIsSet = that.isSetStartingCurve();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getStartingCurve();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getStartingCurve();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startingCurve", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startingCurve", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlope();
            boolean rhsFieldIsSet = that.isSetSlope();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getSlope();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getSlope();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeObstacleAssessmentSurfaceType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeObstacleAssessmentSurfaceType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantObstacle();
            boolean rhsFieldIsSet = that.isSetSignificantObstacle();
            List<ObstructionPropertyType> lhsField;
            lhsField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            List<ObstructionPropertyType> rhsField;
            rhsField = (that.isSetSignificantObstacle()?that.getSignificantObstacle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantObstacle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantObstacle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurface();
            boolean rhsFieldIsSet = that.isSetSurface();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getSurface();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surface", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssessedAltitude();
            boolean rhsFieldIsSet = that.isSetAssessedAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAssessedAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAssessedAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "assessedAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "assessedAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlopeLowerAltitude();
            boolean rhsFieldIsSet = that.isSetSlopeLowerAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getSlopeLowerAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getSlopeLowerAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slopeLowerAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slopeLowerAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSafetyRegulation();
            boolean rhsFieldIsSet = that.isSetSafetyRegulation();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getSafetyRegulation();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getSafetyRegulation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "safetyRegulation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "safetyRegulation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCategory();
            boolean rhsFieldIsSet = that.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCategory()?that.getAircraftCategory():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurfaceZone();
            boolean rhsFieldIsSet = that.isSetSurfaceZone();
            JAXBElement<CodeObstructionIdSurfaceZoneType> lhsField;
            lhsField = this.getSurfaceZone();
            JAXBElement<CodeObstructionIdSurfaceZoneType> rhsField;
            rhsField = that.getSurfaceZone();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceZone", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceZone", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGradientLowHigh();
            boolean rhsFieldIsSet = that.isSetGradientLowHigh();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getGradientLowHigh();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getGradientLowHigh();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "gradientLowHigh", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "gradientLowHigh", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ObstacleAssessmentAreaTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ObstacleAssessmentAreaTypeExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeObstacleAssessmentSurfaceType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSectionNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getSectionNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sectionNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlope();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssessedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAssessedAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "assessedAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeLowerAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getSlopeLowerAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slopeLowerAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGradientLowHigh();
            JAXBElement<ValSlopeType> theField;
            theField = this.getGradientLowHigh();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "gradientLowHigh", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceZone();
            JAXBElement<CodeObstructionIdSurfaceZoneType> theField;
            theField = this.getSurfaceZone();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceZone", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSafetyRegulation();
            JAXBElement<TextNameType> theField;
            theField = this.getSafetyRegulation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "safetyRegulation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantObstacle();
            List<ObstructionPropertyType> theField;
            theField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantObstacle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurface();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartingCurve();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getStartingCurve();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startingCurve", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<ObstacleAssessmentAreaTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeObstacleAssessmentSurfaceType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSectionNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getSectionNumber();
            strategy.appendField(locator, this, "sectionNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlope();
            strategy.appendField(locator, this, "slope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssessedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAssessedAltitude();
            strategy.appendField(locator, this, "assessedAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeLowerAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getSlopeLowerAltitude();
            strategy.appendField(locator, this, "slopeLowerAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGradientLowHigh();
            JAXBElement<ValSlopeType> theField;
            theField = this.getGradientLowHigh();
            strategy.appendField(locator, this, "gradientLowHigh", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceZone();
            JAXBElement<CodeObstructionIdSurfaceZoneType> theField;
            theField = this.getSurfaceZone();
            strategy.appendField(locator, this, "surfaceZone", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSafetyRegulation();
            JAXBElement<TextNameType> theField;
            theField = this.getSafetyRegulation();
            strategy.appendField(locator, this, "safetyRegulation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            strategy.appendField(locator, this, "aircraftCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantObstacle();
            List<ObstructionPropertyType> theField;
            theField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            strategy.appendField(locator, this, "significantObstacle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurface();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getSurface();
            strategy.appendField(locator, this, "surface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartingCurve();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getStartingCurve();
            strategy.appendField(locator, this, "startingCurve", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ObstacleAssessmentAreaTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
