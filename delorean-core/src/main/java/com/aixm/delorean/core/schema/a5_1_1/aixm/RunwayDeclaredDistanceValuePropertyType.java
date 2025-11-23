
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for RunwayDeclaredDistanceValuePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayDeclaredDistanceValuePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RunwayDeclaredDistanceValue"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDeclaredDistanceValuePropertyType", propOrder = {
    "runwayDeclaredDistanceValue"
})
@Entity(name = "RunwayDeclaredDistanceValuePropertyType")
@Table(name = "runwaydeclareddistancevalue_pt", schema = "airport_heliport")
public class RunwayDeclaredDistanceValuePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RunwayDeclaredDistanceValue", required = true)
    protected RunwayDeclaredDistanceValueType runwayDeclaredDistanceValue;

    /**
     * Gets the value of the runwayDeclaredDistanceValue property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDeclaredDistanceValueType }
     *     
     */
    @OneToOne(targetEntity = RunwayDeclaredDistanceValueType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydeclareddistancevalue_id", referencedColumnName = "hjid")
    public RunwayDeclaredDistanceValueType getRunwayDeclaredDistanceValue() {
        return runwayDeclaredDistanceValue;
    }

    /**
     * Sets the value of the runwayDeclaredDistanceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDeclaredDistanceValueType }
     *     
     */
    public void setRunwayDeclaredDistanceValue(RunwayDeclaredDistanceValueType value) {
        this.runwayDeclaredDistanceValue = value;
    }

    @Transient
    public boolean isSetRunwayDeclaredDistanceValue() {
        return (this.runwayDeclaredDistanceValue!= null);
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
        final RunwayDeclaredDistanceValuePropertyType that = ((RunwayDeclaredDistanceValuePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRunwayDeclaredDistanceValue();
            boolean rhsFieldIsSet = that.isSetRunwayDeclaredDistanceValue();
            RunwayDeclaredDistanceValueType lhsField;
            lhsField = this.getRunwayDeclaredDistanceValue();
            RunwayDeclaredDistanceValueType rhsField;
            rhsField = that.getRunwayDeclaredDistanceValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDeclaredDistanceValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDeclaredDistanceValue", rhsField);
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
            boolean theFieldIsSet = this.isSetRunwayDeclaredDistanceValue();
            RunwayDeclaredDistanceValueType theField;
            theField = this.getRunwayDeclaredDistanceValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDeclaredDistanceValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRunwayDeclaredDistanceValue();
            RunwayDeclaredDistanceValueType theField;
            theField = this.getRunwayDeclaredDistanceValue();
            strategy.appendField(locator, this, "runwayDeclaredDistanceValue", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
