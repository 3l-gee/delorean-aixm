
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ArcByCenterPointType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArcByCenterPointType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       <sequence>
 *         <choice>
 *           <choice>
 *             <element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           </choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         </choice>
 *         <element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         <element name="startAngle" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         <element name="endAngle" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArcCenterPointWithRadius" />
 *       <attribute name="numArc" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByCenterPointType", propOrder = {
    "pos",
    "pointProperty",
    "pointRep",
    "posList",
    "coordinates",
    "radius",
    "startAngle",
    "endAngle"
})
@XmlSeeAlso({
    CircleByCenterPointType.class
})
public class ArcByCenterPointType
    extends AbstractCurveSegmentType
{

    protected DirectPositionType pos;
    /**
     * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
     * 
     */
    protected PointPropertyType pointProperty;
    protected PointPropertyType pointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected LengthType radius;
    protected AngleType startAngle;
    protected AngleType endAngle;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;
    @XmlAttribute(name = "numArc", required = true)
    protected BigInteger numArc;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    /**
     * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Sets the value of the pointProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     * @see #getPointProperty()
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    /**
     * Gets the value of the pointRep property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointRep() {
        return pointRep;
    }

    /**
     * Sets the value of the pointRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointRep(PointPropertyType value) {
        this.pointRep = value;
    }

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
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    /**
     * Gets the value of the startAngle property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getStartAngle() {
        return startAngle;
    }

    /**
     * Sets the value of the startAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setStartAngle(AngleType value) {
        this.startAngle = value;
    }

    /**
     * Gets the value of the endAngle property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getEndAngle() {
        return endAngle;
    }

    /**
     * Sets the value of the endAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setEndAngle(AngleType value) {
        this.endAngle = value;
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
            return CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
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

    /**
     * Gets the value of the numArc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumArc() {
        if (numArc == null) {
            return new BigInteger("1");
        } else {
            return numArc;
        }
    }

    /**
     * Sets the value of the numArc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumArc(BigInteger value) {
        this.numArc = value;
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
        final ArcByCenterPointType that = ((ArcByCenterPointType) object);
        {
            boolean lhsFieldIsSet = (this.numArc!= null);
            boolean rhsFieldIsSet = (that.numArc!= null);
            BigInteger lhsField;
            lhsField = this.getNumArc();
            BigInteger rhsField;
            rhsField = that.getNumArc();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numArc", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numArc", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.endAngle!= null);
            boolean rhsFieldIsSet = (that.endAngle!= null);
            AngleType lhsField;
            lhsField = this.getEndAngle();
            AngleType rhsField;
            rhsField = that.getEndAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.coordinates!= null);
            boolean rhsFieldIsSet = (that.coordinates!= null);
            CoordinatesType lhsField;
            lhsField = this.getCoordinates();
            CoordinatesType rhsField;
            rhsField = that.getCoordinates();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coordinates", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coordinates", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.radius!= null);
            boolean rhsFieldIsSet = (that.radius!= null);
            LengthType lhsField;
            lhsField = this.getRadius();
            LengthType rhsField;
            rhsField = that.getRadius();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radius", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radius", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.pointRep!= null);
            boolean rhsFieldIsSet = (that.pointRep!= null);
            PointPropertyType lhsField;
            lhsField = this.getPointRep();
            PointPropertyType rhsField;
            rhsField = that.getPointRep();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointRep", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointRep", rhsField);
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
            boolean lhsFieldIsSet = (this.pos!= null);
            boolean rhsFieldIsSet = (that.pos!= null);
            DirectPositionType lhsField;
            lhsField = this.getPos();
            DirectPositionType rhsField;
            rhsField = that.getPos();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pos", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pos", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.pointProperty!= null);
            boolean rhsFieldIsSet = (that.pointProperty!= null);
            PointPropertyType lhsField;
            lhsField = this.getPointProperty();
            PointPropertyType rhsField;
            rhsField = that.getPointProperty();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointProperty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointProperty", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.startAngle!= null);
            boolean rhsFieldIsSet = (that.startAngle!= null);
            AngleType lhsField;
            lhsField = this.getStartAngle();
            AngleType rhsField;
            rhsField = that.getStartAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startAngle", rhsField);
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
            boolean theFieldIsSet = (this.pos!= null);
            DirectPositionType theField;
            theField = this.getPos();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pos", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.pointProperty!= null);
            PointPropertyType theField;
            theField = this.getPointProperty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointProperty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.pointRep!= null);
            PointPropertyType theField;
            theField = this.getPointRep();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointRep", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.posList!= null);
            DirectPositionListType theField;
            theField = this.getPosList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.coordinates!= null);
            CoordinatesType theField;
            theField = this.getCoordinates();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinates", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.radius!= null);
            LengthType theField;
            theField = this.getRadius();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radius", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.startAngle!= null);
            AngleType theField;
            theField = this.getStartAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.endAngle!= null);
            AngleType theField;
            theField = this.getEndAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpolation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.numArc!= null);
            BigInteger theField;
            theField = this.getNumArc();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numArc", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.pos!= null);
            DirectPositionType theField;
            theField = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.pointProperty!= null);
            PointPropertyType theField;
            theField = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.pointRep!= null);
            PointPropertyType theField;
            theField = this.getPointRep();
            strategy.appendField(locator, this, "pointRep", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.posList!= null);
            DirectPositionListType theField;
            theField = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.coordinates!= null);
            CoordinatesType theField;
            theField = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.radius!= null);
            LengthType theField;
            theField = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.startAngle!= null);
            AngleType theField;
            theField = this.getStartAngle();
            strategy.appendField(locator, this, "startAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.endAngle!= null);
            AngleType theField;
            theField = this.getEndAngle();
            strategy.appendField(locator, this, "endAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.numArc!= null);
            BigInteger theField;
            theField = this.getNumArc();
            strategy.appendField(locator, this, "numArc", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
