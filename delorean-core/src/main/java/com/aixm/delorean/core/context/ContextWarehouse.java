package com.aixm.delorean.core.context;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

/**
 * The {@code ContextWarehouse} serves as the central registry and coordinator
 * for GML id lifecycle management.
 * gml:id attributes are transient, document-level IDs but they describe
 * persistent logic between features across different files.
 * The {@code ContextWarehouse} ensures that these transient id are consistently
 * resolved to stable, deterministic id while allowing
 * future documents to be merge by resuing the same deterministic salt.
 */
public class ContextWarehouse {
    private static final ContextWarehouse instance = new ContextWarehouse();
    private final Map<String, Context> contexts = new ConcurrentHashMap<>();
    private static Context activeContext;

    private ContextWarehouse() {
        // Private constructor to prevent instantiation
    }

    public static ContextWarehouse getInstance() {
        return instance;
    }

    public static boolean hasActiveContext() {
        return activeContext != null;
    }

    public void setContext(String description) {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Context ctx = new Context(id, UUID.randomUUID().toString(), description);
        contexts.put(id, ctx);
        ContextWarehouse.activeContext = ctx;
        ConsoleLogger.info("Active Context Ref: " + ctx.getRef() + " Hash: " + ctx.getSalt() + " Description: "
                + ctx.getDescription());
    }

    public void registerContext(String salt, String description) {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Context ctx = new Context(id, salt, description);
        contexts.put(id, ctx);
        ContextWarehouse.activeContext = ctx;
        ConsoleLogger.info("Active Context Ref: " + ctx.getRef() + " Hash: " + ctx.getSalt() + " Description: "
                + ctx.getDescription());
    }

    public void switchContext(String ref) {
        Context ctx = contexts.get(ref);
        if (ctx == null) {
            throw new IllegalArgumentException("Context Ref: " + ref + " not found");
        }
        activeContext = ctx;
        ConsoleLogger.info("Switched to Context Ref: " + ctx.getRef() + " Hash: " + ctx.getSalt() + " Description: "
                + ctx.getDescription());
    }

    public Context getActive() {
        Context current = activeContext;
        if (current == null) {
            return null;
        }

        return current;
    }

    public static String getActiveId(String uuid) {
        return getInstance().getActive().getId(uuid);
    }

    public static String getActiveSalt() {
        return getInstance().getActive().getSalt();
    }

    public static String getActiveSaltDescription() {
        return getInstance().getActive().getDescription();
    }

    public Map<String, Context> listContexts() {
        return contexts;
    }

    public void getActiveInfo() {
        Context current = getActive();
        ConsoleLogger.info("Active Context Ref: " + current.getRef() + " Salt: " + current.getSalt() + " Description: "
                + current.getDescription());
    }

    public String getSalt() {
        return getActive().getSalt();
    }

    public String getId(String uuid) {
        return getActive().getId(uuid);
    }

    public void clearContexts() {
        contexts.clear();
        activeContext = null;

        ConsoleLogger.info("All contexts cleared");
    }

    public void unSetActiveContext() {
        activeContext = null;

        ConsoleLogger.info("Active context unset");
    }
}
