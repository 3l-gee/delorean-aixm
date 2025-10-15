
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ValueArrayType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValueArrayType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}CompositeValueType">
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}referenceSystem"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueArrayType")
public class ValueArrayType
    extends CompositeValueType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "codeSpace")
    @XmlSchemaType(name = "anyURI")
    protected String codeSpace;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Gets the value of the codeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSpace() {
        return codeSpace;
    }

    /**
     * Sets the value of the codeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSpace(String value) {
        this.codeSpace = value;
    }

    public boolean isSetCodeSpace() {
        return (this.codeSpace!= null);
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
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
        final ValueArrayType that = ((ValueArrayType) object);
        {
            boolean lhsFieldIsSet = this.isSetUom();
            boolean rhsFieldIsSet = that.isSetUom();
            String lhsField;
            lhsField = this.getUom();
            String rhsField;
            rhsField = that.getUom();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uom", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uom", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeSpace();
            boolean rhsFieldIsSet = that.isSetCodeSpace();
            String lhsField;
            lhsField = this.getCodeSpace();
            String rhsField;
            rhsField = that.getCodeSpace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeSpace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeSpace", rhsField);
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
            boolean theFieldIsSet = this.isSetCodeSpace();
            String theField;
            theField = this.getCodeSpace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeSpace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUom();
            String theField;
            theField = this.getUom();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uom", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCodeSpace();
            String theField;
            theField = this.getCodeSpace();
            strategy.appendField(locator, this, "codeSpace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUom();
            String theField;
            theField = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
