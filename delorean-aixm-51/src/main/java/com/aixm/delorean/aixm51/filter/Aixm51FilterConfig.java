package com.aixm.delorean.aixm51.filter;

import com.aixm.delorean.core.filter.AbstractFilterConfig;
import com.aixm.delorean.aixm51.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm51.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm51.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm51FilterConfig extends AbstractFilterConfig {

    public Aixm51FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
