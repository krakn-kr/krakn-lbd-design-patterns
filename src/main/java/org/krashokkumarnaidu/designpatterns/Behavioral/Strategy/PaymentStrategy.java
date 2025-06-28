package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

//Strategy class
public interface PaymentStrategy {
    boolean pay(double amount);
    String getPaymentMethod();
}
