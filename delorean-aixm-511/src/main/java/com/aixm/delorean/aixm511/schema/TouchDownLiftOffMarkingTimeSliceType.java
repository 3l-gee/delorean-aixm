
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
 * <p>Java class for TouchDownLiftOffMarkingTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TouchDownLiftOffMarkingTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TouchDownLiftOffMarkingPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTouchDownLiftOffMarkingExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMarkingExtension"/>
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
@XmlType(name = "TouchDownLiftOffMarkingTimeSliceType", propOrder = {
    "markingICAOStandard",
    "condition",
    "element",
    "annotation",
    "markingLocation",
    "markedTouchDownLiftOff",
    "extension"
})
@Entity(name = "TouchDownLiftOffMarkingTimeSliceType")
@Table(name = "touchdownliftoffmarking_ts", schema = "airport_heliport")
public class TouchDownLiftOffMarkingTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "markingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> markingICAOStandard;
    @XmlElementRef(name = "condition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> condition;
    @XmlElement(nillable = true)
    protected List<MarkingElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "markingLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTLOFSectionType> markingLocation;
    @XmlElementRef(name = "markedTouchDownLiftOff", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> markedTouchDownLiftOff;
    protected List<TouchDownLiftOffMarkingExtensionType> extension;

    /**
     * Gets the value of the markingICAOStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMarkingICAOStandard() {
        return markingICAOStandard;
    }

    /**
     * Sets the value of the markingICAOStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMarkingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.markingICAOStandard = value;
    }

    @Transient
    public boolean isSetMarkingICAOStandard() {
        return (this.markingICAOStandard!= null);
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMarkingConditionType> getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public void setCondition(JAXBElement<CodeMarkingConditionType> value) {
        this.condition = value;
    }

    @Transient
    public boolean isSetCondition() {
        return (this.condition!= null);
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkingElementPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = MarkingElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "element_touchdownliftoffmarking_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "element", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "touchdownliftoffmarkingpropertygroup", referencedColumnName = "hjid")
    })
    public List<MarkingElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return this.element;
    }

    /**
     * 
     * 
     */
    public void setElement(List<MarkingElementPropertyType> element) {
        this.element = element;
    }

    @Transient
    public boolean isSetElement() {
        return ((this.element!= null)&&(!this.element.isEmpty()));
    }

    public void unsetElement() {
        this.element = null;
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
    @JoinTable(name = "annotation_touchdownliftoffmarking_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "touchdownliftoffmarkingpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the markingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTLOFSectionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTLOFSectionType> getMarkingLocation() {
        return markingLocation;
    }

    /**
     * Sets the value of the markingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTLOFSectionType }{@code >}
     *     
     */
    public void setMarkingLocation(JAXBElement<CodeTLOFSectionType> value) {
        this.markingLocation = value;
    }

    @Transient
    public boolean isSetMarkingLocation() {
        return (this.markingLocation!= null);
    }

    /**
     * Gets the value of the markedTouchDownLiftOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getMarkedTouchDownLiftOff() {
        return markedTouchDownLiftOff;
    }

    /**
     * Sets the value of the markedTouchDownLiftOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setMarkedTouchDownLiftOff(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.markedTouchDownLiftOff = value;
    }

    @Transient
    public boolean isSetMarkedTouchDownLiftOff() {
        return (this.markedTouchDownLiftOff!= null);
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
     * {@link TouchDownLiftOffMarkingExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TouchDownLiftOffMarkingExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<TouchDownLiftOffMarkingExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TouchDownLiftOffMarkingExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "markingicaostandard")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markingicaostandard_nilreason"))
    })
    public CodeYesNoType getMarkingICAOStandardItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMarkingICAOStandard());
    }

    public void setMarkingICAOStandardItem(CodeYesNoType target) {
        setMarkingICAOStandard(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingICAOStandard"), TouchDownLiftOffMarkingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "condition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "condition_nilreason"))
    })
    public CodeMarkingConditionType getConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMarkingConditionType.class, this.getCondition());
    }

    public void setConditionItem(CodeMarkingConditionType target) {
        setCondition(XmlAdapterUtils.marshallJAXBElement(CodeMarkingConditionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "condition"), TouchDownLiftOffMarkingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markinglocation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markinglocation_nilreason"))
    })
    public CodeTLOFSectionType getMarkingLocationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTLOFSectionType.class, this.getMarkingLocation());
    }

    public void setMarkingLocationItem(CodeTLOFSectionType target) {
        setMarkingLocation(XmlAdapterUtils.marshallJAXBElement(CodeTLOFSectionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingLocation"), TouchDownLiftOffMarkingTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "markedtouchdownliftoff_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getMarkedTouchDownLiftOffItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getMarkedTouchDownLiftOff());
    }

    public void setMarkedTouchDownLiftOffItem(TouchDownLiftOffPropertyType target) {
        setMarkedTouchDownLiftOff(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markedTouchDownLiftOff"), TouchDownLiftOffMarkingTimeSliceType.class, target));
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
        final TouchDownLiftOffMarkingTimeSliceType that = ((TouchDownLiftOffMarkingTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetElement();
            boolean rhsFieldIsSet = that.isSetElement();
            List<MarkingElementPropertyType> lhsField;
            lhsField = (this.isSetElement()?this.getElement():null);
            List<MarkingElementPropertyType> rhsField;
            rhsField = (that.isSetElement()?that.getElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "element", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "element", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCondition();
            boolean rhsFieldIsSet = that.isSetCondition();
            JAXBElement<CodeMarkingConditionType> lhsField;
            lhsField = this.getCondition();
            JAXBElement<CodeMarkingConditionType> rhsField;
            rhsField = that.getCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "condition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "condition", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMarkedTouchDownLiftOff();
            boolean rhsFieldIsSet = that.isSetMarkedTouchDownLiftOff();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getMarkedTouchDownLiftOff();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getMarkedTouchDownLiftOff();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markedTouchDownLiftOff", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markedTouchDownLiftOff", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarkingICAOStandard();
            boolean rhsFieldIsSet = that.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMarkingICAOStandard();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMarkingICAOStandard();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingICAOStandard", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingICAOStandard", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TouchDownLiftOffMarkingExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TouchDownLiftOffMarkingExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarkingLocation();
            boolean rhsFieldIsSet = that.isSetMarkingLocation();
            JAXBElement<CodeTLOFSectionType> lhsField;
            lhsField = this.getMarkingLocation();
            JAXBElement<CodeTLOFSectionType> rhsField;
            rhsField = that.getMarkingLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingLocation", rhsField);
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
            boolean theFieldIsSet = this.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMarkingICAOStandard();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingICAOStandard", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            JAXBElement<CodeMarkingConditionType> theField;
            theField = this.getCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "condition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<MarkingElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "element", theField);
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
            boolean theFieldIsSet = this.isSetMarkingLocation();
            JAXBElement<CodeTLOFSectionType> theField;
            theField = this.getMarkingLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkedTouchDownLiftOff();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getMarkedTouchDownLiftOff();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markedTouchDownLiftOff", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TouchDownLiftOffMarkingExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMarkingICAOStandard();
            strategy.appendField(locator, this, "markingICAOStandard", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            JAXBElement<CodeMarkingConditionType> theField;
            theField = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<MarkingElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            strategy.appendField(locator, this, "element", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingLocation();
            JAXBElement<CodeTLOFSectionType> theField;
            theField = this.getMarkingLocation();
            strategy.appendField(locator, this, "markingLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkedTouchDownLiftOff();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getMarkedTouchDownLiftOff();
            strategy.appendField(locator, this, "markedTouchDownLiftOff", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TouchDownLiftOffMarkingExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
