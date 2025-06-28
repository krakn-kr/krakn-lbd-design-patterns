package org.krashokkumarnaidu.designpatterns.Behavioral.Iterator;

// Client code demonstrating the pattern
public class IteratorPatternDemo {
    public static void main(String[] args) {
        // Create a book collection
        BookCollection library = new BookCollection(5);

        // Add books to the collection
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen"));

        // Create iterator and traverse the collection
        Iterator<Book> iterator = library.createIterator();

        System.out.println("Books in the library:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }

        // Demonstrate multiple iterators can work independently
        System.out.println("\nUsing a second iterator:");
        Iterator<Book> secondIterator = library.createIterator();

        // Print only first two books using second iterator
        int count = 0;
        while (secondIterator.hasNext() && count < 2) {
            System.out.println(secondIterator.next());
            count++;
        }
    }
}