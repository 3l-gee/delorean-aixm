
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
 * <p>Java class for FinalProfilePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalProfilePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FinalProfile"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalProfilePropertyType", propOrder = {
    "finalProfile"
})
@Entity(name = "FinalProfilePropertyType")
@Table(name = "finalprofile_pt", schema = "procedure")
public class FinalProfilePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FinalProfile", required = true)
    protected FinalProfileType finalProfile;

    /**
     * Gets the value of the finalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link FinalProfileType }
     *     
     */
    @OneToOne(targetEntity = FinalProfileType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalprofile_id", referencedColumnName = "hjid")
    public FinalProfileType getFinalProfile() {
        return finalProfile;
    }

    /**
     * Sets the value of the finalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalProfileType }
     *     
     */
    public void setFinalProfile(FinalProfileType value) {
        this.finalProfile = value;
    }

    @Transient
    public boolean isSetFinalProfile() {
        return (this.finalProfile!= null);
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
        final FinalProfilePropertyType that = ((FinalProfilePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalProfile();
            boolean rhsFieldIsSet = that.isSetFinalProfile();
            FinalProfileType lhsField;
            lhsField = this.getFinalProfile();
            FinalProfileType rhsField;
            rhsField = that.getFinalProfile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalProfile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalProfile", rhsField);
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
            boolean theFieldIsSet = this.isSetFinalProfile();
            FinalProfileType theField;
            theField = this.getFinalProfile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalProfile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalProfile();
            FinalProfileType theField;
            theField = this.getFinalProfile();
            strategy.appendField(locator, this, "finalProfile", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
