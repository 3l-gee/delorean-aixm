
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for DefinitionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DefinitionType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionBaseType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}remarks" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionType", propOrder = {
    "remarks"
})
@XmlSeeAlso({
    DictionaryType.class,
    UnitDefinitionType.class,
    TimeCalendarEraType.class,
    TimeReferenceSystemType.class,
    TimeOrdinalEraType.class,
    DefinitionProxyType.class,
    IdentifiedObjectType.class
})
public class DefinitionType
    extends DefinitionBaseType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected String remarks;

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
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
        final DefinitionType that = ((DefinitionType) object);
        {
            boolean lhsFieldIsSet = this.isSetRemarks();
            boolean rhsFieldIsSet = that.isSetRemarks();
            String lhsField;
            lhsField = this.getRemarks();
            String rhsField;
            rhsField = that.getRemarks();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "remarks", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "remarks", rhsField);
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
            boolean theFieldIsSet = this.isSetRemarks();
            String theField;
            theField = this.getRemarks();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "remarks", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRemarks();
            String theField;
            theField = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
