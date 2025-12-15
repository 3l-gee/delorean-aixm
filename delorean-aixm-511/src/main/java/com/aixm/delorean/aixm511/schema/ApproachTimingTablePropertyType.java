
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
 * <p>Java class for ApproachTimingTablePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachTimingTablePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApproachTimingTable"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachTimingTablePropertyType", propOrder = {
    "approachTimingTable"
})
@Entity(name = "ApproachTimingTablePropertyType")
@Table(name = "approachtimingtable_pt", schema = "procedure")
public class ApproachTimingTablePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApproachTimingTable", required = true)
    protected ApproachTimingTableType approachTimingTable;

    /**
     * Gets the value of the approachTimingTable property.
     * 
     * @return
     *     possible object is
     *     {@link ApproachTimingTableType }
     *     
     */
    @OneToOne(targetEntity = ApproachTimingTableType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approachtimingtable_id", referencedColumnName = "hjid")
    public ApproachTimingTableType getApproachTimingTable() {
        return approachTimingTable;
    }

    /**
     * Sets the value of the approachTimingTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachTimingTableType }
     *     
     */
    public void setApproachTimingTable(ApproachTimingTableType value) {
        this.approachTimingTable = value;
    }

    @Transient
    public boolean isSetApproachTimingTable() {
        return (this.approachTimingTable!= null);
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
        final ApproachTimingTablePropertyType that = ((ApproachTimingTablePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApproachTimingTable();
            boolean rhsFieldIsSet = that.isSetApproachTimingTable();
            ApproachTimingTableType lhsField;
            lhsField = this.getApproachTimingTable();
            ApproachTimingTableType rhsField;
            rhsField = that.getApproachTimingTable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachTimingTable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachTimingTable", rhsField);
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
            boolean theFieldIsSet = this.isSetApproachTimingTable();
            ApproachTimingTableType theField;
            theField = this.getApproachTimingTable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachTimingTable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApproachTimingTable();
            ApproachTimingTableType theField;
            theField = this.getApproachTimingTable();
            strategy.appendField(locator, this, "approachTimingTable", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
