
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
 * <p>Java class for NavaidComponentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidComponentType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NavaidComponentPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNavaidComponentExtension"/>
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
@XmlType(name = "NavaidComponentType", propOrder = {
    "collocationGroup",
    "markerPosition",
    "providesNavigableLocation",
    "annotation",
    "theNavaidEquipment",
    "extension"
})
@Entity(name = "NavaidComponentType")
@Table(name = "navaidcomponent", schema = "navaids_point")
public class NavaidComponentType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "collocationGroup", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> collocationGroup;
    @XmlElementRef(name = "markerPosition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePositionInILSType> markerPosition;
    @XmlElementRef(name = "providesNavigableLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> providesNavigableLocation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected NavaidEquipmentPropertyType theNavaidEquipment;
    protected List<NavaidComponentTypeExtensionType> extension;

    /**
     * Gets the value of the collocationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getCollocationGroup() {
        return collocationGroup;
    }

    /**
     * Sets the value of the collocationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setCollocationGroup(JAXBElement<NoSequenceType> value) {
        this.collocationGroup = value;
    }

    @Transient
    public boolean isSetCollocationGroup() {
        return (this.collocationGroup!= null);
    }

    /**
     * Gets the value of the markerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePositionInILSType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePositionInILSType> getMarkerPosition() {
        return markerPosition;
    }

    /**
     * Sets the value of the markerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePositionInILSType }{@code >}
     *     
     */
    public void setMarkerPosition(JAXBElement<CodePositionInILSType> value) {
        this.markerPosition = value;
    }

    @Transient
    public boolean isSetMarkerPosition() {
        return (this.markerPosition!= null);
    }

    /**
     * Gets the value of the providesNavigableLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getProvidesNavigableLocation() {
        return providesNavigableLocation;
    }

    /**
     * Sets the value of the providesNavigableLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setProvidesNavigableLocation(JAXBElement<CodeYesNoType> value) {
        this.providesNavigableLocation = value;
    }

    @Transient
    public boolean isSetProvidesNavigableLocation() {
        return (this.providesNavigableLocation!= null);
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
     * Gets the value of the theNavaidEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentPropertyType }
     *     
     */
    @OneToOne(targetEntity = NavaidEquipmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "thenavaidequipment_id", referencedColumnName = "hjid")
    public NavaidEquipmentPropertyType getTheNavaidEquipment() {
        return theNavaidEquipment;
    }

    /**
     * Sets the value of the theNavaidEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentPropertyType }
     *     
     */
    public void setTheNavaidEquipment(NavaidEquipmentPropertyType value) {
        this.theNavaidEquipment = value;
    }

    @Transient
    public boolean isSetTheNavaidEquipment() {
        return (this.theNavaidEquipment!= null);
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
     * {@link NavaidComponentTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NavaidComponentTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_NAVAID_COMPONENT_T_0")
    public List<NavaidComponentTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NavaidComponentTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "collocationgroup")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "collocationgroup_nilreason"))
    })
    public NoSequenceType getCollocationGroupItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getCollocationGroup());
    }

    public void setCollocationGroupItem(NoSequenceType target) {
        setCollocationGroup(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "collocationGroup"), NavaidComponentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markerposition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markerposition_nilreason"))
    })
    public CodePositionInILSType getMarkerPositionItem() {
        return XmlAdapterUtils.unmarshallSource(CodePositionInILSType.class, this.getMarkerPosition());
    }

    public void setMarkerPositionItem(CodePositionInILSType target) {
        setMarkerPosition(XmlAdapterUtils.marshallJAXBElement(CodePositionInILSType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markerPosition"), NavaidComponentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "providesnavigablelocation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "providesnavigablelocation_nilreason"))
    })
    public CodeYesNoType getProvidesNavigableLocationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getProvidesNavigableLocation());
    }

    public void setProvidesNavigableLocationItem(CodeYesNoType target) {
        setProvidesNavigableLocation(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "providesNavigableLocation"), NavaidComponentType.class, target));
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
        final NavaidComponentType that = ((NavaidComponentType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<NavaidComponentTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NavaidComponentTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCollocationGroup();
            boolean rhsFieldIsSet = that.isSetCollocationGroup();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getCollocationGroup();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getCollocationGroup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "collocationGroup", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "collocationGroup", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetProvidesNavigableLocation();
            boolean rhsFieldIsSet = that.isSetProvidesNavigableLocation();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getProvidesNavigableLocation();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getProvidesNavigableLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "providesNavigableLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "providesNavigableLocation", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMarkerPosition();
            boolean rhsFieldIsSet = that.isSetMarkerPosition();
            JAXBElement<CodePositionInILSType> lhsField;
            lhsField = this.getMarkerPosition();
            JAXBElement<CodePositionInILSType> rhsField;
            rhsField = that.getMarkerPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markerPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markerPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTheNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetTheNavaidEquipment();
            NavaidEquipmentPropertyType lhsField;
            lhsField = this.getTheNavaidEquipment();
            NavaidEquipmentPropertyType rhsField;
            rhsField = that.getTheNavaidEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "theNavaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "theNavaidEquipment", rhsField);
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
            boolean theFieldIsSet = this.isSetCollocationGroup();
            JAXBElement<NoSequenceType> theField;
            theField = this.getCollocationGroup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "collocationGroup", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkerPosition();
            JAXBElement<CodePositionInILSType> theField;
            theField = this.getMarkerPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markerPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProvidesNavigableLocation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProvidesNavigableLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "providesNavigableLocation", theField);
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
            boolean theFieldIsSet = this.isSetTheNavaidEquipment();
            NavaidEquipmentPropertyType theField;
            theField = this.getTheNavaidEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "theNavaidEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NavaidComponentTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetCollocationGroup();
            JAXBElement<NoSequenceType> theField;
            theField = this.getCollocationGroup();
            strategy.appendField(locator, this, "collocationGroup", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkerPosition();
            JAXBElement<CodePositionInILSType> theField;
            theField = this.getMarkerPosition();
            strategy.appendField(locator, this, "markerPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProvidesNavigableLocation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProvidesNavigableLocation();
            strategy.appendField(locator, this, "providesNavigableLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheNavaidEquipment();
            NavaidEquipmentPropertyType theField;
            theField = this.getTheNavaidEquipment();
            strategy.appendField(locator, this, "theNavaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NavaidComponentTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
