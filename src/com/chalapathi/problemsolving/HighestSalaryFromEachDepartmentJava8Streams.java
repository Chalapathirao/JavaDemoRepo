package com.chalapathi.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public  String getName(){
        return name;
    }

    public int getId(){
        return  id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class HighestSalaryFromEachDepartmentJava8Streams {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000,"Sales"),
                new Employee(2, "Alice", 60000,"Marketing"),
                new Employee(3, "Emma", 75000,"Sales"),
                new Employee(4, "David", 65000,"HR"),
                new Employee(5, "Sophia", 60000,"HR"),
                new Employee(6, "Olivia", 90000,"Marketing")
        );

        // Generate a report of the highest-paid employee in each department
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                optionalEmployee -> optionalEmployee.get())))
                .forEach((department, emp) ->
                        System.out.println(emp.getDepartment() + ": " + emp.getName() + " with salary " + emp.getSalary()));

        System.out.println();
        employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .forEach((department, emp) ->
                        System.out.println(emp.getDepartment() + ": " + emp.getName() + " with salary " + emp.getSalary()));
    }
}



