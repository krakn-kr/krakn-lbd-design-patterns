package org.krashokkumarnaidu.designpatterns.Behavioral.Command.GoodExample;

import java.util.Stack;

// Invoker
public class RemoteControl {
    private Command command;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}