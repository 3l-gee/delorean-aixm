
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractAIXMMessageBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMMessageBaseType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeatureBaseType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}sequenceNumber" minOccurs="0"/>
 *         <element name="messageMetadata" type="{http://www.aixm.aero/schema/5.1.1}MessageMetadataPropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMMessageBaseType", propOrder = {
    "sequenceNumber",
    "messageMetadata"
})
@XmlSeeAlso({
    AbstractAIXMMessageType.class
})
@MappedSuperclass
public abstract class AbstractAIXMMessageBaseType
    extends AbstractAIXMFeatureBaseType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * Used for the identification of the Time Slice concerned. See the AIXM Temporality model for details.
     * 
     */
    protected Long sequenceNumber;
    protected MessageMetadataPropertyType messageMetadata;

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
     * Gets the value of the messageMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    @OneToOne(targetEntity = MessageMetadataPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "message_metadata_hjid", referencedColumnName = "hjid")
    public MessageMetadataPropertyType getMessageMetadata() {
        return messageMetadata;
    }

    /**
     * Sets the value of the messageMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    public void setMessageMetadata(MessageMetadataPropertyType value) {
        this.messageMetadata = value;
    }

    @Transient
    public boolean isSetMessageMetadata() {
        return (this.messageMetadata!= null);
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
        final AbstractAIXMMessageBaseType that = ((AbstractAIXMMessageBaseType) object);
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
        {
            boolean lhsFieldIsSet = this.isSetMessageMetadata();
            boolean rhsFieldIsSet = that.isSetMessageMetadata();
            MessageMetadataPropertyType lhsField;
            lhsField = this.getMessageMetadata();
            MessageMetadataPropertyType rhsField;
            rhsField = that.getMessageMetadata();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "messageMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "messageMetadata", rhsField);
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
            boolean theFieldIsSet = this.isSetSequenceNumber();
            Long theField;
            theField = this.getSequenceNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sequenceNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMessageMetadata();
            MessageMetadataPropertyType theField;
            theField = this.getMessageMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "messageMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSequenceNumber();
            Long theField;
            theField = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMessageMetadata();
            MessageMetadataPropertyType theField;
            theField = this.getMessageMetadata();
            strategy.appendField(locator, this, "messageMetadata", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
