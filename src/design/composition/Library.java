package design.composition;

import java.util.List;

/**
 * Library class contains list of books
 */
public class Library {

    private String name;
    private final List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public List<Book> getAllBooks() {
        return this.books;
    }
}
