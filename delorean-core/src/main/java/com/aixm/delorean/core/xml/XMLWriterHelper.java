package com.aixm.delorean.core.xml;

import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;

import java.util.BitSet;

import javax.xml.namespace.NamespaceContext;

public class XMLWriterHelper implements XMLStreamWriter {
    private final XMLStreamWriter base;
	private boolean isNoFirstElement = false;
	private int indent = 0;
    private BitSet withSubElementSet = new BitSet();

    public XMLWriterHelper(XMLStreamWriter base) {
        this.base = base;
    }

    private void indentStartElement() throws XMLStreamException {
		if(indent > 0) {
			withSubElementSet.set(indent - 1);
		}
		withSubElementSet.clear(indent);
		if(isNoFirstElement) {
			ident();
		} else {
			isNoFirstElement = true;
		}
		indent++;
	}

    private void indentEndElement() throws XMLStreamException {
		indent--;
		if(withSubElementSet.get(indent)) {
			ident();
		}
	}
	
	private void ident() throws XMLStreamException {
		int len = 1 + 2 * indent;
		char[] chars = new char[len];
		chars[0] = '\n';

		for (int i = 1; i < len; i++) {
			chars[i] = ' ';
		}
		base.writeCharacters(chars, 0, len);
	}


    // Intercept writeCharacters to suppress null or empty strings
    @Override
    public void writeCharacters(String text) throws XMLStreamException {
        // hack for elements marked xsi:nil="true"
        if (text != null && !text.trim().isEmpty()) {
            base.writeCharacters(text);
        }
    }

    // Intercept writeCharacters to suppress empty char[]
    @Override
    public void writeCharacters(char[] text, int start, int len) throws XMLStreamException {
        // hack for elements marked xsi:nil="true"
        String content = new String(text, start, len);
        if (!content.trim().isEmpty()) {
            base.writeCharacters(content);
        }
    }

    // Intercept writeCData to suppress null or empty strings
    @Override
    public void writeCData(String data) throws XMLStreamException {
        if (data != null && !data.trim().isEmpty()) {
            base.writeCData(data);
        }
    }

    //All other methods must be implemented 
    @Override
    public void writeStartElement(String localName) throws XMLStreamException {
        indentStartElement();
        base.writeStartElement(localName);
    } 
    
    @Override
    public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {
        indentStartElement();
        base.writeStartElement(namespaceURI, localName);
    }

    @Override
    public void writeStartElement(String prefix, String namespaceURI, String localName) throws XMLStreamException {
        indentStartElement();
        base.writeStartElement(prefix, namespaceURI, localName);
    }

    @Override
    public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {
        base.writeEmptyElement(namespaceURI, localName);
    }

    @Override
    public void writeEmptyElement(String prefix, String namespaceURI, String localName) throws XMLStreamException {
        base.writeEmptyElement(prefix, namespaceURI, localName);
    }

    @Override
    public void writeEmptyElement(String localName) throws XMLStreamException {
        base.writeEmptyElement(localName);
    }

    @Override
	public void writeEndElement() throws XMLStreamException {
		indentEndElement();
		base.writeEndElement();
	}

    @Override
    public void writeAttribute(String localName, String value) throws XMLStreamException {
        base.writeAttribute(localName, value);
    }

    @Override
    public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {
        base.writeAttribute(namespaceURI, localName, value);
    }

    @Override
    public void writeAttribute(String prefix, String namespaceURI, String localName, String value) throws XMLStreamException {
        base.writeAttribute(prefix, namespaceURI, localName, value);
    }

    @Override
    public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {
        base.writeNamespace(prefix, namespaceURI);
    }

    @Override
    public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {
        base.writeDefaultNamespace(namespaceURI);
    }
    
    @Override
    public void setPrefix(String prefix, String namespaceURI) throws XMLStreamException {
        base.setPrefix(prefix, namespaceURI);
    }

    @Override
    public void setDefaultNamespace(String namespaceURI) throws XMLStreamException {
        base.setDefaultNamespace(namespaceURI);
    }

    @Override
    public String getPrefix(String namespaceURI) throws XMLStreamException {
        return base.getPrefix(namespaceURI);
    }

    @Override
    public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {
        base.setNamespaceContext(context);
    }

    @Override
    public NamespaceContext getNamespaceContext() {
        return base.getNamespaceContext();
    }

    @Override
    public void writeStartDocument() throws XMLStreamException {
        base.writeStartDocument();
    }

    @Override
    public void writeStartDocument(String version) throws XMLStreamException {
        base.writeStartDocument(version);
    }

    @Override
    public void writeStartDocument(String encoding, String version) throws XMLStreamException {
        base.writeStartDocument(encoding, version);
    }

    @Override
    public void writeEndDocument() throws XMLStreamException {
        base.writeEndDocument();
    }

    @Override
    public void writeComment(String data) throws XMLStreamException {
        base.writeComment(data);
    }

    @Override
    public void writeProcessingInstruction(String target) throws XMLStreamException {
        base.writeProcessingInstruction(target);
    }

    @Override
    public void writeProcessingInstruction(String target, String data) throws XMLStreamException {
        base.writeProcessingInstruction(target, data);
    }

    @Override
    public void writeDTD(String dtd) throws XMLStreamException {
        base.writeDTD(dtd);
    }

    @Override
    public void writeEntityRef(String name) throws XMLStreamException {
        base.writeEntityRef(name);
    }

    @Override
    public Object getProperty(String name) throws IllegalArgumentException {
        return base.getProperty(name);
    }

    @Override
    public void flush() throws XMLStreamException {
        base.flush();
    }

    @Override
    public void close() throws XMLStreamException {
        base.close();
    }
}
