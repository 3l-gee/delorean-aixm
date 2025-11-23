
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractTimeTopologyPrimitiveType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractTimeTopologyPrimitiveType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimePrimitiveType">
 *       <sequence>
 *         <element name="complex" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeTopologyPrimitiveType", propOrder = {
    "complex"
})
@XmlSeeAlso({
    TimeNodeType.class,
    TimeEdgeType.class
})
public abstract class AbstractTimeTopologyPrimitiveType
    extends AbstractTimePrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected ReferenceType complex;

    /**
     * Gets the value of the complex property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getComplex() {
        return complex;
    }

    /**
     * Sets the value of the complex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setComplex(ReferenceType value) {
        this.complex = value;
    }

    public boolean isSetComplex() {
        return (this.complex!= null);
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
        final AbstractTimeTopologyPrimitiveType that = ((AbstractTimeTopologyPrimitiveType) object);
        {
            boolean lhsFieldIsSet = this.isSetComplex();
            boolean rhsFieldIsSet = that.isSetComplex();
            ReferenceType lhsField;
            lhsField = this.getComplex();
            ReferenceType rhsField;
            rhsField = that.getComplex();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "complex", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "complex", rhsField);
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
            boolean theFieldIsSet = this.isSetComplex();
            ReferenceType theField;
            theField = this.getComplex();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "complex", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetComplex();
            ReferenceType theField;
            theField = this.getComplex();
            strategy.appendField(locator, this, "complex", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
