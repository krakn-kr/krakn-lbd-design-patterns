package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;
// Concrete Iterator for BookCollection
public class BookIterator implements Iterator<Book> {
    private Book[] books;
    private int position = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books[position++];
        }
        return null;
    }
}