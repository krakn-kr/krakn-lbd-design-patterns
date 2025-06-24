package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteDecorator;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Component.Reader;

public class LineNumberReader extends BufferedReader {
    private int lineNumber = 0;
    public LineNumberReader(Reader reader) { super(reader); }
    @Override
    public String readLine() {
        lineNumber++;
        System.out.println("Reading line number: " + lineNumber);
        return super.readLine();
    }
    public int getLineNumber() { return lineNumber; }
}