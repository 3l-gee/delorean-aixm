
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.CascadeType;
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
 * <p>Java class for NonMovementAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NonMovementAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NonMovementAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNonMovementAreaExtension"/>
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
@XmlType(name = "NonMovementAreaTimeSliceType", propOrder = {
    "associatedAirportHeliport",
    "extent",
    "annotation",
    "extension"
})
@Entity(name = "NonMovementAreaTimeSliceType")
@Table(name = "nonmovementarea_ts", schema = "airport_heliport")
public class NonMovementAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NonMovementAreaExtensionType> extension;

    /**
     * Gets the value of the associatedAirportHeliport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirportHeliport() {
        return associatedAirportHeliport;
    }

    /**
     * Sets the value of the associatedAirportHeliport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAssociatedAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirportHeliport = value;
    }

    @Transient
    public boolean isSetAssociatedAirportHeliport() {
        return (this.associatedAirportHeliport!= null);
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedSurfacePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<AIXMElevatedSurfacePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent!= null);
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
    @JoinTable(name = "annotation_nonmovementarea_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "nonmovementareapropertygroup", referencedColumnName = "hjid")
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
     * {@link NonMovementAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NonMovementAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<NonMovementAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NonMovementAreaExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "associatedairportheliport_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getAssociatedAirportHeliportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAssociatedAirportHeliport());
    }

    public void setAssociatedAirportHeliportItem(AirportHeliportPropertyType target) {
        setAssociatedAirportHeliport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "associatedAirportHeliport"), NonMovementAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_id", referencedColumnName = "hjid")
    public AIXMElevatedSurfacePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedSurfacePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMElevatedSurfacePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent"), NonMovementAreaTimeSliceType.class, target));
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
        final NonMovementAreaTimeSliceType that = ((NonMovementAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAssociatedAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getAssociatedAirportHeliport();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedAirportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedAirportHeliport", rhsField);
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
            List<NonMovementAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NonMovementAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> rhsField;
            rhsField = that.getExtent();
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
            boolean theFieldIsSet = this.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirportHeliport();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedAirportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtent();
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
            List<NonMovementAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAssociatedAirportHeliport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirportHeliport();
            strategy.appendField(locator, this, "associatedAirportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtent();
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
            List<NonMovementAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
