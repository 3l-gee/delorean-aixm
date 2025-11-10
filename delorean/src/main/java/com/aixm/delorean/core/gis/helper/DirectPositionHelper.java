package com.aixm.delorean.core.gis.helper;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionType;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionListType;

public class DirectPositionHelper {

    public static String parseDirectPosition (DirectPositionType pos, Boolean inverse) {
        StringBuilder wkt = new StringBuilder("POINT(");
        wkt.append(PosToWkt(pos, inverse));
        wkt.append(")");
        return wkt.toString();
    }

    public static String parseDirectPosition (DirectPositionListType posList, Boolean inverse) {
        if (posList == null || posList.getValue() == null || posList.getValue().size() != 2) {
            throw new IllegalArgumentException("DirectPositionListType must contain exactly one coordinate pair (two values).");
        }
        StringBuilder wkt = new StringBuilder("POINT(");
        wkt.append(posListToWkt(posList, inverse));
        wkt.append(")");
        return wkt.toString();
    }

    public static String parseDirectPositionList (DirectPositionListType posList, Boolean inverse) {
        StringBuilder wkt = new StringBuilder("LINESTRING(");
        wkt.append(posListToWkt(posList, inverse));
        wkt.append(")");
        return wkt.toString();
    }

    public static DirectPositionType printDirectPosition(GmlPointType point) {
        if (point == null) {
            throw new IllegalArgumentException("<GmlPointType> cannot be null.");
        }

        if (point.getGeometricType() != GeometricType.POS) {
            throw new IllegalArgumentException("<GmlPointType> Content <geometricType> must be 'POS' to build a DirectPositionType.");
        }

        String wkt = point.getPos().getValue();
        return printDirectPosition(wkt);
    }


    public static DirectPositionType printDirectPosition(String wkt) {
        if (wkt == null || !wkt.startsWith("POINT(") || !wkt.endsWith(")")) {
            throw new IllegalArgumentException("Invalid WKT format for POINT.");
        }

        String coordPart = wkt.substring("POINT(".length(), wkt.length() - 1).trim();
        String[] coords = coordPart.split("\\s+");

        if (coords.length != 2) {
            throw new IllegalArgumentException("POINT WKT must contain exactly two coordinates.");
        }

        double x = Double.parseDouble(coords[0]);
        double y = Double.parseDouble(coords[1]);

        DirectPositionType pos = new DirectPositionType();
        // pos.setSrsName(srsName);
        List<Double> values = new ArrayList<>();
        values.add(x); // lon
        values.add(y); // lat
        pos.setValue(values);

        return pos;
    }

    public static DirectPositionListType printDirectPositionList(String wkt) {
        if (wkt == null || !wkt.startsWith("LINESTRING(") || !wkt.endsWith(")")) {
            throw new IllegalArgumentException("Invalid WKT format for LINESTRING.");
        }

        String coordPart = wkt.substring("LINESTRING(".length(), wkt.length() - 1).trim();
        String[] pairs = coordPart.split(",");

        List<Double> values = new ArrayList<>();

        for (String pair : pairs) {
            String[] coords = pair.trim().split("\\s+");
            if (coords.length != 2) {
                throw new IllegalArgumentException("Each coordinate pair must contain exactly two values.");
            }

            double x = Double.parseDouble(coords[0]);
            double y = Double.parseDouble(coords[1]);

            values.add(x); // lon
            values.add(y); // lat   
        }

        DirectPositionListType posList = new DirectPositionListType();
        posList.setValue(values);

        return posList;
    }

    public static String posListToWkt (DirectPositionListType posList, Boolean inverse) {
        List<Double> coordinates = posList.getValue();

        if (coordinates == null || coordinates.isEmpty()) {
            throw new IllegalArgumentException("<gml:posList> cannot be null or empty.");
        }

        if (coordinates.size() % 2 != 0) {
            throw new IllegalArgumentException("AIXM restricts GML posList to 2D coordinate pairs (even number of values).");
        }

        StringBuilder wktBuilder = new StringBuilder();

        for (int i = 0; i < coordinates.size(); i += 2) {
            double first = coordinates.get(i);
            double second = coordinates.get(i + 1);

            if (inverse) {
                // CRS84 (lon, lat)
                wktBuilder.append(second).append(" ").append(first);
            } else {
                // EPSG:4326 etc. (lat, lon)
                wktBuilder.append(first).append(" ").append(second);
            }

            if (i + 2 < coordinates.size()) {
                wktBuilder.append(", ");
            }
        }

        return wktBuilder.toString();
    }


    public static String PosToWkt (DirectPositionType pos, Boolean inverse) {
        List<Double> coordinates = pos.getValue();
        String wkt = "";

        if (coordinates == null || coordinates.isEmpty()) {
            throw new IllegalArgumentException("<gml:DirectPositionType> content <value> cannot be null or empty.");
        }

        if (coordinates.size() != 2) {
            throw new IllegalArgumentException("AIXM restrict <gml:DirectPositionType> to only 2 coordinates (lat, lon).");
        }

        List<Double> coords = new ArrayList<>(coordinates);

        if (inverse) {
            // CRS84 (lon, lat)
            wkt = coords.get(1) + " " + coords.get(0);
        } else {
            // EPSG:4326 etc. (lat, lon)
            wkt = coords.get(0) + " " + coords.get(1);
        };

        return wkt;
    }
    
}
