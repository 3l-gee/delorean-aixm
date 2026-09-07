package com.delorean.aixm.core.config;

public class GlobalDeloreanConfig {

    private final GlobalLoggingConfig logging;
    private final GlobalServiceConfig service;

    private GlobalDeloreanConfig() {
        this.logging = new GlobalLoggingConfig();
        this.service = new GlobalServiceConfig();
    }

    private static class InstanceHolder {
        private static final GlobalDeloreanConfig INSTANCE = new GlobalDeloreanConfig();
    }

    public static GlobalDeloreanConfig getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public GlobalLoggingConfig getLogging() {
        return logging;
    }

    public GlobalServiceConfig getService() {
        return service;
    }
    
}