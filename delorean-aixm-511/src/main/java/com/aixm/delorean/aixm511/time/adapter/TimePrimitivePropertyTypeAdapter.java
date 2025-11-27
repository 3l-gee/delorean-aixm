package com.aixm.delorean.aixm511.time.adapter;

import com.aixm.delorean.aixm511.org.gml.v_3_2.TimePrimitivePropertyType;
import com.aixm.delorean.aixm511.time.helper.TimeSliceHelper;
import com.aixm.delorean.aixm511.time.type.DeloreanTimeSliceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class TimePrimitivePropertyTypeAdapter extends XmlAdapter<TimePrimitivePropertyType, DeloreanTimeSliceType> {
    
    @Override
    public DeloreanTimeSliceType unmarshal(TimePrimitivePropertyType v) throws Exception {
        return (TimeSliceHelper.parseValidTime(v));
    }

    @Override
    public TimePrimitivePropertyType marshal(DeloreanTimeSliceType v) throws Exception {
        return (TimeSliceHelper.printValidTime(v));
    }

}


