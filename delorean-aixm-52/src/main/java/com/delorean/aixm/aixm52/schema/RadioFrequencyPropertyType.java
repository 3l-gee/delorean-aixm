
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
 * <p>Java class for RadioFrequencyPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadioFrequencyPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}RadioFrequency"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioFrequencyPropertyType", propOrder = {
    "radioFrequency"
})
@Entity(name = "RadioFrequencyPropertyType")
@Table(name = "radiofrequency_p", schema = "navaids_point")
public class RadioFrequencyPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RadioFrequency", required = true)
    protected RadioFrequencyType radioFrequency;

    /**
     * Gets the value of the radioFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link RadioFrequencyType }
     *     
     */
    @OneToOne(targetEntity = RadioFrequencyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "radiofrequency_hjid", referencedColumnName = "hjid")
    public RadioFrequencyType getRadioFrequency() {
        return radioFrequency;
    }

    /**
     * Sets the value of the radioFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioFrequencyType }
     *     
     */
    public void setRadioFrequency(RadioFrequencyType value) {
        this.radioFrequency = value;
    }

    @Transient
    public boolean isSetRadioFrequency() {
        return (this.radioFrequency!= null);
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
        final RadioFrequencyPropertyType that = ((RadioFrequencyPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRadioFrequency();
            boolean rhsFieldIsSet = that.isSetRadioFrequency();
            RadioFrequencyType lhsField;
            lhsField = this.getRadioFrequency();
            RadioFrequencyType rhsField;
            rhsField = that.getRadioFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioFrequency", rhsField);
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
            boolean theFieldIsSet = this.isSetRadioFrequency();
            RadioFrequencyType theField;
            theField = this.getRadioFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRadioFrequency();
            RadioFrequencyType theField;
            theField = this.getRadioFrequency();
            strategy.appendField(locator, this, "radioFrequency", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
