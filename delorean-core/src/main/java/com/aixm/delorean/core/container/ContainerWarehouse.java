package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

public class ContainerWarehouse<T, X> {
    private final Class<T> root;
    private final Class<X> feature;
    private final QName qName;
    private Map<String, Container<T, X>> containers;
    private String lastContainerId; 

    public ContainerWarehouse(Class<T> root, Class<X> feature, QName qName) {
        this.root = root;
        this.feature = feature;
        this.qName = qName;
        containers = new HashMap<>();
        lastContainerId = null; 
        this.createNewContainer();
    }

    public Container<T, X> createContainer() {
        return new Container<T, X>(this.root, this.feature, this.qName);

    }

    public void createNewContainer() {
        Container<T, X> container = new Container<T, X>(this.root, this.feature, this.qName);
        String id = UUID.randomUUID().toString().substring(0, 6);

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
