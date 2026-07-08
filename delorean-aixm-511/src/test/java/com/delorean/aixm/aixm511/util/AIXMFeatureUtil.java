// package com.delorean.aixm.util;

// import com.delorean.aixm.core.org.gml.v_3_2.CodeWithAuthorityType;
// import com.delorean.aixm.core.schema.a5_2.aixm.DMETimeSliceType;
// import com.delorean.aixm.core.time.type.DeloreanTimeSliceType;
// import com.delorean.aixm.core.schema.a5_2.aixm.CodeNavaidDesignatorType;
// import com.delorean.aixm.core.schema.a5_2.aixm.TextNameType;
// import com.delorean.aixm.core.schema.a5_2.aixm.NotePropertyType;

// import java.util.List;
// import jakarta.xml.bind.JAXBElement;


// public class AIXMFeatureUtil {

//     public static DMETimeSliceType dme(
//         String id, 
//         CodeWithAuthorityType identifier, 
//         DeloreanTimeSliceType validTime, 
//         String interpretation,
//         Long sequenceNumber,
//         Long correctionNumber,
//         DeloreanTimeSliceType featureLifetime,
//         JAXBElement<CodeNavaidDesignatorType> designator,
//         JAXBElement<TextNameType> text,
//         List<NotePropertyType> annotation
//     ) {
//         DMETimeSliceType p = new DMETimeSliceType();
//         p.setId(id);
//         p.setIdentifier(identifier);
//         p.setValidTime(validTime);
//         p.setInterpretation(interpretation);
//         p.setSequenceNumber(sequenceNumber);
//         p.setCorrectionNumber(correctionNumber);
//         p.setFeatureLifetime(featureLifetime);
//         p.setDesignator(designator);
//         p.setAixmName(text);
//         p.setAnnotation(annotation);
        
//         return p;
//     }
// }
