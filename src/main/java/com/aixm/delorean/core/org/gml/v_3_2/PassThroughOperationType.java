
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for PassThroughOperationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PassThroughOperationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCoordinateOperationType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}modifiedCoordinate" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordOperation"/>
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
@XmlType(name = "PassThroughOperationType", propOrder = {
    "modifiedCoordinate",
    "coordOperation"
})
public class PassThroughOperationType
    extends AbstractCoordinateOperationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<BigInteger> modifiedCoordinate;
    /**
     * gml:coordOperation is an association role to a coordinate operation.
     * 
     */
    @XmlElementRef(name = "coordOperation", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateOperationPropertyType> coordOperation;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * gml:modifiedCoordinate is a positive integer defining a position in a coordinate tuple.Gets the value of the modifiedCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiedCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiedCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getModifiedCoordinate() {
        if (modifiedCoordinate == null) {
            modifiedCoordinate = new ArrayList<>();
        }
        return this.modifiedCoordinate;
    }

    /**
     * gml:modifiedCoordinate is a positive integer defining a position in a coordinate tuple.
     * 
     */
    public void setModifiedCoordinate(List<BigInteger> modifiedCoordinate) {
        this.modifiedCoordinate = modifiedCoordinate;
    }

    public boolean isSetModifiedCoordinate() {
        return ((this.modifiedCoordinate!= null)&&(!this.modifiedCoordinate.isEmpty()));
    }

    public void unsetModifiedCoordinate() {
        this.modifiedCoordinate = null;
    }

    /**
     * gml:coordOperation is an association role to a coordinate operation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateOperationPropertyType> getCoordOperation() {
        return coordOperation;
    }

    /**
     * Sets the value of the coordOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     *     
     * @see #getCoordOperation()
     */
    public void setCoordOperation(JAXBElement<CoordinateOperationPropertyType> value) {
        this.coordOperation = value;
    }

    public boolean isSetCoordOperation() {
        return (this.coordOperation!= null);
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

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
        final PassThroughOperationType that = ((PassThroughOperationType) object);
        {
            boolean lhsFieldIsSet = this.isSetAggregationType();
            boolean rhsFieldIsSet = that.isSetAggregationType();
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
            boolean lhsFieldIsSet = this.isSetModifiedCoordinate();
            boolean rhsFieldIsSet = that.isSetModifiedCoordinate();
            List<BigInteger> lhsField;
            lhsField = (this.isSetModifiedCoordinate()?this.getModifiedCoordinate():null);
            List<BigInteger> rhsField;
            rhsField = (that.isSetModifiedCoordinate()?that.getModifiedCoordinate():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "modifiedCoordinate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "modifiedCoordinate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCoordOperation();
            boolean rhsFieldIsSet = that.isSetCoordOperation();
            JAXBElement<CoordinateOperationPropertyType> lhsField;
            lhsField = this.getCoordOperation();
            JAXBElement<CoordinateOperationPropertyType> rhsField;
            rhsField = that.getCoordOperation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coordOperation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coordOperation", rhsField);
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
            boolean theFieldIsSet = this.isSetModifiedCoordinate();
            List<BigInteger> theField;
            theField = (this.isSetModifiedCoordinate()?this.getModifiedCoordinate():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "modifiedCoordinate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordOperation();
            JAXBElement<CoordinateOperationPropertyType> theField;
            theField = this.getCoordOperation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordOperation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
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
            boolean theFieldIsSet = this.isSetModifiedCoordinate();
            List<BigInteger> theField;
            theField = (this.isSetModifiedCoordinate()?this.getModifiedCoordinate():null);
            strategy.appendField(locator, this, "modifiedCoordinate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordOperation();
            JAXBElement<CoordinateOperationPropertyType> theField;
            theField = this.getCoordOperation();
            strategy.appendField(locator, this, "coordOperation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
            AggregationType theField;
            theField = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
