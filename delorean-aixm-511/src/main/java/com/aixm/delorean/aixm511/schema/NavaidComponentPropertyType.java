
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
 * <p>Java class for NavaidComponentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidComponentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}NavaidComponent"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentPropertyType", propOrder = {
    "navaidComponent"
})
@Entity(name = "NavaidComponentPropertyType")
@Table(name = "navaidcomponent_pt", schema = "navaids_point")
public class NavaidComponentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "NavaidComponent", required = true)
    protected NavaidComponentType navaidComponent;

    /**
     * Gets the value of the navaidComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentType }
     *     
     */
    @OneToOne(targetEntity = NavaidComponentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "navaidcomponent_id", referencedColumnName = "hjid")
    public NavaidComponentType getNavaidComponent() {
        return navaidComponent;
    }

    /**
     * Sets the value of the navaidComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentType }
     *     
     */
    public void setNavaidComponent(NavaidComponentType value) {
        this.navaidComponent = value;
    }

    @Transient
    public boolean isSetNavaidComponent() {
        return (this.navaidComponent!= null);
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
        final NavaidComponentPropertyType that = ((NavaidComponentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavaidComponent();
            boolean rhsFieldIsSet = that.isSetNavaidComponent();
            NavaidComponentType lhsField;
            lhsField = this.getNavaidComponent();
            NavaidComponentType rhsField;
            rhsField = that.getNavaidComponent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidComponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidComponent", rhsField);
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
            boolean theFieldIsSet = this.isSetNavaidComponent();
            NavaidComponentType theField;
            theField = this.getNavaidComponent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidComponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNavaidComponent();
            NavaidComponentType theField;
            theField = this.getNavaidComponent();
            strategy.appendField(locator, this, "navaidComponent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
