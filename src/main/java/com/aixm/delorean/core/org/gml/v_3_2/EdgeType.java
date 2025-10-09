
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for EdgeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EdgeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       <sequence>
 *         <element name="container" type="{http://www.opengis.net/gml/3.2}TopoSolidPropertyType" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedNode" maxOccurs="2" minOccurs="2"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}curveProperty" minOccurs="0"/>
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
@XmlType(name = "EdgeType", propOrder = {
    "container",
    "directedNode",
    "directedFace",
    "curveProperty"
})
public class EdgeType
    extends AbstractTopoPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected TopoSolidPropertyType container;
    @XmlElement(required = true)
    protected List<DirectedNodePropertyType> directedNode;
    protected List<DirectedFacePropertyType> directedFace;
    /**
     * This property element either references a curve via the XLink-attributes or contains the curve element. curveProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractCurve.
     * 
     */
    protected CurvePropertyType curveProperty;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link TopoSolidPropertyType }
     *     
     */
    public TopoSolidPropertyType getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoSolidPropertyType }
     *     
     */
    public void setContainer(TopoSolidPropertyType value) {
        this.container = value;
    }

    public boolean isSetContainer() {
        return (this.container!= null);
    }

    /**
     * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.Gets the value of the directedNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedNodePropertyType }
     * 
     * 
     */
    public List<DirectedNodePropertyType> getDirectedNode() {
        if (directedNode == null) {
            directedNode = new ArrayList<>();
        }
        return this.directedNode;
    }

    /**
     * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
     * 
     */
    public void setDirectedNode(List<DirectedNodePropertyType> directedNode) {
        this.directedNode = directedNode;
    }

    public boolean isSetDirectedNode() {
        return ((this.directedNode!= null)&&(!this.directedNode.isEmpty()));
    }

    public void unsetDirectedNode() {
        this.directedNode = null;
    }

    /**
     * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
     * 
     * 
     */
    public List<DirectedFacePropertyType> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<>();
        }
        return this.directedFace;
    }

    /**
     * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.
     * 
     */
    public void setDirectedFace(List<DirectedFacePropertyType> directedFace) {
        this.directedFace = directedFace;
    }

    public boolean isSetDirectedFace() {
        return ((this.directedFace!= null)&&(!this.directedFace.isEmpty()));
    }

    public void unsetDirectedFace() {
        this.directedFace = null;
    }

    /**
     * This property element either references a curve via the XLink-attributes or contains the curve element. curveProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractCurve.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getCurveProperty() {
        return curveProperty;
    }

    /**
     * Sets the value of the curveProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     * @see #getCurveProperty()
     */
    public void setCurveProperty(CurvePropertyType value) {
        this.curveProperty = value;
    }

    public boolean isSetCurveProperty() {
        return (this.curveProperty!= null);
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
        final EdgeType that = ((EdgeType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirectedFace();
            boolean rhsFieldIsSet = that.isSetDirectedFace();
            List<DirectedFacePropertyType> lhsField;
            lhsField = (this.isSetDirectedFace()?this.getDirectedFace():null);
            List<DirectedFacePropertyType> rhsField;
            rhsField = (that.isSetDirectedFace()?that.getDirectedFace():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directedFace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directedFace", rhsField);
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
            boolean lhsFieldIsSet = this.isSetContainer();
            boolean rhsFieldIsSet = that.isSetContainer();
            TopoSolidPropertyType lhsField;
            lhsField = this.getContainer();
            TopoSolidPropertyType rhsField;
            rhsField = that.getContainer();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "container", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "container", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDirectedNode();
            boolean rhsFieldIsSet = that.isSetDirectedNode();
            List<DirectedNodePropertyType> lhsField;
            lhsField = (this.isSetDirectedNode()?this.getDirectedNode():null);
            List<DirectedNodePropertyType> rhsField;
            rhsField = (that.isSetDirectedNode()?that.getDirectedNode():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directedNode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directedNode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCurveProperty();
            boolean rhsFieldIsSet = that.isSetCurveProperty();
            CurvePropertyType lhsField;
            lhsField = this.getCurveProperty();
            CurvePropertyType rhsField;
            rhsField = that.getCurveProperty();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "curveProperty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "curveProperty", rhsField);
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
            TopoSolidPropertyType theField;
            theField = this.getContainer();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "container", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedNode();
            List<DirectedNodePropertyType> theField;
            theField = (this.isSetDirectedNode()?this.getDirectedNode():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directedNode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedFace();
            List<DirectedFacePropertyType> theField;
            theField = (this.isSetDirectedFace()?this.getDirectedFace():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directedFace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCurveProperty();
            CurvePropertyType theField;
            theField = this.getCurveProperty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "curveProperty", theField);
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
            TopoSolidPropertyType theField;
            theField = this.getContainer();
            strategy.appendField(locator, this, "container", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedNode();
            List<DirectedNodePropertyType> theField;
            theField = (this.isSetDirectedNode()?this.getDirectedNode():null);
            strategy.appendField(locator, this, "directedNode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedFace();
            List<DirectedFacePropertyType> theField;
            theField = (this.isSetDirectedFace()?this.getDirectedFace():null);
            strategy.appendField(locator, this, "directedFace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCurveProperty();
            CurvePropertyType theField;
            theField = this.getCurveProperty();
            strategy.appendField(locator, this, "curveProperty", buffer, theField, theFieldIsSet);
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
