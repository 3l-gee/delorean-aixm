
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
 * <p>Java class for RadarComponentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadarComponentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RadarComponent"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadarComponentPropertyType", propOrder = {
    "radarComponent"
})
@Entity(name = "RadarComponentPropertyType")
@Table(name = "radarcomponent_pt", schema = "surveillance")
public class RadarComponentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RadarComponent", required = true)
    protected RadarComponentType radarComponent;

    /**
     * Gets the value of the radarComponent property.
     * 
     * @return
     *     possible object is
     *     {@link RadarComponentType }
     *     
     */
    @OneToOne(targetEntity = RadarComponentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "radarcomponent_id", referencedColumnName = "hjid")
    public RadarComponentType getRadarComponent() {
        return radarComponent;
    }

    /**
     * Sets the value of the radarComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadarComponentType }
     *     
     */
    public void setRadarComponent(RadarComponentType value) {
        this.radarComponent = value;
    }

    @Transient
    public boolean isSetRadarComponent() {
        return (this.radarComponent!= null);
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
        final RadarComponentPropertyType that = ((RadarComponentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRadarComponent();
            boolean rhsFieldIsSet = that.isSetRadarComponent();
            RadarComponentType lhsField;
            lhsField = this.getRadarComponent();
            RadarComponentType rhsField;
            rhsField = that.getRadarComponent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radarComponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radarComponent", rhsField);
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
            boolean theFieldIsSet = this.isSetRadarComponent();
            RadarComponentType theField;
            theField = this.getRadarComponent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radarComponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRadarComponent();
            RadarComponentType theField;
            theField = this.getRadarComponent();
            strategy.appendField(locator, this, "radarComponent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
