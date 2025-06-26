package org.krashokkumarnaidu.designpatterns.Structural.composite.exampleTwo;
//leaf
public class Number implements ArithmeticExpression {
    private int val;

    public Number(int val) {
        this.val = val;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is :"+ this.val);
        return this.val;
    }
}
