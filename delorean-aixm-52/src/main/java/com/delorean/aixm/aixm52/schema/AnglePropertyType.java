
package com.delorean.aixm.aixm52.schema;

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
 * Java class for AnglePropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AnglePropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}Angle"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnglePropertyType", propOrder = {"angle"})
@Entity(name = "AnglePropertyType")
@Table(name = "anglepropertytype", schema = "navaids_point")
public class AnglePropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Angle", required = true)
    protected AngleType angle;

    /**
     * Gets the value of the angle property.
     *
     * @return possible object is {@link AngleType }
     *
     */
    @OneToOne(targetEntity = AngleType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "angle_hjid", referencedColumnName = "hjid")
    public AngleType getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     *
     * @param value
     *            allowed object is {@link AngleType }
     *
     */
    public void setAngle(AngleType value) {
        this.angle = value;
    }

    @Transient
    public boolean isSetAngle() {
        return (this.angle != null);
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
        final AnglePropertyType that = ((AnglePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAngle();
            boolean rhsFieldIsSet = that.isSetAngle();
            AngleType lhsField;
            lhsField = this.getAngle();
            AngleType rhsField;
            rhsField = that.getAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angle", rhsField);
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
            boolean theFieldIsSet = this.isSetAngle();
            AngleType theField;
            theField = this.getAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAngle();
            AngleType theField;
            theField = this.getAngle();
            strategy.appendField(locator, this, "angle", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
