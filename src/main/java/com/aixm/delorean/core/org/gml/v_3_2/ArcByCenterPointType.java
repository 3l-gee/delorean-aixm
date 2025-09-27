
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
@Entity(name = "ArcByCenterPointType")
@Table(name = "arc_by_center_point", schema = "gml")
public class ArcByCenterPointType
    extends AbstractCurveSegmentType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected DirectPositionType pos;
    protected PointPropertyType pointProperty;
    protected PointPropertyType pointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected LengthType radius;
    protected AngleType startAngle;
    protected AngleType endAngle;
    @XmlAttribute(name = "interpolation")
    public static final CurveInterpolationType INTERPOLATION = CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
    @XmlAttribute(name = "numArc", required = true)
    public static final BigInteger NUM_ARC = new BigInteger("1");

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "srsName", column = @Column(name = "POS_SRS_NAME")),
        @AttributeOverride(name = "srsDimension", column = @Column(name = "POS_SRS_DIMENSION", precision = 20, scale = 0))
    })
    @AssociationOverride(name = "value", joinTable = @JoinTable(name = "DIRECT_POSITION_TYPE_POS_VAL_0", joinColumns = {
        @JoinColumn(name = "POS_HJID")
    }))
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

    @Transient
    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * Gets the value of the pointProperty property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    @ManyToOne(targetEntity = PointPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "POINT_PROPERTY_ARC_BY_CENTER_0", nullable = false, insertable = true, updatable = false)
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
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    @Transient
    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
    }

    /**
     * Gets the value of the pointRep property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    @Transient
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

    @Transient
    public boolean isSetPointRep() {
        return (this.pointRep!= null);
    }

    /**
     * Gets the value of the posList property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "count", column = @Column(name = "POS_LIST_COUNT", precision = 20, scale = 0)),
        @AttributeOverride(name = "srsName", column = @Column(name = "POS_LIST_SRS_NAME")),
        @AttributeOverride(name = "srsDimension", column = @Column(name = "POS_LIST_SRS_DIMENSION", precision = 20, scale = 0))
    })
    @AssociationOverride(name = "value", joinTable = @JoinTable(name = "DIRECT_POSITION_LIST_TYPE_PO_0", joinColumns = {
        @JoinColumn(name = "POS_LIST_HJID")
    }))
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

    @Transient
    public boolean isSetPosList() {
        return (this.posList!= null);
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    @Transient
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

    @Transient
    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    @Embedded
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

    @Transient
    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Gets the value of the startAngle property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    @Embedded
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

    @Transient
    public boolean isSetStartAngle() {
        return (this.startAngle!= null);
    }

    /**
     * Gets the value of the endAngle property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    @Embedded
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

    @Transient
    public boolean isSetEndAngle() {
        return (this.endAngle!= null);
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
            boolean lhsFieldIsSet = this.isSetPos();
            boolean rhsFieldIsSet = that.isSetPos();
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
            boolean lhsFieldIsSet = this.isSetCoordinates();
            boolean rhsFieldIsSet = that.isSetCoordinates();
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
            boolean lhsFieldIsSet = this.isSetEndAngle();
            boolean rhsFieldIsSet = that.isSetEndAngle();
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
            boolean lhsFieldIsSet = this.isSetPointProperty();
            boolean rhsFieldIsSet = that.isSetPointProperty();
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
            boolean lhsFieldIsSet = this.isSetPointRep();
            boolean rhsFieldIsSet = that.isSetPointRep();
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
            boolean lhsFieldIsSet = this.isSetPosList();
            boolean rhsFieldIsSet = that.isSetPosList();
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
            boolean lhsFieldIsSet = this.isSetRadius();
            boolean rhsFieldIsSet = that.isSetRadius();
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
            boolean lhsFieldIsSet = this.isSetStartAngle();
            boolean rhsFieldIsSet = that.isSetStartAngle();
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
            boolean theFieldIsSet = this.isSetPos();
            DirectPositionType theField;
            theField = this.getPos();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pos", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointProperty();
            PointPropertyType theField;
            theField = this.getPointProperty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointProperty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointRep();
            PointPropertyType theField;
            theField = this.getPointRep();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointRep", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosList();
            DirectPositionListType theField;
            theField = this.getPosList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinates();
            CoordinatesType theField;
            theField = this.getCoordinates();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinates", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            LengthType theField;
            theField = this.getRadius();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radius", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAngle();
            AngleType theField;
            theField = this.getStartAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAngle();
            AngleType theField;
            theField = this.getEndAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPos();
            DirectPositionType theField;
            theField = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointProperty();
            PointPropertyType theField;
            theField = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointRep();
            PointPropertyType theField;
            theField = this.getPointRep();
            strategy.appendField(locator, this, "pointRep", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosList();
            DirectPositionListType theField;
            theField = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinates();
            CoordinatesType theField;
            theField = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            LengthType theField;
            theField = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAngle();
            AngleType theField;
            theField = this.getStartAngle();
            strategy.appendField(locator, this, "startAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAngle();
            AngleType theField;
            theField = this.getEndAngle();
            strategy.appendField(locator, this, "endAngle", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
