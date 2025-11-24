
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
 * <p>Java class for RadioFrequencyAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadioFrequencyAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RadioFrequencyAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadioFrequencyAreaExtension"/>
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
@XmlType(name = "RadioFrequencyAreaTimeSliceType", propOrder = {
    "type",
    "angleScallop",
    "signalType",
    "equipmentRadar",
    "equipmentPrecisionApproachRadar",
    "equipmentFrequency",
    "equipmentSpecialNavigationStation",
    "equipmentNavaidEquipment",
    "sector",
    "extent",
    "annotation",
    "extension"
})
@Entity(name = "RadioFrequencyAreaTimeSliceType")
@Table(name = "radiofrequencyarea_ts", schema = "shared")
public class RadioFrequencyAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioFrequencyAreaType> type;
    @XmlElementRef(name = "angleScallop", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleScallop;
    @XmlElementRef(name = "signalType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioSignalType> signalType;
    @XmlElementRef(name = "equipment_radar", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SecondarySurveillanceRadarPropertyType> equipmentRadar;
    @XmlElementRef(name = "equipment_precisionApproachRadar", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PrecisionApproachRadarPropertyType> equipmentPrecisionApproachRadar;
    @XmlElementRef(name = "equipment_frequency", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadioCommunicationChannelPropertyType> equipmentFrequency;
    @XmlElementRef(name = "equipment_specialNavigationStation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationStationPropertyType> equipmentSpecialNavigationStation;
    @XmlElementRef(name = "equipment_navaidEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidEquipmentPropertyType> equipmentNavaidEquipment;
    @XmlElement(nillable = true)
    protected List<CircleSectorPropertyType> sector;
    @XmlElement(nillable = true)
    protected List<AIXMSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RadioFrequencyAreaExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioFrequencyAreaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadioFrequencyAreaType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioFrequencyAreaType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRadioFrequencyAreaType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the angleScallop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getAngleScallop() {
        return angleScallop;
    }

    /**
     * Sets the value of the angleScallop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleScallop(JAXBElement<ValAngleType> value) {
        this.angleScallop = value;
    }

    @Transient
    public boolean isSetAngleScallop() {
        return (this.angleScallop!= null);
    }

    /**
     * Gets the value of the signalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioSignalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadioSignalType> getSignalType() {
        return signalType;
    }

    /**
     * Sets the value of the signalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioSignalType }{@code >}
     *     
     */
    public void setSignalType(JAXBElement<CodeRadioSignalType> value) {
        this.signalType = value;
    }

    @Transient
    public boolean isSetSignalType() {
        return (this.signalType!= null);
    }

    /**
     * Gets the value of the equipmentRadar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SecondarySurveillanceRadarPropertyType> getEquipmentRadar() {
        return equipmentRadar;
    }

    /**
     * Sets the value of the equipmentRadar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarPropertyType }{@code >}
     *     
     */
    public void setEquipmentRadar(JAXBElement<SecondarySurveillanceRadarPropertyType> value) {
        this.equipmentRadar = value;
    }

    @Transient
    public boolean isSetEquipmentRadar() {
        return (this.equipmentRadar!= null);
    }

    /**
     * Gets the value of the equipmentPrecisionApproachRadar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<PrecisionApproachRadarPropertyType> getEquipmentPrecisionApproachRadar() {
        return equipmentPrecisionApproachRadar;
    }

    /**
     * Sets the value of the equipmentPrecisionApproachRadar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarPropertyType }{@code >}
     *     
     */
    public void setEquipmentPrecisionApproachRadar(JAXBElement<PrecisionApproachRadarPropertyType> value) {
        this.equipmentPrecisionApproachRadar = value;
    }

    @Transient
    public boolean isSetEquipmentPrecisionApproachRadar() {
        return (this.equipmentPrecisionApproachRadar!= null);
    }

    /**
     * Gets the value of the equipmentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RadioCommunicationChannelPropertyType> getEquipmentFrequency() {
        return equipmentFrequency;
    }

    /**
     * Sets the value of the equipmentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelPropertyType }{@code >}
     *     
     */
    public void setEquipmentFrequency(JAXBElement<RadioCommunicationChannelPropertyType> value) {
        this.equipmentFrequency = value;
    }

    @Transient
    public boolean isSetEquipmentFrequency() {
        return (this.equipmentFrequency!= null);
    }

    /**
     * Gets the value of the equipmentSpecialNavigationStation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SpecialNavigationStationPropertyType> getEquipmentSpecialNavigationStation() {
        return equipmentSpecialNavigationStation;
    }

    /**
     * Sets the value of the equipmentSpecialNavigationStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public void setEquipmentSpecialNavigationStation(JAXBElement<SpecialNavigationStationPropertyType> value) {
        this.equipmentSpecialNavigationStation = value;
    }

    @Transient
    public boolean isSetEquipmentSpecialNavigationStation() {
        return (this.equipmentSpecialNavigationStation!= null);
    }

    /**
     * Gets the value of the equipmentNavaidEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidEquipmentPropertyType> getEquipmentNavaidEquipment() {
        return equipmentNavaidEquipment;
    }

    /**
     * Sets the value of the equipmentNavaidEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentPropertyType }{@code >}
     *     
     */
    public void setEquipmentNavaidEquipment(JAXBElement<NavaidEquipmentPropertyType> value) {
        this.equipmentNavaidEquipment = value;
    }

    @Transient
    public boolean isSetEquipmentNavaidEquipment() {
        return (this.equipmentNavaidEquipment!= null);
    }

    /**
     * Gets the value of the sector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CircleSectorPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = CircleSectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "sector_radiofrequencyarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "sector", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radiofrequencyareapropertygroup", referencedColumnName = "hjid")
    })
    public List<CircleSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<>();
        }
        return this.sector;
    }

    /**
     * 
     * 
     */
    public void setSector(List<CircleSectorPropertyType> sector) {
        this.sector = sector;
    }

    @Transient
    public boolean isSetSector() {
        return ((this.sector!= null)&&(!this.sector.isEmpty()));
    }

    public void unsetSector() {
        this.sector = null;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIXMSurfacePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "extent_radiofrequencyarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "extent", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radiofrequencyareapropertygroup", referencedColumnName = "hjid")
    })
    public List<AIXMSurfacePropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<>();
        }
        return this.extent;
    }

    /**
     * 
     * 
     */
    public void setExtent(List<AIXMSurfacePropertyType> extent) {
        this.extent = extent;
    }

    @Transient
    public boolean isSetExtent() {
        return ((this.extent!= null)&&(!this.extent.isEmpty()));
    }

    public void unsetExtent() {
        this.extent = null;
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
    @JoinTable(name = "annotation_radiofrequencyarea_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radiofrequencyareapropertygroup", referencedColumnName = "hjid")
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
     * {@link RadioFrequencyAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RadioFrequencyAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RadioFrequencyAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RadioFrequencyAreaExtensionType> extension) {
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
    public CodeRadioFrequencyAreaType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadioFrequencyAreaType.class, this.getType());
    }

    public void setTypeItem(CodeRadioFrequencyAreaType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRadioFrequencyAreaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anglescallop")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anglescallop_nilreason"))
    })
    public ValAngleType getAngleScallopItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getAngleScallop());
    }

    public void setAngleScallopItem(ValAngleType target) {
        setAngleScallop(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleScallop"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "signaltype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "signaltype_nilreason"))
    })
    public CodeRadioSignalType getSignalTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadioSignalType.class, this.getSignalType());
    }

    public void setSignalTypeItem(CodeRadioSignalType target) {
        setSignalType(XmlAdapterUtils.marshallJAXBElement(CodeRadioSignalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "signalType"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SecondarySurveillanceRadarPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_radar_id", referencedColumnName = "hjid")
    public SecondarySurveillanceRadarPropertyType getEquipmentRadarItem() {
        return XmlAdapterUtils.unmarshallSource(SecondarySurveillanceRadarPropertyType.class, this.getEquipmentRadar());
    }

    public void setEquipmentRadarItem(SecondarySurveillanceRadarPropertyType target) {
        setEquipmentRadar(XmlAdapterUtils.marshallJAXBElement(SecondarySurveillanceRadarPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipment_radar"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = PrecisionApproachRadarPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_precisionapproachradar_id", referencedColumnName = "hjid")
    public PrecisionApproachRadarPropertyType getEquipmentPrecisionApproachRadarItem() {
        return XmlAdapterUtils.unmarshallSource(PrecisionApproachRadarPropertyType.class, this.getEquipmentPrecisionApproachRadar());
    }

    public void setEquipmentPrecisionApproachRadarItem(PrecisionApproachRadarPropertyType target) {
        setEquipmentPrecisionApproachRadar(XmlAdapterUtils.marshallJAXBElement(PrecisionApproachRadarPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipment_precisionApproachRadar"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RadioCommunicationChannelPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_frequency_id", referencedColumnName = "hjid")
    public RadioCommunicationChannelPropertyType getEquipmentFrequencyItem() {
        return XmlAdapterUtils.unmarshallSource(RadioCommunicationChannelPropertyType.class, this.getEquipmentFrequency());
    }

    public void setEquipmentFrequencyItem(RadioCommunicationChannelPropertyType target) {
        setEquipmentFrequency(XmlAdapterUtils.marshallJAXBElement(RadioCommunicationChannelPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipment_frequency"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SpecialNavigationStationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_specialnavigationstation_id", referencedColumnName = "hjid")
    public SpecialNavigationStationPropertyType getEquipmentSpecialNavigationStationItem() {
        return XmlAdapterUtils.unmarshallSource(SpecialNavigationStationPropertyType.class, this.getEquipmentSpecialNavigationStation());
    }

    public void setEquipmentSpecialNavigationStationItem(SpecialNavigationStationPropertyType target) {
        setEquipmentSpecialNavigationStation(XmlAdapterUtils.marshallJAXBElement(SpecialNavigationStationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipment_specialNavigationStation"), RadioFrequencyAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidEquipmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_navaidequipment_id", referencedColumnName = "hjid")
    public NavaidEquipmentPropertyType getEquipmentNavaidEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidEquipmentPropertyType.class, this.getEquipmentNavaidEquipment());
    }

    public void setEquipmentNavaidEquipmentItem(NavaidEquipmentPropertyType target) {
        setEquipmentNavaidEquipment(XmlAdapterUtils.marshallJAXBElement(NavaidEquipmentPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipment_navaidEquipment"), RadioFrequencyAreaTimeSliceType.class, target));
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
        final RadioFrequencyAreaTimeSliceType that = ((RadioFrequencyAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetEquipmentRadar();
            boolean rhsFieldIsSet = that.isSetEquipmentRadar();
            JAXBElement<SecondarySurveillanceRadarPropertyType> lhsField;
            lhsField = this.getEquipmentRadar();
            JAXBElement<SecondarySurveillanceRadarPropertyType> rhsField;
            rhsField = that.getEquipmentRadar();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentRadar", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentRadar", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSector();
            boolean rhsFieldIsSet = that.isSetSector();
            List<CircleSectorPropertyType> lhsField;
            lhsField = (this.isSetSector()?this.getSector():null);
            List<CircleSectorPropertyType> rhsField;
            rhsField = (that.isSetSector()?that.getSector():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignalType();
            boolean rhsFieldIsSet = that.isSetSignalType();
            JAXBElement<CodeRadioSignalType> lhsField;
            lhsField = this.getSignalType();
            JAXBElement<CodeRadioSignalType> rhsField;
            rhsField = that.getSignalType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "signalType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "signalType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEquipmentPrecisionApproachRadar();
            boolean rhsFieldIsSet = that.isSetEquipmentPrecisionApproachRadar();
            JAXBElement<PrecisionApproachRadarPropertyType> lhsField;
            lhsField = this.getEquipmentPrecisionApproachRadar();
            JAXBElement<PrecisionApproachRadarPropertyType> rhsField;
            rhsField = that.getEquipmentPrecisionApproachRadar();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentPrecisionApproachRadar", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentPrecisionApproachRadar", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeRadioFrequencyAreaType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeRadioFrequencyAreaType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEquipmentNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetEquipmentNavaidEquipment();
            JAXBElement<NavaidEquipmentPropertyType> lhsField;
            lhsField = this.getEquipmentNavaidEquipment();
            JAXBElement<NavaidEquipmentPropertyType> rhsField;
            rhsField = that.getEquipmentNavaidEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentNavaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentNavaidEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleScallop();
            boolean rhsFieldIsSet = that.isSetAngleScallop();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getAngleScallop();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getAngleScallop();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleScallop", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleScallop", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEquipmentFrequency();
            boolean rhsFieldIsSet = that.isSetEquipmentFrequency();
            JAXBElement<RadioCommunicationChannelPropertyType> lhsField;
            lhsField = this.getEquipmentFrequency();
            JAXBElement<RadioCommunicationChannelPropertyType> rhsField;
            rhsField = that.getEquipmentFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentFrequency", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RadioFrequencyAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RadioFrequencyAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEquipmentSpecialNavigationStation();
            boolean rhsFieldIsSet = that.isSetEquipmentSpecialNavigationStation();
            JAXBElement<SpecialNavigationStationPropertyType> lhsField;
            lhsField = this.getEquipmentSpecialNavigationStation();
            JAXBElement<SpecialNavigationStationPropertyType> rhsField;
            rhsField = that.getEquipmentSpecialNavigationStation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentSpecialNavigationStation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentSpecialNavigationStation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            List<AIXMSurfacePropertyType> lhsField;
            lhsField = (this.isSetExtent()?this.getExtent():null);
            List<AIXMSurfacePropertyType> rhsField;
            rhsField = (that.isSetExtent()?that.getExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
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
            JAXBElement<CodeRadioFrequencyAreaType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleScallop();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleScallop();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleScallop", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalType();
            JAXBElement<CodeRadioSignalType> theField;
            theField = this.getSignalType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "signalType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentRadar();
            JAXBElement<SecondarySurveillanceRadarPropertyType> theField;
            theField = this.getEquipmentRadar();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentRadar", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentPrecisionApproachRadar();
            JAXBElement<PrecisionApproachRadarPropertyType> theField;
            theField = this.getEquipmentPrecisionApproachRadar();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentPrecisionApproachRadar", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentFrequency();
            JAXBElement<RadioCommunicationChannelPropertyType> theField;
            theField = this.getEquipmentFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentSpecialNavigationStation();
            JAXBElement<SpecialNavigationStationPropertyType> theField;
            theField = this.getEquipmentSpecialNavigationStation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentSpecialNavigationStation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentNavaidEquipment();
            JAXBElement<NavaidEquipmentPropertyType> theField;
            theField = this.getEquipmentNavaidEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentNavaidEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<CircleSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetExtent()?this.getExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
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
            List<RadioFrequencyAreaExtensionType> theField;
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
            JAXBElement<CodeRadioFrequencyAreaType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleScallop();
            JAXBElement<ValAngleType> theField;
            theField = this.getAngleScallop();
            strategy.appendField(locator, this, "angleScallop", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalType();
            JAXBElement<CodeRadioSignalType> theField;
            theField = this.getSignalType();
            strategy.appendField(locator, this, "signalType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentRadar();
            JAXBElement<SecondarySurveillanceRadarPropertyType> theField;
            theField = this.getEquipmentRadar();
            strategy.appendField(locator, this, "equipmentRadar", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentPrecisionApproachRadar();
            JAXBElement<PrecisionApproachRadarPropertyType> theField;
            theField = this.getEquipmentPrecisionApproachRadar();
            strategy.appendField(locator, this, "equipmentPrecisionApproachRadar", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentFrequency();
            JAXBElement<RadioCommunicationChannelPropertyType> theField;
            theField = this.getEquipmentFrequency();
            strategy.appendField(locator, this, "equipmentFrequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentSpecialNavigationStation();
            JAXBElement<SpecialNavigationStationPropertyType> theField;
            theField = this.getEquipmentSpecialNavigationStation();
            strategy.appendField(locator, this, "equipmentSpecialNavigationStation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentNavaidEquipment();
            JAXBElement<NavaidEquipmentPropertyType> theField;
            theField = this.getEquipmentNavaidEquipment();
            strategy.appendField(locator, this, "equipmentNavaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<CircleSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            strategy.appendField(locator, this, "sector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetExtent()?this.getExtent():null);
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RadioFrequencyAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
