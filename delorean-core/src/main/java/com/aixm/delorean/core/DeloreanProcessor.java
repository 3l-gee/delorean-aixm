package com.aixm.delorean.core;

import java.util.List;
import java.util.UUID;

import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.context.Context;


public interface DeloreanProcessor {
    String getVersion();
    boolean supports(String version);
    Container<?,?,?,?,?,?> container();
    Container<?,?,?,?,?,?> newContainer();
    Container<?,?,?,?,?,?> getContainerById(String id);
    Context setContext(String name, String description);
    Context registerContext(String salt, String name, String description);
    void removeContainerById(String id);
    List<String> listContainerId();
    void getActiveInfo();
}