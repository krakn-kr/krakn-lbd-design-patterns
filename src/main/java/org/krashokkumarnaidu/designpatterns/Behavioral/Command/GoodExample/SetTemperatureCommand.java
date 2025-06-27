package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

public class SetTemperatureCommand implements Command {
    private AirConditioner ac;
    private int prevTemp;
    private int newTemp;

    public SetTemperatureCommand(AirConditioner ac, int temp) {
        this.ac = ac;
        this.newTemp = temp;
    }

    public void execute() {
        prevTemp = ac.getTemperature();
        ac.setTemperature(newTemp);
    }

    public void undo() {
        ac.setTemperature(prevTemp);
    }
}
