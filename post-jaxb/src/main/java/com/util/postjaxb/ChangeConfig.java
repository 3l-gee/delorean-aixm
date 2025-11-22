package com.util.postjaxb;

import java.util.List;

// Maps the root of the 'changes.yaml' file
public class ChangeConfig {
    private List<Change> change;

    public List<Change> getChange() {
        return change;
    }

    public void setChange(List<Change> change) {
        this.change = change;
    }
}