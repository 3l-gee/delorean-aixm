package com.aixm.delorean.core.gis.helper;

import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlCurveType;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.org.gml.v_3_2.CompositeCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.OrientableCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.RingType;
import com.aixm.delorean.core.util.HrefHelper;

public class RingGmlHelper {
    
    public static Ring parseRing (RingType ring, String parentSrsName) {
        Ring result = new Ring();

        // A. Sanity Check
        if (ring == null) {
            throw new IllegalArgumentException("<gml:RingType> cannot be null.");
        }

        if (parentSrsName == null) {
            throw new IllegalArgumentException("Parent srsName cannot be null.");
        }

        // B. SRS consistency
        String srsName = SRSValidationHelper.parseSrsName(parentSrsName);

        // C. curveMember parsing
        Long curveIndex = 0L;
        for (com.aixm.delorean.core.org.gml.v_3_2.CurvePropertyType curve : ring.getCurveMember()) {
            if (curve.getAbstractCurve() == null && curve.getHref() == null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set.");

            } else if (curve.getAbstractCurve() != null && curve.getHref() != null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set, but not both.");

            } else if (curve.getAbstractCurve() == null && curve.getHref() != null) {
                GmlCurveType resultCurve = new GmlCurveType();
                resultCurve.setGeometricType(GeometricType.REF);
                GeometricProperty geometricProperty = HrefHelper.parseHref(curve.getHref(), curve.getSimpleLinkTitle());
                resultCurve.setGeometricProperty(geometricProperty);
                geometricProperty.setSrsName(srsName);
                resultCurve.setIndex(curveIndex);
                result.getGmlCurve().add(resultCurve);

            } else if (curve.getAbstractCurve().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.CurveType.class) {
                com.aixm.delorean.core.org.gml.v_3_2.CurveType curveType = (com.aixm.delorean.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                GmlCurveType parsed = CurveGmlHelper.parseGMLCurve(curveType, GmlCurveType.class, parentSrsName);
                parsed.setIndex(curveIndex);
                parsed.setGeometricType(GeometricType.GML);
                result.getGmlCurve().add(parsed);

            } else if (curve.getAbstractCurve().getValue().getClass() == CompositeCurveType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support CompositeCurveType.");

            } else if (curve.getAbstractCurve().getValue().getClass() == OrientableCurveType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support OrientableCurveType.");

            } else if (curve.getAbstractCurve().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.CurveType.class) {
                ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <aixm:CurveType> in <gml:RingType>. <aixm:CurveType> will be converted to <gml:CurveType>.");
                com.aixm.delorean.core.org.gml.v_3_2.CurveType curveType = (com.aixm.delorean.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                GmlCurveType parsed = CurveGmlHelper.parseGMLCurve(curveType, GmlCurveType.class, parentSrsName);
                parsed.setIndex(curveIndex);
                parsed.setGeometricType(GeometricType.GML);
                result.getGmlCurve().add(parsed);

            } else if (curve.getAbstractCurve().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.ElevatedCurveType.class) {
                ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <aixm:ElevatedCurveType> in <gml:RingType>. <aixm:ElevatedCurveType> will be converted to <gml:CurveType>.");
                com.aixm.delorean.core.org.gml.v_3_2.CurveType curveType = (com.aixm.delorean.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                GmlCurveType parsed = CurveGmlHelper.parseGMLCurve(curveType, GmlCurveType.class, parentSrsName);
                parsed.setIndex(curveIndex);
                parsed.setGeometricType(GeometricType.GML);
                result.getGmlCurve().add(parsed);

            }else {
                throw new IllegalArgumentException("<gml:RingType> Unsupported type : " + curve.getAbstractCurve().getClass().getName());
            }
            curveIndex++;
        }

        return result;
    }

    public static RingType printRing (Ring ring) {
        RingType result = new RingType();

        // A. Sanity Check
        if (ring == null) {
            throw new IllegalArgumentException("Ring cannot be null.");
        }

        // C. Coordinates printing
        for (GmlCurveType curve : ring.getGmlCurve()) {
            result.getCurveMember().add(CurveGmlHelper.printCurvePropertyType(curve));
        }

        return result;
    }

}
