
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * Information identifing the portrayal catalogue used
 * 
 * <p>Java class for MD_PortrayalCatalogueReference_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_PortrayalCatalogueReference_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="portrayalCatalogueCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_PortrayalCatalogueReference_Type", propOrder = {
    "portrayalCatalogueCitation"
})
public class MDPortrayalCatalogueReferenceType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<CICitationPropertyType> portrayalCatalogueCitation;

    /**
     * Gets the value of the portrayalCatalogueCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getPortrayalCatalogueCitation() {
        if (portrayalCatalogueCitation == null) {
            portrayalCatalogueCitation = new ArrayList<>();
        }
        return this.portrayalCatalogueCitation;
    }

    /**
     * 
     * 
     */
    public void setPortrayalCatalogueCitation(List<CICitationPropertyType> portrayalCatalogueCitation) {
        this.portrayalCatalogueCitation = portrayalCatalogueCitation;
    }

    public boolean isSetPortrayalCatalogueCitation() {
        return ((this.portrayalCatalogueCitation!= null)&&(!this.portrayalCatalogueCitation.isEmpty()));
    }

    public void unsetPortrayalCatalogueCitation() {
        this.portrayalCatalogueCitation = null;
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
        final MDPortrayalCatalogueReferenceType that = ((MDPortrayalCatalogueReferenceType) object);
        {
            boolean lhsFieldIsSet = this.isSetPortrayalCatalogueCitation();
            boolean rhsFieldIsSet = that.isSetPortrayalCatalogueCitation();
            List<CICitationPropertyType> lhsField;
            lhsField = (this.isSetPortrayalCatalogueCitation()?this.getPortrayalCatalogueCitation():null);
            List<CICitationPropertyType> rhsField;
            rhsField = (that.isSetPortrayalCatalogueCitation()?that.getPortrayalCatalogueCitation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "portrayalCatalogueCitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "portrayalCatalogueCitation", rhsField);
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
            boolean theFieldIsSet = this.isSetPortrayalCatalogueCitation();
            List<CICitationPropertyType> theField;
            theField = (this.isSetPortrayalCatalogueCitation()?this.getPortrayalCatalogueCitation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "portrayalCatalogueCitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPortrayalCatalogueCitation();
            List<CICitationPropertyType> theField;
            theField = (this.isSetPortrayalCatalogueCitation()?this.getPortrayalCatalogueCitation():null);
            strategy.appendField(locator, this, "portrayalCatalogueCitation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
