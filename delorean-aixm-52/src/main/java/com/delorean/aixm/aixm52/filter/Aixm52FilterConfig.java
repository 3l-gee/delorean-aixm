package com.delorean.aixm.aixm52.filter;

import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.aixm52.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm52.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm52.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm52FilterConfig extends AbstractFilterConfig {

    public Aixm52FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
