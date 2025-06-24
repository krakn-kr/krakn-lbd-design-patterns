package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Decorator;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleTwo.Component.Reader;

public abstract class ReaderDecorator extends Reader {
    protected Reader reader;
    public ReaderDecorator(Reader reader) { this.reader = reader; }
    @Override
    public int read() { return reader.read(); }
    @Override
    public void close() { reader.close(); }
}