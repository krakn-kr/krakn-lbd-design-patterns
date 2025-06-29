package org.krashokkumarnaidu.designpatterns.Behavioral.TemplateMethod;

// Concrete implementation for XML data processing
public class XMLProcessor extends DataProcessor {

    @Override
    protected void parseData() {
        System.out.println("Parsing XML data - building DOM tree...");
    }

    @Override
    protected void processSpecificData() {
        System.out.println("Processing XML data - traversing nodes and attributes...");
    }

    @Override
    protected void cleanup() {
        super.cleanup();
        System.out.println("XML-specific cleanup - releasing DOM resources...");
    }
}
