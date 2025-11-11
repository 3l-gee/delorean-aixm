package com.aixm.delorean.core.container;

import com.aixm.delorean.core.configuration.StructureConfig;

public final class ContainerFactory {
    private ContainerFactory() {
        // Private constructor to prevent instantiation
    }

    public static AbstractContainer createContainer(StructureConfig structure) {
        Class<?> structureClass = null;
        try {
            structureClass = Class.forName(structure.getStructure());
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid structure class: " + structure.getStructure(), e);
        }

        if (structureClass == com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class) {

            return new Aixm5_1_1Container();
        } else if (structureClass == com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType.class) {

            return new Aixm5_2Container();
        } else {
            throw new IllegalArgumentException("Unsupported container type: " + structureClass.getName());
        }
    }
       
}
