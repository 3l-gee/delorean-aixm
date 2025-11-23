package com.aixm.delorean.core.util;

import java.util.HashMap;
import java.util.Map;

public enum AngleUom {
    DEG("deg"),
    RAD("rad");

    private final String symbol;

    AngleUom(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    private static final Map<String, AngleUom> LOOKUP = new HashMap<>();

    static {
        for (AngleUom uom : values()) {
            LOOKUP.put(uom.symbol, uom);
            LOOKUP.put(uom.symbol.toUpperCase(), uom);
        }

        // Accept synonyms
        LOOKUP.put("DEGREES", DEG);
        LOOKUP.put("RADIANS", RAD);
    }

    public static AngleUom fromSymbol(String symbol) {
        if (symbol == null || symbol.isBlank()) {
            throw new IllegalArgumentException("Angle unit of measure cannot be null or empty");
        }

        AngleUom uom = LOOKUP.get(symbol.trim());
        if (uom == null) {
            uom = LOOKUP.get(symbol.trim().toUpperCase());
        }

        if (uom == null) {
            throw new IllegalArgumentException("Unknown angle unit of measure: " + symbol);
        }

        return uom;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
