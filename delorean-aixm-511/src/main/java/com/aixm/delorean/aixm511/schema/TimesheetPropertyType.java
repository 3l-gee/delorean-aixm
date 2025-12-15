
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
 * <p>Java class for TimesheetPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimesheetPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Timesheet"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimesheetPropertyType", propOrder = {
    "timesheet"
})
@Entity(name = "TimesheetPropertyType")
@Table(name = "timesheet_pt", schema = "shared")
public class TimesheetPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Timesheet", required = true)
    protected TimesheetType timesheet;

    /**
     * Gets the value of the timesheet property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetType }
     *     
     */
    @OneToOne(targetEntity = TimesheetType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "timesheet_id", referencedColumnName = "hjid")
    public TimesheetType getTimesheet() {
        return timesheet;
    }

    /**
     * Sets the value of the timesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetType }
     *     
     */
    public void setTimesheet(TimesheetType value) {
        this.timesheet = value;
    }

    @Transient
    public boolean isSetTimesheet() {
        return (this.timesheet!= null);
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
        final TimesheetPropertyType that = ((TimesheetPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTimesheet();
            boolean rhsFieldIsSet = that.isSetTimesheet();
            TimesheetType lhsField;
            lhsField = this.getTimesheet();
            TimesheetType rhsField;
            rhsField = that.getTimesheet();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timesheet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timesheet", rhsField);
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
            boolean theFieldIsSet = this.isSetTimesheet();
            TimesheetType theField;
            theField = this.getTimesheet();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timesheet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTimesheet();
            TimesheetType theField;
            theField = this.getTimesheet();
            strategy.appendField(locator, this, "timesheet", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
