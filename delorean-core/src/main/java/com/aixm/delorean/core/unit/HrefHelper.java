package com.aixm.delorean.core.unit;

import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.DeloreanUtility;
import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;

import java.util.regex.Pattern;

public class HrefHelper {

    private static final Pattern UUID_PATTERN =
            Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$");

    public static String parseId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id cannot be null or empty");
        }

        String normalized = id.trim();

        // --- URN forms ---
        if (normalized.startsWith("urn:uuid:")) {
            String potentialUuid = normalized.substring("urn:uuid:".length());
            if (!UUID_PATTERN.matcher(potentialUuid).matches()) {
                throw new IllegalArgumentException("Invalid UUID in href: " + id);
            }
            return normalized;

        } else if (normalized.startsWith("urn:")) {
            return normalized;

        // --- Raw UUID ---
        } else if (UUID_PATTERN.matcher(normalized).matches()) {
            return "urn:uuid:" + normalized;

        // --- Web URLs ---
        } else if (normalized.startsWith("http://") || normalized.startsWith("https://")) {
            return normalized;

        // --- Local XML fragment ---
        } else {
            if (!ContextWarehouse.hasActiveContext()) {
                return id;
            }
            return DeloreanUtility.generateHash(id, ContextWarehouse.getActiveHash());
        }
    }

    public static String printId(String hashed) {
        if (hashed == null) {
            throw new IllegalArgumentException("Hashed cannot be null");
        }

        // --- URN forms ---
        if (hashed.startsWith("urn:uuid:")) {
            return hashed;

        } else if (hashed.startsWith("urn:oid:")) {
            String originalId = hashed.substring("urn:oid:".length());
            return DeloreanUtility.generateHash(originalId, ContextWarehouse.getActiveHash());

        } else if (hashed.startsWith("urn:")) {
            return hashed;

        // --- Web URLs ---
        } else if (hashed.startsWith("http://") || hashed.startsWith("https://")) {
            return hashed;

        } else {
            return hashed;
        }
    }

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
            if (!ContextWarehouse.hasActiveContext()) {
                type = HrefType.GML;
                normalized = normalized.substring(1);
            } else {
                type = HrefType.OID;
                String originalId = normalized.substring(1);
                normalized = DeloreanUtility.generateHash(originalId, ContextWarehouse.getActiveHash());
            }

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

            case OID:
                String activeId = ContextWarehouse.getActiveId(href);
                return "#" + activeId;

            case GML:
                return "#" + href;

            default:
                throw new IllegalArgumentException("Unsupported HrefType: " + type);
        }
    }
}
