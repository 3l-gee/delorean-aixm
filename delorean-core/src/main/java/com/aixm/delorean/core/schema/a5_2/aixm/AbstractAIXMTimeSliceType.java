
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.aixm.delorean.core.time.adapter.TimePrimitivePropertyTypeAdapter;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import jakarta.persistence.Basic;
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Adds in the AIXM specific properties, such as 'interpretation'.
 * 
 * <p>Java class for AbstractAIXMTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceBaseType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}interpretation"/>
 *         <element ref="{http://www.aixm.aero/schema/5.2}sequenceNumber" minOccurs="0"/>
 *         <element ref="{http://www.aixm.aero/schema/5.2}correctionNumber" minOccurs="0"/>
 *         <element name="timeSliceMetadata" type="{http://www.aixm.aero/schema/5.2}FeatureTimeSliceMetadataPropertyType" minOccurs="0"/>
 *         <element name="featureLifetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceType", propOrder = {
    "interpretation",
    "sequenceNumber",
    "correctionNumber",
    "timeSliceMetadata",
    "featureLifetime"
})
@XmlSeeAlso({
    DMETimeSliceType.class
})
@Entity(name = "AbstractAIXMTimeSliceType")
@Table(name = "abstract_aixm_timeslice", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractAIXMTimeSliceType
    extends AbstractAIXMTimeSliceBaseType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * Property indicating how the timeslice is to be interpreted.  See the AIXM Temporality model for details.
     * 
     */
    @XmlElement(required = true)
    protected String interpretation;
    /**
     * Used for the identification of the Time Slice concerned. See the AIXM Temporality model for details.
     * 
     */
    protected Long sequenceNumber;
    /**
     * Used for indicating the order of the corrections of a Time Slice. See the AIXM Temporality model for details.
     * 
     */
    protected Long correctionNumber;
    protected FeatureTimeSliceMetadataPropertyType timeSliceMetadata;
    @XmlElement(type = TimePrimitivePropertyType.class, name = "featureLifetime", required = true)
    @XmlJavaTypeAdapter(TimePrimitivePropertyTypeAdapter.class)
    protected DeloreanTimeSliceType featureLifetime;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Property indicating how the timeslice is to be interpreted.  See the AIXM Temporality model for details.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INTERPRETATION")
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInterpretation()
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    @Transient
    public boolean isSetInterpretation() {
        return (this.interpretation!= null);
    }

    /**
     * Used for the identification of the Time Slice concerned. See the AIXM Temporality model for details.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "SEQUENCE_NUMBER")
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getSequenceNumber()
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    @Transient
    public boolean isSetSequenceNumber() {
        return (this.sequenceNumber!= null);
    }

    /**
     * Used for indicating the order of the corrections of a Time Slice. See the AIXM Temporality model for details.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "CORRECTION_NUMBER")
    public Long getCorrectionNumber() {
        return correctionNumber;
    }

    /**
     * Sets the value of the correctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getCorrectionNumber()
     */
    public void setCorrectionNumber(Long value) {
        this.correctionNumber = value;
    }

    @Transient
    public boolean isSetCorrectionNumber() {
        return (this.correctionNumber!= null);
    }

    /**
     * Gets the value of the timeSliceMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    @ManyToOne(targetEntity = FeatureTimeSliceMetadataPropertyType.class, cascade = {
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.MERGE,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "TIME_SLICE_METADATA_ABSTRACT_0", nullable = true)
    public FeatureTimeSliceMetadataPropertyType getTimeSliceMetadata() {
        return timeSliceMetadata;
    }

    /**
     * Sets the value of the timeSliceMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public void setTimeSliceMetadata(FeatureTimeSliceMetadataPropertyType value) {
        this.timeSliceMetadata = value;
    }

    @Transient
    public boolean isSetTimeSliceMetadata() {
        return (this.timeSliceMetadata!= null);
    }

    /**
     * Gets the value of the featureLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
@jakarta.persistence.Embedded
@jakarta.persistence.AttributeOverrides({ @jakarta.persistence.AttributeOverride(name = "beginPosition", column = @jakarta.persistence.Column(name = "feature_lifetime_begin")), @jakarta.persistence.AttributeOverride(name = "endPosition", column = @jakarta.persistence.Column(name = "feature_lifetime_end")) })
    public DeloreanTimeSliceType getFeatureLifetime() {
        return featureLifetime;
    }

    /**
     * Sets the value of the featureLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureLifetime(DeloreanTimeSliceType value) {
        this.featureLifetime = value;
    }

    @Transient
    public boolean isSetFeatureLifetime() {
        return (this.featureLifetime!= null);
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
        final AbstractAIXMTimeSliceType that = ((AbstractAIXMTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetCorrectionNumber();
            boolean rhsFieldIsSet = that.isSetCorrectionNumber();
            Long lhsField;
            lhsField = this.getCorrectionNumber();
            Long rhsField;
            rhsField = that.getCorrectionNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "correctionNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "correctionNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInterpretation();
            boolean rhsFieldIsSet = that.isSetInterpretation();
            String lhsField;
            lhsField = this.getInterpretation();
            String rhsField;
            rhsField = that.getInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeSliceMetadata();
            boolean rhsFieldIsSet = that.isSetTimeSliceMetadata();
            FeatureTimeSliceMetadataPropertyType lhsField;
            lhsField = this.getTimeSliceMetadata();
            FeatureTimeSliceMetadataPropertyType rhsField;
            rhsField = that.getTimeSliceMetadata();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeSliceMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeSliceMetadata", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFeatureLifetime();
            boolean rhsFieldIsSet = that.isSetFeatureLifetime();
            DeloreanTimeSliceType lhsField;
            lhsField = this.getFeatureLifetime();
            DeloreanTimeSliceType rhsField;
            rhsField = that.getFeatureLifetime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureLifetime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureLifetime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSequenceNumber();
            boolean rhsFieldIsSet = that.isSetSequenceNumber();
            Long lhsField;
            lhsField = this.getSequenceNumber();
            Long rhsField;
            rhsField = that.getSequenceNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sequenceNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sequenceNumber", rhsField);
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
            boolean theFieldIsSet = this.isSetInterpretation();
            String theField;
            theField = this.getInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSequenceNumber();
            Long theField;
            theField = this.getSequenceNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sequenceNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCorrectionNumber();
            Long theField;
            theField = this.getCorrectionNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "correctionNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTimeSliceMetadata();
            FeatureTimeSliceMetadataPropertyType theField;
            theField = this.getTimeSliceMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeSliceMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureLifetime();
            DeloreanTimeSliceType theField;
            theField = this.getFeatureLifetime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureLifetime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetInterpretation();
            String theField;
            theField = this.getInterpretation();
            strategy.appendField(locator, this, "interpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSequenceNumber();
            Long theField;
            theField = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCorrectionNumber();
            Long theField;
            theField = this.getCorrectionNumber();
            strategy.appendField(locator, this, "correctionNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTimeSliceMetadata();
            FeatureTimeSliceMetadataPropertyType theField;
            theField = this.getTimeSliceMetadata();
            strategy.appendField(locator, this, "timeSliceMetadata", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureLifetime();
            DeloreanTimeSliceType theField;
            theField = this.getFeatureLifetime();
            strategy.appendField(locator, this, "featureLifetime", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
