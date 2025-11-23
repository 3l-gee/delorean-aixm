
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
 * <p>Java class for AerialRefuellingTrackPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingTrackPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingTrack"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingTrackPropertyType", propOrder = {
    "aerialRefuellingTrack"
})
@Entity(name = "AerialRefuellingTrackPropertyType")
@Table(name = "aerialrefuellingtrack_pt", schema = "aerial_refuelling")
public class AerialRefuellingTrackPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AerialRefuellingTrack", required = true)
    protected AerialRefuellingTrackType aerialRefuellingTrack;

    /**
     * Gets the value of the aerialRefuellingTrack property.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingTrackType }
     *     
     */
    @OneToOne(targetEntity = AerialRefuellingTrackType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aerialrefuellingtrack_id", referencedColumnName = "hjid")
    public AerialRefuellingTrackType getAerialRefuellingTrack() {
        return aerialRefuellingTrack;
    }

    /**
     * Sets the value of the aerialRefuellingTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingTrackType }
     *     
     */
    public void setAerialRefuellingTrack(AerialRefuellingTrackType value) {
        this.aerialRefuellingTrack = value;
    }

    @Transient
    public boolean isSetAerialRefuellingTrack() {
        return (this.aerialRefuellingTrack!= null);
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
        final AerialRefuellingTrackPropertyType that = ((AerialRefuellingTrackPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAerialRefuellingTrack();
            boolean rhsFieldIsSet = that.isSetAerialRefuellingTrack();
            AerialRefuellingTrackType lhsField;
            lhsField = this.getAerialRefuellingTrack();
            AerialRefuellingTrackType rhsField;
            rhsField = that.getAerialRefuellingTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aerialRefuellingTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aerialRefuellingTrack", rhsField);
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
            boolean theFieldIsSet = this.isSetAerialRefuellingTrack();
            AerialRefuellingTrackType theField;
            theField = this.getAerialRefuellingTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aerialRefuellingTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAerialRefuellingTrack();
            AerialRefuellingTrackType theField;
            theField = this.getAerialRefuellingTrack();
            strategy.appendField(locator, this, "aerialRefuellingTrack", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
