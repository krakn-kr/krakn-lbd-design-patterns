package org.krashokkumarnaidu.designpatterns.Structural.Facade;

public class OrderFacade {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private Shipping shipping = new Shipping();

    public void orderProduct(Product product, String account, double amount, String address) {
        if (!inventory.checkStock(product)) {
            System.out.println("Product is out of stock.");
            return;
        }
        if (!payment.processPayment(account, amount)) {
            System.out.println("Payment failed.");
            return;
        }
        inventory.updateStock(product);
        shipping.shipProduct(product, address);
        System.out.println("Order placed successfully!");
    }
}
