package org.krashokkumarnaidu.designpatterns.Structural.Adapter.decorator.exampleOne;

interface Pizza {
    String getDescription();
    double getCost();
}

// Only Plain Pizza
 class PlainPizza implements Pizza {
    public String getDescription() { return "Plain Pizza"; }
    public double getCost() { return 5.0; }
}

// Plain Pizza + Cheese
 class CheesePizza extends PlainPizza {
    public String getDescription() { return super.getDescription() + ", Extra Cheese"; }
    public double getCost() { return super.getCost() + 2.0; }
}

// Plain Pizza + Pepperoni
 class PepperoniPizza extends PlainPizza {
    public String getDescription() { return super.getDescription() + ", Pepperoni"; }
    public double getCost() { return super.getCost() + 3.0; }
}

// Plain Pizza + Cheese + Pepperoni
 class CheesePepperoniPizza extends PlainPizza {
    public String getDescription() { return super.getDescription() + ", Extra Cheese, Pepperoni"; }
    public double getCost() { return super.getCost() + 2.0 + 3.0; }
}

class Test {
    public static void main(String[] args) {
        Pizza pizza1 = new PlainPizza();
        System.out.println(pizza1.getDescription() + " - $" + pizza1.getCost());

        Pizza pizza2 = new CheesePepperoniPizza();
        System.out.println(pizza2.getDescription() + " - $" + pizza2.getCost());
    }
}
