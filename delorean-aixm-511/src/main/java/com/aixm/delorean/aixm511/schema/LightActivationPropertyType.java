
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
 * <p>Java class for LightActivationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LightActivationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}LightActivation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightActivationPropertyType", propOrder = {
    "lightActivation"
})
@Entity(name = "LightActivationPropertyType")
@Table(name = "lightactivation_pt", schema = "airport_heliport")
public class LightActivationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "LightActivation", required = true)
    protected LightActivationType lightActivation;

    /**
     * Gets the value of the lightActivation property.
     * 
     * @return
     *     possible object is
     *     {@link LightActivationType }
     *     
     */
    @OneToOne(targetEntity = LightActivationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "lightactivation_id", referencedColumnName = "hjid")
    public LightActivationType getLightActivation() {
        return lightActivation;
    }

    /**
     * Sets the value of the lightActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightActivationType }
     *     
     */
    public void setLightActivation(LightActivationType value) {
        this.lightActivation = value;
    }

    @Transient
    public boolean isSetLightActivation() {
        return (this.lightActivation!= null);
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
        final LightActivationPropertyType that = ((LightActivationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetLightActivation();
            boolean rhsFieldIsSet = that.isSetLightActivation();
            LightActivationType lhsField;
            lhsField = this.getLightActivation();
            LightActivationType rhsField;
            rhsField = that.getLightActivation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightActivation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightActivation", rhsField);
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
            boolean theFieldIsSet = this.isSetLightActivation();
            LightActivationType theField;
            theField = this.getLightActivation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightActivation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetLightActivation();
            LightActivationType theField;
            theField = this.getLightActivation();
            strategy.appendField(locator, this, "lightActivation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
