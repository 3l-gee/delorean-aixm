
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TopoPointType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TopoPointType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}directedNode"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointType", propOrder = {
    "directedNode"
})
public class TopoPointType
    extends AbstractTopologyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
     * 
     */
    @XmlElement(required = true)
    protected DirectedNodePropertyType directedNode;

    /**
     * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
     * 
     * @return
     *     possible object is
     *     {@link DirectedNodePropertyType }
     *     
     */
    public DirectedNodePropertyType getDirectedNode() {
        return directedNode;
    }

    /**
     * Sets the value of the directedNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectedNodePropertyType }
     *     
     * @see #getDirectedNode()
     */
    public void setDirectedNode(DirectedNodePropertyType value) {
        this.directedNode = value;
    }

    public boolean isSetDirectedNode() {
        return (this.directedNode!= null);
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
        final TopoPointType that = ((TopoPointType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirectedNode();
            boolean rhsFieldIsSet = that.isSetDirectedNode();
            DirectedNodePropertyType lhsField;
            lhsField = this.getDirectedNode();
            DirectedNodePropertyType rhsField;
            rhsField = that.getDirectedNode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directedNode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directedNode", rhsField);
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
            boolean theFieldIsSet = this.isSetDirectedNode();
            DirectedNodePropertyType theField;
            theField = this.getDirectedNode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directedNode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDirectedNode();
            DirectedNodePropertyType theField;
            theField = this.getDirectedNode();
            strategy.appendField(locator, this, "directedNode", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
