
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
 * <p>Java class for FASDataBlockPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FASDataBlockPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FASDataBlock"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FASDataBlockPropertyType", propOrder = {
    "fasDataBlock"
})
@Entity(name = "FASDataBlockPropertyType")
@Table(name = "fasdatablock_pt", schema = "procedure")
public class FASDataBlockPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FASDataBlock", required = true)
    protected FASDataBlockType fasDataBlock;

    /**
     * Gets the value of the fasDataBlock property.
     * 
     * @return
     *     possible object is
     *     {@link FASDataBlockType }
     *     
     */
    @OneToOne(targetEntity = FASDataBlockType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "fasdatablock_id", referencedColumnName = "hjid")
    public FASDataBlockType getFASDataBlock() {
        return fasDataBlock;
    }

    /**
     * Sets the value of the fasDataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASDataBlockType }
     *     
     */
    public void setFASDataBlock(FASDataBlockType value) {
        this.fasDataBlock = value;
    }

    @Transient
    public boolean isSetFASDataBlock() {
        return (this.fasDataBlock!= null);
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
        final FASDataBlockPropertyType that = ((FASDataBlockPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFASDataBlock();
            boolean rhsFieldIsSet = that.isSetFASDataBlock();
            FASDataBlockType lhsField;
            lhsField = this.getFASDataBlock();
            FASDataBlockType rhsField;
            rhsField = that.getFASDataBlock();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fasDataBlock", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fasDataBlock", rhsField);
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
            boolean theFieldIsSet = this.isSetFASDataBlock();
            FASDataBlockType theField;
            theField = this.getFASDataBlock();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fasDataBlock", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFASDataBlock();
            FASDataBlockType theField;
            theField = this.getFASDataBlock();
            strategy.appendField(locator, this, "fasDataBlock", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
