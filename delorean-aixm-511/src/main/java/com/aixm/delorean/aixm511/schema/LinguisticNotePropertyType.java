
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
 * <p>Java class for LinguisticNotePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LinguisticNotePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}LinguisticNote"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticNotePropertyType", propOrder = {
    "linguisticNote"
})
@Entity(name = "LinguisticNotePropertyType")
@Table(name = "linguisticnote_pt", schema = "note")
public class LinguisticNotePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "LinguisticNote", required = true)
    protected LinguisticNoteType linguisticNote;

    /**
     * Gets the value of the linguisticNote property.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticNoteType }
     *     
     */
    @OneToOne(targetEntity = LinguisticNoteType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "linguisticnote_id", referencedColumnName = "hjid")
    public LinguisticNoteType getLinguisticNote() {
        return linguisticNote;
    }

    /**
     * Sets the value of the linguisticNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticNoteType }
     *     
     */
    public void setLinguisticNote(LinguisticNoteType value) {
        this.linguisticNote = value;
    }

    @Transient
    public boolean isSetLinguisticNote() {
        return (this.linguisticNote!= null);
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
        final LinguisticNotePropertyType that = ((LinguisticNotePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetLinguisticNote();
            boolean rhsFieldIsSet = that.isSetLinguisticNote();
            LinguisticNoteType lhsField;
            lhsField = this.getLinguisticNote();
            LinguisticNoteType rhsField;
            rhsField = that.getLinguisticNote();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "linguisticNote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "linguisticNote", rhsField);
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
            boolean theFieldIsSet = this.isSetLinguisticNote();
            LinguisticNoteType theField;
            theField = this.getLinguisticNote();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "linguisticNote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetLinguisticNote();
            LinguisticNoteType theField;
            theField = this.getLinguisticNote();
            strategy.appendField(locator, this, "linguisticNote", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
