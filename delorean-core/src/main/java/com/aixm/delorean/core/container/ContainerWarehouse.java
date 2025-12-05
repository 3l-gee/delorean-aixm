package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import com.aixm.delorean.core.engine.AbstractEngine;

public class ContainerWarehouse<R, F, T, O> {
    protected String name;
    protected final Class<R> rootClass;
    protected final Class<F> featureClass;
    protected final Class<T> timeSliceClass;
    protected final Class<O> objectClass;
    protected final QName qName;
    protected final XMLBindingFactory<R, F> xmlFactory;
    protected final DatabaseBindingFactory<R, F> databaseFactory;
    protected final AbstractEngine deloreanEngine;
    protected Map<String, Container<R, F, T, O>> containers;
    protected String lastUsedContainerId; 
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;


    public ContainerWarehouse(
        String name, 
        Class<R> rootClass,
        Class<F> featureClass, 
        Class<T> timeSliceClass, 
        Class<O> objectClass, 
        QName qName, 
        XMLBindingFactory<R, F> xmlFactory, 
        DatabaseBindingFactory<R, F> databaseFactory, 
        AbstractEngine deloreanEngine,
        Class<?> CoreResourceAnchorsClass,
        Class<?> AIXMResourceAnchorsClass
    ) {
        this.name = name;
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.qName = qName;
        this.lastUsedContainerId = null; 
        this.xmlFactory = xmlFactory;
        this.databaseFactory = databaseFactory;
        this.containers = new HashMap<>();
        this.deloreanEngine = deloreanEngine;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;

         // create the first container
        this.createNewContainer();
        
    }

    public void createNewContainer() {
        Container<R, F, T, O> container = new Container<R, F, T, O>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName);
        container.setXmlBinding(this.xmlFactory.createXMLBinding());
        container.setDatabaseBinding(this.databaseFactory.createDatabaseBinding());
        container.setDeloreanEngine(this.deloreanEngine);

        String id = UUID.randomUUID().toString().substring(0, 6);
        this.containers.put(id, container);
        this.lastUsedContainerId = id;
    }

    public void removeContainer(String id) {
        this.containers.remove(id);
        this.lastUsedContainerId = id; 
    }

    public Container<R, F, T, O> getContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            return null;
        }
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Container<R, F, T, O> getContainerByName(String name) {
        for (Map.Entry<String, Container<R, F, T, O>> entry : this.containers.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                this.lastUsedContainerId = entry.getKey();
                return entry.getValue();
            }
        }
        return null;
    }

    public Set<String> getIds() {
        return this.containers.keySet();
    }

    public String getLastUsedContainerId() {
        return this.lastUsedContainerId;
    }

    public Container<R, F, T, O> getLastUsedContainer() {
        return this.containers.get(this.lastUsedContainerId);
    }
}
