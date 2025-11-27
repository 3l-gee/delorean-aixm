
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * The basic feature model is given by the gml:AbstractFeatureType.
 * The content model for gml:AbstractFeatureType adds two specific properties suitable for geographic features to the content model defined in gml:AbstractGMLType. 
 * The value of the gml:boundedBy property describes an envelope that encloses the entire feature instance, and is primarily useful for supporting rapid searching for features that occur in a particular location. 
 * The value of the gml:location property describes the extent, position or relative location of the feature.
 * 
 * <p>Java class for AbstractFeatureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractFeatureType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}location" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "boundedBy",
    "location"
})
@XmlSeeAlso({
    DynamicFeatureType.class,
    AbstractCoverageType.class,
    ObservationType.class,
    AbstractFeatureCollectionType.class,
    BoundedFeatureType.class
})
@MappedSuperclass
public abstract class AbstractFeatureType
    extends AbstractGMLType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * This property describes the minimum bounding box or rectangle that encloses the entire feature.
     * 
     */
    @XmlElement(nillable = true)
    protected BoundingShapeType boundedBy;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;

    /**
     * This property describes the minimum bounding box or rectangle that encloses the entire feature.
     * 
     * @return
     *     possible object is
     *     {@link BoundingShapeType }
     *     
     */
    @Transient
    public BoundingShapeType getBoundedBy() {
        return boundedBy;
    }

    /**
     * Sets the value of the boundedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingShapeType }
     *     
     * @see #getBoundedBy()
     */
    public void setBoundedBy(BoundingShapeType value) {
        this.boundedBy = value;
    }

    @Transient
    public boolean isSetBoundedBy() {
        return (this.boundedBy!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location!= null);
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
        final AbstractFeatureType that = ((AbstractFeatureType) object);
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<? extends LocationPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<? extends LocationPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBoundedBy();
            boolean rhsFieldIsSet = that.isSetBoundedBy();
            BoundingShapeType lhsField;
            lhsField = this.getBoundedBy();
            BoundingShapeType rhsField;
            rhsField = that.getBoundedBy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "boundedBy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "boundedBy", rhsField);
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
            boolean theFieldIsSet = this.isSetBoundedBy();
            BoundingShapeType theField;
            theField = this.getBoundedBy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "boundedBy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<? extends LocationPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBoundedBy();
            BoundingShapeType theField;
            theField = this.getBoundedBy();
            strategy.appendField(locator, this, "boundedBy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<? extends LocationPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
