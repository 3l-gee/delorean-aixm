
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
 * <p>Java class for RidgeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RidgeType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RidgePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRidgeExtension"/>
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
@XmlType(name = "RidgeType", propOrder = {
    "side",
    "distance",
    "depth",
    "annotation",
    "extension"
})
@Entity(name = "RidgeType")
@Table(name = "ridge", schema = "airport_heliport")
public class RidgeType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "side", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> side;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "depth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDepthType> depth;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RidgeTypeExtensionType> extension;

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setSide(JAXBElement<CodeSideType> value) {
        this.side = value;
    }

    @Transient
    public boolean isSetSide() {
        return (this.side!= null);
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<ValDistanceType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDepthType> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public void setDepth(JAXBElement<ValDepthType> value) {
        this.depth = value;
    }

    @Transient
    public boolean isSetDepth() {
        return (this.depth!= null);
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
    @JoinTable(name = "annotation_ridge_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "ridgepropertygroup", referencedColumnName = "hjid")
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
     * {@link RidgeTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RidgeTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RidgeTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RidgeTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "side")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "side_nilreason"))
    })
    public CodeSideType getSideItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getSide());
    }

    public void setSideItem(CodeSideType target) {
        setSide(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "side"), RidgeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "distance")),
        @AttributeOverride(name = "uom", column = @Column(name = "distance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "distance_nilreason"))
    })
    public ValDistanceType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDistance());
    }

    public void setDistanceItem(ValDistanceType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "distance"), RidgeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "depth")),
        @AttributeOverride(name = "uom", column = @Column(name = "depth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "depth_nilreason"))
    })
    public ValDepthType getDepthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDepthType.class, this.getDepth());
    }

    public void setDepthItem(ValDepthType target) {
        setDepth(XmlAdapterUtils.marshallJAXBElement(ValDepthType.class, new QName("http://www.aixm.aero/schema/5.1.1", "depth"), RidgeType.class, target));
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
        final RidgeType that = ((RidgeType) object);
        {
            boolean lhsFieldIsSet = this.isSetSide();
            boolean rhsFieldIsSet = that.isSetSide();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getSide();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getSide();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "side", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "side", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDepth();
            boolean rhsFieldIsSet = that.isSetDepth();
            JAXBElement<ValDepthType> lhsField;
            lhsField = this.getDepth();
            JAXBElement<ValDepthType> rhsField;
            rhsField = that.getDepth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "depth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "depth", rhsField);
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
            List<RidgeTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RidgeTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
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
            boolean theFieldIsSet = this.isSetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getSide();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "side", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDepthType> theField;
            theField = this.getDepth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "depth", theField);
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
            List<RidgeTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepth();
            JAXBElement<ValDepthType> theField;
            theField = this.getDepth();
            strategy.appendField(locator, this, "depth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RidgeTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
