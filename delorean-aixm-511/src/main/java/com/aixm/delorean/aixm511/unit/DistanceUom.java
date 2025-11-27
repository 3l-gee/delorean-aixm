package com.aixm.delorean.aixm511.unit;

import java.util.HashMap;
import java.util.Map;

public enum DistanceUom {
    M("M"),
    FT("FT"),
    MI("MI"),
    KM("KM"),
    NM("NM");

    private final String symbol;

    DistanceUom(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    private static final Map<String, DistanceUom> LOOKUP = new HashMap<>();

    static {
        for (DistanceUom uom : values()) {
            LOOKUP.put(uom.symbol, uom);
            LOOKUP.put(uom.symbol.toUpperCase(), uom);
        }

        // Lowercase variants
        LOOKUP.put("m", M);
        LOOKUP.put("ft", FT);
        LOOKUP.put("mi", MI);
        LOOKUP.put("km", KM);
        LOOKUP.put("nm", NM);

        // AIXM / legacy / alternate spellings
        LOOKUP.put("[nmi_i]", NM);
        LOOKUP.put("NMI", NM);
        LOOKUP.put("nmi", NM);
    }

    public static DistanceUom fromSymbol(String symbol) {
        if (symbol == null || symbol.isBlank()) {
            throw new IllegalArgumentException("Distance unit of measure cannot be null or empty");
        }

        DistanceUom uom = LOOKUP.get(symbol.trim());
        if (uom == null) {
            uom = LOOKUP.get(symbol.trim().toUpperCase());
        }

        if (uom == null) {
            throw new IllegalArgumentException("Unknown distance unit of measure: " + symbol);
        }

        return uom;
    }

    @Override
    public String toString() {
        return symbol;
    }
}


