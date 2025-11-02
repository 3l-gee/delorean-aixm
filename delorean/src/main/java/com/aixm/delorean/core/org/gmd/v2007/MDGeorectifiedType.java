
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gss.v2007.GMPointPropertyType;
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
 * <p>Java class for MD_Georectified_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Georectified_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       <sequence>
 *         <element name="checkPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         <element name="checkPointDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="cornerPoints" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="centerPoint" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" minOccurs="0"/>
 *         <element name="pointInPixel" type="{http://www.isotc211.org/2005/gmd}MD_PixelOrientationCode_PropertyType"/>
 *         <element name="transformationDimensionDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="transformationDimensionMapping" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georectified_Type", propOrder = {
    "checkPointAvailability",
    "checkPointDescription",
    "cornerPoints",
    "centerPoint",
    "pointInPixel",
    "transformationDimensionDescription",
    "transformationDimensionMapping"
})
public class MDGeorectifiedType
    extends MDGridSpatialRepresentationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected BooleanPropertyType checkPointAvailability;
    protected CharacterStringPropertyType checkPointDescription;
    protected List<GMPointPropertyType> cornerPoints;
    protected GMPointPropertyType centerPoint;
    @XmlElement(required = true)
    protected MDPixelOrientationCodePropertyType pointInPixel;
    protected CharacterStringPropertyType transformationDimensionDescription;
    protected List<CharacterStringPropertyType> transformationDimensionMapping;

    /**
     * Gets the value of the checkPointAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCheckPointAvailability() {
        return checkPointAvailability;
    }

    /**
     * Sets the value of the checkPointAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCheckPointAvailability(BooleanPropertyType value) {
        this.checkPointAvailability = value;
    }

    public boolean isSetCheckPointAvailability() {
        return (this.checkPointAvailability!= null);
    }

    /**
     * Gets the value of the checkPointDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCheckPointDescription() {
        return checkPointDescription;
    }

    /**
     * Sets the value of the checkPointDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCheckPointDescription(CharacterStringPropertyType value) {
        this.checkPointDescription = value;
    }

    public boolean isSetCheckPointDescription() {
        return (this.checkPointDescription!= null);
    }

    /**
     * Gets the value of the cornerPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cornerPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCornerPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPointPropertyType }
     * 
     * 
     */
    public List<GMPointPropertyType> getCornerPoints() {
        if (cornerPoints == null) {
            cornerPoints = new ArrayList<>();
        }
        return this.cornerPoints;
    }

    /**
     * 
     * 
     */
    public void setCornerPoints(List<GMPointPropertyType> cornerPoints) {
        this.cornerPoints = cornerPoints;
    }

    public boolean isSetCornerPoints() {
        return ((this.cornerPoints!= null)&&(!this.cornerPoints.isEmpty()));
    }

    public void unsetCornerPoints() {
        this.cornerPoints = null;
    }

    /**
     * Gets the value of the centerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GMPointPropertyType }
     *     
     */
    public GMPointPropertyType getCenterPoint() {
        return centerPoint;
    }

    /**
     * Sets the value of the centerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPointPropertyType }
     *     
     */
    public void setCenterPoint(GMPointPropertyType value) {
        this.centerPoint = value;
    }

    public boolean isSetCenterPoint() {
        return (this.centerPoint!= null);
    }

    /**
     * Gets the value of the pointInPixel property.
     * 
     * @return
     *     possible object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public MDPixelOrientationCodePropertyType getPointInPixel() {
        return pointInPixel;
    }

    /**
     * Sets the value of the pointInPixel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public void setPointInPixel(MDPixelOrientationCodePropertyType value) {
        this.pointInPixel = value;
    }

    public boolean isSetPointInPixel() {
        return (this.pointInPixel!= null);
    }

    /**
     * Gets the value of the transformationDimensionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTransformationDimensionDescription() {
        return transformationDimensionDescription;
    }

    /**
     * Sets the value of the transformationDimensionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTransformationDimensionDescription(CharacterStringPropertyType value) {
        this.transformationDimensionDescription = value;
    }

    public boolean isSetTransformationDimensionDescription() {
        return (this.transformationDimensionDescription!= null);
    }

    /**
     * Gets the value of the transformationDimensionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformationDimensionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformationDimensionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getTransformationDimensionMapping() {
        if (transformationDimensionMapping == null) {
            transformationDimensionMapping = new ArrayList<>();
        }
        return this.transformationDimensionMapping;
    }

    /**
     * 
     * 
     */
    public void setTransformationDimensionMapping(List<CharacterStringPropertyType> transformationDimensionMapping) {
        this.transformationDimensionMapping = transformationDimensionMapping;
    }

    public boolean isSetTransformationDimensionMapping() {
        return ((this.transformationDimensionMapping!= null)&&(!this.transformationDimensionMapping.isEmpty()));
    }

    public void unsetTransformationDimensionMapping() {
        this.transformationDimensionMapping = null;
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
        final MDGeorectifiedType that = ((MDGeorectifiedType) object);
        {
            boolean lhsFieldIsSet = this.isSetTransformationDimensionMapping();
            boolean rhsFieldIsSet = that.isSetTransformationDimensionMapping();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetTransformationDimensionMapping()?this.getTransformationDimensionMapping():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetTransformationDimensionMapping()?that.getTransformationDimensionMapping():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transformationDimensionMapping", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transformationDimensionMapping", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCheckPointDescription();
            boolean rhsFieldIsSet = that.isSetCheckPointDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getCheckPointDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCheckPointDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "checkPointDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "checkPointDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCenterPoint();
            boolean rhsFieldIsSet = that.isSetCenterPoint();
            GMPointPropertyType lhsField;
            lhsField = this.getCenterPoint();
            GMPointPropertyType rhsField;
            rhsField = that.getCenterPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "centerPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "centerPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointInPixel();
            boolean rhsFieldIsSet = that.isSetPointInPixel();
            MDPixelOrientationCodePropertyType lhsField;
            lhsField = this.getPointInPixel();
            MDPixelOrientationCodePropertyType rhsField;
            rhsField = that.getPointInPixel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointInPixel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointInPixel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCornerPoints();
            boolean rhsFieldIsSet = that.isSetCornerPoints();
            List<GMPointPropertyType> lhsField;
            lhsField = (this.isSetCornerPoints()?this.getCornerPoints():null);
            List<GMPointPropertyType> rhsField;
            rhsField = (that.isSetCornerPoints()?that.getCornerPoints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cornerPoints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cornerPoints", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransformationDimensionDescription();
            boolean rhsFieldIsSet = that.isSetTransformationDimensionDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getTransformationDimensionDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getTransformationDimensionDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transformationDimensionDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transformationDimensionDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCheckPointAvailability();
            boolean rhsFieldIsSet = that.isSetCheckPointAvailability();
            BooleanPropertyType lhsField;
            lhsField = this.getCheckPointAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getCheckPointAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "checkPointAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "checkPointAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetCheckPointAvailability();
            BooleanPropertyType theField;
            theField = this.getCheckPointAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "checkPointAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCheckPointDescription();
            CharacterStringPropertyType theField;
            theField = this.getCheckPointDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "checkPointDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCornerPoints();
            List<GMPointPropertyType> theField;
            theField = (this.isSetCornerPoints()?this.getCornerPoints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cornerPoints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCenterPoint();
            GMPointPropertyType theField;
            theField = this.getCenterPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "centerPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointInPixel();
            MDPixelOrientationCodePropertyType theField;
            theField = this.getPointInPixel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointInPixel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationDimensionDescription();
            CharacterStringPropertyType theField;
            theField = this.getTransformationDimensionDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transformationDimensionDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationDimensionMapping();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetTransformationDimensionMapping()?this.getTransformationDimensionMapping():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transformationDimensionMapping", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCheckPointAvailability();
            BooleanPropertyType theField;
            theField = this.getCheckPointAvailability();
            strategy.appendField(locator, this, "checkPointAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCheckPointDescription();
            CharacterStringPropertyType theField;
            theField = this.getCheckPointDescription();
            strategy.appendField(locator, this, "checkPointDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCornerPoints();
            List<GMPointPropertyType> theField;
            theField = (this.isSetCornerPoints()?this.getCornerPoints():null);
            strategy.appendField(locator, this, "cornerPoints", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCenterPoint();
            GMPointPropertyType theField;
            theField = this.getCenterPoint();
            strategy.appendField(locator, this, "centerPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointInPixel();
            MDPixelOrientationCodePropertyType theField;
            theField = this.getPointInPixel();
            strategy.appendField(locator, this, "pointInPixel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationDimensionDescription();
            CharacterStringPropertyType theField;
            theField = this.getTransformationDimensionDescription();
            strategy.appendField(locator, this, "transformationDimensionDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationDimensionMapping();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetTransformationDimensionMapping()?this.getTransformationDimensionMapping():null);
            strategy.appendField(locator, this, "transformationDimensionMapping", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
