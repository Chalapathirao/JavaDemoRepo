package com.chalapathi.streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private double salary;
    private String department;
    private int age;

    public Employee1(String name, double salary, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", department='" + department + "', age=" + age + "}";
    }
}


public class Java8Programs {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("John", 50000, "IT", 25),
                new Employee1("Jane", 60000, "HR", 28),
                new Employee1("Jack", 70000, "Finance", 30),
                new Employee1("Jill", 55000, "IT", 32),
                new Employee1("James", 62000, "HR", 35)
        );

        // Group employees by department and find the oldest employee
        Map<String, Optional<Employee1>> oldestEmployeeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee1::getAge))
                ));

        oldestEmployeeByDepartment.forEach((department, employee) ->
                System.out.println("Department: " + department + ", Oldest Employee: " + employee.orElse(null))
        );
    }
}

