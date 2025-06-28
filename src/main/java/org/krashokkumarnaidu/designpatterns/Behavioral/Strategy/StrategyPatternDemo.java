package org.krashokkumarnaidu.designpatterns.Behavioral.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to cart
        cart.addItem("Laptop", 999.99);
        cart.addItem("Mouse", 25.50);
        cart.addItem("Keyboard", 75.00);
        // Scenario 1: Pay with Credit Card
        System.out.println("\n--- Scenario 1: Credit Card Payment ---");
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "John Doe", "123");
        cart.setPaymentMethod(creditCard);
        cart.checkout();
        // Add more items for next scenario
        cart.addItem("Monitor", 299.99);
        cart.addItem("Speakers", 49.99);

        // Scenario 2: Pay with PayPal
        System.out.println("--- Scenario 2: PayPal Payment ---");
        PaymentStrategy paypal = new PayPalPayment("john.doe@email.com", "securepassword");
        cart.setPaymentMethod(paypal);

        // Add items for Bitcoin payment
        cart.addItem("Graphics Card", 599.99);

        // Scenario 3: Pay with Bitcoin
        System.out.println("--- Scenario 3: Bitcoin Payment ---");
        PaymentStrategy bitcoin = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        cart.setPaymentMethod(bitcoin);
        cart.checkout();

        // Scenario 4: Demonstrate runtime strategy change
        System.out.println("--- Scenario 4: Runtime Strategy Change ---");
        cart.addItem("Headphones", 149.99);

        // Start with one payment method
        cart.setPaymentMethod(new CreditCardPayment("9876543210987654", "Jane Smith", "456"));
        System.out.println("Initially selected: Credit Card");

        // Change payment method before checkout
        cart.setPaymentMethod(new PayPalPayment("jane.smith@email.com", "anotherpassword"));
        System.out.println("Changed to: PayPal");

        cart.checkout();
    }
}
