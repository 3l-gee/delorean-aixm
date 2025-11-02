package com.aixm.delorean.core.util;

import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;

public class HrefHelper {

    public static GeometricProperty parseHref(String href, String title) {
        GeometricProperty geometricProperty = new GeometricProperty();

        if (href == null || href.isBlank()) {
            throw new IllegalArgumentException("Href cannot be null or empty");
        }   

        HrefType type;

        if (href.startsWith("urn:")) {
            type = HrefType.URN;
            href = href.substring(href.lastIndexOf(':') + 1);

        } else if (href.startsWith("http://") || href.startsWith("https://")) {
            type = HrefType.URL;

        } else if (href.startsWith("#")) {
            type = HrefType.XML;
            href = href.substring(1);

        } else {
            throw new IllegalArgumentException("Unsupported href format: " + href);
        }

        geometricProperty.setHref(href);
        geometricProperty.setHrefType(type);
        geometricProperty.setTitle(title);

        return geometricProperty;
    }

    public static String printHref(GeometricProperty geometricProperty) {
        String href = geometricProperty.getHref();
        HrefType type = geometricProperty.getHrefType();

        if (type == HrefType.URN) {
            return "urn:" + href;

        } else if (type == HrefType.URL) {
            return href;

        } else if (type == HrefType.XML) {
            return "#" + href;

        } else {
            throw new IllegalArgumentException("Unsupported HrefType: " + type);
        }
    }
}
