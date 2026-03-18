package com.aixm.delorean.core;

import com.aixm.delorean.core.container.Container;
import java.util.List;

public interface DeloreanProcessor {
    String getVersion();
    boolean supports(String version);
    Container<?,?,?,?> container();
    Container<?,?,?,?> newContainer();
    Container<?,?,?,?> getContainerById(String id);
    void removeContainerById(String id);
    List<String> listContainerId();
}