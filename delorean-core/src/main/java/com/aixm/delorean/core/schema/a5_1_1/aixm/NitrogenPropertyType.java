
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for NitrogenPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NitrogenPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Nitrogen"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NitrogenPropertyType", propOrder = {
    "nitrogen"
})
@Entity(name = "NitrogenPropertyType")
@Table(name = "nitrogen_pt", schema = "service")
public class NitrogenPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Nitrogen", required = true)
    protected NitrogenType nitrogen;

    /**
     * Gets the value of the nitrogen property.
     * 
     * @return
     *     possible object is
     *     {@link NitrogenType }
     *     
     */
    @OneToOne(targetEntity = NitrogenType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "nitrogen_id", referencedColumnName = "hjid")
    public NitrogenType getNitrogen() {
        return nitrogen;
    }

    /**
     * Sets the value of the nitrogen property.
     * 
     * @param value
     *     allowed object is
     *     {@link NitrogenType }
     *     
     */
    public void setNitrogen(NitrogenType value) {
        this.nitrogen = value;
    }

    @Transient
    public boolean isSetNitrogen() {
        return (this.nitrogen!= null);
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
        final NitrogenPropertyType that = ((NitrogenPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNitrogen();
            boolean rhsFieldIsSet = that.isSetNitrogen();
            NitrogenType lhsField;
            lhsField = this.getNitrogen();
            NitrogenType rhsField;
            rhsField = that.getNitrogen();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nitrogen", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nitrogen", rhsField);
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
            boolean theFieldIsSet = this.isSetNitrogen();
            NitrogenType theField;
            theField = this.getNitrogen();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nitrogen", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNitrogen();
            NitrogenType theField;
            theField = this.getNitrogen();
            strategy.appendField(locator, this, "nitrogen", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
