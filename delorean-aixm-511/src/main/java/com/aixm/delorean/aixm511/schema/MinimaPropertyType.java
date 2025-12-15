
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
 * <p>Java class for MinimaPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MinimaPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Minima"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimaPropertyType", propOrder = {
    "minima"
})
@Entity(name = "MinimaPropertyType")
@Table(name = "minima_pt", schema = "procedure")
public class MinimaPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Minima", required = true)
    protected MinimaType minima;

    /**
     * Gets the value of the minima property.
     * 
     * @return
     *     possible object is
     *     {@link MinimaType }
     *     
     */
    @OneToOne(targetEntity = MinimaType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "minima_id", referencedColumnName = "hjid")
    public MinimaType getMinima() {
        return minima;
    }

    /**
     * Sets the value of the minima property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimaType }
     *     
     */
    public void setMinima(MinimaType value) {
        this.minima = value;
    }

    @Transient
    public boolean isSetMinima() {
        return (this.minima!= null);
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
        final MinimaPropertyType that = ((MinimaPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinima();
            boolean rhsFieldIsSet = that.isSetMinima();
            MinimaType lhsField;
            lhsField = this.getMinima();
            MinimaType rhsField;
            rhsField = that.getMinima();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minima", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minima", rhsField);
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
            boolean theFieldIsSet = this.isSetMinima();
            MinimaType theField;
            theField = this.getMinima();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minima", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMinima();
            MinimaType theField;
            theField = this.getMinima();
            strategy.appendField(locator, this, "minima", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
