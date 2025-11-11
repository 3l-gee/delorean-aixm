package com.aixm.delorean.core.container;

import java.io.FileInputStream;
import java.io.InputStream;

import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.xml.XMLBinding;
import com.aixm.delorean.core.xml.XMLConfig;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class Aixm5_1_1Container extends AbstractContainer<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType> {

    public Aixm5_1_1Container() {
        super(com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType.class);
    }

    public void setXmlBinding(XMLConfig xmlConfig) {
        this.xmlBinding = new XMLBinding<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType>(xmlConfig, com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType.class);
    }

    public void setDatabaseBinding(DatabaseConfig databaseConfig) {
        this.databaseBinding = new DatabaseBinding<
            com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType>(databaseConfig, com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class, com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType.class);
    }

    @Override
    public void unmarshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        this.message = this.unmarshal(this.xmlBinding.getUnmarshaller(), path);
    }

    public static com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType unmarshal(Unmarshaller unmarshal, String path) {
        try (InputStream xmlStream = new FileInputStream(path)) {
            Object unmarshalledObject = unmarshal.unmarshal(xmlStream);

            if (unmarshalledObject instanceof JAXBElement<?>) {
                JAXBElement<?> rootElement = (JAXBElement<?>) unmarshalledObject;

                if (com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class.isInstance(rootElement.getValue())) {
                    JAXBElement<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType> aixm5_1_1Element = (JAXBElement<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType>) rootElement;
                    ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled <" + aixm5_1_1Element.getDeclaredType().getName() + "> / : " + aixm5_1_1Element.getValue().getHasMember().size() + " members");
                    return (com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType) rootElement.getValue();

                } else {
                    ConsoleLogger.log(LogLevel.ERROR, "Expected <" + clazz.getName() + "> but got <" + rootElement.getValue().getClass().getName() + ">");
                }
            } else {
                ConsoleLogger.log(LogLevel.ERROR, "Unsuccessfully unmarshalled :" + unmarshalledObject.getClass().getName());
            }

        } catch (JAXBException e) {
            ConsoleLogger.log(LogLevel.ERROR, "JAXB exception during unmarshalling");
            e.printStackTrace();

        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "General exception during unmarshalling");
            e.printStackTrace();
        }

        return null;
    }

}
