
package com.aixm.delorean.aixm52.schema;

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
import java.io.Serializable;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for FlightInspectionTrajectoryPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FlightInspectionTrajectoryPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}FlightInspectionTrajectory"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInspectionTrajectoryPropertyType", propOrder = {"flightInspectionTrajectory"})
@Entity(name = "FlightInspectionTrajectoryPropertyType")
@Table(name = "flightinspectiontrajectorypropertytype", schema = "navaids_point")
public class FlightInspectionTrajectoryPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightInspectionTrajectory", required = true)
    protected FlightInspectionTrajectoryType flightInspectionTrajectory;

    /**
     * Gets the value of the flightInspectionTrajectory property.
     *
     * @return possible object is {@link FlightInspectionTrajectoryType }
     *
     */
    @OneToOne(targetEntity = FlightInspectionTrajectoryType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightinspectiontrajectory_hjid", referencedColumnName = "hjid")
    public FlightInspectionTrajectoryType getFlightInspectionTrajectory() {
        return flightInspectionTrajectory;
    }

    /**
     * Sets the value of the flightInspectionTrajectory property.
     *
     * @param value
     *            allowed object is {@link FlightInspectionTrajectoryType }
     *
     */
    public void setFlightInspectionTrajectory(FlightInspectionTrajectoryType value) {
        this.flightInspectionTrajectory = value;
    }

    @Transient
    public boolean isSetFlightInspectionTrajectory() {
        return (this.flightInspectionTrajectory != null);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FlightInspectionTrajectoryPropertyType that = ((FlightInspectionTrajectoryPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightInspectionTrajectory();
            boolean rhsFieldIsSet = that.isSetFlightInspectionTrajectory();
            FlightInspectionTrajectoryType lhsField;
            lhsField = this.getFlightInspectionTrajectory();
            FlightInspectionTrajectoryType rhsField;
            rhsField = that.getFlightInspectionTrajectory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightInspectionTrajectory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightInspectionTrajectory", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightInspectionTrajectory();
            FlightInspectionTrajectoryType theField;
            theField = this.getFlightInspectionTrajectory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightInspectionTrajectory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightInspectionTrajectory();
            FlightInspectionTrajectoryType theField;
            theField = this.getFlightInspectionTrajectory();
            strategy.appendField(locator, this, "flightInspectionTrajectory", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
