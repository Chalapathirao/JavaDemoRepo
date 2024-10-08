package com.chalapathi.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
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

class EmployeeDTO {
    private String name;

    public EmployeeDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{name='" + name + "'}";
    }
}

public class Java8SalaryDeptWise {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", 50000, "IT"),
                new Employee(2,"Jane", 60000, "HR"),
                new Employee(3,"Jack", 70000, "Finance"),
                new Employee(4,"Jill", 55000, "IT"),
                new Employee(5,"James", 62000, "HR")
        );

        // Group by department and sum salaries
        Map<String, Double> salaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        Map<String, Double> salaryByDepartment1 = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingDouble(e ->e.getSalary())));

        // Print the total salary for each department
        salaryByDepartment.forEach((department, totalSalary) ->
                System.out.println("Department: " + department + ", Total Salary: " + totalSalary)
        );
        List<Employee> empList = employees.stream().map(e -> new Employee(e.getId(),e.getName().toUpperCase(), e.getSalary() + 100, e.getDepartment())).collect(Collectors.toList());
        empList.forEach( e -> System.out.println(e.getName()));
        //sum of all employee salaries
        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

        Map<String, String> collect = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getDepartment));
        collect.forEach((k,v) -> System.out.println(k +" "+v));


        Map<String, Employee> highestPaidByDepartment = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment, // Key is the department
                        e -> e, // Value is the employee object
                        (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2 // Resolve conflicts by keeping the highest salary
                ));
        System.out.println(highestPaidByDepartment.size());

        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alice", 50000, "IT"),
                new Employee(2, "Bob", 70000, "HR"),
                new Employee(3, "Charlie", 30000, "IT"),
                new Employee(4, "MaxMeddy", 30000, "HR")
        );

        employeesList.forEach( System.out::println);
        System.out.println();
        employeesList.stream().filter(e -> e.getSalary() == 70000).map(Employee::getName).toList().forEach( System.out::println);

        System.out.println("distinct salaries");
        employeesList.stream().map(Employee::getSalary).distinct().toList().forEach(System.out::println);
        System.out.println();
        Map<Double, List<Employee>> groupedBySalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(groupedBySalary);

        employeesList.stream().map(e -> new EmployeeDTO(e.getName())).toList().forEach(System.out::println);
        System.out.println();
        DoubleSummaryStatistics collect1 = employeesList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(collect1.getSum());

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, emplList) ->
                System.out.println("Department: " + department + ", Employees: " + emplList)
        );

        System.out.println();
        // Group employees by department and sum their salaries
        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)
                ));

        totalSalaryByDepartment.forEach((department, totalSalary) ->
                System.out.println("Department: " + department + ", Total Salary: " + totalSalary)
        );
    }
}

