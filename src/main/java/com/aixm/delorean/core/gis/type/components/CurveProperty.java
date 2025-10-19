package com.aixm.delorean.core.gis.type.components;

public class CurveProperty {
    protected Long index;
    protected String href;
    protected String title;
    protected HrefType hrefType;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }
    
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public HrefType getHrefType() {
        return hrefType;
    }  

    public void setHrefType(HrefType hrefType) {
        this.hrefType = hrefType;
    }
}
