package org.example.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

record Book(String title, String author, int year, boolean availability) {}

class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public Optional<Boolean> isBookAvailable(String title) {
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .map(Book::availability);
    }

    public Optional<Book> firstByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.availability())
                .findFirst();
    }

    public void updateAvailability(String title, boolean availability) {
        books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(book -> book.availability = availability);
    }
}

public class LibraryCatalogSystem {
    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog(List.of(
                new Book("The Silent Patient", "Alex Michaelides", 2019, true),
                new Book("The Soul of a Butterfly", "Muhammad Ali", 2003, true),
                new Book("Death on the Nile", "Agatha Christie", 1937, false)
        ));

        Optional<Boolean> availability = libraryCatalog.isBookAvailable("The Silent Patient");
        availability.ifPresent(isAvailable -> System.out.println("Is 'The Silent Patient' available? " + isAvailable));

        Optional<Book> availableBookByAuthor = libraryCatalog.firstByAuthor("Alex Michaelides");
        availableBookByAuthor.ifPresent(book -> System.out.println("First available book by Alex Michaelides: " + book.title()));


        libraryCatalog.updateAvailability("The Soul of a Butterfly", true);


        Optional<Boolean> updatedAvailability = libraryCatalog.isBookAvailable("The Soul of a Butterfly");
        updatedAvailability.ifPresent(isAvailable -> System.out.println("Is 'The Soul of a Butterfly' available after update? " + isAvailable));
    }
}
