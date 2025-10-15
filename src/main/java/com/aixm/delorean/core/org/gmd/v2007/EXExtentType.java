
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about spatial, vertical, and temporal extent
 * 
 * <p>Java class for EX_Extent_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_Extent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="geographicElement" type="{http://www.isotc211.org/2005/gmd}EX_GeographicExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="temporalElement" type="{http://www.isotc211.org/2005/gmd}EX_TemporalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="verticalElement" type="{http://www.isotc211.org/2005/gmd}EX_VerticalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_Extent_Type", propOrder = {
    "description",
    "geographicElement",
    "temporalElement",
    "verticalElement"
})
public class EXExtentType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CharacterStringPropertyType description;
    protected List<EXGeographicExtentPropertyType> geographicElement;
    protected List<EXTemporalExtentPropertyType> temporalElement;
    protected List<EXVerticalExtentPropertyType> verticalElement;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the geographicElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<EXGeographicExtentPropertyType> getGeographicElement() {
        if (geographicElement == null) {
            geographicElement = new ArrayList<>();
        }
        return this.geographicElement;
    }

    /**
     * 
     * 
     */
    public void setGeographicElement(List<EXGeographicExtentPropertyType> geographicElement) {
        this.geographicElement = geographicElement;
    }

    public boolean isSetGeographicElement() {
        return ((this.geographicElement!= null)&&(!this.geographicElement.isEmpty()));
    }

    public void unsetGeographicElement() {
        this.geographicElement = null;
    }

    /**
     * Gets the value of the temporalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTemporalExtentPropertyType }
     * 
     * 
     */
    public List<EXTemporalExtentPropertyType> getTemporalElement() {
        if (temporalElement == null) {
            temporalElement = new ArrayList<>();
        }
        return this.temporalElement;
    }

    /**
     * 
     * 
     */
    public void setTemporalElement(List<EXTemporalExtentPropertyType> temporalElement) {
        this.temporalElement = temporalElement;
    }

    public boolean isSetTemporalElement() {
        return ((this.temporalElement!= null)&&(!this.temporalElement.isEmpty()));
    }

    public void unsetTemporalElement() {
        this.temporalElement = null;
    }

    /**
     * Gets the value of the verticalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXVerticalExtentPropertyType }
     * 
     * 
     */
    public List<EXVerticalExtentPropertyType> getVerticalElement() {
        if (verticalElement == null) {
            verticalElement = new ArrayList<>();
        }
        return this.verticalElement;
    }

    /**
     * 
     * 
     */
    public void setVerticalElement(List<EXVerticalExtentPropertyType> verticalElement) {
        this.verticalElement = verticalElement;
    }

    public boolean isSetVerticalElement() {
        return ((this.verticalElement!= null)&&(!this.verticalElement.isEmpty()));
    }

    public void unsetVerticalElement() {
        this.verticalElement = null;
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
        final EXExtentType that = ((EXExtentType) object);
        {
            boolean lhsFieldIsSet = this.isSetDescription();
            boolean rhsFieldIsSet = that.isSetDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "description", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "description", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalElement();
            boolean rhsFieldIsSet = that.isSetVerticalElement();
            List<EXVerticalExtentPropertyType> lhsField;
            lhsField = (this.isSetVerticalElement()?this.getVerticalElement():null);
            List<EXVerticalExtentPropertyType> rhsField;
            rhsField = (that.isSetVerticalElement()?that.getVerticalElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeographicElement();
            boolean rhsFieldIsSet = that.isSetGeographicElement();
            List<EXGeographicExtentPropertyType> lhsField;
            lhsField = (this.isSetGeographicElement()?this.getGeographicElement():null);
            List<EXGeographicExtentPropertyType> rhsField;
            rhsField = (that.isSetGeographicElement()?that.getGeographicElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geographicElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geographicElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTemporalElement();
            boolean rhsFieldIsSet = that.isSetTemporalElement();
            List<EXTemporalExtentPropertyType> lhsField;
            lhsField = (this.isSetTemporalElement()?this.getTemporalElement():null);
            List<EXTemporalExtentPropertyType> rhsField;
            rhsField = (that.isSetTemporalElement()?that.getTemporalElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "temporalElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "temporalElement", rhsField);
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
            boolean theFieldIsSet = this.isSetDescription();
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "description", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeographicElement();
            List<EXGeographicExtentPropertyType> theField;
            theField = (this.isSetGeographicElement()?this.getGeographicElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geographicElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTemporalElement();
            List<EXTemporalExtentPropertyType> theField;
            theField = (this.isSetTemporalElement()?this.getTemporalElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "temporalElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalElement();
            List<EXVerticalExtentPropertyType> theField;
            theField = (this.isSetVerticalElement()?this.getVerticalElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDescription();
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeographicElement();
            List<EXGeographicExtentPropertyType> theField;
            theField = (this.isSetGeographicElement()?this.getGeographicElement():null);
            strategy.appendField(locator, this, "geographicElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTemporalElement();
            List<EXTemporalExtentPropertyType> theField;
            theField = (this.isSetTemporalElement()?this.getTemporalElement():null);
            strategy.appendField(locator, this, "temporalElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalElement();
            List<EXVerticalExtentPropertyType> theField;
            theField = (this.isSetVerticalElement()?this.getVerticalElement():null);
            strategy.appendField(locator, this, "verticalElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
