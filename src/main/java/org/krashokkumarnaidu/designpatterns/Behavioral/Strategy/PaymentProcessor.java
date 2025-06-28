package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;
// Context Class
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public boolean processPayment(double amount){
        if(this.paymentStrategy == null){
            System.out.println("No payment method selected!");
            return false;
        }
        System.out.println("=== Payment Processing ===");
        System.out.println("Method: " + paymentStrategy.getPaymentMethod());
        boolean result = paymentStrategy.pay(amount);
        System.out.println("========================\n");
        return result;
    }
}
