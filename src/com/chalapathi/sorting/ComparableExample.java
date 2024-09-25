package com.chalapathi.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book1 implements Comparable<Book1> {
    int id;
    String name;
    int pages;

    // Constructor
    public Book1(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

//    // Implementing compareTo method to sort by id
//    @Override
//    public int compareTo(Book1 other) {
//        return Integer.compare(this.id, other.id);
//    }

    // Implementing compareTo method to sort by Name
    @Override
    public int compareTo(Book1 other) {
        return this.name.compareTo(other.name);
    }

    // Overriding toString() for output display
    @Override
    public String toString() {
        return "Book1{id=" + id + ", name='" + name + "', pages=" + pages + "}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Book1> books = new ArrayList<>();
        books.add(new Book1(3, "Java Programming", 400));
        books.add(new Book1(1, "Data Structures", 300));
        books.add(new Book1(2, "Algorithms", 500));

        // Sorting using Comparable (based on id)
        Collections.sort(books);
        System.out.println(books);
        System.out.println("Books sorted by id using Comparable:");
        for (Book1 book : books) {
            System.out.println(book);
        }
    }
}

