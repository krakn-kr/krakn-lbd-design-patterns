package org.krashokkumarnaidu.designpatterns.SOLID.D.ImprovedExample;

public class Switch {
    private Switchable device;
    public Switch(Switchable device) { this.device = device; }
    public void operate() { device.turnOn(); }
}