package org.krashokkumarnaidu.designpatterns.Structural.Facade;

public class Inventory {
    public boolean checkStock(Product product){
        return product.isAvailable();
    }
    public void updateStock(Product product){
        product.reduceStock();
    }
}
