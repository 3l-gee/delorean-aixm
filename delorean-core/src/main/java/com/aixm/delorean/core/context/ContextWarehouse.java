package com.aixm.delorean.core.context;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

/**
 * The {@code ContextWarehouse} serves as the central registry and coordinator for GML id lifecycle management.
 * gml:id attributes are transient, document-level IDs but they describe persistent logic between features across different files. 
 * The {@code ContextWarehouse} ensures that these transient id are consistently resolved to stable, deterministic id while allowing
 *  future documents to be merge by resuing the same deterministic salt.
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

    public void setContext(String name, String description) {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Context ctx = new Context(UUID.randomUUID().toString(), name, description);
        contexts.put(id, ctx);
        ContextWarehouse.activeContext = ctx;
    }

    public void registerContext(String salt, String name, String description) {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Context ctx = new Context(salt, name, description);
        contexts.put(id, ctx);
        ContextWarehouse.activeContext = ctx;
        ConsoleLogger.log(LogLevel.INFO, "Active Context: " + ctx.getName() + " Hash: " + ctx.getHash());
    }

    public void switchContext(String ref) {
        Context ctx = contexts.get(ref);
        if (ctx == null) {
            throw new IllegalArgumentException("Context " + ref + " not found");
        }
        activeContext = ctx;
    }

    public Context getActive() {
        Context current = activeContext;
        if (current == null) {
            throw new IllegalStateException("No ContainerContext is currently active!");
        }

        return current;
    }

    public static String getActiveId(String uuid) {
        return getInstance().getActive().getId(uuid);
    }

    public static String getActiveHash() {
        return getInstance().getActive().getHash();
    }

    public Map<String, Context> listContexts() {
        return contexts;
    }

    public void getActiveInfo() {
        Context current = getActive();
        ConsoleLogger.log(LogLevel.INFO, "Active Context: " + current.getName() + " Hash: " + current.getHash());
    }

    public String getHash() {
        return getActive().getHash();
    }

    public String getId(String uuid) {
        return getActive().getId(uuid);
    }

    public void removeContext(String ref) {
        contexts.remove(ref);
    }
}
