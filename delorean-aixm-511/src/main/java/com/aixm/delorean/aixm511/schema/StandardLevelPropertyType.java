
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
 * <p>Java class for StandardLevelPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StandardLevelPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}StandardLevel"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardLevelPropertyType", propOrder = {
    "standardLevel"
})
@Entity(name = "StandardLevelPropertyType")
@Table(name = "standardlevel_pt", schema = "shared")
public class StandardLevelPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "StandardLevel", required = true)
    protected StandardLevelType standardLevel;

    /**
     * Gets the value of the standardLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StandardLevelType }
     *     
     */
    @OneToOne(targetEntity = StandardLevelType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "standardlevel_id", referencedColumnName = "hjid")
    public StandardLevelType getStandardLevel() {
        return standardLevel;
    }

    /**
     * Sets the value of the standardLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardLevelType }
     *     
     */
    public void setStandardLevel(StandardLevelType value) {
        this.standardLevel = value;
    }

    @Transient
    public boolean isSetStandardLevel() {
        return (this.standardLevel!= null);
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
        final StandardLevelPropertyType that = ((StandardLevelPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetStandardLevel();
            boolean rhsFieldIsSet = that.isSetStandardLevel();
            StandardLevelType lhsField;
            lhsField = this.getStandardLevel();
            StandardLevelType rhsField;
            rhsField = that.getStandardLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "standardLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "standardLevel", rhsField);
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
            boolean theFieldIsSet = this.isSetStandardLevel();
            StandardLevelType theField;
            theField = this.getStandardLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "standardLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetStandardLevel();
            StandardLevelType theField;
            theField = this.getStandardLevel();
            strategy.appendField(locator, this, "standardLevel", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
