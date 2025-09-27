
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 * 
 * <p>Java class for AbstractAIXMFeatureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMFeatureType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMFeatureBaseType">
 *       <sequence>
 *         <element name="featureMetadata" type="{http://www.aixm.aero/schema/5.2}FeatureMetadataPropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", propOrder = {
    "featureMetadata"
})
@XmlSeeAlso({
    DMEType.class
})
@Entity(name = "AbstractAIXMFeatureType")
@Table(name = "abstract_aixm_feature", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractAIXMFeatureType
    extends AbstractAIXMFeatureBaseType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected FeatureMetadataPropertyType featureMetadata;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the featureMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    @ManyToOne(targetEntity = FeatureMetadataPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "FEATURE_METADATA_ABSTRACT_AI_0", nullable = true)
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * Sets the value of the featureMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

    @Transient
    public boolean isSetFeatureMetadata() {
        return (this.featureMetadata!= null);
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
        final AbstractAIXMFeatureType that = ((AbstractAIXMFeatureType) object);
        {
            boolean lhsFieldIsSet = this.isSetFeatureMetadata();
            boolean rhsFieldIsSet = that.isSetFeatureMetadata();
            FeatureMetadataPropertyType lhsField;
            lhsField = this.getFeatureMetadata();
            FeatureMetadataPropertyType rhsField;
            rhsField = that.getFeatureMetadata();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureMetadata", rhsField);
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
            boolean theFieldIsSet = this.isSetFeatureMetadata();
            FeatureMetadataPropertyType theField;
            theField = this.getFeatureMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFeatureMetadata();
            FeatureMetadataPropertyType theField;
            theField = this.getFeatureMetadata();
            strategy.appendField(locator, this, "featureMetadata", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
