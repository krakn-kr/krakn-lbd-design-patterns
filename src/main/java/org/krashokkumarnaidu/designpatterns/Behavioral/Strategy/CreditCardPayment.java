package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String holderName;
    private String cvv;

    public CreditCardPayment(String cardNumber, String holderName, String cvv) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Holder: " + holderName);
        System.out.println("Amount: INR" + amount);

        // Simulate payment processing
        try {
            Thread.sleep(1000); // Simulate processing time
            System.out.println("Credit card payment successful!");
            return true;
        } catch (InterruptedException e) {
            System.out.println("Payment failed!");
            return false;
        }
    }
    private String maskCardNumber(String cardNumber) {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}
