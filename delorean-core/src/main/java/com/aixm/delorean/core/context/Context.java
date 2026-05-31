package com.aixm.delorean.core.context;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Context {
    private final String ref;
    private final String salt;
    private final String name;
    private final String description;
    private final ConcurrentHashMap<String, Integer> uuidIdMap;
    private final AtomicInteger sequenceCounter;

    protected Context(String ref, String salt, String name, String description) {
        this.ref = ref;
        this.salt = salt;
        this.name = name;
        this.description = description;
        this.uuidIdMap = new ConcurrentHashMap<>(50_000);
        this.sequenceCounter = new AtomicInteger(1);
    }

    public String getRef() {
        return this.ref;
    }

    public String getHash() {
        return this.salt;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId(String uuid) {
        Integer seq = uuidIdMap.computeIfAbsent(uuid, k -> sequenceCounter.getAndIncrement());
        return String.format("ID_%08d", seq);
    }
}
