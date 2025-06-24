package org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.concreteComponent;

import org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne.component.Pizza;

// Concrete Component
public class BasicPizza implements Pizza {
    public String getDescription() { return "Plain Pizza"; }
    public double getCost() { return 5.0; }
}
