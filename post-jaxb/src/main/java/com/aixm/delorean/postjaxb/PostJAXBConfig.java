package com.aixm.delorean.postjaxb;

import java.util.List;

public class PostJAXBConfig {

    private List<Change> change;
    private List<Delete> delete;
    private List<Regex> regex;
    private List<Copy> copy;

    public List<Change> getChange() {
        return change;
    }

    public void setChange(List<Change> change) {
        this.change = change;
    }

    public List<Delete> getDelete() {
        return delete;
    }

    public void setDelete(List<Delete> delete) {
        this.delete = delete;
    }

    public List<Regex> getRegex() {
        return regex;
    }

    public void setRegex(List<Regex> regex) {
        this.regex = regex;
    }

    public List<Copy> getCopy() {
        return copy;
    }

    public void setCopy(List<Copy> copy) {
        this.copy = copy;
    }
}