package com.delorean.aixm.postjaxb;

import java.util.List;

public class ChangeUpdate {
    private String old;
    private List<String> aNew;

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public List<String> getNew() {
        return aNew;
    }

    public void setNew(List<String> aNew) {
        this.aNew = aNew;
    }
}