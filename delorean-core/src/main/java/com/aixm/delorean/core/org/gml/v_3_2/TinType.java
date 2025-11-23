
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
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
{

    protected List<LineStringSegmentArrayPropertyType> stopLines;
    protected List<LineStringSegmentArrayPropertyType> breakLines;
    @XmlElement(required = true)
    protected LengthType maxLength;
    @XmlElement(required = true)
    protected TinType.ControlPoint controlPoint;

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

    /**
     * Gets the value of the controlPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TinType.ControlPoint }
     *     
     */
    public TinType.ControlPoint getControlPoint() {
        return controlPoint;
    }

    /**
     * Sets the value of the controlPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TinType.ControlPoint }
     *     
     */
    public void setControlPoint(TinType.ControlPoint value) {
        this.controlPoint = value;
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
            boolean lhsFieldIsSet = (this.maxLength!= null);
            boolean rhsFieldIsSet = (that.maxLength!= null);
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
            boolean lhsFieldIsSet = (this.controlPoint!= null);
            boolean rhsFieldIsSet = (that.controlPoint!= null);
            TinType.ControlPoint lhsField;
            lhsField = this.getControlPoint();
            TinType.ControlPoint rhsField;
            rhsField = that.getControlPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.stopLines!= null)&&(!this.stopLines.isEmpty()));
            boolean rhsFieldIsSet = ((that.stopLines!= null)&&(!that.stopLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> lhsField;
            lhsField = (((this.stopLines!= null)&&(!this.stopLines.isEmpty()))?this.getStopLines():null);
            List<LineStringSegmentArrayPropertyType> rhsField;
            rhsField = (((that.stopLines!= null)&&(!that.stopLines.isEmpty()))?that.getStopLines():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "stopLines", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "stopLines", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.breakLines!= null)&&(!this.breakLines.isEmpty()));
            boolean rhsFieldIsSet = ((that.breakLines!= null)&&(!that.breakLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> lhsField;
            lhsField = (((this.breakLines!= null)&&(!this.breakLines.isEmpty()))?this.getBreakLines():null);
            List<LineStringSegmentArrayPropertyType> rhsField;
            rhsField = (((that.breakLines!= null)&&(!that.breakLines.isEmpty()))?that.getBreakLines():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "breakLines", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "breakLines", rhsField);
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
            boolean theFieldIsSet = ((this.stopLines!= null)&&(!this.stopLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (((this.stopLines!= null)&&(!this.stopLines.isEmpty()))?this.getStopLines():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "stopLines", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.breakLines!= null)&&(!this.breakLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (((this.breakLines!= null)&&(!this.breakLines.isEmpty()))?this.getBreakLines():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "breakLines", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maxLength!= null);
            LengthType theField;
            theField = this.getMaxLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxLength", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.controlPoint!= null);
            TinType.ControlPoint theField;
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
            boolean theFieldIsSet = ((this.stopLines!= null)&&(!this.stopLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (((this.stopLines!= null)&&(!this.stopLines.isEmpty()))?this.getStopLines():null);
            strategy.appendField(locator, this, "stopLines", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.breakLines!= null)&&(!this.breakLines.isEmpty()));
            List<LineStringSegmentArrayPropertyType> theField;
            theField = (((this.breakLines!= null)&&(!this.breakLines.isEmpty()))?this.getBreakLines():null);
            strategy.appendField(locator, this, "breakLines", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maxLength!= null);
            LengthType theField;
            theField = this.getMaxLength();
            strategy.appendField(locator, this, "maxLength", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.controlPoint!= null);
            TinType.ControlPoint theField;
            theField = this.getControlPoint();
            strategy.appendField(locator, this, "controlPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element ref="{http://www.opengis.net/gml/3.2}posList"/>
     *         <group ref="{http://www.opengis.net/gml/3.2}geometricPositionGroup" maxOccurs="unbounded" minOccurs="3"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "posList",
        "geometricPositionGroup"
    })
    @Entity(name = "TinType$ControlPoint")
    @Table(name = "CONTROL_POINT")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class ControlPoint implements Equals, HashCode, ToString
    {

        protected DirectPositionListType posList;
        @XmlElements({
            @XmlElement(name = "pos", type = DirectPositionType.class),
            @XmlElement(name = "pointProperty", type = PointPropertyType.class)
        })
        protected List<Object> geometricPositionGroup;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the posList property.
         * 
         * @return
         *     possible object is
         *     {@link DirectPositionListType }
         *     
         */
        @Transient
        public DirectPositionListType getPosList() {
            return posList;
        }

        /**
         * Sets the value of the posList property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectPositionListType }
         *     
         */
        public void setPosList(DirectPositionListType value) {
            this.posList = value;
        }

        /**
         * GML supports two different ways to specify a geometric position: either by a direct position (a data type) or a point (a geometric object).
         * pos elements are positions that are "owned" by the geometric primitive encapsulating this geometric position.
         * pointProperty elements contain a point that may be referenced from other geometry elements or reference another point defined elsewhere (reuse of existing points).Gets the value of the geometricPositionGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geometricPositionGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeometricPositionGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DirectPositionType }
         * {@link PointPropertyType }
         * 
         * 
         */
        @Transient
        public List<Object> getGeometricPositionGroup() {
            if (geometricPositionGroup == null) {
                geometricPositionGroup = new ArrayList<>();
            }
            return this.geometricPositionGroup;
        }

        /**
         * GML supports two different ways to specify a geometric position: either by a direct position (a data type) or a point (a geometric object).
         * pos elements are positions that are "owned" by the geometric primitive encapsulating this geometric position.
         * pointProperty elements contain a point that may be referenced from other geometry elements or reference another point defined elsewhere (reuse of existing points).
         * 
         */
        public void setGeometricPositionGroup(List<Object> geometricPositionGroup) {
            this.geometricPositionGroup = geometricPositionGroup;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Override
        public boolean equals(Object object) {
            ObjectLocator thisLocator = null;
            ObjectLocator thatLocator = null;
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                thisLocator = new DefaultRootObjectLocator(this);
                thatLocator = new DefaultRootObjectLocator(object);
            }
            return equals(thisLocator, thatLocator, object, strategy);
        }

        @Override
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TinType.ControlPoint that = ((TinType.ControlPoint) object);
            {
                boolean lhsFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                boolean rhsFieldIsSet = ((that.geometricPositionGroup!= null)&&(!that.geometricPositionGroup.isEmpty()));
                List<Object> lhsField;
                lhsField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                List<Object> rhsField;
                rhsField = (((that.geometricPositionGroup!= null)&&(!that.geometricPositionGroup.isEmpty()))?that.getGeometricPositionGroup():null);
                ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometricPositionGroup", lhsField);
                ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometricPositionGroup", rhsField);
                if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                    return false;
                }
            }
            {
                boolean lhsFieldIsSet = (this.posList!= null);
                boolean rhsFieldIsSet = (that.posList!= null);
                DirectPositionListType lhsField;
                lhsField = this.getPosList();
                DirectPositionListType rhsField;
                rhsField = that.getPosList();
                ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "posList", lhsField);
                ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "posList", rhsField);
                if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            ObjectLocator theLocator = null;
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            return this.hashCode(theLocator, strategy);
        }

        @Override
        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                boolean theFieldIsSet = (this.posList!= null);
                DirectPositionListType theField;
                theField = this.getPosList();
                ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posList", theField);
                currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
            }
            {
                boolean theFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                List<Object> theField;
                theField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometricPositionGroup", theField);
                currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
            }
            return currentHashCode;
        }

        @Override
        public String toString() {
            ObjectLocator theLocator = null;
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            if (strategy.isTraceEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            final StringBuilder buffer = new StringBuilder();
            append(theLocator, buffer, strategy);
            return buffer.toString();
        }

        @Override
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                boolean theFieldIsSet = (this.posList!= null);
                DirectPositionListType theField;
                theField = this.getPosList();
                strategy.appendField(locator, this, "posList", buffer, theField, theFieldIsSet);
            }
            {
                boolean theFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                List<Object> theField;
                theField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                strategy.appendField(locator, this, "geometricPositionGroup", buffer, theField, theFieldIsSet);
            }
            return buffer;
        }

    }

}
