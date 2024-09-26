package com.chalapathi.streams;

import java.util.*;
import java.util.stream.Collectors;

class MyBook {
    int id;
    String title;
    String author;
    int pages;

    public MyBook(int id, String title, String author, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Getters
    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "MyBook{id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", pages=" + pages + '}';
    }
}

public class SreamDistinct1 {
    public static void main(String[] args) {
        List<MyBook> books = Arrays.asList(
                new MyBook(1, "Book One", "Author A", 300),
                new MyBook(2, "Book Two", "Author B", 150),
                new MyBook(3, "Book Three", "Author A", 300), // Duplicate based on pages
                new MyBook(4, "Book Four", "Author C", 450),
                new MyBook(5, "Book Five", "Author D", 150)  // Duplicate based on pages
        );

        // Using a Set to remove duplicates based on pages
        Set<Integer> seenPages = new HashSet<>();
        List<MyBook> distinctBooks = books.stream()
                .filter(book -> seenPages.add(book.getPages())) // Retain only if pages is unique
                .collect(Collectors.toList());

        distinctBooks.forEach(System.out::println);
        System.out.println();
        //
        List<MyBook> distinctBooks1 = books.stream()
                .collect(Collectors.toMap(
                        MyBook::getPages,  // Key: pages
                        book -> book,    // Value: the book itself
                        (existing, replacement) -> existing // In case of duplicate keys, keep the first
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
        distinctBooks1.forEach(System.out::println);
    }
}

