package com.aixm.delorean.aixm511.gis.type.components;

import jakarta.persistence.Embeddable;

@Embeddable
public class GeometricProperty implements java.io.Serializable {
    
    private static final long serialVersionUID = 20250910L;
    protected String href;
    protected String srsName;
    protected String title;
    protected HrefType hrefType;
    
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
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
