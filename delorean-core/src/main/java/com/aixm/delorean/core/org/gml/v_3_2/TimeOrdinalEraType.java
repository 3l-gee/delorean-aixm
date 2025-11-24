
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
 * <p>Java class for TimeOrdinalEraType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeOrdinalEraType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       <sequence>
 *         <element name="relatedTime" type="{http://www.opengis.net/gml/3.2}RelatedTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/>
 *         <element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/>
 *         <element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         <element name="member" type="{http://www.opengis.net/gml/3.2}TimeOrdinalEraPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="group" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalEraType", propOrder = {
    "relatedTime",
    "start",
    "end",
    "extent",
    "member",
    "group"
})
public class TimeOrdinalEraType
    extends DefinitionType
{

    protected List<RelatedTimeType> relatedTime;
    protected TimeNodePropertyType start;
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;
    protected List<TimeOrdinalEraPropertyType> member;
    protected ReferenceType group;

    /**
     * Gets the value of the relatedTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTimeType }
     * 
     * 
     */
    public List<RelatedTimeType> getRelatedTime() {
        if (relatedTime == null) {
            relatedTime = new ArrayList<>();
        }
        return this.relatedTime;
    }

    /**
     * 
     * 
     */
    public void setRelatedTime(List<RelatedTimeType> relatedTime) {
        this.relatedTime = relatedTime;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
     * 
     * 
     */
    public List<TimeOrdinalEraPropertyType> getMember() {
        if (member == null) {
            member = new ArrayList<>();
        }
        return this.member;
    }

    /**
     * 
     * 
     */
    public void setMember(List<TimeOrdinalEraPropertyType> member) {
        this.member = member;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGroup(ReferenceType value) {
        this.group = value;
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
        final TimeOrdinalEraType that = ((TimeOrdinalEraType) object);
        {
            boolean lhsFieldIsSet = ((this.member!= null)&&(!this.member.isEmpty()));
            boolean rhsFieldIsSet = ((that.member!= null)&&(!that.member.isEmpty()));
            List<TimeOrdinalEraPropertyType> lhsField;
            lhsField = (((this.member!= null)&&(!this.member.isEmpty()))?this.getMember():null);
            List<TimeOrdinalEraPropertyType> rhsField;
            rhsField = (((that.member!= null)&&(!that.member.isEmpty()))?that.getMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "member", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "member", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.group!= null);
            boolean rhsFieldIsSet = (that.group!= null);
            ReferenceType lhsField;
            lhsField = this.getGroup();
            ReferenceType rhsField;
            rhsField = that.getGroup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "group", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "group", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.extent!= null);
            boolean rhsFieldIsSet = (that.extent!= null);
            TimePeriodPropertyType lhsField;
            lhsField = this.getExtent();
            TimePeriodPropertyType rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.start!= null);
            boolean rhsFieldIsSet = (that.start!= null);
            TimeNodePropertyType lhsField;
            lhsField = this.getStart();
            TimeNodePropertyType rhsField;
            rhsField = that.getStart();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "start", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "start", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()));
            boolean rhsFieldIsSet = ((that.relatedTime!= null)&&(!that.relatedTime.isEmpty()));
            List<RelatedTimeType> lhsField;
            lhsField = (((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()))?this.getRelatedTime():null);
            List<RelatedTimeType> rhsField;
            rhsField = (((that.relatedTime!= null)&&(!that.relatedTime.isEmpty()))?that.getRelatedTime():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relatedTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relatedTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.end!= null);
            boolean rhsFieldIsSet = (that.end!= null);
            TimeNodePropertyType lhsField;
            lhsField = this.getEnd();
            TimeNodePropertyType rhsField;
            rhsField = that.getEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "end", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "end", rhsField);
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
            boolean theFieldIsSet = ((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()));
            List<RelatedTimeType> theField;
            theField = (((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()))?this.getRelatedTime():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relatedTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.start!= null);
            TimeNodePropertyType theField;
            theField = this.getStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "start", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.end!= null);
            TimeNodePropertyType theField;
            theField = this.getEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "end", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.member!= null)&&(!this.member.isEmpty()));
            List<TimeOrdinalEraPropertyType> theField;
            theField = (((this.member!= null)&&(!this.member.isEmpty()))?this.getMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "member", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.group!= null);
            ReferenceType theField;
            theField = this.getGroup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "group", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()));
            List<RelatedTimeType> theField;
            theField = (((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()))?this.getRelatedTime():null);
            strategy.appendField(locator, this, "relatedTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.start!= null);
            TimeNodePropertyType theField;
            theField = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.end!= null);
            TimeNodePropertyType theField;
            theField = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.member!= null)&&(!this.member.isEmpty()));
            List<TimeOrdinalEraPropertyType> theField;
            theField = (((this.member!= null)&&(!this.member.isEmpty()))?this.getMember():null);
            strategy.appendField(locator, this, "member", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.group!= null);
            ReferenceType theField;
            theField = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
