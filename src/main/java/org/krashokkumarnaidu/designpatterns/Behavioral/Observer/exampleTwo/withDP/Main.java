package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleTwo.withDP;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(int temperature);
}

// Observable interface
interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// WeatherStation as Observable
class WeatherStation implements Observable {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}

// Concrete Observers
class TVDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("TV Display: Temperature is " + temperature);
    }
}

class MobileDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Mobile Display: Temperature is " + temperature);
    }
}

// Usage
public class Main{
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.addObserver(new TVDisplay());
        ws.addObserver(new MobileDisplay());
        ws.setTemperature(30);

    }
}
