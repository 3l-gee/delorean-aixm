
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
 * <p>Java class for CircleSectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CircleSectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}CircleSector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleSectorPropertyType", propOrder = {
    "circleSector"
})
@Entity(name = "CircleSectorPropertyType")
@Table(name = "circlesector_pt", schema = "shared")
public class CircleSectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "CircleSector", required = true)
    protected CircleSectorType circleSector;

    /**
     * Gets the value of the circleSector property.
     * 
     * @return
     *     possible object is
     *     {@link CircleSectorType }
     *     
     */
    @OneToOne(targetEntity = CircleSectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "circlesector_id", referencedColumnName = "hjid")
    public CircleSectorType getCircleSector() {
        return circleSector;
    }

    /**
     * Sets the value of the circleSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircleSectorType }
     *     
     */
    public void setCircleSector(CircleSectorType value) {
        this.circleSector = value;
    }

    @Transient
    public boolean isSetCircleSector() {
        return (this.circleSector!= null);
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
        final CircleSectorPropertyType that = ((CircleSectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetCircleSector();
            boolean rhsFieldIsSet = that.isSetCircleSector();
            CircleSectorType lhsField;
            lhsField = this.getCircleSector();
            CircleSectorType rhsField;
            rhsField = that.getCircleSector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "circleSector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "circleSector", rhsField);
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
            boolean theFieldIsSet = this.isSetCircleSector();
            CircleSectorType theField;
            theField = this.getCircleSector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "circleSector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCircleSector();
            CircleSectorType theField;
            theField = this.getCircleSector();
            strategy.appendField(locator, this, "circleSector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
