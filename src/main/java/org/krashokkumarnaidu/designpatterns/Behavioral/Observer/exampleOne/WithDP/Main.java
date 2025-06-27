package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleOne.WithDP;

public class Main {
    public static void main(String[] args) {
        // Usage
        Product iphone = new Product("iPhone");
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");
        iphone.addObserver(alice);
        iphone.addObserver(bob);
        iphone.setInStock(true);
    }
}
