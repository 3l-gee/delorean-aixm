
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
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
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
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

    public boolean isSetRelatedTime() {
        return ((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()));
    }

    public void unsetRelatedTime() {
        this.relatedTime = null;
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

    public boolean isSetStart() {
        return (this.start!= null);
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

    public boolean isSetEnd() {
        return (this.end!= null);
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

    public boolean isSetExtent() {
        return (this.extent!= null);
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

    public boolean isSetMember() {
        return ((this.member!= null)&&(!this.member.isEmpty()));
    }

    public void unsetMember() {
        this.member = null;
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

    public boolean isSetGroup() {
        return (this.group!= null);
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
            boolean lhsFieldIsSet = this.isSetMember();
            boolean rhsFieldIsSet = that.isSetMember();
            List<TimeOrdinalEraPropertyType> lhsField;
            lhsField = (this.isSetMember()?this.getMember():null);
            List<TimeOrdinalEraPropertyType> rhsField;
            rhsField = (that.isSetMember()?that.getMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "member", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "member", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelatedTime();
            boolean rhsFieldIsSet = that.isSetRelatedTime();
            List<RelatedTimeType> lhsField;
            lhsField = (this.isSetRelatedTime()?this.getRelatedTime():null);
            List<RelatedTimeType> rhsField;
            rhsField = (that.isSetRelatedTime()?that.getRelatedTime():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relatedTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relatedTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
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
            boolean lhsFieldIsSet = this.isSetGroup();
            boolean rhsFieldIsSet = that.isSetGroup();
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
            boolean lhsFieldIsSet = this.isSetEnd();
            boolean rhsFieldIsSet = that.isSetEnd();
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
        {
            boolean lhsFieldIsSet = this.isSetStart();
            boolean rhsFieldIsSet = that.isSetStart();
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetRelatedTime();
            List<RelatedTimeType> theField;
            theField = (this.isSetRelatedTime()?this.getRelatedTime():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relatedTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStart();
            TimeNodePropertyType theField;
            theField = this.getStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "start", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            TimeNodePropertyType theField;
            theField = this.getEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "end", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMember();
            List<TimeOrdinalEraPropertyType> theField;
            theField = (this.isSetMember()?this.getMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "member", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
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
            boolean theFieldIsSet = this.isSetRelatedTime();
            List<RelatedTimeType> theField;
            theField = (this.isSetRelatedTime()?this.getRelatedTime():null);
            strategy.appendField(locator, this, "relatedTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStart();
            TimeNodePropertyType theField;
            theField = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            TimeNodePropertyType theField;
            theField = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMember();
            List<TimeOrdinalEraPropertyType> theField;
            theField = (this.isSetMember()?this.getMember():null);
            strategy.appendField(locator, this, "member", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            ReferenceType theField;
            theField = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
