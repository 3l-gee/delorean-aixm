
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
 * <p>Java class for ObstructionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstructionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ObstructionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstructionExtension"/>
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
@XmlType(name = "ObstructionType", propOrder = {
    "requiredClearance",
    "minimumAltitude",
    "surfacePenetration",
    "slopePenetration",
    "controlling",
    "closeIn",
    "theVerticalStructure",
    "adjustment",
    "obstaclePlacement",
    "annotation",
    "extension"
})
@Entity(name = "ObstructionType")
@Table(name = "obstruction", schema = "shared")
public class ObstructionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "requiredClearance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> requiredClearance;
    @XmlElementRef(name = "minimumAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumAltitude;
    @XmlElementRef(name = "surfacePenetration", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> surfacePenetration;
    @XmlElementRef(name = "slopePenetration", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopePenetration;
    @XmlElementRef(name = "controlling", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> controlling;
    @XmlElementRef(name = "closeIn", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> closeIn;
    @XmlElementRef(name = "theVerticalStructure", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<VerticalStructurePropertyType> theVerticalStructure;
    @XmlElement(nillable = true)
    protected List<AltitudeAdjustmentPropertyType> adjustment;
    @XmlElement(nillable = true)
    protected List<ObstaclePlacementPropertyType> obstaclePlacement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstructionTypeExtensionType> extension;

    /**
     * Gets the value of the requiredClearance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getRequiredClearance() {
        return requiredClearance;
    }

    /**
     * Sets the value of the requiredClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRequiredClearance(JAXBElement<ValDistanceType> value) {
        this.requiredClearance = value;
    }

    @Transient
    public boolean isSetRequiredClearance() {
        return (this.requiredClearance!= null);
    }

    /**
     * Gets the value of the minimumAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumAltitude() {
        return minimumAltitude;
    }

    /**
     * Sets the value of the minimumAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumAltitude = value;
    }

    @Transient
    public boolean isSetMinimumAltitude() {
        return (this.minimumAltitude!= null);
    }

    /**
     * Gets the value of the surfacePenetration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSurfacePenetration() {
        return surfacePenetration;
    }

    /**
     * Sets the value of the surfacePenetration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSurfacePenetration(JAXBElement<CodeYesNoType> value) {
        this.surfacePenetration = value;
    }

    @Transient
    public boolean isSetSurfacePenetration() {
        return (this.surfacePenetration!= null);
    }

    /**
     * Gets the value of the slopePenetration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getSlopePenetration() {
        return slopePenetration;
    }

    /**
     * Sets the value of the slopePenetration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopePenetration(JAXBElement<ValAngleType> value) {
        this.slopePenetration = value;
    }

    @Transient
    public boolean isSetSlopePenetration() {
        return (this.slopePenetration!= null);
    }

    /**
     * Gets the value of the controlling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getControlling() {
        return controlling;
    }

    /**
     * Sets the value of the controlling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setControlling(JAXBElement<CodeYesNoType> value) {
        this.controlling = value;
    }

    @Transient
    public boolean isSetControlling() {
        return (this.controlling!= null);
    }

    /**
     * Gets the value of the closeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getCloseIn() {
        return closeIn;
    }

    /**
     * Sets the value of the closeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCloseIn(JAXBElement<CodeYesNoType> value) {
        this.closeIn = value;
    }

    @Transient
    public boolean isSetCloseIn() {
        return (this.closeIn!= null);
    }

    /**
     * Gets the value of the theVerticalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<VerticalStructurePropertyType> getTheVerticalStructure() {
        return theVerticalStructure;
    }

    /**
     * Sets the value of the theVerticalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    public void setTheVerticalStructure(JAXBElement<VerticalStructurePropertyType> value) {
        this.theVerticalStructure = value;
    }

    @Transient
    public boolean isSetTheVerticalStructure() {
        return (this.theVerticalStructure!= null);
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltitudeAdjustmentPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AltitudeAdjustmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "adjustment_id", referencedColumnName = "hjid")
    public List<AltitudeAdjustmentPropertyType> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<>();
        }
        return this.adjustment;
    }

    /**
     * 
     * 
     */
    public void setAdjustment(List<AltitudeAdjustmentPropertyType> adjustment) {
        this.adjustment = adjustment;
    }

    @Transient
    public boolean isSetAdjustment() {
        return ((this.adjustment!= null)&&(!this.adjustment.isEmpty()));
    }

    public void unsetAdjustment() {
        this.adjustment = null;
    }

    /**
     * Gets the value of the obstaclePlacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstaclePlacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstaclePlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstaclePlacementPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstaclePlacementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "obstacleplacement_id", referencedColumnName = "hjid")
    public List<ObstaclePlacementPropertyType> getObstaclePlacement() {
        if (obstaclePlacement == null) {
            obstaclePlacement = new ArrayList<>();
        }
        return this.obstaclePlacement;
    }

    /**
     * 
     * 
     */
    public void setObstaclePlacement(List<ObstaclePlacementPropertyType> obstaclePlacement) {
        this.obstaclePlacement = obstaclePlacement;
    }

    @Transient
    public boolean isSetObstaclePlacement() {
        return ((this.obstaclePlacement!= null)&&(!this.obstaclePlacement.isEmpty()));
    }

    public void unsetObstaclePlacement() {
        this.obstaclePlacement = null;
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
     * {@link ObstructionTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstructionTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_OBSTRUCTION_TYPE_H_0")
    public List<ObstructionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ObstructionTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "requiredclearance")),
        @AttributeOverride(name = "uom", column = @Column(name = "requiredclearance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "requiredclearance_nilreason"))
    })
    public ValDistanceType getRequiredClearanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRequiredClearance());
    }

    public void setRequiredClearanceItem(ValDistanceType target) {
        setRequiredClearance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "requiredClearance"), ObstructionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumaltitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumAltitude());
    }

    public void setMinimumAltitudeItem(ValDistanceVerticalType target) {
        setMinimumAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumAltitude"), ObstructionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "surfacepenetration")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "surfacepenetration_nilreason"))
    })
    public CodeYesNoType getSurfacePenetrationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSurfacePenetration());
    }

    public void setSurfacePenetrationItem(CodeYesNoType target) {
        setSurfacePenetration(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfacePenetration"), ObstructionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopepenetration")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopepenetration_nilreason"))
    })
    public ValAngleType getSlopePenetrationItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getSlopePenetration());
    }

    public void setSlopePenetrationItem(ValAngleType target) {
        setSlopePenetration(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slopePenetration"), ObstructionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "controlling")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "controlling_nilreason"))
    })
    public CodeYesNoType getControllingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getControlling());
    }

    public void setControllingItem(CodeYesNoType target) {
        setControlling(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "controlling"), ObstructionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "closein")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "closein_nilreason"))
    })
    public CodeYesNoType getCloseInItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getCloseIn());
    }

    public void setCloseInItem(CodeYesNoType target) {
        setCloseIn(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "closeIn"), ObstructionType.class, target));
    }

    @OneToOne(targetEntity = VerticalStructurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "theverticalstructure_id", referencedColumnName = "hjid")
    public VerticalStructurePropertyType getTheVerticalStructureItem() {
        return XmlAdapterUtils.unmarshallSource(VerticalStructurePropertyType.class, this.getTheVerticalStructure());
    }

    public void setTheVerticalStructureItem(VerticalStructurePropertyType target) {
        setTheVerticalStructure(XmlAdapterUtils.marshallJAXBElement(VerticalStructurePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "theVerticalStructure"), ObstructionType.class, target));
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
        final ObstructionType that = ((ObstructionType) object);
        {
            boolean lhsFieldIsSet = this.isSetSlopePenetration();
            boolean rhsFieldIsSet = that.isSetSlopePenetration();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getSlopePenetration();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getSlopePenetration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slopePenetration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slopePenetration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdjustment();
            boolean rhsFieldIsSet = that.isSetAdjustment();
            List<AltitudeAdjustmentPropertyType> lhsField;
            lhsField = (this.isSetAdjustment()?this.getAdjustment():null);
            List<AltitudeAdjustmentPropertyType> rhsField;
            rhsField = (that.isSetAdjustment()?that.getAdjustment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "adjustment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "adjustment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTheVerticalStructure();
            boolean rhsFieldIsSet = that.isSetTheVerticalStructure();
            JAXBElement<VerticalStructurePropertyType> lhsField;
            lhsField = this.getTheVerticalStructure();
            JAXBElement<VerticalStructurePropertyType> rhsField;
            rhsField = that.getTheVerticalStructure();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "theVerticalStructure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "theVerticalStructure", rhsField);
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
            boolean lhsFieldIsSet = this.isSetControlling();
            boolean rhsFieldIsSet = that.isSetControlling();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getControlling();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getControlling();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlling", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstaclePlacement();
            boolean rhsFieldIsSet = that.isSetObstaclePlacement();
            List<ObstaclePlacementPropertyType> lhsField;
            lhsField = (this.isSetObstaclePlacement()?this.getObstaclePlacement():null);
            List<ObstaclePlacementPropertyType> rhsField;
            rhsField = (that.isSetObstaclePlacement()?that.getObstaclePlacement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstaclePlacement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstaclePlacement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRequiredClearance();
            boolean rhsFieldIsSet = that.isSetRequiredClearance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRequiredClearance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRequiredClearance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "requiredClearance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "requiredClearance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCloseIn();
            boolean rhsFieldIsSet = that.isSetCloseIn();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getCloseIn();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getCloseIn();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "closeIn", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "closeIn", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurfacePenetration();
            boolean rhsFieldIsSet = that.isSetSurfacePenetration();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSurfacePenetration();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSurfacePenetration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfacePenetration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfacePenetration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ObstructionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ObstructionTypeExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetRequiredClearance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRequiredClearance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "requiredClearance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfacePenetration();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSurfacePenetration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfacePenetration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopePenetration();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopePenetration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slopePenetration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlling();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getControlling();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCloseIn();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCloseIn();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "closeIn", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheVerticalStructure();
            JAXBElement<VerticalStructurePropertyType> theField;
            theField = this.getTheVerticalStructure();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "theVerticalStructure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustment();
            List<AltitudeAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustment()?this.getAdjustment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "adjustment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            List<ObstaclePlacementPropertyType> theField;
            theField = (this.isSetObstaclePlacement()?this.getObstaclePlacement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstaclePlacement", theField);
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
            List<ObstructionTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetRequiredClearance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRequiredClearance();
            strategy.appendField(locator, this, "requiredClearance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumAltitude();
            strategy.appendField(locator, this, "minimumAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfacePenetration();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSurfacePenetration();
            strategy.appendField(locator, this, "surfacePenetration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopePenetration();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopePenetration();
            strategy.appendField(locator, this, "slopePenetration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlling();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getControlling();
            strategy.appendField(locator, this, "controlling", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCloseIn();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCloseIn();
            strategy.appendField(locator, this, "closeIn", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheVerticalStructure();
            JAXBElement<VerticalStructurePropertyType> theField;
            theField = this.getTheVerticalStructure();
            strategy.appendField(locator, this, "theVerticalStructure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustment();
            List<AltitudeAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustment()?this.getAdjustment():null);
            strategy.appendField(locator, this, "adjustment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            List<ObstaclePlacementPropertyType> theField;
            theField = (this.isSetObstaclePlacement()?this.getObstaclePlacement():null);
            strategy.appendField(locator, this, "obstaclePlacement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ObstructionTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
