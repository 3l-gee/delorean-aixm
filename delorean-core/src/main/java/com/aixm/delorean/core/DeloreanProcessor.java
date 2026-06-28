package com.aixm.delorean.core;

import java.util.List;
import java.util.UUID;

import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.context.Context;


public interface DeloreanProcessor {
    String getVersion();
    boolean supports(String version);
    Container<?,?,?,?,?,?> createNewContainer();
    Container<?,?,?,?,?,?> getContainerById(String id);
    Container<?,?,?,?,?,?> getContainerByName(String name);
    Container<?,?,?,?,?,?> createNewContainer(String name);
    void removeContainerById(String id);
    void removeContainerByName(String name);
    void setContext(String description);
    void registerContext(String salt,String description);
    void clearContexts();
    void unSetActiveContext();
    List<String> listContainerId();
    void getActiveInfo();
}