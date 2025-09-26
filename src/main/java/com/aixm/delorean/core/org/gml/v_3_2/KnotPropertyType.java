
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * gml:KnotPropertyType encapsulates a knot to use it in a geometric type.
 * 
 * <p>Java class for KnotPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KnotPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Knot" type="{http://www.opengis.net/gml/3.2}KnotType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotPropertyType", propOrder = {
    "knot"
})
public class KnotPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    /**
     * A knot is a breakpoint on a piecewise spline curve.
     * value is the value of the parameter at the knot of the spline (see ISO 19107:2003, 6.4.24.2).
     * multiplicity is the multiplicity of this knot used in the definition of the spline (with the same weight).
     * weight is the value of the averaging weight used for this knot of the spline.
     * 
     */
    @XmlElement(name = "Knot", required = true)
    protected KnotType knot;

    /**
     * A knot is a breakpoint on a piecewise spline curve.
     * value is the value of the parameter at the knot of the spline (see ISO 19107:2003, 6.4.24.2).
     * multiplicity is the multiplicity of this knot used in the definition of the spline (with the same weight).
     * weight is the value of the averaging weight used for this knot of the spline.
     * 
     * @return
     *     possible object is
     *     {@link KnotType }
     *     
     */
    public KnotType getKnot() {
        return knot;
    }

    /**
     * Sets the value of the knot property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotType }
     *     
     * @see #getKnot()
     */
    public void setKnot(KnotType value) {
        this.knot = value;
    }

    public boolean isSetKnot() {
        return (this.knot!= null);
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
        final KnotPropertyType that = ((KnotPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetKnot();
            boolean rhsFieldIsSet = that.isSetKnot();
            KnotType lhsField;
            lhsField = this.getKnot();
            KnotType rhsField;
            rhsField = that.getKnot();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "knot", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "knot", rhsField);
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
            boolean theFieldIsSet = this.isSetKnot();
            KnotType theField;
            theField = this.getKnot();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "knot", theField);
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
            boolean theFieldIsSet = this.isSetKnot();
            KnotType theField;
            theField = this.getKnot();
            strategy.appendField(locator, this, "knot", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
