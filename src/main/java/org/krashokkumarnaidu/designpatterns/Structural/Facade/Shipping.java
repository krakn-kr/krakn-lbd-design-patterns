package org.krashokkumarnaidu.designpatterns.Structural.Facade;

public class Shipping {
    public void shipProduct(Product product,String address){
        System.out.println("Shipping " + product.getName() +" to " + address);
    }
}
