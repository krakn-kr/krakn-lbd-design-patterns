package org.krashokkumarnaidu.designpatterns.SOLID.S.ImprovedExample;

public class TextPrinter {
    private TextManipulator textManipulator;
    public TextPrinter(TextManipulator textManipulator) { this.textManipulator = textManipulator; }
    public void printText() { System.out.println(textManipulator.getText()); }
}

