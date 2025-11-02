
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for TopoSurfacePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TopoSurfacePropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}TopoSurface"/>
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
@XmlType(name = "TopoSurfacePropertyType", propOrder = {
    "topoSurface"
})
public class TopoSurfacePropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:TopoSurface represents a homogeneous topological expression, a set of directed faces, which if realised are isomorphic to a geometric surface primitive. The intended use of gml:TopoSurface is to appear within a surface feature to express the structural and possibly geometric relationships of this surface feature to other features via the shared face definitions.
     * 
     */
    @XmlElement(name = "TopoSurface", required = true)
    protected TopoSurfaceType topoSurface;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * gml:TopoSurface represents a homogeneous topological expression, a set of directed faces, which if realised are isomorphic to a geometric surface primitive. The intended use of gml:TopoSurface is to appear within a surface feature to express the structural and possibly geometric relationships of this surface feature to other features via the shared face definitions.
     * 
     * @return
     *     possible object is
     *     {@link TopoSurfaceType }
     *     
     */
    public TopoSurfaceType getTopoSurface() {
        return topoSurface;
    }

    /**
     * Sets the value of the topoSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoSurfaceType }
     *     
     * @see #getTopoSurface()
     */
    public void setTopoSurface(TopoSurfaceType value) {
        this.topoSurface = value;
    }

    public boolean isSetTopoSurface() {
        return (this.topoSurface!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean getOwns() {
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
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
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
        final TopoSurfacePropertyType that = ((TopoSurfacePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTopoSurface();
            boolean rhsFieldIsSet = that.isSetTopoSurface();
            TopoSurfaceType lhsField;
            lhsField = this.getTopoSurface();
            TopoSurfaceType rhsField;
            rhsField = that.getTopoSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topoSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topoSurface", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOwns();
            boolean rhsFieldIsSet = that.isSetOwns();
            boolean lhsField;
            lhsField = (this.isSetOwns()?this.getOwns():false);
            boolean rhsField;
            rhsField = (that.isSetOwns()?that.getOwns():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
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
            boolean theFieldIsSet = this.isSetTopoSurface();
            TopoSurfaceType theField;
            theField = this.getTopoSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topoSurface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
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
            boolean theFieldIsSet = this.isSetTopoSurface();
            TopoSurfaceType theField;
            theField = this.getTopoSurface();
            strategy.appendField(locator, this, "topoSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
