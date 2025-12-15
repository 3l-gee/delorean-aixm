
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
 * <p>Java class for PointReferencePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PointReferencePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}PointReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointReferencePropertyType", propOrder = {
    "pointReference"
})
@Entity(name = "PointReferencePropertyType")
@Table(name = "pointreference_pt", schema = "navaids_point")
public class PointReferencePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "PointReference", required = true)
    protected PointReferenceType pointReference;

    /**
     * Gets the value of the pointReference property.
     * 
     * @return
     *     possible object is
     *     {@link PointReferenceType }
     *     
     */
    @OneToOne(targetEntity = PointReferenceType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointreference_id", referencedColumnName = "hjid")
    public PointReferenceType getPointReference() {
        return pointReference;
    }

    /**
     * Sets the value of the pointReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointReferenceType }
     *     
     */
    public void setPointReference(PointReferenceType value) {
        this.pointReference = value;
    }

    @Transient
    public boolean isSetPointReference() {
        return (this.pointReference!= null);
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
        final PointReferencePropertyType that = ((PointReferencePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetPointReference();
            boolean rhsFieldIsSet = that.isSetPointReference();
            PointReferenceType lhsField;
            lhsField = this.getPointReference();
            PointReferenceType rhsField;
            rhsField = that.getPointReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointReference", rhsField);
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
            boolean theFieldIsSet = this.isSetPointReference();
            PointReferenceType theField;
            theField = this.getPointReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPointReference();
            PointReferenceType theField;
            theField = this.getPointReference();
            strategy.appendField(locator, this, "pointReference", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
