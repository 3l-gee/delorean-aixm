
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about the vector spatial objects in the dataset
 * 
 * <p>Java class for MD_VectorSpatialRepresentation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_VectorSpatialRepresentation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type">
 *       <sequence>
 *         <element name="topologyLevel" type="{http://www.isotc211.org/2005/gmd}MD_TopologyLevelCode_PropertyType" minOccurs="0"/>
 *         <element name="geometricObjects" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjects_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_VectorSpatialRepresentation_Type", propOrder = {
    "topologyLevel",
    "geometricObjects"
})
public class MDVectorSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected MDTopologyLevelCodePropertyType topologyLevel;
    protected List<MDGeometricObjectsPropertyType> geometricObjects;

    /**
     * Gets the value of the topologyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public MDTopologyLevelCodePropertyType getTopologyLevel() {
        return topologyLevel;
    }

    /**
     * Sets the value of the topologyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public void setTopologyLevel(MDTopologyLevelCodePropertyType value) {
        this.topologyLevel = value;
    }

    public boolean isSetTopologyLevel() {
        return (this.topologyLevel!= null);
    }

    /**
     * Gets the value of the geometricObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometricObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDGeometricObjectsPropertyType }
     * 
     * 
     */
    public List<MDGeometricObjectsPropertyType> getGeometricObjects() {
        if (geometricObjects == null) {
            geometricObjects = new ArrayList<>();
        }
        return this.geometricObjects;
    }

    /**
     * 
     * 
     */
    public void setGeometricObjects(List<MDGeometricObjectsPropertyType> geometricObjects) {
        this.geometricObjects = geometricObjects;
    }

    public boolean isSetGeometricObjects() {
        return ((this.geometricObjects!= null)&&(!this.geometricObjects.isEmpty()));
    }

    public void unsetGeometricObjects() {
        this.geometricObjects = null;
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
        final MDVectorSpatialRepresentationType that = ((MDVectorSpatialRepresentationType) object);
        {
            boolean lhsFieldIsSet = this.isSetTopologyLevel();
            boolean rhsFieldIsSet = that.isSetTopologyLevel();
            MDTopologyLevelCodePropertyType lhsField;
            lhsField = this.getTopologyLevel();
            MDTopologyLevelCodePropertyType rhsField;
            rhsField = that.getTopologyLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topologyLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topologyLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeometricObjects();
            boolean rhsFieldIsSet = that.isSetGeometricObjects();
            List<MDGeometricObjectsPropertyType> lhsField;
            lhsField = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            List<MDGeometricObjectsPropertyType> rhsField;
            rhsField = (that.isSetGeometricObjects()?that.getGeometricObjects():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometricObjects", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometricObjects", rhsField);
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
            boolean theFieldIsSet = this.isSetTopologyLevel();
            MDTopologyLevelCodePropertyType theField;
            theField = this.getTopologyLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topologyLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometricObjects();
            List<MDGeometricObjectsPropertyType> theField;
            theField = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometricObjects", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTopologyLevel();
            MDTopologyLevelCodePropertyType theField;
            theField = this.getTopologyLevel();
            strategy.appendField(locator, this, "topologyLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometricObjects();
            List<MDGeometricObjectsPropertyType> theField;
            theField = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            strategy.appendField(locator, this, "geometricObjects", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
