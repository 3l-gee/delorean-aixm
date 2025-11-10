
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * <p>Java class for UsageConditionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UsageConditionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUsageCondition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageConditionPropertyType", propOrder = {
    "abstractUsageCondition"
})
@Entity(name = "UsageConditionPropertyType")
@Table(name = "usagecondition_pt", schema = "airport_heliport")
public class UsageConditionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractUsageCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractUsageConditionType> abstractUsageCondition;

    /**
     * Gets the value of the abstractUsageCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractUsageConditionType> getAbstractUsageCondition() {
        return abstractUsageCondition;
    }

    /**
     * Sets the value of the abstractUsageCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     
     */
    public void setAbstractUsageCondition(JAXBElement<? extends AbstractUsageConditionType> value) {
        this.abstractUsageCondition = value;
    }

    @Transient
    public boolean isSetAbstractUsageCondition() {
        return (this.abstractUsageCondition!= null);
    }

    @Basic
    @Column(name = "ABSTRACT_USAGE_CONDITION_NAME")
    public String getAbstractUsageConditionName() {
        if (this.getAbstractUsageCondition() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractUsageConditionType.class, this.getAbstractUsageCondition());
        } else {
            return null;
        }
    }

    public void setAbstractUsageConditionName(String target) {
        if (target!= null) {
            setAbstractUsageCondition(JAXBElementUtils.wrap(this.getAbstractUsageCondition(), target, AbstractUsageConditionType.class));
        }
    }

@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "usage_condition_id", referencedColumnName = "hjid")
    public AbstractUsageConditionType getAbstractUsageConditionValue() {
        if (this.getAbstractUsageCondition() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractUsageConditionType.class, this.getAbstractUsageCondition());
        } else {
            return null;
        }
    }

    public void setAbstractUsageConditionValue(AbstractUsageConditionType target) {
        if (target!= null) {
            setAbstractUsageCondition(JAXBElementUtils.wrap(this.getAbstractUsageCondition(), target));
        }
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
        final UsageConditionPropertyType that = ((UsageConditionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractUsageCondition();
            boolean rhsFieldIsSet = that.isSetAbstractUsageCondition();
            JAXBElement<? extends AbstractUsageConditionType> lhsField;
            lhsField = this.getAbstractUsageCondition();
            JAXBElement<? extends AbstractUsageConditionType> rhsField;
            rhsField = that.getAbstractUsageCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractUsageCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractUsageCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractUsageCondition();
            JAXBElement<? extends AbstractUsageConditionType> theField;
            theField = this.getAbstractUsageCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractUsageCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractUsageCondition();
            JAXBElement<? extends AbstractUsageConditionType> theField;
            theField = this.getAbstractUsageCondition();
            strategy.appendField(locator, this, "abstractUsageCondition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
