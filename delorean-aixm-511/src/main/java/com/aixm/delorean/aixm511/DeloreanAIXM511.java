package com.aixm.delorean.aixm511;

import com.aixm.delorean.core.CoreConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.context.Context;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;

import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.aixm.delorean.aixm511.engine.Aixm511Engine;
import com.aixm.delorean.aixm511.filter.Aixm511FilterConfig;
import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm511.database.Aixm511DatabaseFunction;

public class DeloreanAIXM511 implements com.aixm.delorean.core.DeloreanProcessor {

    private static ContainerWarehouse<?,?,?,?,?,?> warehouse;

    public DeloreanAIXM511() {
    }

    // --- SPI Interface Implementation ---
    @Override
    public boolean supports(String version) {
        return "aixm511".equals(version);
    }

    @Override
    public String getVersion() {
        String version = DeloreanAIXM511.class.getPackage().getImplementationVersion();
        return version != null ? version : "unknown";
    }

    public static CoreConfig config() {
        return new CoreConfig(
            "AIXM 5.1.1",
            AIXMBasicMessageType.class,
            BasicMessageMemberAIXMPropertyType.class,
            AbstractAIXMFeatureType.class,
            AbstractAIXMTimeSliceType.class,
            AbstractAIXMObjectType.class,
            Aixm511Engine.class,
            Aixm511DatabaseFunction.class,
            Aixm511FilterConfig.class,
            new QName("http://www.aixm.aero/schema/5.1.1/message", "AIXMBasicMessage", "message"),
            "/schema/message/AIXM_BasicMessage.xsd",
            "/sql/pre-init.sql",
            "/sql/post-init.sql",
            "hibernate/hibernate.cfg.xml",
            com.aixm.delorean.core.Delorean.class,
            com.aixm.delorean.aixm511.DeloreanAIXM511.class
        );
    }

    /** Lazily creates and returns the warehouse */
    private static ContainerWarehouse<?,?,?,?,?,?> warehouse() {
        if (warehouse == null) {
            synchronized (DeloreanAIXM511.class) {
                if (warehouse == null) {
                    warehouse = Delorean.initContainerWarehouse(config());
                }
            }
        }
        return warehouse;
    }

    /** 
     * Creates a new context with a random salt and sets it as active.
    */
    @Override
    public Context setContext(String name, String description) {
        ContextWarehouse.getInstance().setContext(name, description);

        return ContextWarehouse.getInstance().getActive();
    }

    /**
    * Creates a new context with the provided deterministic salt and sets it as active.
    * This allows for consistent ID generation across different runs or documents when the same salt is used.
    */
    @Override
    public Context registerContext(String salt, String name, String description) {
        ContextWarehouse.getInstance().registerContext(salt, name, description);

        return ContextWarehouse.getInstance().getActive();
    }

    /** Returns the default (last used) container */
    @Override
    public Container<?,?,?,?,?,?> container() {
        return warehouse().getLastUsedContainer();
    }

    /** Creates a new container and returns it */
    @Override
    public Container<?,?,?,?,?,?> newContainer() {
        warehouse().createNewContainer();
        return warehouse().getLastUsedContainer();
    }

    /** Returns the container by its id */
    @Override
    public Container<?,?,?,?,?,?> getContainerById(String id) {
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

    /** Logs the active context information */
    @Override
    public void getActiveInfo() {
        ContextWarehouse.getInstance().getActiveInfo();
    }
}
