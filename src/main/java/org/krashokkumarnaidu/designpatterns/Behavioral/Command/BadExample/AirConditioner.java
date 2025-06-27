package org.krashokkumarnaidu.designpatterns.Behavioral.Command.BadExample;

// Receiver
public class AirConditioner {
    private boolean isOn = false;
    private int temperature = 24;

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

// Client
class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.setTemperature(22);
        ac.turnOff();
    }
}
