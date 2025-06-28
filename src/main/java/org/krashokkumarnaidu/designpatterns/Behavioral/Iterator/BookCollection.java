package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;

// Concrete Aggregate - BookCollection
public class BookCollection implements IterableCollection<Book> {
    private Book[] books;
    private int index = 0;

    public Book[] getBooks() {
        return books;
    }

    public BookCollection(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books.length) {
            books[index++] = book;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
