
package com.aixm.delorean.core.org.gco.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gmd.v2007.AbstractDQElementType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractDQResultType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractDSAggregateType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractEXGeographicExtentType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractMDContentInformationType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractMDIdentificationType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractMDSpatialRepresentationType;
import com.aixm.delorean.core.org.gmd.v2007.AbstractRSReferenceSystemType;
import com.aixm.delorean.core.org.gmd.v2007.CIAddressType;
import com.aixm.delorean.core.org.gmd.v2007.CICitationType;
import com.aixm.delorean.core.org.gmd.v2007.CIContactType;
import com.aixm.delorean.core.org.gmd.v2007.CIDateType;
import com.aixm.delorean.core.org.gmd.v2007.CIOnlineResourceType;
import com.aixm.delorean.core.org.gmd.v2007.CIResponsiblePartyType;
import com.aixm.delorean.core.org.gmd.v2007.CISeriesType;
import com.aixm.delorean.core.org.gmd.v2007.CITelephoneType;
import com.aixm.delorean.core.org.gmd.v2007.DQDataQualityType;
import com.aixm.delorean.core.org.gmd.v2007.DQScopeType;
import com.aixm.delorean.core.org.gmd.v2007.DSAssociationType;
import com.aixm.delorean.core.org.gmd.v2007.DSDataSetType;
import com.aixm.delorean.core.org.gmd.v2007.EXExtentType;
import com.aixm.delorean.core.org.gmd.v2007.EXTemporalExtentType;
import com.aixm.delorean.core.org.gmd.v2007.EXVerticalExtentType;
import com.aixm.delorean.core.org.gmd.v2007.LILineageType;
import com.aixm.delorean.core.org.gmd.v2007.LIProcessStepType;
import com.aixm.delorean.core.org.gmd.v2007.LISourceType;
import com.aixm.delorean.core.org.gmd.v2007.MDAggregateInformationType;
import com.aixm.delorean.core.org.gmd.v2007.MDApplicationSchemaInformationType;
import com.aixm.delorean.core.org.gmd.v2007.MDBrowseGraphicType;
import com.aixm.delorean.core.org.gmd.v2007.MDConstraintsType;
import com.aixm.delorean.core.org.gmd.v2007.MDDigitalTransferOptionsType;
import com.aixm.delorean.core.org.gmd.v2007.MDDimensionType;
import com.aixm.delorean.core.org.gmd.v2007.MDDistributionType;
import com.aixm.delorean.core.org.gmd.v2007.MDDistributorType;
import com.aixm.delorean.core.org.gmd.v2007.MDExtendedElementInformationType;
import com.aixm.delorean.core.org.gmd.v2007.MDFormatType;
import com.aixm.delorean.core.org.gmd.v2007.MDGeometricObjectsType;
import com.aixm.delorean.core.org.gmd.v2007.MDIdentifierType;
import com.aixm.delorean.core.org.gmd.v2007.MDKeywordsType;
import com.aixm.delorean.core.org.gmd.v2007.MDMaintenanceInformationType;
import com.aixm.delorean.core.org.gmd.v2007.MDMediumType;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataExtensionInformationType;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.aixm.delorean.core.org.gmd.v2007.MDPortrayalCatalogueReferenceType;
import com.aixm.delorean.core.org.gmd.v2007.MDRangeDimensionType;
import com.aixm.delorean.core.org.gmd.v2007.MDReferenceSystemType;
import com.aixm.delorean.core.org.gmd.v2007.MDRepresentativeFractionType;
import com.aixm.delorean.core.org.gmd.v2007.MDStandardOrderProcessType;
import com.aixm.delorean.core.org.gmd.v2007.MDUsageType;
import com.aixm.delorean.core.org.gmd.v2007.PTFreeTextType;
import com.aixm.delorean.core.org.gmd.v2007.PTLocaleType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for AbstractObject_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractObject_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *       <attGroup ref="{http://www.isotc211.org/2005/gco}ObjectIdentification"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    EXVerticalExtentType.class,
    EXExtentType.class,
    EXTemporalExtentType.class,
    AbstractEXGeographicExtentType.class,
    MDIdentifierType.class,
    MDReferenceSystemType.class,
    AbstractRSReferenceSystemType.class,
    CIResponsiblePartyType.class,
    CICitationType.class,
    CIAddressType.class,
    CIOnlineResourceType.class,
    CIContactType.class,
    CITelephoneType.class,
    CIDateType.class,
    CISeriesType.class,
    MDDimensionType.class,
    AbstractMDSpatialRepresentationType.class,
    MDGeometricObjectsType.class,
    MDExtendedElementInformationType.class,
    MDMetadataExtensionInformationType.class,
    AbstractMDContentInformationType.class,
    MDRangeDimensionType.class,
    MDApplicationSchemaInformationType.class,
    MDPortrayalCatalogueReferenceType.class,
    MDConstraintsType.class,
    MDMediumType.class,
    MDDigitalTransferOptionsType.class,
    MDStandardOrderProcessType.class,
    MDDistributorType.class,
    MDDistributionType.class,
    MDFormatType.class,
    MDMaintenanceInformationType.class,
    MDBrowseGraphicType.class,
    AbstractMDIdentificationType.class,
    MDRepresentativeFractionType.class,
    MDUsageType.class,
    MDKeywordsType.class,
    DSAssociationType.class,
    MDAggregateInformationType.class,
    LIProcessStepType.class,
    LISourceType.class,
    LILineageType.class,
    AbstractDQResultType.class,
    AbstractDQElementType.class,
    DQDataQualityType.class,
    DQScopeType.class,
    PTFreeTextType.class,
    PTLocaleType.class,
    MDMetadataType.class,
    DSDataSetType.class,
    AbstractDSAggregateType.class,
    TypeNameType.class,
    MemberNameType.class,
    MultiplicityType.class,
    MultiplicityRangeType.class
})
public abstract class AbstractObjectType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    public boolean isSetUuid() {
        return (this.uuid!= null);
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
        final AbstractObjectType that = ((AbstractObjectType) object);
        {
            boolean lhsFieldIsSet = this.isSetUuid();
            boolean rhsFieldIsSet = that.isSetUuid();
            String lhsField;
            lhsField = this.getUuid();
            String rhsField;
            rhsField = that.getUuid();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uuid", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uuid", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetId();
            boolean rhsFieldIsSet = that.isSetId();
            String lhsField;
            lhsField = this.getId();
            String rhsField;
            rhsField = that.getId();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "id", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "id", rhsField);
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
            boolean theFieldIsSet = this.isSetId();
            String theField;
            theField = this.getId();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "id", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUuid();
            String theField;
            theField = this.getUuid();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uuid", theField);
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
            boolean theFieldIsSet = this.isSetId();
            String theField;
            theField = this.getId();
            strategy.appendField(locator, this, "id", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUuid();
            String theField;
            theField = this.getUuid();
            strategy.appendField(locator, this, "uuid", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
