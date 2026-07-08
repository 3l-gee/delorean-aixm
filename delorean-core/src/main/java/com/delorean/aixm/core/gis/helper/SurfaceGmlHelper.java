package com.delorean.aixm.core.gis.helper;

import com.delorean.aixm.core.gis.type.Ring;
import com.delorean.aixm.core.gis.type.Surface;
import com.delorean.aixm.core.gis.type.gml.GmlCurveType;
import com.delorean.aixm.core.gis.type.Polygon;
import com.delorean.aixm.core.org.gml.v_3_2.AbstractRingPropertyType;
import com.delorean.aixm.core.org.gml.v_3_2.AbstractSurfacePatchType;
import com.delorean.aixm.core.org.gml.v_3_2.ConeType;
import com.delorean.aixm.core.org.gml.v_3_2.CylinderType;
import com.delorean.aixm.core.org.gml.v_3_2.LinearRingType;
import com.delorean.aixm.core.org.gml.v_3_2.PolygonPatchType;
import com.delorean.aixm.core.org.gml.v_3_2.RectangleType;
import com.delorean.aixm.core.org.gml.v_3_2.RingType;
import com.delorean.aixm.core.org.gml.v_3_2.SphereType;
import com.delorean.aixm.core.org.gml.v_3_2.SurfacePatchArrayPropertyType;
import com.delorean.aixm.core.org.gml.v_3_2.SurfaceType;
import com.delorean.aixm.core.org.gml.v_3_2.TriangleType;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SurfaceGmlHelper {

    public static <T extends Surface> T parseGMLSurface(SurfaceType surface, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // A. Sanity Check
        if (surface == null) {
            throw new IllegalArgumentException("<gml:SurfaceType> cannot be null.");
        }

        if (surface.getPatches() == null || surface.getPatches().getValue() == null) {
            throw new IllegalArgumentException("<gml:SurfaceType> Content <gml:patches> can not be null.");
        }

        if (surface.getSrsName() == null) {
            throw new IllegalArgumentException("<gml:SurfaceType> must specify an srsName.");
        }

        // B. SRS consistency
        String geometrySrsName = surface.getSrsName();

        // C. patches parsing
        List<PolygonPatchType> polygonPatchList = new ArrayList<>();
        for (JAXBElement<? extends AbstractSurfacePatchType> patchElement : surface.getPatches().getValue().getAbstractSurfacePatch()) {
            if (patchElement.getValue().getClass() == PolygonPatchType.class) {
                polygonPatchList.add((PolygonPatchType) patchElement.getValue());
            } else if (patchElement.getValue().getClass() == RectangleType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED7 : RectangleType is not supported");

            } else if (patchElement.getValue().getClass() == TriangleType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED8 : TriangleType is not supported");

            } else if (patchElement.getValue().getClass() == ConeType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED9 : ConeType is not supported");

            } else if (patchElement.getValue().getClass() == CylinderType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EDA : CylinderType is not supported");

            } else if (patchElement.getValue().getClass() == SphereType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EDB : SphereType is not supported");

            } else {
                throw new IllegalArgumentException("<gml:SurfacePatchType> Unsupported type : " + patchElement.getValue().getClass().getSimpleName());
            }
        }

        Long polygonPatchIndex = 0L;
        for (PolygonPatchType polygonPatch : polygonPatchList) {
            Polygon polygon = new Polygon();
            // D. Exterior ring parsing
            RingType exteriorRing;
            if (polygonPatch.getExterior().getAbstractRing().getValue().getClass() == RingType.class) {
                exteriorRing = (RingType) polygonPatch.getExterior().getAbstractRing().getValue();
                Ring parsed = RingGmlHelper.parseRing(exteriorRing, geometrySrsName);
                polygon.setExterior(parsed);

            } else if (polygonPatch.getExterior().getAbstractRing().getValue().getClass() == LinearRingType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED6 : LinearRingType is not supported");

            } else {
                throw new IllegalArgumentException("Unsupported type : " + polygonPatch.getExterior().getAbstractRing().getValue().getClass().getName());
            }

            // E. Interior rings parsing
            RingType interiorRing;
            Long interiorRingIndex = 0L;
            for (AbstractRingPropertyType ringElement : polygonPatch.getInterior()) {
                if (ringElement.getAbstractRing().getValue().getClass() == RingType.class) {
                    interiorRing = (RingType) ringElement.getAbstractRing().getValue();
                    Ring parsed = RingGmlHelper.parseRing(interiorRing, geometrySrsName);
                    parsed.setIndex(interiorRingIndex);
                    polygon.getInterior().add(parsed);

                } else if (ringElement.getAbstractRing().getValue().getClass() == LinearRingType.class) {
                    throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED4 : LinearRingType is not supported");

                } else {
                    throw new IllegalArgumentException("Unsupported type : " + ringElement.getAbstractRing().getValue().getClass().getName());
                }
                interiorRingIndex++;
            }
            polygon.setIndex(polygonPatchIndex);
            result.getPolygon().add(polygon);
            polygonPatchIndex++;
        }

        // F. carry the AbstractGMLType attributes futrher
        result.setId(surface.getId());
        result.setDescription(surface.getDescription());
        result.setIdentifier(surface.getIdentifier());

        return result;
    }

    public static <T extends SurfaceType> T printGMLSurface(Surface surface, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // A. Sanity Check
        if (surface == null) {
            throw new IllegalArgumentException("<gml:SurfaceType> cannot be null.");
        }

        if (surface.getPolygon() == null || surface.getPolygon().isEmpty()) {
            throw new IllegalArgumentException("<gml:SurfaceType> Content <gml:patches> can not be null or empty.");
        }

        // B. Collect all SRS names
        List<String> epsgCode = surface.aggregateEpsgCode();
        
        if (!epsgCode.isEmpty()) {
            String firstSrsName = epsgCode.get(0);
            for (String srsName : epsgCode) {
                if (!srsName.equals(firstSrsName)) {
                    throw new IllegalArgumentException("<T extends SurfaceType> geometry has inconsistent EPSG codes defined.");
                }
            }
        } else {
            throw new IllegalArgumentException("<T extends SurfaceType> geometry must have at least one EPSG code defined.");
        }

        String srsName = SRSValidationHelper.printSrsName(epsgCode.get(0));

        // sort polygones by index
        surface.getPolygon().sort(Comparator.comparing(Polygon::getIndex));

        SurfacePatchArrayPropertyType surfacePatchArray = new SurfacePatchArrayPropertyType();
        for (Polygon polygon : surface.getPolygon()) {
            // C. Coordinates printing exterior

            // C.1 build Exterior Ring
            RingType exteriorRing = RingGmlHelper.printRing(polygon.getExterior());
            AbstractRingPropertyType exteriorRingProperty = new AbstractRingPropertyType();
            exteriorRingProperty.setAbstractRing(new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Ring"), RingType.class, exteriorRing)); 

            // C.2 build Interior Rings
            List<AbstractRingPropertyType> interiorRingsProperties = new ArrayList<>();
            for (Ring interiorRing : polygon.getInterior()) {
                RingType interiorRingGml = RingGmlHelper.printRing(interiorRing);
                AbstractRingPropertyType interiorRingProperty = new AbstractRingPropertyType();
                interiorRingProperty.setAbstractRing(new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Ring"), RingType.class, interiorRingGml)); 
                interiorRingsProperties.add(interiorRingProperty);
            }

            // C.3 build Polygon Patch
            PolygonPatchType polygonPatch = new PolygonPatchType();
            polygonPatch.setExterior(exteriorRingProperty);
            polygonPatch.getInterior().addAll(interiorRingsProperties);
            JAXBElement<PolygonPatchType> polygonPatchElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "PolygonPatch"), PolygonPatchType.class, polygonPatch);

            // C.4 build PolygonPatchType
            surfacePatchArray.getAbstractSurfacePatch().add(polygonPatchElement);
        }

        // C.5 build SurfaceType
        JAXBElement<SurfacePatchArrayPropertyType> surfacePatchArrayElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "patches"), SurfacePatchArrayPropertyType.class, surfacePatchArray);
        result.setPatches(surfacePatchArrayElement);

        // D. carry the AbstractGMLType attributes further
        result.setId(surface.getId());
        result.setDescription(surface.getDescription());
        result.setIdentifier(surface.getIdentifier());
        result.setSrsName(srsName);

        return result;

    }
}
