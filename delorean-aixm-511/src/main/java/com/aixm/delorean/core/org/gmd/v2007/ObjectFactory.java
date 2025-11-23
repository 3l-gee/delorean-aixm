
package com.aixm.delorean.core.org.gmd.v2007;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aixm.delorean.core.org.gmd.v2007 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _MDMetadata_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Metadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aixm.delorean.core.org.gmd.v2007
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MDMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Metadata")
    public JAXBElement<MDMetadataType> createMDMetadata(MDMetadataType value) {
        return new JAXBElement<>(_MDMetadata_QNAME, MDMetadataType.class, null, value);
    }

}
