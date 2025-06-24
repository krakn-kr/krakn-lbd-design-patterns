package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteDecorator;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Component.Reader;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Decorator.ReaderDecorator;

// Concrete Decorator: BufferedReader
public class BufferedReader extends ReaderDecorator {
    public BufferedReader(Reader reader) { super(reader); }
    @Override
    public int read() {
        System.out.println("Buffering read...");
        return super.read();
    }
    public String readLine() {
        System.out.println("Reading a line with buffering...");
        return "line";
    }
}