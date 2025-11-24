
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUnitAvailabilityExtension"/>
 *       </choice>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractPropertiesWithScheduleExtension",
    "abstractUnitAvailabilityExtension"
})
@Entity(name = "UnitAvailabilityTypeExtensionType")
@Table(name = "unitavailability_ext", schema = "organisation")
public class UnitAvailabilityTypeExtensionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AbstractPropertiesWithScheduleExtension")
    protected AbstractExtensionType abstractPropertiesWithScheduleExtension;
    @XmlElement(name = "AbstractUnitAvailabilityExtension")
    protected AbstractExtensionType abstractUnitAvailabilityExtension;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the abstractPropertiesWithScheduleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractpropertieswithscheduleextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractPropertiesWithScheduleExtension() {
        return abstractPropertiesWithScheduleExtension;
    }

    /**
     * Sets the value of the abstractPropertiesWithScheduleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractPropertiesWithScheduleExtension(AbstractExtensionType value) {
        this.abstractPropertiesWithScheduleExtension = value;
    }

    @Transient
    public boolean isSetAbstractPropertiesWithScheduleExtension() {
        return (this.abstractPropertiesWithScheduleExtension!= null);
    }

    /**
     * Gets the value of the abstractUnitAvailabilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractunitavailabilityextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractUnitAvailabilityExtension() {
        return abstractUnitAvailabilityExtension;
    }

    /**
     * Sets the value of the abstractUnitAvailabilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractUnitAvailabilityExtension(AbstractExtensionType value) {
        this.abstractUnitAvailabilityExtension = value;
    }

    @Transient
    public boolean isSetAbstractUnitAvailabilityExtension() {
        return (this.abstractUnitAvailabilityExtension!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "OWNS")
    public boolean getOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    @Transient
    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
    public Long gethjid() {
        return hjid;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjid(Long value) {
        this.hjid = value;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjversion(Long value) {
        this.hjversion = value;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnitAvailabilityTypeExtensionType that = ((UnitAvailabilityTypeExtensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractPropertiesWithScheduleExtension();
            boolean rhsFieldIsSet = that.isSetAbstractPropertiesWithScheduleExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractPropertiesWithScheduleExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractPropertiesWithScheduleExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractPropertiesWithScheduleExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractPropertiesWithScheduleExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractUnitAvailabilityExtension();
            boolean rhsFieldIsSet = that.isSetAbstractUnitAvailabilityExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractUnitAvailabilityExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractUnitAvailabilityExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractUnitAvailabilityExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractUnitAvailabilityExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOwns();
            boolean rhsFieldIsSet = that.isSetOwns();
            boolean lhsField;
            lhsField = (this.isSetOwns()?this.getOwns():false);
            boolean rhsField;
            rhsField = (that.isSetOwns()?that.getOwns():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetAbstractPropertiesWithScheduleExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractPropertiesWithScheduleExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractPropertiesWithScheduleExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractUnitAvailabilityExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractUnitAvailabilityExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractUnitAvailabilityExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "owns", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetAbstractPropertiesWithScheduleExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractPropertiesWithScheduleExtension();
            strategy.appendField(locator, this, "abstractPropertiesWithScheduleExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractUnitAvailabilityExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractUnitAvailabilityExtension();
            strategy.appendField(locator, this, "abstractUnitAvailabilityExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
