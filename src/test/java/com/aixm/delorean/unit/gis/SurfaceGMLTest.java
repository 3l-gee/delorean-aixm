package com.aixm.delorean.unit.gis;

import static org.junit.Assert.assertThat;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.stream.Stream;

import javax.xml.namespace.QName;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class SurfaceGMLTest {

    @SuppressWarnings("unchecked")
    private static <T> T loadFromXml(String xml, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Object result = unmarshaller.unmarshal(new StringReader(xml));
        if (result instanceof JAXBElement<?>) {
            return (T) ((JAXBElement<?>) result).getValue();
        }
        return type.cast(result);
    }

    private static <T> String saveToXml(T object, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter writer = new StringWriter();

        if (!type.isAnnotationPresent(jakarta.xml.bind.annotation.XmlRootElement.class)) {
            String localName = type.getSimpleName().replace("Type", "");
            QName qName = new QName("http://www.opengis.net/gml/3.2", localName);   
            JAXBElement<T> root = new JAXBElement<>(qName, type, object);
            marshaller.marshal(root, writer);
        } else {
            marshaller.marshal(object, writer);
        }

        return writer.toString().trim();
    }

    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidGMLSurface() {
        
    }

    @ParameterizedTest()
    @MethodSource("ParseValidGMLSurface")
    @DisplayName("Parse valid GML Surfaces correctly")
    void ParseValidGMLSurface(String xml, Surface expectedSurface) throws Exception {

        // given
        SurfaceType surface = loadFromXml(xml, SurfaceType.class);

        // do
        Surface parsed = SurfaceGmlHelper.parseGMLSurface(surface, Surface.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedSurface);

    }

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
    
}
