
package com.aixm.delorean.aixm511.schema;

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
 * Java class for RunwayTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="RunwayTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.1.1}TextDesignatorType" minOccurs="0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.1.1}CodeRunwayType" minOccurs="0"/>
 *         <element name="nominalLength" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="lengthAccuracy" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="nominalWidth" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="widthAccuracy" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="widthShoulder" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="lengthStrip" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="widthStrip" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceType" minOccurs="0"/>
 *         <element name="lengthOffset" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="widthOffset" type=
"{http://www.aixm.aero/schema/5.1.1}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="abandoned" type=
"{http://www.aixm.aero/schema/5.1.1}CodeYesNoType" minOccurs="0"/>
 *         <element name="surfaceProperties" type=
"{http://www.aixm.aero/schema/5.1.1}SurfaceCharacteristicsPropertyType" minOccurs
="0"/>
 *         <element name="associatedAirportHeliport" type=
"{http://www.aixm.aero/schema/5.1.1}AirportHeliportPropertyType" minOccurs="0"/>
 *         <element name="overallContaminant" type=
"{http://www.aixm.aero/schema/5.1.1}RunwayContaminationPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="areaContaminant" type=
"{http://www.aixm.aero/schema/5.1.1}RunwaySectionContaminationPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.1.1}AbstractRunwayExtension"/>
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
@XmlType(name = "RunwayTimeSliceType", propOrder = {"designator", "type", "nominalLength", "lengthAccuracy",
        "nominalWidth", "widthAccuracy", "widthShoulder", "lengthStrip", "widthStrip", "lengthOffset", "widthOffset",
        "abandoned", "surfaceProperties", "associatedAirportHeliport", "overallContaminant", "annotation",
        "areaContaminant", "extension"})
@Entity(name = "RunwayTimeSliceType")
@Table(name = "runway_t", schema = "airport_heliport")
public class RunwayTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayType> type;
    @XmlElementRef(name = "nominalLength", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalLength;
    @XmlElementRef(name = "lengthAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthAccuracy;
    @XmlElementRef(name = "nominalWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalWidth;
    @XmlElementRef(name = "widthAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthAccuracy;
    @XmlElementRef(name = "widthShoulder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthShoulder;
    @XmlElementRef(name = "lengthStrip", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthStrip;
    @XmlElementRef(name = "widthStrip", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthStrip;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> lengthOffset;
    @XmlElementRef(name = "widthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> widthOffset;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElement(nillable = true)
    protected List<RunwayContaminationPropertyType> overallContaminant;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<RunwaySectionContaminationPropertyType> areaContaminant;
    protected List<RunwayTimeSliceExtensionType> extension;

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextDesignatorType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeRunwayType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeRunwayType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeRunwayType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the nominalLength property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setNominalLength(JAXBElement<ValDistanceType> value) {
        this.nominalLength = value;
    }

    @Transient
    public boolean isSetNominalLength() {
        return (this.nominalLength != null);
    }

    /**
     * Gets the value of the lengthAccuracy property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getLengthAccuracy() {
        return lengthAccuracy;
    }

    /**
     * Sets the value of the lengthAccuracy property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setLengthAccuracy(JAXBElement<ValDistanceType> value) {
        this.lengthAccuracy = value;
    }

    @Transient
    public boolean isSetLengthAccuracy() {
        return (this.lengthAccuracy != null);
    }

    /**
     * Gets the value of the nominalWidth property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setNominalWidth(JAXBElement<ValDistanceType> value) {
        this.nominalWidth = value;
    }

    @Transient
    public boolean isSetNominalWidth() {
        return (this.nominalWidth != null);
    }

    /**
     * Gets the value of the widthAccuracy property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidthAccuracy() {
        return widthAccuracy;
    }

    /**
     * Sets the value of the widthAccuracy property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setWidthAccuracy(JAXBElement<ValDistanceType> value) {
        this.widthAccuracy = value;
    }

    @Transient
    public boolean isSetWidthAccuracy() {
        return (this.widthAccuracy != null);
    }

    /**
     * Gets the value of the widthShoulder property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setWidthShoulder(JAXBElement<ValDistanceType> value) {
        this.widthShoulder = value;
    }

    @Transient
    public boolean isSetWidthShoulder() {
        return (this.widthShoulder != null);
    }

    /**
     * Gets the value of the lengthStrip property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setLengthStrip(JAXBElement<ValDistanceType> value) {
        this.lengthStrip = value;
    }

    @Transient
    public boolean isSetLengthStrip() {
        return (this.lengthStrip != null);
    }

    /**
     * Gets the value of the widthStrip property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setWidthStrip(JAXBElement<ValDistanceType> value) {
        this.widthStrip = value;
    }

    @Transient
    public boolean isSetWidthStrip() {
        return (this.widthStrip != null);
    }

    /**
     * Gets the value of the lengthOffset property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceSignedType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    public void setLengthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.lengthOffset = value;
    }

    @Transient
    public boolean isSetLengthOffset() {
        return (this.lengthOffset != null);
    }

    /**
     * Gets the value of the widthOffset property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceSignedType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    public void setWidthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.widthOffset = value;
    }

    @Transient
    public boolean isSetWidthOffset() {
        return (this.widthOffset != null);
    }

    /**
     * Gets the value of the abandoned property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    @Transient
    public boolean isSetAbandoned() {
        return (this.abandoned != null);
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
     * Gets the value of the associatedAirportHeliport property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirportHeliportPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    public void setAssociatedAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirportHeliport = value;
    }

    @Transient
    public boolean isSetAssociatedAirportHeliport() {
        return (this.associatedAirportHeliport != null);
    }

    /**
     * Gets the value of the overallContaminant property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the overallContaminant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getOverallContaminant().add(newItem);
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
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_ovrllcntmnnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "overallcontaminant_hjid", referencedColumnName = "hjid")})
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
        return ((this.overallContaminant != null) && (!this.overallContaminant.isEmpty()));
    }

    public void unsetOverallContaminant() {
        this.overallContaminant = null;
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
    @JoinTable(name = "rnwtmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the areaContaminant property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the areaContaminant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAreaContaminant().add(newItem);
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
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_arcntmnnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "areacontaminant_hjid", referencedColumnName = "hjid")})
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
        return ((this.areaContaminant != null) && (!this.areaContaminant.isEmpty()));
    }

    public void unsetAreaContaminant() {
        this.areaContaminant = null;
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
     * {@link RunwayTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayTimeSliceExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
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
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "designator"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeRunwayType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayType.class, this.getType());
    }

    public void setTypeItem(CodeRunwayType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRunwayType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "type"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "nominallength", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "nominallengthuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "nominallengthnilreason"))})
    public ValDistanceType getNominalLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getNominalLength());
    }

    public void setNominalLengthItem(ValDistanceType target) {
        setNominalLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "nominalLength"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lengthaccuracy", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lengthaccuracyuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lengthaccuracynilreason"))})
    public ValDistanceType getLengthAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLengthAccuracy());
    }

    public void setLengthAccuracyItem(ValDistanceType target) {
        setLengthAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "lengthAccuracy"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "nominalwidth", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "nominalwidthuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "nominalwidthnilreason"))})
    public ValDistanceType getNominalWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getNominalWidth());
    }

    public void setNominalWidthItem(ValDistanceType target) {
        setNominalWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "nominalWidth"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "widthaccuracy", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "widthaccuracyuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "widthaccuracynilreason"))})
    public ValDistanceType getWidthAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthAccuracy());
    }

    public void setWidthAccuracyItem(ValDistanceType target) {
        setWidthAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "widthAccuracy"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "widthshoulder", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "widthshoulderuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "widthshouldernilreason"))})
    public ValDistanceType getWidthShoulderItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthShoulder());
    }

    public void setWidthShoulderItem(ValDistanceType target) {
        setWidthShoulder(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "widthShoulder"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lengthstrip", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lengthstripuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lengthstripnilreason"))})
    public ValDistanceType getLengthStripItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLengthStrip());
    }

    public void setLengthStripItem(ValDistanceType target) {
        setLengthStrip(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "lengthStrip"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "widthstrip", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "widthstripuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "widthstripnilreason"))})
    public ValDistanceType getWidthStripItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthStrip());
    }

    public void setWidthStripItem(ValDistanceType target) {
        setWidthStrip(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "widthStrip"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lengthoffset", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lengthoffsetuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lengthoffsetnilreason"))})
    public ValDistanceSignedType getLengthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getLengthOffset());
    }

    public void setLengthOffsetItem(ValDistanceSignedType target) {
        setLengthOffset(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "lengthOffset"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "widthoffset", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "widthoffsetuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "widthoffsetnilreason"))})
    public ValDistanceSignedType getWidthOffsetItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getWidthOffset());
    }

    public void setWidthOffsetItem(ValDistanceSignedType target) {
        setWidthOffset(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "widthOffset"), RunwayTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "abandoned")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "abandonednilreason"))})
    public CodeYesNoType getAbandonedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getAbandoned());
    }

    public void setAbandonedItem(CodeYesNoType target) {
        setAbandoned(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "abandoned"), RunwayTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SurfaceCharacteristicsPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_srfcprprts_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "surfaceproperties_hjid", referencedColumnName = "hjid")})
    public SurfaceCharacteristicsPropertyType getSurfacePropertiesItem() {
        return XmlAdapterUtils.unmarshallSource(SurfaceCharacteristicsPropertyType.class, this.getSurfaceProperties());
    }

    public void setSurfacePropertiesItem(SurfaceCharacteristicsPropertyType target) {
        setSurfaceProperties(XmlAdapterUtils.marshallJAXBElement(SurfaceCharacteristicsPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "surfaceProperties"), RunwayTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwtmslctp_assctdarprthlprt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runway_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "associatedairportheliport_hjid", referencedColumnName = "hjid")})
    public AirportHeliportPropertyType getAssociatedAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAssociatedAirportHeliport());
    }

    public void setAssociatedAirportHeliportItem(AirportHeliportPropertyType target) {
        setAssociatedAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.1.1", "associatedAirportHeliport"), RunwayTimeSliceType.class,
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
        final RunwayTimeSliceType that = ((RunwayTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetAreaContaminant();
            boolean rhsFieldIsSet = that.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> lhsField;
            lhsField = (this.isSetAreaContaminant() ? this.getAreaContaminant() : null);
            List<RunwaySectionContaminationPropertyType> rhsField;
            rhsField = (that.isSetAreaContaminant() ? that.getAreaContaminant() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "areaContaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "areaContaminant", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<RunwayTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
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
            boolean lhsFieldIsSet = this.isSetLengthAccuracy();
            boolean rhsFieldIsSet = that.isSetLengthAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLengthAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLengthAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lengthAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lengthAccuracy", rhsField);
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
            boolean lhsFieldIsSet = this.isSetWidthAccuracy();
            boolean rhsFieldIsSet = that.isSetWidthAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidthAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidthAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthAccuracy", rhsField);
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
            boolean lhsFieldIsSet = this.isSetOverallContaminant();
            boolean rhsFieldIsSet = that.isSetOverallContaminant();
            List<RunwayContaminationPropertyType> lhsField;
            lhsField = (this.isSetOverallContaminant() ? this.getOverallContaminant() : null);
            List<RunwayContaminationPropertyType> rhsField;
            rhsField = (that.isSetOverallContaminant() ? that.getOverallContaminant() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "overallContaminant", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "overallContaminant", rhsField);
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
            boolean theFieldIsSet = this.isSetLengthAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lengthAccuracy", theField);
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
            boolean theFieldIsSet = this.isSetWidthAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthAccuracy", theField);
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
            theField = (this.isSetOverallContaminant() ? this.getOverallContaminant() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "overallContaminant", theField);
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
            boolean theFieldIsSet = this.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> theField;
            theField = (this.isSetAreaContaminant() ? this.getAreaContaminant() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "areaContaminant", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetLengthAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLengthAccuracy();
            strategy.appendField(locator, this, "lengthAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNominalWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getNominalWidth();
            strategy.appendField(locator, this, "nominalWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthAccuracy();
            strategy.appendField(locator, this, "widthAccuracy", buffer, theField, theFieldIsSet);
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
            theField = (this.isSetOverallContaminant() ? this.getOverallContaminant() : null);
            strategy.appendField(locator, this, "overallContaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAreaContaminant();
            List<RunwaySectionContaminationPropertyType> theField;
            theField = (this.isSetAreaContaminant() ? this.getAreaContaminant() : null);
            strategy.appendField(locator, this, "areaContaminant", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
