package com.chalapathi.newfeatures.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Test1 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        /*Employee employee = FindEmployeesWithHighestSalary(employees);
        System.out.println(employee);*/

        //countOfEmployeesInEachDepartment(employees);
        findDepartmentWithMaximumEmployees(employees);
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 29, "Male", "HR", 2015, 35000));
        employees.add(new Employee(102, "Alice", 28, "Female", "Finance", 2016, 55000));
        employees.add(new Employee(103, "Bob", 35, "Male", "IT", 2012, 70000));
        employees.add(new Employee(104, "Daisy", 32, "Female", "IT", 2018, 50000));
        employees.add(new Employee(105, "Charlie", 26, "Male", "Sales", 2020, 30000));
        employees.add(new Employee(106, "Sophia", 40, "Female", "Admin", 2010, 40000));
        employees.add(new Employee(107, "David", 45, "Male", "Finance", 2005, 80000));
        employees.add(new Employee(108, "Emma", 31, "Female", "Sales", 2019, 45000));
        employees.add(new Employee(109, "Raj", 27, "Male", "IT", 2021, 38000));
        employees.add(new Employee(110, "Neha", 30, "Female", "HR", 2017, 42000));
        return employees;
    }

    private static Employee FindEmployeesWithHighestSalary(List<Employee> employees) {
       // return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);

        /*double v = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0);
        return employees.stream().filter(e -> e.getSalary() == v).findFirst().orElse(null);*/

        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().orElse(null);

    }
    private static void countOfEmployeesInEachDepartment(List<Employee> employees){
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach( (k,v) -> System.out.println(STR."\{k} \{v}") );
    }

    private static void findDepartmentWithMaximumEmployees(List<Employee> employees){
        String departmentName = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println(departmentName);
    }
}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."Employee{id=\{id}, name='\{name}', age=\{age}, gender='\{gender}', department='\{department}', yearOfJoining=\{yearOfJoining}, salary=\{salary}}";
    }
}
