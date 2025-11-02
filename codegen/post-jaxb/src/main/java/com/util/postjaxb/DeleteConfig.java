package com.util.postjaxb;

import java.util.List;

// Maps the root of the 'delete.yaml' file
public class DeleteConfig {
    private List<Delete> delete;

    public List<Delete> getDelete() {
        return delete;
    }

    public void setDelete(List<Delete> delete) {
        this.delete = delete;
    }
}