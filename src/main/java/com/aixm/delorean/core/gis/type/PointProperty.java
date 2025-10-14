package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PointProperty {
    protected String href;
    protected String title;
    
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
}
