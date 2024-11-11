package com.chalapathi.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
//Find the employee(s) with the longest name in each department

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Alice Johnso", 95000, "IT"),
                new Employee(2,"Bob Smith", 75000, "IT"),
                new Employee(3,"Charlie", 80000, "HR"),
                new Employee(4,"David Tennant", 98000, "HR"),
                new Employee(5,"Edward Norton",  87000, "Marketing")
        );

        Map<String, List<Employee>> longestNamedEmployeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                //Collectors.maxBy((e1, e2) -> Integer.compare(e1.getName().length(), e2.getName().length())),
                                Collectors.maxBy(Comparator.comparingInt(e -> e.getName().length())),
                                (optionalMax) -> optionalMax.map(List::of).orElse(List.of())
                        )
                ));

        System.out.println("Longest named employees by department: " + longestNamedEmployeesByDept);

       //Check if all employees in a particular department earn above a certain salary.
        int thresholdSalary = 70000;
        String department = "IT";

        boolean allEarnMore = employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .allMatch(e -> e.getSalary() > thresholdSalary);

        System.out.println("All employees in department " + department + " earn more than " + thresholdSalary + ": " + allEarnMore);


        //Produce a summary of statistics (count, sum, min, average, max) on employee salaries in a certain department.

         //department = "IT";
        DoubleSummaryStatistics salaryStats = employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Salary statistics in " + department + ": " + salaryStats);

        // Convert a list of employees to a map with the department as a key and list of employee names as values sorted by name.
        Map<String, List<String>> employeesByDeptSorted = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.collectingAndThen(Collectors.toList(), list -> {
                                    list.sort(String::compareTo);
                                    return list;
                                }))));

        System.out.println("Employees by department (sorted): " + employeesByDeptSorted);

    }
    }
