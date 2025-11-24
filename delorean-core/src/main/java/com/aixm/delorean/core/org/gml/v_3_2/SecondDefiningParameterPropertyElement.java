
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameter"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondDefiningParameter"
})
@XmlRootElement(name = "SecondDefiningParameterPropertyElement")
public class SecondDefiningParameterPropertyElement implements Equals, HashCode, ToString
{

    @XmlElement(name = "SecondDefiningParameter", required = true)
    protected SecondDefiningParameter secondDefiningParameter;

    /**
     * Gets the value of the secondDefiningParameter property.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public SecondDefiningParameter getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * Sets the value of the secondDefiningParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameter value) {
        this.secondDefiningParameter = value;
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
        final SecondDefiningParameterPropertyElement that = ((SecondDefiningParameterPropertyElement) object);
        {
            boolean lhsFieldIsSet = (this.secondDefiningParameter!= null);
            boolean rhsFieldIsSet = (that.secondDefiningParameter!= null);
            SecondDefiningParameter lhsField;
            lhsField = this.getSecondDefiningParameter();
            SecondDefiningParameter rhsField;
            rhsField = that.getSecondDefiningParameter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "secondDefiningParameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "secondDefiningParameter", rhsField);
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
            boolean theFieldIsSet = (this.secondDefiningParameter!= null);
            SecondDefiningParameter theField;
            theField = this.getSecondDefiningParameter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "secondDefiningParameter", theField);
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
            boolean theFieldIsSet = (this.secondDefiningParameter!= null);
            SecondDefiningParameter theField;
            theField = this.getSecondDefiningParameter();
            strategy.appendField(locator, this, "secondDefiningParameter", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
