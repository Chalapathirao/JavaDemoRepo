package com.chalapathi.problemsolving;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;

    // Constructor
    public Employee1(String firstname, String lastname, int age, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployListSortByMultipleProperties {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", "Doe", 30, 80000));
        employees.add(new Employee1("John", "Smith", 25, 75000));
        employees.add(new Employee1("Adam", "Smith", 30, 82000));
        employees.add(new Employee1("John", "Doe", 28, 90000));

        employees.sort(
                Comparator.comparing(Employee1::getFirstname)
                        .thenComparing(Employee1::getLastname)
                        .thenComparingInt(Employee1::getAge)
                        .thenComparingDouble(Employee1::getSalary)
        );

        // Print sorted list
        employees.forEach(System.out::println);

        //print employees having sal>1000 in a map(key sal, value is list employee)

        Map<Double, List<Employee1>> collect = employees.stream().filter(e -> e.getSalary() > 1000).collect(Collectors.groupingBy(e -> e.getSalary()));
        System.out.println(collect);

    }
}
