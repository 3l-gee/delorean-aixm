package com.delorean.aixm.postjaxb;

import java.util.List;

public class Change {

    private ChangeWhere where;
    private List<ChangeUpdate> updates;

    public ChangeWhere getWhere() {
        return where;
    }

    public void setWhere(ChangeWhere where) {
        this.where = where;
    }

    public List<ChangeUpdate> getUpdates() {
        return updates;
    }

    public void setUpdates(List<ChangeUpdate> updates) {
        this.updates = updates;
    }
}