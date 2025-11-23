
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DefinitionProxyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DefinitionProxyType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}definitionRef"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionProxyType", propOrder = {
    "definitionRef"
})
public class DefinitionProxyType
    extends DefinitionType
{

    @XmlElement(required = true)
    protected ReferenceType definitionRef;

    /**
     * Gets the value of the definitionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefinitionRef() {
        return definitionRef;
    }

    /**
     * Sets the value of the definitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefinitionRef(ReferenceType value) {
        this.definitionRef = value;
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
        final DefinitionProxyType that = ((DefinitionProxyType) object);
        {
            boolean lhsFieldIsSet = (this.definitionRef!= null);
            boolean rhsFieldIsSet = (that.definitionRef!= null);
            ReferenceType lhsField;
            lhsField = this.getDefinitionRef();
            ReferenceType rhsField;
            rhsField = that.getDefinitionRef();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "definitionRef", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "definitionRef", rhsField);
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
            boolean theFieldIsSet = (this.definitionRef!= null);
            ReferenceType theField;
            theField = this.getDefinitionRef();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "definitionRef", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.definitionRef!= null);
            ReferenceType theField;
            theField = this.getDefinitionRef();
            strategy.appendField(locator, this, "definitionRef", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
