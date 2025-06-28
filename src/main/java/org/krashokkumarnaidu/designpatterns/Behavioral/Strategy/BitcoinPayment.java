package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

public class BitcoinPayment implements PaymentStrategy{
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Bitcoin payment...");
        System.out.println("Wallet Address: " + walletAddress);
        System.out.println("Amount: $" + amount + " (converting to BTC...)");

        // Simulate blockchain transaction
        try {
            Thread.sleep(1500); // Bitcoin takes longer
            System.out.println("Bitcoin payment successful!");
            return true;
        } catch (InterruptedException e) {
            System.out.println("Payment failed!");
            return false;
        }
    }

    @Override
    public String getPaymentMethod() {
        return "Bitcoin";
    }
}
