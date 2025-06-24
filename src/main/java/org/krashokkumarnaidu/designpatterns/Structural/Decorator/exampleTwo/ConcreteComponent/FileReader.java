package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteComponent;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Component.Reader;

// Concrete Component
public class FileReader extends Reader {
    private String fileName;
    public FileReader(String fileName) { this.fileName = fileName; }
    @Override
    public int read() {
        System.out.println("Reading from file: " + fileName);
        return 0; // Simulate reading
    }
    @Override
    public void close() {
        System.out.println("Closing file: " + fileName);
    }
}


