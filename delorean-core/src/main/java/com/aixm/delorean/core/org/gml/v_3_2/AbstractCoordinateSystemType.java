
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractCoordinateSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractCoordinateSystemType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}axis" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateSystemType", propOrder = {
    "axis"
})
@XmlSeeAlso({
    EllipsoidalCSType.class,
    CartesianCSType.class,
    VerticalCSType.class,
    TimeCSType.class,
    LinearCSType.class,
    UserDefinedCSType.class,
    SphericalCSType.class,
    PolarCSType.class,
    CylindricalCSType.class,
    AffineCSType.class,
    TemporalCSType.class,
    ObliqueCartesianCSType.class
})
public abstract class AbstractCoordinateSystemType
    extends IdentifiedObjectType
{

    @XmlElementRef(name = "axis", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<CoordinateSystemAxisPropertyType>> axis;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * The gml:axis property is an association role (ordered sequence) to the coordinate system axes included in this coordinate system. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. The gml:AggregationAttributeGroup should be used to specify that the axis objects are ordered.Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<CoordinateSystemAxisPropertyType>> getAxis() {
        if (axis == null) {
            axis = new ArrayList<>();
        }
        return this.axis;
    }

    /**
     * The gml:axis property is an association role (ordered sequence) to the coordinate system axes included in this coordinate system. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. The gml:AggregationAttributeGroup should be used to specify that the axis objects are ordered.
     * 
     */
    public void setAxis(List<JAXBElement<CoordinateSystemAxisPropertyType>> axis) {
        this.axis = axis;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
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
        final AbstractCoordinateSystemType that = ((AbstractCoordinateSystemType) object);
        {
            boolean lhsFieldIsSet = (this.aggregationType!= null);
            boolean rhsFieldIsSet = (that.aggregationType!= null);
            AggregationType lhsField;
            lhsField = this.getAggregationType();
            AggregationType rhsField;
            rhsField = that.getAggregationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aggregationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aggregationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axis!= null)&&(!this.axis.isEmpty()));
            boolean rhsFieldIsSet = ((that.axis!= null)&&(!that.axis.isEmpty()));
            List<JAXBElement<CoordinateSystemAxisPropertyType>> lhsField;
            lhsField = (((this.axis!= null)&&(!this.axis.isEmpty()))?this.getAxis():null);
            List<JAXBElement<CoordinateSystemAxisPropertyType>> rhsField;
            rhsField = (((that.axis!= null)&&(!that.axis.isEmpty()))?that.getAxis():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axis", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axis", rhsField);
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
            boolean theFieldIsSet = ((this.axis!= null)&&(!this.axis.isEmpty()));
            List<JAXBElement<CoordinateSystemAxisPropertyType>> theField;
            theField = (((this.axis!= null)&&(!this.axis.isEmpty()))?this.getAxis():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axis", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.aggregationType!= null);
            AggregationType theField;
            theField = this.getAggregationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aggregationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.axis!= null)&&(!this.axis.isEmpty()));
            List<JAXBElement<CoordinateSystemAxisPropertyType>> theField;
            theField = (((this.axis!= null)&&(!this.axis.isEmpty()))?this.getAxis():null);
            strategy.appendField(locator, this, "axis", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.aggregationType!= null);
            AggregationType theField;
            theField = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
