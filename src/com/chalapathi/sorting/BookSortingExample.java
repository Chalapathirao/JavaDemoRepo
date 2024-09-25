package com.chalapathi.sorting;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    int id;
    String name;
    int pages;

    // Constructor
    public Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    // Overriding toString() for easier output display
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
// Separate comparator class that implements Comparator
class BookNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class BookPageComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPages()-o2.getPages();
    }
}


public class BookSortingExample {
    public static void main(String[] args) {
        // Creating a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Programming", 200));
        books.add(new Book(2, "Data Structures", 300));
        books.add(new Book(3, "Algorithms", 1100));
        books.add(new Book(4, "Design Patterns", 350));
        books.add(new Book(5, "Microservices", 150));
        books.add(new Book(6, "Aws", 400));
        books.add(new Book(7, "C and C++", 358));
        System.out.println(books);
//        Collections.sort(books, new BookNameComparator()); //OR
//        books.sort(new BookNameComparator());
        //OR
//        books.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
         //OR
      //  books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

      //OR
        // Sorting the books based on the name using Comparator
       // books.sort(Comparator.comparing(Book::getName));
       // books.sort(Comparator.comparing(Book::getName).reversed());
      //  books = books.stream().sorted(Comparator.comparing(Book::getName)).collect(Collectors.toList());
      //  books= books.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).toList();

      //  books.sort(new BookPageComparator());

      //  books.sort(Comparator.comparing(Book::getPages));

        // Sorting by name first, then by pages if the names are equal
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book b1, Book b2) {
//                int nameCompare = b1.getName().compareTo(b2.getName());
//                if (nameCompare == 0) {
//                    // If names are the same, compare by pages
//                    return b1.getPages()-b2.getPages();
//                } else {
//                    return nameCompare;
//                }
//            }
//        });


        // Sorting by name first, then by pages if names are equal
//        Comparator<Book> byNameThenByPages = Comparator
//                .comparing(Book::getName)
//                .thenComparing(Book::getPages);
//        Collections.sort(books, byNameThenByPages);

        books.sort(Comparator.comparing(Book::getName).thenComparing(Book::getPages));

        System.out.println("Books sorted");
        System.out.println(books);
    }
}
