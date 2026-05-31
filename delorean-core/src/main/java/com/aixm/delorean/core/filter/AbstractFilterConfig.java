package com.aixm.delorean.core.filter;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public abstract class AbstractFilterConfig {
    protected boolean keepEmpty = false;
    private final Class messageClass;
    private final Class featureClass;
    private final Class timesliceClass;
    
    private final Map filters = new HashMap();

    public AbstractFilterConfig(Class messageClass, Class featureClass, Class timesliceClass) {
        this.messageClass = messageClass;
        this.featureClass = featureClass;
        this.timesliceClass = timesliceClass;
    }

    public void addMessageFilter(AbstractFilterSpecification spec) {
        if (spec != null) {
            this.filters.put(this.messageClass, spec);
        }
    }

    public void addFeatureFilter(AbstractFilterSpecification spec) {
        if (spec != null) {
            this.filters.put(this.featureClass, spec);
        }
    }

    public void addTimesliceFilter(AbstractFilterSpecification spec) {
        if (spec != null) {
            this.filters.put(this.timesliceClass, spec);
        }
    }

    public boolean isKeepEmpty() {
        return keepEmpty;
    }

    public List getMessageFilter(){
        return this.filters.containsKey(this.messageClass) ? List.of((AbstractFilterSpecification) this.filters.get(this.messageClass)) : new ArrayList();
    }

    public List getFeatureFilter(){
        return this.filters.containsKey(this.featureClass) ? List.of((AbstractFilterSpecification) this.filters.get(this.featureClass)) : new ArrayList();
    }

    public List getTimesliceFilter(){
        return this.filters.containsKey(this.timesliceClass) ? List.of((AbstractFilterSpecification) this.filters.get(this.timesliceClass)) : new ArrayList();
    }

}
