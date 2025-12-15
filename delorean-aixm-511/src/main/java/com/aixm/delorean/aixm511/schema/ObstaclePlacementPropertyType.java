
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
 * <p>Java class for ObstaclePlacementPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstaclePlacementPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ObstaclePlacement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstaclePlacementPropertyType", propOrder = {
    "obstaclePlacement"
})
@Entity(name = "ObstaclePlacementPropertyType")
@Table(name = "obstacleplacement_pt", schema = "shared")
public class ObstaclePlacementPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ObstaclePlacement", required = true)
    protected ObstaclePlacementType obstaclePlacement;

    /**
     * Gets the value of the obstaclePlacement property.
     * 
     * @return
     *     possible object is
     *     {@link ObstaclePlacementType }
     *     
     */
    @OneToOne(targetEntity = ObstaclePlacementType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "obstacleplacement_id", referencedColumnName = "hjid")
    public ObstaclePlacementType getObstaclePlacement() {
        return obstaclePlacement;
    }

    /**
     * Sets the value of the obstaclePlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstaclePlacementType }
     *     
     */
    public void setObstaclePlacement(ObstaclePlacementType value) {
        this.obstaclePlacement = value;
    }

    @Transient
    public boolean isSetObstaclePlacement() {
        return (this.obstaclePlacement!= null);
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
        final ObstaclePlacementPropertyType that = ((ObstaclePlacementPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetObstaclePlacement();
            boolean rhsFieldIsSet = that.isSetObstaclePlacement();
            ObstaclePlacementType lhsField;
            lhsField = this.getObstaclePlacement();
            ObstaclePlacementType rhsField;
            rhsField = that.getObstaclePlacement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstaclePlacement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstaclePlacement", rhsField);
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
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            ObstaclePlacementType theField;
            theField = this.getObstaclePlacement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstaclePlacement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            ObstaclePlacementType theField;
            theField = this.getObstaclePlacement();
            strategy.appendField(locator, this, "obstaclePlacement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
