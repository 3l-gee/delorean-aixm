
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TimeNodeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeNodeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeTopologyPrimitiveType">
 *       <sequence>
 *         <element name="previousEdge" type="{http://www.opengis.net/gml/3.2}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nextEdge" type="{http://www.opengis.net/gml/3.2}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="position" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeNodeType", propOrder = {
    "previousEdge",
    "nextEdge",
    "position"
})
public class TimeNodeType
    extends AbstractTimeTopologyPrimitiveType
{

    protected List<TimeEdgePropertyType> previousEdge;
    protected List<TimeEdgePropertyType> nextEdge;
    protected TimeInstantPropertyType position;

    /**
     * Gets the value of the previousEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
     * 
     * 
     */
    public List<TimeEdgePropertyType> getPreviousEdge() {
        if (previousEdge == null) {
            previousEdge = new ArrayList<>();
        }
        return this.previousEdge;
    }

    /**
     * 
     * 
     */
    public void setPreviousEdge(List<TimeEdgePropertyType> previousEdge) {
        this.previousEdge = previousEdge;
    }

    /**
     * Gets the value of the nextEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
     * 
     * 
     */
    public List<TimeEdgePropertyType> getNextEdge() {
        if (nextEdge == null) {
            nextEdge = new ArrayList<>();
        }
        return this.nextEdge;
    }

    /**
     * 
     * 
     */
    public void setNextEdge(List<TimeEdgePropertyType> nextEdge) {
        this.nextEdge = nextEdge;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setPosition(TimeInstantPropertyType value) {
        this.position = value;
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
        final TimeNodeType that = ((TimeNodeType) object);
        {
            boolean lhsFieldIsSet = (this.position!= null);
            boolean rhsFieldIsSet = (that.position!= null);
            TimeInstantPropertyType lhsField;
            lhsField = this.getPosition();
            TimeInstantPropertyType rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()));
            boolean rhsFieldIsSet = ((that.previousEdge!= null)&&(!that.previousEdge.isEmpty()));
            List<TimeEdgePropertyType> lhsField;
            lhsField = (((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()))?this.getPreviousEdge():null);
            List<TimeEdgePropertyType> rhsField;
            rhsField = (((that.previousEdge!= null)&&(!that.previousEdge.isEmpty()))?that.getPreviousEdge():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "previousEdge", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "previousEdge", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()));
            boolean rhsFieldIsSet = ((that.nextEdge!= null)&&(!that.nextEdge.isEmpty()));
            List<TimeEdgePropertyType> lhsField;
            lhsField = (((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()))?this.getNextEdge():null);
            List<TimeEdgePropertyType> rhsField;
            rhsField = (((that.nextEdge!= null)&&(!that.nextEdge.isEmpty()))?that.getNextEdge():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nextEdge", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nextEdge", rhsField);
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
            boolean theFieldIsSet = ((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()));
            List<TimeEdgePropertyType> theField;
            theField = (((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()))?this.getPreviousEdge():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "previousEdge", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()));
            List<TimeEdgePropertyType> theField;
            theField = (((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()))?this.getNextEdge():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nextEdge", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.position!= null);
            TimeInstantPropertyType theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()));
            List<TimeEdgePropertyType> theField;
            theField = (((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()))?this.getPreviousEdge():null);
            strategy.appendField(locator, this, "previousEdge", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()));
            List<TimeEdgePropertyType> theField;
            theField = (((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()))?this.getNextEdge():null);
            strategy.appendField(locator, this, "nextEdge", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.position!= null);
            TimeInstantPropertyType theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
