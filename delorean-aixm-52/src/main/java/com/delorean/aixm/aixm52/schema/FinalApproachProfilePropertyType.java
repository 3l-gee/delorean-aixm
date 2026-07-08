
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
 * Java class for FinalApproachProfilePropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FinalApproachProfilePropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}FinalApproachProfile"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalApproachProfilePropertyType", propOrder = {"finalApproachProfile"})
@Entity(name = "FinalApproachProfilePropertyType")
@Table(name = "finalapproachprofilepropertytype", schema = "procedure")
public class FinalApproachProfilePropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FinalApproachProfile", required = true)
    protected FinalApproachProfileType finalApproachProfile;

    /**
     * Gets the value of the finalApproachProfile property.
     *
     * @return possible object is {@link FinalApproachProfileType }
     *
     */
    @OneToOne(targetEntity = FinalApproachProfileType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachprofile_hjid", referencedColumnName = "hjid")
    public FinalApproachProfileType getFinalApproachProfile() {
        return finalApproachProfile;
    }

    /**
     * Sets the value of the finalApproachProfile property.
     *
     * @param value
     *            allowed object is {@link FinalApproachProfileType }
     *
     */
    public void setFinalApproachProfile(FinalApproachProfileType value) {
        this.finalApproachProfile = value;
    }

    @Transient
    public boolean isSetFinalApproachProfile() {
        return (this.finalApproachProfile != null);
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
        final FinalApproachProfilePropertyType that = ((FinalApproachProfilePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalApproachProfile();
            boolean rhsFieldIsSet = that.isSetFinalApproachProfile();
            FinalApproachProfileType lhsField;
            lhsField = this.getFinalApproachProfile();
            FinalApproachProfileType rhsField;
            rhsField = that.getFinalApproachProfile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalApproachProfile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalApproachProfile", rhsField);
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
            boolean theFieldIsSet = this.isSetFinalApproachProfile();
            FinalApproachProfileType theField;
            theField = this.getFinalApproachProfile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalApproachProfile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalApproachProfile();
            FinalApproachProfileType theField;
            theField = this.getFinalApproachProfile();
            strategy.appendField(locator, this, "finalApproachProfile", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
