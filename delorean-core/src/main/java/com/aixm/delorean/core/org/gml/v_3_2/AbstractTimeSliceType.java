
package com.aixm.delorean.core.org.gml.v_3_2;

import com.aixm.delorean.core.time.adapter.TimePrimitivePropertyTypeAdapter;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}aixmValidTime"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}dataSource" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeSliceType", propOrder = {
    "validTime",
    "dataSource"
})
@XmlSeeAlso({
    MovingObjectStatusType.class
})
@MappedSuperclass
public abstract class AbstractTimeSliceType
    extends AbstractGMLType
{

    @XmlElement(name = "validTime", required = true, type = TimePrimitivePropertyType.class)
    @XmlJavaTypeAdapter(TimePrimitivePropertyTypeAdapter.class)
    protected DeloreanTimeSliceType validTime;
    /**
     * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data. The remote link attributes of the gml:dataSource element have been deprecated along with its current type.
     * 
     */
    protected StringOrRefType dataSource;

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
@jakarta.persistence.Embedded
@jakarta.persistence.AttributeOverrides({ @jakarta.persistence.AttributeOverride(name = "beginPosition", column = @jakarta.persistence.Column(name = "valid_time_begin")), @jakarta.persistence.AttributeOverride(name = "endPosition", column = @jakarta.persistence.Column(name = "valid_time_end")) })
    public DeloreanTimeSliceType getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTime(DeloreanTimeSliceType value) {
        this.validTime = value;
    }

    /**
     * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data. The remote link attributes of the gml:dataSource element have been deprecated along with its current type.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "DATA_SOURCE_VALUE", length = 255)),
        @AttributeOverride(name = "nilReason", column = @Column(name = "DATA_SOURCE_NIL_REASON", length = 255)),
        @AttributeOverride(name = "type", column = @Column(name = "DATA_SOURCE_TYPE", length = 255)),
        @AttributeOverride(name = "href", column = @Column(name = "DATA_SOURCE_HREF")),
        @AttributeOverride(name = "role", column = @Column(name = "DATA_SOURCE_ROLE")),
        @AttributeOverride(name = "arcrole", column = @Column(name = "DATA_SOURCE_ARCROLE")),
        @AttributeOverride(name = "simpleLinkTitle", column = @Column(name = "DATA_SOURCE_SIMPLE_LINK_TITLE", length = 255)),
        @AttributeOverride(name = "show", column = @Column(name = "DATA_SOURCE_SHOW", length = 255)),
        @AttributeOverride(name = "actuate", column = @Column(name = "DATA_SOURCE_ACTUATE", length = 255))
    })
    public StringOrRefType getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     * @see #getDataSource()
     */
    public void setDataSource(StringOrRefType value) {
        this.dataSource = value;
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
        final AbstractTimeSliceType that = ((AbstractTimeSliceType) object);
        {
            boolean lhsFieldIsSet = (this.dataSource!= null);
            boolean rhsFieldIsSet = (that.dataSource!= null);
            StringOrRefType lhsField;
            lhsField = this.getDataSource();
            StringOrRefType rhsField;
            rhsField = that.getDataSource();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataSource", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataSource", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.validTime!= null);
            boolean rhsFieldIsSet = (that.validTime!= null);
            DeloreanTimeSliceType lhsField;
            lhsField = this.getValidTime();
            DeloreanTimeSliceType rhsField;
            rhsField = that.getValidTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "validTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "validTime", rhsField);
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
            boolean theFieldIsSet = (this.validTime!= null);
            DeloreanTimeSliceType theField;
            theField = this.getValidTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "validTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataSource!= null);
            StringOrRefType theField;
            theField = this.getDataSource();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataSource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.validTime!= null);
            DeloreanTimeSliceType theField;
            theField = this.getValidTime();
            strategy.appendField(locator, this, "validTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataSource!= null);
            StringOrRefType theField;
            theField = this.getDataSource();
            strategy.appendField(locator, this, "dataSource", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
