
package com.aixm.delorean.aixm511.schema;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, JsonNode>
{


    public JsonNode unmarshal(String value) {
        return new JsonNode(value);
    }

    public String marshal(JsonNode value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
