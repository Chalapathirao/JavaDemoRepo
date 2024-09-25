package com.chalapathi.designpattern.adopter;


import org.json.JSONObject; // JSON library
import org.w3c.dom.*; // XML library
        import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

// Target interface
interface JsonData {
    JSONObject getJsonData();
}

// Adaptee (The existing XML service)
class XmlData {
    private String xml;

    public XmlData(String xml) {
        this.xml = xml;
    }

    public String getXmlData() {
        return xml;
    }
}

// Adapter to convert XML to JSON
class XmlToJsonAdapter implements JsonData {
    private XmlData xmlData;

    public XmlToJsonAdapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public JSONObject getJsonData() {
        // Convert the XML to JSON here
        String xml = xmlData.getXmlData();
        return convertXmlToJson(xml);
    }

    // Helper method to convert XML to JSON
    private JSONObject convertXmlToJson(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder()
                    .parse(new java.io.ByteArrayInputStream(xml.getBytes()));

            Map<String, String> dataMap = new HashMap<>();
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    dataMap.put(element.getTagName(), element.getTextContent());
                }
            }

            return new JSONObject(dataMap); // Return as a JSON object
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

// Client code that expects JSON data
class Client {
    public void processData(JsonData jsonData) {
        JSONObject json = jsonData.getJsonData();
        System.out.println("Client received JSON data: " + json.toString());
    }
}

// Main method to demonstrate the Adapter Pattern
public class AdapterPatternExample {
    public static void main(String[] args) {
        // Existing XML data (Adaptee)
        String xmlData = "<person><name>John Doe</name><age>30</age></person>";
        XmlData xml = new XmlData(xmlData);

        // Use the adapter to convert XML to JSON
        JsonData adapter = new XmlToJsonAdapter(xml);

        // Client expects JSON data
        Client client = new Client();
        client.processData(adapter); // Works without modifying the client
    }
}

