
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractGeneralOperationParameterType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGeneralOperationParameterType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}minimumOccurs" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralOperationParameterType", propOrder = {
    "minimumOccurs"
})
@XmlSeeAlso({
    OperationParameterType.class,
    OperationParameterGroupType.class
})
public abstract class AbstractGeneralOperationParameterType
    extends IdentifiedObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * gml:minimumOccurs is the minimum number of times that values for this parameter group or parameter are required. If this attribute is omitted, the minimum number shall be one.
     * 
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumOccurs;

    /**
     * gml:minimumOccurs is the minimum number of times that values for this parameter group or parameter are required. If this attribute is omitted, the minimum number shall be one.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumOccurs() {
        return minimumOccurs;
    }

    /**
     * Sets the value of the minimumOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinimumOccurs()
     */
    public void setMinimumOccurs(BigInteger value) {
        this.minimumOccurs = value;
    }

    public boolean isSetMinimumOccurs() {
        return (this.minimumOccurs!= null);
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
        final AbstractGeneralOperationParameterType that = ((AbstractGeneralOperationParameterType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinimumOccurs();
            boolean rhsFieldIsSet = that.isSetMinimumOccurs();
            BigInteger lhsField;
            lhsField = this.getMinimumOccurs();
            BigInteger rhsField;
            rhsField = that.getMinimumOccurs();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumOccurs", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumOccurs", rhsField);
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
            boolean theFieldIsSet = this.isSetMinimumOccurs();
            BigInteger theField;
            theField = this.getMinimumOccurs();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumOccurs", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMinimumOccurs();
            BigInteger theField;
            theField = this.getMinimumOccurs();
            strategy.appendField(locator, this, "minimumOccurs", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
