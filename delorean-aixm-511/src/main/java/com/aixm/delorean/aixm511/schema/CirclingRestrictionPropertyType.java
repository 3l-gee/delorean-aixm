
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
 * <p>Java class for CirclingRestrictionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CirclingRestrictionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}CirclingRestriction"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CirclingRestrictionPropertyType", propOrder = {
    "circlingRestriction"
})
@Entity(name = "CirclingRestrictionPropertyType")
@Table(name = "circlingrestriction_pt", schema = "procedure")
public class CirclingRestrictionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "CirclingRestriction", required = true)
    protected CirclingRestrictionType circlingRestriction;

    /**
     * Gets the value of the circlingRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link CirclingRestrictionType }
     *     
     */
    @OneToOne(targetEntity = CirclingRestrictionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "circlingrestriction_id", referencedColumnName = "hjid")
    public CirclingRestrictionType getCirclingRestriction() {
        return circlingRestriction;
    }

    /**
     * Sets the value of the circlingRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirclingRestrictionType }
     *     
     */
    public void setCirclingRestriction(CirclingRestrictionType value) {
        this.circlingRestriction = value;
    }

    @Transient
    public boolean isSetCirclingRestriction() {
        return (this.circlingRestriction!= null);
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
        final CirclingRestrictionPropertyType that = ((CirclingRestrictionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetCirclingRestriction();
            boolean rhsFieldIsSet = that.isSetCirclingRestriction();
            CirclingRestrictionType lhsField;
            lhsField = this.getCirclingRestriction();
            CirclingRestrictionType rhsField;
            rhsField = that.getCirclingRestriction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "circlingRestriction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "circlingRestriction", rhsField);
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
            boolean theFieldIsSet = this.isSetCirclingRestriction();
            CirclingRestrictionType theField;
            theField = this.getCirclingRestriction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "circlingRestriction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCirclingRestriction();
            CirclingRestrictionType theField;
            theField = this.getCirclingRestriction();
            strategy.appendField(locator, this, "circlingRestriction", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
