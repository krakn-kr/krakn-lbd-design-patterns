package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleOne;
//Step 3: Implement the Adapter

public class XMLToJSONAdapter implements JSONProvider {
    private XMLProvider xmlProvider;

    public XMLToJSONAdapter(XMLProvider xmlProvider) {
        this.xmlProvider = xmlProvider;
    }

    @Override
    public String provideJSON() {
        String xmlData = xmlProvider.provideXML();
        // Simulate conversion logic
        String jsonData = "{\"data\":\"Hello, world!\"}";
        return jsonData;
    }
}
