
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import com.aixm.delorean.core.schema.a5_2.aixm.AbstractAIXMFeatureBaseType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DynamicFeatureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DynamicFeatureType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       <group ref="{http://www.opengis.net/gml/3.2}dynamicProperties"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureType", propOrder = {
    "validTime",
    "history",
    "dataSource",
    "dataSourceReference"
})
@XmlSeeAlso({
    DynamicFeatureCollectionType.class,
    AbstractAIXMFeatureBaseType.class
})
@MappedSuperclass
public class DynamicFeatureType
    extends AbstractFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected TimePrimitivePropertyType validTime;
    @XmlElementRef(name = "history", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<HistoryPropertyType> history;
    protected StringOrRefType dataSource;
    protected ReferenceType dataSourceReference;

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    @Transient
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    @Transient
    public boolean isSetValidTime() {
        return (this.validTime!= null);
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<HistoryPropertyType> getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    public void setHistory(JAXBElement<HistoryPropertyType> value) {
        this.history = value;
    }

    @Transient
    public boolean isSetHistory() {
        return (this.history!= null);
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    @Transient
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
     */
    public void setDataSource(StringOrRefType value) {
        this.dataSource = value;
    }

    @Transient
    public boolean isSetDataSource() {
        return (this.dataSource!= null);
    }

    /**
     * Gets the value of the dataSourceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    @Transient
    public ReferenceType getDataSourceReference() {
        return dataSourceReference;
    }

    /**
     * Sets the value of the dataSourceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDataSourceReference(ReferenceType value) {
        this.dataSourceReference = value;
    }

    @Transient
    public boolean isSetDataSourceReference() {
        return (this.dataSourceReference!= null);
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
        final DynamicFeatureType that = ((DynamicFeatureType) object);
        {
            boolean lhsFieldIsSet = this.isSetDataSource();
            boolean rhsFieldIsSet = that.isSetDataSource();
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
            boolean lhsFieldIsSet = this.isSetDataSourceReference();
            boolean rhsFieldIsSet = that.isSetDataSourceReference();
            ReferenceType lhsField;
            lhsField = this.getDataSourceReference();
            ReferenceType rhsField;
            rhsField = that.getDataSourceReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataSourceReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataSourceReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValidTime();
            boolean rhsFieldIsSet = that.isSetValidTime();
            TimePrimitivePropertyType lhsField;
            lhsField = this.getValidTime();
            TimePrimitivePropertyType rhsField;
            rhsField = that.getValidTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "validTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "validTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHistory();
            boolean rhsFieldIsSet = that.isSetHistory();
            JAXBElement<HistoryPropertyType> lhsField;
            lhsField = this.getHistory();
            JAXBElement<HistoryPropertyType> rhsField;
            rhsField = that.getHistory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "history", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "history", rhsField);
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
            boolean theFieldIsSet = this.isSetValidTime();
            TimePrimitivePropertyType theField;
            theField = this.getValidTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "validTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHistory();
            JAXBElement<HistoryPropertyType> theField;
            theField = this.getHistory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "history", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataSource();
            StringOrRefType theField;
            theField = this.getDataSource();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataSource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataSourceReference();
            ReferenceType theField;
            theField = this.getDataSourceReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataSourceReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetValidTime();
            TimePrimitivePropertyType theField;
            theField = this.getValidTime();
            strategy.appendField(locator, this, "validTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHistory();
            JAXBElement<HistoryPropertyType> theField;
            theField = this.getHistory();
            strategy.appendField(locator, this, "history", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataSource();
            StringOrRefType theField;
            theField = this.getDataSource();
            strategy.appendField(locator, this, "dataSource", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataSourceReference();
            ReferenceType theField;
            theField = this.getDataSourceReference();
            strategy.appendField(locator, this, "dataSourceReference", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
