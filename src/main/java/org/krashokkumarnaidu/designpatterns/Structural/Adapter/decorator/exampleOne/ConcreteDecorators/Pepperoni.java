package org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.ConcreteDecorators;

import org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.Decorator.PizzaDecorator;
import org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.component.Pizza;

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) { super(pizza); }
    public String getDescription() { return pizza.getDescription() + ", Pepperoni"; }
    public double getCost() { return pizza.getCost() + 3.0; }
}
