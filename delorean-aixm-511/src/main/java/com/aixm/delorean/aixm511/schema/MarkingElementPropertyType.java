
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
 * <p>Java class for MarkingElementPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MarkingElementPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}MarkingElement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkingElementPropertyType", propOrder = {
    "markingElement"
})
@Entity(name = "MarkingElementPropertyType")
@Table(name = "markingelement_pt", schema = "airport_heliport")
public class MarkingElementPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "MarkingElement", required = true)
    protected MarkingElementType markingElement;

    /**
     * Gets the value of the markingElement property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingElementType }
     *     
     */
    @OneToOne(targetEntity = MarkingElementType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "markingelement_id", referencedColumnName = "hjid")
    public MarkingElementType getMarkingElement() {
        return markingElement;
    }

    /**
     * Sets the value of the markingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingElementType }
     *     
     */
    public void setMarkingElement(MarkingElementType value) {
        this.markingElement = value;
    }

    @Transient
    public boolean isSetMarkingElement() {
        return (this.markingElement!= null);
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
        final MarkingElementPropertyType that = ((MarkingElementPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMarkingElement();
            boolean rhsFieldIsSet = that.isSetMarkingElement();
            MarkingElementType lhsField;
            lhsField = this.getMarkingElement();
            MarkingElementType rhsField;
            rhsField = that.getMarkingElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingElement", rhsField);
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
            boolean theFieldIsSet = this.isSetMarkingElement();
            MarkingElementType theField;
            theField = this.getMarkingElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMarkingElement();
            MarkingElementType theField;
            theField = this.getMarkingElement();
            strategy.appendField(locator, this, "markingElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
