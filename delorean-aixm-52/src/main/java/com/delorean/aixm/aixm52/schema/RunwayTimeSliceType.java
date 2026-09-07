
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for RunwayTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type="{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="type" type="{http://www.aixm.aero/schema/5.2}CodeRunwayType" minOccurs="0"/>
 *         <element name="nominalLength" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="nominalWidth" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="widthShoulder" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="lengthStrip" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="widthStrip" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="lengthOffset" type="{http://www.aixm.aero/schema/5.2}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="widthOffset" type="{http://www.aixm.aero/schema/5.2}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="abandoned" type="{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="surfaceProperties" type="{http://www.aixm.aero/schema/5.2}SurfaceCharacteristicsPropertyType" minOccurs="0"/>
 *         <element name="associatedAirportHeliport" type="{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         <element name="overallContaminant" type="{http://www.aixm.aero/schema/5.2}RunwayContaminationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="areaContaminant" type="{http://www.aixm.aero/schema/5.2}RunwaySectionContaminationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="referenceCodeFieldLength" type="{http://www.aixm.aero/schema/5.2}CodeAircraftFieldLengthType" minOccurs="0"/>
 *         <element name="referenceCodeWingspan" type="{http://www.aixm.aero/schema/5.2}CodeAircraftWingspanClassType" minOccurs="0"/>
 *         <element name="depth" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractRunwayExtension"/>
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
@XmlType(name = "RunwayTimeSliceType", propOrder = {
    "designator",
    "type",
    "nominalLength",
    "nominalWidth",
    "widthShoulder",
    "lengthStrip",
    "widthStrip",
    "lengthOffset",
    "widthOffset",
    "abandoned",
    "surfaceProperties",
    "associatedAirportHeliport",
    "overallContaminant",
    "annotation",
    "areaContaminant",
    "referenceCodeFieldLength",
    "referenceCodeWingspan",
    "depth",
    "extension"
})
@Entity(name = "RunwayTimeSliceType")
@Table(name = "runway_t", schema = "airport_heliport")
public class RunwayTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayType> type;
    @XmlElementRef(name = "nominalLength", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalLength;
    @XmlElementRef(name = "nominalWidth", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalWidth;
    @XmlElementRef(name = "widthShoulder", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthShoulder;
    @XmlElementRef(name = "lengthStrip", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthStrip;
    @XmlElementRef(name = "widthStrip", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthStrip;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> lengthOffset;
    @XmlElementRef(name = "widthOffset", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> widthOffset;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElement(nillable = true)
    protected List<RunwayContaminationPropertyType> overallContaminant;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<RunwaySectionContaminationPropertyType> areaContaminant;
    @XmlElementRef(name = "referenceCodeFieldLength", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftFieldLengthType> referenceCodeFieldLength;
    @XmlElementRef(name = "referenceCodeWingspan", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftWingspanClassType> referenceCodeWingspan;
    @XmlElementRef(name = "depth", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> depth;
    protected List<RunwayTimeSliceExtensionType> extension;

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
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRunwayType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRunwayType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the nominalLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getNominalLength() {
        return nominalLength;
    }

    /**
     * Sets the value of the nominalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalLength(JAXBElement<ValDistanceType> value) {
        this.nominalLength = value;
    }

    @Transient
    public boolean isSetNominalLength() {
        return (this.nominalLength!= null);
    }

    /**
     * Gets the value of the nominalWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getNominalWidth() {
        return nominalWidth;
    }

    /**
     * Sets the value of the nominalWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalWidth(JAXBElement<ValDistanceType> value) {
        this.nominalWidth = value;
    }

    @Transient
    public boolean isSetNominalWidth() {
        return (this.nominalWidth!= null);
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
     * Gets the value of the lengthStrip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLengthStrip() {
        return lengthStrip;
    }

    /**
     * Sets the value of the lengthStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthStrip(JAXBElement<ValDistanceType> value) {
        this.lengthStrip = value;
    }

    @Transient
    public boolean isSetLengthStrip() {
        return (this.lengthStrip!= null);
    }

    /**
     * Gets the value of the widthStrip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidthStrip() {
        return widthStrip;
    }

    /**
     * Sets the value of the widthStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthStrip(JAXBElement<ValDistanceType> value) {
        this.widthStrip = value;
    }

    @Transient
    public boolean isSetWidthStrip() {
        return (this.widthStrip!= null);
    }

    /**
     * Gets the value of the lengthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceSignedType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Sets the value of the lengthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.lengthOffset = value;
    }

    @Transient
    public boolean isSetLengthOffset() {
        return (this.lengthOffset!= null);
    }

    /**
     * Gets the value of the widthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceSignedType> getWidthOffset() {
        return widthOffset;
    }

    /**
     * Sets the value of the widthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setWidthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.widthOffset = value;
    }

    @Transient
    public boolean isSetWidthOffset() {
        return (this.widthOffset!= null);
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
     * Gets the value of the overallContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overallContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverallContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayContaminationPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayContaminationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_ovrllcntmnnt_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "overallcontaminant_hjid", referencedColumnName = "hjid")
    })
    public List<RunwayContaminationPropertyType> getOverallContaminant() {
        if (overallContaminant == null) {
            overallContaminant = new ArrayList<>();
        }
        return this.overallContaminant;
    }

    /**
     * 
     * 
     */
    public void setOverallContaminant(List<RunwayContaminationPropertyType> overallContaminant) {
        this.overallContaminant = overallContaminant;
    }

    @Transient
    public boolean isSetOverallContaminant() {
        return ((this.overallContaminant!= null)&&(!this.overallContaminant.isEmpty()));
    }

    public void unsetOverallContaminant() {
        this.overallContaminant = null;
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
    @JoinTable(name = "rnwtmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
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
     * Gets the value of the areaContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwaySectionContaminationPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwaySectionContaminationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_arcntmnnt_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "areacontaminant_hjid", referencedColumnName = "hjid")
    })
    public List<RunwaySectionContaminationPropertyType> getAreaContaminant() {
        if (areaContaminant == null) {
            areaContaminant = new ArrayList<>();
        }
        return this.areaContaminant;
    }

    /**
     * 
     * 
     */
    public void setAreaContaminant(List<RunwaySectionContaminationPropertyType> areaContaminant) {
        this.areaContaminant = areaContaminant;
    }

    @Transient
    public boolean isSetAreaContaminant() {
        return ((this.areaContaminant!= null)&&(!this.areaContaminant.isEmpty()));
    }

    public void unsetAreaContaminant() {
        this.areaContaminant = null;
    }

    /**
     * Gets the value of the referenceCodeFieldLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftFieldLengthType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftFieldLengthType> getReferenceCodeFieldLength() {
        return referenceCodeFieldLength;
    }

    /**
     * Sets the value of the referenceCodeFieldLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftFieldLengthType }{@code >}
     *     
     */
    public void setReferenceCodeFieldLength(JAXBElement<CodeAircraftFieldLengthType> value) {
        this.referenceCodeFieldLength = value;
    }

    @Transient
    public boolean isSetReferenceCodeFieldLength() {
        return (this.referenceCodeFieldLength!= null);
    }

    /**
     * Gets the value of the referenceCodeWingspan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftWingspanClassType> getReferenceCodeWingspan() {
        return referenceCodeWingspan;
    }

    /**
     * Sets the value of the referenceCodeWingspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public void setReferenceCodeWingspan(JAXBElement<CodeAircraftWingspanClassType> value) {
        this.referenceCodeWingspan = value;
    }

    @Transient
    public boolean isSetReferenceCodeWingspan() {
        return (this.referenceCodeWingspan!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setDepth(JAXBElement<ValDistanceType> value) {
        this.depth = value;
    }

    @Transient
    public boolean isSetDepth() {
        return (this.depth!= null);
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
     * {@link RunwayTimeSliceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayTimeSliceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runway_te_hjid", referencedColumnName = "hjid")
    public List<RunwayTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RunwayTimeSliceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason", columnDefinition = "nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.2", "designator"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type", columnDefinition = "coderunwaybase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason", columnDefinition = "nilreason"))
    })
    public CodeRunwayType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayType.class, this.getType());
    }

    public void setTypeItem(CodeRunwayType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRunwayType.class, new QName("http://www.aixm.aero/schema/5.2", "type"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "nominallength", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "nominallengthuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "nominallengthaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "nominallengthnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getNominalLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getNominalLength());
    }

    public void setNominalLengthItem(ValDistanceType target) {
        setNominalLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "nominalLength"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "nominalwidth", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "nominalwidthuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "nominalwidthaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "nominalwidthnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getNominalWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getNominalWidth());
    }

    public void setNominalWidthItem(ValDistanceType target) {
        setNominalWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "nominalWidth"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthshoulder", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthshoulderuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "widthshoulderaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthshouldernilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getWidthShoulderItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthShoulder());
    }

    public void setWidthShoulderItem(ValDistanceType target) {
        setWidthShoulder(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "widthShoulder"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lengthstrip", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "lengthstripuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "lengthstripaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lengthstripnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getLengthStripItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLengthStrip());
    }

    public void setLengthStripItem(ValDistanceType target) {
        setLengthStrip(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "lengthStrip"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthstrip", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthstripuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "widthstripaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthstripnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getWidthStripItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthStrip());
    }

    public void setWidthStripItem(ValDistanceType target) {
        setWidthStrip(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "widthStrip"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lengthoffset", columnDefinition = "valdistancesignedbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "lengthoffsetuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "lengthoffsetaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lengthoffsetnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceSignedType getLengthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getLengthOffset());
    }

    public void setLengthOffsetItem(ValDistanceSignedType target) {
        setLengthOffset(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.2", "lengthOffset"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthoffset", columnDefinition = "valdistancesignedbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthoffsetuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "widthoffsetaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthoffsetnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceSignedType getWidthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getWidthOffset());
    }

    public void setWidthOffsetItem(ValDistanceSignedType target) {
        setWidthOffset(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.2", "widthOffset"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "abandoned", columnDefinition = "codeyesnobase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "abandonednilreason", columnDefinition = "nilreason"))
    })
    public CodeYesNoType getAbandonedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAbandoned());
    }

    public void setAbandonedItem(CodeYesNoType target) {
        setAbandoned(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.2", "abandoned"), RunwayTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SurfaceCharacteristicsPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_srfcprprts_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "surfaceproperties_hjid", referencedColumnName = "hjid")
    })
    public SurfaceCharacteristicsPropertyType getSurfacePropertiesItem() {
        return XmlAdapterUtils.unmarshallSource(SurfaceCharacteristicsPropertyType.class, this.getSurfaceProperties());
    }

    public void setSurfacePropertiesItem(SurfaceCharacteristicsPropertyType target) {
        setSurfaceProperties(XmlAdapterUtils.marshallJAXBElement(SurfaceCharacteristicsPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "surfaceProperties"), RunwayTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_assctdarprthlprt_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "associatedairportheliport_hjid", referencedColumnName = "hjid")
    })
    public AirportHeliportPropertyType getAssociatedAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAssociatedAirportHeliport());
    }

    public void setAssociatedAirportHeliportItem(AirportHeliportPropertyType target) {
        setAssociatedAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "associatedAirportHeliport"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencecodefieldlength", columnDefinition = "codeaircraftfieldlengthbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencecodefieldlengthnilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftFieldLengthType getReferenceCodeFieldLengthItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftFieldLengthType.class, this.getReferenceCodeFieldLength());
    }

    public void setReferenceCodeFieldLengthItem(CodeAircraftFieldLengthType target) {
        setReferenceCodeFieldLength(XmlAdapterUtils.marshallJAXBElement(CodeAircraftFieldLengthType.class, new QName("http://www.aixm.aero/schema/5.2", "referenceCodeFieldLength"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "referencecodewingspan", columnDefinition = "codeaircraftwingspanclassbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "referencecodewingspannilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftWingspanClassType getReferenceCodeWingspanItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftWingspanClassType.class, this.getReferenceCodeWingspan());
    }

    public void setReferenceCodeWingspanItem(CodeAircraftWingspanClassType target) {
        setReferenceCodeWingspan(XmlAdapterUtils.marshallJAXBElement(CodeAircraftWingspanClassType.class, new QName("http://www.aixm.aero/schema/5.2", "referenceCodeWingspan"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "depth", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "depthuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "depthaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "depthnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getDepthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDepth());
    }

    public void setDepthItem(ValDistanceType target) {
        setDepth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "depth"), RunwayTimeSliceType.class, target));
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
        final RunwayTimeSliceType that = ((RunwayTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetReferenceCodeFieldLength();
            boolean rhsFieldIsSet = that.isSetReferenceCodeFieldLength();
            JAXBElement<CodeAircraftFieldLengthType> lhsField;
            lhsField = this.getReferenceCodeFieldLength();
            JAXBElement<CodeAircraftFieldLengthType> rhsField;
            rhsField = that.getReferenceCodeFieldLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceCodeFieldLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceCodeFieldLength", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAreaContaminant();
            boolean rhsFieldIsSet = that.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> lhsField;
            lhsField = (this.isSetAreaContaminant()?this.getAreaContaminant():null);
            List<RunwaySectionContaminationPropertyType> rhsField;
            rhsField = (that.isSetAreaContaminant()?that.getAreaContaminant():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "areaContaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "areaContaminant", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceCodeWingspan();
            boolean rhsFieldIsSet = that.isSetReferenceCodeWingspan();
            JAXBElement<CodeAircraftWingspanClassType> lhsField;
            lhsField = this.getReferenceCodeWingspan();
            JAXBElement<CodeAircraftWingspanClassType> rhsField;
            rhsField = that.getReferenceCodeWingspan();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceCodeWingspan", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceCodeWingspan", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeRunwayType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeRunwayType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNominalLength();
            boolean rhsFieldIsSet = that.isSetNominalLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getNominalLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getNominalLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nominalLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nominalLength", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDepth();
            boolean rhsFieldIsSet = that.isSetDepth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDepth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDepth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "depth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "depth", rhsField);
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
            boolean lhsFieldIsSet = this.isSetWidthOffset();
            boolean rhsFieldIsSet = that.isSetWidthOffset();
            JAXBElement<ValDistanceSignedType> lhsField;
            lhsField = this.getWidthOffset();
            JAXBElement<ValDistanceSignedType> rhsField;
            rhsField = that.getWidthOffset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthOffset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthOffset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RunwayTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNominalWidth();
            boolean rhsFieldIsSet = that.isSetNominalWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getNominalWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getNominalWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nominalWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nominalWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLengthStrip();
            boolean rhsFieldIsSet = that.isSetLengthStrip();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLengthStrip();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLengthStrip();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lengthStrip", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lengthStrip", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOverallContaminant();
            boolean rhsFieldIsSet = that.isSetOverallContaminant();
            List<RunwayContaminationPropertyType> lhsField;
            lhsField = (this.isSetOverallContaminant()?this.getOverallContaminant():null);
            List<RunwayContaminationPropertyType> rhsField;
            rhsField = (that.isSetOverallContaminant()?that.getOverallContaminant():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "overallContaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "overallContaminant", rhsField);
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
            boolean lhsFieldIsSet = this.isSetWidthStrip();
            boolean rhsFieldIsSet = that.isSetWidthStrip();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidthStrip();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidthStrip();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthStrip", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthStrip", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLengthOffset();
            boolean rhsFieldIsSet = that.isSetLengthOffset();
            JAXBElement<ValDistanceSignedType> lhsField;
            lhsField = this.getLengthOffset();
            JAXBElement<ValDistanceSignedType> rhsField;
            rhsField = that.getLengthOffset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lengthOffset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lengthOffset", rhsField);
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
            JAXBElement<CodeRunwayType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNominalLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getNominalLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nominalLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNominalWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getNominalWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nominalWidth", theField);
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
            boolean theFieldIsSet = this.isSetLengthStrip();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthStrip();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lengthStrip", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthStrip();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthStrip();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthStrip", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getLengthOffset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lengthOffset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthOffset();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getWidthOffset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthOffset", theField);
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
            boolean theFieldIsSet = this.isSetOverallContaminant();
            List<RunwayContaminationPropertyType> theField;
            theField = (this.isSetOverallContaminant()?this.getOverallContaminant():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "overallContaminant", theField);
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
            boolean theFieldIsSet = this.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> theField;
            theField = (this.isSetAreaContaminant()?this.getAreaContaminant():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "areaContaminant", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceCodeFieldLength();
            JAXBElement<CodeAircraftFieldLengthType> theField;
            theField = this.getReferenceCodeFieldLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceCodeFieldLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceCodeWingspan();
            JAXBElement<CodeAircraftWingspanClassType> theField;
            theField = this.getReferenceCodeWingspan();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceCodeWingspan", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDepth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "depth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayTimeSliceExtensionType> theField;
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
            JAXBElement<CodeRunwayType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNominalLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getNominalLength();
            strategy.appendField(locator, this, "nominalLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNominalWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getNominalWidth();
            strategy.appendField(locator, this, "nominalWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthShoulder();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthShoulder();
            strategy.appendField(locator, this, "widthShoulder", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthStrip();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthStrip();
            strategy.appendField(locator, this, "lengthStrip", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthStrip();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthStrip();
            strategy.appendField(locator, this, "widthStrip", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLengthOffset();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getLengthOffset();
            strategy.appendField(locator, this, "lengthOffset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthOffset();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getWidthOffset();
            strategy.appendField(locator, this, "widthOffset", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetOverallContaminant();
            List<RunwayContaminationPropertyType> theField;
            theField = (this.isSetOverallContaminant()?this.getOverallContaminant():null);
            strategy.appendField(locator, this, "overallContaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> theField;
            theField = (this.isSetAreaContaminant()?this.getAreaContaminant():null);
            strategy.appendField(locator, this, "areaContaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceCodeFieldLength();
            JAXBElement<CodeAircraftFieldLengthType> theField;
            theField = this.getReferenceCodeFieldLength();
            strategy.appendField(locator, this, "referenceCodeFieldLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceCodeWingspan();
            JAXBElement<CodeAircraftWingspanClassType> theField;
            theField = this.getReferenceCodeWingspan();
            strategy.appendField(locator, this, "referenceCodeWingspan", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDepth();
            strategy.appendField(locator, this, "depth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayTimeSliceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
