package org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.Main;

import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.ConcreteDecorators.ExtraCheese;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.ConcreteDecorators.Pepperoni;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.component.Pizza;
import org.krashokkumarnaidu.designpatterns.Structural.Decorator.exampleOne.concreteComponent.BasicPizza;
/*
https://www.perplexity.ai/search/decorator-design-pattern-with-ROiTm41JT8OUGFfbYxv.5w
 */
// Usage
public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription() + " - $" + basicPizza.getCost());

        Pizza deluxePizza = new ExtraCheese(new Pepperoni(new BasicPizza()));
        System.out.println(deluxePizza.getDescription() + " - $" + deluxePizza.getCost());
    }
}