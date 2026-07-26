package com.delorean.aixm.aixm52.time.adapter;

import com.delorean.aixm.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.delorean.aixm.core.time.helper.TimeSliceHelper;
import com.delorean.aixm.core.time.type.DeloreanTimeSliceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class TimePrimitivePropertyTypeAdapter extends XmlAdapter<TimePrimitivePropertyType, DeloreanTimeSliceType> {
    
    @Override
    public DeloreanTimeSliceType unmarshal(TimePrimitivePropertyType v) throws Exception {
        if (v == null) {
            return null;
        }
    
        return (TimeSliceHelper.parseValidTime(v));
    }

    @Override
    public TimePrimitivePropertyType marshal(DeloreanTimeSliceType v) throws Exception {
        if (v == null) {
            return null;
        }
        
        return (TimeSliceHelper.printValidTime(v));
    }

}


