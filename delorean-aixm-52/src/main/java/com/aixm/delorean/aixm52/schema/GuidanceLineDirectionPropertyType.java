
package com.aixm.delorean.aixm52.schema;

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
import java.io.Serializable;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for GuidanceLineDirectionPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="GuidanceLineDirectionPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}GuidanceLineDirection"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuidanceLineDirectionPropertyType", propOrder = {"guidanceLineDirection"})
@Entity(name = "GuidanceLineDirectionPropertyType")
@Table(name = "guidancelinedirectionpropertytype", schema = "airport_heliport")
public class GuidanceLineDirectionPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "GuidanceLineDirection", required = true)
    protected GuidanceLineDirectionType guidanceLineDirection;

    /**
     * Gets the value of the guidanceLineDirection property.
     *
     * @return possible object is {@link GuidanceLineDirectionType }
     *
     */
    @OneToOne(targetEntity = GuidanceLineDirectionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancelinedirection_hjid", referencedColumnName = "hjid")
    public GuidanceLineDirectionType getGuidanceLineDirection() {
        return guidanceLineDirection;
    }

    /**
     * Sets the value of the guidanceLineDirection property.
     *
     * @param value
     *            allowed object is {@link GuidanceLineDirectionType }
     *
     */
    public void setGuidanceLineDirection(GuidanceLineDirectionType value) {
        this.guidanceLineDirection = value;
    }

    @Transient
    public boolean isSetGuidanceLineDirection() {
        return (this.guidanceLineDirection != null);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GuidanceLineDirectionPropertyType that = ((GuidanceLineDirectionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetGuidanceLineDirection();
            boolean rhsFieldIsSet = that.isSetGuidanceLineDirection();
            GuidanceLineDirectionType lhsField;
            lhsField = this.getGuidanceLineDirection();
            GuidanceLineDirectionType rhsField;
            rhsField = that.getGuidanceLineDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceLineDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceLineDirection", rhsField);
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
            boolean theFieldIsSet = this.isSetGuidanceLineDirection();
            GuidanceLineDirectionType theField;
            theField = this.getGuidanceLineDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceLineDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetGuidanceLineDirection();
            GuidanceLineDirectionType theField;
            theField = this.getGuidanceLineDirection();
            strategy.appendField(locator, this, "guidanceLineDirection", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
