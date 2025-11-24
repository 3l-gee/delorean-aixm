
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for GeodesicStringType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeodesicStringType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       <choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *         <group ref="{http://www.opengis.net/gml/3.2}geometricPositionGroup" maxOccurs="unbounded" minOccurs="2"/>
 *       </choice>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="geodesic" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodesicStringType", propOrder = {
    "posList",
    "geometricPositionGroup"
})
@XmlSeeAlso({
    GeodesicType.class
})
public class GeodesicStringType
    extends AbstractCurveSegmentType
{

    protected DirectPositionListType posList;
    @XmlElements({
        @XmlElement(name = "pos", type = DirectPositionType.class),
        @XmlElement(name = "pointProperty", type = PointPropertyType.class)
    })
    protected List<Object> geometricPositionGroup;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;

    /**
     * Gets the value of the posList property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
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
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.GEODESIC;
        } else {
            return interpolation;
        }
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
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
        final GeodesicStringType that = ((GeodesicStringType) object);
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
        {
            boolean lhsFieldIsSet = (this.interpolation!= null);
            boolean rhsFieldIsSet = (that.interpolation!= null);
            CurveInterpolationType lhsField;
            lhsField = this.getInterpolation();
            CurveInterpolationType rhsField;
            rhsField = that.getInterpolation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interpolation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interpolation", rhsField);
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
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpolation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
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
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
