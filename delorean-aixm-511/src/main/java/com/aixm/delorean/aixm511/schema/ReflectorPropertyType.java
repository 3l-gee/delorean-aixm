
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
 * <p>Java class for ReflectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReflectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Reflector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReflectorPropertyType", propOrder = {
    "reflector"
})
@Entity(name = "ReflectorPropertyType")
@Table(name = "reflector_pt", schema = "surveillance")
public class ReflectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Reflector", required = true)
    protected ReflectorType reflector;

    /**
     * Gets the value of the reflector property.
     * 
     * @return
     *     possible object is
     *     {@link ReflectorType }
     *     
     */
    @OneToOne(targetEntity = ReflectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "reflector_id", referencedColumnName = "hjid")
    public ReflectorType getReflector() {
        return reflector;
    }

    /**
     * Sets the value of the reflector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectorType }
     *     
     */
    public void setReflector(ReflectorType value) {
        this.reflector = value;
    }

    @Transient
    public boolean isSetReflector() {
        return (this.reflector!= null);
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
        final ReflectorPropertyType that = ((ReflectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetReflector();
            boolean rhsFieldIsSet = that.isSetReflector();
            ReflectorType lhsField;
            lhsField = this.getReflector();
            ReflectorType rhsField;
            rhsField = that.getReflector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reflector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reflector", rhsField);
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
            boolean theFieldIsSet = this.isSetReflector();
            ReflectorType theField;
            theField = this.getReflector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reflector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetReflector();
            ReflectorType theField;
            theField = this.getReflector();
            strategy.appendField(locator, this, "reflector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
