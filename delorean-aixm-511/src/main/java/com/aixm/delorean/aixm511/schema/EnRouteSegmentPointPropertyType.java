
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
 * <p>Java class for EnRouteSegmentPointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnRouteSegmentPointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}EnRouteSegmentPoint"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnRouteSegmentPointPropertyType", propOrder = {
    "enRouteSegmentPoint"
})
@Entity(name = "EnRouteSegmentPointPropertyType")
@Table(name = "enroutesegmentpoint_pt", schema = "navaids_point")
public class EnRouteSegmentPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "EnRouteSegmentPoint", required = true)
    protected EnRouteSegmentPointType enRouteSegmentPoint;

    /**
     * Gets the value of the enRouteSegmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteSegmentPointType }
     *     
     */
    @OneToOne(targetEntity = EnRouteSegmentPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "enroutesegmentpoint_id", referencedColumnName = "hjid")
    public EnRouteSegmentPointType getEnRouteSegmentPoint() {
        return enRouteSegmentPoint;
    }

    /**
     * Sets the value of the enRouteSegmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteSegmentPointType }
     *     
     */
    public void setEnRouteSegmentPoint(EnRouteSegmentPointType value) {
        this.enRouteSegmentPoint = value;
    }

    @Transient
    public boolean isSetEnRouteSegmentPoint() {
        return (this.enRouteSegmentPoint!= null);
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
        final EnRouteSegmentPointPropertyType that = ((EnRouteSegmentPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetEnRouteSegmentPoint();
            boolean rhsFieldIsSet = that.isSetEnRouteSegmentPoint();
            EnRouteSegmentPointType lhsField;
            lhsField = this.getEnRouteSegmentPoint();
            EnRouteSegmentPointType rhsField;
            rhsField = that.getEnRouteSegmentPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "enRouteSegmentPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "enRouteSegmentPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetEnRouteSegmentPoint();
            EnRouteSegmentPointType theField;
            theField = this.getEnRouteSegmentPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "enRouteSegmentPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetEnRouteSegmentPoint();
            EnRouteSegmentPointType theField;
            theField = this.getEnRouteSegmentPoint();
            strategy.appendField(locator, this, "enRouteSegmentPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
