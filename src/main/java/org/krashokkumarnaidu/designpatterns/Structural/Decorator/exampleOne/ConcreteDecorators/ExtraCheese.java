package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.ConcreteDecorators;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.Decorator.PizzaDecorator;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.component.Pizza;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza pizza) { super(pizza); }
    public String getDescription() { return pizza.getDescription() + ", Extra Cheese"; }
    public double getCost() { return pizza.getCost() + 2.0; }
}