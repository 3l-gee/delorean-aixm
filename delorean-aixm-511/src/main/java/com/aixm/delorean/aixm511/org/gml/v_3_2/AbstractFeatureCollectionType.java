
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for AbstractFeatureCollectionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractFeatureCollectionType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}featureMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}featureMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureCollectionType", propOrder = {
    "featureMember",
    "featureMembers"
})
@XmlSeeAlso({
    FeatureCollectionType.class
})
public abstract class AbstractFeatureCollectionType
    extends AbstractFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected List<FeaturePropertyType> featureMember;
    protected FeatureArrayPropertyType featureMembers;

    /**
     * Gets the value of the featureMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getFeatureMember() {
        if (featureMember == null) {
            featureMember = new ArrayList<>();
        }
        return this.featureMember;
    }

    /**
     * 
     * 
     */
    public void setFeatureMember(List<FeaturePropertyType> featureMember) {
        this.featureMember = featureMember;
    }

    public boolean isSetFeatureMember() {
        return ((this.featureMember!= null)&&(!this.featureMember.isEmpty()));
    }

    public void unsetFeatureMember() {
        this.featureMember = null;
    }

    /**
     * Gets the value of the featureMembers property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureArrayPropertyType }
     *     
     */
    public FeatureArrayPropertyType getFeatureMembers() {
        return featureMembers;
    }

    /**
     * Sets the value of the featureMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureArrayPropertyType }
     *     
     */
    public void setFeatureMembers(FeatureArrayPropertyType value) {
        this.featureMembers = value;
    }

    public boolean isSetFeatureMembers() {
        return (this.featureMembers!= null);
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
        final AbstractFeatureCollectionType that = ((AbstractFeatureCollectionType) object);
        {
            boolean lhsFieldIsSet = this.isSetFeatureMember();
            boolean rhsFieldIsSet = that.isSetFeatureMember();
            List<FeaturePropertyType> lhsField;
            lhsField = (this.isSetFeatureMember()?this.getFeatureMember():null);
            List<FeaturePropertyType> rhsField;
            rhsField = (that.isSetFeatureMember()?that.getFeatureMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureMember", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFeatureMembers();
            boolean rhsFieldIsSet = that.isSetFeatureMembers();
            FeatureArrayPropertyType lhsField;
            lhsField = this.getFeatureMembers();
            FeatureArrayPropertyType rhsField;
            rhsField = that.getFeatureMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureMembers", rhsField);
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
            boolean theFieldIsSet = this.isSetFeatureMember();
            List<FeaturePropertyType> theField;
            theField = (this.isSetFeatureMember()?this.getFeatureMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureMembers();
            FeatureArrayPropertyType theField;
            theField = this.getFeatureMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFeatureMember();
            List<FeaturePropertyType> theField;
            theField = (this.isSetFeatureMember()?this.getFeatureMember():null);
            strategy.appendField(locator, this, "featureMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureMembers();
            FeatureArrayPropertyType theField;
            theField = this.getFeatureMembers();
            strategy.appendField(locator, this, "featureMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
