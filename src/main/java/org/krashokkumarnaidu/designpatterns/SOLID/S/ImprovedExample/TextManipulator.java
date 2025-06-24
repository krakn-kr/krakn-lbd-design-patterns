package org.krashokkumarnaidu.designpatterns.SOLID.S.ImprovedExample;

public class TextManipulator {
    private String text;
    public TextManipulator(String text) { this.text = text; }
    public void appendText(String newText) { text = text.concat(newText); }
    public String getText() { return text; }
}