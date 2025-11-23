
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RecordPropertyType;
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
 * <p>Java class for MD_Georeferenceable_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Georeferenceable_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       <sequence>
 *         <element name="controlPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         <element name="orientationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         <element name="orientationParameterDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="georeferencedParameters" type="{http://www.isotc211.org/2005/gco}Record_PropertyType"/>
 *         <element name="parameterCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georeferenceable_Type", propOrder = {
    "controlPointAvailability",
    "orientationParameterAvailability",
    "orientationParameterDescription",
    "georeferencedParameters",
    "parameterCitation"
})
public class MDGeoreferenceableType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType controlPointAvailability;
    @XmlElement(required = true)
    protected BooleanPropertyType orientationParameterAvailability;
    protected CharacterStringPropertyType orientationParameterDescription;
    @XmlElement(required = true)
    protected RecordPropertyType georeferencedParameters;
    protected List<CICitationPropertyType> parameterCitation;

    /**
     * Gets the value of the controlPointAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getControlPointAvailability() {
        return controlPointAvailability;
    }

    /**
     * Sets the value of the controlPointAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setControlPointAvailability(BooleanPropertyType value) {
        this.controlPointAvailability = value;
    }

    /**
     * Gets the value of the orientationParameterAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getOrientationParameterAvailability() {
        return orientationParameterAvailability;
    }

    /**
     * Sets the value of the orientationParameterAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setOrientationParameterAvailability(BooleanPropertyType value) {
        this.orientationParameterAvailability = value;
    }

    /**
     * Gets the value of the orientationParameterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrientationParameterDescription() {
        return orientationParameterDescription;
    }

    /**
     * Sets the value of the orientationParameterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrientationParameterDescription(CharacterStringPropertyType value) {
        this.orientationParameterDescription = value;
    }

    /**
     * Gets the value of the georeferencedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RecordPropertyType }
     *     
     */
    public RecordPropertyType getGeoreferencedParameters() {
        return georeferencedParameters;
    }

    /**
     * Sets the value of the georeferencedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordPropertyType }
     *     
     */
    public void setGeoreferencedParameters(RecordPropertyType value) {
        this.georeferencedParameters = value;
    }

    /**
     * Gets the value of the parameterCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getParameterCitation() {
        if (parameterCitation == null) {
            parameterCitation = new ArrayList<>();
        }
        return this.parameterCitation;
    }

    /**
     * 
     * 
     */
    public void setParameterCitation(List<CICitationPropertyType> parameterCitation) {
        this.parameterCitation = parameterCitation;
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
        final MDGeoreferenceableType that = ((MDGeoreferenceableType) object);
        {
            boolean lhsFieldIsSet = (this.orientationParameterDescription!= null);
            boolean rhsFieldIsSet = (that.orientationParameterDescription!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getOrientationParameterDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getOrientationParameterDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "orientationParameterDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "orientationParameterDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.georeferencedParameters!= null);
            boolean rhsFieldIsSet = (that.georeferencedParameters!= null);
            RecordPropertyType lhsField;
            lhsField = this.getGeoreferencedParameters();
            RecordPropertyType rhsField;
            rhsField = that.getGeoreferencedParameters();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "georeferencedParameters", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "georeferencedParameters", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.controlPointAvailability!= null);
            boolean rhsFieldIsSet = (that.controlPointAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getControlPointAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getControlPointAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlPointAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlPointAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.orientationParameterAvailability!= null);
            boolean rhsFieldIsSet = (that.orientationParameterAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getOrientationParameterAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getOrientationParameterAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "orientationParameterAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "orientationParameterAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()));
            boolean rhsFieldIsSet = ((that.parameterCitation!= null)&&(!that.parameterCitation.isEmpty()));
            List<CICitationPropertyType> lhsField;
            lhsField = (((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()))?this.getParameterCitation():null);
            List<CICitationPropertyType> rhsField;
            rhsField = (((that.parameterCitation!= null)&&(!that.parameterCitation.isEmpty()))?that.getParameterCitation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parameterCitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parameterCitation", rhsField);
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
            boolean theFieldIsSet = (this.controlPointAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getControlPointAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlPointAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orientationParameterAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getOrientationParameterAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "orientationParameterAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orientationParameterDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getOrientationParameterDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "orientationParameterDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.georeferencedParameters!= null);
            RecordPropertyType theField;
            theField = this.getGeoreferencedParameters();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "georeferencedParameters", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()));
            List<CICitationPropertyType> theField;
            theField = (((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()))?this.getParameterCitation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parameterCitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.controlPointAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getControlPointAvailability();
            strategy.appendField(locator, this, "controlPointAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orientationParameterAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getOrientationParameterAvailability();
            strategy.appendField(locator, this, "orientationParameterAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orientationParameterDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getOrientationParameterDescription();
            strategy.appendField(locator, this, "orientationParameterDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.georeferencedParameters!= null);
            RecordPropertyType theField;
            theField = this.getGeoreferencedParameters();
            strategy.appendField(locator, this, "georeferencedParameters", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()));
            List<CICitationPropertyType> theField;
            theField = (((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()))?this.getParameterCitation():null);
            strategy.appendField(locator, this, "parameterCitation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
