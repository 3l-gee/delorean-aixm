package com.aixm.delorean.core.util;

import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.PointProperty;

public class HrefHelper {

    public static PointProperty parseHref(String href, String title) {
        PointProperty pointProperty = new PointProperty();

        if (href == null || href.isBlank()) {
            throw new IllegalArgumentException("Href cannot be null or empty");
        }   

        HrefType type;

        if (href.startsWith("urn:")) {
            type = HrefType.URN;
            href = href.substring(href.lastIndexOf(':') + 1);
        } else if (href.startsWith("http://") || href.startsWith("https://")) {
            type = HrefType.URL;
            int idx = href.lastIndexOf('/');
            if (idx != -1 && idx < href.length() - 1) {
                href = href.substring(idx + 1);
            }
        } else if (href.startsWith("#")) {
            type = HrefType.XML;
            href = href.substring(1);
        } else {
            throw new IllegalArgumentException("Unsupported href format: " + href);
        }

        pointProperty.setHref(href);
        pointProperty.setHrefType(type);
        pointProperty.setTitle(title);

        return pointProperty;
    }

    /**
     * Extracts a readable title from the href.
     * E.g. urn:uuid:abcd-1234 → abcd-1234
     *      https://example.com/point/XYZ → XYZ
     *      #POINT_01 → POINT_01
     */
    private static String extractTitle(String href) {
        if (href == null) return null;

        int hashIndex = href.lastIndexOf('#');
        int slashIndex = href.lastIndexOf('/');
        int colonIndex = href.lastIndexOf(':');

        // Pick the last delimiter among those that occur
        int index = Math.max(Math.max(hashIndex, slashIndex), colonIndex);
        return (index >= 0 && index < href.length() - 1)
                ? href.substring(index + 1)
                : href;
    }
}
