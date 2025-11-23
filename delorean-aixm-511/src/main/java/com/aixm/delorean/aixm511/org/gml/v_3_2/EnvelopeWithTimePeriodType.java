
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for EnvelopeWithTimePeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnvelopeWithTimePeriodType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}EnvelopeType">
 *       <sequence>
 *         <element name="beginPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *         <element name="endPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *       </sequence>
 *       <attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeWithTimePeriodType", propOrder = {
    "beginPosition",
    "endPosition"
})
public class EnvelopeWithTimePeriodType
    extends EnvelopeType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected TimePositionType beginPosition;
    @XmlElement(required = true)
    protected TimePositionType endPosition;
    @XmlAttribute(name = "frame")
    @XmlSchemaType(name = "anyURI")
    protected String frame;

    /**
     * Gets the value of the beginPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getBeginPosition() {
        return beginPosition;
    }

    /**
     * Sets the value of the beginPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setBeginPosition(TimePositionType value) {
        this.beginPosition = value;
    }

    public boolean isSetBeginPosition() {
        return (this.beginPosition!= null);
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setEndPosition(TimePositionType value) {
        this.endPosition = value;
    }

    public boolean isSetEndPosition() {
        return (this.endPosition!= null);
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        if (frame == null) {
            return "#ISO-8601";
        } else {
            return frame;
        }
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    public boolean isSetFrame() {
        return (this.frame!= null);
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
        final EnvelopeWithTimePeriodType that = ((EnvelopeWithTimePeriodType) object);
        {
            boolean lhsFieldIsSet = this.isSetBeginPosition();
            boolean rhsFieldIsSet = that.isSetBeginPosition();
            TimePositionType lhsField;
            lhsField = this.getBeginPosition();
            TimePositionType rhsField;
            rhsField = that.getBeginPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "beginPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "beginPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndPosition();
            boolean rhsFieldIsSet = that.isSetEndPosition();
            TimePositionType lhsField;
            lhsField = this.getEndPosition();
            TimePositionType rhsField;
            rhsField = that.getEndPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrame();
            boolean rhsFieldIsSet = that.isSetFrame();
            String lhsField;
            lhsField = this.getFrame();
            String rhsField;
            rhsField = that.getFrame();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frame", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frame", rhsField);
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
            boolean theFieldIsSet = this.isSetBeginPosition();
            TimePositionType theField;
            theField = this.getBeginPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "beginPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            TimePositionType theField;
            theField = this.getEndPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrame();
            String theField;
            theField = this.getFrame();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frame", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBeginPosition();
            TimePositionType theField;
            theField = this.getBeginPosition();
            strategy.appendField(locator, this, "beginPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            TimePositionType theField;
            theField = this.getEndPosition();
            strategy.appendField(locator, this, "endPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrame();
            String theField;
            theField = this.getFrame();
            strategy.appendField(locator, this, "frame", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
