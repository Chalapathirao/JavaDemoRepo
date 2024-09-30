package com.chalapathi.test1;

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    Department department;

    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        University university = new University("ABC University", dept);

        System.out.println(university.name + " has a " + university.department.name + " department.");
    }
}

