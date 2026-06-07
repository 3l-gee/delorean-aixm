
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
 * Java class for AirspaceVolumeType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AirspaceVolumeType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="upperLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="upperLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="maximumLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="maximumLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="lowerLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="lowerLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="minimumLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="minimumLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="width" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="horizontalProjection" type=
"{http://www.aixm.aero/schema/5.2}SurfacePropertyType" minOccurs="0"/>
 *         <element name="centreline" type=
"{http://www.aixm.aero/schema/5.2}CurvePropertyType" minOccurs="0"/>
 *         <element name="contributorAirspace" type=
"{http://www.aixm.aero/schema/5.2}AirspaceVolumeDependencyPropertyType" minOccurs
="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}PointPropertyType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractAirspaceVolumeExtension"/>
 *                 </choice>
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
@XmlType(name = "AirspaceVolumeType", propOrder = {"upperLimit", "upperLimitReference", "maximumLimit",
        "maximumLimitReference", "lowerLimit", "lowerLimitReference", "minimumLimit", "minimumLimitReference", "width",
        "horizontalProjection", "centreline", "contributorAirspace", "annotation", "aixmName", "location", "extension"})
@Entity(name = "AirspaceVolumeType")
@Table(name = "airspacevolume_o", schema = "airspace")
public class AirspaceVolumeType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "maximumLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumLimit;
    @XmlElementRef(name = "maximumLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "minimumLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumLimit;
    @XmlElementRef(name = "minimumLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumLimitReference;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "horizontalProjection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> horizontalProjection;
    @XmlElementRef(name = "centreline", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> centreline;
    @XmlElementRef(name = "contributorAirspace", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspaceVolumeDependencyPropertyType> contributorAirspace;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> location;
    protected List<AirspaceVolumeExtensionType> extension;

    /**
     * Gets the value of the upperLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    @Transient
    public boolean isSetUpperLimit() {
        return (this.upperLimit != null);
    }

    /**
     * Gets the value of the upperLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Sets the value of the upperLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    @Transient
    public boolean isSetUpperLimitReference() {
        return (this.upperLimitReference != null);
    }

    /**
     * Gets the value of the maximumLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMaximumLimit() {
        return maximumLimit;
    }

    /**
     * Sets the value of the maximumLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMaximumLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumLimit = value;
    }

    @Transient
    public boolean isSetMaximumLimit() {
        return (this.maximumLimit != null);
    }

    /**
     * Gets the value of the maximumLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMaximumLimitReference() {
        return maximumLimitReference;
    }

    /**
     * Sets the value of the maximumLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setMaximumLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumLimitReference = value;
    }

    @Transient
    public boolean isSetMaximumLimitReference() {
        return (this.maximumLimitReference != null);
    }

    /**
     * Gets the value of the lowerLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    @Transient
    public boolean isSetLowerLimit() {
        return (this.lowerLimit != null);
    }

    /**
     * Gets the value of the lowerLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Sets the value of the lowerLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    @Transient
    public boolean isSetLowerLimitReference() {
        return (this.lowerLimitReference != null);
    }

    /**
     * Gets the value of the minimumLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumLimit() {
        return minimumLimit;
    }

    /**
     * Sets the value of the minimumLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumLimit = value;
    }

    @Transient
    public boolean isSetMinimumLimit() {
        return (this.minimumLimit != null);
    }

    /**
     * Gets the value of the minimumLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMinimumLimitReference() {
        return minimumLimitReference;
    }

    /**
     * Sets the value of the minimumLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setMinimumLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumLimitReference = value;
    }

    @Transient
    public boolean isSetMinimumLimitReference() {
        return (this.minimumLimitReference != null);
    }

    /**
     * Gets the value of the width property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setWidth(JAXBElement<ValDistanceType> value) {
        this.width = value;
    }

    @Transient
    public boolean isSetWidth() {
        return (this.width != null);
    }

    /**
     * Gets the value of the horizontalProjection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getHorizontalProjection() {
        return horizontalProjection;
    }

    /**
     * Sets the value of the horizontalProjection property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *
     */
    public void setHorizontalProjection(JAXBElement<AIXMSurfacePropertyType> value) {
        this.horizontalProjection = value;
    }

    @Transient
    public boolean isSetHorizontalProjection() {
        return (this.horizontalProjection != null);
    }

    /**
     * Gets the value of the centreline property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getCentreline() {
        return centreline;
    }

    /**
     * Sets the value of the centreline property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *
     */
    public void setCentreline(JAXBElement<AIXMCurvePropertyType> value) {
        this.centreline = value;
    }

    @Transient
    public boolean isSetCentreline() {
        return (this.centreline != null);
    }

    /**
     * Gets the value of the contributorAirspace property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirspaceVolumeDependencyPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AirspaceVolumeDependencyPropertyType> getContributorAirspace() {
        return contributorAirspace;
    }

    /**
     * Sets the value of the contributorAirspace property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirspaceVolumeDependencyPropertyType }{@code >}
     *
     */
    public void setContributorAirspace(JAXBElement<AirspaceVolumeDependencyPropertyType> value) {
        this.contributorAirspace = value;
    }

    @Transient
    public boolean isSetContributorAirspace() {
        return (this.contributorAirspace != null);
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
    @JoinTable(name = "arspcvlmtp_annttn_link", schema = "airspace", joinColumns = {
            @JoinColumn(name = "airspacevolume_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link AirspaceVolumeExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = AirspaceVolumeExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspacevolume_oe_hjid", referencedColumnName = "hjid")
    public List<AirspaceVolumeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<AirspaceVolumeExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "upperlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "upperlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "upperlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitnilreason"))})
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimit"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "upperlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreferencenilreason"))})
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimitReference"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "maximumlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "maximumlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "maximumlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maximumlimitnilreason"))})
    public ValDistanceVerticalType getMaximumLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMaximumLimit());
    }

    public void setMaximumLimitItem(ValDistanceVerticalType target) {
        setMaximumLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maximumLimit"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "maximumlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maximumlimitreferencenilreason"))})
    public CodeVerticalReferenceType getMaximumLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMaximumLimitReference());
    }

    public void setMaximumLimitReferenceItem(CodeVerticalReferenceType target) {
        setMaximumLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maximumLimitReference"), AirspaceVolumeType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lowerlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "lowerlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lowerlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitnilreason"))})
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimit"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreferencenilreason"))})
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimitReference"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumlimitnilreason"))})
    public ValDistanceVerticalType getMinimumLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumLimit());
    }

    public void setMinimumLimitItem(ValDistanceVerticalType target) {
        setMinimumLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumLimit"), AirspaceVolumeType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "minimumlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumlimitreferencenilreason"))})
    public CodeVerticalReferenceType getMinimumLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMinimumLimitReference());
    }

    public void setMinimumLimitReferenceItem(CodeVerticalReferenceType target) {
        setMinimumLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumLimitReference"), AirspaceVolumeType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "width", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "widthuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "widthaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "widthnilreason"))})
    public ValDistanceType getWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidth());
    }

    public void setWidthItem(ValDistanceType target) {
        setWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "width"), AirspaceVolumeType.class, target));
    }

    @OneToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arspcvlmtp_hrzntlprjctn_link", schema = "airspace", joinColumns = {
            @JoinColumn(name = "airspacevolume_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "horizontalprojection_hjid", referencedColumnName = "hjid")})
    public AIXMSurfacePropertyType getHorizontalProjectionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getHorizontalProjection());
    }

    public void setHorizontalProjectionItem(AIXMSurfacePropertyType target) {
        setHorizontalProjection(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "horizontalProjection"), AirspaceVolumeType.class,
                target));
    }

    @OneToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arspcvlmtp_cntrln_link", schema = "airspace", joinColumns = {
            @JoinColumn(name = "airspacevolume_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "centreline_hjid", referencedColumnName = "hjid")})
    public AIXMCurvePropertyType getCentrelineItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getCentreline());
    }

    public void setCentrelineItem(AIXMCurvePropertyType target) {
        setCentreline(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "centreline"), AirspaceVolumeType.class, target));
    }

    @OneToOne(targetEntity = AirspaceVolumeDependencyPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arspcvlmtp_cntrbtrarspc_link", schema = "airspace", joinColumns = {
            @JoinColumn(name = "airspacevolume_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "contributorairspace_hjid", referencedColumnName = "hjid")})
    public AirspaceVolumeDependencyPropertyType getContributorAirspaceItem() {
        return XmlAdapterUtils.unmarshallSource(AirspaceVolumeDependencyPropertyType.class,
                this.getContributorAirspace());
    }

    public void setContributorAirspaceItem(AirspaceVolumeDependencyPropertyType target) {
        setContributorAirspace(XmlAdapterUtils.marshallJAXBElement(AirspaceVolumeDependencyPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "contributorAirspace"), AirspaceVolumeType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "name"), AirspaceVolumeType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arspcvlmtp_lctn_link", schema = "airspace", joinColumns = {
            @JoinColumn(name = "airspacevolume_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), AirspaceVolumeType.class, target));
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
        final AirspaceVolumeType that = ((AirspaceVolumeType) object);
        {
            boolean lhsFieldIsSet = this.isSetUpperLimitReference();
            boolean rhsFieldIsSet = that.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getUpperLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimit();
            boolean rhsFieldIsSet = that.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumLimit();
            boolean rhsFieldIsSet = that.isSetMaximumLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMaximumLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMaximumLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirspaceVolumeExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<AirspaceVolumeExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCentreline();
            boolean rhsFieldIsSet = that.isSetCentreline();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getCentreline();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getCentreline();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centreline", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centreline", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHorizontalProjection();
            boolean rhsFieldIsSet = that.isSetHorizontalProjection();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getHorizontalProjection();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getHorizontalProjection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalProjection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalProjection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumLimitReference();
            boolean rhsFieldIsSet = that.isSetMaximumLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMaximumLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMaximumLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimitReference();
            boolean rhsFieldIsSet = that.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getLowerLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContributorAirspace();
            boolean rhsFieldIsSet = that.isSetContributorAirspace();
            JAXBElement<AirspaceVolumeDependencyPropertyType> lhsField;
            lhsField = this.getContributorAirspace();
            JAXBElement<AirspaceVolumeDependencyPropertyType> rhsField;
            rhsField = that.getContributorAirspace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contributorAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contributorAirspace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumLimitReference();
            boolean rhsFieldIsSet = that.isSetMinimumLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMinimumLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMinimumLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidth();
            boolean rhsFieldIsSet = that.isSetWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "width", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "width", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMinimumLimit();
            boolean rhsFieldIsSet = that.isSetMinimumLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumLimit", rhsField);
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
            boolean lhsFieldIsSet = this.isSetUpperLimit();
            boolean rhsFieldIsSet = that.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimit", rhsField);
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
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "width", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjection();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getHorizontalProjection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalProjection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentreline();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getCentreline();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centreline", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContributorAirspace();
            JAXBElement<AirspaceVolumeDependencyPropertyType> theField;
            theField = this.getContributorAirspace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contributorAirspace", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<AirspaceVolumeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumLimit();
            strategy.appendField(locator, this, "maximumLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumLimitReference();
            strategy.appendField(locator, this, "maximumLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumLimit();
            strategy.appendField(locator, this, "minimumLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumLimitReference();
            strategy.appendField(locator, this, "minimumLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjection();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getHorizontalProjection();
            strategy.appendField(locator, this, "horizontalProjection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCentreline();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getCentreline();
            strategy.appendField(locator, this, "centreline", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContributorAirspace();
            JAXBElement<AirspaceVolumeDependencyPropertyType> theField;
            theField = this.getContributorAirspace();
            strategy.appendField(locator, this, "contributorAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<AirspaceVolumeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
