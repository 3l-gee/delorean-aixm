package com.delorean.aixm.core.gis.helper;

import java.util.Comparator;

import com.delorean.aixm.core.gis.type.Ring;
import com.delorean.aixm.core.gis.type.components.GeometricProperty;
import com.delorean.aixm.core.gis.type.components.GeometricType;
import com.delorean.aixm.core.gis.type.gml.GmlCurveType;
import com.delorean.aixm.core.inspection.InspectionBindingService;
import com.delorean.aixm.core.inspection.ValidationSeverity;
import com.delorean.aixm.core.inspection.InspectionSource;
import com.delorean.aixm.core.org.gml.v_3_2.CompositeCurveType;
import com.delorean.aixm.core.org.gml.v_3_2.OrientableCurveType;
import com.delorean.aixm.core.org.gml.v_3_2.RingType;
import com.delorean.aixm.core.unit.HrefHelper;

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
        String epsgCode = SRSValidationHelper.parseSrsName(parentSrsName);

        // C. curveMember parsing
        Long curveIndex = 0L;
        for (com.delorean.aixm.core.org.gml.v_3_2.CurvePropertyType curve : ring.getCurveMember()) {
            if (curve.getAbstractCurve() == null && curve.getHref() == null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set.");

            } else if (curve.getAbstractCurve() != null && curve.getHref() != null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set, but not both.");

            } else if (curve.getAbstractCurve() == null && curve.getHref() != null) {
                GmlCurveType resultCurve = new GmlCurveType();
                resultCurve.setGeometricType(GeometricType.REF);
                GeometricProperty geometricProperty = HrefHelper.parseHref(curve.getHref(), curve.getSimpleLinkTitle());
                resultCurve.setGeometricProperty(geometricProperty);
                geometricProperty.setSrsName(epsgCode);
                resultCurve.setIndex(curveIndex);
                result.getGmlCurve().add(resultCurve);

            } else if (curve.getAbstractCurve().getValue().getClass() == com.delorean.aixm.core.org.gml.v_3_2.CurveType.class) {
                com.delorean.aixm.core.org.gml.v_3_2.CurveType curveType = (com.delorean.aixm.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                GmlCurveType parsed = CurveGmlHelper.parseGMLCurve(curveType, GmlCurveType.class, parentSrsName);
                parsed.setIndex(curveIndex);
                parsed.setGeometricType(GeometricType.GML);
                result.getGmlCurve().add(parsed);

            } else if (curve.getAbstractCurve().getValue().getClass() == CompositeCurveType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support CompositeCurveType.");

            } else if (curve.getAbstractCurve().getValue().getClass() == OrientableCurveType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support OrientableCurveType.");

            } else if ( com.delorean.aixm.core.org.gml.v_3_2.CurveType.class.isAssignableFrom(curve.getAbstractCurve().getValue().getClass())) {
                com.delorean.aixm.core.org.gml.v_3_2.CurveType curveType = (com.delorean.aixm.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                InspectionBindingService.recordEvent(InspectionSource.GEOMETRY, ValidationSeverity.WARNING, "Geometry parsing", "Delorean does not support <" + curve.getAbstractCurve().getValue().getClass().getName() + "> in <gml:RingType>. It will be converted to <gml:CurveType>.", curveType.getId());
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

        // sort curves by index
        ring.getGmlCurve().sort(Comparator.comparing(GmlCurveType::getIndex));

        // C. Coordinates printing
        for (GmlCurveType curve : ring.getGmlCurve()) {
            result.getCurveMember().add(CurveGmlHelper.printCurvePropertyType(curve));
        }

        return result;
    }

}
