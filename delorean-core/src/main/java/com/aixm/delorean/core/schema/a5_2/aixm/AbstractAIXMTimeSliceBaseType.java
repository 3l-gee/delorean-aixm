
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractTimeSliceType;
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
 * Base type of AIXM Timeslices.  Removes option attributes that are not used in AIXM.
 * 
 * <p>Java class for AbstractAIXMTimeSliceBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMTimeSliceBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       <sequence>
 *         <sequence>
 *         </sequence>
 *         <sequence>
 *           <element ref="{http://www.opengis.net/gml/3.2}aixmValidTime"/>
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
@XmlType(name = "AbstractAIXMTimeSliceBaseType")
@XmlSeeAlso({
    AbstractAIXMTimeSliceType.class
})
@MappedSuperclass
public abstract class AbstractAIXMTimeSliceBaseType
    extends AbstractTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;

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
