package com.delorean.aixm.core.context;

import com.delorean.aixm.core.DeloreanUtility;
import jakarta.persistence.AttributeConverter;

public class GmlIdConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String gmlId) {
        if (gmlId == null) return null;
        if (!ContextWarehouse.hasActiveContext()) {
            return gmlId;
        }
        return DeloreanUtility.generateHash(gmlId, ContextWarehouse.getActiveSalt());
    }

    @Override
    public String convertToEntityAttribute(String dbUuid) {
        if (dbUuid == null) return null;
        if (!ContextWarehouse.hasActiveContext()) {
            return dbUuid;
        }
        return ContextWarehouse.getActiveId(dbUuid);
    }
    
}
