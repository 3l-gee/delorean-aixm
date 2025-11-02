package com.aixm.delorean.core.gis.helper;

import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractRingPropertyType;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractSurfacePatchType;
import com.aixm.delorean.core.org.gml.v_3_2.ConeType;
import com.aixm.delorean.core.org.gml.v_3_2.CylinderType;
import com.aixm.delorean.core.org.gml.v_3_2.LinearRingType;
import com.aixm.delorean.core.org.gml.v_3_2.PolygonPatchType;
import com.aixm.delorean.core.org.gml.v_3_2.RectangleType;
import com.aixm.delorean.core.org.gml.v_3_2.RingType;
import com.aixm.delorean.core.org.gml.v_3_2.SphereType;
import com.aixm.delorean.core.org.gml.v_3_2.SurfacePatchArrayPropertyType;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;
import com.aixm.delorean.core.org.gml.v_3_2.TriangleType;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
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

        if (surface.getPatches().getValue().getAbstractSurfacePatch().size() != 1) {
            throw new IllegalArgumentException("<gml:SurfaceType> Content <gml:patches> must contain exactly one patch.");
        }

        if (surface.getSrsName() == null) {
            throw new IllegalArgumentException("<gml:SurfaceType> must specify an srsName.");
        }

        // B. SRS consistency
        String geometrySrsName = surface.getSrsName();

        // C. patches parsing
        PolygonPatchType polygonPatch = null;
        for (JAXBElement<? extends AbstractSurfacePatchType> patchElement : surface.getPatches().getValue().getAbstractSurfacePatch()) {
            if (patchElement.getValue().getClass() == PolygonPatchType.class) {
                polygonPatch = (PolygonPatchType) patchElement.getValue();
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

        // D. Exterior ring parsing
        RingType exteriorRing;
        Long exteriorRingIndex = 0L;
        if (polygonPatch.getExterior().getAbstractRing().getValue().getClass() == RingType.class) {
            exteriorRing = (RingType) polygonPatch.getExterior().getAbstractRing().getValue();
            Ring parsed = RingGmlHelper.parseRing(exteriorRing, geometrySrsName);
            parsed.setIndex(exteriorRingIndex);
            result.setExterior(parsed);

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
                result.getInterior().add(parsed);

            } else if (ringElement.getAbstractRing().getValue().getClass() == LinearRingType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3ED4 : LinearRingType is not supported");

            } else {
                throw new IllegalArgumentException("Unsupported type : " + ringElement.getAbstractRing().getValue().getClass().getName());
            }
            interiorRingIndex++;
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
            throw new IllegalArgumentException("Surface cannot be null.");
        }

        if (surface.getExterior() == null) {
            throw new IllegalArgumentException("Surface exterior ring cannot be null.");
        }

        // B. Collect all SRS names
        List<String> srsNames = surface.aggregateSrsNames();
        
        if (!srsNames.isEmpty()) {
            String firstSrsName = srsNames.get(0);
            for (String srsName : srsNames) {
                if (!srsName.equals(firstSrsName)) {
                    throw new IllegalArgumentException("All segments must have the same SRS name. Found differing SRS names.");
                }
            }
        }

        String epsgCode = SRSValidationHelper.printSrsName(srsNames.get(0));

        // C. Coordinates printing exterior

        // C.1 build Exterior Ring
        RingType exteriorRing = RingGmlHelper.printRing(surface.getExterior());
        AbstractRingPropertyType exteriorRingProperty = new AbstractRingPropertyType();
        exteriorRingProperty.setAbstractRing(new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Ring"), RingType.class, exteriorRing)); 

        // C.2 build Interior Rings
        List<AbstractRingPropertyType> interiorRingsProperties = new ArrayList<>();
        for (Ring interiorRing : surface.getInterior()) {
            RingType interiorRingGml = RingGmlHelper.printRing(interiorRing);
            AbstractRingPropertyType interiorRingProperty = new AbstractRingPropertyType();
            interiorRingProperty.setAbstractRing(new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Ring"), RingType.class, interiorRingGml)); 
            interiorRingsProperties.add(interiorRingProperty);
        }

        // C.3 build Polygon Patch
        PolygonPatchType polygonPatch = new PolygonPatchType();
        polygonPatch.setExterior(exteriorRingProperty);
        polygonPatch.getInterior().addAll(interiorRingsProperties);
        JAXBElement<PolygonPatchType> polygonPatchElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch"), PolygonPatchType.class, polygonPatch);

        // C.4 build SurfacePatchArrayPropertyType
        SurfacePatchArrayPropertyType surfacePatchArray = new SurfacePatchArrayPropertyType();
        surfacePatchArray.getAbstractSurfacePatch().add(polygonPatchElement);
        JAXBElement<SurfacePatchArrayPropertyType> surfacePatchArrayElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "patches"), SurfacePatchArrayPropertyType.class, surfacePatchArray);

        // C.5 build SurfaceType
        result.setPatches(surfacePatchArrayElement);

        // D. carry the AbstractGMLType attributes further
        result.setId(surface.getId());
        result.setDescription(surface.getDescription());
        result.setIdentifier(surface.getIdentifier());
        result.setSrsName(epsgCode);

        return result;

    }
}
