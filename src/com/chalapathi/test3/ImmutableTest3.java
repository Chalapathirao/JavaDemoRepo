package com.chalapathi.test3;


import java.util.Collections;
import java.util.List;

final class ImmutableStudent {
    private final String name;
    private final List<String> subjects;

    public ImmutableStudent(String name, List<String> subjects) {
        this.name = name;
        // Create a defensive copy of the list to prevent external modifications
        this.subjects = List.copyOf(subjects);
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        // Return an unmodifiable view of the subjects list
        return Collections.unmodifiableList(subjects);
    }
}

public class ImmutableTest3 {
    public static void main(String[] args) {
        List<String> subjects = List.of("Math", "Science");
        ImmutableStudent student = new ImmutableStudent("Bob", subjects);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Subjects: " + student.getSubjects());

        // Attempting to modify the subjects list will throw an UnsupportedOperationException
        // student.getSubjects().add("History"); // This line would throw an exception
    }
}
