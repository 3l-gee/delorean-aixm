
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
 * <p>Java class for LightElementPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LightElementPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}LightElement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightElementPropertyType", propOrder = {
    "lightElement"
})
@Entity(name = "LightElementPropertyType")
@Table(name = "lightelement_pt", schema = "shared")
public class LightElementPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "LightElement", required = true)
    protected LightElementType lightElement;

    /**
     * Gets the value of the lightElement property.
     * 
     * @return
     *     possible object is
     *     {@link LightElementType }
     *     
     */
    @OneToOne(targetEntity = LightElementType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "lightelement_id", referencedColumnName = "hjid")
    public LightElementType getLightElement() {
        return lightElement;
    }

    /**
     * Sets the value of the lightElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightElementType }
     *     
     */
    public void setLightElement(LightElementType value) {
        this.lightElement = value;
    }

    @Transient
    public boolean isSetLightElement() {
        return (this.lightElement!= null);
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
        final LightElementPropertyType that = ((LightElementPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetLightElement();
            boolean rhsFieldIsSet = that.isSetLightElement();
            LightElementType lhsField;
            lhsField = this.getLightElement();
            LightElementType rhsField;
            rhsField = that.getLightElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightElement", rhsField);
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
            boolean theFieldIsSet = this.isSetLightElement();
            LightElementType theField;
            theField = this.getLightElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetLightElement();
            LightElementType theField;
            theField = this.getLightElement();
            strategy.appendField(locator, this, "lightElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
