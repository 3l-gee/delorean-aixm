
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ArcStringType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArcStringType">
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
 *       </sequence>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArc3Points" />
 *       <attribute name="numArc" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcStringType", propOrder = {
    "pos",
    "pointProperty",
    "pointRep",
    "posList",
    "coordinates"
})
@XmlSeeAlso({
    ArcType.class
})
@Entity(name = "ArcStringType")
@Table(name = "arc_string", schema = "gml")
public class ArcStringType
    extends AbstractCurveSegmentType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected DirectPositionType pos;
    /**
     * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
     * 
     */
    protected PointPropertyType pointProperty;
    protected PointPropertyType pointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlAttribute(name = "interpolation")
    public static final CurveInterpolationType INTERPOLATION = CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
    @XmlAttribute(name = "numArc")
    protected BigInteger numArc;

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
        @AttributeOverride(name = "value", column = @Column(name = "POS_VALUE")),
        @AttributeOverride(name = "srsName", column = @Column(name = "POS_SRS_NAME")),
        @AttributeOverride(name = "srsDimension", column = @Column(name = "POS_SRS_DIMENSION", precision = 20, scale = 0))
    })
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
     * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    @ManyToOne(targetEntity = PointPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "POINT_PROPERTY_ARC_STRING_TY_0", nullable = true)
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
        @AttributeOverride(name = "value", column = @Column(name = "POS_LIST_VALUE")),
        @AttributeOverride(name = "count", column = @Column(name = "POS_LIST_COUNT", precision = 20, scale = 0)),
        @AttributeOverride(name = "srsName", column = @Column(name = "POS_LIST_SRS_NAME")),
        @AttributeOverride(name = "srsDimension", column = @Column(name = "POS_LIST_SRS_DIMENSION", precision = 20, scale = 0))
    })
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
     * Gets the value of the numArc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "NUM_ARC", precision = 20, scale = 0)
    public BigInteger getNumArc() {
        return numArc;
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

    @Transient
    public boolean isSetNumArc() {
        return (this.numArc!= null);
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
        final ArcStringType that = ((ArcStringType) object);
        {
            boolean lhsFieldIsSet = this.isSetNumArc();
            boolean rhsFieldIsSet = that.isSetNumArc();
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
            boolean theFieldIsSet = this.isSetNumArc();
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
            boolean theFieldIsSet = this.isSetNumArc();
            BigInteger theField;
            theField = this.getNumArc();
            strategy.appendField(locator, this, "numArc", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
