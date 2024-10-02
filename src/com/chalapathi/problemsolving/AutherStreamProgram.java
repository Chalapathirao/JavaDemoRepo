package com.chalapathi.problemsolving;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Author {
    private String surname;
    private int age;

    public Author(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

public class AutherStreamProgram {
    public static void main(String[] args) {
        // Stream api problem
//    get any 15 authors with unique surname in uppercase and age above 50(Provided Author class with some fields)
        List<Author> authors = Arrays.asList(
                new Author("Smith", 45),
                new Author("Doe", 52),
                new Author("White", 55),
                new Author("Black", 60),
                new Author("Grey", 70),
                new Author("Grey", 90)
                // Assume more authors added here...
        );
        stream1(authors);
        System.out.println();
        stream2(authors);

        System.out.println("Hello".substring(1));

    }

    private static void stream1(List<Author> authors) {
        authors.stream().filter(a -> a.getAge() > 50).map(a -> a.getSurname().toUpperCase()).distinct().toList().forEach(System.out::println);
    }

    private static void stream2(List<Author> authors) {
        List<String> selectedAuthors = authors.stream()
                // First, filter authors above the age of 50
                .filter(author -> author.getAge() > 50)
                // Collect to map to ensure uniqueness of surname
                .collect(Collectors.toMap(
                        Author::getSurname,
                        Function.identity(),
                        (existing, replacement) -> existing,   // In case of a key clash, keep the existing
                        LinkedHashMap::new))                  // Maintains the order of insertion
                .values().stream()                        // Stream the values of the map (unique authors)
                // Convert each unique surname to UpperCase
                .map(author -> author.getSurname().toUpperCase())
                // Arbitrarily limit to 15 entries
                .limit(15)
                // Collect results into a list
                .toList();

        selectedAuthors.forEach(System.out::println);
    }
}
