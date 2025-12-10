
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MultiSolidType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiSolidType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}solidMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}solidMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSolidType", propOrder = {
    "solidMember",
    "solidMembers"
})
public class MultiSolidType
    extends AbstractGeometricAggregateType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected List<SolidPropertyType> solidMember;
    /**
     * This property element contains a list of solids. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    protected SolidArrayPropertyType solidMembers;

    /**
     * This property element either references a solid via the XLink-attributes or contains the solid element. A solid element is any element, which is substitutable for gml:AbstractSolid.Gets the value of the solidMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solidMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolidMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolidPropertyType }
     * 
     * 
     */
    public List<SolidPropertyType> getSolidMember() {
        if (solidMember == null) {
            solidMember = new ArrayList<>();
        }
        return this.solidMember;
    }

    /**
     * This property element either references a solid via the XLink-attributes or contains the solid element. A solid element is any element, which is substitutable for gml:AbstractSolid.
     * 
     */
    public void setSolidMember(List<SolidPropertyType> solidMember) {
        this.solidMember = solidMember;
    }

    public boolean isSetSolidMember() {
        return ((this.solidMember!= null)&&(!this.solidMember.isEmpty()));
    }

    public void unsetSolidMember() {
        this.solidMember = null;
    }

    /**
     * This property element contains a list of solids. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link SolidArrayPropertyType }
     *     
     */
    public SolidArrayPropertyType getSolidMembers() {
        return solidMembers;
    }

    /**
     * Sets the value of the solidMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidArrayPropertyType }
     *     
     * @see #getSolidMembers()
     */
    public void setSolidMembers(SolidArrayPropertyType value) {
        this.solidMembers = value;
    }

    public boolean isSetSolidMembers() {
        return (this.solidMembers!= null);
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
        final MultiSolidType that = ((MultiSolidType) object);
        {
            boolean lhsFieldIsSet = this.isSetSolidMember();
            boolean rhsFieldIsSet = that.isSetSolidMember();
            List<SolidPropertyType> lhsField;
            lhsField = (this.isSetSolidMember()?this.getSolidMember():null);
            List<SolidPropertyType> rhsField;
            rhsField = (that.isSetSolidMember()?that.getSolidMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "solidMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "solidMember", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSolidMembers();
            boolean rhsFieldIsSet = that.isSetSolidMembers();
            SolidArrayPropertyType lhsField;
            lhsField = this.getSolidMembers();
            SolidArrayPropertyType rhsField;
            rhsField = that.getSolidMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "solidMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "solidMembers", rhsField);
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
            boolean theFieldIsSet = this.isSetSolidMember();
            List<SolidPropertyType> theField;
            theField = (this.isSetSolidMember()?this.getSolidMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "solidMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSolidMembers();
            SolidArrayPropertyType theField;
            theField = this.getSolidMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "solidMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSolidMember();
            List<SolidPropertyType> theField;
            theField = (this.isSetSolidMember()?this.getSolidMember():null);
            strategy.appendField(locator, this, "solidMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSolidMembers();
            SolidArrayPropertyType theField;
            theField = this.getSolidMembers();
            strategy.appendField(locator, this, "solidMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
