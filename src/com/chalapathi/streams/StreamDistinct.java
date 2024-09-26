package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
    // Constructor and getters/setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages;
    }

    @Override
    public int hashCode() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}

public class StreamDistinct {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 100),
                new Book("Book B", 200),
                new Book("Book C", 100),
                new Book("Book D", 300),
                new Book("Book E", 200)
        );

        // Remove duplicates based on the number of pages
        Map<Integer, Book> uniqueBooksByPages = books.stream()
                .collect(Collectors.toMap(Book::getPages, book -> book, (book1, book2) -> book1));

        // Convert the map back to a list
        List<Book> uniqueBooks = uniqueBooksByPages.values().stream().toList();

        // Print the unique books
       uniqueBooks.forEach(System.out::println);

    }
}




