
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for RunwayContaminationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayContaminationType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractSurfaceContaminationType">
 *       <sequence>
 *         <element name="observationTime" type="{http://www.aixm.aero/schema/5.1.1}DateTimeType" minOccurs="0"/>
 *         <element name="depth" type="{http://www.aixm.aero/schema/5.1.1}ValDepthType" minOccurs="0"/>
 *         <element name="frictionCoefficient" type="{http://www.aixm.aero/schema/5.1.1}ValFrictionType" minOccurs="0"/>
 *         <element name="frictionEstimation" type="{http://www.aixm.aero/schema/5.1.1}CodeFrictionEstimateType" minOccurs="0"/>
 *         <element name="frictionDevice" type="{http://www.aixm.aero/schema/5.1.1}CodeFrictionDeviceType" minOccurs="0"/>
 *         <element name="obscuredLights" type="{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="furtherClearanceTime" type="{http://www.aixm.aero/schema/5.1.1}TimeType" minOccurs="0"/>
 *         <element name="furtherTotalClearance" type="{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="nextObservationTime" type="{http://www.aixm.aero/schema/5.1.1}DateTimeType" minOccurs="0"/>
 *         <element name="proportion" type="{http://www.aixm.aero/schema/5.1.1}ValPercentType" minOccurs="0"/>
 *         <element name="criticalRidge" type="{http://www.aixm.aero/schema/5.1.1}RidgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="layer" type="{http://www.aixm.aero/schema/5.1.1}SurfaceContaminationLayerPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RunwayContaminationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurfaceContaminationExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayContaminationExtension"/>
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
@XmlType(name = "RunwayContaminationType", propOrder = {
    "observationTime",
    "depth",
    "frictionCoefficient",
    "frictionEstimation",
    "frictionDevice",
    "obscuredLights",
    "furtherClearanceTime",
    "furtherTotalClearance",
    "nextObservationTime",
    "proportion",
    "criticalRidge",
    "layer",
    "annotation",
    "clearedLength",
    "clearedWidth",
    "clearedSide",
    "furtherClearanceLength",
    "furtherClearanceWidth",
    "obscuredLightsSide",
    "clearedLengthBegin",
    "taxiwayAvailable",
    "apronAvailable",
    "extension"
})
@Entity(name = "RunwayContaminationType")
@Table(name = "runwaycontamination", schema = "airport_heliport")
public class RunwayContaminationType
    extends AbstractSurfaceContaminationType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "observationTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> observationTime;
    @XmlElementRef(name = "depth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDepthType> depth;
    @XmlElementRef(name = "frictionCoefficient", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrictionType> frictionCoefficient;
    @XmlElementRef(name = "frictionEstimation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionEstimateType> frictionEstimation;
    @XmlElementRef(name = "frictionDevice", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionDeviceType> frictionDevice;
    @XmlElementRef(name = "obscuredLights", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> obscuredLights;
    @XmlElementRef(name = "furtherClearanceTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> furtherClearanceTime;
    @XmlElementRef(name = "furtherTotalClearance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> furtherTotalClearance;
    @XmlElementRef(name = "nextObservationTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> nextObservationTime;
    @XmlElementRef(name = "proportion", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPercentType> proportion;
    @XmlElement(nillable = true)
    protected List<RidgePropertyType> criticalRidge;
    @XmlElement(nillable = true)
    protected List<SurfaceContaminationLayerPropertyType> layer;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "clearedLength", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> clearedLength;
    @XmlElementRef(name = "clearedWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> clearedWidth;
    @XmlElementRef(name = "clearedSide", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> clearedSide;
    @XmlElementRef(name = "furtherClearanceLength", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> furtherClearanceLength;
    @XmlElementRef(name = "furtherClearanceWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> furtherClearanceWidth;
    @XmlElementRef(name = "obscuredLightsSide", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> obscuredLightsSide;
    @XmlElementRef(name = "clearedLengthBegin", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> clearedLengthBegin;
    @XmlElementRef(name = "taxiwayAvailable", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> taxiwayAvailable;
    @XmlElementRef(name = "apronAvailable", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> apronAvailable;
    protected List<RunwayContaminationTypeExtensionType> extension;

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateTimeType> getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setObservationTime(JAXBElement<DateTimeType> value) {
        this.observationTime = value;
    }

    @Transient
    public boolean isSetObservationTime() {
        return (this.observationTime!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDepthType> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public void setDepth(JAXBElement<ValDepthType> value) {
        this.depth = value;
    }

    @Transient
    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Gets the value of the frictionCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFrictionType> getFrictionCoefficient() {
        return frictionCoefficient;
    }

    /**
     * Sets the value of the frictionCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    public void setFrictionCoefficient(JAXBElement<ValFrictionType> value) {
        this.frictionCoefficient = value;
    }

    @Transient
    public boolean isSetFrictionCoefficient() {
        return (this.frictionCoefficient!= null);
    }

    /**
     * Gets the value of the frictionEstimation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFrictionEstimateType> getFrictionEstimation() {
        return frictionEstimation;
    }

    /**
     * Sets the value of the frictionEstimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    public void setFrictionEstimation(JAXBElement<CodeFrictionEstimateType> value) {
        this.frictionEstimation = value;
    }

    @Transient
    public boolean isSetFrictionEstimation() {
        return (this.frictionEstimation!= null);
    }

    /**
     * Gets the value of the frictionDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFrictionDeviceType> getFrictionDevice() {
        return frictionDevice;
    }

    /**
     * Sets the value of the frictionDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    public void setFrictionDevice(JAXBElement<CodeFrictionDeviceType> value) {
        this.frictionDevice = value;
    }

    @Transient
    public boolean isSetFrictionDevice() {
        return (this.frictionDevice!= null);
    }

    /**
     * Gets the value of the obscuredLights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getObscuredLights() {
        return obscuredLights;
    }

    /**
     * Sets the value of the obscuredLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setObscuredLights(JAXBElement<CodeYesNoType> value) {
        this.obscuredLights = value;
    }

    @Transient
    public boolean isSetObscuredLights() {
        return (this.obscuredLights!= null);
    }

    /**
     * Gets the value of the furtherClearanceTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TimeType> getFurtherClearanceTime() {
        return furtherClearanceTime;
    }

    /**
     * Sets the value of the furtherClearanceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setFurtherClearanceTime(JAXBElement<TimeType> value) {
        this.furtherClearanceTime = value;
    }

    @Transient
    public boolean isSetFurtherClearanceTime() {
        return (this.furtherClearanceTime!= null);
    }

    /**
     * Gets the value of the furtherTotalClearance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFurtherTotalClearance() {
        return furtherTotalClearance;
    }

    /**
     * Sets the value of the furtherTotalClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFurtherTotalClearance(JAXBElement<CodeYesNoType> value) {
        this.furtherTotalClearance = value;
    }

    @Transient
    public boolean isSetFurtherTotalClearance() {
        return (this.furtherTotalClearance!= null);
    }

    /**
     * Gets the value of the nextObservationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateTimeType> getNextObservationTime() {
        return nextObservationTime;
    }

    /**
     * Sets the value of the nextObservationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setNextObservationTime(JAXBElement<DateTimeType> value) {
        this.nextObservationTime = value;
    }

    @Transient
    public boolean isSetNextObservationTime() {
        return (this.nextObservationTime!= null);
    }

    /**
     * Gets the value of the proportion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValPercentType> getProportion() {
        return proportion;
    }

    /**
     * Sets the value of the proportion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    public void setProportion(JAXBElement<ValPercentType> value) {
        this.proportion = value;
    }

    @Transient
    public boolean isSetProportion() {
        return (this.proportion!= null);
    }

    /**
     * Gets the value of the criticalRidge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criticalRidge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriticalRidge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RidgePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RidgePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "criticalridge_runwaycontamination_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "criticalridge", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycontaminationtype", referencedColumnName = "hjid")
    })
    public List<RidgePropertyType> getCriticalRidge() {
        if (criticalRidge == null) {
            criticalRidge = new ArrayList<>();
        }
        return this.criticalRidge;
    }

    /**
     * 
     * 
     */
    public void setCriticalRidge(List<RidgePropertyType> criticalRidge) {
        this.criticalRidge = criticalRidge;
    }

    @Transient
    public boolean isSetCriticalRidge() {
        return ((this.criticalRidge!= null)&&(!this.criticalRidge.isEmpty()));
    }

    public void unsetCriticalRidge() {
        this.criticalRidge = null;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceContaminationLayerPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = SurfaceContaminationLayerPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "layer_runwaycontamination_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "layer", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycontaminationtype", referencedColumnName = "hjid")
    })
    public List<SurfaceContaminationLayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<>();
        }
        return this.layer;
    }

    /**
     * 
     * 
     */
    public void setLayer(List<SurfaceContaminationLayerPropertyType> layer) {
        this.layer = layer;
    }

    @Transient
    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
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
    @JoinTable(name = "annotation_runwaycontamination_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycontaminationtype", referencedColumnName = "hjid")
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
     * Gets the value of the clearedLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getClearedLength() {
        return clearedLength;
    }

    /**
     * Sets the value of the clearedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setClearedLength(JAXBElement<ValDistanceType> value) {
        this.clearedLength = value;
    }

    @Transient
    public boolean isSetClearedLength() {
        return (this.clearedLength!= null);
    }

    /**
     * Gets the value of the clearedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getClearedWidth() {
        return clearedWidth;
    }

    /**
     * Sets the value of the clearedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setClearedWidth(JAXBElement<ValDistanceType> value) {
        this.clearedWidth = value;
    }

    @Transient
    public boolean isSetClearedWidth() {
        return (this.clearedWidth!= null);
    }

    /**
     * Gets the value of the clearedSide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getClearedSide() {
        return clearedSide;
    }

    /**
     * Sets the value of the clearedSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setClearedSide(JAXBElement<CodeSideType> value) {
        this.clearedSide = value;
    }

    @Transient
    public boolean isSetClearedSide() {
        return (this.clearedSide!= null);
    }

    /**
     * Gets the value of the furtherClearanceLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getFurtherClearanceLength() {
        return furtherClearanceLength;
    }

    /**
     * Sets the value of the furtherClearanceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setFurtherClearanceLength(JAXBElement<ValDistanceType> value) {
        this.furtherClearanceLength = value;
    }

    @Transient
    public boolean isSetFurtherClearanceLength() {
        return (this.furtherClearanceLength!= null);
    }

    /**
     * Gets the value of the furtherClearanceWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getFurtherClearanceWidth() {
        return furtherClearanceWidth;
    }

    /**
     * Sets the value of the furtherClearanceWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setFurtherClearanceWidth(JAXBElement<ValDistanceType> value) {
        this.furtherClearanceWidth = value;
    }

    @Transient
    public boolean isSetFurtherClearanceWidth() {
        return (this.furtherClearanceWidth!= null);
    }

    /**
     * Gets the value of the obscuredLightsSide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getObscuredLightsSide() {
        return obscuredLightsSide;
    }

    /**
     * Sets the value of the obscuredLightsSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setObscuredLightsSide(JAXBElement<CodeSideType> value) {
        this.obscuredLightsSide = value;
    }

    @Transient
    public boolean isSetObscuredLightsSide() {
        return (this.obscuredLightsSide!= null);
    }

    /**
     * Gets the value of the clearedLengthBegin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getClearedLengthBegin() {
        return clearedLengthBegin;
    }

    /**
     * Sets the value of the clearedLengthBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setClearedLengthBegin(JAXBElement<ValDistanceType> value) {
        this.clearedLengthBegin = value;
    }

    @Transient
    public boolean isSetClearedLengthBegin() {
        return (this.clearedLengthBegin!= null);
    }

    /**
     * Gets the value of the taxiwayAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getTaxiwayAvailable() {
        return taxiwayAvailable;
    }

    /**
     * Sets the value of the taxiwayAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setTaxiwayAvailable(JAXBElement<CodeYesNoType> value) {
        this.taxiwayAvailable = value;
    }

    @Transient
    public boolean isSetTaxiwayAvailable() {
        return (this.taxiwayAvailable!= null);
    }

    /**
     * Gets the value of the apronAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getApronAvailable() {
        return apronAvailable;
    }

    /**
     * Sets the value of the apronAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setApronAvailable(JAXBElement<CodeYesNoType> value) {
        this.apronAvailable = value;
    }

    @Transient
    public boolean isSetApronAvailable() {
        return (this.apronAvailable!= null);
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
     * {@link RunwayContaminationTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayContaminationTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RunwayContaminationTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RunwayContaminationTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "observationtime")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "observationtime_nilreason"))
    })
    public DateTimeType getObservationTimeItem() {
        return XmlAdapterUtils.unmarshallSource(DateTimeType.class, this.getObservationTime());
    }

    public void setObservationTimeItem(DateTimeType target) {
        setObservationTime(XmlAdapterUtils.marshallJAXBElement(DateTimeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "observationTime"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "depth")),
        @AttributeOverride(name = "uom", column = @Column(name = "depth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "depth_nilreason"))
    })
    public ValDepthType getDepthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDepthType.class, this.getDepth());
    }

    public void setDepthItem(ValDepthType target) {
        setDepth(XmlAdapterUtils.marshallJAXBElement(ValDepthType.class, new QName("http://www.aixm.aero/schema/5.1.1", "depth"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frictioncoefficient")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frictioncoefficient_nilreason"))
    })
    public ValFrictionType getFrictionCoefficientItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrictionType.class, this.getFrictionCoefficient());
    }

    public void setFrictionCoefficientItem(ValFrictionType target) {
        setFrictionCoefficient(XmlAdapterUtils.marshallJAXBElement(ValFrictionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frictionCoefficient"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frictionestimation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frictionestimation_nilreason"))
    })
    public CodeFrictionEstimateType getFrictionEstimationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFrictionEstimateType.class, this.getFrictionEstimation());
    }

    public void setFrictionEstimationItem(CodeFrictionEstimateType target) {
        setFrictionEstimation(XmlAdapterUtils.marshallJAXBElement(CodeFrictionEstimateType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frictionEstimation"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frictiondevice")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frictiondevice_nilreason"))
    })
    public CodeFrictionDeviceType getFrictionDeviceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFrictionDeviceType.class, this.getFrictionDevice());
    }

    public void setFrictionDeviceItem(CodeFrictionDeviceType target) {
        setFrictionDevice(XmlAdapterUtils.marshallJAXBElement(CodeFrictionDeviceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frictionDevice"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "obscuredlights")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obscuredlights_nilreason"))
    })
    public CodeYesNoType getObscuredLightsItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getObscuredLights());
    }

    public void setObscuredLightsItem(CodeYesNoType target) {
        setObscuredLights(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obscuredLights"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "furtherclearancetime")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "furtherclearancetime_nilreason"))
    })
    public TimeType getFurtherClearanceTimeItem() {
        return XmlAdapterUtils.unmarshallSource(TimeType.class, this.getFurtherClearanceTime());
    }

    public void setFurtherClearanceTimeItem(TimeType target) {
        setFurtherClearanceTime(XmlAdapterUtils.marshallJAXBElement(TimeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "furtherClearanceTime"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "furthertotalclearance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "furthertotalclearance_nilreason"))
    })
    public CodeYesNoType getFurtherTotalClearanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFurtherTotalClearance());
    }

    public void setFurtherTotalClearanceItem(CodeYesNoType target) {
        setFurtherTotalClearance(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "furtherTotalClearance"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "nextobservationtime")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "nextobservationtime_nilreason"))
    })
    public DateTimeType getNextObservationTimeItem() {
        return XmlAdapterUtils.unmarshallSource(DateTimeType.class, this.getNextObservationTime());
    }

    public void setNextObservationTimeItem(DateTimeType target) {
        setNextObservationTime(XmlAdapterUtils.marshallJAXBElement(DateTimeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "nextObservationTime"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "proportion")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "proportion_nilreason"))
    })
    public ValPercentType getProportionItem() {
        return XmlAdapterUtils.unmarshallSource(ValPercentType.class, this.getProportion());
    }

    public void setProportionItem(ValPercentType target) {
        setProportion(XmlAdapterUtils.marshallJAXBElement(ValPercentType.class, new QName("http://www.aixm.aero/schema/5.1.1", "proportion"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "clearedlength")),
        @AttributeOverride(name = "uom", column = @Column(name = "clearedlength_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "clearedlength_nilreason"))
    })
    public ValDistanceType getClearedLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getClearedLength());
    }

    public void setClearedLengthItem(ValDistanceType target) {
        setClearedLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "clearedLength"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "clearedwidth")),
        @AttributeOverride(name = "uom", column = @Column(name = "clearedwidth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "clearedwidth_nilreason"))
    })
    public ValDistanceType getClearedWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getClearedWidth());
    }

    public void setClearedWidthItem(ValDistanceType target) {
        setClearedWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "clearedWidth"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "clearedside")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "clearedside_nilreason"))
    })
    public CodeSideType getClearedSideItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getClearedSide());
    }

    public void setClearedSideItem(CodeSideType target) {
        setClearedSide(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "clearedSide"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "furtherclearancelength")),
        @AttributeOverride(name = "uom", column = @Column(name = "furtherclearancelength_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "furtherclearancelength_nilreason"))
    })
    public ValDistanceType getFurtherClearanceLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getFurtherClearanceLength());
    }

    public void setFurtherClearanceLengthItem(ValDistanceType target) {
        setFurtherClearanceLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "furtherClearanceLength"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "furtherclearancewidth")),
        @AttributeOverride(name = "uom", column = @Column(name = "furtherclearancewidth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "furtherclearancewidth_nilreason"))
    })
    public ValDistanceType getFurtherClearanceWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getFurtherClearanceWidth());
    }

    public void setFurtherClearanceWidthItem(ValDistanceType target) {
        setFurtherClearanceWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "furtherClearanceWidth"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "obscuredlightsside")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obscuredlightsside_nilreason"))
    })
    public CodeSideType getObscuredLightsSideItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getObscuredLightsSide());
    }

    public void setObscuredLightsSideItem(CodeSideType target) {
        setObscuredLightsSide(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obscuredLightsSide"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "clearedlengthbegin")),
        @AttributeOverride(name = "uom", column = @Column(name = "clearedlengthbegin_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "clearedlengthbegin_nilreason"))
    })
    public ValDistanceType getClearedLengthBeginItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getClearedLengthBegin());
    }

    public void setClearedLengthBeginItem(ValDistanceType target) {
        setClearedLengthBegin(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "clearedLengthBegin"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "taxiwayavailable")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "taxiwayavailable_nilreason"))
    })
    public CodeYesNoType getTaxiwayAvailableItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getTaxiwayAvailable());
    }

    public void setTaxiwayAvailableItem(CodeYesNoType target) {
        setTaxiwayAvailable(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "taxiwayAvailable"), RunwayContaminationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "apronavailable")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "apronavailable_nilreason"))
    })
    public CodeYesNoType getApronAvailableItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getApronAvailable());
    }

    public void setApronAvailableItem(CodeYesNoType target) {
        setApronAvailable(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "apronAvailable"), RunwayContaminationType.class, target));
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
        final RunwayContaminationType that = ((RunwayContaminationType) object);
        {
            boolean lhsFieldIsSet = this.isSetObscuredLights();
            boolean rhsFieldIsSet = that.isSetObscuredLights();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getObscuredLights();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getObscuredLights();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obscuredLights", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obscuredLights", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClearedLength();
            boolean rhsFieldIsSet = that.isSetClearedLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getClearedLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getClearedLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clearedLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clearedLength", rhsField);
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
            boolean lhsFieldIsSet = this.isSetApronAvailable();
            boolean rhsFieldIsSet = that.isSetApronAvailable();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getApronAvailable();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getApronAvailable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "apronAvailable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "apronAvailable", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDepth();
            boolean rhsFieldIsSet = that.isSetDepth();
            JAXBElement<ValDepthType> lhsField;
            lhsField = this.getDepth();
            JAXBElement<ValDepthType> rhsField;
            rhsField = that.getDepth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "depth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "depth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFurtherClearanceLength();
            boolean rhsFieldIsSet = that.isSetFurtherClearanceLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getFurtherClearanceLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getFurtherClearanceLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "furtherClearanceLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "furtherClearanceLength", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNextObservationTime();
            boolean rhsFieldIsSet = that.isSetNextObservationTime();
            JAXBElement<DateTimeType> lhsField;
            lhsField = this.getNextObservationTime();
            JAXBElement<DateTimeType> rhsField;
            rhsField = that.getNextObservationTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nextObservationTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nextObservationTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClearedWidth();
            boolean rhsFieldIsSet = that.isSetClearedWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getClearedWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getClearedWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clearedWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clearedWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClearedSide();
            boolean rhsFieldIsSet = that.isSetClearedSide();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getClearedSide();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getClearedSide();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clearedSide", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clearedSide", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTaxiwayAvailable();
            boolean rhsFieldIsSet = that.isSetTaxiwayAvailable();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getTaxiwayAvailable();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getTaxiwayAvailable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "taxiwayAvailable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "taxiwayAvailable", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObservationTime();
            boolean rhsFieldIsSet = that.isSetObservationTime();
            JAXBElement<DateTimeType> lhsField;
            lhsField = this.getObservationTime();
            JAXBElement<DateTimeType> rhsField;
            rhsField = that.getObservationTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "observationTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "observationTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrictionCoefficient();
            boolean rhsFieldIsSet = that.isSetFrictionCoefficient();
            JAXBElement<ValFrictionType> lhsField;
            lhsField = this.getFrictionCoefficient();
            JAXBElement<ValFrictionType> rhsField;
            rhsField = that.getFrictionCoefficient();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frictionCoefficient", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frictionCoefficient", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrictionEstimation();
            boolean rhsFieldIsSet = that.isSetFrictionEstimation();
            JAXBElement<CodeFrictionEstimateType> lhsField;
            lhsField = this.getFrictionEstimation();
            JAXBElement<CodeFrictionEstimateType> rhsField;
            rhsField = that.getFrictionEstimation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frictionEstimation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frictionEstimation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFurtherTotalClearance();
            boolean rhsFieldIsSet = that.isSetFurtherTotalClearance();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFurtherTotalClearance();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFurtherTotalClearance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "furtherTotalClearance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "furtherTotalClearance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetProportion();
            boolean rhsFieldIsSet = that.isSetProportion();
            JAXBElement<ValPercentType> lhsField;
            lhsField = this.getProportion();
            JAXBElement<ValPercentType> rhsField;
            rhsField = that.getProportion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "proportion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "proportion", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFurtherClearanceTime();
            boolean rhsFieldIsSet = that.isSetFurtherClearanceTime();
            JAXBElement<TimeType> lhsField;
            lhsField = this.getFurtherClearanceTime();
            JAXBElement<TimeType> rhsField;
            rhsField = that.getFurtherClearanceTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "furtherClearanceTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "furtherClearanceTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFurtherClearanceWidth();
            boolean rhsFieldIsSet = that.isSetFurtherClearanceWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getFurtherClearanceWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getFurtherClearanceWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "furtherClearanceWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "furtherClearanceWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClearedLengthBegin();
            boolean rhsFieldIsSet = that.isSetClearedLengthBegin();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getClearedLengthBegin();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getClearedLengthBegin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clearedLengthBegin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clearedLengthBegin", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLayer();
            boolean rhsFieldIsSet = that.isSetLayer();
            List<SurfaceContaminationLayerPropertyType> lhsField;
            lhsField = (this.isSetLayer()?this.getLayer():null);
            List<SurfaceContaminationLayerPropertyType> rhsField;
            rhsField = (that.isSetLayer()?that.getLayer():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "layer", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "layer", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayContaminationTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RunwayContaminationTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCriticalRidge();
            boolean rhsFieldIsSet = that.isSetCriticalRidge();
            List<RidgePropertyType> lhsField;
            lhsField = (this.isSetCriticalRidge()?this.getCriticalRidge():null);
            List<RidgePropertyType> rhsField;
            rhsField = (that.isSetCriticalRidge()?that.getCriticalRidge():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "criticalRidge", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "criticalRidge", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObscuredLightsSide();
            boolean rhsFieldIsSet = that.isSetObscuredLightsSide();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getObscuredLightsSide();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getObscuredLightsSide();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obscuredLightsSide", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obscuredLightsSide", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrictionDevice();
            boolean rhsFieldIsSet = that.isSetFrictionDevice();
            JAXBElement<CodeFrictionDeviceType> lhsField;
            lhsField = this.getFrictionDevice();
            JAXBElement<CodeFrictionDeviceType> rhsField;
            rhsField = that.getFrictionDevice();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frictionDevice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frictionDevice", rhsField);
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
            boolean theFieldIsSet = this.isSetObservationTime();
            JAXBElement<DateTimeType> theField;
            theField = this.getObservationTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "observationTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDepthType> theField;
            theField = this.getDepth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "depth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionCoefficient();
            JAXBElement<ValFrictionType> theField;
            theField = this.getFrictionCoefficient();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frictionCoefficient", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionEstimation();
            JAXBElement<CodeFrictionEstimateType> theField;
            theField = this.getFrictionEstimation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frictionEstimation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionDevice();
            JAXBElement<CodeFrictionDeviceType> theField;
            theField = this.getFrictionDevice();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frictionDevice", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObscuredLights();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getObscuredLights();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obscuredLights", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceTime();
            JAXBElement<TimeType> theField;
            theField = this.getFurtherClearanceTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "furtherClearanceTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherTotalClearance();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFurtherTotalClearance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "furtherTotalClearance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNextObservationTime();
            JAXBElement<DateTimeType> theField;
            theField = this.getNextObservationTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nextObservationTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProportion();
            JAXBElement<ValPercentType> theField;
            theField = this.getProportion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "proportion", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCriticalRidge();
            List<RidgePropertyType> theField;
            theField = (this.isSetCriticalRidge()?this.getCriticalRidge():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "criticalRidge", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLayer();
            List<SurfaceContaminationLayerPropertyType> theField;
            theField = (this.isSetLayer()?this.getLayer():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "layer", theField);
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
            boolean theFieldIsSet = this.isSetClearedLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clearedLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clearedWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getClearedSide();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clearedSide", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFurtherClearanceLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "furtherClearanceLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFurtherClearanceWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "furtherClearanceWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObscuredLightsSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getObscuredLightsSide();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obscuredLightsSide", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedLengthBegin();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedLengthBegin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clearedLengthBegin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTaxiwayAvailable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTaxiwayAvailable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "taxiwayAvailable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApronAvailable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApronAvailable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "apronAvailable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayContaminationTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetObservationTime();
            JAXBElement<DateTimeType> theField;
            theField = this.getObservationTime();
            strategy.appendField(locator, this, "observationTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDepthType> theField;
            theField = this.getDepth();
            strategy.appendField(locator, this, "depth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionCoefficient();
            JAXBElement<ValFrictionType> theField;
            theField = this.getFrictionCoefficient();
            strategy.appendField(locator, this, "frictionCoefficient", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionEstimation();
            JAXBElement<CodeFrictionEstimateType> theField;
            theField = this.getFrictionEstimation();
            strategy.appendField(locator, this, "frictionEstimation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrictionDevice();
            JAXBElement<CodeFrictionDeviceType> theField;
            theField = this.getFrictionDevice();
            strategy.appendField(locator, this, "frictionDevice", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObscuredLights();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getObscuredLights();
            strategy.appendField(locator, this, "obscuredLights", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceTime();
            JAXBElement<TimeType> theField;
            theField = this.getFurtherClearanceTime();
            strategy.appendField(locator, this, "furtherClearanceTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherTotalClearance();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFurtherTotalClearance();
            strategy.appendField(locator, this, "furtherTotalClearance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNextObservationTime();
            JAXBElement<DateTimeType> theField;
            theField = this.getNextObservationTime();
            strategy.appendField(locator, this, "nextObservationTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProportion();
            JAXBElement<ValPercentType> theField;
            theField = this.getProportion();
            strategy.appendField(locator, this, "proportion", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCriticalRidge();
            List<RidgePropertyType> theField;
            theField = (this.isSetCriticalRidge()?this.getCriticalRidge():null);
            strategy.appendField(locator, this, "criticalRidge", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLayer();
            List<SurfaceContaminationLayerPropertyType> theField;
            theField = (this.isSetLayer()?this.getLayer():null);
            strategy.appendField(locator, this, "layer", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedLength();
            strategy.appendField(locator, this, "clearedLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedWidth();
            strategy.appendField(locator, this, "clearedWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getClearedSide();
            strategy.appendField(locator, this, "clearedSide", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFurtherClearanceLength();
            strategy.appendField(locator, this, "furtherClearanceLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFurtherClearanceWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFurtherClearanceWidth();
            strategy.appendField(locator, this, "furtherClearanceWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObscuredLightsSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getObscuredLightsSide();
            strategy.appendField(locator, this, "obscuredLightsSide", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClearedLengthBegin();
            JAXBElement<ValDistanceType> theField;
            theField = this.getClearedLengthBegin();
            strategy.appendField(locator, this, "clearedLengthBegin", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTaxiwayAvailable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTaxiwayAvailable();
            strategy.appendField(locator, this, "taxiwayAvailable", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApronAvailable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApronAvailable();
            strategy.appendField(locator, this, "apronAvailable", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayContaminationTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
