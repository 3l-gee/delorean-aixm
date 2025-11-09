
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
 * <p>Java class for TouchDownLiftOffContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TouchDownLiftOffContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}TouchDownLiftOffContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchDownLiftOffContaminationPropertyType", propOrder = {
    "touchDownLiftOffContamination"
})
@Entity(name = "TouchDownLiftOffContaminationPropertyType")
@Table(name = "touchdownliftoffcontamination_pt", schema = "airport_heliport")
public class TouchDownLiftOffContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "TouchDownLiftOffContamination", required = true)
    protected TouchDownLiftOffContaminationType touchDownLiftOffContamination;

    /**
     * Gets the value of the touchDownLiftOffContamination property.
     * 
     * @return
     *     possible object is
     *     {@link TouchDownLiftOffContaminationType }
     *     
     */
    @OneToOne(targetEntity = TouchDownLiftOffContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "touchdownliftoffcontamination_id", referencedColumnName = "hjid")
    public TouchDownLiftOffContaminationType getTouchDownLiftOffContamination() {
        return touchDownLiftOffContamination;
    }

    /**
     * Sets the value of the touchDownLiftOffContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchDownLiftOffContaminationType }
     *     
     */
    public void setTouchDownLiftOffContamination(TouchDownLiftOffContaminationType value) {
        this.touchDownLiftOffContamination = value;
    }

    @Transient
    public boolean isSetTouchDownLiftOffContamination() {
        return (this.touchDownLiftOffContamination!= null);
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
        final TouchDownLiftOffContaminationPropertyType that = ((TouchDownLiftOffContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTouchDownLiftOffContamination();
            boolean rhsFieldIsSet = that.isSetTouchDownLiftOffContamination();
            TouchDownLiftOffContaminationType lhsField;
            lhsField = this.getTouchDownLiftOffContamination();
            TouchDownLiftOffContaminationType rhsField;
            rhsField = that.getTouchDownLiftOffContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "touchDownLiftOffContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "touchDownLiftOffContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetTouchDownLiftOffContamination();
            TouchDownLiftOffContaminationType theField;
            theField = this.getTouchDownLiftOffContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "touchDownLiftOffContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTouchDownLiftOffContamination();
            TouchDownLiftOffContaminationType theField;
            theField = this.getTouchDownLiftOffContamination();
            strategy.appendField(locator, this, "touchDownLiftOffContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
