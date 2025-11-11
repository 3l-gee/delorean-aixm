package com.aixm.delorean.core.container;

import com.aixm.delorean.core.configuration.StructureConfig;
import javax.xml.namespace.QName;

public final class ContainerFactory {
    private ContainerFactory() {
        // Private constructor to prevent instantiation
    }

    @SuppressWarnings("unchecked")
    public static <T, X> Container<T, X> createContainer(StructureConfig structure) {
        Class<?> structureClass = null;
        try {
            structureClass = Class.forName(structure.getStructure());
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid structure class: " + structure.getStructure(), e);
        }

        if (structureClass == com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class) {
            return (Container<T, X>) new Container<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureBaseType>(com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureBaseType.class, new QName("http://www.aixm.aero/schema/5.1/message", "AIXMBasicMessage"));

        } else if (structureClass == com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType.class) {
            return (Container<T, X>) new Container<com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType, com.aixm.delorean.core.schema.a5_2.aixm.AbstractAIXMFeatureBaseType>(com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType.class, com.aixm.delorean.core.schema.a5_2.aixm.AbstractAIXMFeatureBaseType.class, new QName("http://www.aixm.aero/schema/5.2/message", "AIXMBasicMessage"));

        } else {
            throw new IllegalArgumentException("Unsupported container type: " + structureClass.getName());
        }
    }
       
}
