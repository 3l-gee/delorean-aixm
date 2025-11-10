
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
 * <p>Java class for FlightRestrictionLevelType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRestrictionLevelType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionLevelPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightRestrictionLevelExtension"/>
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
@XmlType(name = "FlightRestrictionLevelType", propOrder = {
    "upperLevel",
    "upperLevelReference",
    "lowerLevel",
    "lowerLevelReference",
    "annotation",
    "extension"
})
@Entity(name = "FlightRestrictionLevelType")
@Table(name = "flightrestrictionlevel", schema = "route")
public class FlightRestrictionLevelType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "upperLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLevel;
    @XmlElementRef(name = "upperLevelReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLevelReference;
    @XmlElementRef(name = "lowerLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLevel;
    @XmlElementRef(name = "lowerLevelReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLevelReference;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightRestrictionLevelTypeExtensionType> extension;

    /**
     * Gets the value of the upperLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLevel() {
        return upperLevel;
    }

    /**
     * Sets the value of the upperLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLevel(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLevel = value;
    }

    @Transient
    public boolean isSetUpperLevel() {
        return (this.upperLevel!= null);
    }

    /**
     * Gets the value of the upperLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getUpperLevelReference() {
        return upperLevelReference;
    }

    /**
     * Sets the value of the upperLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLevelReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLevelReference = value;
    }

    @Transient
    public boolean isSetUpperLevelReference() {
        return (this.upperLevelReference!= null);
    }

    /**
     * Gets the value of the lowerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLevel() {
        return lowerLevel;
    }

    /**
     * Sets the value of the lowerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLevel(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLevel = value;
    }

    @Transient
    public boolean isSetLowerLevel() {
        return (this.lowerLevel!= null);
    }

    /**
     * Gets the value of the lowerLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getLowerLevelReference() {
        return lowerLevelReference;
    }

    /**
     * Sets the value of the lowerLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLevelReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLevelReference = value;
    }

    @Transient
    public boolean isSetLowerLevelReference() {
        return (this.lowerLevelReference!= null);
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
     * {@link FlightRestrictionLevelTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightRestrictionLevelTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FLIGHT_RESTRICTION_1")
    public List<FlightRestrictionLevelTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FlightRestrictionLevelTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "upperlevel")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlevel_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlevel_nilreason"))
    })
    public ValDistanceVerticalType getUpperLevelItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLevel());
    }

    public void setUpperLevelItem(ValDistanceVerticalType target) {
        setUpperLevel(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLevel"), FlightRestrictionLevelType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlevelreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlevelreference_nilreason"))
    })
    public CodeVerticalReferenceType getUpperLevelReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLevelReference());
    }

    public void setUpperLevelReferenceItem(CodeVerticalReferenceType target) {
        setUpperLevelReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLevelReference"), FlightRestrictionLevelType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlevel")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowerlevel_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlevel_nilreason"))
    })
    public ValDistanceVerticalType getLowerLevelItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLevel());
    }

    public void setLowerLevelItem(ValDistanceVerticalType target) {
        setLowerLevel(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLevel"), FlightRestrictionLevelType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlevelreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlevelreference_nilreason"))
    })
    public CodeVerticalReferenceType getLowerLevelReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLevelReference());
    }

    public void setLowerLevelReferenceItem(CodeVerticalReferenceType target) {
        setLowerLevelReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLevelReference"), FlightRestrictionLevelType.class, target));
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
        final FlightRestrictionLevelType that = ((FlightRestrictionLevelType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FlightRestrictionLevelTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FlightRestrictionLevelTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLevel();
            boolean rhsFieldIsSet = that.isSetUpperLevel();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLevel();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLevel", rhsField);
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
            boolean lhsFieldIsSet = this.isSetUpperLevelReference();
            boolean rhsFieldIsSet = that.isSetUpperLevelReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getUpperLevelReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getUpperLevelReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLevelReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLevelReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLevel();
            boolean rhsFieldIsSet = that.isSetLowerLevel();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLevel();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLevelReference();
            boolean rhsFieldIsSet = that.isSetLowerLevelReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getLowerLevelReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getLowerLevelReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLevelReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLevelReference", rhsField);
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
            boolean theFieldIsSet = this.isSetUpperLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLevelReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLevelReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLevelReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLevelReference", theField);
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
            List<FlightRestrictionLevelTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetUpperLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLevel();
            strategy.appendField(locator, this, "upperLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLevelReference();
            strategy.appendField(locator, this, "upperLevelReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLevel();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLevel();
            strategy.appendField(locator, this, "lowerLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLevelReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLevelReference();
            strategy.appendField(locator, this, "lowerLevelReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightRestrictionLevelTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
