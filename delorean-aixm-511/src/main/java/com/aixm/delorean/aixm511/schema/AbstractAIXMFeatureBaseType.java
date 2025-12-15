
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.core.org.gml.v_3_2.DynamicFeatureType;
import jakarta.persistence.MappedSuperclass;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;


/**
 * This derives from gml:DynamicFeatureType, as all AIXM features are expected to have temporal properties modeled using the Timeslice model. While the GML specification does not mandate that dynamic features derive from gml:DynamicFeatureType, many GML-aware applications may only detect a dynamic feature by this type hierarchy. Note that all temporal properties of gml:DynamicFeatureType are removed during this restriction, because they will be added for each AIXM feature specifically, based on the TimeSlice model
 * 
 * <p>Java class for AbstractAIXMFeatureBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMFeatureBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       <sequence>
 *         <sequence>
 *           <sequence>
 *             <element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}identifier" minOccurs="0"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/>
 *           </sequence>
 *         </sequence>
 *         <sequence>
 *           <element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *       <attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureBaseType")
@XmlSeeAlso({
    AbstractAIXMFeatureType.class,
    AbstractAIXMMessageBaseType.class
})
@MappedSuperclass
public abstract class AbstractAIXMFeatureBaseType
    extends DynamicFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;

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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

}
