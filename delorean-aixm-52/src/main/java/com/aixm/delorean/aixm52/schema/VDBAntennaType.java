
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
 * Java class for VDBAntennaType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="VDBAntennaType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="frequency" type=
"{http://www.aixm.aero/schema/5.2}ValFrequencyType" minOccurs="0"/>
 *         <element name="emissionPower" type=
"{http://www.aixm.aero/schema/5.2}ValPowerType" minOccurs="0"/>
 *         <element name="polarization" type=
"{http://www.aixm.aero/schema/5.2}CodeSignalPolarizationType" minOccurs="0"/>
 *         <element name="slotsTDMA" type=
"{http://www.aixm.aero/schema/5.2}CodeTDMAEightSlotsType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractVDBAntennaExtension"/>
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
@XmlType(name = "VDBAntennaType", propOrder = {"frequency", "emissionPower", "polarization", "slotsTDMA", "location",
        "annotation", "extension"})
@Entity(name = "VDBAntennaType")
@Table(name = "vdbantenna_o", schema = "navaids_point")
public class VDBAntennaType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "frequency", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequency;
    @XmlElementRef(name = "emissionPower", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPowerType> emissionPower;
    @XmlElementRef(name = "polarization", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSignalPolarizationType> polarization;
    @XmlElementRef(name = "slotsTDMA", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTDMAEightSlotsType> slotsTDMA;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<VDBAntennaTypeExtensionType> extension;

    /**
     * Gets the value of the frequency property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValFrequencyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValFrequencyType> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValFrequencyType }{@code >}
     *
     */
    public void setFrequency(JAXBElement<ValFrequencyType> value) {
        this.frequency = value;
    }

    @Transient
    public boolean isSetFrequency() {
        return (this.frequency != null);
    }

    /**
     * Gets the value of the emissionPower property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValPowerType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValPowerType> getEmissionPower() {
        return emissionPower;
    }

    /**
     * Sets the value of the emissionPower property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link ValPowerType
     *            }{@code >}
     *
     */
    public void setEmissionPower(JAXBElement<ValPowerType> value) {
        this.emissionPower = value;
    }

    @Transient
    public boolean isSetEmissionPower() {
        return (this.emissionPower != null);
    }

    /**
     * Gets the value of the polarization property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSignalPolarizationType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSignalPolarizationType> getPolarization() {
        return polarization;
    }

    /**
     * Sets the value of the polarization property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSignalPolarizationType }{@code >}
     *
     */
    public void setPolarization(JAXBElement<CodeSignalPolarizationType> value) {
        this.polarization = value;
    }

    @Transient
    public boolean isSetPolarization() {
        return (this.polarization != null);
    }

    /**
     * Gets the value of the slotsTDMA property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeTDMAEightSlotsType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeTDMAEightSlotsType> getSlotsTDMA() {
        return slotsTDMA;
    }

    /**
     * Sets the value of the slotsTDMA property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeTDMAEightSlotsType }{@code >}
     *
     */
    public void setSlotsTDMA(JAXBElement<CodeTDMAEightSlotsType> value) {
        this.slotsTDMA = value;
    }

    @Transient
    public boolean isSetSlotsTDMA() {
        return (this.slotsTDMA != null);
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location != null);
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
    @JoinTable(name = "vdbantnntp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "vdbantenna_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link VDBAntennaTypeExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = VDBAntennaTypeExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "vdbantennae_hjid", referencedColumnName = "hjid")
    public List<VDBAntennaTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<VDBAntennaTypeExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "frequency", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "frequencyuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "frequencynilreason"))})
    public ValFrequencyType getFrequencyItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrequencyType.class, this.getFrequency());
    }

    public void setFrequencyItem(ValFrequencyType target) {
        setFrequency(XmlAdapterUtils.marshallJAXBElement(ValFrequencyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "frequency"), VDBAntennaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "emissionpower", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "emissionpoweruom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "emissionpowernilreason"))})
    public ValPowerType getEmissionPowerItem() {
        return XmlAdapterUtils.unmarshallSource(ValPowerType.class, this.getEmissionPower());
    }

    public void setEmissionPowerItem(ValPowerType target) {
        setEmissionPower(XmlAdapterUtils.marshallJAXBElement(ValPowerType.class,
                new QName("http://www.aixm.aero/schema/5.2", "emissionPower"), VDBAntennaType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "polarization")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "polarizationnilreason"))})
    public CodeSignalPolarizationType getPolarizationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSignalPolarizationType.class, this.getPolarization());
    }

    public void setPolarizationItem(CodeSignalPolarizationType target) {
        setPolarization(XmlAdapterUtils.marshallJAXBElement(CodeSignalPolarizationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "polarization"), VDBAntennaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "slotstdma", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "slotstdmanilreason"))})
    public CodeTDMAEightSlotsType getSlotsTDMAItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTDMAEightSlotsType.class, this.getSlotsTDMA());
    }

    public void setSlotsTDMAItem(CodeTDMAEightSlotsType target) {
        setSlotsTDMA(XmlAdapterUtils.marshallJAXBElement(CodeTDMAEightSlotsType.class,
                new QName("http://www.aixm.aero/schema/5.2", "slotsTDMA"), VDBAntennaType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "vdbantnntp_lctn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "vdbantenna_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), VDBAntennaType.class, target));
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
        final VDBAntennaType that = ((VDBAntennaType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<VDBAntennaTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<VDBAntennaTypeExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetFrequency();
            boolean rhsFieldIsSet = that.isSetFrequency();
            JAXBElement<ValFrequencyType> lhsField;
            lhsField = this.getFrequency();
            JAXBElement<ValFrequencyType> rhsField;
            rhsField = that.getFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmissionPower();
            boolean rhsFieldIsSet = that.isSetEmissionPower();
            JAXBElement<ValPowerType> lhsField;
            lhsField = this.getEmissionPower();
            JAXBElement<ValPowerType> rhsField;
            rhsField = that.getEmissionPower();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emissionPower", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emissionPower", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlotsTDMA();
            boolean rhsFieldIsSet = that.isSetSlotsTDMA();
            JAXBElement<CodeTDMAEightSlotsType> lhsField;
            lhsField = this.getSlotsTDMA();
            JAXBElement<CodeTDMAEightSlotsType> rhsField;
            rhsField = that.getSlotsTDMA();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slotsTDMA", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slotsTDMA", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPolarization();
            boolean rhsFieldIsSet = that.isSetPolarization();
            JAXBElement<CodeSignalPolarizationType> lhsField;
            lhsField = this.getPolarization();
            JAXBElement<CodeSignalPolarizationType> rhsField;
            rhsField = that.getPolarization();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "polarization", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "polarization", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
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
            boolean theFieldIsSet = this.isSetFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmissionPower();
            JAXBElement<ValPowerType> theField;
            theField = this.getEmissionPower();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emissionPower", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPolarization();
            JAXBElement<CodeSignalPolarizationType> theField;
            theField = this.getPolarization();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "polarization", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlotsTDMA();
            JAXBElement<CodeTDMAEightSlotsType> theField;
            theField = this.getSlotsTDMA();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slotsTDMA", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
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
            List<VDBAntennaTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmissionPower();
            JAXBElement<ValPowerType> theField;
            theField = this.getEmissionPower();
            strategy.appendField(locator, this, "emissionPower", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPolarization();
            JAXBElement<CodeSignalPolarizationType> theField;
            theField = this.getPolarization();
            strategy.appendField(locator, this, "polarization", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlotsTDMA();
            JAXBElement<CodeTDMAEightSlotsType> theField;
            theField = this.getSlotsTDMA();
            strategy.appendField(locator, this, "slotsTDMA", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
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
            List<VDBAntennaTypeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
