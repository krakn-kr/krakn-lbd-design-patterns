package org.krashokkumarnaidu.designpatterns.Behavioral.TemplateMethod;
/*
https://claude.ai/chat/7f71b0a3-bafc-468d-92b7-1859928dcda1
 */
// Client code demonstrating the pattern
public class TemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== Processing CSV Data ===");
        DataProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processData();

        System.out.println("\n=== Processing JSON Data ===");
        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.processData();

        System.out.println("\n=== Processing XML Data ===");
        DataProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.processData();
    }
}
