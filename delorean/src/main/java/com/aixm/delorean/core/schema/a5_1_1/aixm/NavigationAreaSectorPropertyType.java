
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
 * <p>Java class for NavigationAreaSectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavigationAreaSectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}NavigationAreaSector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationAreaSectorPropertyType", propOrder = {
    "navigationAreaSector"
})
@Entity(name = "NavigationAreaSectorPropertyType")
@Table(name = "navigationareasector_pt", schema = "procedure")
public class NavigationAreaSectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "NavigationAreaSector", required = true)
    protected NavigationAreaSectorType navigationAreaSector;

    /**
     * Gets the value of the navigationAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    @OneToOne(targetEntity = NavigationAreaSectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "navigationareasector_id", referencedColumnName = "hjid")
    public NavigationAreaSectorType getNavigationAreaSector() {
        return navigationAreaSector;
    }

    /**
     * Sets the value of the navigationAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    public void setNavigationAreaSector(NavigationAreaSectorType value) {
        this.navigationAreaSector = value;
    }

    @Transient
    public boolean isSetNavigationAreaSector() {
        return (this.navigationAreaSector!= null);
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
        final NavigationAreaSectorPropertyType that = ((NavigationAreaSectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavigationAreaSector();
            boolean rhsFieldIsSet = that.isSetNavigationAreaSector();
            NavigationAreaSectorType lhsField;
            lhsField = this.getNavigationAreaSector();
            NavigationAreaSectorType rhsField;
            rhsField = that.getNavigationAreaSector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationAreaSector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationAreaSector", rhsField);
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
            boolean theFieldIsSet = this.isSetNavigationAreaSector();
            NavigationAreaSectorType theField;
            theField = this.getNavigationAreaSector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationAreaSector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNavigationAreaSector();
            NavigationAreaSectorType theField;
            theField = this.getNavigationAreaSector();
            strategy.appendField(locator, this, "navigationAreaSector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
