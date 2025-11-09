
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
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
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurfaceContaminationExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwaySectionContaminationExtension"/>
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
    "abstractSurfaceContaminationExtension",
    "abstractRunwaySectionContaminationExtension"
})
@Entity(name = "RunwaySectionContaminationTypeExtensionType")
@Table(name = "runwaysectioncontamination_ext", schema = "airport_heliport")
public class RunwaySectionContaminationTypeExtensionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AbstractSurfaceContaminationExtension")
    protected AbstractExtensionType abstractSurfaceContaminationExtension;
    @XmlElement(name = "AbstractRunwaySectionContaminationExtension")
    protected AbstractExtensionType abstractRunwaySectionContaminationExtension;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the abstractSurfaceContaminationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @ManyToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.REFRESH,
        CascadeType.PERSIST,
        CascadeType.DETACH,
        CascadeType.MERGE
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "RUNWAY_SECTION_CONTAMINATION_2", joinColumns = {
        @JoinColumn(name = "PARENT_RUNWAY_SECTION_CONTAM_0")
    }, inverseJoinColumns = {
        @JoinColumn(name = "CHILD_ABSTRACT_EXTENSION_TYP_0")
    })
    public AbstractExtensionType getAbstractSurfaceContaminationExtension() {
        return abstractSurfaceContaminationExtension;
    }

    /**
     * Sets the value of the abstractSurfaceContaminationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractSurfaceContaminationExtension(AbstractExtensionType value) {
        this.abstractSurfaceContaminationExtension = value;
    }

    @Transient
    public boolean isSetAbstractSurfaceContaminationExtension() {
        return (this.abstractSurfaceContaminationExtension!= null);
    }

    /**
     * Gets the value of the abstractRunwaySectionContaminationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @ManyToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.REFRESH,
        CascadeType.PERSIST,
        CascadeType.DETACH,
        CascadeType.MERGE
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "RUNWAY_SECTION_CONTAMINATION_3", joinColumns = {
        @JoinColumn(name = "PARENT_RUNWAY_SECTION_CONTAM_0")
    }, inverseJoinColumns = {
        @JoinColumn(name = "CHILD_ABSTRACT_EXTENSION_TYP_0")
    })
    public AbstractExtensionType getAbstractRunwaySectionContaminationExtension() {
        return abstractRunwaySectionContaminationExtension;
    }

    /**
     * Sets the value of the abstractRunwaySectionContaminationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractRunwaySectionContaminationExtension(AbstractExtensionType value) {
        this.abstractRunwaySectionContaminationExtension = value;
    }

    @Transient
    public boolean isSetAbstractRunwaySectionContaminationExtension() {
        return (this.abstractRunwaySectionContaminationExtension!= null);
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
     * Gets the value of the hjid property.
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
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
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
        final RunwaySectionContaminationTypeExtensionType that = ((RunwaySectionContaminationTypeExtensionType) object);
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
        {
            boolean lhsFieldIsSet = this.isSetAbstractSurfaceContaminationExtension();
            boolean rhsFieldIsSet = that.isSetAbstractSurfaceContaminationExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractSurfaceContaminationExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractSurfaceContaminationExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSurfaceContaminationExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSurfaceContaminationExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractRunwaySectionContaminationExtension();
            boolean rhsFieldIsSet = that.isSetAbstractRunwaySectionContaminationExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractRunwaySectionContaminationExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractRunwaySectionContaminationExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractRunwaySectionContaminationExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractRunwaySectionContaminationExtension", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractSurfaceContaminationExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSurfaceContaminationExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSurfaceContaminationExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractRunwaySectionContaminationExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractRunwaySectionContaminationExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractRunwaySectionContaminationExtension", theField);
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
            boolean theFieldIsSet = this.isSetAbstractSurfaceContaminationExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSurfaceContaminationExtension();
            strategy.appendField(locator, this, "abstractSurfaceContaminationExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractRunwaySectionContaminationExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractRunwaySectionContaminationExtension();
            strategy.appendField(locator, this, "abstractRunwaySectionContaminationExtension", buffer, theField, theFieldIsSet);
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
