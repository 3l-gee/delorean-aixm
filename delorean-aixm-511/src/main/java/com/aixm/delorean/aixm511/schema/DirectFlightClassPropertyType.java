
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
 * <p>Java class for DirectFlightClassPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectFlightClassPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}DirectFlightClass"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightClassPropertyType", propOrder = {
    "directFlightClass"
})
@Entity(name = "DirectFlightClassPropertyType")
@Table(name = "directflightclass_pt", schema = "route")
public class DirectFlightClassPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "DirectFlightClass", required = true)
    protected DirectFlightClassType directFlightClass;

    /**
     * Gets the value of the directFlightClass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectFlightClassType }
     *     
     */
    @OneToOne(targetEntity = DirectFlightClassType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "directflightclass_id", referencedColumnName = "hjid")
    public DirectFlightClassType getDirectFlightClass() {
        return directFlightClass;
    }

    /**
     * Sets the value of the directFlightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectFlightClassType }
     *     
     */
    public void setDirectFlightClass(DirectFlightClassType value) {
        this.directFlightClass = value;
    }

    @Transient
    public boolean isSetDirectFlightClass() {
        return (this.directFlightClass!= null);
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
        final DirectFlightClassPropertyType that = ((DirectFlightClassPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirectFlightClass();
            boolean rhsFieldIsSet = that.isSetDirectFlightClass();
            DirectFlightClassType lhsField;
            lhsField = this.getDirectFlightClass();
            DirectFlightClassType rhsField;
            rhsField = that.getDirectFlightClass();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directFlightClass", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directFlightClass", rhsField);
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
            boolean theFieldIsSet = this.isSetDirectFlightClass();
            DirectFlightClassType theField;
            theField = this.getDirectFlightClass();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directFlightClass", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDirectFlightClass();
            DirectFlightClassType theField;
            theField = this.getDirectFlightClass();
            strategy.appendField(locator, this, "directFlightClass", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
