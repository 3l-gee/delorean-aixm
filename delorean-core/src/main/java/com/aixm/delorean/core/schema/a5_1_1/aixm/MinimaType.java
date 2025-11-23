
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
 * <p>Java class for MinimaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MinimaType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}MinimaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMinimaExtension"/>
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
@XmlType(name = "MinimaType", propOrder = {
    "altitude",
    "altitudeCode",
    "altitudeReference",
    "height",
    "militaryHeight",
    "radioHeight",
    "heightCode",
    "heightReference",
    "visibility",
    "militaryVisibility",
    "mandatoryRVR",
    "remoteAltimeterMinima",
    "adjustmentINOP",
    "annotation",
    "extension"
})
@Entity(name = "MinimaType")
@Table(name = "minima", schema = "procedure")
public class MinimaType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "altitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitude;
    @XmlElementRef(name = "altitudeCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumAltitudeType> altitudeCode;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "height", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> height;
    @XmlElementRef(name = "militaryHeight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> militaryHeight;
    @XmlElementRef(name = "radioHeight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> radioHeight;
    @XmlElementRef(name = "heightCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumHeightType> heightCode;
    @XmlElementRef(name = "heightReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHeightReferenceType> heightReference;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "militaryVisibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> militaryVisibility;
    @XmlElementRef(name = "mandatoryRVR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mandatoryRVR;
    @XmlElementRef(name = "remoteAltimeterMinima", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> remoteAltimeterMinima;
    @XmlElement(nillable = true)
    protected List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MinimaTypeExtensionType> extension;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.altitude = value;
    }

    @Transient
    public boolean isSetAltitude() {
        return (this.altitude!= null);
    }

    /**
     * Gets the value of the altitudeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMinimumAltitudeType> getAltitudeCode() {
        return altitudeCode;
    }

    /**
     * Sets the value of the altitudeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    public void setAltitudeCode(JAXBElement<CodeMinimumAltitudeType> value) {
        this.altitudeCode = value;
    }

    @Transient
    public boolean isSetAltitudeCode() {
        return (this.altitudeCode!= null);
    }

    /**
     * Gets the value of the altitudeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getAltitudeReference() {
        return altitudeReference;
    }

    /**
     * Sets the value of the altitudeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeReference = value;
    }

    @Transient
    public boolean isSetAltitudeReference() {
        return (this.altitudeReference!= null);
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.height = value;
    }

    @Transient
    public boolean isSetHeight() {
        return (this.height!= null);
    }

    /**
     * Gets the value of the militaryHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMilitaryHeight() {
        return militaryHeight;
    }

    /**
     * Sets the value of the militaryHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMilitaryHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.militaryHeight = value;
    }

    @Transient
    public boolean isSetMilitaryHeight() {
        return (this.militaryHeight!= null);
    }

    /**
     * Gets the value of the radioHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getRadioHeight() {
        return radioHeight;
    }

    /**
     * Sets the value of the radioHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setRadioHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.radioHeight = value;
    }

    @Transient
    public boolean isSetRadioHeight() {
        return (this.radioHeight!= null);
    }

    /**
     * Gets the value of the heightCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMinimumHeightType> getHeightCode() {
        return heightCode;
    }

    /**
     * Sets the value of the heightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    public void setHeightCode(JAXBElement<CodeMinimumHeightType> value) {
        this.heightCode = value;
    }

    @Transient
    public boolean isSetHeightCode() {
        return (this.heightCode!= null);
    }

    /**
     * Gets the value of the heightReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHeightReferenceType> getHeightReference() {
        return heightReference;
    }

    /**
     * Sets the value of the heightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public void setHeightReference(JAXBElement<CodeHeightReferenceType> value) {
        this.heightReference = value;
    }

    @Transient
    public boolean isSetHeightReference() {
        return (this.heightReference!= null);
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVisibility(JAXBElement<ValDistanceType> value) {
        this.visibility = value;
    }

    @Transient
    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Gets the value of the militaryVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getMilitaryVisibility() {
        return militaryVisibility;
    }

    /**
     * Sets the value of the militaryVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setMilitaryVisibility(JAXBElement<ValDistanceType> value) {
        this.militaryVisibility = value;
    }

    @Transient
    public boolean isSetMilitaryVisibility() {
        return (this.militaryVisibility!= null);
    }

    /**
     * Gets the value of the mandatoryRVR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMandatoryRVR() {
        return mandatoryRVR;
    }

    /**
     * Sets the value of the mandatoryRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMandatoryRVR(JAXBElement<CodeYesNoType> value) {
        this.mandatoryRVR = value;
    }

    @Transient
    public boolean isSetMandatoryRVR() {
        return (this.mandatoryRVR!= null);
    }

    /**
     * Gets the value of the remoteAltimeterMinima property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRemoteAltimeterMinima() {
        return remoteAltimeterMinima;
    }

    /**
     * Sets the value of the remoteAltimeterMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRemoteAltimeterMinima(JAXBElement<CodeYesNoType> value) {
        this.remoteAltimeterMinima = value;
    }

    @Transient
    public boolean isSetRemoteAltimeterMinima() {
        return (this.remoteAltimeterMinima!= null);
    }

    /**
     * Gets the value of the adjustmentINOP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentINOP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentINOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentUnavailableAdjustmentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = EquipmentUnavailableAdjustmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "adjustmentinop_minima_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "adjustmentinop", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "minimapropertygroup", referencedColumnName = "hjid")
    })
    public List<EquipmentUnavailableAdjustmentPropertyType> getAdjustmentINOP() {
        if (adjustmentINOP == null) {
            adjustmentINOP = new ArrayList<>();
        }
        return this.adjustmentINOP;
    }

    /**
     * 
     * 
     */
    public void setAdjustmentINOP(List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP) {
        this.adjustmentINOP = adjustmentINOP;
    }

    @Transient
    public boolean isSetAdjustmentINOP() {
        return ((this.adjustmentINOP!= null)&&(!this.adjustmentINOP.isEmpty()));
    }

    public void unsetAdjustmentINOP() {
        this.adjustmentINOP = null;
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
    @JoinTable(name = "annotation_minima_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "minimapropertygroup", referencedColumnName = "hjid")
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
     * {@link MinimaTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = MinimaTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_MINIMA_TYPE_HJID")
    public List<MinimaTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<MinimaTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "altitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "altitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitude_nilreason"))
    })
    public ValDistanceVerticalType getAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitude());
    }

    public void setAltitudeItem(ValDistanceVerticalType target) {
        setAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitude"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudecode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudecode_nilreason"))
    })
    public CodeMinimumAltitudeType getAltitudeCodeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMinimumAltitudeType.class, this.getAltitudeCode());
    }

    public void setAltitudeCodeItem(CodeMinimumAltitudeType target) {
        setAltitudeCode(XmlAdapterUtils.marshallJAXBElement(CodeMinimumAltitudeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeCode"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudereference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudereference_nilreason"))
    })
    public CodeVerticalReferenceType getAltitudeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeReference());
    }

    public void setAltitudeReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeReference"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "height")),
        @AttributeOverride(name = "uom", column = @Column(name = "height_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "height_nilreason"))
    })
    public ValDistanceVerticalType getHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getHeight());
    }

    public void setHeightItem(ValDistanceVerticalType target) {
        setHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "height"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "militaryheight")),
        @AttributeOverride(name = "uom", column = @Column(name = "militaryheight_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "militaryheight_nilreason"))
    })
    public ValDistanceVerticalType getMilitaryHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMilitaryHeight());
    }

    public void setMilitaryHeightItem(ValDistanceVerticalType target) {
        setMilitaryHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "militaryHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "radioheight")),
        @AttributeOverride(name = "uom", column = @Column(name = "radioheight_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "radioheight_nilreason"))
    })
    public ValDistanceVerticalType getRadioHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getRadioHeight());
    }

    public void setRadioHeightItem(ValDistanceVerticalType target) {
        setRadioHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "radioHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "heightcode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "heightcode_nilreason"))
    })
    public CodeMinimumHeightType getHeightCodeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMinimumHeightType.class, this.getHeightCode());
    }

    public void setHeightCodeItem(CodeMinimumHeightType target) {
        setHeightCode(XmlAdapterUtils.marshallJAXBElement(CodeMinimumHeightType.class, new QName("http://www.aixm.aero/schema/5.1.1", "heightCode"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "heightreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "heightreference_nilreason"))
    })
    public CodeHeightReferenceType getHeightReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHeightReferenceType.class, this.getHeightReference());
    }

    public void setHeightReferenceItem(CodeHeightReferenceType target) {
        setHeightReference(XmlAdapterUtils.marshallJAXBElement(CodeHeightReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "heightReference"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "visibility")),
        @AttributeOverride(name = "uom", column = @Column(name = "visibility_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "visibility_nilreason"))
    })
    public ValDistanceType getVisibilityItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVisibility());
    }

    public void setVisibilityItem(ValDistanceType target) {
        setVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visibility"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "militaryvisibility")),
        @AttributeOverride(name = "uom", column = @Column(name = "militaryvisibility_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "militaryvisibility_nilreason"))
    })
    public ValDistanceType getMilitaryVisibilityItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getMilitaryVisibility());
    }

    public void setMilitaryVisibilityItem(ValDistanceType target) {
        setMilitaryVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "militaryVisibility"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "mandatoryrvr")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "mandatoryrvr_nilreason"))
    })
    public CodeYesNoType getMandatoryRVRItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMandatoryRVR());
    }

    public void setMandatoryRVRItem(CodeYesNoType target) {
        setMandatoryRVR(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "mandatoryRVR"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "remotealtimeterminima")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "remotealtimeterminima_nilreason"))
    })
    public CodeYesNoType getRemoteAltimeterMinimaItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRemoteAltimeterMinima());
    }

    public void setRemoteAltimeterMinimaItem(CodeYesNoType target) {
        setRemoteAltimeterMinima(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "remoteAltimeterMinima"), MinimaType.class, target));
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
        final MinimaType that = ((MinimaType) object);
        {
            boolean lhsFieldIsSet = this.isSetRemoteAltimeterMinima();
            boolean rhsFieldIsSet = that.isSetRemoteAltimeterMinima();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRemoteAltimeterMinima();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRemoteAltimeterMinima();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "remoteAltimeterMinima", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "remoteAltimeterMinima", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeCode();
            boolean rhsFieldIsSet = that.isSetAltitudeCode();
            JAXBElement<CodeMinimumAltitudeType> lhsField;
            lhsField = this.getAltitudeCode();
            JAXBElement<CodeMinimumAltitudeType> rhsField;
            rhsField = that.getAltitudeCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdjustmentINOP();
            boolean rhsFieldIsSet = that.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> lhsField;
            lhsField = (this.isSetAdjustmentINOP()?this.getAdjustmentINOP():null);
            List<EquipmentUnavailableAdjustmentPropertyType> rhsField;
            rhsField = (that.isSetAdjustmentINOP()?that.getAdjustmentINOP():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "adjustmentINOP", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "adjustmentINOP", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<MinimaTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<MinimaTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitude();
            boolean rhsFieldIsSet = that.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryHeight();
            boolean rhsFieldIsSet = that.isSetMilitaryHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMilitaryHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMilitaryHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVisibility();
            boolean rhsFieldIsSet = that.isSetVisibility();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVisibility();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVisibility();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visibility", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visibility", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeReference();
            boolean rhsFieldIsSet = that.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getAltitudeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHeight();
            boolean rhsFieldIsSet = that.isSetHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "height", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "height", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryVisibility();
            boolean rhsFieldIsSet = that.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getMilitaryVisibility();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getMilitaryVisibility();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryVisibility", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryVisibility", rhsField);
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
            boolean lhsFieldIsSet = this.isSetRadioHeight();
            boolean rhsFieldIsSet = that.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getRadioHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getRadioHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMandatoryRVR();
            boolean rhsFieldIsSet = that.isSetMandatoryRVR();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMandatoryRVR();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMandatoryRVR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mandatoryRVR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mandatoryRVR", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHeightCode();
            boolean rhsFieldIsSet = that.isSetHeightCode();
            JAXBElement<CodeMinimumHeightType> lhsField;
            lhsField = this.getHeightCode();
            JAXBElement<CodeMinimumHeightType> rhsField;
            rhsField = that.getHeightCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "heightCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "heightCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHeightReference();
            boolean rhsFieldIsSet = that.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> lhsField;
            lhsField = this.getHeightReference();
            JAXBElement<CodeHeightReferenceType> rhsField;
            rhsField = that.getHeightReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "heightReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "heightReference", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeCode();
            JAXBElement<CodeMinimumAltitudeType> theField;
            theField = this.getAltitudeCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "height", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMilitaryHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRadioHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightCode();
            JAXBElement<CodeMinimumHeightType> theField;
            theField = this.getHeightCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "heightCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "heightReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVisibility();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visibility", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMilitaryVisibility();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryVisibility", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMandatoryRVR();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMandatoryRVR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mandatoryRVR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRemoteAltimeterMinima();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRemoteAltimeterMinima();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "remoteAltimeterMinima", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustmentINOP()?this.getAdjustmentINOP():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "adjustmentINOP", theField);
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
            List<MinimaTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitude();
            strategy.appendField(locator, this, "altitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeCode();
            JAXBElement<CodeMinimumAltitudeType> theField;
            theField = this.getAltitudeCode();
            strategy.appendField(locator, this, "altitudeCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            strategy.appendField(locator, this, "altitudeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMilitaryHeight();
            strategy.appendField(locator, this, "militaryHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRadioHeight();
            strategy.appendField(locator, this, "radioHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightCode();
            JAXBElement<CodeMinimumHeightType> theField;
            theField = this.getHeightCode();
            strategy.appendField(locator, this, "heightCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            strategy.appendField(locator, this, "heightReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVisibility();
            strategy.appendField(locator, this, "visibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMilitaryVisibility();
            strategy.appendField(locator, this, "militaryVisibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMandatoryRVR();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMandatoryRVR();
            strategy.appendField(locator, this, "mandatoryRVR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRemoteAltimeterMinima();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRemoteAltimeterMinima();
            strategy.appendField(locator, this, "remoteAltimeterMinima", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustmentINOP()?this.getAdjustmentINOP():null);
            strategy.appendField(locator, this, "adjustmentINOP", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<MinimaTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
