package com.delorean.aixm.aixm51;

import com.delorean.aixm.core.CoreConfig;
import com.delorean.aixm.core.Delorean;
import com.delorean.aixm.core.container.Container;
import com.delorean.aixm.core.container.ContainerWarehouse;
import com.delorean.aixm.core.context.Context;
import com.delorean.aixm.core.context.ContextWarehouse;
import com.delorean.aixm.aixm51.schema.message.AIXMBasicMessageType;
import com.delorean.aixm.aixm51.schema.message.BasicMessageMemberAIXMPropertyType;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.delorean.aixm.aixm51.engine.Aixm51Engine;
import com.delorean.aixm.aixm51.filter.Aixm51FilterConfig;
import com.delorean.aixm.aixm51.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm51.schema.AbstractAIXMObjectType;
import com.delorean.aixm.aixm51.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm51.database.Aixm51DatabaseFunction;

public class DeloreanAIXM51 implements com.delorean.aixm.core.DeloreanProcessor {

    private static ContainerWarehouse<?,?,?,?,?,?> containers;

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
            BasicMessageMemberAIXMPropertyType.class,
            AbstractAIXMFeatureType.class,
            AbstractAIXMTimeSliceType.class,
            AbstractAIXMObjectType.class,
            Aixm51Engine.class,
            Aixm51DatabaseFunction.class,
            Aixm51FilterConfig.class,
            new QName("http://www.aixm.aero/schema/5.1/message", "AIXMBasicMessage", "message"),
            "/schema/message/AIXM_BasicMessage.xsd",
            "/sql/pre-init.sql",
            "/sql/post-init.sql",
            Map.of(
            "domain_check", "/sql/domain_check.sql",
            "domain_checkless", "/sql/domain_checkless.sql",
            "query_basic_message_member_ids", "/sql/query_basic_message_member_ids.sql",
            "query_time_slice_property_ids", "/sql/query_time_slice_property_ids.sql",
            "postgresql_comments","/sql/postgresql_comments.sql"
            ),
            "hibernate/hibernate.cfg.xml",
            com.delorean.aixm.core.Delorean.class,
            com.delorean.aixm.aixm51.DeloreanAIXM51.class
        );
    }

    /** Lazily creates and returns the warehouse */
    private static ContainerWarehouse<?,?,?,?,?,?> containerWarehouse() {
        if (containers == null) {
            synchronized (DeloreanAIXM51.class) {
                if (containers == null) {
                    containers = Delorean.initContainerWarehouse(config());
                }
            }
        }
        return containers;
    }

    /** 
     * Creates a new context with a random salt and sets it as active.
    */
    @Override
    public void setContext(String description) {
        ContextWarehouse.getInstance().setContext(description);
    }

    /**
    * Creates a new context with the provided deterministic salt and sets it as active.
    * This allows for consistent ID generation across different runs or documents when the same salt is used.
    */
    @Override
    public void registerContext(String salt, String description) {
        ContextWarehouse.getInstance().registerContext(salt, description);
    }

    /**
     * Clears all contexts from the ContextWarehouse and unsets any active context.
     */
    @Override
    public void clearContexts() {
        ContextWarehouse.getInstance().clearContexts();
    }

    /**
     * Unsets the currently active context without removing it from the ContextWarehouse. This allows the context to be reactivated later if needed.
     */
    @Override
    public void unSetActiveContext() {
        ContextWarehouse.getInstance().unSetActiveContext();
    }

    /** Creates a new container and returns it */
    @Override
    public Container<?,?,?,?,?,?> createNewContainer() {
        containerWarehouse().createNewContainer();
        return containerWarehouse().getLastUsedContainer();
    }

    /** Creates a new container and returns it */
    @Override
    public Container<?,?,?,?,?,?> createNewContainer(String name) {
        containerWarehouse().createNewContainer(name);
        return containerWarehouse().getLastUsedContainer();
    }


    /** Returns the container by its id */
    @Override
    public Container<?,?,?,?,?,?> getContainerById(String id) {
        return containerWarehouse().getContainerById(id);
    }

    /** Returns the container by its name */
    @Override
    public Container<?,?,?,?,?,?> getContainerByName(String name) {
        return containerWarehouse().getContainerByName(name);
    }

    /**
     * Removes the container with the specified ID.
     * @param id The ID of the container to remove.
     */
    @Override
    public void removeContainerById(String id) {
        containerWarehouse().removeContainerById(id);
    }

    /**
     * Removes the container with the specified name.
      * @param name The name of the container(s) to remove.
     */
    @Override
    public void removeContainerByName(String name) {
        containerWarehouse().removeContainerByName(name);
    }

    /** Returns a list of all container IDs */
    @Override
    public List<String> listContainerId() {
        return containerWarehouse().listContainerId();
    }

    /** Logs the active context information */
    @Override
    public void getActiveInfo() {
        ContextWarehouse.getInstance().getActiveInfo();
    }
}
