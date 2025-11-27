
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;


/**
 * <p>Java class for AbstractGeneralConversionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGeneralConversionType">
 *   <complexContent>
 *     <restriction base="{http://www.opengis.net/gml/3.2}AbstractCoordinateOperationType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}metaDataProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}identifier"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}remarks" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordinateOperationAccuracy" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AbstractGeneralConversionType")
@XmlSeeAlso({
    ConversionType.class
})
public abstract class AbstractGeneralConversionType
    extends AbstractCoordinateOperationType
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
