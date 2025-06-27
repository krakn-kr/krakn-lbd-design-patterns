package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

public class TurnOffCommand implements Command {
    private AirConditioner ac;
    public TurnOffCommand(AirConditioner ac) { this.ac = ac; }
    public void execute() { ac.turnOff(); }
    public void undo() { ac.turnOn(); }
}