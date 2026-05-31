package com.aixm.delorean.aixm511.filter;

import com.aixm.delorean.core.filter.AbstractFilterConfig;
import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm511FilterConfig extends AbstractFilterConfig {

    public Aixm511FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
