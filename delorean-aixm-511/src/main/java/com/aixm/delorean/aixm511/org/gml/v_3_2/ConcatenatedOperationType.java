
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * gml:ConcatenatedOperation is an ordered sequence of two or more coordinate operations. This sequence of operations is constrained by the requirement that the source coordinate reference system of step (n+1) must be the same as the target coordinate reference system of step (n). The source coordinate reference system of the first step and the target coordinate reference system of the last step are the source and target coordinate reference system associated with the concatenated operation. Instead of a forward operation, an inverse operation may be used for one or more of the operation steps mentioned above, if the inverse operation is uniquely defined by the forward operation.
 * The gml:coordOperation property elements are an ordered sequence of associations to the two or more operations used by this concatenated operation. The AggregationAttributeGroup should be used to specify that the coordOperation associations are ordered.
 * 
 * <p>Java class for ConcatenatedOperationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConcatenatedOperationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCoordinateOperationType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordOperation" maxOccurs="unbounded" minOccurs="2"/>
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
@XmlType(name = "ConcatenatedOperationType", propOrder = {
    "coordOperation"
})
public class ConcatenatedOperationType
    extends AbstractCoordinateOperationType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "coordOperation", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<CoordinateOperationPropertyType>> coordOperation;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * gml:coordOperation is an association role to a coordinate operation.Gets the value of the coordOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<CoordinateOperationPropertyType>> getCoordOperation() {
        if (coordOperation == null) {
            coordOperation = new ArrayList<>();
        }
        return this.coordOperation;
    }

    /**
     * gml:coordOperation is an association role to a coordinate operation.
     * 
     */
    public void setCoordOperation(List<JAXBElement<CoordinateOperationPropertyType>> coordOperation) {
        this.coordOperation = coordOperation;
    }

    public boolean isSetCoordOperation() {
        return ((this.coordOperation!= null)&&(!this.coordOperation.isEmpty()));
    }

    public void unsetCoordOperation() {
        this.coordOperation = null;
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
        final ConcatenatedOperationType that = ((ConcatenatedOperationType) object);
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
            boolean lhsFieldIsSet = this.isSetCoordOperation();
            boolean rhsFieldIsSet = that.isSetCoordOperation();
            List<JAXBElement<CoordinateOperationPropertyType>> lhsField;
            lhsField = (this.isSetCoordOperation()?this.getCoordOperation():null);
            List<JAXBElement<CoordinateOperationPropertyType>> rhsField;
            rhsField = (that.isSetCoordOperation()?that.getCoordOperation():null);
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
            boolean theFieldIsSet = this.isSetCoordOperation();
            List<JAXBElement<CoordinateOperationPropertyType>> theField;
            theField = (this.isSetCoordOperation()?this.getCoordOperation():null);
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
            boolean theFieldIsSet = this.isSetCoordOperation();
            List<JAXBElement<CoordinateOperationPropertyType>> theField;
            theField = (this.isSetCoordOperation()?this.getCoordOperation():null);
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
