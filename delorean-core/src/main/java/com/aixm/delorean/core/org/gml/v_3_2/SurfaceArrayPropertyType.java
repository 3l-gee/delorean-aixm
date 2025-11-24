
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * gml:SurfaceArrayPropertyType is a container for an array of surfaces. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 * 
 * <p>Java class for SurfaceArrayPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceArrayPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractSurface"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceArrayPropertyType", propOrder = {
    "abstractSurface"
})
public class SurfaceArrayPropertyType implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "AbstractSurface", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractSurfaceType>> abstractSurface;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSurfaceType>> getAbstractSurface() {
        if (abstractSurface == null) {
            abstractSurface = new ArrayList<>();
        }
        return this.abstractSurface;
    }

    /**
     * 
     * 
     */
    public void setAbstractSurface(List<JAXBElement<? extends AbstractSurfaceType>> abstractSurface) {
        this.abstractSurface = abstractSurface;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfaceArrayPropertyType that = ((SurfaceArrayPropertyType) object);
        {
            boolean lhsFieldIsSet = (this.owns!= null);
            boolean rhsFieldIsSet = (that.owns!= null);
            java.lang.Boolean lhsField;
            lhsField = this.getOwns();
            java.lang.Boolean rhsField;
            rhsField = that.getOwns();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()));
            boolean rhsFieldIsSet = ((that.abstractSurface!= null)&&(!that.abstractSurface.isEmpty()));
            List<JAXBElement<? extends AbstractSurfaceType>> lhsField;
            lhsField = (((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()))?this.getAbstractSurface():null);
            List<JAXBElement<? extends AbstractSurfaceType>> rhsField;
            rhsField = (((that.abstractSurface!= null)&&(!that.abstractSurface.isEmpty()))?that.getAbstractSurface():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSurface", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = ((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()));
            List<JAXBElement<? extends AbstractSurfaceType>> theField;
            theField = (((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()))?this.getAbstractSurface():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSurface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.owns!= null);
            java.lang.Boolean theField;
            theField = this.getOwns();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "owns", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = ((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()));
            List<JAXBElement<? extends AbstractSurfaceType>> theField;
            theField = (((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()))?this.getAbstractSurface():null);
            strategy.appendField(locator, this, "abstractSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.owns!= null);
            java.lang.Boolean theField;
            theField = this.getOwns();
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
