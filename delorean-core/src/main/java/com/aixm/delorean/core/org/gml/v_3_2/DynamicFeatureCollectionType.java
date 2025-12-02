
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for DynamicFeatureCollectionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DynamicFeatureCollectionType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}dynamicMembers"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "dynamicMembers"
})
public class DynamicFeatureCollectionType
    extends DynamicFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected DynamicFeatureMemberType dynamicMembers;

    /**
     * Gets the value of the dynamicMembers property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public DynamicFeatureMemberType getDynamicMembers() {
        return dynamicMembers;
    }

    /**
     * Sets the value of the dynamicMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public void setDynamicMembers(DynamicFeatureMemberType value) {
        this.dynamicMembers = value;
    }

    public boolean isSetDynamicMembers() {
        return (this.dynamicMembers!= null);
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
        final DynamicFeatureCollectionType that = ((DynamicFeatureCollectionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDynamicMembers();
            boolean rhsFieldIsSet = that.isSetDynamicMembers();
            DynamicFeatureMemberType lhsField;
            lhsField = this.getDynamicMembers();
            DynamicFeatureMemberType rhsField;
            rhsField = that.getDynamicMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dynamicMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dynamicMembers", rhsField);
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
            boolean theFieldIsSet = this.isSetDynamicMembers();
            DynamicFeatureMemberType theField;
            theField = this.getDynamicMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dynamicMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDynamicMembers();
            DynamicFeatureMemberType theField;
            theField = this.getDynamicMembers();
            strategy.appendField(locator, this, "dynamicMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
