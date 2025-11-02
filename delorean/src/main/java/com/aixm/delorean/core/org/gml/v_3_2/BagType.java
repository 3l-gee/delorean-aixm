
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
 * <p>Java class for BagType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BagType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}member" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BagType", propOrder = {
    "member",
    "members"
})
public class BagType
    extends AbstractGMLType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<AssociationRoleType> member;
    protected ArrayAssociationType members;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationRoleType }
     * 
     * 
     */
    public List<AssociationRoleType> getMember() {
        if (member == null) {
            member = new ArrayList<>();
        }
        return this.member;
    }

    /**
     * 
     * 
     */
    public void setMember(List<AssociationRoleType> member) {
        this.member = member;
    }

    public boolean isSetMember() {
        return ((this.member!= null)&&(!this.member.isEmpty()));
    }

    public void unsetMember() {
        this.member = null;
    }

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
        final BagType that = ((BagType) object);
        {
            boolean lhsFieldIsSet = this.isSetMember();
            boolean rhsFieldIsSet = that.isSetMember();
            List<AssociationRoleType> lhsField;
            lhsField = (this.isSetMember()?this.getMember():null);
            List<AssociationRoleType> rhsField;
            rhsField = (that.isSetMember()?that.getMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "member", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "member", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean theFieldIsSet = this.isSetMember();
            List<AssociationRoleType> theField;
            theField = (this.isSetMember()?this.getMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "member", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetMember();
            List<AssociationRoleType> theField;
            theField = (this.isSetMember()?this.getMember():null);
            strategy.appendField(locator, this, "member", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMembers();
            ArrayAssociationType theField;
            theField = this.getMembers();
            strategy.appendField(locator, this, "members", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
