package org.krashokkumarnaidu.designpatterns.SOLID.D.BadExample;

public class Switch {
    private LightBulb bulb;
    public Switch(LightBulb bulb) { this.bulb = bulb; }
    public void operate() { bulb.turnOn(); }
}