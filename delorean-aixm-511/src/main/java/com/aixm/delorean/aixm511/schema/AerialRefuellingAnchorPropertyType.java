
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
 * <p>Java class for AerialRefuellingAnchorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingAnchorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingAnchor"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingAnchorPropertyType", propOrder = {
    "aerialRefuellingAnchor"
})
@Entity(name = "AerialRefuellingAnchorPropertyType")
@Table(name = "aerialrefuellinganchor_pt", schema = "aerial_refuelling")
public class AerialRefuellingAnchorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AerialRefuellingAnchor", required = true)
    protected AerialRefuellingAnchorType aerialRefuellingAnchor;

    /**
     * Gets the value of the aerialRefuellingAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingAnchorType }
     *     
     */
    @OneToOne(targetEntity = AerialRefuellingAnchorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aerialrefuellinganchor_id", referencedColumnName = "hjid")
    public AerialRefuellingAnchorType getAerialRefuellingAnchor() {
        return aerialRefuellingAnchor;
    }

    /**
     * Sets the value of the aerialRefuellingAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingAnchorType }
     *     
     */
    public void setAerialRefuellingAnchor(AerialRefuellingAnchorType value) {
        this.aerialRefuellingAnchor = value;
    }

    @Transient
    public boolean isSetAerialRefuellingAnchor() {
        return (this.aerialRefuellingAnchor!= null);
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
        final AerialRefuellingAnchorPropertyType that = ((AerialRefuellingAnchorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAerialRefuellingAnchor();
            boolean rhsFieldIsSet = that.isSetAerialRefuellingAnchor();
            AerialRefuellingAnchorType lhsField;
            lhsField = this.getAerialRefuellingAnchor();
            AerialRefuellingAnchorType rhsField;
            rhsField = that.getAerialRefuellingAnchor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aerialRefuellingAnchor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aerialRefuellingAnchor", rhsField);
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
            boolean theFieldIsSet = this.isSetAerialRefuellingAnchor();
            AerialRefuellingAnchorType theField;
            theField = this.getAerialRefuellingAnchor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aerialRefuellingAnchor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAerialRefuellingAnchor();
            AerialRefuellingAnchorType theField;
            theField = this.getAerialRefuellingAnchor();
            strategy.appendField(locator, this, "aerialRefuellingAnchor", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
