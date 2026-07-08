
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
 * Java class for FinalApproachControlPositionPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FinalApproachControlPositionPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}FinalApproachControlPosition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalApproachControlPositionPropertyType", propOrder = {"finalApproachControlPosition"})
@Entity(name = "FinalApproachControlPositionPropertyType")
@Table(name = "finalapproachcontrolpositionpropertytype", schema = "procedure")
public class FinalApproachControlPositionPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FinalApproachControlPosition", required = true)
    protected FinalApproachControlPositionType finalApproachControlPosition;

    /**
     * Gets the value of the finalApproachControlPosition property.
     *
     * @return possible object is {@link FinalApproachControlPositionType }
     *
     */
    @OneToOne(targetEntity = FinalApproachControlPositionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachcontrolposition_hjid", referencedColumnName = "hjid")
    public FinalApproachControlPositionType getFinalApproachControlPosition() {
        return finalApproachControlPosition;
    }

    /**
     * Sets the value of the finalApproachControlPosition property.
     *
     * @param value
     *            allowed object is {@link FinalApproachControlPositionType }
     *
     */
    public void setFinalApproachControlPosition(FinalApproachControlPositionType value) {
        this.finalApproachControlPosition = value;
    }

    @Transient
    public boolean isSetFinalApproachControlPosition() {
        return (this.finalApproachControlPosition != null);
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
        final FinalApproachControlPositionPropertyType that = ((FinalApproachControlPositionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalApproachControlPosition();
            boolean rhsFieldIsSet = that.isSetFinalApproachControlPosition();
            FinalApproachControlPositionType lhsField;
            lhsField = this.getFinalApproachControlPosition();
            FinalApproachControlPositionType rhsField;
            rhsField = that.getFinalApproachControlPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalApproachControlPosition",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalApproachControlPosition",
                    rhsField);
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
            boolean theFieldIsSet = this.isSetFinalApproachControlPosition();
            FinalApproachControlPositionType theField;
            theField = this.getFinalApproachControlPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalApproachControlPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalApproachControlPosition();
            FinalApproachControlPositionType theField;
            theField = this.getFinalApproachControlPosition();
            strategy.appendField(locator, this, "finalApproachControlPosition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
