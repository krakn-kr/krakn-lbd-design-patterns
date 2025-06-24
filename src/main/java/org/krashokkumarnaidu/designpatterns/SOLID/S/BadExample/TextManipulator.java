package org.krashokkumarnaidu.designpatterns.SOLID.S.BadExample;

public class TextManipulator {
    private String text;
    public TextManipulator(String text) { this.text = text; }
    public void appendText(String newText) { text = text.concat(newText); }
    public void printText() { System.out.println(text); } // Printing responsibility here is a violation
}
