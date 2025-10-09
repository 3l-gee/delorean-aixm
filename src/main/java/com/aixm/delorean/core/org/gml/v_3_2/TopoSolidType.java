
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
 * <p>Java class for TopoSolidType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TopoSolidType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       <sequence>
 *         <element name="isolated" type="{http://www.opengis.net/gml/3.2}NodeOrEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}solidProperty" minOccurs="0"/>
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
@XmlType(name = "TopoSolidType", propOrder = {
    "isolated",
    "directedFace",
    "solidProperty"
})
public class TopoSolidType
    extends AbstractTopoPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<NodeOrEdgePropertyType> isolated;
    @XmlElement(required = true)
    protected List<DirectedFacePropertyType> directedFace;
    /**
     * This property element either references a solid via the XLink-attributes or contains the solid element. solidProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSolid.
     * 
     */
    protected SolidPropertyType solidProperty;
    /**
     * A gml:TopoSolid must indicate whether it is a universal topo-solid or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this and the default is fault. NOTE The universal topo-solid is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the data set.
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
     * {@link NodeOrEdgePropertyType }
     * 
     * 
     */
    public List<NodeOrEdgePropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<>();
        }
        return this.isolated;
    }

    /**
     * 
     * 
     */
    public void setIsolated(List<NodeOrEdgePropertyType> isolated) {
        this.isolated = isolated;
    }

    public boolean isSetIsolated() {
        return ((this.isolated!= null)&&(!this.isolated.isEmpty()));
    }

    public void unsetIsolated() {
        this.isolated = null;
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
     * This property element either references a solid via the XLink-attributes or contains the solid element. solidProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSolid.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getSolidProperty() {
        return solidProperty;
    }

    /**
     * Sets the value of the solidProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     * @see #getSolidProperty()
     */
    public void setSolidProperty(SolidPropertyType value) {
        this.solidProperty = value;
    }

    public boolean isSetSolidProperty() {
        return (this.solidProperty!= null);
    }

    /**
     * A gml:TopoSolid must indicate whether it is a universal topo-solid or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this and the default is fault. NOTE The universal topo-solid is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the data set.
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
        final TopoSolidType that = ((TopoSolidType) object);
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
            boolean lhsFieldIsSet = this.isSetSolidProperty();
            boolean rhsFieldIsSet = that.isSetSolidProperty();
            SolidPropertyType lhsField;
            lhsField = this.getSolidProperty();
            SolidPropertyType rhsField;
            rhsField = that.getSolidProperty();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "solidProperty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "solidProperty", rhsField);
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
            List<NodeOrEdgePropertyType> lhsField;
            lhsField = (this.isSetIsolated()?this.getIsolated():null);
            List<NodeOrEdgePropertyType> rhsField;
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
            List<NodeOrEdgePropertyType> theField;
            theField = (this.isSetIsolated()?this.getIsolated():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isolated", theField);
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
            boolean theFieldIsSet = this.isSetSolidProperty();
            SolidPropertyType theField;
            theField = this.getSolidProperty();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "solidProperty", theField);
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
            List<NodeOrEdgePropertyType> theField;
            theField = (this.isSetIsolated()?this.getIsolated():null);
            strategy.appendField(locator, this, "isolated", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirectedFace();
            List<DirectedFacePropertyType> theField;
            theField = (this.isSetDirectedFace()?this.getDirectedFace():null);
            strategy.appendField(locator, this, "directedFace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSolidProperty();
            SolidPropertyType theField;
            theField = this.getSolidProperty();
            strategy.appendField(locator, this, "solidProperty", buffer, theField, theFieldIsSet);
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
