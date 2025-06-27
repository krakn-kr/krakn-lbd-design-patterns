package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleOne.WithDP;

// Concrete Observer (Customer)
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String productName) {
        System.out.println("Notifying " + name + ": " + productName + " is now in stock!");
    }
}