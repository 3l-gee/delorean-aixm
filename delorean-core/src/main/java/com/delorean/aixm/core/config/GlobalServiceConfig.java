package com.delorean.aixm.core.config;

public class GlobalServiceConfig {
    private int workerThreads = 4;
    private int ioThreads = 4;
    private int batchSize = 100;

    public int getWorkerThreads() { return workerThreads; }
    public void setWorkerThreads(int workerThreads) { this.workerThreads = workerThreads; }

    public int getIoThreads() { return ioThreads; }
    public void setIoThreads(int ioThreads) { this.ioThreads = ioThreads; }

    public int getBatchSize() { return batchSize; }
    public void setBatchSize(int batchSize) { this.batchSize = batchSize; }
}
