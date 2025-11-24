
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.aixm511.metadata.adapter.MDMetadataTypeAdapter;
import com.aixm.delorean.core.org.gmd.v2007.MDMetadataType;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractMetadataPropertyType;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MessageMetadataPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MessageMetadataPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
 *       <sequence minOccurs="0">
 *         <element name="mdMetadata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageMetadataPropertyType", propOrder = {
    "mdMetadata"
})
@Entity(name = "MessageMetadataPropertyType")
@Table(name = "message_metadata", schema = "aixm")
@Inheritance(strategy = InheritanceType.JOINED)
public class MessageMetadataPropertyType
    extends AbstractMetadataPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(type = MDMetadataType.class, name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    @XmlJavaTypeAdapter(MDMetadataTypeAdapter.class)
    protected JsonNode mdMetadata;

    /**
     * Gets the value of the mdMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
@org.hibernate.annotations.JdbcTypeCode(org.hibernate.type.SqlTypes.JSON)
@jakarta.persistence.Column(name = "md_metadata", columnDefinition = "JSONB")
    public JsonNode getMdMetadata() {
        return mdMetadata;
    }

    /**
     * Sets the value of the mdMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdMetadata(JsonNode value) {
        this.mdMetadata = value;
    }

    @Transient
    public boolean isSetMdMetadata() {
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
        final MessageMetadataPropertyType that = ((MessageMetadataPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMdMetadata();
            boolean rhsFieldIsSet = that.isSetMdMetadata();
            JsonNode lhsField;
            lhsField = this.getMdMetadata();
            JsonNode rhsField;
            rhsField = that.getMdMetadata();
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
            boolean theFieldIsSet = this.isSetMdMetadata();
            JsonNode theField;
            theField = this.getMdMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mdMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMdMetadata();
            JsonNode theField;
            theField = this.getMdMetadata();
            strategy.appendField(locator, this, "mdMetadata", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
