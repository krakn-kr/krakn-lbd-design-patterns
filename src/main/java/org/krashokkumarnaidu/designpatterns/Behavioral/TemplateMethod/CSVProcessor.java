package org.krashokkumarnaidu.designpatterns.Behavioral.TemplateMethod;

// Concrete implementation for CSV data processing
public class CSVProcessor extends DataProcessor {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data - splitting by commas...");
    }

    @Override
    protected void processSpecificData() {
        System.out.println("Processing CSV data - converting to objects...");
    }

    @Override
    protected boolean isValidData() {
        System.out.println("Validating CSV format - checking headers and delimiters...");
        return true;
    }
}
