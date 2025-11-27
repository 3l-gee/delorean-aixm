package com.aixm.delorean.util;

import java.util.List;

import com.aixm.delorean.aixm511.org.gml.v_3_2.CodeWithAuthorityType;
import com.aixm.delorean.aixm511.schema.CodeNavaidDesignatorType;
import com.aixm.delorean.aixm511.schema.DMETimeSliceType;
import com.aixm.delorean.aixm511.schema.NotePropertyType;
import com.aixm.delorean.aixm511.schema.TextNameType;
import com.aixm.delorean.aixm511.time.type.DeloreanTimeSliceType;

import jakarta.xml.bind.JAXBElement;


public class AIXMFeatureUtil {

    public static DMETimeSliceType dme(
        String id, 
        CodeWithAuthorityType identifier, 
        DeloreanTimeSliceType validTime, 
        String interpretation,
        Long sequenceNumber,
        Long correctionNumber,
        DeloreanTimeSliceType featureLifetime,
        JAXBElement<CodeNavaidDesignatorType> designator,
        JAXBElement<TextNameType> text,
        List<NotePropertyType> annotation
    ) {
        DMETimeSliceType p = new DMETimeSliceType();
        p.setId(id);
        p.setIdentifier(identifier);
        p.setValidTime(validTime);
        p.setInterpretation(interpretation);
        p.setSequenceNumber(sequenceNumber);
        p.setCorrectionNumber(correctionNumber);
        p.setFeatureLifetime(featureLifetime);
        p.setDesignator(designator);
        p.setAixmName(text);
        p.setAnnotation(annotation);
        
        return p;
    }
}
