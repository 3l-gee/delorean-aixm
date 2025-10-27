package com.aixm.delorean.core.util;

import com.aixm.delorean.core.gis.type.components.CurveProperty;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.PointProperty;

public class HrefHelper {

    public static PointProperty parseHref(String href, String title, Long index) {
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

        } else if (href.startsWith("#")) {
            type = HrefType.XML;
            href = href.substring(1);

        } else {
            throw new IllegalArgumentException("Unsupported href format: " + href);
        }

        pointProperty.setHref(href);
        pointProperty.setHrefType(type);
        pointProperty.setTitle(title);
        pointProperty.setIndex(index);

        return pointProperty;
    }

    public static CurveProperty parseHref(String href, String title) {
        CurveProperty curveProperty = new CurveProperty();

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

        curveProperty.setHref(href);
        curveProperty.setHrefType(type);
        curveProperty.setTitle(title);

        return curveProperty;
    }

    public static String printHref(CurveProperty curveProperty) {
        String href = curveProperty.getHref();
        HrefType type = curveProperty.getHrefType();

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

    public static String printHref(PointProperty pointProperty) {
        String href = pointProperty.getHref();
        HrefType type = pointProperty.getHrefType();

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
