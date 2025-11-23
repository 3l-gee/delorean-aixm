
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
 * <p>Java class for SurfaceContaminationLayerPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceContaminationLayerPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SurfaceContaminationLayer"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceContaminationLayerPropertyType", propOrder = {
    "surfaceContaminationLayer"
})
@Entity(name = "SurfaceContaminationLayerPropertyType")
@Table(name = "surfacecontaminationlayer_pt", schema = "airport_heliport")
public class SurfaceContaminationLayerPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SurfaceContaminationLayer", required = true)
    protected SurfaceContaminationLayerType surfaceContaminationLayer;

    /**
     * Gets the value of the surfaceContaminationLayer property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceContaminationLayerType }
     *     
     */
    @OneToOne(targetEntity = SurfaceContaminationLayerType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfacecontaminationlayer_id", referencedColumnName = "hjid")
    public SurfaceContaminationLayerType getSurfaceContaminationLayer() {
        return surfaceContaminationLayer;
    }

    /**
     * Sets the value of the surfaceContaminationLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceContaminationLayerType }
     *     
     */
    public void setSurfaceContaminationLayer(SurfaceContaminationLayerType value) {
        this.surfaceContaminationLayer = value;
    }

    @Transient
    public boolean isSetSurfaceContaminationLayer() {
        return (this.surfaceContaminationLayer!= null);
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
        final SurfaceContaminationLayerPropertyType that = ((SurfaceContaminationLayerPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSurfaceContaminationLayer();
            boolean rhsFieldIsSet = that.isSetSurfaceContaminationLayer();
            SurfaceContaminationLayerType lhsField;
            lhsField = this.getSurfaceContaminationLayer();
            SurfaceContaminationLayerType rhsField;
            rhsField = that.getSurfaceContaminationLayer();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceContaminationLayer", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceContaminationLayer", rhsField);
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
            boolean theFieldIsSet = this.isSetSurfaceContaminationLayer();
            SurfaceContaminationLayerType theField;
            theField = this.getSurfaceContaminationLayer();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceContaminationLayer", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSurfaceContaminationLayer();
            SurfaceContaminationLayerType theField;
            theField = this.getSurfaceContaminationLayer();
            strategy.appendField(locator, this, "surfaceContaminationLayer", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
