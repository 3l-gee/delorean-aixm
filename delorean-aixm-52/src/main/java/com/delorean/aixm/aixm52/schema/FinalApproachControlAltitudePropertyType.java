
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
 * <p>Java class for FinalApproachControlAltitudePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalApproachControlAltitudePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}FinalApproachControlAltitude"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalApproachControlAltitudePropertyType", propOrder = {
    "finalApproachControlAltitude"
})
@Entity(name = "FinalApproachControlAltitudePropertyType")
@Table(name = "finalapproachcontrolaltitudepropertytype", schema = "procedure")
public class FinalApproachControlAltitudePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FinalApproachControlAltitude", required = true)
    protected FinalApproachControlAltitudeType finalApproachControlAltitude;

    /**
     * Gets the value of the finalApproachControlAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link FinalApproachControlAltitudeType }
     *     
     */
    @OneToOne(targetEntity = FinalApproachControlAltitudeType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachcontrolaltitude_hjid", referencedColumnName = "hjid")
    public FinalApproachControlAltitudeType getFinalApproachControlAltitude() {
        return finalApproachControlAltitude;
    }

    /**
     * Sets the value of the finalApproachControlAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalApproachControlAltitudeType }
     *     
     */
    public void setFinalApproachControlAltitude(FinalApproachControlAltitudeType value) {
        this.finalApproachControlAltitude = value;
    }

    @Transient
    public boolean isSetFinalApproachControlAltitude() {
        return (this.finalApproachControlAltitude!= null);
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
        final FinalApproachControlAltitudePropertyType that = ((FinalApproachControlAltitudePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalApproachControlAltitude();
            boolean rhsFieldIsSet = that.isSetFinalApproachControlAltitude();
            FinalApproachControlAltitudeType lhsField;
            lhsField = this.getFinalApproachControlAltitude();
            FinalApproachControlAltitudeType rhsField;
            rhsField = that.getFinalApproachControlAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalApproachControlAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalApproachControlAltitude", rhsField);
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
            boolean theFieldIsSet = this.isSetFinalApproachControlAltitude();
            FinalApproachControlAltitudeType theField;
            theField = this.getFinalApproachControlAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalApproachControlAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalApproachControlAltitude();
            FinalApproachControlAltitudeType theField;
            theField = this.getFinalApproachControlAltitude();
            strategy.appendField(locator, this, "finalApproachControlAltitude", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
