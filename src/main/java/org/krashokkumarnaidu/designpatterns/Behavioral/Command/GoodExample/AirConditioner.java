package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

// Receiver
public class AirConditioner {
    private boolean isOn = false;
    private int temperature = 24;

    public int getTemperature() {
        return temperature;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("AC temperature set to " + temperature);
    }
}
