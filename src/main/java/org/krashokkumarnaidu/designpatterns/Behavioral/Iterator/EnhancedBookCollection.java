package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;

// Enhanced BookCollection with multiple iterator types
public class EnhancedBookCollection extends BookCollection {

    public EnhancedBookCollection(int size) {
        super(size);
    }

    public Iterator<Book> createReverseIterator() {
        return new ReverseBookIterator(super.getBooks());
    }
}
