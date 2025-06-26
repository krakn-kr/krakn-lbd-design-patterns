package org.krashokkumarnaidu.designpatterns.Structural.Facade;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public boolean isAvailable(){
        return stock>0;
    }
    public void reduceStock(){
        stock--;
    }
    public String getName(){
        return name;
    }
}
