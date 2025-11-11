package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.aixm.delorean.core.util.Util;

public class ContainerWarehouse {
    private Map<String, AbstractContainer> containers;
    private String lastContainerId; 

    public ContainerWarehouse() {
        containers = new HashMap<>();
        lastContainerId = null; 
    }

    public void addContainer(AbstractContainer container) {
        String id = Util.generateId();

        containers.put(id, container);
        lastContainerId = id;
    }

    public void replaceContainer(String id, AbstractContainer container) {
        containers.put(id, container);
        lastContainerId = id; 
    }

    public void removeContainer(String id) {
        containers.remove(id);
        lastContainerId = id; 
    }

    public AbstractContainer getContainer(String id) {
        lastContainerId = id; 
        return containers.get(id);
    }

    public Set<String> getIds() {
        return containers.keySet();
    }

    public String getLastContainerId() {
        return lastContainerId;
    }

    public AbstractContainer getLastContainer() {
        return containers.get(lastContainerId);
    }
}
