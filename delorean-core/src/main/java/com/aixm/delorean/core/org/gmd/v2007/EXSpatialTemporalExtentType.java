
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Extent with respect to date and time
 * 
 * <p>Java class for EX_SpatialTemporalExtent_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_SpatialTemporalExtent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}EX_TemporalExtent_Type">
 *       <sequence>
 *         <element name="spatialExtent" type="{http://www.isotc211.org/2005/gmd}EX_GeographicExtent_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_SpatialTemporalExtent_Type", propOrder = {
    "spatialExtent"
})
public class EXSpatialTemporalExtentType
    extends EXTemporalExtentType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<EXGeographicExtentPropertyType> spatialExtent;

    /**
     * Gets the value of the spatialExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<EXGeographicExtentPropertyType> getSpatialExtent() {
        if (spatialExtent == null) {
            spatialExtent = new ArrayList<>();
        }
        return this.spatialExtent;
    }

    /**
     * 
     * 
     */
    public void setSpatialExtent(List<EXGeographicExtentPropertyType> spatialExtent) {
        this.spatialExtent = spatialExtent;
    }

    public boolean isSetSpatialExtent() {
        return ((this.spatialExtent!= null)&&(!this.spatialExtent.isEmpty()));
    }

    public void unsetSpatialExtent() {
        this.spatialExtent = null;
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
        final EXSpatialTemporalExtentType that = ((EXSpatialTemporalExtentType) object);
        {
            boolean lhsFieldIsSet = this.isSetSpatialExtent();
            boolean rhsFieldIsSet = that.isSetSpatialExtent();
            List<EXGeographicExtentPropertyType> lhsField;
            lhsField = (this.isSetSpatialExtent()?this.getSpatialExtent():null);
            List<EXGeographicExtentPropertyType> rhsField;
            rhsField = (that.isSetSpatialExtent()?that.getSpatialExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialExtent", rhsField);
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
            boolean theFieldIsSet = this.isSetSpatialExtent();
            List<EXGeographicExtentPropertyType> theField;
            theField = (this.isSetSpatialExtent()?this.getSpatialExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSpatialExtent();
            List<EXGeographicExtentPropertyType> theField;
            theField = (this.isSetSpatialExtent()?this.getSpatialExtent():null);
            strategy.appendField(locator, this, "spatialExtent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
