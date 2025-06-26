package org.krashokkumarnaidu.designpatterns.Structural.composite.exampleTwo;

public class Main {
    public static void main(String[] args) {
//        2*(4+7)
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression four = new Number(4);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression addExpression = new Expression(four,seven,Operation.ADD);
        ArithmeticExpression finalExpression = new Expression(two,addExpression,Operation.MULTIPLY);
        int result = finalExpression.evaluate();
        System.out.println("Expression result is: "+result);
    }
}
