
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
 * <p>Java class for CallsignDetailPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CallsignDetailPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}CallsignDetail"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallsignDetailPropertyType", propOrder = {
    "callsignDetail"
})
@Entity(name = "CallsignDetailPropertyType")
@Table(name = "callsigndetail_pt", schema = "service")
public class CallsignDetailPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "CallsignDetail", required = true)
    protected CallsignDetailType callsignDetail;

    /**
     * Gets the value of the callsignDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CallsignDetailType }
     *     
     */
    @OneToOne(targetEntity = CallsignDetailType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "callsigndetail_id", referencedColumnName = "hjid")
    public CallsignDetailType getCallsignDetail() {
        return callsignDetail;
    }

    /**
     * Sets the value of the callsignDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallsignDetailType }
     *     
     */
    public void setCallsignDetail(CallsignDetailType value) {
        this.callsignDetail = value;
    }

    @Transient
    public boolean isSetCallsignDetail() {
        return (this.callsignDetail!= null);
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
        final CallsignDetailPropertyType that = ((CallsignDetailPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetCallsignDetail();
            boolean rhsFieldIsSet = that.isSetCallsignDetail();
            CallsignDetailType lhsField;
            lhsField = this.getCallsignDetail();
            CallsignDetailType rhsField;
            rhsField = that.getCallsignDetail();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "callsignDetail", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "callsignDetail", rhsField);
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
            boolean theFieldIsSet = this.isSetCallsignDetail();
            CallsignDetailType theField;
            theField = this.getCallsignDetail();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "callsignDetail", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCallsignDetail();
            CallsignDetailType theField;
            theField = this.getCallsignDetail();
            strategy.appendField(locator, this, "callsignDetail", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
