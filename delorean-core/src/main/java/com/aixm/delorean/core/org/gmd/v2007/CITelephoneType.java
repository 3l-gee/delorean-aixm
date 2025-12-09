
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
 * Telephone numbers for contacting the responsible individual or organisation
 * 
 * <p>Java class for CI_Telephone_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_Telephone_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="voice" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="facsimile" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Telephone_Type", propOrder = {
    "voice",
    "facsimile"
})
public class CITelephoneType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected List<CharacterStringPropertyType> voice;
    protected List<CharacterStringPropertyType> facsimile;

    /**
     * Gets the value of the voice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getVoice() {
        if (voice == null) {
            voice = new ArrayList<>();
        }
        return this.voice;
    }

    /**
     * 
     * 
     */
    public void setVoice(List<CharacterStringPropertyType> voice) {
        this.voice = voice;
    }

    public boolean isSetVoice() {
        return ((this.voice!= null)&&(!this.voice.isEmpty()));
    }

    public void unsetVoice() {
        this.voice = null;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<>();
        }
        return this.facsimile;
    }

    /**
     * 
     * 
     */
    public void setFacsimile(List<CharacterStringPropertyType> facsimile) {
        this.facsimile = facsimile;
    }

    public boolean isSetFacsimile() {
        return ((this.facsimile!= null)&&(!this.facsimile.isEmpty()));
    }

    public void unsetFacsimile() {
        this.facsimile = null;
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
        final CITelephoneType that = ((CITelephoneType) object);
        {
            boolean lhsFieldIsSet = this.isSetVoice();
            boolean rhsFieldIsSet = that.isSetVoice();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetVoice()?this.getVoice():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetVoice()?that.getVoice():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "voice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "voice", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFacsimile();
            boolean rhsFieldIsSet = that.isSetFacsimile();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetFacsimile()?this.getFacsimile():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetFacsimile()?that.getFacsimile():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "facsimile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "facsimile", rhsField);
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
            boolean theFieldIsSet = this.isSetVoice();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetVoice()?this.getVoice():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "voice", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacsimile();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetFacsimile()?this.getFacsimile():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "facsimile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetVoice();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetVoice()?this.getVoice():null);
            strategy.appendField(locator, this, "voice", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacsimile();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetFacsimile()?this.getFacsimile():null);
            strategy.appendField(locator, this, "facsimile", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
