
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
 * <p>Java class for EquipmentUnavailableAdjustmentColumnType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EquipmentUnavailableAdjustmentColumnType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}EquipmentUnavailableAdjustmentColumnPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractEquipmentUnavailableAdjustmentColumnExtension"/>
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
@XmlType(name = "EquipmentUnavailableAdjustmentColumnType", propOrder = {
    "guidanceEquipment",
    "landingSystemLights",
    "equipmentRVR",
    "visibilityAdjustment",
    "approachLightingInoperative",
    "annotation",
    "extension"
})
@Entity(name = "EquipmentUnavailableAdjustmentColumnType")
@Table(name = "equipmentunavailableadjustmentcolumn", schema = "procedure")
public class EquipmentUnavailableAdjustmentColumnType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "guidanceEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachType> guidanceEquipment;
    @XmlElementRef(name = "landingSystemLights", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> landingSystemLights;
    @XmlElementRef(name = "equipmentRVR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> equipmentRVR;
    @XmlElementRef(name = "visibilityAdjustment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> visibilityAdjustment;
    @XmlElementRef(name = "approachLightingInoperative", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> approachLightingInoperative;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> extension;

    /**
     * Gets the value of the guidanceEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachType> getGuidanceEquipment() {
        return guidanceEquipment;
    }

    /**
     * Sets the value of the guidanceEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public void setGuidanceEquipment(JAXBElement<CodeApproachType> value) {
        this.guidanceEquipment = value;
    }

    @Transient
    public boolean isSetGuidanceEquipment() {
        return (this.guidanceEquipment!= null);
    }

    /**
     * Gets the value of the landingSystemLights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLandingSystemLights() {
        return landingSystemLights;
    }

    /**
     * Sets the value of the landingSystemLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLandingSystemLights(JAXBElement<CodeYesNoType> value) {
        this.landingSystemLights = value;
    }

    @Transient
    public boolean isSetLandingSystemLights() {
        return (this.landingSystemLights!= null);
    }

    /**
     * Gets the value of the equipmentRVR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getEquipmentRVR() {
        return equipmentRVR;
    }

    /**
     * Sets the value of the equipmentRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setEquipmentRVR(JAXBElement<CodeYesNoType> value) {
        this.equipmentRVR = value;
    }

    @Transient
    public boolean isSetEquipmentRVR() {
        return (this.equipmentRVR!= null);
    }

    /**
     * Gets the value of the visibilityAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getVisibilityAdjustment() {
        return visibilityAdjustment;
    }

    /**
     * Sets the value of the visibilityAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setVisibilityAdjustment(JAXBElement<ValDistanceVerticalType> value) {
        this.visibilityAdjustment = value;
    }

    @Transient
    public boolean isSetVisibilityAdjustment() {
        return (this.visibilityAdjustment!= null);
    }

    /**
     * Gets the value of the approachLightingInoperative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getApproachLightingInoperative() {
        return approachLightingInoperative;
    }

    /**
     * Sets the value of the approachLightingInoperative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setApproachLightingInoperative(JAXBElement<CodeYesNoType> value) {
        this.approachLightingInoperative = value;
    }

    @Transient
    public boolean isSetApproachLightingInoperative() {
        return (this.approachLightingInoperative!= null);
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
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * {@link EquipmentUnavailableAdjustmentColumnTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = EquipmentUnavailableAdjustmentColumnTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_EQUIPMENT_UNAVAILA_1")
    public List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "guidanceequipment")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "guidanceequipment_nilreason"))
    })
    public CodeApproachType getGuidanceEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachType.class, this.getGuidanceEquipment());
    }

    public void setGuidanceEquipmentItem(CodeApproachType target) {
        setGuidanceEquipment(XmlAdapterUtils.marshallJAXBElement(CodeApproachType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceEquipment"), EquipmentUnavailableAdjustmentColumnType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "landingsystemlights")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "landingsystemlights_nilreason"))
    })
    public CodeYesNoType getLandingSystemLightsItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLandingSystemLights());
    }

    public void setLandingSystemLightsItem(CodeYesNoType target) {
        setLandingSystemLights(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "landingSystemLights"), EquipmentUnavailableAdjustmentColumnType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "equipmentrvr")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "equipmentrvr_nilreason"))
    })
    public CodeYesNoType getEquipmentRVRItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getEquipmentRVR());
    }

    public void setEquipmentRVRItem(CodeYesNoType target) {
        setEquipmentRVR(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "equipmentRVR"), EquipmentUnavailableAdjustmentColumnType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "visibilityadjustment")),
        @AttributeOverride(name = "uom", column = @Column(name = "visibilityadjustment_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "visibilityadjustment_nilreason"))
    })
    public ValDistanceVerticalType getVisibilityAdjustmentItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getVisibilityAdjustment());
    }

    public void setVisibilityAdjustmentItem(ValDistanceVerticalType target) {
        setVisibilityAdjustment(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visibilityAdjustment"), EquipmentUnavailableAdjustmentColumnType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachlightinginoperative")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachlightinginoperative_nilreason"))
    })
    public CodeYesNoType getApproachLightingInoperativeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getApproachLightingInoperative());
    }

    public void setApproachLightingInoperativeItem(CodeYesNoType target) {
        setApproachLightingInoperative(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachLightingInoperative"), EquipmentUnavailableAdjustmentColumnType.class, target));
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
        final EquipmentUnavailableAdjustmentColumnType that = ((EquipmentUnavailableAdjustmentColumnType) object);
        {
            boolean lhsFieldIsSet = this.isSetApproachLightingInoperative();
            boolean rhsFieldIsSet = that.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getApproachLightingInoperative();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getApproachLightingInoperative();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachLightingInoperative", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachLightingInoperative", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGuidanceEquipment();
            boolean rhsFieldIsSet = that.isSetGuidanceEquipment();
            JAXBElement<CodeApproachType> lhsField;
            lhsField = this.getGuidanceEquipment();
            JAXBElement<CodeApproachType> rhsField;
            rhsField = that.getGuidanceEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVisibilityAdjustment();
            boolean rhsFieldIsSet = that.isSetVisibilityAdjustment();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getVisibilityAdjustment();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getVisibilityAdjustment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visibilityAdjustment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visibilityAdjustment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLandingSystemLights();
            boolean rhsFieldIsSet = that.isSetLandingSystemLights();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLandingSystemLights();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLandingSystemLights();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingSystemLights", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingSystemLights", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEquipmentRVR();
            boolean rhsFieldIsSet = that.isSetEquipmentRVR();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getEquipmentRVR();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getEquipmentRVR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentRVR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentRVR", rhsField);
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
            boolean theFieldIsSet = this.isSetGuidanceEquipment();
            JAXBElement<CodeApproachType> theField;
            theField = this.getGuidanceEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingSystemLights();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLandingSystemLights();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingSystemLights", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentRVR();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEquipmentRVR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentRVR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibilityAdjustment();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getVisibilityAdjustment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visibilityAdjustment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApproachLightingInoperative();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachLightingInoperative", theField);
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
            List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetGuidanceEquipment();
            JAXBElement<CodeApproachType> theField;
            theField = this.getGuidanceEquipment();
            strategy.appendField(locator, this, "guidanceEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingSystemLights();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLandingSystemLights();
            strategy.appendField(locator, this, "landingSystemLights", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEquipmentRVR();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEquipmentRVR();
            strategy.appendField(locator, this, "equipmentRVR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibilityAdjustment();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getVisibilityAdjustment();
            strategy.appendField(locator, this, "visibilityAdjustment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApproachLightingInoperative();
            strategy.appendField(locator, this, "approachLightingInoperative", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<EquipmentUnavailableAdjustmentColumnTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
