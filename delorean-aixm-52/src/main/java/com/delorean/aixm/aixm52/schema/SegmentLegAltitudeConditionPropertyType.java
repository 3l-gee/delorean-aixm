
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for SegmentLegAltitudeConditionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SegmentLegAltitudeConditionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}SegmentLegAltitudeCondition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentLegAltitudeConditionPropertyType", propOrder = {
    "segmentLegAltitudeCondition"
})
@Entity(name = "SegmentLegAltitudeConditionPropertyType")
@Table(name = "segmentlegaltitudeconditionpropertytype", schema = "procedure")
public class SegmentLegAltitudeConditionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SegmentLegAltitudeCondition", required = true)
    protected SegmentLegAltitudeConditionType segmentLegAltitudeCondition;

    /**
     * Gets the value of the segmentLegAltitudeCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentLegAltitudeConditionType }
     *     
     */
    @OneToOne(targetEntity = SegmentLegAltitudeConditionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "segmentlegaltitudecondition_hjid", referencedColumnName = "hjid")
    public SegmentLegAltitudeConditionType getSegmentLegAltitudeCondition() {
        return segmentLegAltitudeCondition;
    }

    /**
     * Sets the value of the segmentLegAltitudeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentLegAltitudeConditionType }
     *     
     */
    public void setSegmentLegAltitudeCondition(SegmentLegAltitudeConditionType value) {
        this.segmentLegAltitudeCondition = value;
    }

    @Transient
    public boolean isSetSegmentLegAltitudeCondition() {
        return (this.segmentLegAltitudeCondition!= null);
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
        final SegmentLegAltitudeConditionPropertyType that = ((SegmentLegAltitudeConditionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSegmentLegAltitudeCondition();
            boolean rhsFieldIsSet = that.isSetSegmentLegAltitudeCondition();
            SegmentLegAltitudeConditionType lhsField;
            lhsField = this.getSegmentLegAltitudeCondition();
            SegmentLegAltitudeConditionType rhsField;
            rhsField = that.getSegmentLegAltitudeCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "segmentLegAltitudeCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "segmentLegAltitudeCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetSegmentLegAltitudeCondition();
            SegmentLegAltitudeConditionType theField;
            theField = this.getSegmentLegAltitudeCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "segmentLegAltitudeCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSegmentLegAltitudeCondition();
            SegmentLegAltitudeConditionType theField;
            theField = this.getSegmentLegAltitudeCondition();
            strategy.appendField(locator, this, "segmentLegAltitudeCondition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
