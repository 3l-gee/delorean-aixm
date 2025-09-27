
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for NodeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NodeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       <sequence>
 *         <element name="container" type="{http://www.opengis.net/gml/3.2}FaceOrTopoSolidPropertyType" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedEdge" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}pointProperty" minOccurs="0"/>
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
@XmlType(name = "NodeType", propOrder = {
    "container",
    "directedEdge",
    "pointProperty"
})
public class NodeType
    extends AbstractTopoPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected FaceOrTopoSolidPropertyType container;
    protected List<DirectedEdgePropertyType> directedEdge;
    /**
     * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
     * 
     */
    protected PointPropertyType pointProperty;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link FaceOrTopoSolidPropertyType }
     *     
     */
    public FaceOrTopoSolidPropertyType getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceOrTopoSolidPropertyType }
     *     
     */
    public void setContainer(FaceOrTopoSolidPropertyType value) {
        this.container = value;
    }

    public boolean isSetContainer() {
        return (this.container!= null);
    }

    /**
     * In the case of planar topology, a gml:Node must have a clockwise sequence of gml:directedEdge properties, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR).Gets the value of the directedEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedEdgePropertyType }
     * 
     * 
     */
    public List<DirectedEdgePropertyType> getDirectedEdge() {
        if (directedEdge == null) {
            directedEdge = new ArrayList<>();
        }
        return this.directedEdge;
    }

    /**
     * In the case of planar topology, a gml:Node must have a clockwise sequence of gml:directedEdge properties, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR).
     * 
     */
    public void setDirectedEdge(List<DirectedEdgePropertyType> directedEdge) {
        this.directedEdge = directedEdge;
    }

    public boolean isSetDirectedEdge() {
        return ((this.directedEdge!= null)&&(!this.directedEdge.isEmpty()));
    }

    public void unsetDirectedEdge() {
        this.directedEdge = null;
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

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
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
        final NodeType that = ((NodeType) object);
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
            boolean lhsFieldIsSet = this.isSetContainer();
            boolean rhsFieldIsSet = that.isSetContainer();
            FaceOrTopoSolidPropertyType lhsField;
            lhsField = this.getContainer();
            FaceOrTopoSolidPropertyType rhsField;
            rhsField = that.getContainer();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "container", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "container", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetDirectedEdge();
            boolean rhsFieldIsSet = that.isSetDirectedEdge();
            List<DirectedEdgePropertyType> lhsField;
            lhsField = (this.isSetDirectedEdge()?this.getDirectedEdge():null);
            List<DirectedEdgePropertyType> rhsField;
            rhsField = (that.isSetDirectedEdge()?that.getDirectedEdge():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directedEdge", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directedEdge", rhsField);
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
            boolean theFieldIsSet = this.isSetContainer();
            FaceOrTopoSolidPropertyType theField;
            theField = this.getContainer();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "container", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedEdge();
            List<DirectedEdgePropertyType> theField;
            theField = (this.isSetDirectedEdge()?this.getDirectedEdge():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directedEdge", theField);
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
            boolean theFieldIsSet = this.isSetContainer();
            FaceOrTopoSolidPropertyType theField;
            theField = this.getContainer();
            strategy.appendField(locator, this, "container", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedEdge();
            List<DirectedEdgePropertyType> theField;
            theField = (this.isSetDirectedEdge()?this.getDirectedEdge():null);
            strategy.appendField(locator, this, "directedEdge", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointProperty();
            PointPropertyType theField;
            theField = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, theField, theFieldIsSet);
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
