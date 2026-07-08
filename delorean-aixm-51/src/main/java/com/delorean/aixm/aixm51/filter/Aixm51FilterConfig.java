package com.delorean.aixm.aixm51.filter;

import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.aixm51.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm51.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm51.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm51FilterConfig extends AbstractFilterConfig {

    public Aixm51FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
