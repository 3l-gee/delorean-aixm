package com.aixm.delorean.core.context;

import com.aixm.delorean.core.DeloreanUtility;
import jakarta.persistence.AttributeConverter;

public class GmlIdConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String gmlId) {
        if (gmlId == null) return null;
        return DeloreanUtility.generateHash(gmlId, ContextWarehouse.getActiveHash());
    }

    @Override
    public String convertToEntityAttribute(String dbUuid) {
        if (dbUuid == null) return null;
        return ContextWarehouse.getActiveId(dbUuid);
    }
    
}
