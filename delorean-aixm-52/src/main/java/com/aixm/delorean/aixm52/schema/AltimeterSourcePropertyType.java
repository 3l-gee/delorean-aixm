
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
 * Java class for AltimeterSourcePropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AltimeterSourcePropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}AltimeterSource"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltimeterSourcePropertyType", propOrder = {"altimeterSource"})
@Entity(name = "AltimeterSourcePropertyType")
@Table(name = "altimetersourcepropertytype", schema = "airport_heliport")
public class AltimeterSourcePropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AltimeterSource", required = true)
    protected AltimeterSourceType altimeterSource;

    /**
     * Gets the value of the altimeterSource property.
     *
     * @return possible object is {@link AltimeterSourceType }
     *
     */
    @OneToOne(targetEntity = AltimeterSourceType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "altimetersource_hjid", referencedColumnName = "hjid")
    public AltimeterSourceType getAltimeterSource() {
        return altimeterSource;
    }

    /**
     * Sets the value of the altimeterSource property.
     *
     * @param value
     *            allowed object is {@link AltimeterSourceType }
     *
     */
    public void setAltimeterSource(AltimeterSourceType value) {
        this.altimeterSource = value;
    }

    @Transient
    public boolean isSetAltimeterSource() {
        return (this.altimeterSource != null);
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
        final AltimeterSourcePropertyType that = ((AltimeterSourcePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltimeterSource();
            boolean rhsFieldIsSet = that.isSetAltimeterSource();
            AltimeterSourceType lhsField;
            lhsField = this.getAltimeterSource();
            AltimeterSourceType rhsField;
            rhsField = that.getAltimeterSource();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeterSource", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeterSource", rhsField);
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
            boolean theFieldIsSet = this.isSetAltimeterSource();
            AltimeterSourceType theField;
            theField = this.getAltimeterSource();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeterSource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAltimeterSource();
            AltimeterSourceType theField;
            theField = this.getAltimeterSource();
            strategy.appendField(locator, this, "altimeterSource", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
