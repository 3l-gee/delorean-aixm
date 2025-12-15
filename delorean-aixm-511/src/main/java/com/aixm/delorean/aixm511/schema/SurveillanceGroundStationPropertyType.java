
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
 * <p>Java class for SurveillanceGroundStationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurveillanceGroundStationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SurveillanceGroundStation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveillanceGroundStationPropertyType", propOrder = {
    "surveillanceGroundStation"
})
@Entity(name = "SurveillanceGroundStationPropertyType")
@Table(name = "surveillancegroundstation_pt", schema = "surveillance")
public class SurveillanceGroundStationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SurveillanceGroundStation", required = true)
    protected SurveillanceGroundStationType surveillanceGroundStation;

    /**
     * Gets the value of the surveillanceGroundStation property.
     * 
     * @return
     *     possible object is
     *     {@link SurveillanceGroundStationType }
     *     
     */
    @OneToOne(targetEntity = SurveillanceGroundStationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surveillancegroundstation_id", referencedColumnName = "hjid")
    public SurveillanceGroundStationType getSurveillanceGroundStation() {
        return surveillanceGroundStation;
    }

    /**
     * Sets the value of the surveillanceGroundStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveillanceGroundStationType }
     *     
     */
    public void setSurveillanceGroundStation(SurveillanceGroundStationType value) {
        this.surveillanceGroundStation = value;
    }

    @Transient
    public boolean isSetSurveillanceGroundStation() {
        return (this.surveillanceGroundStation!= null);
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
        final SurveillanceGroundStationPropertyType that = ((SurveillanceGroundStationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSurveillanceGroundStation();
            boolean rhsFieldIsSet = that.isSetSurveillanceGroundStation();
            SurveillanceGroundStationType lhsField;
            lhsField = this.getSurveillanceGroundStation();
            SurveillanceGroundStationType rhsField;
            rhsField = that.getSurveillanceGroundStation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surveillanceGroundStation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surveillanceGroundStation", rhsField);
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
            boolean theFieldIsSet = this.isSetSurveillanceGroundStation();
            SurveillanceGroundStationType theField;
            theField = this.getSurveillanceGroundStation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surveillanceGroundStation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSurveillanceGroundStation();
            SurveillanceGroundStationType theField;
            theField = this.getSurveillanceGroundStation();
            strategy.appendField(locator, this, "surveillanceGroundStation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
