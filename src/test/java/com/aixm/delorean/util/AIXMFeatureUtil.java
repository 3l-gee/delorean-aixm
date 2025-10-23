package com.aixm.delorean.util;

import com.aixm.delorean.core.org.gml.v_3_2.CodeWithAuthorityType;
import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType;
import com.aixm.delorean.core.schema.a5_2.aixm.TextNameType;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AIXMFeatureUtil {

    public static DMETimeSliceType dme(
        String id, 
        CodeWithAuthorityType identifier, 
        DeloreanTimeSliceType validTime, 
        String interpretation,
        Long sequenceNumber,
        Long correctionNumber,
        DeloreanTimeSliceType featureLifetime,
        CodeNavaidDesignatorType designator,
        TextNameType text
        ) {
        DMETimeSliceType p = new DMETimeSliceType();
        p.setId(id);
        p.setIdentifier(identifier);
        p.setValidTime(validTime);
        p.setInterpretation(interpretation);
        p.setSequenceNumber(sequenceNumber);
        p.setCorrectionNumber(correctionNumber);
        p.setFeatureLifetime(featureLifetime);
        p.setDesignator(new JAXBElement<>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, designator));
        p.setAixmName(new JAXBElement<>(new QName("http://www.aixm.aero/schema/5.2", "name"), TextNameType.class, DMETimeSliceType.class, text)); 
        
        if (designator == null) {
            p.getDesignator().setNil(true);
        }

        if (text == null) {
            p.getAixmName().setNil(true);
        }
        
        return p;
    }
}
