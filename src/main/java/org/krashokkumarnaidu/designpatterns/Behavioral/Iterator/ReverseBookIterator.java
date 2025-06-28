package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;

// Alternative implementation with reverse iterator
public class ReverseBookIterator implements Iterator<Book> {
    private Book[] books;
    private int position;

    public ReverseBookIterator(Book[] books) {
        this.books = books;
        // Start from the last non-null element
        this.position = books.length - 1;
        while (position >= 0 && books[position] == null) {
            position--;
        }
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books[position--];
        }
        return null;
    }
}

