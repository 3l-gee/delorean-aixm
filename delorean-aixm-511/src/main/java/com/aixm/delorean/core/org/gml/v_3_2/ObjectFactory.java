
package com.aixm.delorean.core.org.gml.v_3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aixm.delorean.core.org.gml.v_3_2 package. 
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

    private static final QName _AbstractFeature_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractFeature");
    private static final QName _AbstractGML_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGML");
    private static final QName _AbstractObject_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractObject");
    private static final QName _AbstractTimeSlice_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice");
    private static final QName _Curve_QNAME = new QName("http://www.opengis.net/gml/3.2", "Curve");
    private static final QName _AbstractCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCurve");
    private static final QName _AbstractGeometricPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive");
    private static final QName _AbstractGeometry_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private static final QName _Point_QNAME = new QName("http://www.opengis.net/gml/3.2", "Point");
    private static final QName _Surface_QNAME = new QName("http://www.opengis.net/gml/3.2", "Surface");
    private static final QName _AbstractSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSurface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aixm.delorean.core.org.gml.v_3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractFeatureType> createAbstractFeature(AbstractFeatureType value) {
        return new JAXBElement<>(_AbstractFeature_QNAME, AbstractFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGML", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractGMLType> createAbstractGML(AbstractGMLType value) {
        return new JAXBElement<>(_AbstractGML_QNAME, AbstractGMLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractObject")
    public JAXBElement<Object> createAbstractObject(Object value) {
        return new JAXBElement<>(_AbstractObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractTimeSliceType> createAbstractTimeSlice(AbstractTimeSliceType value) {
        return new JAXBElement<>(_AbstractTimeSlice_QNAME, AbstractTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CurveType> createCurve(CurveType value) {
        return new JAXBElement<>(_Curve_QNAME, CurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractCurveType> createAbstractCurve(AbstractCurveType value) {
        return new JAXBElement<>(_AbstractCurve_QNAME, AbstractCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometricPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometricPrimitiveType> createAbstractGeometricPrimitive(AbstractGeometricPrimitiveType value) {
        return new JAXBElement<>(_AbstractGeometricPrimitive_QNAME, AbstractGeometricPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractGeometryType> createAbstractGeometry(AbstractGeometryType value) {
        return new JAXBElement<>(_AbstractGeometry_QNAME, AbstractGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<SurfaceType> createSurface(SurfaceType value) {
        return new JAXBElement<>(_Surface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractSurfaceType> createAbstractSurface(AbstractSurfaceType value) {
        return new JAXBElement<>(_AbstractSurface_QNAME, AbstractSurfaceType.class, null, value);
    }

}
