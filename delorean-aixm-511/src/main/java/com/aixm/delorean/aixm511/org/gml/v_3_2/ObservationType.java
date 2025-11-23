
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ObservationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObservationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}validTime"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}using" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}target" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}resultOf"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationType", propOrder = {
    "validTime",
    "using",
    "target",
    "resultOf"
})
@XmlSeeAlso({
    DirectedObservationType.class
})
public class ObservationType
    extends AbstractFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * gml:validTime is a convenience property element.
     * 
     */
    @XmlElement(required = true)
    protected TimePrimitivePropertyType validTime;
    protected ProcedurePropertyType using;
    @XmlElementRef(name = "target", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TargetPropertyType> target;
    @XmlElement(required = true)
    protected ResultType resultOf;

    /**
     * gml:validTime is a convenience property element.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     * @see #getValidTime()
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    public boolean isSetValidTime() {
        return (this.validTime!= null);
    }

    /**
     * Gets the value of the using property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public ProcedurePropertyType getUsing() {
        return using;
    }

    /**
     * Sets the value of the using property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public void setUsing(ProcedurePropertyType value) {
        this.using = value;
    }

    public boolean isSetUsing() {
        return (this.using!= null);
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public JAXBElement<TargetPropertyType> getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public void setTarget(JAXBElement<TargetPropertyType> value) {
        this.target = value;
    }

    public boolean isSetTarget() {
        return (this.target!= null);
    }

    /**
     * Gets the value of the resultOf property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResultOf() {
        return resultOf;
    }

    /**
     * Sets the value of the resultOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResultOf(ResultType value) {
        this.resultOf = value;
    }

    public boolean isSetResultOf() {
        return (this.resultOf!= null);
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
        final ObservationType that = ((ObservationType) object);
        {
            boolean lhsFieldIsSet = this.isSetTarget();
            boolean rhsFieldIsSet = that.isSetTarget();
            JAXBElement<TargetPropertyType> lhsField;
            lhsField = this.getTarget();
            JAXBElement<TargetPropertyType> rhsField;
            rhsField = that.getTarget();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "target", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "target", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetResultOf();
            boolean rhsFieldIsSet = that.isSetResultOf();
            ResultType lhsField;
            lhsField = this.getResultOf();
            ResultType rhsField;
            rhsField = that.getResultOf();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resultOf", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resultOf", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValidTime();
            boolean rhsFieldIsSet = that.isSetValidTime();
            TimePrimitivePropertyType lhsField;
            lhsField = this.getValidTime();
            TimePrimitivePropertyType rhsField;
            rhsField = that.getValidTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "validTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "validTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUsing();
            boolean rhsFieldIsSet = that.isSetUsing();
            ProcedurePropertyType lhsField;
            lhsField = this.getUsing();
            ProcedurePropertyType rhsField;
            rhsField = that.getUsing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "using", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "using", rhsField);
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
            boolean theFieldIsSet = this.isSetValidTime();
            TimePrimitivePropertyType theField;
            theField = this.getValidTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "validTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsing();
            ProcedurePropertyType theField;
            theField = this.getUsing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "using", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTarget();
            JAXBElement<TargetPropertyType> theField;
            theField = this.getTarget();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "target", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResultOf();
            ResultType theField;
            theField = this.getResultOf();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resultOf", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetValidTime();
            TimePrimitivePropertyType theField;
            theField = this.getValidTime();
            strategy.appendField(locator, this, "validTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsing();
            ProcedurePropertyType theField;
            theField = this.getUsing();
            strategy.appendField(locator, this, "using", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTarget();
            JAXBElement<TargetPropertyType> theField;
            theField = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResultOf();
            ResultType theField;
            theField = this.getResultOf();
            strategy.appendField(locator, this, "resultOf", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
