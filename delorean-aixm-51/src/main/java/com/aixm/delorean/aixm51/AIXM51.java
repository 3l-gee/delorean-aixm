package com.aixm.delorean.aixm51;

import com.aixm.delorean.core.CoreConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.aixm51.schema.message.AIXMBasicMessageType;

import java.util.List;

import javax.xml.namespace.QName;

import com.aixm.delorean.aixm51.engine.Aixm51Engine;
import com.aixm.delorean.aixm51.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm51.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm51.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm51.database.Aixm51DatabaseFunction;

public class AIXM51{

    private static ContainerWarehouse<?,?,?,?> warehouse;

    private AIXM51() {
        // no instances
    }

    public static CoreConfig config() {
        return new CoreConfig(
            "AIXM 5.1",
            AIXMBasicMessageType.class,
            AbstractAIXMFeatureType.class,
            AbstractAIXMTimeSliceType.class,
            AbstractAIXMObjectType.class,
            Aixm51Engine.class,
            Aixm51DatabaseFunction.class,
            new QName("http://www.aixm.aero/schema/5.1/message", "AIXMBasicMessage", "message"),
            "/schema/message/AIXM_BasicMessage.xsd",
            "/sql/pre-init.sql",
            "/sql/post-init.sql",
            "hibernate/hibernate.cfg.xml",
            com.aixm.delorean.core.Delorean.class,
            com.aixm.delorean.aixm51.AIXM51.class
        );
    }

    /** Lazily creates and returns the warehouse */
    private static ContainerWarehouse<?,?,?,?> warehouse() {
        if (warehouse == null) {
            synchronized (AIXM51.class) {
                if (warehouse == null) {
                    warehouse = Delorean.initContainerWarehouse(config());
                }
            }
        }
        return warehouse;
    }

    /** Returns the default (last used) container */
    public static Container<?,?,?,?> container() {
        return warehouse().getLastUsedContainer();
    }

    /** Creates a new container and returns it */
    public static Container<?,?,?,?> newContainer() {
        warehouse().createNewContainer();
        return warehouse().getLastUsedContainer();
    }

    /** Returns the container by its id */
    public static Container<?,?,?,?> getContainerById(String id) {
        return warehouse().getContainerById(id);
    }

    /** Removes the container by its id */
    public static void removeContainerById(String id) {
        warehouse().removeContainer(id);
    }

    public static List<String> listContainerId() {
        return warehouse().listContainerId();
    }
}
