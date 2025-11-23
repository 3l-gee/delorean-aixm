package com.aixm.delorean.postjaxb;


public class PostJAXBConfig {
    private ChangeConfig change;
    private DeleteConfig delete;
    private RegexConfig regex;
    private CopyConfig copy;

    // Getters and setters
    public ChangeConfig getChange() {
         return change; 
    }

    public void setChange(ChangeConfig change) {
         this.change = change; 
    }

    public DeleteConfig getDelete() { 
        return delete; 
    }

    public void setDelete(DeleteConfig delete) { 
        this.delete = delete; 
    }

    public RegexConfig getRegex() { 
        return regex; 
    }

    public void setRegex(RegexConfig regex) {
        this.regex = regex; 
    }

    public CopyConfig getCopy() {
        return copy; 
    }

    public void setCopy(CopyConfig copy) {
        this.copy = copy;
    }
}
