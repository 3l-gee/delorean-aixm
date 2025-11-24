package com.aixm.delorean.postjaxb;

import java.util.List;

// Maps a single item under the 'updates' list
public class ChangeUpdate {
    private String old;
    private List<String> aNew; // 'new' is a reserved keyword in Java

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