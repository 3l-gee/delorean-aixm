package com.aixm.delorean.core.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import com.aixm.delorean.core.engine.AbstractEngine;
import com.aixm.delorean.core.database.AbstractDatabaseFunctions;

public class ContainerWarehouse<ROOT, FEATURE, TIMESLICE, OBJECT> {
    protected String name;
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected final QName qName;
    protected final XMLBindingFactory<ROOT, FEATURE> xmlFactory;
    protected final DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> databaseFactory;
    protected final AbstractEngine<ROOT, FEATURE, TIMESLICE, OBJECT> deloreanEngine;
    protected final AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;
    protected Map<String, Container<ROOT, FEATURE, TIMESLICE, OBJECT>> containers;
    protected String lastUsedContainerId; 
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;


    public ContainerWarehouse(
        String name, 
        Class<ROOT> rootClass,
        Class<FEATURE> featureClass, 
        Class<TIMESLICE> timeSliceClass, 
        Class<OBJECT> objectClass, 
        QName qName, 
        XMLBindingFactory<ROOT, FEATURE> xmlFactory, 
        DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> databaseFactory, 
        AbstractEngine<ROOT, FEATURE, TIMESLICE, OBJECT> deloreanEngine,
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper,
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
        this.databaseHelper = databaseHelper;
        this.containers = new HashMap<>();
        this.deloreanEngine = deloreanEngine;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
    }

    public void createNewContainer() {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Container<ROOT, FEATURE, TIMESLICE, OBJECT> container = new Container<ROOT, FEATURE, TIMESLICE, OBJECT>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        container.setXmlBinding(this.xmlFactory.createXMLBinding());
        container.setDatabaseBinding(this.databaseFactory.createDatabaseBinding());
        container.setDeloreanEngine(this.deloreanEngine);
        
        this.containers.put(id, container);
        this.lastUsedContainerId = id;
    }

    public void removeContainer(String id) {
        this.containers.remove(id);
        this.lastUsedContainerId = null; 
    }

    public Container<ROOT, FEATURE, TIMESLICE, OBJECT> getContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            return null;
        }
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Container<ROOT, FEATURE, TIMESLICE, OBJECT> getContainerByName(String name) {
        for (Map.Entry<String, Container<ROOT, FEATURE, TIMESLICE, OBJECT>> entry : this.containers.entrySet()) {
            if (entry.getValue().getId().equals(name)) {
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
        if (this.lastUsedContainerId == null) {
            throw new IllegalStateException(
                "No container has been created or selected yet"
            );
        }
        return this.lastUsedContainerId;
    }

    public Container<ROOT, FEATURE, TIMESLICE, OBJECT> getLastUsedContainer() {
        return this.containers.get(this.lastUsedContainerId);
    }

    public List<String> listContainerId() {
        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Container<ROOT, FEATURE, TIMESLICE, OBJECT>> entry : this.containers.entrySet()) {
            output.add(entry.getKey());
        }

        return output;
    }
}
