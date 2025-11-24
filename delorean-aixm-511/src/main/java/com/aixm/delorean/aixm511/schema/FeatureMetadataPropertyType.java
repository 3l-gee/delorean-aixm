
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractMetadataPropertyType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
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
 * <p>Java class for FeatureMetadataPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FeatureMetadataPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.isotc211.org/2005/gmd}MD_Metadata"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureMetadataPropertyType", propOrder = {
    "mdMetadata"
})
@Entity(name = "FeatureMetadataPropertyType")
@Table(name = "feature_metadata", schema = "aixm")
@Inheritance(strategy = InheritanceType.JOINED)
public class FeatureMetadataPropertyType
    extends AbstractMetadataPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    protected MDMetadataType mdMetadata;

    /**
     * Gets the value of the mdMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataType }
     *     
     */
    @ManyToOne(targetEntity = MDMetadataType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    public MDMetadataType getMDMetadata() {
        return mdMetadata;
    }

    /**
     * Sets the value of the mdMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataType }
     *     
     */
    public void setMDMetadata(MDMetadataType value) {
        this.mdMetadata = value;
    }

    @Transient
    public boolean isSetMDMetadata() {
        return (this.mdMetadata!= null);
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
        final FeatureMetadataPropertyType that = ((FeatureMetadataPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMDMetadata();
            boolean rhsFieldIsSet = that.isSetMDMetadata();
            MDMetadataType lhsField;
            lhsField = this.getMDMetadata();
            MDMetadataType rhsField;
            rhsField = that.getMDMetadata();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mdMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mdMetadata", rhsField);
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
            boolean theFieldIsSet = this.isSetMDMetadata();
            MDMetadataType theField;
            theField = this.getMDMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mdMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMDMetadata();
            MDMetadataType theField;
            theField = this.getMDMetadata();
            strategy.appendField(locator, this, "mdMetadata", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
