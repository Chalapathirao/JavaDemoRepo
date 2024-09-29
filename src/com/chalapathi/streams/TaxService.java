package com.chalapathi.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee5 {
    private int id;
    private String name;
    private String dept;
    private long salary;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee5(int id, String name, String dept, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee5() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Employee5 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }
}

class DataBase {
    public static List<Employee5> getEmployees() {
        List<Employee5> list = new ArrayList<>();
        list.add(new Employee5(176, "Roshan", "IT", 600000));
        list.add(new Employee5(388, "Bikash", "CIVIL", 900000));
        list.add(new Employee5(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee5(624, "Sourav", "CORE", 400000));
        list.add(new Employee5(176, "Prakash", "SOCIAL", 1200000));
        return list;
    }
}

public class TaxService {
    public static List<Employee5> evaluateTaxUsers(String input) {
        return (input.equalsIgnoreCase("tax"))
                ? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
                .collect(Collectors.toList());

    }


    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
    }
}
