package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Main;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Component.Reader;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteComponent.FileReader;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteDecorator.BufferedReader;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.ConcreteDecorator.LineNumberReader;

public class Demo {
    public static void main(String[] args) {
        Reader fileReader = new FileReader("demo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);

        lineNumberReader.read();        // Output: Buffering read... Reading from file: demo.txt
        lineNumberReader.readLine();    // Output: Reading line number: 1 Reading a line with buffering...
        lineNumberReader.close();       // Output: Closing file: demo.txt
    }
    }