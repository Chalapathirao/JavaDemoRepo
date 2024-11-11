package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//List all departments and their respective employees using Java 8 Streams
public class StreamExample {
    // Reuse the Employee class from the previous example
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Alice", 95000, "IT"),
                new Employee(2,"Bob", 75000, "IT"),
                new Employee(3,"Charlie", 80000, "HR"),
                new Employee(4,"David", 98000, "HR")
        );

        Map<String, List<String>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Employees by department: " + employeesByDept);
    }
}
