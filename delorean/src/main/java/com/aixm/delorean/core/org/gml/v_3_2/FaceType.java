
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
 * <p>Java class for FaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       <sequence>
 *         <element name="isolated" type="{http://www.opengis.net/gml/3.2}NodePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedEdge" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedTopoSolid" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}surfaceProperty" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       <attribute name="universal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceType", propOrder = {
    "isolated",
    "directedEdge",
    "directedTopoSolid",
    "surfaceProperty"
})
public class FaceType
    extends AbstractTopoPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<NodePropertyType> isolated;
    @XmlElement(required = true)
    protected List<DirectedEdgePropertyType> directedEdge;
    protected List<DirectedTopoSolidPropertyType> directedTopoSolid;
    /**
     * This property element either references a surface via the XLink-attributes or contains the surface element. surfaceProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSurface.
     * 
     */
    protected SurfacePropertyType surfaceProperty;
    /**
     * If the topological representation exists an unbounded manifold (e.g. Euclidean plane), a gml:Face must indicate whether it is a universal face or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this. NOTE The universal face is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the map represented by the data set.
     * 
     */
    @XmlAttribute(name = "universal")
    protected java.lang.Boolean universal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the isolated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isolated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsolated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodePropertyType }
     * 
     * 
     */
    public List<NodePropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<>();
        }
        return this.isolated;
    }

    /**
     * 
     * 
     */
    public void setIsolated(List<NodePropertyType> isolated) {
        this.isolated = isolated;
    }

    public boolean isSetIsolated() {
        return ((this.isolated!= null)&&(!this.isolated.isEmpty()));
    }

    public void unsetIsolated() {
        this.isolated = null;
    }

    /**
     * A gml:directedEdge property element describes the boundary of topology faces, the coBoundary of topology nodes and is used in the support of topological line features via the gml:TopoCurve expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included edge is used, i.e. forward or reverse.Gets the value of the directedEdge property.
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
     * A gml:directedEdge property element describes the boundary of topology faces, the coBoundary of topology nodes and is used in the support of topological line features via the gml:TopoCurve expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included edge is used, i.e. forward or reverse.
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
     * The gml:directedSolid property element describes the coBoundary of topology faces and is used in the support of volume features via the gml:TopoVolume expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included solid appears in the face coboundary. In the context of a gml:TopoVolume the orientation attribute has no meaning.Gets the value of the directedTopoSolid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedTopoSolid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedTopoSolid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedTopoSolidPropertyType }
     * 
     * 
     */
    public List<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
        if (directedTopoSolid == null) {
            directedTopoSolid = new ArrayList<>();
        }
        return this.directedTopoSolid;
    }

    /**
     * The gml:directedSolid property element describes the coBoundary of topology faces and is used in the support of volume features via the gml:TopoVolume expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included solid appears in the face coboundary. In the context of a gml:TopoVolume the orientation attribute has no meaning.
     * 
     */
    public void setDirectedTopoSolid(List<DirectedTopoSolidPropertyType> directedTopoSolid) {
        this.directedTopoSolid = directedTopoSolid;
    }

    public boolean isSetDirectedTopoSolid() {
        return ((this.directedTopoSolid!= null)&&(!this.directedTopoSolid.isEmpty()));
    }

    public void unsetDirectedTopoSolid() {
        this.directedTopoSolid = null;
    }

    /**
     * This property element either references a surface via the XLink-attributes or contains the surface element. surfaceProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSurface.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getSurfaceProperty() {
        return surfaceProperty;
    }

    /**
     * Sets the value of the surfaceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     * @see #getSurfaceProperty()
     */
    public void setSurfaceProperty(SurfacePropertyType value) {
        this.surfaceProperty = value;
    }

    public boolean isSetSurfaceProperty() {
        return (this.surfaceProperty!= null);
    }

    /**
     * If the topological representation exists an unbounded manifold (e.g. Euclidean plane), a gml:Face must indicate whether it is a universal face or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this. NOTE The universal face is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the map represented by the data set.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean getUniversal() {
        if (universal == null) {
            return false;
        } else {
            return universal;
        }
    }

    /**
     * Sets the value of the universal property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     * @see #getUniversal()
     */
    public void setUniversal(boolean value) {
        this.universal = value;
    }

    public boolean isSetUniversal() {
        return (this.universal!= null);
    }

    public void unsetUniversal() {
        this.universal = null;
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
        final FaceType that = ((FaceType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirectedTopoSolid();
            boolean rhsFieldIsSet = that.isSetDirectedTopoSolid();
            List<DirectedTopoSolidPropertyType> lhsField;
            lhsField = (this.isSetDirectedTopoSolid()?this.getDirectedTopoSolid():null);
            List<DirectedTopoSolidPropertyType> rhsField;
            rhsField = (that.isSetDirectedTopoSolid()?that.getDirectedTopoSolid():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directedTopoSolid", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directedTopoSolid", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurfaceProperty();
            boolean rhsFieldIsSet = that.isSetSurfaceProperty();
            SurfacePropertyType lhsField;
            lhsField = this.getSurfaceProperty();
            SurfacePropertyType rhsField;
            rhsField = that.getSurfaceProperty();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceProperty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceProperty", rhsField);
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
            boolean lhsFieldIsSet = this.isSetUniversal();
            boolean rhsFieldIsSet = that.isSetUniversal();
            boolean lhsField;
            lhsField = (this.isSetUniversal()?this.getUniversal():false);
            boolean rhsField;
            rhsField = (that.isSetUniversal()?that.getUniversal():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "universal", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "universal", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIsolated();
            boolean rhsFieldIsSet = that.isSetIsolated();
            List<NodePropertyType> lhsField;
            lhsField = (this.isSetIsolated()?this.getIsolated():null);
            List<NodePropertyType> rhsField;
            rhsField = (that.isSetIsolated()?that.getIsolated():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isolated", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isolated", rhsField);
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
            boolean theFieldIsSet = this.isSetIsolated();
            List<NodePropertyType> theField;
            theField = (this.isSetIsolated()?this.getIsolated():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isolated", theField);
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
            boolean theFieldIsSet = this.isSetDirectedTopoSolid();
            List<DirectedTopoSolidPropertyType> theField;
            theField = (this.isSetDirectedTopoSolid()?this.getDirectedTopoSolid():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directedTopoSolid", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperty();
            SurfacePropertyType theField;
            theField = this.getSurfaceProperty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceProperty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUniversal();
            boolean theField;
            theField = (this.isSetUniversal()?this.getUniversal():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "universal", theField);
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
            boolean theFieldIsSet = this.isSetIsolated();
            List<NodePropertyType> theField;
            theField = (this.isSetIsolated()?this.getIsolated():null);
            strategy.appendField(locator, this, "isolated", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedEdge();
            List<DirectedEdgePropertyType> theField;
            theField = (this.isSetDirectedEdge()?this.getDirectedEdge():null);
            strategy.appendField(locator, this, "directedEdge", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedTopoSolid();
            List<DirectedTopoSolidPropertyType> theField;
            theField = (this.isSetDirectedTopoSolid()?this.getDirectedTopoSolid():null);
            strategy.appendField(locator, this, "directedTopoSolid", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperty();
            SurfacePropertyType theField;
            theField = this.getSurfaceProperty();
            strategy.appendField(locator, this, "surfaceProperty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUniversal();
            boolean theField;
            theField = (this.isSetUniversal()?this.getUniversal():false);
            strategy.appendField(locator, this, "universal", buffer, theField, theFieldIsSet);
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
