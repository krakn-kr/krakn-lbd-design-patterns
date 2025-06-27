package org.krashokkumarnaidu.designpatterns.Behavioral.Observer.exampleOne.WithDP;

// Observable interface
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
