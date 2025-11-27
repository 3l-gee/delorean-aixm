
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RealPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about the media on which the data can be distributed
 * 
 * <p>Java class for MD_Medium_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Medium_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="name" type="{http://www.isotc211.org/2005/gmd}MD_MediumNameCode_PropertyType" minOccurs="0"/>
 *         <element name="density" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="densityUnits" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="volumes" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         <element name="mediumFormat" type="{http://www.isotc211.org/2005/gmd}MD_MediumFormatCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="mediumNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Medium_Type", propOrder = {
    "name",
    "density",
    "densityUnits",
    "volumes",
    "mediumFormat",
    "mediumNote"
})
public class MDMediumType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected MDMediumNameCodePropertyType name;
    protected List<RealPropertyType> density;
    protected CharacterStringPropertyType densityUnits;
    protected IntegerPropertyType volumes;
    protected List<MDMediumFormatCodePropertyType> mediumFormat;
    protected CharacterStringPropertyType mediumNote;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public MDMediumNameCodePropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public void setName(MDMediumNameCodePropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the density property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the density property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealPropertyType }
     * 
     * 
     */
    public List<RealPropertyType> getDensity() {
        if (density == null) {
            density = new ArrayList<>();
        }
        return this.density;
    }

    /**
     * 
     * 
     */
    public void setDensity(List<RealPropertyType> density) {
        this.density = density;
    }

    public boolean isSetDensity() {
        return ((this.density!= null)&&(!this.density.isEmpty()));
    }

    public void unsetDensity() {
        this.density = null;
    }

    /**
     * Gets the value of the densityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDensityUnits() {
        return densityUnits;
    }

    /**
     * Sets the value of the densityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDensityUnits(CharacterStringPropertyType value) {
        this.densityUnits = value;
    }

    public boolean isSetDensityUnits() {
        return (this.densityUnits!= null);
    }

    /**
     * Gets the value of the volumes property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getVolumes() {
        return volumes;
    }

    /**
     * Sets the value of the volumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setVolumes(IntegerPropertyType value) {
        this.volumes = value;
    }

    public boolean isSetVolumes() {
        return (this.volumes!= null);
    }

    /**
     * Gets the value of the mediumFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediumFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMediumFormatCodePropertyType }
     * 
     * 
     */
    public List<MDMediumFormatCodePropertyType> getMediumFormat() {
        if (mediumFormat == null) {
            mediumFormat = new ArrayList<>();
        }
        return this.mediumFormat;
    }

    /**
     * 
     * 
     */
    public void setMediumFormat(List<MDMediumFormatCodePropertyType> mediumFormat) {
        this.mediumFormat = mediumFormat;
    }

    public boolean isSetMediumFormat() {
        return ((this.mediumFormat!= null)&&(!this.mediumFormat.isEmpty()));
    }

    public void unsetMediumFormat() {
        this.mediumFormat = null;
    }

    /**
     * Gets the value of the mediumNote property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMediumNote() {
        return mediumNote;
    }

    /**
     * Sets the value of the mediumNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMediumNote(CharacterStringPropertyType value) {
        this.mediumNote = value;
    }

    public boolean isSetMediumNote() {
        return (this.mediumNote!= null);
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
        final MDMediumType that = ((MDMediumType) object);
        {
            boolean lhsFieldIsSet = this.isSetMediumNote();
            boolean rhsFieldIsSet = that.isSetMediumNote();
            CharacterStringPropertyType lhsField;
            lhsField = this.getMediumNote();
            CharacterStringPropertyType rhsField;
            rhsField = that.getMediumNote();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mediumNote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mediumNote", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            MDMediumNameCodePropertyType lhsField;
            lhsField = this.getName();
            MDMediumNameCodePropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDensity();
            boolean rhsFieldIsSet = that.isSetDensity();
            List<RealPropertyType> lhsField;
            lhsField = (this.isSetDensity()?this.getDensity():null);
            List<RealPropertyType> rhsField;
            rhsField = (that.isSetDensity()?that.getDensity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "density", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "density", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDensityUnits();
            boolean rhsFieldIsSet = that.isSetDensityUnits();
            CharacterStringPropertyType lhsField;
            lhsField = this.getDensityUnits();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDensityUnits();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "densityUnits", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "densityUnits", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVolumes();
            boolean rhsFieldIsSet = that.isSetVolumes();
            IntegerPropertyType lhsField;
            lhsField = this.getVolumes();
            IntegerPropertyType rhsField;
            rhsField = that.getVolumes();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "volumes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "volumes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMediumFormat();
            boolean rhsFieldIsSet = that.isSetMediumFormat();
            List<MDMediumFormatCodePropertyType> lhsField;
            lhsField = (this.isSetMediumFormat()?this.getMediumFormat():null);
            List<MDMediumFormatCodePropertyType> rhsField;
            rhsField = (that.isSetMediumFormat()?that.getMediumFormat():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mediumFormat", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mediumFormat", rhsField);
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
            boolean theFieldIsSet = this.isSetName();
            MDMediumNameCodePropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDensity();
            List<RealPropertyType> theField;
            theField = (this.isSetDensity()?this.getDensity():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "density", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDensityUnits();
            CharacterStringPropertyType theField;
            theField = this.getDensityUnits();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "densityUnits", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVolumes();
            IntegerPropertyType theField;
            theField = this.getVolumes();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "volumes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMediumFormat();
            List<MDMediumFormatCodePropertyType> theField;
            theField = (this.isSetMediumFormat()?this.getMediumFormat():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mediumFormat", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMediumNote();
            CharacterStringPropertyType theField;
            theField = this.getMediumNote();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mediumNote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetName();
            MDMediumNameCodePropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDensity();
            List<RealPropertyType> theField;
            theField = (this.isSetDensity()?this.getDensity():null);
            strategy.appendField(locator, this, "density", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDensityUnits();
            CharacterStringPropertyType theField;
            theField = this.getDensityUnits();
            strategy.appendField(locator, this, "densityUnits", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVolumes();
            IntegerPropertyType theField;
            theField = this.getVolumes();
            strategy.appendField(locator, this, "volumes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMediumFormat();
            List<MDMediumFormatCodePropertyType> theField;
            theField = (this.isSetMediumFormat()?this.getMediumFormat():null);
            strategy.appendField(locator, this, "mediumFormat", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMediumNote();
            CharacterStringPropertyType theField;
            theField = this.getMediumNote();
            strategy.appendField(locator, this, "mediumNote", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
