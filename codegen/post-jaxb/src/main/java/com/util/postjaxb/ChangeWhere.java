package com.util.postjaxb;

// Maps the 'where' block within a Change
public class ChangeWhere {
    private String filePath;
    private String method;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}