package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

public class ShoppingCart {
    private PaymentProcessor paymentProcessor;
    private double totalAmount;

    public ShoppingCart() {
        this.totalAmount = 0.0;
        this.paymentProcessor = new PaymentProcessor(null);
    }

    public void setPaymentMethod(PaymentStrategy paymentStrategy){
       paymentProcessor.setPaymentStrategy(paymentStrategy);
   }

    public void addItem(String item, double price){
        System.out.println("Added: " + item + " -INR" + price);
        totalAmount += price;
    }
    public void checkout(){
        System.out.println("\n=== Checkout ====");
        System.out.println("Total Amount: INR"+ totalAmount);
        if(paymentProcessor.processPayment(totalAmount)){
            System.out.println("Order completed successfully");
            totalAmount = 0.0;
        }else {
            System.out.println("Order failed. Please try again.");
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
