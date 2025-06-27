package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

// Client
public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();

        Command turnOn = new TurnOnCommand(ac);
        Command setTemp = new SetTemperatureCommand(ac, 22);
        Command turnOff = new TurnOffCommand(ac);

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(setTemp);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();

        // Undo last command (turn off)
        remote.pressUndo();

        // Undo previous command (set temperature)
        remote.pressUndo();
    }
}