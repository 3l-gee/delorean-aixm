
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
 * <p>Java class for ApproachAltitudeTablePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachAltitudeTablePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApproachAltitudeTable"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachAltitudeTablePropertyType", propOrder = {
    "approachAltitudeTable"
})
@Entity(name = "ApproachAltitudeTablePropertyType")
@Table(name = "approachaltitudetable_pt", schema = "procedure")
public class ApproachAltitudeTablePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApproachAltitudeTable", required = true)
    protected ApproachAltitudeTableType approachAltitudeTable;

    /**
     * Gets the value of the approachAltitudeTable property.
     * 
     * @return
     *     possible object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    @OneToOne(targetEntity = ApproachAltitudeTableType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approachaltitudetable_id", referencedColumnName = "hjid")
    public ApproachAltitudeTableType getApproachAltitudeTable() {
        return approachAltitudeTable;
    }

    /**
     * Sets the value of the approachAltitudeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    public void setApproachAltitudeTable(ApproachAltitudeTableType value) {
        this.approachAltitudeTable = value;
    }

    @Transient
    public boolean isSetApproachAltitudeTable() {
        return (this.approachAltitudeTable!= null);
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
        final ApproachAltitudeTablePropertyType that = ((ApproachAltitudeTablePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApproachAltitudeTable();
            boolean rhsFieldIsSet = that.isSetApproachAltitudeTable();
            ApproachAltitudeTableType lhsField;
            lhsField = this.getApproachAltitudeTable();
            ApproachAltitudeTableType rhsField;
            rhsField = that.getApproachAltitudeTable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachAltitudeTable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachAltitudeTable", rhsField);
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
            boolean theFieldIsSet = this.isSetApproachAltitudeTable();
            ApproachAltitudeTableType theField;
            theField = this.getApproachAltitudeTable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachAltitudeTable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApproachAltitudeTable();
            ApproachAltitudeTableType theField;
            theField = this.getApproachAltitudeTable();
            strategy.appendField(locator, this, "approachAltitudeTable", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
