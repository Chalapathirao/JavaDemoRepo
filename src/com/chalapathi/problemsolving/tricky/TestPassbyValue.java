package com.chalapathi.problemsolving.tricky;


public class TestPassbyValue {
    public static void main(String[] args) {
        Employee e =new Employee(1,"cha",345, "dept1");
        System.out.println(e);
        new TestPassbyValue().test(e);
        System.out.println(e);
    }
    void test(Employee e){
        e.setDepartment("dept1");
        e.setSalary(500);
        //e =null;
    }
}

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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
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
