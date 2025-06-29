package org.krashokkumarnaidu.designpatterns.Behavioral.TemplateMethod;

// Concrete implementation for JSON data processing
public class JSONProcessor extends DataProcessor {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data - building object tree...");
    }

    @Override
    protected void processSpecificData() {
        System.out.println("Processing JSON data - extracting nested values...");
    }

    @Override
    protected boolean isValidData() {
        System.out.println("Validating JSON format - checking syntax and structure...");
        return true;
    }

    @Override
    protected void cleanup() {
        super.cleanup();
        System.out.println("JSON-specific cleanup - clearing object cache...");
    }
}