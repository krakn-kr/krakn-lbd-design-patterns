package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleOne.WithDP;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {
    private String name;
    private boolean inStock;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setInStock(boolean status) {
        this.inStock = status;
        if (inStock) {
            notifyObservers();
        }
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(name);
        }
        observers.clear();
    }
}
