package com.aixm.delorean.core.unit;

import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;

import java.util.regex.Pattern;

public class HrefHelper {

    private static final Pattern UUID_PATTERN =
            Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$");

    public static GeometricProperty parseHref(String href, String title) {
        if (href == null || href.isBlank()) {
            throw new IllegalArgumentException("Href cannot be null or empty");
        }

        GeometricProperty geometricProperty = new GeometricProperty();
        HrefType type;

        String normalized = href.trim();

        // --- URN forms ---
        if (normalized.startsWith("urn:uuid:")) {
            String potentialUuid = normalized.substring("urn:uuid:".length());
            if (!UUID_PATTERN.matcher(potentialUuid).matches()) {
                throw new IllegalArgumentException("Invalid UUID in href: " + href);
            }
            type = HrefType.UUID;
            normalized = potentialUuid;

        } else if (normalized.startsWith("urn:")) {
            type = HrefType.URN;
            normalized = normalized.substring(normalized.lastIndexOf(':') + 1);

        // --- Raw UUID ---
        } else if (UUID_PATTERN.matcher(normalized).matches()) {
            type = HrefType.UUID;

        // --- Web URLs ---
        } else if (normalized.startsWith("http://") || normalized.startsWith("https://")) {
            type = HrefType.URL;

        // --- Local XML fragment ---
        } else if (normalized.startsWith("#")) {
            type = HrefType.XML;
            normalized = normalized.substring(1);

        } else {
            throw new IllegalArgumentException("Unsupported href format: " + href);
        }

        geometricProperty.setHref(normalized);
        geometricProperty.setHrefType(type);
        geometricProperty.setTitle(title);

        return geometricProperty;
    }

    public static String printHref(GeometricProperty geometricProperty) {
        if (geometricProperty == null) {
            throw new IllegalArgumentException("GeometricProperty cannot be null");
        }

        String href = geometricProperty.getHref();
        HrefType type = geometricProperty.getHrefType();

        if (href == null || href.isBlank()) {
            throw new IllegalArgumentException("Href value cannot be null or empty");
        }

        switch (type) {
            case UUID:
                return "urn:uuid:" + href;

            case URN:
                return "urn:" + href;

            case URL:
                return href;

            case XML:
                return "#" + href;

            default:
                throw new IllegalArgumentException("Unsupported HrefType: " + type);
        }
    }
}
