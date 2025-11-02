package com.aixm.delorean.core.gis.type.components;

import jakarta.persistence.Embeddable;

@Embeddable
public class GeometricProperty{
    protected String href;
    protected String title;
    protected HrefType hrefType;
    
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
