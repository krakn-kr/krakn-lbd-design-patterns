package org.krashokkumarnaidu.designpatterns.SOLID.L.BadExample;

public class Penguin extends Bird {
    @Override
    public void fly() { throw new UnsupportedOperationException("Penguins can't fly"); }
}
