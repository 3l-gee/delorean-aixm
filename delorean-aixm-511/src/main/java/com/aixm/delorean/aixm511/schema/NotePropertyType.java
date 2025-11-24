
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
 * <p>Java class for NotePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Note"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotePropertyType", propOrder = {
    "note"
})
@Entity(name = "NotePropertyType")
@Table(name = "note_pt", schema = "note")
public class NotePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Note", required = true)
    protected NoteType note;

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link NoteType }
     *     
     */
    @OneToOne(targetEntity = NoteType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "note_id", referencedColumnName = "hjid")
    public NoteType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteType }
     *     
     */
    public void setNote(NoteType value) {
        this.note = value;
    }

    @Transient
    public boolean isSetNote() {
        return (this.note!= null);
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
        final NotePropertyType that = ((NotePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNote();
            boolean rhsFieldIsSet = that.isSetNote();
            NoteType lhsField;
            lhsField = this.getNote();
            NoteType rhsField;
            rhsField = that.getNote();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "note", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "note", rhsField);
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
            boolean theFieldIsSet = this.isSetNote();
            NoteType theField;
            theField = this.getNote();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "note", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNote();
            NoteType theField;
            theField = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
