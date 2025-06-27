package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

// Concrete Commands
public class TurnOnCommand implements Command {
    private AirConditioner ac;
    public TurnOnCommand(AirConditioner ac) { this.ac = ac; }
    public void execute() { ac.turnOn(); }
    public void undo() { ac.turnOff(); }
}
