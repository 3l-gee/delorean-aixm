
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gss.v2007.GMObjectPropertyType;
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
 * Boundary enclosing the dataset expressed as the closed set of (x,y) coordinates of the polygon (last point replicates first point)
 * 
 * <p>Java class for EX_BoundingPolygon_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_BoundingPolygon_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       <sequence>
 *         <element name="polygon" type="{http://www.isotc211.org/2005/gss}GM_Object_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_BoundingPolygon_Type", propOrder = {
    "polygon"
})
public class EXBoundingPolygonType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected List<GMObjectPropertyType> polygon;

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMObjectPropertyType }
     * 
     * 
     */
    public List<GMObjectPropertyType> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<>();
        }
        return this.polygon;
    }

    /**
     * 
     * 
     */
    public void setPolygon(List<GMObjectPropertyType> polygon) {
        this.polygon = polygon;
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
        final EXBoundingPolygonType that = ((EXBoundingPolygonType) object);
        {
            boolean lhsFieldIsSet = ((this.polygon!= null)&&(!this.polygon.isEmpty()));
            boolean rhsFieldIsSet = ((that.polygon!= null)&&(!that.polygon.isEmpty()));
            List<GMObjectPropertyType> lhsField;
            lhsField = (((this.polygon!= null)&&(!this.polygon.isEmpty()))?this.getPolygon():null);
            List<GMObjectPropertyType> rhsField;
            rhsField = (((that.polygon!= null)&&(!that.polygon.isEmpty()))?that.getPolygon():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "polygon", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "polygon", rhsField);
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
            boolean theFieldIsSet = ((this.polygon!= null)&&(!this.polygon.isEmpty()));
            List<GMObjectPropertyType> theField;
            theField = (((this.polygon!= null)&&(!this.polygon.isEmpty()))?this.getPolygon():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "polygon", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.polygon!= null)&&(!this.polygon.isEmpty()));
            List<GMObjectPropertyType> theField;
            theField = (((this.polygon!= null)&&(!this.polygon.isEmpty()))?this.getPolygon():null);
            strategy.appendField(locator, this, "polygon", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
