
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
 * <p>Java class for RidgePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RidgePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Ridge"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RidgePropertyType", propOrder = {
    "ridge"
})
@Entity(name = "RidgePropertyType")
@Table(name = "ridge_pt", schema = "airport_heliport")
public class RidgePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Ridge", required = true)
    protected RidgeType ridge;

    /**
     * Gets the value of the ridge property.
     * 
     * @return
     *     possible object is
     *     {@link RidgeType }
     *     
     */
    @OneToOne(targetEntity = RidgeType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ridge_id", referencedColumnName = "hjid")
    public RidgeType getRidge() {
        return ridge;
    }

    /**
     * Sets the value of the ridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link RidgeType }
     *     
     */
    public void setRidge(RidgeType value) {
        this.ridge = value;
    }

    @Transient
    public boolean isSetRidge() {
        return (this.ridge!= null);
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
        final RidgePropertyType that = ((RidgePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRidge();
            boolean rhsFieldIsSet = that.isSetRidge();
            RidgeType lhsField;
            lhsField = this.getRidge();
            RidgeType rhsField;
            rhsField = that.getRidge();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ridge", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ridge", rhsField);
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
            boolean theFieldIsSet = this.isSetRidge();
            RidgeType theField;
            theField = this.getRidge();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ridge", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRidge();
            RidgeType theField;
            theField = this.getRidge();
            strategy.appendField(locator, this, "ridge", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
