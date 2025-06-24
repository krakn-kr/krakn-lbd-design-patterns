package org.krashokkumarnaidu.designpatterns.SOLID.I.ImprovedExample;

public class Human implements Workable, Eatable {
    public void work() { System.out.println("Human working"); }
    public void eat() { System.out.println("Human eating"); }
}