package com.chalapathi.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class BookPojo {
    private int id;
    private String name;
    private int pages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + pages;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookPojo other = (BookPojo) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (pages != other.pages)
            return false;
        return true;
    }

    public BookPojo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public BookPojo(int id, String name, int pages) {
        super();
        this.id = id;
        this.name = name;
        this.pages = pages;
    }
}

class MyComparator implements Comparator<BookPojo> {
    @Override
    public int compare(BookPojo o1, BookPojo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class BookDAO {
    public List<BookPojo> getBooks() {
        List<BookPojo> books = new ArrayList<>();
        books.add(new BookPojo(101, "Core Java", 400));
        books.add(new BookPojo(363, "Hibernate", 180));
        books.add(new BookPojo(275, "Spring", 200));
        books.add(new BookPojo(893, "WebService", 300));
        return books;
    }
}

public class BookService {
    public static void main(String[] args) {
        List<BookPojo> books = new BookDAO().getBooks();
        books.sort(new MyComparator());
        books.forEach(System.out::println);
        System.out.println();
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(books, Comparator.comparing(BookPojo::getName));
        System.out.println();
    }
}



