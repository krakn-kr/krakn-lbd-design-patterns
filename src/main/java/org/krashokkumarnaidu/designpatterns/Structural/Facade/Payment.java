package org.krashokkumarnaidu.designpatterns.Structural.Facade;

public class Payment {
    public boolean processPayment(String account, double amount){
        // Simulate payment processing
        System.out.println("Processing payment of $" + amount + " for " + account);
        return true; // Assume always successful
    }
}
