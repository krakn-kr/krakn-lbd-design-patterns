package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleOne.WithoutDP;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private boolean inStock;
    private List<String> notifyList = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }

    public void addNotifyUser(String user) {
        notifyList.add(user);
    }

    public void setInStock(boolean status) {
        this.inStock = status;
        if (inStock) {
            for (String user : notifyList) {
                System.out.println("Notifying " + user + ": " + name + " is now in stock!");
            }
            notifyList.clear();
        }
    }
}

class Main{
    public static void main(String[] args) {
        // Usage
        Product iphone = new Product("iPhone");
        iphone.addNotifyUser("Alice");
        iphone.addNotifyUser("Bob");
        iphone.setInStock(true);
    }
}
