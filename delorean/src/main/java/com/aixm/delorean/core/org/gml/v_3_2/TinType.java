
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for TinType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TinType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}SurfaceType">
 *       <sequence>
 *         <element name="stopLines" type="{http://www.opengis.net/gml/3.2}LineStringSegmentArrayPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="breakLines" type="{http://www.opengis.net/gml/3.2}LineStringSegmentArrayPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxLength" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         <element name="controlPoint">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *                   <group ref="{http://www.opengis.net/gml/3.2}geometricPositionGroup" maxOccurs="unbounded" minOccurs="3"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TinType", propOrder = {
    "stopLines",
    "breakLines",
    "maxLength",
    "controlPoint"
})
public class TinType
    extends SurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<LineStringSegmentArrayPropertyType> stopLines;
    protected List<LineStringSegmentArrayPropertyType> breakLines;
    @XmlElement(required = true)
    protected LengthType maxLength;
    @XmlElement(required = true)
    protected ControlPoint controlPoint;

    /**
     * Gets the value of the stopLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineStringSegmentArrayPropertyType }
     * 
     * 
     */
    public List<LineStringSegmentArrayPropertyType> getStopLines() {
        if (stopLines == null) {
            stopLines = new ArrayList<>();
        }
        return this.stopLines;
    }

    /**
     * 
     * 
     */
    public void setStopLines(List<LineStringSegmentArrayPropertyType> stopLines) {
        this.stopLines = stopLines;
    }

    public boolean isSetStopLines() {
        return ((this.stopLines!= null)&&(!this.stopLines.isEmpty()));
    }

    public void unsetStopLines() {
        this.stopLines = null;
    }

    /**
     * Gets the value of the breakLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineStringSegmentArrayPropertyType }
     * 
     * 
     */
    public List<LineStringSegmentArrayPropertyType> getBreakLines() {
        if (breakLines == null) {
            breakLines = new ArrayList<>();
        }
        return this.breakLines;
    }

    /**
     * 
     * 
     */
    public void setBreakLines(List<LineStringSegmentArrayPropertyType> breakLines) {
        this.breakLines = breakLines;
    }

    public boolean isSetBreakLines() {
        return ((this.breakLines!= null)&&(!this.breakLines.isEmpty()));
    }

    public void unsetBreakLines() {
        this.breakLines = null;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaxLength(LengthType value) {
        this.maxLength = value;
    }

    public boolean isSetMaxLength() {
        return (this.maxLength!= null);
    }

    /**
     * Gets the value of the controlPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ControlPoint }
     *     
     */
    public ControlPoint getControlPoint() {
        return controlPoint;
    }

    /**
     * Sets the value of the controlPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlPoint }
     *     
     */
    public void setControlPoint(ControlPoint value) {
        this.controlPoint = value;
    }

    public boolean isSetControlPoint() {
        return (this.controlPoint!= null);
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
        final TinType that = ((TinType) object);
        {
            boolean lhsFieldIsSet = this.isSetStopLines();
            boolean rhsFieldIsSet = that.isSetStopLines();
            List<LineStringSegmentArrayPropertyType> lhsField;
            lhsField = (this.isSetStopLines()?this.getStopLines():null);
            List<LineStringSegmentArrayPropertyType> rhsField;
            rhsField = (that.isSetStopLines()?that.getStopLines():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "stopLines", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "stopLines", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaxLength();
            boolean rhsFieldIsSet = that.isSetMaxLength();
            LengthType lhsField;
            lhsField = this.getMaxLength();
            LengthType rhsField;
            rhsField = that.getMaxLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxLength", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxLength", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBreakLines();
            boolean rhsFieldIsSet = that.isSetBreakLines();
            List<LineStringSegmentArrayPropertyType> lhsField;
            lhsField = (this.isSetBreakLines()?this.getBreakLines():null);
            List<LineStringSegmentArrayPropertyType> rhsField;
            rhsField = (that.isSetBreakLines()?that.getBreakLines():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "breakLines", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "breakLines", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetControlPoint();
            boolean rhsFieldIsSet = that.isSetControlPoint();
            ControlPoint lhsField;
            lhsField = this.getControlPoint();
            ControlPoint rhsField;
            rhsField = that.getControlPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetStopLines();
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (this.isSetStopLines()?this.getStopLines():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "stopLines", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBreakLines();
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (this.isSetBreakLines()?this.getBreakLines():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "breakLines", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxLength();
            LengthType theField;
            theField = this.getMaxLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlPoint();
            ControlPoint theField;
            theField = this.getControlPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetStopLines();
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (this.isSetStopLines()?this.getStopLines():null);
            strategy.appendField(locator, this, "stopLines", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBreakLines();
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (this.isSetBreakLines()?this.getBreakLines():null);
            strategy.appendField(locator, this, "breakLines", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxLength();
            LengthType theField;
            theField = this.getMaxLength();
            strategy.appendField(locator, this, "maxLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlPoint();
            ControlPoint theField;
            theField = this.getControlPoint();
            strategy.appendField(locator, this, "controlPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
