package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class ContainerWarehouse<T, X> {
    private Map<String, Container<T, X>> containers;
    private String lastContainerId; 

    public ContainerWarehouse() {
        containers = new HashMap<>();
        lastContainerId = null; 
        this.addContainer(getLastContainer());
    }

    public void addContainer(Container<T, X> container) {
        String id = UUID.randomUUID().toString().substring(0, 6);

        containers.put(id, container);
        lastContainerId = id;
    }

    public void replaceContainer(String id, Container<T, X> container) {
        containers.put(id, container);
        lastContainerId = id; 
    }

    public void removeContainer(String id) {
        containers.remove(id);
        lastContainerId = id; 
    }

    public Container getContainer(String id) {
        lastContainerId = id; 
        return containers.get(id);
    }

    public Set<String> getIds() {
        return containers.keySet();
    }

    public String getLastContainerId() {
        return lastContainerId;
    }

    public Container getLastContainer() {
        return containers.get(lastContainerId);
    }
}
