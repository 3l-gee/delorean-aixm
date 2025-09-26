
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ArrayType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}members" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType", propOrder = {
    "members"
})
public class ArrayType
    extends AbstractGMLType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected ArrayAssociationType members;

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayAssociationType }
     *     
     */
    public ArrayAssociationType getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayAssociationType }
     *     
     */
    public void setMembers(ArrayAssociationType value) {
        this.members = value;
    }

    public boolean isSetMembers() {
        return (this.members!= null);
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
        final ArrayType that = ((ArrayType) object);
        {
            boolean lhsFieldIsSet = this.isSetMembers();
            boolean rhsFieldIsSet = that.isSetMembers();
            ArrayAssociationType lhsField;
            lhsField = this.getMembers();
            ArrayAssociationType rhsField;
            rhsField = that.getMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "members", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "members", rhsField);
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
            boolean theFieldIsSet = this.isSetMembers();
            ArrayAssociationType theField;
            theField = this.getMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "members", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMembers();
            ArrayAssociationType theField;
            theField = this.getMembers();
            strategy.appendField(locator, this, "members", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
