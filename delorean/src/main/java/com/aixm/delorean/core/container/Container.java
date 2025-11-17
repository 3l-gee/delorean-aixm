package com.aixm.delorean.core.container;

import com.aixm.delorean.core.xml.XMLBinding;
import com.aixm.delorean.core.xml.XMLConfig;
import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.qgis.QgisProjectBinding;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.xml.namespace.QName;

import org.hibernate.Session;

public class Container<T, X> {
    private final QName qName;
    private final Class<T> root;
    private final Class<X> feature;
    private T message;
    private MessageType messageType;
    public XMLBinding<T, X> xmlBinding;
    public DatabaseBinding<T, X> databaseBinding;
    private QgisProjectBinding publisherPRJ;
    private QgisProjectBinding editorPRJ;
    

    public Container(Class<T> rootClass, Class<X> featureClass, QName qName) {
        this.root = rootClass;
        this.feature = featureClass;
        this.qName = qName;
    }

    public T getMessage() {
        return this.message;
    }   

    public Class<?> getRoot() {
        return this.root;
    }

    public void setXmlBinding(XMLConfig xmlConfig) {
        this.xmlBinding = new XMLBinding<T, X>(xmlConfig, this.root, this.feature);
    }

    public XMLBinding<T, X> getXmlBinding() {
        return this.xmlBinding;
    }

    public void setDatabaseBinding(DatabaseConfig databaseConfig) {
        this.databaseBinding = new DatabaseBinding<T, X>(databaseConfig, this.root, this.feature);
    }

    public DatabaseBinding<T, X> getDatabaseBinding() {
        return this.databaseBinding;
    }

    public void setPublisherProject(QgisProjectBinding binding) {
        this.publisherPRJ = binding;
    }

    public QgisProjectBinding getPublisherProject() {
        return this.publisherPRJ;
    }

    public void setEditorProject(QgisProjectBinding binding) {
        this.editorPRJ = binding;
    }

    public QgisProjectBinding getEditorProject() {
        return this.editorPRJ;
    }

    public void unmarshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        this.message = (T) this.xmlBinding.unmarshal(path);
    }

    public void marshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        this.xmlBinding.marshal(this.message, path, this.root, this.qName);
    }

    public void startDatabaseConnection() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.startup();
    }

    public void shutdownDatabaseConnection() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.shutdown();
    }

    public void show() {
        recursiveShow(this.message.getClass(), this.message); 
    }

    public void persist() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.persist(this.message);
        
        // if (this.getEditorProject() != null) {
        // }

        // if (this.getPublisherProject() != null) {
        //     Session session = this.databaseBinding.getSession();
        //     String userName = this.databaseBinding.getUserName();
        //     this.publisherPRJ.loadProject(session, userName);
        //     ConsoleLogger.log(LogLevel.INFO, "AIXM and project successfully loaded");
        // } else {
        //     ConsoleLogger.log(LogLevel.INFO, "AIXM successfully loaded");
        // }
    }

    public void extract(Object id) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        this.message = (T) this.databaseBinding.extract(this.root, id);
    }

    public void initQGIS(){
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }

        this.publisherPRJ.init(databaseBinding);
        ConsoleLogger.log(LogLevel.INFO, "QGIS project successfully initialized.");
    }

    //TODO this should be cleaned up in untility function or deleted
    private void recursiveShow(Class<?> clazz, Object instance) {
        System.out.println("Class: " + clazz.getName());
        displayFields(clazz, instance);
        displayMethods(clazz);
        displaySuperClass(clazz, instance);
        displayInterfaces(clazz);
    }

    private void displayFields(Class<?> clazz, Object instance) {
        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            try {
                Object value = field.get(instance);
                System.out.println(" - " + field.getName() + " : " + field.getType().getName() + " = " + value);
            } catch (IllegalAccessException e) {
                System.err.println(" - Error accessing field: " + field.getName());
            }
        }
    }

    private void displayMethods(Class<?> clazz) {
        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(" - " + method.getName() + "(");
            
            // Print parameter types
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            
            System.out.print(") : " + method.getReturnType().getName());
            System.out.println();
        }
    }

    private void displaySuperClass(Class<?> clazz, Object instance) {
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            System.out.println("\nSuperclass:");
            recursiveShow(superClass, instance);
        }
    }

    private void displayInterfaces(Class<?> clazz) {
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.println("\nInterfaces:");
            for (Class<?> iface : interfaces) {
                System.out.println(" - " + iface.getName());
            }
        }
    }

    // public List<?> getDbLoadReady() {
    //     AIXMBasicMessageType test = (AIXMBasicMessageType) this.record;
    //     List<BasicMessageMemberAIXMPropertyType> list = test.getHasMember();
    //     List<T> res = new ArrayList<>();

    //     for (BasicMessageMemberAIXMPropertyType item : list) {
    //         // Safely cast item.getAbstractAIXMFeature().getValue() to T
    //         T value = null;
    //         try {
    //             value = structure.cast(item.getAbstractAIXMFeature().getValue());
    //         } catch (ClassCastException e) {
    //             throw new IllegalStateException("Item value cannot be cast to type T", e);
    //         }

    //         res.add(value);
    //     }

    //     return res;
    // }
}
