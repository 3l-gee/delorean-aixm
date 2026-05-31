package com.aixm.delorean.aixm52.filter;

import com.aixm.delorean.core.filter.AbstractFilterConfig;
import com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm52.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm52.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm52FilterConfig extends AbstractFilterConfig {

    public Aixm52FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
