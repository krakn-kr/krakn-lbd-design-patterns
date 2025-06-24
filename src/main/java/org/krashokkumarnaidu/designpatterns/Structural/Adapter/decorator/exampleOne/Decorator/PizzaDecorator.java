package org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.Decorator;

import org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.component.Pizza;

// Decorator
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) { this.pizza = pizza; }
    public String getDescription() { return pizza.getDescription(); }
    public double getCost() { return pizza.getCost(); }
}