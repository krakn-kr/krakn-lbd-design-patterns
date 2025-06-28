package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;

// Aggregate interface
public interface IterableCollection<T> {
    Iterator<T> createIterator();
}