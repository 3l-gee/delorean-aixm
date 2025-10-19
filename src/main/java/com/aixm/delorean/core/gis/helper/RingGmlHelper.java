package com.aixm.delorean.core.gis.helper;

import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.org.gml.v_3_2.CompositeCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.OrientableCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.RingType;

public class RingGMLHelper {
    
    public static Ring parseRing (RingType ring, String parentSrsName) {
        Ring result = new Ring();

        // A. Sanity Check
        if (ring == null) {
            throw new IllegalArgumentException("<gml:RingType> cannot be null.");
        }

        if (parentSrsName == null) {
            throw new IllegalArgumentException("Parent srsName cannot be null.");
        }

        // B. curveMember parsing
        for (com.aixm.delorean.core.org.gml.v_3_2.CurvePropertyType curve : ring.getCurveMember()) {
            if (curve.getAbstractCurve() == null && curve.getHref() == null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set.");

            } else if (curve.getAbstractCurve() != null && curve.getHref() != null) {
                throw new IllegalArgumentException("<gml:CurvePropertyType> Either href or AbstractCurve must be set, but not both.");

            } else if (curve.getAbstractCurve() == null && curve.getHref() != null) {
                
        
            } else if (curve.getAbstractCurve().getValue() instanceof com.aixm.delorean.core.org.gml.v_3_2.CurveType) {
                com.aixm.delorean.core.org.gml.v_3_2.CurveType curveType = (com.aixm.delorean.core.org.gml.v_3_2.CurveType) curve.getAbstractCurve().getValue();
                Curve parsed = CurveGmlHelper.parseGMLCurve(curveType, Curve.class, parentSrsName);
                result.getCurves().add(parsed);

            } else if (curve.getAbstractCurve().getValue() instanceof CompositeCurveType) {
                throw new IllegalArgumentException("Delorean does not (yet) support CompositeCurveType.");

            } else if (curve.getAbstractCurve().getValue() instanceof OrientableCurveType) {
                throw new IllegalArgumentException("Delorean does not (yet) support OrientableCurveType.");

            } else {
                throw new IllegalArgumentException("<gml:RingType> Unsupported type : " + curve.getAbstractCurve().getClass().getName());
            }
        }

        return result;
    }

    public static RingType printRing (Ring ring) {

        return new RingType();
    }

}
