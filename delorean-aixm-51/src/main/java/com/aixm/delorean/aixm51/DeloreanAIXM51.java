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

public class DeloreanAIXM51 implements com.aixm.delorean.core.DeloreanProcessor {

    private static ContainerWarehouse<?,?,?,?> warehouse;

    public DeloreanAIXM51() {
    }

    // --- SPI Interface Implementation ---
    @Override
    public boolean supports(String version) {
        return "aixm51".equals(version);
    }

    @Override
    public String getVersion() {
        String version = DeloreanAIXM51.class.getPackage().getImplementationVersion();
        return version != null ? version : "unknown";
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
            com.aixm.delorean.aixm51.DeloreanAIXM51.class
        );
    }

    /** Lazily creates and returns the warehouse */
    private static ContainerWarehouse<?,?,?,?> warehouse() {
        if (warehouse == null) {
            synchronized (DeloreanAIXM51.class) {
                if (warehouse == null) {
                    warehouse = Delorean.initContainerWarehouse(config());
                }
            }
        }
        return warehouse;
    }

    /** Returns the default (last used) container */
    @Override
    public Container<?,?,?,?> container() {
        return warehouse().getLastUsedContainer();
    }

    /** Creates a new container and returns it */
    @Override
    public Container<?,?,?,?> newContainer() {
        warehouse().createNewContainer();
        return warehouse().getLastUsedContainer();
    }

    /** Returns the container by its id */
    @Override
    public Container<?,?,?,?> getContainerById(String id) {
        return warehouse().getContainerById(id);
    }

    /** Removes the container by its id */
    @Override
    public void removeContainerById(String id) {
        warehouse().removeContainer(id);
    }

    /** Returns a list of all container IDs */
    @Override
    public List<String> listContainerId() {
        return warehouse().listContainerId();
    }
}
