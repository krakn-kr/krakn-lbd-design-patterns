package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing PayPal payment...");
        System.out.println("Email: " + email);
        System.out.println("Amount: INR" + amount);

        // Simulate authentication and payment
        try {
            Thread.sleep(800);
            System.out.println("PayPal payment successful!");
            return true;
        } catch (InterruptedException e) {
            System.out.println("Payment failed!");
            return false;
        }
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}