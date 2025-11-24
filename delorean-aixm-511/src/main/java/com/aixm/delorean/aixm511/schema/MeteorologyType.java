
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
 * <p>Java class for MeteorologyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeteorologyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}MeteorologyPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMeteorologyExtension"/>
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
@XmlType(name = "MeteorologyType", propOrder = {
    "flightConditions",
    "visibility",
    "visibilityInterpretation",
    "runwayVisualRange",
    "runwayVisualRangeInterpretation",
    "annotation",
    "extension"
})
@Entity(name = "MeteorologyType")
@Table(name = "meteorology", schema = "shared")
public class MeteorologyType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "flightConditions", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMeteoConditionsType> flightConditions;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "visibilityInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> visibilityInterpretation;
    @XmlElementRef(name = "runwayVisualRange", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> runwayVisualRange;
    @XmlElementRef(name = "runwayVisualRangeInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> runwayVisualRangeInterpretation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MeteorologyTypeExtensionType> extension;

    /**
     * Gets the value of the flightConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMeteoConditionsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMeteoConditionsType> getFlightConditions() {
        return flightConditions;
    }

    /**
     * Sets the value of the flightConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMeteoConditionsType }{@code >}
     *     
     */
    public void setFlightConditions(JAXBElement<CodeMeteoConditionsType> value) {
        this.flightConditions = value;
    }

    @Transient
    public boolean isSetFlightConditions() {
        return (this.flightConditions!= null);
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
     * Gets the value of the visibilityInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getVisibilityInterpretation() {
        return visibilityInterpretation;
    }

    /**
     * Sets the value of the visibilityInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setVisibilityInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.visibilityInterpretation = value;
    }

    @Transient
    public boolean isSetVisibilityInterpretation() {
        return (this.visibilityInterpretation!= null);
    }

    /**
     * Gets the value of the runwayVisualRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getRunwayVisualRange() {
        return runwayVisualRange;
    }

    /**
     * Sets the value of the runwayVisualRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRunwayVisualRange(JAXBElement<ValDistanceType> value) {
        this.runwayVisualRange = value;
    }

    @Transient
    public boolean isSetRunwayVisualRange() {
        return (this.runwayVisualRange!= null);
    }

    /**
     * Gets the value of the runwayVisualRangeInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getRunwayVisualRangeInterpretation() {
        return runwayVisualRangeInterpretation;
    }

    /**
     * Sets the value of the runwayVisualRangeInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setRunwayVisualRangeInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.runwayVisualRangeInterpretation = value;
    }

    @Transient
    public boolean isSetRunwayVisualRangeInterpretation() {
        return (this.runwayVisualRangeInterpretation!= null);
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
    @JoinTable(name = "annotation_meteorology_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "meteorologypropertygroup", referencedColumnName = "hjid")
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
     * {@link MeteorologyTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = MeteorologyTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<MeteorologyTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<MeteorologyTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "flightconditions")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightconditions_nilreason"))
    })
    public CodeMeteoConditionsType getFlightConditionsItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMeteoConditionsType.class, this.getFlightConditions());
    }

    public void setFlightConditionsItem(CodeMeteoConditionsType target) {
        setFlightConditions(XmlAdapterUtils.marshallJAXBElement(CodeMeteoConditionsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightConditions"), MeteorologyType.class, target));
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
        setVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visibility"), MeteorologyType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "visibilityinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "visibilityinterpretation_nilreason"))
    })
    public CodeValueInterpretationType getVisibilityInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getVisibilityInterpretation());
    }

    public void setVisibilityInterpretationItem(CodeValueInterpretationType target) {
        setVisibilityInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visibilityInterpretation"), MeteorologyType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "runwayvisualrange")),
        @AttributeOverride(name = "uom", column = @Column(name = "runwayvisualrange_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "runwayvisualrange_nilreason"))
    })
    public ValDistanceType getRunwayVisualRangeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRunwayVisualRange());
    }

    public void setRunwayVisualRangeItem(ValDistanceType target) {
        setRunwayVisualRange(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "runwayVisualRange"), MeteorologyType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "runwayvisualrangeinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "runwayvisualrangeinterpretation_nilreason"))
    })
    public CodeValueInterpretationType getRunwayVisualRangeInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getRunwayVisualRangeInterpretation());
    }

    public void setRunwayVisualRangeInterpretationItem(CodeValueInterpretationType target) {
        setRunwayVisualRangeInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "runwayVisualRangeInterpretation"), MeteorologyType.class, target));
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
        final MeteorologyType that = ((MeteorologyType) object);
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
            boolean lhsFieldIsSet = this.isSetRunwayVisualRangeInterpretation();
            boolean rhsFieldIsSet = that.isSetRunwayVisualRangeInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getRunwayVisualRangeInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getRunwayVisualRangeInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayVisualRangeInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayVisualRangeInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditions();
            boolean rhsFieldIsSet = that.isSetFlightConditions();
            JAXBElement<CodeMeteoConditionsType> lhsField;
            lhsField = this.getFlightConditions();
            JAXBElement<CodeMeteoConditionsType> rhsField;
            rhsField = that.getFlightConditions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVisibilityInterpretation();
            boolean rhsFieldIsSet = that.isSetVisibilityInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getVisibilityInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getVisibilityInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visibilityInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visibilityInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayVisualRange();
            boolean rhsFieldIsSet = that.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRunwayVisualRange();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRunwayVisualRange();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayVisualRange", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayVisualRange", rhsField);
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
            List<MeteorologyTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<MeteorologyTypeExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetFlightConditions();
            JAXBElement<CodeMeteoConditionsType> theField;
            theField = this.getFlightConditions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditions", theField);
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
            boolean theFieldIsSet = this.isSetVisibilityInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getVisibilityInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visibilityInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRunwayVisualRange();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayVisualRange", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRangeInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getRunwayVisualRangeInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayVisualRangeInterpretation", theField);
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
            List<MeteorologyTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFlightConditions();
            JAXBElement<CodeMeteoConditionsType> theField;
            theField = this.getFlightConditions();
            strategy.appendField(locator, this, "flightConditions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVisibility();
            strategy.appendField(locator, this, "visibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibilityInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getVisibilityInterpretation();
            strategy.appendField(locator, this, "visibilityInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRunwayVisualRange();
            strategy.appendField(locator, this, "runwayVisualRange", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRangeInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getRunwayVisualRangeInterpretation();
            strategy.appendField(locator, this, "runwayVisualRangeInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<MeteorologyTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
