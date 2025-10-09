package com.aixm.delorean.core.gis.helper;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class SRSValidationHelper {

    public record SRSInfo(String code, boolean inverseAxisOrder) {}

    private static final Pattern SRS_URN_PATTERN =
    Pattern.compile("^urn:ogc:def:crs:([A-Z0-9_\\-]+(?:::[0-9]+|:[0-9.]+:[A-Z0-9_\\-]+))$");

    static final Pattern SRS_HTTP_PATTERN =
    Pattern.compile("^https?://www\\.opengis\\.net/def/crs/([A-Z0-9_\\-]+)/[0-9]+/(\\d+)$");

    private static final Map<String, SRSInfo> ACCEPTED_SRS = new HashMap<>();

    static {
        ACCEPTED_SRS.put("EPSG::4326", new SRSInfo("4326", false));
        ACCEPTED_SRS.put("EPSG::4258", new SRSInfo("4258", false));
        ACCEPTED_SRS.put("EPSG::4322", new SRSInfo("4322", false));
        ACCEPTED_SRS.put("EPSG::4230", new SRSInfo("4230", false));
        ACCEPTED_SRS.put("EPSG::4668", new SRSInfo("4668", false));
        ACCEPTED_SRS.put("EPSG::4312", new SRSInfo("4312", false));
        ACCEPTED_SRS.put("EPSG::4215", new SRSInfo("4215", false));
        ACCEPTED_SRS.put("EPSG::4801", new SRSInfo("4801", false));
        ACCEPTED_SRS.put("EPSG::4149", new SRSInfo("4149", false));
        ACCEPTED_SRS.put("EPSG::4275", new SRSInfo("4275", false));
        ACCEPTED_SRS.put("EPSG::4746", new SRSInfo("4746", false));
        ACCEPTED_SRS.put("EPSG::4121", new SRSInfo("4121", false));
        ACCEPTED_SRS.put("EPSG::4658", new SRSInfo("4658", false));
        ACCEPTED_SRS.put("EPSG::4299", new SRSInfo("4299", false));
        ACCEPTED_SRS.put("EPSG::4806", new SRSInfo("4806", false));
        ACCEPTED_SRS.put("EPSG::4277", new SRSInfo("4277", false));
        ACCEPTED_SRS.put("EPSG::4207", new SRSInfo("4207", false));
        ACCEPTED_SRS.put("EPSG::4274", new SRSInfo("4274", false));
        ACCEPTED_SRS.put("EPSG::4740", new SRSInfo("4740", false));
        ACCEPTED_SRS.put("EPSG::4313", new SRSInfo("4313", false));
        ACCEPTED_SRS.put("EPSG::4124", new SRSInfo("4124", false));
        ACCEPTED_SRS.put("EPSG::4267", new SRSInfo("4267", false));
        ACCEPTED_SRS.put("EPSG::4269", new SRSInfo("4269", false));
        ACCEPTED_SRS.put("OGC:1.3:CRS84", new SRSInfo("4326", true));
    };

    public static Boolean IsInverseAxisOrder(String srsName) {
        if (srsName == null || srsName.isBlank()) {
            throw new IllegalArgumentException("GML Point srsName cannot be null or empty.");
        }

        // Try direct lookup first
        if (ACCEPTED_SRS.containsKey(srsName)) {
            return ACCEPTED_SRS.get(srsName).inverseAxisOrder;
        }

        // Try to normalize using patterns
        Matcher urnMatcher = SRS_URN_PATTERN.matcher(srsName);
        Matcher httpMatcher = SRS_HTTP_PATTERN.matcher(srsName);

        String epsgCode = null;

        if (urnMatcher.matches()) {
            epsgCode = urnMatcher.group(1);
        } else if (httpMatcher.matches()) {
            epsgCode = httpMatcher.group(1) + "::" + httpMatcher.group(2);
        }

        if (epsgCode != null && ACCEPTED_SRS.containsKey(epsgCode)) {
            return ACCEPTED_SRS.get(epsgCode).inverseAxisOrder;
        }

        throw new IllegalArgumentException(
            "Unsupported or invalid srsName (" + srsName + "). Supported SRS are: " + ACCEPTED_SRS.keySet());
    }


    public static String printSrsName(String srsName) {
        if (srsName == null || srsName.isBlank()) {
            throw new IllegalArgumentException("srsName cannot be null or empty.");
        }
        
        String epsgCode = "EPSG::" + srsName;

        if (ACCEPTED_SRS.containsKey(epsgCode)) {
            return "urn:ogc:def:crs:" + epsgCode;
        } else {
            throw new IllegalArgumentException("Unsupported srsName (" + srsName + ") Supported SRS are: " + ACCEPTED_SRS.keySet());
        }
    }

    public static String parseSrsName(String srsName) {
        if (srsName == null || srsName.isBlank()) {
            throw new IllegalArgumentException("srsName cannot be null or empty.");
        }

        Matcher urnMatcher = SRS_URN_PATTERN.matcher(srsName);
        Matcher httpMatcher = SRS_HTTP_PATTERN.matcher(srsName);
        String epsgCode = null;

        if (urnMatcher.matches()) {
            epsgCode = urnMatcher.group(1);

            if (ACCEPTED_SRS.containsKey(epsgCode)) {
                return ACCEPTED_SRS.get(epsgCode).code;
            } else {
                throw new IllegalArgumentException(
                    "Unsupported srsName (" + srsName + ") supported SRS are: " + ACCEPTED_SRS.keySet());
            }
        } else if (httpMatcher.matches()) {
            epsgCode = httpMatcher.group(1) + "::" + httpMatcher.group(2);
            if (ACCEPTED_SRS.containsKey(epsgCode)) {
                return ACCEPTED_SRS.get(epsgCode).code;
            } else {
                throw new IllegalArgumentException(
                    "Unsupported srsName (" + srsName + ") supported SRS are: " + ACCEPTED_SRS.keySet());
            }
        } else if (ACCEPTED_SRS.containsKey(srsName)) {
            // Handle plain “EPSG::4326” or “OGC:1.3:CRS84”
            return ACCEPTED_SRS.get(srsName).code;
        }

        throw new IllegalArgumentException(
            "Invalid srsName format (" + srsName + ") expected URN like 'urn:ogc:def:crs:EPSG::4326' or OGC URL form.");
    }

}
