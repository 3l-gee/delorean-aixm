package com.delorean.aixm.aixm511.filter;

import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.aixm511.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm511.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;

public class Aixm511FilterConfig extends AbstractFilterConfig {

    public Aixm511FilterConfig(Class<BasicMessageMemberAIXMPropertyType> messageClass, Class<AbstractAIXMFeatureType> featureClass, Class<AbstractAIXMTimeSliceType> timesliceClass) {
        super(messageClass, featureClass, timesliceClass);
    }
}
