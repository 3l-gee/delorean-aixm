
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
 * <p>Java class for RoutePortionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoutePortionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RoutePortion"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePortionPropertyType", propOrder = {
    "routePortion"
})
@Entity(name = "RoutePortionPropertyType")
@Table(name = "routeportion_pt", schema = "route")
public class RoutePortionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RoutePortion", required = true)
    protected RoutePortionType routePortion;

    /**
     * Gets the value of the routePortion property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePortionType }
     *     
     */
    @OneToOne(targetEntity = RoutePortionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "routeportion_id", referencedColumnName = "hjid")
    public RoutePortionType getRoutePortion() {
        return routePortion;
    }

    /**
     * Sets the value of the routePortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePortionType }
     *     
     */
    public void setRoutePortion(RoutePortionType value) {
        this.routePortion = value;
    }

    @Transient
    public boolean isSetRoutePortion() {
        return (this.routePortion!= null);
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
        final RoutePortionPropertyType that = ((RoutePortionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRoutePortion();
            boolean rhsFieldIsSet = that.isSetRoutePortion();
            RoutePortionType lhsField;
            lhsField = this.getRoutePortion();
            RoutePortionType rhsField;
            rhsField = that.getRoutePortion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "routePortion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "routePortion", rhsField);
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
            boolean theFieldIsSet = this.isSetRoutePortion();
            RoutePortionType theField;
            theField = this.getRoutePortion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routePortion", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRoutePortion();
            RoutePortionType theField;
            theField = this.getRoutePortion();
            strategy.appendField(locator, this, "routePortion", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
